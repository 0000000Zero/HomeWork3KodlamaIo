package Abstarcts;

import Entities.Customer;

public interface CustomerCheckService 
{
	boolean checkIfRealPerson(Customer customer) throws Exception;
} 