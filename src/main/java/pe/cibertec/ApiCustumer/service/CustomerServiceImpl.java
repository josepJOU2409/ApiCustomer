
package pe.cibertec.ApiCustumer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ApiCustumer.dao.CustomerRepository;
import pe.cibertec.ApiCustumer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public List<Customer> findAll() {
       return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
    
}
