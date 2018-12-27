#De la imagen que partimos
FROM openjdk:8-jre-alpine

#Directorio de trabajo
WORKDIR /app

#Copiamos el uber-jar en el directorio de trabajo
COPY target/demo-helloworld-0.0.1-SNAPSHOT.jar /app

#Exponemos el puerto 8080
EXPOSE 8080

#Comando que se ejecutará una vez ejecutemos el contendor
CMD ["java","-jar","demo-helloworld-0.0.1-SNAPSHOT.jar"]
