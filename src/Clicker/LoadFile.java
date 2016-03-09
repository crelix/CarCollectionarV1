package Clicker;

import java.io.*;

public class LoadFile {

	ClickerGame CG =new ClickerGame();{
		
		try{
			File SaveFile = new File("SaveFile.sav");
			if(!SaveFile.exists()) {
			    SaveFile.createNewFile();
			} 
			FileInputStream SaveFileSub = new FileInputStream(SaveFile);
			ObjectInputStream load = new ObjectInputStream(SaveFileSub);

			load.close();
			}
			catch(Exception exc){
			exc.printStackTrace();
			}
			}
}
