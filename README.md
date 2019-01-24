# my-bank
A mini project on simple banking system

#MySQL Setup for Mac using homebrew
brew install mysql

We've installed your MySQL database without a root password. To secure it run:
    mysql_secure_installation

To connect run:
    mysql -uroot

To have launchd start mysql now and restart at login:
  brew services start mysql

Or, if you don't want/need a background service you can just run:
  mysql.server start


# Tomcat setup

```brew install tomcat```

/usr/local/Cellar/tomcat/7.0.28/bin/catalina run

/usr/local/Cellar/tomcat/7.0.28/bin/catalina stop

# Maven Setup

- Download Maven Archive
    [From the following link](https://maven.apache.org/download.cgi)

- Extract the Maven Archive
    In mac extract it to /usr/local/apache-maven

- Set Maven Environment Variables
    export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.1
    export M2=$M2_HOME/bin
    export MAVEN_OPTS="-Xms256m -Xmx512m"

- Add Maven to PATH
    export PATH=$M2:$PATH

- Verify Maven Installation
    mvn --version

Optionally you can also use bre for the same
    brew install maven

# Create a maven project
    mvn archetype:generate -DgroupId=com.mybank.app -DartifactId=my-bank -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
    mvn package
    java -cp target/my-app-1.0-SNAPSHOT.jar com.mybank.app.App

    mvn exec:java -Dexec.mainClass="com.mybank.app.App"


    mvn install:install-file -Dfile=../mysql-connector-java-8.0.14/mysql-connector-java-8.0.14.jar -DgroupId=mysql -DartifactId=mysql-connector-java -Dversion=8.0.14-bin -Dpackaging=jar
    mvn exec:java -Dexec.mainClass="com.mybank.app.App"
