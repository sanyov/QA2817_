package by.itstep._06_class_method_properties_parameters;

public class MyClass {
    private String name = "Example";

    // "Конструктор"
    public MyClass(String name) {
        this.name = name;
    }

    // "Метод"
    public String getName() {
        return name;
    }


    private int x;
    private int y;

    /*type methodName (list of parameters) {
        method body
    }*/
    void init(int a, int b) {
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int newY) {
        y = newY;
    }
}
