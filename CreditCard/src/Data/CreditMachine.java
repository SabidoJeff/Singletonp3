package Data;

public class CreditMachine {
	private DataBase Data;
	
	public CreditMachine() {
		this.Data = DataBase.GetInstance();
	}
	
	public boolean InsertCredits(String Name, int NewCredits) {
		int CurrentCredits = this.Data.CheckCredits(Name);
		if(CurrentCredits == -1) {
			return false;
		}
		this.Data.ActualizeCredits(Name, CurrentCredits + NewCredits);
		return true;
	}
	
	public void AddClient(String Name, int Credits) {
		Client New = new Client(Name, Credits);
		this.Data.AddClient(New);
	}
	
	public int CheckCredits(String Name) {
		return this.Data.CheckCredits(Name);
	}
	
	public boolean RecieveCredits(String Name, int TakenCredits){
		int CurrentCredits = this.Data.CheckCredits(Name);
		if(CurrentCredits == -1 || CurrentCredits < TakenCredits) {
			return false;
		}
		this.Data.ActualizeCredits(Name, CurrentCredits - TakenCredits);
		return true;
	}
	
}
