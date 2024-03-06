package sec12.chap05;

import java.io.Serializable;

public class Person  implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private double heightl;
    private boolean married;
    transient private String bloodType;
    transient private double weight;
    private Career career;
    public Person(String name, int age, double heightl, boolean married, String bloodType, double weight, Career career) {
        this.name = name;
        this.age = age;
        this.heightl = heightl;
        this.married = married;
        this.bloodType = bloodType;
        this.weight = weight;
        this.career = career;
    }
}
