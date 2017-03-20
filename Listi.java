package TEST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Listi {
    public static void main(String[] args) throws Exception {
            public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            
            int x = Integer.parseInt(reader.readLine());

	        if (x % 2 == 0) {
	            list1.add(x);
	           
	        } 
	        else if (x % 3 == 0) {
	            list2.add(x);
	          
	        }
	        if (x % 2 == 0 && x % 3 == 0) {
	            list3.add(x);
	          
        }
	      
    }
        printList(list1);
        printList(list2);
        printList(list3);

    }
	
	public static void printList(ArrayList list) {
		System.out.println(list);
	}
}
