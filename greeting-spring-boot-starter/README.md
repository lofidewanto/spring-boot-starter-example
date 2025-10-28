# spring-greeting-extension

Einfaches Beispielprojekt für eine kleine Spring Boot *Extension* / *Starter*-ähnliche Struktur.

Features:
- @EnableGreetingService (Importiert die Konfiguration)
- GreetingService als Bean
- LoggingAspect, das Methoden mit @Logged protokolliert (AOP)

Möchte man, dass die Extension automatisch aktiviert wird, ohne @EnableGreetingService,
kann sie leicht erweitert werden:

Datei erstellen:
src/main/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports

Inhalt:
com.example.greeting.GreetingConfiguration

Die Annotation @EnableGreetingService kann dann weggelassen werden – sobald die Library im Classpath ist,
wird GreetingConfiguration automatisch geladen.

Voraussetzungen:
- Java 17+
- Maven

Build & Run:
```bash
mvn -U clean package
mvn spring-boot:run
```

Demo-Ausgabe:
```
[LOG] Calling: GreetingService.greet(..)
Hello, Lofi!
```
