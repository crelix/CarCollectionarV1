package Clicker;

import javax.swing.*;


public class mainClass {
		
	 public static void main(String[] args) {
	    		 
		 	//SplashScreen
		 	JWindow SplashScreen = new JWindow();
		 	SplashScreen.getContentPane().add(
		    new JLabel("", new ImageIcon("Images/SplashScreen.png"), SwingConstants.CENTER));
		 	SplashScreen.setBounds(150, 20, 1000, 700);
		 	SplashScreen.setVisible(true);
		 	try {
		     Thread.sleep(5000);
		 		} catch (InterruptedException e) {
		 			e.printStackTrace();
		 		}
		 	SplashScreen.setVisible(false);
		 
		 	//Game
		 	ClickerGame CG = new ClickerGame();
		    	 	
	        JFrame frame = new JFrame("CarCollectionarV1");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	        CG.addComponentToPane(frame.getContentPane());
 
	        frame.pack();
	        frame.setBounds(150, 20, 1000, 700);
	        frame.setVisible(true);
	        frame.setResizable(false);
	    	frame.setSize(1000, 700);
	    	
	    	
	    	CG.LoadFile();
	    	
	    	//Game Loop
	    	boolean GameLoop = true;
	    	while(GameLoop){
	    	CG.refresh();
	    	CG.SaveFile();
	    	}	    	
	    	
	 }
}