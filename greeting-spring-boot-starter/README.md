# spring-greeting-extension

Einfaches Beispielprojekt für eine kleine Spring Boot *Extension* / *Starter*-ähnliche Struktur.

Features:
- @EnableGreetingService (Importiert die Konfiguration)
- GreetingService als Bean
- LoggingAspect, das Methoden mit @Logged protokolliert (AOP)

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
