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

/*
 * 1.  Display all the data of plane crashes present in the JSON file. 
 */


def properties = new Properties()
def propertiesFile = new File('src/main/resources/mongodb.properties')
propertiesFile.withInputStream {
	properties.load(it)
}

// parse JSON file
def jsonFile = new File('src/main/resources/PlaneCrashes.json')
def jsonSlurper = new JsonSlurper()
def list = jsonSlurper.parseText(jsonFile.text)

// create connection and upload contents
def mongoClient = MongoClients.create("mongodb+srv://${properties.USN}:${properties.PWD}@${properties.CLUSTER}.${properties.HOST}.mongodb.net/${properties.DB}?retryWrites=true&w=majority");
def db = mongoClient.getDatabase(properties.DB);
def col = db.getCollection("PlainCrash")
col.drop()

for (obj in list) {
	def doc = Document.parse(JsonOutput.toJson(obj))
	col.insertOne(doc)
}

def resultList = col.aggregate([
	project(fields(include('Date', 'Time', 'Location', 'Operator', 'Flight #', 'Route' , 'Type' ,'Registration', 'cn/In','Aboard','Fatalities','Ground','Summary'),excludeId())),
])
//println(col.find())
println(JsonOutput.prettyPrint(JsonOutput.toJson(resultList)))
