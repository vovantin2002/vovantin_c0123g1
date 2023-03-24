package bai_16.đọcfilecsv;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CountryCSVReader {


    public static void main(String[] args) throws IOException {
        String filePath = "src\\bai_16\\đọcfilecsv\\text.txt";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> rows = reader.readAll();

            for (String[] row : rows) {
                int id = Integer.parseInt(row[0]);
                String code = row[1];
                String name = row[2];
                System.out.println(id + " - " + code + " - " + name);
            }
        }
    }
}

