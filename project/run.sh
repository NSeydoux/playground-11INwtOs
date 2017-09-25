cd /mooc/in
sh start.sh &
cd /project/target
mvn -q compile
echo "TECHIO> open --port 8080 /project/viewer.html"
mvn -q exec:java -Dconfig=config.json -Dexec.classpathScope=compile