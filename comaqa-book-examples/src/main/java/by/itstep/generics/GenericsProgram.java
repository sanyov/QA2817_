package by.itstep.generics;

import by.itstep.generics.util.Basket;

public class GenericsProgram {
    public static void main(String[] args) {
        // Работаем с обобщённым классом
        // Создаём Gen-ссылку для Integer
        Basket<Integer> objectInteger;

        // Создаём объект Basket<Integer>
        objectInteger = new Basket<Integer>(77);

        // Показать тип данных, используемый objectInteger
        objectInteger.showType();

        // Получить значение objectInteger
        int value = objectInteger.getObject();
        System.out.println("Значение: " + value);

        // Создадим объект Basket для String
        Basket<String> strObject = new Basket<String>("Обобщённый текст");

        // Показать тип данных, используемый strObject
        strObject.showType();

        // Получить значение strObject
        String str = strObject.getObject();
        System.out.println("Значение: " + str);
    }
}
