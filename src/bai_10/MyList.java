package bai_10;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[] = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    MyList(int capacity) {
        element = new Object[capacity];
    }

    String print() {
        element = Arrays.copyOf(element, size);
        return Arrays.toString(element);
    }

    private void ensureCapacity(int minCapacity) {
        if (size == element.length) {
            int newSize = element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        }
    }

    void add(int index, E e) {
        if (size == 0) {
            ensureCapacity(1);
            element[size++] = e;
        } else if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            ensureCapacity(1);
            for (int i = size; i > index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = e;
            size++;
        }
    }

    boolean add(E e) {
        ensureCapacity(2);
        element[size++] = e;
        return true;
    }

    E remove(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        E temp = (E) element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        size--;
        element = Arrays.copyOf(element, size);
        return temp;
    }

    int size() {
        return size;
    }

    protected E clone() {
        Object copyOfElement[] = Arrays.copyOf(element, element.length);
        return (E) Arrays.toString(copyOfElement);
    }

    int indexOf(Object o) {
        int i;
        for (i = 0; i < element.length; i++) {
            if (o == element[i]) {
                break;
            }
        }
        if (i == element.length) {
            i = -1;
        }
        return i;
    }

    boolean contains(Object o) {
        int i;
        boolean bo = true;
        for (i = 0; i < element.length; i++) {
            if (o == element[i]) {
                break;
            }
        }
        if (i == element.length) {
            bo = false;
        }
        return bo;
    }

    void clear() {
        size = 0;
    }

    E get(int index) {
        int i;
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        for (i = 0; i < element.length; i++) {
            if (i == index) {
                break;
            }
        }
        return (E) element[i];
    }

}
