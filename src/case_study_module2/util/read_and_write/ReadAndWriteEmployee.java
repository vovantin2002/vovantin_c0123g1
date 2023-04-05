package case_study_module2.util.read_and_write;

import case_study_module2.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWriteEmployee {

    private static final String EMPLOYEE_LIST_PATH = "src\\case_study_module2\\data\\employee.csv";

    public static void writeEmployeeToFile(Employee employee) {
        File file = new File(EMPLOYEE_LIST_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(employee.getInfoToCsv());
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Employee> readEmployeeFromFile() {
        ArrayList<Employee> employeeList = new ArrayList();
        File file = new File(EMPLOYEE_LIST_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null && !(str).equals("")) {
                String[] strings = str.split(",");
                Employee employee1 = new Employee(strings[0], strings[1], strings[2],
                        strings[3], strings[4], strings[5], strings[6], strings[7], strings[8], strings[9]);
                employeeList.add(employee1);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return employeeList;
    }
}
