# Liskov substitution principle

The Liskov Substitution Principle (LSP) applies to inheritance hierarchies such that derived classes must be completely substitutable for their base classes.

Consider a typical example of a Square derived class and Rectangle base class:

```java
public class Rectangle {
    private double height;
    private double width;
    public void setHeight(double h) { height = h; }
    public void setWidht(double w) { width = w; }
    ...
}
public class Square extends Rectangle {
    public void setHeight(double h) {
        super.setHeight(h);
        super.setWidth(h);
    }
    public void setWidth(double w) {
        super.setHeight(w);
        super.setWidth(w);
    }
}
```

The above classes do not obey LSP because you cannot replace the Rectangle base class with its derived class Square. 

The Square class has extra constraints, i.e., the height and width must be the same. Therefore, substituting Rectangle with Square class may result in unexpected behavior.