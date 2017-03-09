package lesson_09.MyLinkedListIterable;

import java.util.Iterator;

public class MyLinkedListIterable implements Iterable {
    private NewElement head;
    private NewElement tail;
    private int size = 0;

    public NewElement getHead() {
        return head;
    }

    public NewElement getTail() {
        NewElement tail = new NewElement(head);
        for (Object o : this) {
            if (tail.next() == null) {
                this.tail = tail;
                return tail;
            }
            tail = tail.next();
        }
        return null;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        for (Object object : this) {
            size++;
        }
        this.size = size;
        return this.size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean add(Object element) {
        NewElement addingElement;
        if (isEmpty()) {
            addingElement = new NewElement(element);
            head = tail = addingElement;
        } else {
            addingElement = new NewElement(element, null, tail);
            tail.setNext(addingElement);
            tail = addingElement;
        }
        size++;
        return true;
    }

    public boolean remove(Object element) {
        if (this.isEmpty()) {
            return false;
        }
        NewElement current = head;
        boolean flag = false;

        if (current.getObject().equals(element)) {
            if (current.next() == null) {
                this.clear();
                return true;
            } else {
                current.next().setPrev(null);
                head = current.next();
                current = current.next();
                size--;
                flag = true;
            }
        }

        while (current.next() != null) {
            if (current.getObject().equals(element)) {
                current.next().setPrev(current.prev());
                current.prev().setNext(current.next());
                size--;
                flag = true;
            }
            current = current.next();
        }

        if (tail.getObject().equals(element)) {
            tail.prev().setNext(null);
            tail = tail.prev();
            flag = true;
        }
        this.tail = getTail();
        return flag;
    }

    public boolean contains(Object element) {
        NewElement iterator = head;

        for (Object object : this) {
            if (iterator.getObject().equals(element)) {
                return true;
            }
            iterator = iterator.next();
        }
        return false;
    }

    public boolean addAll(MyLinkedListIterable collection) {
        if (collection.getHead() == null) {
            return false;
        }
        tail.setNext(collection.getHead());
        collection.getHead().setPrev(tail);
        tail = collection.getTail();
        return true;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean retainAll(MyLinkedListIterable collection) {
        if (collection.getHead() == null || this.getHead() == null) {
            return false;
        }

        NewElement iterator = this.getHead();
        for (Object o : this) {
            if (!collection.contains(iterator.getObject())) {
                this.remove(iterator.getObject());
            }
            iterator = iterator.next();
        }
        return true;
    }

    public boolean removeAll(MyLinkedListIterable collection) {
        if (collection.getHead() == null || this.getHead() == null) {
            return false;
        }
        NewElement iterator = collection.getHead();
        for (Object o : collection) {
            if (this.contains(iterator.getObject())) {
                this.remove(iterator.getObject());
            }
            iterator = iterator.next();
        }
        return true;
    }

    public boolean containsAll(MyLinkedListIterable collection) {
        NewElement iterator = collection.getHead();
        for (Object o : collection) {
            if (!this.contains(iterator.getObject())) {
                return false;
            }
            iterator = iterator.next();
        }
        return true;
    }

    public void print() {
        if (head != null) {
            for (Object object : this) {
                System.out.println(object);
            }
        } else {
            System.out.println("Collection is Empty!");
        }
    }

    public Iterator iterator() {
        return new MyIteratorLL(head);
    }

    private static class MyIteratorLL implements Iterator {
        private NewElement currentElement;

        public MyIteratorLL(NewElement currentElement) {
            this.currentElement = currentElement;
        }

        @Override
        public boolean hasNext() {
            return currentElement != null;
        }

        @Override
        public Object next() {
            Object result = currentElement.getObject();
            currentElement = currentElement.next();
            return result;
        }
    }
}
