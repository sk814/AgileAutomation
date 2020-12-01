package exercises 

import submission_helper.SubmissionHelper


def path = 'src/main/resources/top-rated-movies.json'
//def path = 'src/main/resources/top-rated-movies-short.json'

def solution = { filePath ->
	// load credentials from src/main/resources/mongodb.properties
	// this file should contain
	//		USN=yourUsername
	//		PWD=yourPassword
	//		DATABASE=yourDatabaseName
	def properties = new Properties()
	def propertiesFile = new File('src/main/resources/mongodb.properties')
	propertiesFile.withInputStream {
		properties.load(it)
	}
	
	// create connection and upload contents
	
	// reset collection
	
	// get info from file
	
	// add new movie to list
	
	// upload data to MongoDB
	
	// filter those movies with a rating that is greater than or equal to 8
	
	// return result
}



// desk check your solution twice: both attempts should give the same result
println('first attempt:')
println(solution(path).inspect())
println('second attempt:')
println(solution(path).inspect())

// check the solution with the SubmissionHelper
// DO NOT FORGET TO SUBMIT THE CONFIRMATION NUMERIC CODE on Blackboard
SubmissionHelper.check_solution('ab123', 'week_3', solution);