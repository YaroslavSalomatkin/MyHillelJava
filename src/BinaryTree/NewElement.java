package BinaryTree;

import java.util.Iterator;

public class NewElement implements Iterator {
    private Object data;
    private NewElement parent;
    private NewElement left;
    private NewElement right;

    public NewElement(int data) {
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public NewElement getParent() {
        return parent;
    }

    public void setParent(NewElement parent) {
        this.parent = parent;
    }

    public int getData() {
        return (Integer) data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NewElement getLeft() {
        return left;
    }

    public void setLeft(NewElement left) {
        this.left = left;
    }

    public NewElement getRight() {
        return right;
    }

    public void setRight(NewElement right) {
        this.right = right;
    }

    @Override
    public boolean hasNext() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return this.data;
        }
        return null;
    }
}
