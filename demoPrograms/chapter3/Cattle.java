package ap.chapter3;

import java.util.Scanner;

/**
 * @author lei
 * @date 11/06/2021 4:11 PM
 */
public class Cattle {

    private double weight;
    int age; // implicit: private
    boolean male;
    public String type; // ox, bull, cow, steer, heifer

    static int count; // number of cattle on this farm

    private static final double MILK_PRICE_PER_KILOGRAM = 200; // $

    /* constructors: overloading */

    public Cattle() {
        Cattle.count++;
    }

    public Cattle(double w, int a, boolean m) { // buy a cattle from market
        weight = w;
        age = a;
        male = m;
        Cattle.count++;
    }

    public Cattle(double weight, int age, boolean male, String type) {
        this.weight = weight;
        this.age = age;
        this.male = male;
        this.type = type;
        Cattle.count++;
    }

    private double addWeight(double added) {
        return this.getWeight() + added;
    }

    public double addWeight(int added) {
        this.weight++;
        return this.weight;
    }

    public double addWeight(double added, int age){
        this.weight++;
        this.age++;
        return weight;
    }

    public double produceMilk() {
        if ("cow".equals(this.type)){
            return 0.01 * this.getWeight() * MILK_PRICE_PER_KILOGRAM;
        }
        return 0;
    }

    public static int countCattleNumber() {
        return count;
    }

    public static void main(String[] args) {
        Cattle cattle = new Cattle(600, 7, false);
        double newWeight = cattle.addWeight(10.0);
        System.out.println(countCattleNumber() + "are on the farm");
        System.out.println("Earned: " + cattle.produceMilk() + "for this deal");
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
