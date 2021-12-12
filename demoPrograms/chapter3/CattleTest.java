package ap.chapter3;

/**
 * @author lei
 * @date 11/06/2021 6:05 PM
 */
public class CattleTest {
    public static void main(String[] args) {
        Cattle cattle = new Cattle(400,10,false,"cow");
        System.out.println(cattle.produceMilk());
        cattle.addWeight(10);
    }
}
