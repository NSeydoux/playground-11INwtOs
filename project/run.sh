echo "TECHIO> open --port 8080 /project/viewer.html"
cd /mooc/in
sh start.sh &
cd /project/target
mvn -q compile
curl localhost:8080
mvn -q exec:java -Dconfig=config.json -Dexec.classpathScope=compile