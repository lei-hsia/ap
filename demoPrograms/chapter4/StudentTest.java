package ap.chapter4;

/**
 * @author lei
 * @date 12/17/2021 5:27 PM
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student(new int[] {90,94,99},"student",  "none");
        Student u = new UnderGrad("ug", new int[] {90,94,99}, "");
        Student g = new GradStudent("", "g", new int[] {90,94,99});

        s.computeGrade();
        u.computeGrade();
        g.computeGrade();

        System.out.println(s.getGrade());
        System.out.println(u.getGrade());
        System.out.println(g.getGrade());

        Student s1 = new GradStudent();
        GradStudent g1 = new GradStudent();

    }
}
