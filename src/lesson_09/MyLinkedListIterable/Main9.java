package lesson_09.MyLinkedListIterable;

public class Main9 {
    public static void main(String[] args) {
        MyLinkedListIterable firstElem = new MyLinkedListIterable();
        MyLinkedListIterable secondElem = new MyLinkedListIterable();

        firstElem.add(6);
        firstElem.add(5);
        firstElem.add(3);
        firstElem.add(4);
        firstElem.add(3);
        firstElem.add(2);
        firstElem.add(1);
        secondElem.add(6);
        secondElem.add(1);
        secondElem.add(8);

        firstElem.print();
        System.out.println("Size = " + firstElem.size());
        System.out.println();

        secondElem.print();
        System.out.println("Size = " + secondElem.size());
        System.out.println();

        firstElem.removeAll(secondElem);

        firstElem.print();
        System.out.println("Size = " + firstElem.size());
        System.out.println("Tail = " + firstElem.getTail());
    }
}
