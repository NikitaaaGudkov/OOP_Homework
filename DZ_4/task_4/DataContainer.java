package DZ_4.task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataContainer<T> {
    private List<T> elements;
    public DataContainer() {
        elements = new ArrayList<T>();
    }

    public List<T> getElements() {
        return elements;
    }

    public void add(T item) {
        elements.add(item);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public void sort(Comparator<T> comp) {
        Collections.sort(elements, comp);
    }

    public void print() {
        for (T item : elements) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }
}
