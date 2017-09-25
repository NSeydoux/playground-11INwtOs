echo "TECHIO> open --port 8080"
mvn -q compile
sh /mooc/in/start.sh
curl localhost:8080
sh in/start.sh
mvn -q exec:java -Dconfig=config.json -Dexec.classpathScope=compile