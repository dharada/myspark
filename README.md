# myspark

This tool creats a json file that you can use for bulk inserts to your local elasitcsearch.

You can start it simply by doubleclicking the jar or `java -jar myspark.jar` from your terminal.
Then your browser will open `http://localhost:4567/readme`.

Then you can follow instruction on the UI or just consume the REST as below.


```
id=$(id -F)
curl http://localhost:4567/create/h/10 > /dev/null

curl -H 'Content-Type: application/x-ndjson' -XPOST 'localhost:9200/_bulk?pretty' --data-binary @/Users/$id/Downloads/data.json
```
