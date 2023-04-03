package case_study_module2.util.vaidate;

public class Check {
    public static void validateFacilityData(String idService, String nameService, double areaAll, double price, String numberHumanMax, String rentType, int age) throws Exception {

        // Kiểm tra định dạng của mã dịch vụ
        if (!idService.matches("^(SV(VL|HO|RO)-[0-9]{4})$")) {
            throw new Exception("Mã dịch vụ không đúng định dạng!");
        }

        // Kiểm tra định dạng của tên dịch vụ
        if (!nameService.matches("^[A-Z][a-z]*([\\s][A-Z][a-z]*)*$")) {
            throw new Exception("Tên dịch vụ không đúng định dạng!");
        }

        // Kiểm tra diện tích sử dụng
        if (areaAll < 30) {
            throw new Exception("Diện tích không hợp lệ!");
        }

        // Kiểm tra chi phí thuê
        if (price <= 0) {
            throw new Exception("Chi phí thuê không hợp lệ!");
        }

        // Kiểm tra số lượng người tối đa
        int maxCapacityInt = Integer.parseInt(numberHumanMax);
        if (maxCapacityInt <= 0 || maxCapacityInt >= 20) {
            throw new Exception("Số lượng người tối đa phải >0 và nhỏ hơn <20!");
        }


        // Kiểm tra định dạng của kiểu thuê và tiêu chuẩn phòng
        if (!rentType.matches("^[A-Z][a-z]*([\\s][A-Z][a-z]*)*$")) {
            throw new Exception("Kiểu thuê hoặc tiêu chuẩn phòng không đúng định dạng!");
        }

//         Kiểm tra định dạng của ngày sinh
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date birthDate = sdf.parse(birthDateString);
//        Date currentDate = new Date();
//         age = (int)((currentDate.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24 * 365));
//
//        if(age < 18 || age > 100) {
//            throw new Exception("Ngày sinh không hợp lệ!");
//        }
    }
}
