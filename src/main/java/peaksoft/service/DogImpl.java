package peaksoft.service;

public class DogImpl implements Animal{

    @Override
    public void animalPlus() {
        System.out.println("plus -> dogs good friends for human ");
    }

    @Override
    public void animalMinus() {
        System.out.println("minus -> dogs sometimes attack ");
    }
    private String name;
    private int age;
    private String gender;

    public DogImpl() {
    }

    public DogImpl(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return " name: "+ name+ ", age: " + age+", gender: " + gender ;
    }
}
