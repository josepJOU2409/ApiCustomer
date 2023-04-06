
package pe.cibertec.ApiCustumer.service;

import java.util.List;
import pe.cibertec.ApiCustumer.entity.Customer;


public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(Long id);
}
