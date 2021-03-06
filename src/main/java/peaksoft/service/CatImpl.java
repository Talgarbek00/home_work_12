package peaksoft.service;

public class CatImpl implements Animal{
    @Override
    public void animalPlus() {
        System.out.println("plus -> cat catch a mouse");
    }
    @Override
    public void animalMinus() {
        System.out.println("minus -> cat sometimes don't catch )");
    }
    private String name;
    private int age;
    private String gender;

    public CatImpl() {
    }

    public CatImpl(String name, int age, String gender) {
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
