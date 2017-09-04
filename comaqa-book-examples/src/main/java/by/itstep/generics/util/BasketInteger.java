package by.itstep.generics.util;

public class BasketInteger {
    private Integer object;

    public BasketInteger(Integer object) {
        this.object = object;
    }

    public Integer getObject() {
        return object;
    }

    public void showType() {
        System.out.println("Тип T: " + object.getClass().getName());
    }
}
