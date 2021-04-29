package hw05;

import java.lang.*;
import java.util.*;

public class MyArrayList<T> implements Iterable<T> {

    private int  size;
    private int capacity;
    private T array[];
//    в оригинальном создается Object для совместимости со старыми версиями,
//    в нашем случае можно этого не делать

    public MyArrayList() {
        size = 0;
        capacity = 10;
        array = (T[])new Object[capacity];
    }

    private Object[] addCapacity() {
        T newArray[] = (T[])new Object[capacity+10];
        for(int i = 0; i < capacity; i++) {
            newArray[i] = array[i];
        }
        capacity += 10;
        return newArray;
    }

    public void add(int index, T element) {
        if (size == capacity) { array = (T[])addCapacity(); }
        if (index <= size+1 && index >= 0) {
           for (int i = size; i > index; i--) {
               array[i] = array[i-1];
           }
           array[index] = element;
           size++;
        }
        //EXCEPTION
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        Object o[] = c.toArray();
        int newSize = size + o.length;
        while (capacity < newSize)
            array = (T[])addCapacity();
        if (index <= size+1 && index >= 0) {
            for (int i = newSize-1; i >= index+o.length; i--) {
                array[i] = array[i-o.length];
            }
            for(int i = index, j = 0; j < o.length; i++, j++) {
                array[i] = (T)o[j];
            }
            size = newSize;
        }
        //EXCEPTION
        return false;
    }

    public T get(int index) {
//        if (index >= 0 && index < size)
            return (T)array[index];
        //EXCEPTION
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i]))
                return i;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = size-1; i >= 0; i--) {
            if (o.equals(array[i]))
                return i;
        }
        return -1;
    }

    public T remove(int index) {
        T removed = (T)array[index];
        if (index > 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i+1];
            }
            size--;
        }
        //EXCEPTON
        return removed;
    }

    public T set(int index, T element) {
        T removed = (T)array[index];
        if (index > 0 && index < size)
            array[index] = element;
        //IndexOutOfBoundsException
        return removed;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String result  = "[";

        for (int i = 0; i < size; i++){
            result += array[i].toString();
            if (i != size-1) {result += ", ";}
        }
        result += "]";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MyArrayList) {
            MyArrayList list = (MyArrayList) obj;
            if (this.size != list.size) {
                return false;
            }
            else {
                for (int i = 0; i < this.size; i++) {
                    if (this.array[i] != list.array[i]) return false;
                }
            }
        }
        return true;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return size != i;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return(get(i++));
                }
                else throw new NoSuchElementException("No elements" + size);
            }
        };
    }
}
