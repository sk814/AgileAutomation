package exercises

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import java.util.concurrent.TimeUnit



/*
 * REQUIREMENTS: Get the total number of flights per year with more than or equal to 100 cancelled flights from an Airport.
 */

//Time before execution of code
long startTime=System.nanoTime()

//Calculate the memory used before your code execution:
long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();


// from JSON file to Groovy map
def jsonSlurper = new JsonSlurper()

//Importing the JSON file airlines.json
def file = new File('src/main/resources/airlines.json')

//Parsing JSON to txt
def plainList = jsonSlurper.parseText(file.text)

//Get the flight with at least 100 cancelled flight
def filteredFlight = plainList.findAll{it.Statistics.Flights.Cancelled > 99}



//Total number of flights per year
def groupedByYearFlight =plainList.groupBy {it.Time.Year}.collectEntries {[(it.key): it.value.sum {it.Statistics.Flights.Total}]}

//Sorting the list
groupedByYearFlight= groupedByYearFlight.sort()

// JSON view of filtered data
println("\nJSON view:")
println(JsonOutput.prettyPrint(JsonOutput.toJson(groupedByYearFlight)))

//List View
println("\nList View:"+groupedByYearFlight)

//Calculate the memory used after your code execution:
long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

//Total Memory used for code execution:
long actualMemUsed=Math.abs(afterUsedMem - beforeUsedMem);

//Time when code ends
long endTime=System.nanoTime()


//Printing the results
println("\nStart time : "+ TimeUnit.NANOSECONDS.toMillis(startTime)+" MilliSeconds")
println("\nEnd time : "+ TimeUnit.NANOSECONDS.toMillis(endTime)+" MilliSeconds")
println ("\nExecution time : "+ TimeUnit.NANOSECONDS.toMillis(Math.abs(endTime - startTime))+" MilliSeconds")
println("\nMemory before execution:"+ beforeUsedMem +" bytes");
println("\nMemory after execution:"+ afterUsedMem +" bytes");
println("\nMemory Used:"+ actualMemUsed +" bytes");

