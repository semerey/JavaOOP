package homework1;

public class Main {
    public static void main(String[] args){
        Cat catOne = new Cat("Asya",3.5,5,"Grey","Scottish Fold");
        catOne.catTemper(1);
        catOne.meow();
        System.out.println(catOne);
        System.out.println();
        Cat catTwo = new Cat("Pusha",7,5.5,"White","Scottish Fold");
        catTwo.catTemper(10);
        System.out.println(catTwo);

    }
}
