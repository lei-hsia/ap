package ap.chapter3;

/**
 * @author lei
 * @date 12/11/2021 3:20 PM
 */
public class PassByValueObject3 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Alpha");
        System.out.println(myDog + "," +myDog.getName());
        func(myDog);
        System.out.println(myDog + "," +myDog.getName());
    }

    private static Dog func(Dog someDog) {
        someDog.setName("Bravo");
        someDog = new Dog("Charlie");
        someDog.setName("Delta");
        return someDog;
    }

}
