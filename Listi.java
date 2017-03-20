package TEST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Listi {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainArr = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arrOther = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) mainArr.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < mainArr.size(); i++) {
            if (mainArr.get(i) % 3 == 0) arr3.add(mainArr.get(i));
            if (mainArr.get(i) % 2 == 0) arr2.add(mainArr.get(i));
            if (mainArr.get(i) % 2 != 0 && mainArr.get(i) % 3 != 0) arrOther.add(mainArr.get(i));
        }

        printList(arr3);
        printList(arr2);
        printList(arrOther);

    }

    public static void printList(List<Integer> list) {
        for (Integer l : list) {
            System.out.println(l);
        }
    }
}
