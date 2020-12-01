package exercises 

import org.codehaus.groovy.runtime.StringGroovyMethods

import submission_helper.SubmissionHelper

def example = ["orange","banana","coconut","blueberry"]


def solution = { list -> 
	def map = new HashMap<String,Integer>()
	
	/*
	 * Please write your solution here
	 */
}

// desk check your solution twice: both attempts should give the same result
println('first attempt:')
println(solution(example))
println('second attempt:')
println(solution(example))

// check the solution with the SubmissionHelper
// DO NOT FORGET TO SUBMIT THE CONFIRMATION NUMERIC CODE on Blackboard
SubmissionHelper.check_solution('ab123', 'week_1', solution);