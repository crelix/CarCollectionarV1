package Clicker;

public class MainHolder {
	
public String main[] = new String[10];
	
	public MainHolder(){
		
		
	}
	
	public void MainMaker(String a1, int k){
		
		main[k] = a1;

	}
	
	public void MakeMain(){
		
		int u = 0;
		MainMaker("0", u); // Money
		u +=1;
		MainMaker("0", u); // Money Clicks
		u +=1;
		MainMaker("0", u); // Boxes
		u +=1;
		MainMaker("0", u); // Boxes Clicks
		u +=1;
		MainMaker("1", u); // Boxes Level
		u +=1;
		MainMaker("1", u); // Player Level
		u +=1;
		MainMaker("1", u); // Garage Level
		u +=1;
		MainMaker("0", u); // Garage Slots
		u +=1;
	}
}
