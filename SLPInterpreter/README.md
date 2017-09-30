# Straight Line Program Interpreter
@author fraziermatthew

In summary, here is the directory structure:

**SLPInterpreter**
  - build.xml                                     (Ant build file - NetBeans will generate this for you automatically)
  - src/main/java/slpinterpreter/                 (slpinterpreter -- program source code package)  
  - src/main/java/slpinterpreter/Driver.java      (main Driver to run project)  
  - src/main/java/slpinterpreter/grammar/*.java   (slpinterpreter.grammar -- grammar files)  
  - src/test/java/slpinterpreter/test             (slpinterpreter.test -- junit package to test project) 
  - src/test/resources/*.jar                      (Junit testing libraries)    
  
### Understand the code and its directory structure:
Note the use of three different packages in the code:
1. slpinterpreter - this Java class interprets the grammar.
2. slpinterpreter.grammar - these Java classes implement grammar in the Straight Line Program language.
3. slpinterpreter.test - will contain test cases to be used for testing.
4. maxargs - this Java class will calculate the maximum number of arguments in a print statement.

### Understanding the Test Programs:
I've provided five testing files to you, each one contains a single StraightLineProgram. There are two tests in each file: one for the max args task, the other for the interpreter task. In short, we are using the JUnit method assertEquals to see if the output of the program is correct. If either the maxargs or interpreter task is not yet implemented, the JUnit testing files will generate compiler errors.

### Creating the project:
1. Download and unzip the project files.
2. Open NetBeans.
3. Create a new NetBeans project. (File -> New Project).
4. Choose "Java Project With Existing Resources".
5. Give the project a "Project Name". Set the "Project Folder" to the location of the unzip'ed starter files.
6. Set the "Existing Sources: Source Package Folders" to be the slpinterpreter folder that exists here: src/main/java/slpinterpreter.
7. Set the "Existing Sources: Test Package Folders" to be the slpinterpreter folder that exists here: src/test/java/slpinterpreter.

### Configuring JUnit Testing Framework:
1. Run -> "Set Project Configuration" -> Customize Libraries -> "Compile Tests".
2. Remove any references to JUnit.
3. Add to "Compile Tests" the provided .jar libraries (junit and hamcrest) in the starter code, found under src/test/resources.

### JUnit Testing:
We'll be using JUnit to automatically test our code. We already configured JUnit in this NetBeans project a few steps above. We're now going to add testing files to our project. Even if you've never seen JUnit unit tests before, you should be able to easily see how these tests are constructed and what they are doing. 

### Running the Project: 
1. To run your code in NetBeans, you can use Run -> "Run Project".
1. To run your test cases, select "Run" -> "Test Project". 

The output will include how many tests passed and failed (your program output the wrong answer). Once everything is implemented, you should have 10 tests. 

Of course, in addition to the five test programs that I've already provided, please feel free to create your own test programs to supplement the tests that I have provided.

The project follows the Ch 1 introductory programming exercise in Appel's compiler textbook.
