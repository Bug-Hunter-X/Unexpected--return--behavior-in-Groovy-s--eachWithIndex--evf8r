```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    if (item == "target") {
      println "Found at index: $index"
      return //This will exit the eachWithIndex loop prematurely
    }
  }
}

myMethod(["a", "b", "target", "c"]) //This will print "Found at index: 2"
```
```groovy
def myMethod(List<String> list) {
  boolean found = false
  list.eachWithIndex { item, index ->
    if (item == "target") {
      println "Found at index: $index"
      found = true
      return //This will exit the eachWithIndex loop prematurely
    }
  }
  if (!found) {
    println "Not Found"
  }
}

myMethod(["a", "b", "target", "c"])
myMethod(["a", "b", "c"])
```