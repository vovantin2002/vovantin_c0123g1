import java.util.Scanner;

public class UngDungDocSoThanhChu {


    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào số nguyên");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        String lessTen = String.valueOf(n);
        int dozens = n / 10;
        int unitRow = n % 10;
        int hudered = n / 100;
        int hunder = n % 100;

        if (n < 10 && n >= 0) {
            System.out.println(lessTen(n));
        } else if (n < 20) {
            String moreTen = String.valueOf(unitRow);
            switch (unitRow) {
                case 0:
                    moreTen = "ten";
                    break;
                case 1:
                    moreTen = "eleven";
                    break;
                case 2:
                    moreTen = "twelve";
                    break;
                case 3:
                    moreTen = "thirteen";
                    break;
                case 4:
                    moreTen = "fourteen";
                    break;
                case 5:
                    moreTen = "fifteen";
                    break;
                case 6:
                    moreTen = "sixteen";
                    break;
                case 7:
                    moreTen = "seventeen";
                    break;
                case 8:
                    moreTen = "eighteen";
                    break;
                case 9:
                    moreTen = "nineteen";
                    break;
                default:
            }
            System.out.println(moreTen);

        } else if (n < 100) {
            String moreTwenty = String.valueOf(dozens);
            if (n == 10 || n == 20 || n == 30 || n == 40 || n == 50 || n == 60 || n == 70 || n == 80 || n == 90) {

                switch (dozens) {

                    case 2:
                        moreTwenty = "twenty";
                        break;
                    case 3:
                        moreTwenty = "thirty";
                        break;
                    case 4:
                        moreTwenty = "forty";
                        break;
                    case 5:
                        moreTwenty = "fifty";
                        break;
                    case 6:
                        moreTwenty = "sixty";
                        break;
                    case 7:
                        moreTwenty = "seventy";
                        break;
                    case 8:
                        moreTwenty = "eighty";
                        break;
                    case 9:
                        moreTwenty = "ninety";
                        break;
                    default:
                }
                System.out.println(moreTwenty);
            } else {
                switch (dozens) {

                    case 2:
                        moreTwenty = "twenty";
                        break;
                    case 3:
                        moreTwenty = "thirty";
                        break;
                    case 4:
                        moreTwenty = "forty";
                        break;
                    case 5:
                        moreTwenty = "fifty";
                        break;
                    case 6:
                        moreTwenty = "sixty";
                        break;
                    case 7:
                        moreTwenty = "seventy";
                        break;
                    case 8:
                        moreTwenty = "eighty";
                        break;
                    case 9:
                        moreTwenty = "ninety";
                        break;
                    default:
                }
                System.out.println(moreTwenty + " " + lessTen(unitRow));
            }

        } else if (n < 1000) {
            if (n == 100 || n == 200 || n == 300 || n == 400 || n == 500 || n == 600 || n == 700 || n == 800 || n == 900) {
                String moreHundered = String.valueOf(hudered);

                switch (hudered) {

                    case 1:
                        moreHundered = "One  hundred";
                        break;
                    case 2:
                        moreHundered = "Two  hundred";
                        break;
                    case 3:
                        moreHundered = "Three hundred";
                        break;
                    case 4:
                        moreHundered = "Four  hundred";
                        break;
                    case 5:
                        moreHundered = "Five hundred";
                        break;
                    case 6:
                        moreHundered = "Six hundred";
                        break;
                    case 7:
                        moreHundered = "Seven hundred";
                        break;
                    case 8:
                        moreHundered = "Eight hundred";
                        break;
                    case 9:
                        moreHundered = "Nine hundred";
                        break;
                    default:
                }
                System.out.println(moreHundered);
            } else {
                String moreHundered = String.valueOf(hunder);
                switch (hunder) {

                    case 1:
                        moreHundered = "One  hundred";
                        break;
                    case 2:
                        moreHundered = "Two  hundred";
                        break;
                    case 3:
                        moreHundered = "Three hundred";
                        break;
                    case 4:
                        moreHundered = "Four  hundred";
                        break;
                    case 5:
                        moreHundered = "Five hundred";
                        break;
                    case 6:
                        moreHundered = "Six hundred";
                        break;
                    case 7:
                        moreHundered = "Seven hundred";
                        break;
                    case 8:
                        moreHundered = "Eight hundred";
                        break;
                    case 9:
                        moreHundered = "Nine hundred";
                        break;
                    default:
                }
                System.out.println(moreHundered + " and " + lessTen(hunder));
            }
        }
    }

    public static String lessTen(int number) {
        String lessTen = "";
        switch (number) {
            case 0:
                lessTen = "zero";
                break;
            case 1:
                lessTen = "one";
                break;
            case 2:
                lessTen = "two";
                break;
            case 3:
                lessTen = "three";
                break;
            case 4:
                lessTen = "four";
                break;
            case 5:
                lessTen = "five";
                break;
            case 6:
                lessTen = "six";
                break;
            case 7:
                lessTen = "seven";
                break;
            case 8:
                lessTen = "eight";
                break;
            case 9:
                lessTen = "nine";
                break;
            default:
        }
        return lessTen;
    }
}
