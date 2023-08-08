package project0;

public class Student {

    public Student() {
        this.name = " ";
        this.cutoff = 0;
        this.registerNumber = 0;
    }

    public Student(String name, float cutoff, int registerNumber) {
        this.name = name;
        this.cutoff = cutoff;
        this.registerNumber = registerNumber;
    }

    private String name;

    private float cutoff;
    private int registerNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCutoff() {
        return cutoff;
    }

    public void setCutoff(int cutoff) {
        this.cutoff = cutoff;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }
}
