package BinaryTree;

public class BinaryTree {
    private NewElement root;

    public BinaryTree(Object rootElement) {
        this.root.setData(rootElement);
    }

    public BinaryTree() {
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        this.root = null;
    }

    public void add(int data) {
        NewElement newElement = new NewElement(data);
        if (isEmpty()) {
            this.root = newElement;
        } else {
            if (data > root.getData()) {
                add(newElement, root.getRight());
            } else if (data < root.getData()) {
                add(newElement, root.getLeft());
            } else {
                root = newElement;
            }
        }
    }

    private void add(NewElement newElement, NewElement current) {
        if (newElement.getData() > current.getData()) {
            if (current.getRight() != null) {
                add(newElement, current.getRight());
            } else {
                current.setRight(newElement);
                newElement.setParent(current);
            }
        } else if (newElement.getData() < current.getData()) {
            if (current.getLeft() != null) {
                add(newElement, current.getLeft());
            } else {
                newElement.setParent(current);
                current.setLeft(newElement);
            }
        }
    }

    public void remove(int data) {
        NewElement newElement = new NewElement(data);
        if (data > root.getData()) {
            search(newElement, root.getRight());
        } else if (data < root.getData()) {
            search(newElement, root.getLeft());
        } else {
            root = null;
        }
    }

    private void search(NewElement newElement, NewElement current) {
        if (newElement.getData() == current.getData()) {
            removeElement(newElement);
            return;
        } else if (newElement.getData() > current.getData()) {
            search(newElement, current.getRight());
        } else {
            search(newElement, current.getLeft());
        }
    }

    private void removeElement(NewElement current) {
        if (current.getLeft() == null && current.getRight() == null) {
            if (current.getParent().getRight().getData() == current.getData()) {
                current.getParent().setRight(null);
            } else {
                current.getParent().setLeft(null);
            }
        } else if (current.getLeft() != null && current.getRight() == null) {
            if (current.getData() < current.getParent().getData()) {
                current.getParent().setLeft(current.getLeft());
            } else {
                current.getParent().setRight(current.getLeft());
            }
            current.getLeft().setParent(current.getParent());
        } else if (current.getLeft() == null && current.getRight() != null) {
            if (current.getData() < current.getParent().getData()) {
                current.getParent().setLeft(current.getRight());
            } else {
                current.getParent().setRight(current.getRight());
            }
            current.getLeft().setParent(current.getParent());
        } else {
            current.getLeft().setParent(current.getParent());
            current.getLeft().setRight(current.getRight());
        }
        current.setData(null);
        current.setParent(null);
    }
}



