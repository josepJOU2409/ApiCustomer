
package pe.cibertec.ApiCustumer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ApiCustumer.entity.Customer;
import pe.cibertec.ApiCustumer.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("/findAll")
    public List<Customer> findAll()
    {
        return customerService.findAll();
    }
    @GetMapping("/findById/(id)")
    public Customer finById(@PathVariable Long id){
        return customerService.findById(id);
    }
}
