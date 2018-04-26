package com.day7.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

import com.day7.model.Customer;

@Repository("customerRepository")
public class CustomerDaoImpl implements CustomerDao {
public static final Logger log = Logger.getLogger("controller logger");
 /**
 Map object of type Customer is created. 
 */
public Map<String, Customer> map = new HashMap();
 public Map<String, Customer> getMap() {
		return map;
 }
	@Override
	public void addCustomer(final Customer customer,final Map map) {

		map.put(customer.getCustomerId(), customer);

	}

	@Override
	public int viewCustomer(final String customer_id) {

		if (map.containsKey(customer_id)) {
			final Customer customerDetails = map.get(customer_id);
			
			
			log.info(customerDetails.getFirstName()+" " +customerDetails.getLastName());
			//System.out.println(contact.getMobile());
			log.info("Initial balance is: "+customerDetails.getInitialBalance());
		} else {
			log.info("No such user");
		}
		return 0;
	}

	@Override
	public int performTransaction(final String user_id,final String receiver_id, final int amount) {
		
		if(map.containsKey(user_id)&& map.containsKey(receiver_id))
		{
			
			final Customer cust1=map.get(user_id);
			final Customer cust2=map.get(receiver_id);
			if(cust1.getInitialBalance()>amount)
			{
			
				final int cust1_updatedBal= cust1.getInitialBalance()-amount;
				cust1.setInitialBalance(cust1_updatedBal);
			
				final int cust2_updatedBal= cust1.getInitialBalance()+amount;
				cust2.setInitialBalance(cust2_updatedBal);
				
				map.put(user_id, cust1);
				map.put(receiver_id, cust2);
				
				log.info("Transaction successful");
				
			}
			else
			{
				log.info("Insufficient balance.");
			}
		}
		else
		{
			log.info();
		}
		return 0;
	
	}
}
