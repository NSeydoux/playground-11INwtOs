
mvn -q compile
echo `ls /mooc`
curl localhost:8080
echo "TECHIO> open --port 8080"
sh in/start.sh
mvn -q exec:java -Dconfig=config.json -Dexec.classpathScope=compile