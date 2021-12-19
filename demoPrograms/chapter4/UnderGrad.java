package ap.chapter4;

/**
 * @author lei
 * @date 12/16/2021 4:46 PM
 */
public class UnderGrad extends Student {

    public UnderGrad() { super(); }

    public UnderGrad(String name, int[] tests, String grade) {
        //super(tests, name, grade);
    }

    public void computeGrade() {
        if (getTestAverage() >= 90) this.setGrade("UG: Pass");
        else setGrade("Fail");
    }
}
