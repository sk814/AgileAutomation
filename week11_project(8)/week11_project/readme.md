<link rel='stylesheet' href='web/swiss.css'/>

# Groovy exercises

## Setup

Download the project from Blackboard and unzip it. In Eclipse, select `File>Import...` and then `Gradle>Existing Gradle Project`, select the folder that resulted from unzipping the file and click `Finish`. A Groovy project should appear in your workspace.

Groovy files can be found under the source folder `src/main/groovy`. Edit the Groovy file `lab1/exercises.groovy`:

```groovy
def name = "my name"
println name
def date = new Date().format ("dd-MM-yyyy")
println date
def fruitBag = ["orange","banana","coconut"]
println fruitBag


// ex 01 (*). print "my name: 06-18-2016" on the output console using a GString

// ex 02 (*). use a loop for printing the members of 
// the collection fruitBag

// ex 03 (*). define a function that given a range of integers, 
// determines the average

// ex 04 (**). using a closure check whether fruitBag 
// contains 'banana' 

// ex 05 (**). using a closure check whether all the words
// in fruitBag contain the letter 'n'
```

The Groovy script can be run by following these steps:
* Right-click on your file. 
* `Run as...>Java Application`.
* The results of the script should be displayed in a new console.

## Exercises

In the file that you have just created, implement the exercises. These exercises are similar to those used in the lab session on IDEs and Java in order for you to compare similarities and differences between Groovy and Java.

The lecture notes accompanying this lab session (available on the module page) provide pointers to Groovy's documentation.

### Exercise 01 (:star:): Output Stream

Complete the Groovy script above in order to print the string `MY_NAME: DATE` on the output console using a GString, where: `MY_NAME` must be your name and `DATE`  must be today's date. That is initialise variables for the name and for the date, as you did in the previous lab session, and use string interpolation. 

### Exercise 02 (:star:): Control Structures

1. Familiarise yourself with :books: [Groovy's control structures](http://docs.groovy-lang.org/docs/groovy-2.4.15/html/documentation/#_control_structures), similar to Java's.
2. Use a loop for printing the members of the following collection `["orange","banana","coconut"]`.

### Exercise 03 (:star:): Functions

Define a function that given a range of integers, determines the average of the elements in the list.

### Exercise 04 (:star::star:): Closures

Using a closure check whether the variable `fruitBag` contains 'banana'.

### Exercise 05 (:star::star:)

Using a closure check whether all the words in `fruitBag` contain the letter `'n'`. 

### Individual submission

Define a closure that takes a list of words and that counts the words that start with the same letter. The closure must return a map linking letters (the starting letter) to the word count. For example given `["orange","banana","coconut","blueberry"]`, the map that should be returned is `['b': 2, 'c': 1, 'o': 1]`.

Follow the submission instructions as explained on the module page.

