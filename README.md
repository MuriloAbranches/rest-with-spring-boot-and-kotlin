Create MySQL Database with Docker:

```sh
docker run --name kotlin-mysql -e MYSQL_ROOT_PASSWORD=admin123 -e MYSQL_DATABASE=rest_with_spring_boot_and_kotlin -p 3306:3306 -d mysql:latest
```
