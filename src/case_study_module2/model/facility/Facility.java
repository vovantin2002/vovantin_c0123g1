package case_study_module2.model.facility;

public class Facility {
    protected String nameService;
    protected int areaAll;
    protected int price;
    protected int numberHumanMax;
    protected String rentalType;

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaAll() {
        return areaAll;
    }

    public void setAreaAll(int areaAll) {
        this.areaAll = areaAll;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberHumanMax() {
        return numberHumanMax;
    }

    public void setNumberHumanMax(int numberHumanMax) {
        this.numberHumanMax = numberHumanMax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public Facility(String nameService, int areaAll, int price, int numberHumanMax, String rentalType) {
        this.nameService = nameService;
        this.areaAll = areaAll;
        this.price = price;
        this.numberHumanMax = numberHumanMax;
        this.rentalType = rentalType;
    }
}
