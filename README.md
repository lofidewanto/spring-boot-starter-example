# spring-boot-starter-example
Example for Spring Boot Starter Extension

Möchte man, dass die Extension automatisch aktiviert wird, ohne @EnableGreetingService, 
kann sie leicht erweitert werden:

Datei erstellen:
src/main/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports

Inhalt:
com.example.greeting.GreetingConfiguration

Die Annotation @EnableGreetingService kann dann weggelassen werden – sobald die Library im Classpath ist, 
wird GreetingConfiguration automatisch geladen.
