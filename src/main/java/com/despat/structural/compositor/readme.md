# Compositor Pattern

## Class Diagram

```mermaid
classDiagram
class Employee
<<interface>> Employee
Employee: + void showMe()

class Engineer
Engineer: + String name
Engineer: + void showMe()

class Manager
Manager: + String name
Manager: + List~Employee~ subOrdinates
Manager: + void showMe()

Engineer ..|> Employee
Manager ..|> Employee
Manager *-- Engineer
```

## Run Code

```shell
mvn compile && mvn exec:java -Pcompositor
```
