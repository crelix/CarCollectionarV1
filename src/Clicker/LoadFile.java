package Clicker;

import java.io.*;

public class LoadFile {

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
			FileInputStream SaveFileSub = new FileInputStream(SaveFile);
			ObjectInputStream load = new ObjectInputStream(SaveFileSub);

			CarMain.main = (Integer[]) load.readObject();
			Box.boxes = (Integer[]) load.readObject();
			CarFrame.frames = (Integer[]) load.readObject();
			Part.parts = (Integer[]) load.readObject();
			CarsLv1.cars = (String[]) load.readObject();
			CarsLv2.cars = (String[]) load.readObject();
			CarsLv3.cars = (String[]) load.readObject();
			CarsLv4.cars = (String[]) load.readObject();
			CarsLv5.cars = (String[]) load.readObject();
			CarsLv6.cars = (String[]) load.readObject();
			CarsLv7.cars = (String[]) load.readObject();
			CarsLv8.cars = (String[]) load.readObject();
			CarsLv9.cars = (String[]) load.readObject();
			CarsLv10.cars = (String[]) load.readObject();
			
			load.close();
			}
			catch(Exception exc){
			exc.printStackTrace();
			}
			}
}
