/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package façade;

import dao.CustomerDao;
import java.util.List;
import pojo.Customer;

/**
 *
 * @author formacion
 */
public class CustomerFaçade{
    private CustomerDao customerDao;
    
    public CustomerFaçade(){
        this.customerDao = new CustomerDao();
    }
    
    public List<Customer> getListaClientes(){
        return customerDao.findAll();
    }
}
