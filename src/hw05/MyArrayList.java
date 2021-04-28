package hw05;

import java.lang.*;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T>  {

    int  size;
    int capacity;
    Object[] array;

    public MyArrayList() {
        size = 0;
        capacity = 10;
        array = new Object[capacity];
    }

    private Object[] addCapacity() {
        Object[] newArray = new Object[capacity+10];
        for(int i = 0; i < capacity; i++) {
            newArray[i] = array[i];
        }
        capacity += 10;
        return newArray;
    }

    void add(int index, T element) {
        if (size == capacity) { array = addCapacity(); }
        if (index <= size+1 && index >= 0) {
           for (int i = size; i > index; i--) {
               array[i] = array[i-1];
           }
           array[index] = element;
           size++;
        }
        //EXCEPTION
    }

    boolean addAll(int index, Collection<? extends T> c) {
        Object o[] = c.toArray();
        int newSize = size + o.length;
        while (capacity < newSize)
            array = addCapacity();
        if (index <= size+1 && index >= 0) {
            for (int i = newSize-1; i >= index+o.length; i--) {
                array[i] = array[i-o.length];
            }
            for(int i = index, j = 0; j < o.length; i++, j++) {
                array[i] = o[j];
            }
            size = newSize;
        }
        //EXCEPTION
        return false;
    }

    T get(int index) {
//        if (index >= 0 && index < size)
            return (T)array[index];
        //EXCEPTION
    }

    int indexOf(Object o) {
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

//    public ListIterator<T> listIterator() {
//
//    }

//    public ListIterator<T> listIterator(int index) {
//
//    }

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

//    public List<T> subList(int fromIndex, int toIndex) {
//
//    }

    public int size() {
        return size;
        //проверить вывод сразу после инициализации arraylist
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
}
