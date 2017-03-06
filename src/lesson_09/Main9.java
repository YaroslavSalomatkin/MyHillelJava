package lesson_09;

public class Main9 {
    public static void main(String[] args) {
        MyLinkedListCollection firstElem = new MyLinkedListCollection();
        MyLinkedListCollection secondElem = new MyLinkedListCollection();

        firstElem.add(6);
        firstElem.add(5);
        firstElem.add(3);
        firstElem.add(4);
        firstElem.add(3);
        firstElem.add(2);
        firstElem.add(1);
        secondElem.add(4);
        secondElem.add(5);

        firstElem.printCollection();
        System.out.println("Size = " + firstElem.size());
        System.out.println();

        firstElem.retainAll(secondElem);
        firstElem.printCollection();
        System.out.println("Size = " + firstElem.size());
        //firstElem.printCollection();
        //System.out.println("Size = " + firstElem.size());


        //System.out.println(firstElem.contains(5));
        //System.out.println(firstElem.contains(6));
        //System.out.println(firstElem.contains(10));

        //System.out.println();
     //   System.out.println("remove " + firstElem.remove(3));
   //     firstElem.printCollection();
        //secondElem.printCollection();
      //  System.out.println("Size = " + firstElem.size());

        //firstElem.addAll(secondElem);
        //firstElem.printCollection();
        //System.out.println("Size = " + firstElem.size());

        //firstElem.clear();
        //firstElem.printCollection();
        //System.out.println("Size = " + firstElem.size());


    }
}
