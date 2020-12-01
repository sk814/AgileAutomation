package exercises

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/*
 * 4. Find and display the total number of deaths by each operator and sort by their name.
 */

def jsonSlurper = new JsonSlurper()
def file = new File('src/main/resources/PlaneCrashes.json')
def planeCrashes = jsonSlurper.parseText(file.text)

def projection = {
	[
		Registration: it.Registration,
		Operator: it.Operator,
		Aboard: it.Aboard,
		Fatalities: it.Fatalities
	]
}

def nonNUllData= planeCrashes
				.findAll{ it.Operator != null}
				.findAll{it.Operator != ""}
				.findAll{it.Fatalities != null}
				.findAll{it.Fatalities != ""}

def grouped=nonNUllData.groupBy {it.Operator}.collectEntries {[(it.key): it.value.sum {it.Fatalities}]}

println(JsonOutput.prettyPrint(JsonOutput.toJson(grouped.sort{it.key})))
