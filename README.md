# javaday-quarkus

https://code.quarkus.io/

```
mvn compile quarkus:dev
```

```
mvn quarkus:add-extension -Dextensions="openapi"
```
```
mvn package
docker build -f src/main/docker/Dockerfile.jvm -t javaday-quarkus .
docker run --rm -d -p 8082:8082 --name quarkus javaday-quarkus
docker stop quarkus
```
```
mvn package -Pnative -Dnative-image.docker-build=true
docker build -f src/main/docker/Dockerfile.native -t javaday-quarkus-native .
docker run --rm -d -p 8083:8082 --name quarkus-native javaday-quarkus-native
docker stop quarkus-native
```
