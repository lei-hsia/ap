package ap.chapter3;

/**
 * @author lei
 * @date 11/07/2021 11:05 AM
 */
public class PassByValueObject5 {

    public static void main(String[] args) {
        Dog myDog = new Dog("Alpha");
        System.out.println(myDog + "," + myDog.getName());
        myDog = func(myDog);
        System.out.println(myDog + "," + myDog.getName());
    }

    private static Dog func(Dog someDog){ // 5
        Dog anotherDog = new Dog("Epsilon");
        someDog.setName("Bravo");
        someDog = new Dog("Charlie");
        someDog.setName("Delta");
        return anotherDog;
    }
}
