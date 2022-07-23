package src.main.java;

public class Person {

    private String name;
    private int age;
    private double height;
    private double weight;
    private char gender;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    
    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public char getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person[" +  
        "name=" + name +  
        ", age=" + age + 
        ", height=" + height + 
        ", weight=" + weight + 
        ", gender=" + gender + 
        "]";
    }
    
}
