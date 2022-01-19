package Shape;

public class Arithmetic {
    public static void main(String[] args) {
        int result = add(2,3);
        System.out.println(add(2,3));
        System.out.println(add(2.5f,3));
        System.out.println(add(2,3.5f));
        System.out.println(add(2.5f,3.5f));
    }
/// Method Overloading - Same name but different signature.....................
    public static int add(int f, int s) {
        return f+s;

    }
    public static float add(float f, int s) {
        return f+s;

    }
    public static float add(float f, float s) {
        return f+s;

    }
    public static float add(int f, float s) {
        return f+s;

    }
}
