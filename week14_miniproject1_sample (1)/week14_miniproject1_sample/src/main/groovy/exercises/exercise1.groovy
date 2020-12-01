package exercises

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

// from JSON file to Groovy map
def jsonSlurper = new JsonSlurper()
def file = new File('src/main/resources/prize.json')
//def file = new File('src/main/resources/userdetails.json')
def movieList = jsonSlurper.parseText(file.text)

/**
 * Example of query that requires using Groovy in more depth.
 *
 * Select actors that star more than 1 movie with at least a 9 imdb rating
 */
/*
 * 
1.data selection (typical SELECT * FROM ... in SQL),
2.data projection (typical SELECT COL1, COL2, COL3 FROM ... in SQL),
3.data filtering (typical condition in SELECT * FROM ... WHERE condition),
4.data combination (like sums) and/or data grouping (like GROUP BY in SQL).

QUERY:

Suppose we have table like below:



SELECT year,category, count(category)
  FROM prize 
where year>=2010 
group by year,category
 */
