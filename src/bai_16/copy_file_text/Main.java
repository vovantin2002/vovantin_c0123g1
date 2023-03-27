package bai_16.copy_file_text;


import java.io.*;


public class Main {
    public static void main(String[] args) {

        try (Reader reader = new FileReader("src\\bai_16\\copyfiletext\\test.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Writer writer = new FileWriter("src\\bai_16\\copyfiletext\\text.csv");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            bufferedWriter.write("vo van tin");
            bufferedWriter.newLine();
            bufferedWriter.write("C0123G1");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
