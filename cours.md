## Annotations Spring Data


## Entity 
Indique que cette classe est une entité correspondant à une table dans la base de donnée 
## Id 
Désigne le champ utilisé comme clé  primaire

### GenerateValue(Strategy = GenerationType.Auto)

Indique que la valeur de la clé primaire est générée automatique par Jar 

Pour bien comprendre Spring Boot, voici les concepts de base :

### 1. **Spring Boot** :
   - Framework qui simplifie le développement d'applications Spring.
   - Prend en charge la configuration automatique (auto-configuration) pour réduire le code de configuration.

### 2. **Dépendances Maven/Gradle** :
   - Utilise `spring-boot-starter` pour ajouter des modules comme le web, la sécurité, la data, etc.

### 3. **Annotations clés** :
   - **@SpringBootApplication** : Point d'entrée principal.
   - **@RestController** : Pour créer des APIs REST.
   - **@Autowired** : Injection de dépendances.

### 4. **Configuration** :
   - Fichiers `application.properties` ou `application.yml` pour configurer l'application.

### 5. **Spring Boot DevTools** :
   - Outils pour le développement, comme le rechargement à chaud.

### 6. **Spring Boot Actuator** :
   - Fournit des points de terminaison pour surveiller l'application.

Spring Boot permet de démarrer rapidement avec une configuration minimale, tout en étant extensible pour répondre à des besoins plus complexes.