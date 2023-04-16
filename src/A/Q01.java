package A;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);
        Scanner sc = new Scanner(System.in);
        System.out.println(list);
        System.out.print("Search for a number in list: ");
        int num1 = sc.nextInt();
        if (list.contains(num1)) {
            System.out.println("Found " + num1 + " at index " + list.indexOf(num1));
        } else {
            System.out.println("Not found");
        }
        System.out.print("Remove a number from list: ");
        int num2 = sc.nextInt();
        if (list.contains(num2)) {
            list.remove(list.indexOf(num2));
            System.out.println("Removed " + num2 + " from list");
        } else {
            System.out.println("Not found");
        }
        System.out.println("IsEmpty: "+list.isEmpty());

    }
}
