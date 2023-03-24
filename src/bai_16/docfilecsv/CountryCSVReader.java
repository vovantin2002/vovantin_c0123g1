package bai_16.docfilecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountryCSVReader {
    public static void main(String[] args) {
        String csvFile = "src\\bai_16\\docfilecsv\\text.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                System.out.println("ID: " + country[0] + ", Code: " + country[1] + ", Name: " + country[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}