package hw05;

//import com.sun.org.apache.xpath.internal.operations.String;
import java.lang.*;

public class MyArrayList<T>  {

    int  size;
    T[] array;

    public MyArrayList() {
        size = 0;
        array = (T[])new Object[10];
    }

    public void add(int index, T element) {
        if (index <= size + 1 && index >= 0) {
           array[index] = element;
           size++;
        }
        System.out.println("INDEX IS " + index);
        System.out.println("ELEMENT IS " + element);
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String result  = "[";

        for (int i = 0; i < size; i++){
            result += array[i].toString() + ", ";
        }
        result += "]";
        return result;
    }
}
