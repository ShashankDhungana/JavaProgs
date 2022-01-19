package abstract_class;

public class Circle implements Circlee {
    private float radius;

    Circle(float radius){
        this.radius = radius;
    }

    @Override
    protected  float area() {
        return 3.14f*radius*radius;
    }
}
