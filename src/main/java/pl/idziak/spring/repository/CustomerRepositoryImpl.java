package pl.idziak.spring.repository;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Repository;
import pl.idziak.spring.model.Customer;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> getAll(){
        return ImmutableList.of(new Customer());
    }
}
