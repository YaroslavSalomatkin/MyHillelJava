package lesson_08;

public class MyCollection {

    private Object[] myCollection;

    public MyCollection(int size) {
        myCollection = new Object[size];
    }

    public int size() {
        return myCollection.length;
    }

    public boolean isEmpty() {
        return (myCollection.length == 0);
    }

    public boolean contains(Object object) {
        for (int i = 0; i < myCollection.length; i++) {
            if (object.equals(myCollection[i])) {
                return true;
            }
        }
        return false;
    }

    public void add(Object object) {
        Object[] newObjects = new Object[myCollection.length + 1];
        for (int i = 0; i < myCollection.length; i++) {
            newObjects[i] = myCollection[i];
        }
        newObjects[myCollection.length] = object;
        myCollection = newObjects;
    }

    public void remove(Object object) {
        for (int i = 0; i < myCollection.length; i++) {
            if (myCollection[i].equals(object)) {
                myCollection[i] = null;
            }
        }
    }

    public void removeNullElements() {
        int newSize = myCollection.length;
        for (int i = 0; i < myCollection.length - 1; i++) {
            if (myCollection[i] == null) {
                for (; i < myCollection.length - 1; i++) {
                    myCollection[i] = myCollection[i + 1];
                }
                newSize--;
            }
        }
        Object[] array = new Object[newSize];
        for (int i = 0; i < newSize; i++) {
            array[i] = myCollection[i];
        }
        this.myCollection = array;
    }

    public Object indexOf(int index) {
        return myCollection[index];
    }

    public void setValueObject(Object object, int index) {
        myCollection[index] = object;

    }

    public void addAll(MyCollection collection) {
        MyCollection newArray = new MyCollection(this.size() + collection.size());
        for (int i = 0; i < this.size(); i++) {
            newArray.setValueObject(myCollection[i], i);
        }
        for (int i = this.size(); i < newArray.size(); i++) {
            newArray.setValueObject(collection.indexOf(i), i);
        }
    }

    public void clear() {
        this.myCollection = null;
    }

    public void retainAll(MyCollection collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (!this.contains(collection.indexOf(i))) {
                this.remove(this.indexOf(i));
            }
        }
        this.removeNullElements();
    }

    public void removeAll(MyCollection collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (this.contains(collection.indexOf(i))) {
                this.remove(this.indexOf(i));
            }
        }
        this.removeNullElements();
    }

    public boolean containsAll(MyCollection collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (!this.contains(collection.indexOf(i))) {
                return false;
            }
        }
        return true;
    }
}
