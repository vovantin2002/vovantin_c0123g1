package case_study_module2.service;

import case_study_module2.model.person.Customer;

public interface ICustomerService extends IService  {
    void display();

    void add();

    void edit();
}
