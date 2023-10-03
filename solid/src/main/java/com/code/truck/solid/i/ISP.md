# Interface segregation principle
The Interface Segregation Principle (ISP) states that clients should not be forced to depend upon interface members they do not use. In other words, do not force any client to implement an interface that is irrelevant to them.

Suppose there’s an interface for vehicle and a Bike class:

```java
public interface Vehicle {
    public void drive();
    public void stop();
    public void refuel();
    public void openDoors();
}
public class Bike implements Vehicle {

    // Can be implemented
    public void drive() {...}
    public void stop() {...}
    public void refuel() {...}
    
    // Can not be implemented
    public void openDoors() {...}
}
```

As you can see, it does not make sense for a Bike class to implement the openDoors() method as a bike does not have any doors! To fix this, ISP proposes that the interfaces be broken down into multiple, small cohesive interfaces so that no class is forced to implement any interface, and therefore methods, that it does not need.