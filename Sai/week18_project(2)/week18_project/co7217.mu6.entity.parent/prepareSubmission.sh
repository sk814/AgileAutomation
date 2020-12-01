#!/usr/bin/env bash

rm -f co7217_checked
if [ -f ./co7217.mu6.entity/submission_helper/solutions.dat ]; then
	
	touch co7217_checked	
	./gradlew wrapper --gradle-version=6.6
	./gradlew clean test
	rm -f submission.zip
	zip -r submission.zip ./ 
	
else
	echo "Could not find ./co7217.mu6.entity/submission_helper/solutions.dat. Please download the project template with this folder and execute the method SubmissionHelper.check_solution()."
fi