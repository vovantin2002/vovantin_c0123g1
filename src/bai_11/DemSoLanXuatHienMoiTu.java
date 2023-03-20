package bai_11;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class DemSoLanXuatHienMoiTu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi ki tu: ");
        String a = sc.nextLine();
        String uppercaseString = a.toUpperCase();
        System.out.println("chuoi da nhap sau khi chuyen thanh chu hoa: ");
        System.out.println(uppercaseString);
        String[] words = uppercaseString.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}





