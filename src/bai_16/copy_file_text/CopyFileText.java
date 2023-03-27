//package bai_16.copyfiletext;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CopyFileText {
//    static final String PATH1 = "src\\bai_16\\copyfiletext\\test.txt";
//    static final String PATH2 = "src\\bai_16\\copyfiletext\\text.csv";
//
//    public static void main(String[] args) {
//        writeToFileTarget(readToFileSource(), true);
//    }
//
//    public static List<String> readToFileSource() {
//        File file = new File(PATH1);
//        List<String> list = new ArrayList<>();
//
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line;
//            while ((line = br.readLine()) != null) {
//                list.add(line);
//            }
//            br.close();
//
//
//
//    public static void writeToFileTarget(List<String> list, boolean append) {
//        File file = new File(PATH2);
//        BufferedWriter bufferedWriter = null;
//
//            bufferedWriter = new BufferedWriter(new FileWriter(file, append));
//            for (int i = 0; i < list.size(); i++) {
//                bufferedWriter.write(list.get(i));
//                bufferedWriter.newLine();
//            }
//        }
//        }
//    }
//}