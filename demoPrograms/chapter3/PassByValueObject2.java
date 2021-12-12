package ap.chapter3;

/**
 * @author lei
 * @date 12/11/2021 3:05 PM
 */
public class PassByValueObject2 { // 2
    public static void main(String[] args) {
        Dog myDog = new Dog("Alpha");
        System.out.println(myDog);
        System.out.println(myDog.getName());
        func(myDog);
        System.out.println(myDog);
        System.out.println(myDog.getName());
    }

    private static void func(Dog someDog) {
        someDog.setName("Bravo");
        System.out.println(someDog);
        System.out.println(someDog.getName());
        someDog = new Dog("Charlie");
        someDog.setName("Delta");
        System.out.println(someDog);
        System.out.println(someDog.getName());
    }
}
