package com.day7.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.day7.model.Contact;
import com.day7.model.Customer;

@Repository("customerRepository")
public class CustomerDaoImpl implements CustomerDao {

	Map<String, Customer> map = new HashMap();

	@Override
	public void addCustomer(Customer customer) {

		map.put(customer.getCustomerId(), customer);

	}

	@Override
	public int viewCustomer(String customer_id) {

		if (map.containsKey(customer_id)) {
			Customer customerDetails = map.get(customer_id);
			Contact contact=new Contact();
			
			System.out.println(customerDetails.getFirstName()+" " +customerDetails.getLastName());
			System.out.println(contact.getMobile());
			System.out.println("Initial balance is: "+customerDetails.getInitialBalance());
		} else {
			System.out.println("No such user");
		}
		return 0;
	}

	@Override
	public int performTransaction(String user_id, String receiver_id, int amount) {
		
		if(map.containsKey(user_id)&& map.containsKey(receiver_id))
		{
			
			Customer c1=map.get(user_id);
			Customer c2=map.get(receiver_id);
			if(c1.getInitialBalance()>amount)
			{
			
				int c1_updatedBalance= c1.getInitialBalance()-amount;
				c1.setInitialBalance(c1_updatedBalance);
			
				int c2_updatedBalance= c1.getInitialBalance()+amount;
				c2.setInitialBalance(c2_updatedBalance);
				
				map.put(user_id, c1);
				map.put(receiver_id, c2);
				
				System.out.println("Transaction successful");
				
			}
			else
			{
				System.out.println("Insufficient balance.");
			}
		}
		else
		{
			System.out.println();
		}
		return 0;
	
	}
}
