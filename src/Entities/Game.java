package Entities;

public class Game 
{
	private int sid;
	private String gameName;
	private String sType;
	
	public Game () { 
		
	}

	public Game(int sid, String gameName, String sType) {
		super();
		this.sid = sid;
		this.gameName = gameName;
		this.sType = sType; 
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getsType() {
		return sType;
	}

	public void setsType(String sType) {
		this.sType = sType;
	}
	
	
}
