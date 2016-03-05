package Clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PoguKlase implements ActionListener {

	JButton jbtnBuildCarLv1 = new JButton("Build");
	
	ClickerGame CG =new ClickerGame();
	CarLevel1Holder CarsLv1 = new CarLevel1Holder(); 
	public PoguKlase(){
		
		jbtnBuildCarLv1.addActionListener(this);
	}

	
	//JAZVEIDO ARRAY cita faila klase LAI VARETU PIEKLUT pie PARTIEM
	//Taka masinu array ar tadu pasu sistemu jaizveido
	//TAD VARETU IZBRAUKT caur viniem mierigi man liekas ar for loop
	//taagd radas error ka null pointer
	
	//Ja izveidotu to array partiem tad kods saisinatos minimums pa 200 linijam manliekas
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jbtnBuildCarLv1){
			System.out.println("TEST");
	    	if(CG.CarMain.PlayerLevel >=1){
	    		System.out.println("TEST");
	    		if(CG.Garage.GarageSlots >0){
	    			if(CG.CarFrame.FrameLv1.FrameCount >0){
	    				if(CG.Part.AccessoriesLv1.PartCount >0){
	    					if(CG.Part.BodyLv1.PartCount >0){
	    						if(CG.Part.BrakesLv1.PartCount >0){
	    							if(CG.Part.CoolingLv1.PartCount >0){
	    								if(CG.Part.ElectronicsLv1.PartCount >0){
	    									if(CG.Part.EngineLv1.PartCount >0){
	    										if(CG.Part.ExaustLv1.PartCount >0){
	    											if(CG.Part.FuelLv1.PartCount >0){
	    												if(CG.Part.InteriorLv1.PartCount >0){
	    													if(CG.Part.SteeringLv1.PartCount >0){
	    														if(CG.Part.SuspensionLv1.PartCount >0){
	    															if(CG.Part.TransmissionLv1.PartCount >0){
	    																if(CG.Part.TiresLv1.PartCount >0){
	    																	int level1carticker= 3; //Skaita pa +4 lai atkal nesajauktos arraya, jo ja panems cita array vinibu tad atkal bus pilns ar erroriem
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){   //Penem no array String un to parvest pa int un nochecko vai 0       																		CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[3]); skaitlis+=1; //Panem no array cars 3 value un ieliek to private int  pec tam pieskaita pie count +1 
	    																		CarsLv1.cars[3] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
	    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Aston_Martin_DB9Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){ //Penem no array String un to parvest pa int un nochecko vai 0 
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; //Panem no array cars 7 value un ieliek to private int  pec tam pieskaita pie count +1 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
	    																		JOptionPane.showMessageDialog (null, "You have gained Acura NSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE,CG.Acura_NSXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; //Panem no array cars 7 value un ieliek to private int  pec tam pieskaita pie count +1 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
	    																		JOptionPane.showMessageDialog (null, "You have gained Ford Mustang!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Ford_MustangIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 412!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Moskvich_412Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Kia Venga!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Kia_VengaIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Fiat 1500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Fiat_1500Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari Enzo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Ferrari_EnzoIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin Rapide!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Aston_Martin_RapideIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg CCX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Koenigsegg_CCXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker])  == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Honda Civic!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Honda_CivicIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac ATS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Cadilliac_ATSIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Lancer Evolution X!", "Congralations", JOptionPane.INFORMATION_MESSAGE,CG.Mitsubishi_LancerEvolutionXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti FX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Infiniti_FXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Thema!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Lancia_ThemaIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Volvo XC90!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Volvo_XC90Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Acura CSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Acura_CSXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Saab Sonett II!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Saab_SonettIIIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Renault Floride!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Renault_FlorideIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained BMW e34!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.BMW_e34Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CG.CarFrame.FrameLv1.FrameCount -=1;
	    																		CG.Part.AccessoriesLv1.PartCount -=1;
	    																		CG.Part.BodyLv1.PartCount -=1;
	    																		CG.Part.BrakesLv1.PartCount -=1;
	    																		CG.Part.CoolingLv1.PartCount -=1;
	    																		CG.Part.ElectronicsLv1.PartCount -=1;
	    																		CG.Part.EngineLv1.PartCount -=1;
	    																		CG.Part.ExaustLv1.PartCount -=1;
	    																		CG.Part.FuelLv1.PartCount -=1;
	    																		CG.Part.InteriorLv1.PartCount -=1;
	    																		CG.Part.SteeringLv1.PartCount -=1;
	    																		CG.Part.SuspensionLv1.PartCount -=1;
	    																		CG.Part.TransmissionLv1.PartCount -=1;
	    																		CG.Part.TiresLv1.PartCount -=1;
	    																		CG.Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Cordoba!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Chrysler_CordobaIcon);
	    																	}
	    																}
	    																else{
	    																	JOptionPane.showMessageDialog(null, "You have colected all 1 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.MaxUpgradeIcon);
	    																}
	    															}
	    															else{
	    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	    								                        	}
	    														}
	    														else{
	    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	    							                        	}
	    													}
	    													else{
	    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	    						                        	}
	    												}
	    												else{
	    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	    					                        	}
	    											}
	    											else{
	    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	    				                        	}
	    										}
	    										else{
	    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	    			                        	}
	    									}
	    									else{
	    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	    		                        	}
	    								}
	    								else{
	    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	    	                        	}
	    							}
	    							else{
	                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	                            	}
	    						}
	    						else{
	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	                        	}
	    					}
	    					else{
	                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	                    	}
	    				}
	    				else{
	                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
	                	}
	    			}
	    			else{
	            		JOptionPane.showMessageDialog (null, "You don't have 1 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, CG.NoFrameIcon);
	            	}
	    		}
	    		else{
	        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, CG.NoGarageIcon);
	        	}
	    	}
	    	else{
	    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, CG.NoPlayerIcon);
	    	}
	    }
	    
		
	}

}
