Spring Web Web
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

Spring Data JPA SQL
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

H2 Database SQL
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.

Spring Boot DevTools Developer Tools
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

Thymeleaf Template Engines
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.



1. Avec quelle partie du code avons-nous paramétré l'url d'appel /greeting ?
	@GetMapping("/greeting")
	
2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?
	return "greetings";
	
3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?
	model.addAttribute("nomTemplate", nameGET);	
	
Etape 17
Relancez-votre application, retournez sur la console de H2 : http://localhost:8080/h2-console. Avez-
vous remarqué une différence ?
	Oui, l'apparition de la table Address.
	
Etape 18 : 
hibernate réalise un mapping Object relationnel (ORM) ce qui va faire correspondre les @entity ecrit en java avec des tables en BDD.

Etape 20 
	oui mais il faut ajouter spring.jpa.defer-datasource-initialization=true dans l'apparition-properties. sinon les données sont incerer avant la création de la bdd
	
Etape 22
@Autowired, cela permet l'injection automatique de dépendance d'un constructeur, fonction ou attribut.
 il chercher le bean du contexte d’application dont le type est applicable à chaque paramètre du constructeur, aux paramètres de la méthode ou à l’attribut
Etape 28

Etape 29 et 30

on ajoute la dependance dans le pom 

<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>bootstrap</artifactId>
    <version>3.3.6</version>
</dependency>
 
 et dans les page ou l'on souhaite utilisr bootstrap, ici la nav bar: 
 <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
		
TP4


Mettez la réponse à chacune de ces questions dans le README de votre projet :
	 Faut-il une clé API pour appeler MeteoConcept ?
		Oui car l'api est un service dans le cas de MeteoConcept celle ci est gratuite tant que l'on execute moins de 500 request par jour
	 Quelle URL appeler ?
		https://api.meteo-concept.com/api/forecast/daily?latlng=48.106795%2C0.029033&start=1&end=1&token=fbe76940e32b4d8600cb7bfc3b9c06be1ad9ceea4abd31cd22599190b9be15e6
	 Quelle méthode HTTP utiliser ?
		la methode GET
	 Comment passer les paramètres d'appels ?
		
	
	 Où est l'information dont j'ai besoin dans la réponse :
		dans le body de la page 
	 Pour afficher la température du lieu visé par les coordonnées GPS
		Comme ce n'étais pas présicer d'utiliser la météo actuel ou la météo journalière du lieux pointé par les coordooner, j'ai pris la météo journalière
		En xml
		reponse/forecast/item/tmin
		reponse/forecast/item/tmax
		
		ou
		reponse/forecast/item/temp2m
		
	 Pour afficher la prévision de météo du lieu visé par les coordonnées GPS
		reponse/forecast/item/probafrost
		reponse/forecast/item/probarain
		reponse/forecast/item/weather
		