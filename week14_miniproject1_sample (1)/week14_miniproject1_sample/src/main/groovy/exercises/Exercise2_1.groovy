package exercises

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/*
 * 1.  Display all the data of plane crashes. 
 */

def jsonSlurper = new JsonSlurper()
def file = new File('src/main/resources/PlaneCrashes.json')
def planeCrashes = jsonSlurper.parseText(file.text)
	
println(JsonOutput.prettyPrint(JsonOutput.toJson(planeCrashes)))