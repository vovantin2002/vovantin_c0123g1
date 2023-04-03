package case_study_module2.model.facility;

public class House extends Facility {
    protected String roomStandard;
    protected String numOfLevel;


    public House(String idService, String nameService, String areaAll, String price, String numberHumanMax, String rentalType, String age, String roomStandard, String numOfLevel) {
        super(idService, nameService, areaAll, price, numberHumanMax, rentalType, age);
        this.roomStandard = roomStandard;
        this.numOfLevel = numOfLevel;
    }

    public House(String roomStandard, String numOfLevel) {
        this.roomStandard = roomStandard;
        this.numOfLevel = numOfLevel;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numOfLevel='" + numOfLevel + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaAll='" + areaAll + '\'' +
                ", price='" + price + '\'' +
                ", numberHumanMax='" + numberHumanMax + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String getNumOfLevel() {
        return numOfLevel;
    }

    public void setNumOfLevel(String numOfLevel) {
        this.numOfLevel = numOfLevel;
    }

    public String getAll() {
        return idService + "," + nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + age + "," + roomStandard + "," + numOfLevel;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Villa villa = (Villa) o;
//        return Objects.equals(serviceId, villa.serviceId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(serviceId);
//    }
//}
}
