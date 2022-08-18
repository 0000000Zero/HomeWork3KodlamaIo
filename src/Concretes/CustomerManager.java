package Concretes;

import Entities.Customer;
import Abstarcts.CustomerCheckService;
import Abstarcts.CustomerService;

public class CustomerManager implements CustomerService 
{
	private CustomerCheckService iCustomerCheckService;
	
	public CustomerManager(CustomerCheckService icustomerCheckService)
	{
        this.iCustomerCheckService = icustomerCheckService;
    }
	@Override
	public void customerSave(Customer customer) throws Exception 
	{
		// TODO Auto-generated method stub
		if (iCustomerCheckService.checkIfRealPerson(customer))
		{
            System.out.println("Saved To Person : "+customer.getFirstName() +" "+customer.getLastName());
        }
        else
        {
            System.out.println("Not A Valid Person");
        }

	}
}
