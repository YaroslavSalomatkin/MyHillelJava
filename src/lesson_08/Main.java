package lesson_08;

public class Main {
    public static void main(String[] args) {
        NewObject newObject = new NewObject(45, "Jon", "Yellow");
        NewObject newObject1 = new NewObject(33, "Bill", "Green");
        NewObject newObject2 = new NewObject(20, "Sonya", "Red");

        MyCollection myCollection = new MyCollection();
        myCollection.add(newObject2);

        MyCollection myCollection1 = new MyCollection();
        myCollection1.add(newObject2);
        myCollection1.add(newObject2);
        myCollection1.add(newObject2);


        System.out.println("\nCollection:");
        myCollection.printCollection();

        System.out.println("\nCollection1:");
        myCollection1.printCollection();

        System.out.println("\n" + myCollection.containsAll(myCollection1));

        System.out.println("\nCollection New:");
        myCollection.printCollection();

    }
}
