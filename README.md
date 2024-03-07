# Github Wagner - POO 2024.1

### Dicas úteis Java

* Compilando:

```Bash
javac Arquivo.java
```
* Executando:

```Bash
java Arquivo
```

* Criando um arquivo Gradle pelo terminal
```Bash
gradle init --type java-application --dsl groovy --test-framework junit-jupiter --package engtelecom.poo --project-name aula-poo --no-split-project --java-version 21
```
* Executando no terminal ./gradle
```Bash
./gradlew run
```
* Fornecendo argumentos de linha de comando para a aplicação Java
```Bash
./gradlew run −−args "Argumento1 Argumento2 Argumento3"
```
*Fazendo redirecionamento de entrada para a aplicação Java
```Bash
./gradlew run < arquivo.txt
```
* Par deixar mais limpo o terminal e executar as tarefas gradle

alterar arquivo gradle.properties
```Bash
org.gradle.console=plain
org.gradle.logging.level=quiet
```


## [Revisões](./Revisoes )
* [Aula 19/02/24](./Revisoes/Aula20240219/) - Github
* [Aula 21/02/24](./Revisoes/Aula20240221/) - Introdução a Linguagem Java
* [Aula 26/02/24](./Revisoes/Aula20240226/) - Projetos Java com Gradle
* [Aula 28/02/24](./Revisoes/Aula20240228/) - Projetos Java com Gradle 2
* [Aula 28/02/24](./Revisoes/Aula20240306/) - Projetos Orientação a Objetos