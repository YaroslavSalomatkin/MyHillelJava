package lesson_06;

import java.util.Random;

public class ContainerCollection {
    private int[] container;


    public ContainerCollection(int size) {   //конструктор
        container = new int[size];
    }

    public void setContainer(int[] container) {  // ручное заполнение массива
        this.container = container;
    }

    public int[] getContainerArray() {  //  получить массив из объекта
        return container;
    }

    public void print() {   // распечатать массив
        System.out.println();
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + "\t");
        }
    }

    public void fillRandomElementsFrom0To100() {   //  заполнить массив рандомными числами от 0 до 100
        Random random = new Random();
        for (int i = 0; i < container.length; i++) {
            container[i] = random.nextInt(101);
        }
    }

    public void addElement(int newElement) {  // добавить элемент
        int[] newContainer = new int[container.length + 1];
        for (int i = 0; i < newContainer.length - 1; i++) {
            newContainer[i] = container[i];
        }
        newContainer[container.length] = newElement;
        this.container = newContainer;
    }

    public int getElementByIndex(int index) {   //  получить элемент по индексу
        return container[index];
    }

    public boolean containsElementInContainer(int element) {  //  есть ли элемент в массиве
        for (int i = 0; i < container.length; i++) {
            if (container[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void addAllElementsFromOtherContainer(int[] secondContainer) { // добавить в массив элементы другого массива

        int[] newContainer = new int[container.length + secondContainer.length];
        for (int i = 0; i < container.length; i++) {
            newContainer[i] = container[i];
        }
        for (int i = 0; i < secondContainer.length; i++) {
            newContainer[i + container.length] = secondContainer[i];
        }
        this.container = newContainer;
    }

    public boolean equalsContainers(int[] secondContainer) {
        if (container.length != secondContainer.length) {
            return false;
        }
        for (int i = 0; i < container.length; i++) {
            if (container[i] != secondContainer[i]) {
                return false;
            }
        }
        return true;
    }

    public void clearContainer() {  // очистить (обнулить)
        for (int i = 0; i < container.length; i++) {
            container[i] = 0;
        }
    }

    public int findIndexOfElement(int element) {    //  возвращает индекс элемента
        if (containsElementInContainer(element)) {
            for (int i = 0; i < container.length; i++) {
                if (container[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getSizeOfContainer() {
        return container.length;
    }

    public long getSumOfContainerElements() {  // сумма элементов
        long sumOfElements = 0;
        for (int i = 0; i < container.length; i++) {
            sumOfElements += container[i];
        }
        return sumOfElements;
    }

    public int getMaxElement() {
        int max = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] > max) {
                max = container[i];
            }
        }
        return max;
    }

    public int getMinElement() {
        int min = container[0];
        for (int i = 0; i < container.length; i++) {
            if (container[i] < min) {
                min = container[i];
            }
        }
        return min;
    }

    public double averageOfElements() {
        return getSumOfContainerElements() / (double) container.length;
    }

    public void sortLowToHigh() {
        int temp;
        for (int i = 0; i < container.length; i++) {
            for (int j = i; j < container.length; j++) {
                if (container[i] > container[j]) {
                    temp = container[i];
                    container[i] = container[j];
                    container[j] = temp;
                }
            }
        }
    }

    public void sortHighToLow() {
        int temp;
        for (int i = 0; i < container.length; i++) {
            for (int j = i; j < container.length; j++) {
                if (container[i] < container[j]) {
                    temp = container[i];
                    container[i] = container[j];
                    container[j] = temp;
                }
            }
        }
    }
}
