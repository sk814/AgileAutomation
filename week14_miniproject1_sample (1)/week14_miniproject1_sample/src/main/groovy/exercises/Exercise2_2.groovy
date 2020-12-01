package exercises

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/*
 * 2. Retrieve data, time, location, aboard, fatalities and summary of the crashed plane. 
 */
def jsonSlurper = new JsonSlurper()
def file = new File('src/main/resources/PlaneCrashes.json')
def planeCrashes = jsonSlurper.parseText(file.text)

def projection = {
	[
		Date: it.Date,
		Time: it.Time,
		Location: it.Location,
		Aboard: it.Aboard,
		Fatalities: it.Fatalities,
		Summary: it.Summary
	]
}

def projec=  planeCrashes.collect{projection(it)}
	
println(JsonOutput.prettyPrint(JsonOutput.toJson(projec)))
