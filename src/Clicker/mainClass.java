package Clicker;

import javax.swing.JFrame;

public class mainClass {
		
	 public static void main(String[] args) {
	    			 
		 	ClickerGame CG = new ClickerGame();

	        JFrame frame = new JFrame("CarCollectionarV1");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	        CG.addComponentToPane(frame.getContentPane());

	        frame.pack();
	        frame.setVisible(true);
	        frame.setResizable(true);
	    	frame.setSize(1000, 700);
	    	
	    	CG.LoadFile();
	    	
	    	boolean GameLoop = true;
	    	while(GameLoop){
	    	CG.refresh();
	    	CG.SaveFile();
	    	}	    	
	    	
	 }
}