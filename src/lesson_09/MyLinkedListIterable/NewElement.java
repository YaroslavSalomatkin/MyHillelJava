package lesson_09.MyLinkedListIterable;

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

    public NewElement next() {
        return next;
    }

    protected void setNext(NewElement next) {
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public NewElement prev() {
        return prev;
    }

    protected void setPrev(NewElement prev) {
        this.prev = prev;
    }
}
