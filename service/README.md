service
=======

REST services and storage to MongoDB.


Testing
=======

Run in Jetty:

	mvn clean install -Dlog4j.configuration=file:`pwd`/log4j.xml  jetty:run



curl -i -H "Accept: application/json" -X GET http://localhost:8080/service/rest/translation


curl -i -H "Content-Type: application/json" \
     -X PUT -d "{\"key\":\"foo.key\",\"locale\":\"fi\",\"value\":\"foo key arvo\",\"comment\":\"oletusarvoja\"}" \
     http://localhost:8080/service/rest/translation
