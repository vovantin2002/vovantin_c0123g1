package bai_13;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi: ");
        String str = sc.nextLine();
        LinkedList<Character> list1 = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list2 = new LinkedList<>();
            list2.add(str.charAt(i));
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) > list2.getLast()) {
                    list2.add(str.charAt(j));
                }
            }
            if (list2.size() > list1.size()) {
                list1.clear();
                list1.addAll(list2);
            }
        }
        for (Character c : list1) {
            System.out.print(c);
        }
    }
}