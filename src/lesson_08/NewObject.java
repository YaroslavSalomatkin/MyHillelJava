package lesson_08;

/**
 * Created by YAROSLAV on 28.02.2017.
 */
public class NewObject {
    private int size;
    private String name;
    private String color;

    public NewObject(int size, String name, String color) {
        this.size = size;
        this.name = name;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return name + " " + size + " " + color;
    }
}
