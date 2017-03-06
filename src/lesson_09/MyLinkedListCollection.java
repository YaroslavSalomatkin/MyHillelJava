package lesson_09;

import java.util.Iterator;

public class MyLinkedListCollection implements Iterable {
    private NewElement head;
    private NewElement tail;
    int size = 0;

    public NewElement getHead() {
        return head;
    }

    public NewElement getTail() {
        return tail;
    }

    public int size() {
        if (head == null) {
            return -1;
        }
        NewElement iterator = head;
        int size = 0;
        while (iterator.hasNext()) {
            size++;
            iterator = iterator.getNext();
        }
        this.size = size + 1;
        return this.size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean add(Object element) {
        if (head == null) {
            NewElement element1 = new NewElement(element);
            head = tail = element1;
        } else {
            NewElement element1 = new NewElement(element, null, tail);
            tail.setNext(element1);
            tail = element1;
        }
        size++;
        return true;
    }

    public boolean remove(Object element) {
        NewElement iterator = head;
        boolean flag = false;

        if (head.getObject() == element) {
            iterator.getNext().setPrev(null);
            head = iterator.getNext();
            size--;
            return true;
        }

        while (iterator.getNext() != null) {
            if (iterator.getObject().equals(element)) {
                iterator.getNext().setPrev(iterator.getPrev());
                iterator.getPrev().setNext(iterator.getNext());
                size--;
                flag = true;
            }
            iterator = iterator.getNext();
        }
        return flag;
    }

    public boolean contains(Object element) {
        NewElement iterator = head;
        while (iterator != null) {
            if (iterator.getObject().equals(element)) {
                return true;
            }
            iterator = iterator.getNext();
        }
        return false;
    }

    public boolean addAll(MyLinkedListCollection collection) {
        if (collection.getHead() == null) {
            return false;
        }
        tail.setNext(collection.getHead());
        collection.getHead().setPrev(tail);
        return true;
    }

    public void clear() {
        head = null;
    }

    public boolean retainAll(MyLinkedListCollection collection) {
        if (collection.getHead() == null || this.getHead() == null) {
            return false;
        }
        NewElement iterator = this.getHead();
        while (iterator != null) {
            if (!collection.contains(iterator.getObject())) {
                this.remove(iterator.getObject());
            }
            iterator = iterator.getNext();
        }
        return true;
    }

    public boolean removeAll(MyLinkedListCollection collection) {
        if (collection.getHead() == null || this.getHead() == null) {
            return false;
        }
        NewElement iterator = collection.getHead();
        while (iterator != null) {
            if (this.contains(iterator.getObject())) {
                this.remove(iterator.getObject());
            }
            iterator = iterator.getNext();
        }
        return true;
    }

    public boolean containsAll(MyLinkedListCollection collection) {


        return false;
    }

    public void printCollection() {
        if (head != null) {
            NewElement iterator = head;
            while (iterator.hasNext()) {
                System.out.println(iterator.toString());
                iterator = iterator.getNext();
            }
            System.out.println(iterator.toString());
        } else {
            System.out.println("Collection is Empty!");
        }
    }

    public Iterator iterator() {
        return null;
    }
}
