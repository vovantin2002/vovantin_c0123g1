package bai_1;

//import java.util.Scanner;
//
//public class DocSoThanhChu {
//    public static void main(String[] args) {
//        int n;
//        System.out.println("Nhập vào số nguyên");
//        Scanner sc = new Scanner(System.in);
//        n = Integer.parseInt(sc.nextLine());
//        String lessTen = String.valueOf(n);
//        int dozens = n / 10;
//        int unitRow = n % 10;
//
//        if (n < 10 && n >= 0) {
////           String result =  lessTen(n);
//            System.out.println(lessTen(n));
//        } else if (n < 20) {
//            String moreTen = String.valueOf(unitRow);
//            switch (unitRow) {
//                case 0:
//                    moreTen = "ten";
//                    break;
//                case 1:
//                    moreTen = "eleven";
//                    break;
//                case 2:
//                    moreTen = "twelve";
//                    break;
//                case 3:
//                    moreTen = "thirteen";
//                    break;
//                case 4:
//                    moreTen = "fourteen";
//                    break;
//                case 5:
//                    moreTen = "fifteen";
//                    break;
//                case 6:
//                    moreTen = "sixteen";
//                    break;
//                case 7:
//                    moreTen = "seventeen";
//                    break;
//                case 8:
//                    moreTen = "eighteen";
//                    break;
//                case 9:
//                    moreTen = "nineteen";
//                    break;
//                default:
//            }
//            System.out.println(moreTen);
//
//        } else if (n < 100) {
//            String moreTwenty = String.valueOf(dozens);
//            switch (dozens) {
//
//                case 2:
//                    moreTwenty = "twenty";
//                    break;
//                case 3:
//                    moreTwenty = "thirty";
//                    break;
//                case 4:
//                    moreTwenty = "forty";
//                    break;
//                case 5:
//                    moreTwenty = "fifty";
//                    break;
//                case 6:
//                    moreTwenty = "sixty";
//                    break;
//                case 7:
//                    moreTwenty = "seventy";
//                    break;
//                case 8:
//                    moreTwenty = "eighty";
//                    break;
//                case 9:
//                    moreTwenty = "ninety";
//                    break;
//                default:
//            }
//            System.out.println(moreTwenty +" "+ lessTen(unitRow));
//
//        }
//
//    }
//
//    public static String lessTen(int number) {
//        String lessTen = "";
//        switch (number) {
//            case 0:
//                lessTen = "zero";
//                break;
//            case 1:
//                lessTen = "one";
//                break;
//            case 2:
//                lessTen = "two";
//                break;
//            case 3:
//                lessTen = "three";
//                break;
//            case 4:
//                lessTen = "four";
//                break;
//            case 5:
//                lessTen = "five";
//                break;
//            case 6:
//                lessTen = "six";
//                break;
//            case 7:
//                lessTen = "seven";
//                break;
//            case 8:
//                lessTen = "eight";
//                break;
//            case 9:
//                lessTen = "nine";
//                break;
//            default:
//        }
//        return lessTen;
//    }
//}
//package introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {

        boolean flag = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số để đọc ");
            int a = sc.nextInt();
            String zero = "Zero";
            String one = "One";
            String two = "Two";
            String three = "Three";
            String four = "Four";
            String five = "Five";
            String six = "Six";
            String seven = "Seven";
            String eight = "Eight";
            String nine = "Nine";
            String ten = "Ten";

            String twenty = "twenty ";
            String thirty = "Thirty ";
            String forty = "Forty ";
            String fifty = "Fifty ";
            String sixty = "Sixty ";
            String seventy = "Seventy ";
            String eighty = "Eighty ";
            String ninety = "Ninety ";
            String hundered = " Hundered ";
            String teen = "teen";
            String result = " ";

            int m, n, i, j;
            m = a / 10;
            i = m / 10;
            n = a % 10;
            j = m % 10;
            flag = true;
            if (a >= 0 && a < 10) {
                switch (a) {
                    case 0:
                        result = zero;
                        break;
                    case 1:
                        result = one;
                        break;
                    case 2:
                        result = two;
                        break;
                    case 3:
                        result = three;
                        break;
                    case 4:
                        result = four;
                        break;
                    case 5:
                        result = five;
                        break;
                    case 6:
                        result = six;
                        break;
                    case 7:
                        result = seven;
                        break;
                    case 8:
                        result = eight;
                        break;
                    case 9:
                        result = nine;
                }
                System.out.print(result);
            } else if (a < 20) {
                switch (a) {
                    case 10:
                        result = ten;
                        break;
                    case 11:
                        result = "Eleven";
                        break;
                    case 12:
                        result = "Twelve";
                        break;
                    case 13:
                        result = "Thir" + teen;
                        break;
                    case 14:
                        result = four + teen;
                        break;
                    case 15:
                        result = "Fir" + teen;
                        break;
                    case 16:
                        result = six + teen;
                        break;
                    case 17:
                        result = seven + teen;
                        break;
                    case 18:
                        result = eight + teen;
                        break;
                    case 19:
                        result = nine + teen;
                }
                System.out.print(result);
            } else if (a < 100) {
                switch (m) {
                    case 2:
                        result = twenty;
                        break;
                    case 3:
                        result = thirty;
                        break;
                    case 4:
                        result = forty;
                        break;
                    case 5:
                        result = fifty;
                        break;
                    case 6:
                        result = sixty;
                        break;
                    case 7:
                        result = seventy;
                        break;
                    case 8:
                        result = eighty;
                        break;
                    case 9:
                        result = ninety;
                }
                System.out.print(result);
                switch (n) {
                    case 1:
                        result = one;
                        break;
                    case 2:
                        result = two;
                        break;
                    case 3:
                        result = three;
                        break;
                    case 4:
                        result = four;
                        break;
                    case 5:
                        result = five;
                        break;
                    case 6:
                        result = six;
                        break;
                    case 7:
                        result = seven;
                        break;
                    case 8:
                        result = eight;
                        break;
                    case 9:
                        result = nine;
                }
                System.out.print(result);
            } else if (a < 1000) {
                switch (i) {
                    case 1:
                        result = one;
                        break;
                    case 2:
                        result = two;
                        break;
                    case 3:
                        result = three;
                        break;
                    case 4:
                        result = four;
                        break;
                    case 5:
                        result = five;
                        break;
                    case 6:
                        result = six;
                        break;
                    case 7:
                        result = seven;
                        break;
                    case 8:
                        result = eight;
                        break;
                    case 9:
                        result = nine;
                }
                System.out.print(result + " " + hundered);
                switch (j) {
                    case 2:
                        result = twenty;
                        break;
                    case 3:
                        result = thirty;
                        break;
                    case 4:
                        result = forty;
                        break;
                    case 5:
                        result = fifty;
                        break;
                    case 6:
                        result = sixty;
                        break;
                    case 7:
                        result = seventy;
                        break;
                    case 8:
                        result = eighty;
                        break;
                    case 9:
                        result = ninety;
                }
                System.out.print(result);
                switch (n) {
                    case 1:
                        result = one;
                        break;
                    case 2:
                        result = two;
                        break;
                    case 3:
                        result = three;
                        break;
                    case 4:
                        result = four;
                        break;
                    case 5:
                        result = five;
                        break;
                    case 6:
                        result = six;
                        break;
                    case 7:
                        result = seven;
                        break;
                    case 8:
                        result = eight;
                        break;
                    case 9:
                        result = nine;
                }
                System.out.println(result);
            } else {
                System.out.println("Số lớn quá, 3 số thôi");
            }
            System.out.println("\n false để nhập lại.\n true để thoát.");
            boolean reset = sc.nextBoolean();
            if (reset) {
                flag = true;
            } else {
                flag = false;
            }
        } while (!flag);
    }
}