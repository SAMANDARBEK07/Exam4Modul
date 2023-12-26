package Servise.ServiseImpl;

import Servise.CustomerServise;
import domain.Customer;
import domain.Product;

public class CustomerServiseImpl implements CustomerServise {

    @Override
    public Customer Log_IN(String name, String password) {
        for (Customer customer:CUSTOMERS) {
            if (customer.getName().equals(name)&&customer.getPassword().equals(password)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer register(String name, String password) {
        for (Customer customer:CUSTOMERS) {
            if (customer.getName().equals(name)&&customer.getPassword().equals(password))
                return null;
        }
        return null;
    }

    }


}
