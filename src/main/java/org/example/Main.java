package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public int price;
    public float speed;
    public String brand;

    public Main(int price, float speed, String brand) {
        this.price = price;
        this.speed = speed;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Class<?> clazz = Main.class;


        System.out.println("Поля класу:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Назва поля: " + field.getName() + ", Тип: " + field.getType() + ", Модифікатори: " + field.getModifiers());
        }


        System.out.println("\nМетоди класу:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Назва методу: " + method.getName() + ", Параметри: " + method.getParameterTypes() + ", Модифікатори: " + method.getModifiers());
        }

        
        System.out.println("\nКонструктори класу:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Параметри конструктора: " + constructor.getParameterTypes() + ", Модифікатори: " + constructor.getModifiers());
        }
    }
}

