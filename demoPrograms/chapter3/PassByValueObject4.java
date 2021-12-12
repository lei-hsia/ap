package ap.chapter3;

/**
 * @author lei
 * @date 12/11/2021 3:35 PM
 */
public class PassByValueObject4 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Alpha");
        System.out.println(myDog + "," + myDog.getName());
        func(myDog);
        System.out.println(myDog + "," + myDog.getName());
    }

    private static Dog func(Dog someDog) {
        Dog anotherDog = new Dog("Epsilon");
        someDog.setName("Bravo");
        someDog = new Dog("Charlie");
        someDog.setName("Delta");
        return anotherDog;
    }
}
