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
brew install tomcat
/usr/local/Cellar/tomcat/7.0.28/bin/catalina run
/usr/local/Cellar/tomcat/7.0.28/bin/catalina stop
