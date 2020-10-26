import java.util.Map;
import java.util.TreeMap;

public class SortArraysWithoutArraySortMethod {
    public static void main(String[] args) {

////9.	Write a program to sort the array without using Arrays.sort() method.

    String arr[] = {"Geet", "Payal", "Pooja", "Asmita"};

    Map<String, String> map = new TreeMap<String, String>();

for (int i = 0; i < arr.length; i++) {

        map.put(arr[i], "test");

    }

for (Map.Entry<String, String> entry : map.entrySet()) {

    System.out.println(entry.getKey());

}}}












