# My Analyzer
This file will state in detail the analysis on the result of bug checking using Error Prone targeting the bug described in MyBugs.md.
##  Assignment requirements
After implementing your bug checker, test it on a sample program that has at least three (3) different instances
of the bug, which would trigger your static analysis checker to report a failure/warning message. Also include
a similar sample program that does not contain the bug, on which your checker would pass without any failure/warning reports.
You should also provide proper unit tests for your checker code. Using Maven for building and testing your
code is encouraged.
Create a file called MyAnalyzer.md and describe (1) why you chose the framework you chose, (2) conceptually,
how you use the framework to detect the bug you described above.

## Instances of bugs
Positive Cases which will trigger the checker to report the failure: 1. int Abc = 0; 2. String FFF; 3. int XyZ.
Negative Cases which will pass the checker: int aSimpleVariable = 0;
After running the test cases of these four, the result is shown in the figure below:
<br />
<img src="https://github.com/UBC-TestingCourse/group11/blob/zhen/assign4/MyBugChecker/error_message.png">
## Reason to choose Error Prone
EError Prone is a static analysis tool for Java that catches common programming mistakes at compile-time.
It is open source and well-documented and available to the source code. 
It is easy to use and can directly use Maven as the build tool. 
And it is powerful with many default bug checkers.
Most importantly, it uses Java which is much familiar to us than other languages.

## Workflow of Error Prone
1. Determine the bug to check and write the bug pattern for it: a variable which begins with a capital character will be viewed as a bug. Thus corresponding bug checker will check the name of the variable. If it begins with "A-Z", the error will be raised with the error message, the name of the bug checker and the severity during compiling time. If not, nothing will happen.
2. Put the bug pattern in the package "com.google.errorprone.bugpatterns" together with other built-in patterns. Run mvn install.
3. Create test cases with the above instances. Run test to see the result.

