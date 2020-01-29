package Data;
import java.util.*;

class DataBase {
	private static DataBase instance;
	
	private ArrayList<Client> Clients;
	
	private DataBase() {
		this.Clients = new ArrayList();
	}
	
	public static DataBase GetInstance() {
		if(instance == null) {
			synchronized(DataBase.class) {
				if(instance == null) {
					instance = new DataBase();
				}
			}
		}
		return instance;
	}
	
	protected void AddClient(Client NewClient) {
		Clients.add(NewClient);
	}
	
	protected int CheckCredits(String Name) {
		Client Current;
		int i;
		for(i=0; i< Clients.size(); i++) {
			Current = Clients.get(i);
			if(Current.getName().equals(Name)) {
				return Current.getCredit();
			}
		}
		return -1;
	}
	
	protected boolean ActualizeCredits(String Name, int Credits) {
		Client Current;
		int i;
		for(i=0; i< Clients.size(); i++) {
			Current = Clients.get(i);
			if(Current.getName().equals(Name)) {
				Current.setCredit(Credits);
				return true;
			}
		}
		return false;
	}
}
