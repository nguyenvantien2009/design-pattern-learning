# Builder Pattern

Build `Rectangle` based on `RectangleBuilder`. When create it in `Main` class, we don't define color but the builder will choose default color is _blue_. 

The `RectangleBuilder` class help define properties need to build `Rectangle` instance. The `get`/ `set` methods, should return `this` (_its is itself_). Its easy to use.

```java
  // ...
  public RectangleBuilder setLength(int length) {
    this.length = length;
    return this;
  }
  // ...
```

## How to run?

```shell
// in root folder (folder of project)
// Run compile and run java code after build based on profile.
mvn compile && mvn exec:java -Pbuilder
```
