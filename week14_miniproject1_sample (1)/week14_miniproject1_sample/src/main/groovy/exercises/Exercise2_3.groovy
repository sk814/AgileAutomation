package exercises

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/*
 * 3.Fetch the registration number,Operator, aboard and fatalities of the airplane that is
 * operated by “PANAIR DO BRASI” and where aboard and fatalities are equal which leads to fatality. 
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


def filteredData = planeCrashes
	.findAll{ it.Operator == "Panair do Brasil"}
	.findAll {it.Fatalities != null}
	.findAll {it.Fatalities != ""}
	.findAll {it.Aboard != null}
	.findAll {it.Aboard != ""}
	.findAll{it.Fatalities == it.Aboard}
	.collect{projection(it)}
	
println(JsonOutput.prettyPrint(JsonOutput.toJson(filteredData)))
