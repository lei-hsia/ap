package ap.chapter3;

/**
 * @author lei
 * @date 12/11/2021 2:40 PM
 */
public class PassByValueObject1 { // 1
    public static void main(String[] args) {
        Dog myDog = new Dog("Alpha");
        System.out.println(myDog);
        func(myDog);
        System.out.println(myDog);
    }

    private static void func(Dog someDog) {
        someDog.setName("Bravo");
        System.out.println(someDog);
        someDog = new Dog("Charlie");
        someDog.setName("Delta");
        System.out.println(someDog);
    }
}
