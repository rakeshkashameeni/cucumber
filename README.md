# How to run test
- JDK 11
- Latest Intellij IDEA
- execute "./gradlew test" command
- After cloning, open cucumber folder in intellij

# CI - CD
- clone repo
- ./gradlew test
- save report

# external lib
- gson from google
- apache commons - file/string
- jackson - xml processing
- faker - random data
- log4j - logging framework

# Filtering tests
- can be done using tags

# remote webdriver 
- Execution in grid or cloud (browserstack)
- driver = new RemoteWebdriver(new url(""))

# Config manager 
- create seperate prop files for each enviornment
  and load accordingly
- use props
- variables management (e.g. variables)
- System.getProperty("")

# Logging 
- log4j

# Hooks can be used for before and after steps

# parallel execution
- in gradle, maxParallelForks = 2
- threadCount/fork - maven surefire plugin
