# Learn Design Pattern in java
Learn Design Pattern Code in Java.

- Creational Patterns
  - Singleton
  - Factory Method
  - Abstract Factory
  - [Builder](src/main/java/com/despat/creational/builder/readme.md)
  - [Prototype](src/main/java/com/despat/creational/prototype/readme.md)
- Structural Patters
  - [Adapter](src/main/java/com/despat/structural/adapter/readme.md)
  - [Bridge](src/main/java/com/despat/structural/bridge/readme.md)
  - [Compositor](src/main/java/com/despat/structural/compositor/readme.md)
  - [Decorator](src/main/java/com/despat/structural/decorator/readme.md)
  - [Facade](src/main/java/com/despat/structural/facade/readme.md)
- Behavoral Patters

## Factory Method

Command run code:

```shell
mvn compile # Need re-compile code after update code.
mvn exec:java -Pfactory-method  # factory-method profile was defined in pom.xml.

# Also combine 2 command lines to 1 line 
mvn compile && mvn exec:java -Pfactory-method
```
## Abstract Factory

Command run code:

```shell
mvn compile && mvn exec:java -Pabstract-factory
```
## Builder

Command run code:

```shell
mvn compile && mvn exec:java -Pbuilder
```

## Prototype

Command run code:

```shell
mvn compile && mvn exec:java -Pprototype
```

## Adapter

Command run code:

```shell
mvn compile && mvn exec:java -Padapter
```

## Bridge

Command run code:

```shell
mvn compile && mvn exec:java -Pbridge
```

## Compositor

Command run code:

```shell
mvn compile && mvn exec:java -Pcompositor
```

## Decorator

Command run code:

```shell
mvn compile && mvn exec:java -Pdecorator
```

## Facade

Command run code:

```shell
mvn compile && mvn exec:java -Pfacade
```
