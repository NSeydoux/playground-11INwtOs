echo "TECHIO> open --port 8080"
cd /mooc/in
sh start.sh &
cd /project
mvn -q compile
curl localhost:8080
mvn -q exec:java -Dconfig=config.json -Dexec.classpathScope=compile