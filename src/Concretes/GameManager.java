package Concretes;

import Entities.Customer;
import Entities.Game;
import Abstarcts.GameService;

public class GameManager implements GameService {

	@Override
	public void gameSave(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Saved Game");
        System.out.println("Game Name : "+game.getGameName()+" "+" Game Type : "+game.getsType());
	}

	@Override
	public void gameSell(Customer customer, Game game) {
		// TODO Auto-generated method stub
		System.out.println("The Person Who Bought The Game : " + customer.getFirstName()+" "+
                customer.getLastName()+" "+
                "Bought The Game : "+game.getsType()+" "+
                game.getGameName());
	}

	

}
