# Parallel-Execution-using-TestNG
Small project showing how TestNG handles parallel execution.

TestNG can be used to do parallel execution. This can be achieved in relation to parallel execution of:
1. Methods
2. Tests
3. Classes
4. Instances

XML suite file for Parallel Method execution:
````
ParallelMethods.xml
````
And this is what is inside it:
````
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

<!--TestNG will run all your test methods in separate threads.-->

<suite name="Suite02" verbose="1" parallel="methods" thread-count="2">
    <test name="Test 1" >
        <classes>
            <class name="TestCase01" />
        </classes>
    </test>
</suite>
````
The parellel="methods" and thread-count="2" mean TestNG will run the methods in separate threads. In total there will be 2 threads running at the same time. Since our test class only has 2 methods, it will produce exactly 2 threads.

How to run using Maven?
Navigate to the directory.
Then use the following Maven command:
````
mvn clean -DsuiteXML="ParallelMethods.xml" test
````
And this is one snippet of the log you can get:
````
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
17:53:56.257 [TestNG-test=Test 1-2] INFO TestCase01 - Suite name Test 1
17:53:56.257 [TestNG-test=Test 1-1] INFO TestCase01 - Suite name Test 1
17:53:56.261 [TestNG-test=Test 1-2] INFO TestCase01 - This is the thread ID 11 of the class TestCase01
17:53:56.261 [TestNG-test=Test 1-1] INFO TestCase01 - This is the thread ID 10 of the class TestCase01
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.012 sec - in TestSuite
````

As you can see there are 2 threads 10 and 11. And the log prints "This is the thread..." twice, once for the first method and the second for the second method.

Likewise, you can try out the other XMLs also to see how they behave under parallel execution. 

Parallel Tests:
````
mvn clean -DsuiteXML="ParallelMethods.xml" test
````

Parallel Classes:
````
mvn clean -DsuiteXML="ParallelMethods.xml" test
````
