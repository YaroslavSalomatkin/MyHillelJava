package lesson_08;

public class MyCollection {

    private Object[] objects;

    public MyCollection(int size) {
        objects = new Object[size];
    }

    public MyCollection() {
        objects = new Object[0];
    }

    public int size() {
        return objects.length;
    }

    public boolean isEmpty() {
        return (objects.length == 0);
    }

    public boolean contains(Object object) {
        for (int i = 0; i < objects.length; i++) {
            if (object.equals(objects[i])) {
                return true;
            }
        }
        return false;
    }

    public void add(Object object) {
        Object[] newObjects = new Object[objects.length + 1];
        for (int i = 0; i < objects.length; i++) {
            newObjects[i] = objects[i];
        }
        newObjects[objects.length] = object;
        objects = newObjects;
    }

    public void remove(Object object) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object)) {
                objects[i] = null;
                for (; i < objects.length - 1; i++) {
                    objects[i] = objects[i + 1];
                }
                Object[] array = new Object[objects.length - 1];
                for (int j = 0; j < objects.length - 1; j++) {
                    array[j] = objects[j];
                }
                this.objects = array;
            }
        }
    }


    private Object getObject(int index) {
        return objects[index];
    }

    private Object[] getArrayObjects() {
        return this.objects;
    }

    public void addAll(MyCollection collection) {
        MyCollection newArray = new MyCollection();

        for (int i = 0; i < objects.length; i++) {
            newArray.add(objects[i]);
        }
        for (int i = 0; i < collection.size(); i++) {
            newArray.add(collection.getObject(i));
        }
        this.objects = newArray.getArrayObjects();
    }

    public void clear() {
        this.objects = new Object[0];
    }

    public void retainAll(MyCollection collection) {
        for (int i = 0; i < this.size(); i++) {
            if (!collection.contains(this.getObject(i))) {
                this.remove(this.getObject(i));
            }
        }
    }

    public void removeAll(MyCollection collection) {
        for (int i = 0; i < this.size(); i++) {
            if (collection.contains(this.getObject(i))) {
                this.remove(this.getObject(i));
            }
        }
    }

    public boolean containsAll(MyCollection collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (!this.contains(collection.getObject(i))) {
                return false;
            }
        }
        return true;
    }

    public void printCollection() {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }
}
