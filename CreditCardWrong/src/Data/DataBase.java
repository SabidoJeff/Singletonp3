package Data;
import java.util.*;

class DataBase {
	
	private ArrayList<Client> Clients;
	
	public DataBase() {
		this.Clients = new ArrayList();
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
