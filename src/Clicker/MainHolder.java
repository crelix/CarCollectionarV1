package Clicker;

public class MainHolder {
	
public Integer main[] = new Integer[8];
	
	public MainHolder(){
			
		MakeMain();		
	}
	
	public void MainMaker(int k,int p){

		main[p] = k;
		
	}
	
	public void MakeMain(){
		


		int i=0;
		MainMaker(0,i); // Money
		i++;
		MainMaker(0,i); // Money Clicks
		i++;
		MainMaker(0,i); // Boxes
		i++;
		MainMaker(0,i); // Boxes Clicks
		i++;
		MainMaker(1,i); // Boxes Level
		i++;
		MainMaker(1,i); // Player Level
		i++;
		MainMaker(1,i); // Garage Level
		i++;
		MainMaker(25,i); // Garage Slots
		
	}
}