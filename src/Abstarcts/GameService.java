package Abstarcts;

import Entities.Customer;
import Entities.Game;

public interface GameService 
{
	public void gameSave(Game game);
	public void gameSell(Customer customer, Game game);
}
