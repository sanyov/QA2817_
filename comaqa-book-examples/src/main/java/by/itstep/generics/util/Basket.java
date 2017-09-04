package by.itstep.generics.util;

public class Basket<T> {
    private T object; // объявление объекта типа T

    // Передать конструктору ссылку на объект типа T
    public Basket(T object) {
        this.object = object;
    }

    // Вернуть ob
    public T getObject() {
        return object;
    }

    // Показать тип T
    public void showType() {
        System.out.println("Тип T: " + object.getClass().getName());
    }
}
