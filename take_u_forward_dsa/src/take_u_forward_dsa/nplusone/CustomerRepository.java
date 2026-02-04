package take_u_forward_dsa.nplusone;

import java.util.List;



/*
 * 
@Entity
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String street;
	private String city;
	private Integer zipCode;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonBackReference
	private Customer customer;

}

 * 
 * 
 * 
 * 
 * 
 * 
@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "customer",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	@JsonManagedReference
	private List<Address> addresses;

}




@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		customer.getAddresses().forEach(a -> a.setCustomer(customer));
		return customerRepository.save(customer);
	}
	@GetMapping
	public List<Customer> getAllCustomer(){
		return customerRepository.fetchCustomerWithAddress();
	}

}


 * 
 * 
 * 
 
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nproblem.nplusone.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	@EntityGraph(attributePaths = "addresses")
	List<Customer> findAll();
	
	@Query("SELECT c from Customer c LEFT JOIN FETCH c.addresses")
	List<Customer> fetchCustomerWithAddress();
}

*/
