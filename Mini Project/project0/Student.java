package project0;

public class Student {

    public Student() {
        this.name = " ";
        this.age = 0;
        this.registerNumber = 0;
    }

    public Student(String name, int age, int registerNumber) {
        this.name = name;
        this.age = age;
        this.registerNumber = registerNumber;
    }

    private String name;

    private int age;
    private int registerNumber;

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

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }
}
