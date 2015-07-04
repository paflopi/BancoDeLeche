# Banco de leche humana
Proyecto para la cátedra Habilitacion profesional

### Arquitectura Cliente-Servidor
Mi idea es hacer una aplicación en Java Enterprise Edition 6 basado en un Servidor de aplicaciones JBoss, lo cual no hace falta enumerar el sin fin número de beneficios que trae (dependiendo de a quién le preguntes). 

Cuestión: realizar una aplicación de arquitectura sólida con API REST. Con esta modalidad podemos intercambiar información de manera mas tranqui, ya que todo lo que manejamos seran recursos via peticiones HTTP y JSONs volando por todas partes. 

![Image ofServer-Client](http://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Cliente-Servidor.png/444px-Cliente-Servidor.png)

Aunque el servidor y el cliente van a ser la misma cosa, esto debe ser así para que podamos acceder al REST ya sea desde la maquina del cliente o desde cualquier maquina que tenga conexión de red a dicha máquina.

## Maven al rescate
Para facilitar el ciclo de vida del desarrollo tenemos Apache Maven, la idea es compilar, testear y hacer todas esas cosas superpoderosas que dicen los capos de por ahí

![](http://www.hurricanesoftwares.com/wp-content/uploads/2013/02/maven-documentation-screen.jpg)

## Desarrollo guiado por pruebas (TDD o Test Driven Development)
Hacer pruebas ante todo para poder obtener artefactos sólidos y reutilizables. 
![](http://www.object-refinery.com/classpath/plastic-junit.png)

## Mapeador para dialogar con la base de datos
Como siempre pasa, tener dos paradigmas de pensamiento exige que haya un intermediario para entenerse. Aca aparece Hibernate para solucionar ese problema, uno dice Objetos el otro Tablas, relaciones y cosas raras. 
![](http://cs.calstatela.edu/wiki/images/7/7a/Hibernate.gif)

## Openshift para montar todo el despelote
Como no hay servidores de aplicaciones gratuitos comodecentes, usar Openshift (y saber usar sobre todo) es una ventaja muy grande. Openshift es una plataforma para montar cualquier tipo de aplicación moderna. Pertenece a la empresa RedHat (sombrero rojo) y casualmente es la misma que desarrolla JBoss.
![](https://playlatam.files.wordpress.com/2012/02/openshift-homepage.png)
