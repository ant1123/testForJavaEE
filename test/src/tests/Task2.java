package tests;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        String[] array = {"apple", "plum", "banana"};
        Set<String> set = new HashSet<String>();
        set.add("tomato");
        addAll(set, array);
        System.out.println(set);
        Integer[] array2 = {4,5,6};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        addAll(list, array2);
        System.out.println(list);
    }

    public static <T> Collection<T> addAll(Collection<T> col, T arr[]) {
        if (col == null || arr == null) return col;
        col.addAll(Arrays.asList(arr));
        return col;
    }
}
