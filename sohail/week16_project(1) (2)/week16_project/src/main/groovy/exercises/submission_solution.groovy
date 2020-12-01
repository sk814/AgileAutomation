package exercises 

import submission_helper.SubmissionHelper

/** 
 * SET THESE PATHS CORRECTLY 
 * after copying the metamodel and model files under src/main/resources
 * **/
def metamodelPath = 'src/main/resources/webpage.ecore'
def modelPath = 'src/main/resources/webpage.xmi'


def solution = { type ->
	switch(type) {
		case 'metamodel':
			return metamodelPath
			break
		case 'model' : 
			return modelPath
			break
	} 
	
}


// check the solution with the SubmissionHelper
// DO NOT FORGET TO SUBMIT THE CONFIRMATION NUMERIC CODE on Blackboard
SubmissionHelper.check_solution('sfs16', 'week_6', solution);