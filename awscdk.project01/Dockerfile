# Define a imagem base a ser usada, neste caso, uma imagem OpenJDK versão 17 slim.
FROM openjdk:17-jdk-slim

# Copia o arquivo JAR construído durante a compilação para o sistema de arquivos do contêiner.
COPY target/awscdk.project01-0.0.1-SNAPSHOT.jar project01-0.0.1-SNAPSHOT.jar

# Define o comando que será executado quando o contêiner for iniciado.
ENTRYPOINT ["java", "-jar", "/project01-0.0.1-SNAPSHOT.jar"]