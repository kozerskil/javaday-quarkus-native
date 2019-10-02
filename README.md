# javaday-quarkus-native

https://code.quarkus.io/

```
mvn clean
mvn package -Pnative -Dnative-image.docker-build=true
docker build -t javaday-quarkus-native .
docker run --rm -d -p 8083:8083 -m 256m --network javaday-net --name quarkus-native javaday-quarkus-native
docker stop quarkus-native
```
