/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ApiCustumer.dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ApiCustumer.entity.Customer;

/**
 *
 * @author DOCENTE
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    
}
