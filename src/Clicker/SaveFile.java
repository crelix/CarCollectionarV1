package Clicker;

import java.io.*;

public class SaveFile{
	
	MainHolder CarMain = new MainHolder();
    BoxesHolder Box = new BoxesHolder();
    FramesHolder CarFrame = new FramesHolder();
    PartHolder Part = new PartHolder();
    CarLevel1Holder CarsLv1 = new CarLevel1Holder();
    CarLevel2Holder CarsLv2 = new CarLevel2Holder();
    CarLevel3Holder CarsLv3 = new CarLevel3Holder();
    CarLevel4Holder CarsLv4 = new CarLevel4Holder();
    CarLevel5Holder CarsLv5 = new CarLevel5Holder();
    CarLevel6Holder CarsLv6 = new CarLevel6Holder();
    CarLevel7Holder CarsLv7 = new CarLevel7Holder();
    CarLevel8Holder CarsLv8 = new CarLevel8Holder();
    CarLevel9Holder CarsLv9 = new CarLevel9Holder();
    CarLevel10Holder CarsLv10 = new CarLevel10Holder();
    {
try{
	File SaveFile = new File("SaveFile.sav");
	if(!SaveFile.exists()) {
	    SaveFile.createNewFile();
	} 
	FileOutputStream saveFileSub = new FileOutputStream(SaveFile);
	ObjectOutputStream save = new ObjectOutputStream(saveFileSub);
	
	save.writeObject(CarMain.main);
	save.writeObject(Box.boxes);
	save.writeObject(CarFrame.frames);
	save.writeObject(Part.parts);
	save.writeObject(CarsLv1.cars);
	save.writeObject(CarsLv2.cars);
	save.writeObject(CarsLv3.cars);
	save.writeObject(CarsLv4.cars);
	save.writeObject(CarsLv5.cars);
	save.writeObject(CarsLv6.cars);
	save.writeObject(CarsLv7.cars);
	save.writeObject(CarsLv8.cars);
	save.writeObject(CarsLv9.cars);
	save.writeObject(CarsLv10.cars);
	
	save.close();
	}
	catch(Exception exc){
	exc.printStackTrace();
	}
	}
}