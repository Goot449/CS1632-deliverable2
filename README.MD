#CitySim9001

###**Deliverable 2 - CS1632 Summer 16**
####**Jake Guttenplan and Nathan Spangler**

---

For “Deliverable 2” we luckily didn’t face many issues when it came to creating the CitySim9001 game. The only things that were up for debate were what all the different classes should be and what each class should be responsible for doing. We ended up going with four different classes, including City, Driver, Road, and Main class. When making these decisions we kept it mind that we would need to write unit tests for each of these classes and the public functions within these classes. So we made sure to avoid having monsterous “do all” methods.
When it came to writing the unit tests, it started to give us some issues. Issues ranging from how do we write unit tests to how do we get the unit tests the run. First we needed to get junit and mockito running on our machines. Which after much hair pulling, was a success...barely.  We then wrote out all the very simple unit tests for the classes testing to make sure they were being initialized correctly. We then moved onto more challenging test cases that including doubles and stubs where we needed to mock classes and methods in order to test a function without relying on another class. This is where we started to see some issues.
It is easy to get confused with the mock classes and mock methods and lose track of what you really should be testing.  We caught ourselves using methods from other classes in order to tests functions which you shouldn’t do. I also think I was using stubs and doubles where they weren’t necessarily needed, but just confused myself.

Failed Tests
randomLocationReturnTest()
This test is “failing” because I execute the function but edit one of the return values with a stubbed method so the expected result does not match the actual result which throws the error. I needed to create a List of Roads in order for the function not to return Null when “possibleRoads.size() = 0”. But then when the function calls “getOutgoingRoads()” I stub it and tell it to return the List of Roads. The program then sets the takenRoad to one of the roads from the list randomly. I then set the name of the mockRoad to “testname”. Which is what I want the returned road to equal.
In order to fix this I need to first change the two items being asserted. The first item is a Road while the other is a String. Then need to just set the Road takenRoad to the value I want. It currently has way too many stubs and doubles, now that I look at it, it may be done with no stubs or doubles. But I am unsure.

---

![tests](http://i.imgur.com/DTsRZzY.jpg)
As you can see all unit tests pass except for the randomLocationReturnTest() which is described above.