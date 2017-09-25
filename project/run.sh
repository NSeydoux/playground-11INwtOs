mvn compile 2> /dev/null
mvn exec:java -Dconfig=config.json -Dexec.classpathScope=compile