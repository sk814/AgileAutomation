package exercises

def name = "my name"
println name
def date = new java.text.SimpleDateFormat("dd-MM-yyyy").format(new Date())
println date
def fruitBag = ["orange","banana","coconut"]
println fruitBag


// ex 01 (*). print "my name: 06-18-2016" on the output console using a GString

def dateName= '06-18-2016'
println "my name: ${dateName}"

    

// ex 02 (*). use a loop for printing the members of 
// the collection fruitBag

// ex 03 (*). define a function that given a range of integers, 
// determines the average

// ex 04 (**). using a closure check whether fruitBag 
// contains 'banana' 

// ex 05 (**). using a closure check whether all the words
// in fruitBag contain the letter 'n'
