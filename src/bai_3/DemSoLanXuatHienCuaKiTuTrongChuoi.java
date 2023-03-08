package bai_3;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        String str = "vovantin";
        char b = 'v';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (b == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

}
