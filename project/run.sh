mvn -q compile
mvn -q exec:java -Dconfig=config.json -Dexec.classpathScope=compile