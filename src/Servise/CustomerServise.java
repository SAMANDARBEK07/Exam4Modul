package Servise;

import domain.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CustomerServise {
    List<Customer> CUSTOMERS=new ArrayList<>();
    Customer Log_IN(String name,String password);
    Customer register(String name,String password);

}
