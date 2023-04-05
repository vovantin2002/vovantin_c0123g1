package luyen_tap_thuat_toan;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        System.out.println("nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        int cout=0;
        int sum=0;
        while(x<n){
            for (int i = 2; i <1000 ; i++) {
                if(i%i==0){
                    cout++;

            } }if(cout==1){
        }
            x++;
        }
        System.out.println(sum);

    }

}
