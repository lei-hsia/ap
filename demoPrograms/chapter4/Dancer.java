package ap.chapter4;

/**
 * @author lei
 * @date 12/17/2021 7:05 PM
 */
public class Dancer { // 4
    public void act(){
        System.out.print(" spin");
        doTrick();
    }
    public void doTrick() {
        System.out.print(" float");
    }
}

class Acrobat extends Dancer {
    @Override
    public void act() {
        super.act();
        System.out.print(" flip");
    }
    public void doTrick(){
        System.out.print(" somersault");
    }
}

class Test {
    public static void main(String[] args) {
        Dancer a = new Acrobat();
        a.act();
    }
}
