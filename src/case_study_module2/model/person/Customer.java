package case_study_module2.model.person;

public class Customer extends Person {
    protected String typeOfCustomer;
    protected String address;

    public Customer(String id, String name, String birthday, String gender, String identityCard, String phoneNumber, String email, String typeOfCustomer, String address) {
        super(id, name, birthday, gender, identityCard, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String typeOfCustomer, String address) {
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer() {

    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
