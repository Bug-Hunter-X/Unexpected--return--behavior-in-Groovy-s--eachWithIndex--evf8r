# Groovy `eachWithIndex` Return Behavior

This example demonstrates a common pitfall when using the `eachWithIndex` method in Groovy.  The `return` statement within the closure only exits the `eachWithIndex` loop, not the enclosing method. This can lead to unexpected results if you expect the method to continue processing after finding a specific item.

## Bug
The `bug.groovy` file shows the incorrect use of `return`, resulting in the loop terminating prematurely.

## Solution
The `bugSolution.groovy` file corrects this by using a `break` statement instead of `return` to control the loop's flow.  This allows the method to proceed after the loop completes. 