package Clicker;

import javax.swing.JFrame;

public class mainClass {

	 public static void main(String[] args) {
	    	
		 ClickerGame game = new ClickerGame();

	        JFrame frame = new JFrame("CarCollectionarV1");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	        game.addComponentToPane(frame.getContentPane());

	        frame.pack();
	        frame.setVisible(true);
	        frame.setResizable(true);
	    	frame.setSize(1000, 700);
	    	
	    	LoadFile load = new LoadFile();
	 
	 Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

	        public void run() {
	        SaveFile save = new SaveFile();
	        }
	    }));
	 }
}
