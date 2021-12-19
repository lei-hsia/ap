package ap.chapter4;

/**
 * @author lei
 * @date 12/16/2021 4:46 PM
 */
public class GradStudent extends Student {
    private int gradId;

    public GradStudent() {
        super();
        gradId = 0;
    }

    public GradStudent(String grade, String name, int[] tests) {
        super(tests, name, grade);
    }

    public GradStudent(String name, String grade, int[] tests, int gradId){
        super(tests, name, grade);
        this.gradId = gradId;
    }

    @Override
    public void computeGrade() {
        super.computeGrade();
        if (getTestAverage() >= 90) setGrade("Pass w. Distinction");
    }

    public static void main(String[] args) {
        GradStudent gradStudent = new GradStudent();
        System.out.println(gradStudent.getGrade());
    }


}











