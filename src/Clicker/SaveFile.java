package Clicker;

import java.io.*;

public class SaveFile{
	
	
    {
try{
	File SaveFile = new File("SaveFile.sav");
	if(!SaveFile.exists()) {
	    SaveFile.createNewFile();
	} 
	FileOutputStream saveFileSub = new FileOutputStream(SaveFile);
	ObjectOutputStream save = new ObjectOutputStream(saveFileSub);
	

	save.close();
	}
	catch(Exception exc){
	exc.printStackTrace();
	}
	}
}
