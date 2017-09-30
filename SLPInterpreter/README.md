#Straight Line Program Interpreter

The project follows the Ch 1 introductory programming exercise in Appel's compiler textbook.

Creating the project:
1. Download and unzip the project starter files.
2. Open NetBeans
3. Create a new NetBeans project. (File -> New Project)
4. Choose "Java Project With Existing Resources".
5. Give the project a "Project Name". Set the "Project Folder" to the location of the unzip'ed starter files.
6. Set the "Existing Sources: Source Package Folders" to be the slpinterpreter folder that exists here: src/main/java/slpinterpreter
7. Set the "Existing Sources: Test Package Folders" to be the slpinterpreter folder that exists here: src/test/java/slpinterpreter
(Warning: in my NetBeans, I receive a "Resolve Project Problems Warning" at this point.)

Configuring JUnit Testing Framework:
1. Run -> "Set Project Configuration" -> Customize Libraries -> "Compile Tests"
2. Remove any references to JUnit.
3. Add to "Compile Tests" the provided .jar libraries (junit and hamcrest) in the starter code, found under src/test/resources

Understand the starter code and its directory structure. Note the use of three different packages in the code:
1. slpinterpreter - any code that you write, you'll likely want to place here within this package.
2. slpinterpreter.grammar - these Java classes implement Appel Grammar 1.3, and directly follow the Straight Line Program language from class. I've already written them for you.
3. slpinterpreter.test - will contain test cases to be used for testing (and grading) your project. This is initially empty. We'll add files to this package below.

Running the project:
1. To run your code in NetBeans, you can use Run -> "Run Project".

JUnit Testing
We'll be using JUnit to automatically test our code. We already configured JUnit in this NetBeans project a few steps above. We're now going to add testing files to our project. Even if you've never seen JUnit unit tests before, you should be able to easily see how these tests are constructed and what they are doing. Important! You will have a different set of testing files to download depending on whether you are implementing your project following an OO approach or a functional approach. (oo testing files | functional testing files). Download and unzip these five testing files into the project directory location of src/test/java/slpinterpreter/test/.
Understanding the tests. 
I've provided five testing files to you, each one contains a single StraightLineProgram. There are two tests in each file: one for the max args task, the other for the interpreter task. In short, we are using the JUnit method assertEquals to see if the output of the program is correct. If either the maxargs or interpreter task is not yet implemented, the JUnit testing files will generate compiler errors. You can block comment out any tasks that you want to skip for now.
Running the tests. 
Select "Run" -> "Test Project". The output will include how many tests passed and failed (your program output the wrong answer). Once everything is implemented, you should have 10 tests. Of course, in addition to the five test programs that I've already provided, I'll be testing your code on other heldout tests (by inserting additional test files into the slpinterpreter.test package). And, of course, you should be creating your own test programs to supplement the tests that I have provided.
