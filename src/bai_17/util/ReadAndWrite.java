package bai_17.util;

import bai_17.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    //    public static void writeStringToFile(String pathfile,String text,boolean append){
//        File file=new File(pathfile);
//        FileWriter fileWriter=null;
//        BufferedWriter bufferedWriter=null;
//
//        try {
//
//            fileWriter = new FileWriter(file,append);
//            bufferedWriter=new BufferedWriter(fileWriter );
//
//            bufferedWriter.write(text);
//            bufferedWriter.newLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public static List<Product> readFileToListString(String pathFile){
//        List<String> productList = new ArrayList<>();
//        File file = new File(pathFile);
//        FileReader fileReader = null;
//        BufferedReader bufferedReader =null;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line=null;
//            while ((line= bufferedReader.readLine())!=null){
//                productList.add(line);
//            }
//            bufferedReader.close();
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return productList;
//    }
    public static void writeStringToFile(String pathFile, List<Product> productList) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Product> readFileToListString(String pathFile) {
        List<Product> productList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }


}
