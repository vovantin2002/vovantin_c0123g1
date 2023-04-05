package case_study_module2.util.read_and_write;

import case_study_module2.model.facility.House;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteHouse {
    private static final String HOUSE_LIST_PAST="src\\case_study_module2\\data\\house.csv";
    public static LinkedHashMap<House, Integer> read(House house) {
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
        File file = new File(HOUSE_LIST_PAST);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                houseIntegerLinkedHashMap.put(new House(strings[0], strings[1], strings[2],
                        strings[3], strings[4], strings[5], strings[6],
                        strings[7]), Integer.parseInt(strings[8]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseIntegerLinkedHashMap;
    }

    public static void write(LinkedHashMap<House, Integer> houseIntegerLinkedHashMap, boolean append) {
        File file = new File(HOUSE_LIST_PAST);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House,Integer> h :
                    houseIntegerLinkedHashMap.entrySet()) {
                bufferedWriter.write(h.getKey().getAll()+","+h.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
