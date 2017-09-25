mvn -q compile
echo "TECHIO> open --port 8080"
echo "TECHIO> open --port 9555"
echo "TECHIO> open --port 9556"
mvn -q exec:java -Dconfig=config.json -Dexec.classpathScope=compile