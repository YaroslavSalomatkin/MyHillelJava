package lesson_09;

public class NewElement {
    private Object object;
    private NewElement next;
    private NewElement prev;

    public NewElement(Object object, NewElement next, NewElement prev) {
        this.object = object;
        this.next = next;
        this.prev = prev;
    }

    public NewElement(Object object) {
        this.object = object;
    }

    public boolean hasNext() {
        return this.getNext() != null;
    }

    public NewElement getNext() {
        return next;
    }

    public void setNext(NewElement next) {
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public NewElement getPrev() {
        return prev;
    }

    public void setPrev(NewElement prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "NewElement{" + "object=" + object + '}';
    }
}
