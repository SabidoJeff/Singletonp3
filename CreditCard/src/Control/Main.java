package Control;
import Data.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		CreditMachine CurrentMachine;
		int i, credits;
		boolean result;
		ArrayList<CreditMachine> Machines = new ArrayList();
		for(i=0; i<5; i++) {
			Machines.add(new CreditMachine());
		}
		CurrentMachine = Machines.get(0);
		CurrentMachine.AddClient("Jeferson", 0);
		for(i=0; i<5; i++) {
			result = CurrentMachine.InsertCredits("Jeferson", (i+1)*10);
			System.out.println(result);
		}
		System.out.println(CurrentMachine.CheckCredits("Jeferson"));
	}
}
