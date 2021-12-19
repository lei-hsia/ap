package ap.chapter4;

/**
 * @author lei
 * @date 12/16/2021 4:34 PM
 */
public class Student {
    public final static int NUM_TESTS = 3;
    private int[] tests;
    private String name;
    private String grade;

    public Student() {
        tests = new int[NUM_TESTS];
        name = "";
        grade = "90";
    }

    public Student(int[] tests, String name, String grade) {
        this.tests = tests;
        this.name = name;
        this.grade = grade;
    }

    public void computeGrade(){
        if ("".equals(name)) grade = "No grade";
        else if (getTestAverage() >= 65) grade = "Pass";
        else grade = "Fail";
    }

    public double getTestAverage() {
        double total = 0;
        for (int score : tests) total += score;
        return total/NUM_TESTS;
    }

    // getters and setters omitted here...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int[] getTests() {
        return tests;
    }

    public void setTests(int[] tests) {
        this.tests = tests;
    }
}
