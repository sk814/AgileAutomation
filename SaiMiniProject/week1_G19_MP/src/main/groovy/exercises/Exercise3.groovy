package exercises

import org.bson.Document


import com.mongodb.client.MongoClients

import static com.mongodb.client.model.Filters.*
import static com.mongodb.client.model.Projections.*
import static com.mongodb.client.model.Sorts.*
import static com.mongodb.client.model.Accumulators.*

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

import static com.mongodb.client.model.Aggregates.*
import java.util.concurrent.TimeUnit


/*
 * REQUIREMENTS: Get the total number of flights per year with more than or equal to 100 cancelled flights from an Airport for a year.
 */

//Time before execution of code
long startTime=System.nanoTime()

//Calculate the memory used before your code execution:
long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

// load credentials from src/main/resources/mongodb.properties
def properties = new Properties()

//Accessing the property file with all the credentials
def propertiesFile = new File('src/main/resources/mongodb.properties')
propertiesFile.withInputStream {
	properties.load(it)
}

// Getting JSON file
def jsonFile = new File('src/main/resources/airlines.json')


//Parsing JSON to txt
def jsonSlurper = new JsonSlurper()
def list = jsonSlurper.parseText(jsonFile.text)

// create connection and uploading the contents of file to "Airlines" collection 
def mongoClient = MongoClients.create("mongodb+srv://${properties.USN}:${properties.PWD}@${properties.CLUSTER}.${properties.HOST}.mongodb.net/${properties.DB}?retryWrites=true&w=majority");
def db = mongoClient.getDatabase(properties.DB);
def col = db.getCollection("Airlines")

//Dropping previous stored data in Airline collection if available
col.drop()

//Inserting every thing one by one to cloud
for (obj in list) {
	def doc = Document.parse(JsonOutput.toJson(obj))
	col.insertOne(doc)
}


//Calculating total number of flights per year with more than or equal to 100 cancelled flights from an Airport for a year
def airlineList = col.aggregate([
//	Filter the airport with more than 100 cancled flights
	match(gte('Statistics.Flights.Cancelled',100)),
//	Group by per year and get the total sum of flights
	group('$Time.Year', sum('Sum of Flights', '$Statistics.Flights.Total')),
//	Display Year and sum of flights
	project(fields(include('Year: $_id', 'Sum of Flights'))),
//	Sort it by year 
	sort(orderBy(ascending('Time.Year')))
])

// JSON view of filtered data
println("\nJSON View:")
println(JsonOutput.prettyPrint(JsonOutput.toJson(airlineList)))

//List View
println("\nList View:")
airlineList.each { println(it) }

//Calculate the memory used after your code execution:
long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

//Total Memory used for code execution:
long actualMemUsed=afterUsedMem-beforeUsedMem;

//Time when code ends
long endTime=System.nanoTime()

long timeUsed= Math.abs(endTime - startTime)

//Printing the results
println("\nStart time : "+ TimeUnit.NANOSECONDS.toMillis(startTime)+" MilliSeconds")
println("\nEnd time : "+ TimeUnit.NANOSECONDS.toMillis(endTime)+" MilliSeconds")
println ("\nExecution time : "+ TimeUnit.NANOSECONDS.toMillis(timeUsed)+" MilliSeconds")

println("\nMemory before execution:"+ beforeUsedMem +" bytes");
println("\nMemory after execution:"+ afterUsedMem +" bytes");
println("\nMemory Used:"+ actualMemUsed +" bytes");

