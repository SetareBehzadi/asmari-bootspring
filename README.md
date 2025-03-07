to run this project please run you should have java 21.0.6
``` java --version ```
download jdk:
https://adoptium.net/temurin/releases/?os=linux&arch=x64&package=jdk&version=21
you can choose based on your system , then add to terminal bellow command:
```
tar -xvzf openjdk-21_linux-x64_bin.tar.gz
sudo mv jdk-21/opt/
```
now config JDK into local variable by bellow command:
```
echo 'export JAVA_HOME=/opt/jdk-21' >> ~/.bashrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
source ~/.bashrc

```
running project:
firstly you need install dependencies by bellow command:
```
mvn clean install
```
after that run by:
```
mvn spring-boot:run
```

Finish :) you can see hello world in bellow address
```
http://localhost:8080/api/hello
```
