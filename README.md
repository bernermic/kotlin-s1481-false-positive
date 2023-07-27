# execute

## start a sonarqube instance
```shell
docker run -it -p 9000:9000 sonarqube:lts-community
```
> * open http://localhost:9000/ and login to sonar with admin:admin + change password
> * generate a login token under http://localhost:9000/account/security

## run test scan
> * execute `export SONAR_LOGIN=<login token>` with generated login token
> * execute compile and trigger sonar scan via
### Kotlin version 1.8.22
```shell
# kotlin.version=1.8.2 will not result in any error
./mvnw -Dsonar.login=$SONAR_LOGIN -Dsonar.host.url=http://localhost:9000 -Dkotlin.version=1.8.22 compile sonar:sonar
```

### Kotlin version 1.9.0
```shell
# kotlin.version=1.9.0 shows 'Remove this unused "value" local variable.' error
./mvnw -Dsonar.login=$SONAR_LOGIN -Dsonar.host.url=http://localhost:9000 -Dkotlin.version=1.9.0 compile sonar:sonar
```
