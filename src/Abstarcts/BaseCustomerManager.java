package Abstarcts;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void customerSave(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Save to Db  : " +customer.getFirstName()+" "+customer.getLastName() );
	}

}
