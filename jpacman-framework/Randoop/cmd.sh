export JUNITPATH=/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/Randoop/hamcrest-core-2.1.jar:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/Randoop/junit-4.13-beta-2.jar
javac -classpath .:$JUNITPATH:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes /Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/Randoop/ErrorTest0.java /Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/Randoop/RegressionTest0.java /Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/Randoop/ErrorTest.java

java -classpath .:$JUNITPATH:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes org.junit.runner.JUnitCore ErrorTest0

java -classpath .:$JUNITPATH:/Users/zhenwang/Desktop/cpen522/group11/jpacman-framework/target/classes org.junit.runner.JUnitCore RegressionTest0
