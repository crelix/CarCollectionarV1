package Clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PoguKlase implements ActionListener {

	JButton jbtnBuildCarLv1 = new JButton("Build");
	
	public PoguKlase(){
		
		
		jbtnBuildCarLv1.addActionListener(this);
	}

	
	//JAZVEIDO ARRAY LAI VIEGLAK VARETU PIEKLUT pie PARTIEM
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jbtnBuildCarLv1){
	    	System.out.println("Test");
	    	if(CarMain.PlayerLevel >=1){
	    		if(Garage.GarageSlots >0){
	    			if(CarFrame.FrameLv1.FrameCount >0){
	    				if(Part.AccessoriesLv1.PartCount >0){
	    					if(Part.BodyLv1.PartCount >0){
	    						if(Part.BrakesLv1.PartCount >0){
	    							if(Part.CoolingLv1.PartCount >0){
	    								if(Part.ElectronicsLv1.PartCount >0){
	    									if(Part.EngineLv1.PartCount >0){
	    										if(Part.ExaustLv1.PartCount >0){
	    											if(Part.FuelLv1.PartCount >0){
	    												if(Part.InteriorLv1.PartCount >0){
	    													if(Part.SteeringLv1.PartCount >0){
	    														if(Part.SuspensionLv1.PartCount >0){
	    															if(Part.TransmissionLv1.PartCount >0){
	    																if(Part.TiresLv1.PartCount >0){
	    																	int level1carticker= 3; //Skaita pa +4 lai atkal nesajauktos arraya, jo ja panems cita array vinibu tad atkal bus pilns ar erroriem
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){   //Penem no array String un to parvest pa int un nochecko vai 0       																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[3]); skaitlis+=1; //Panem no array cars 3 value un ieliek to private int  pec tam pieskaita pie count +1 
	    																		CarsLv1.cars[3] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
	    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Aston_Martin_DB9Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){ //Penem no array String un to parvest pa int un nochecko vai 0 
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; //Panem no array cars 7 value un ieliek to private int  pec tam pieskaita pie count +1 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
	    																		JOptionPane.showMessageDialog (null, "You have gained Acura NSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Acura_NSXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; //Panem no array cars 7 value un ieliek to private int  pec tam pieskaita pie count +1 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
	    																		JOptionPane.showMessageDialog (null, "You have gained Ford Mustang!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ford_MustangIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 412!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Moskvich_412Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Kia Venga!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Kia_VengaIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Fiat 1500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Fiat_1500Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari Enzo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ferrari_EnzoIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin Rapide!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Aston_Martin_RapideIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg CCX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Koenigsegg_CCXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker])  == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Honda Civic!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Honda_CivicIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac ATS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Cadilliac_ATSIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Lancer Evolution X!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mitsubishi_LancerEvolutionXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti FX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Infiniti_FXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Thema!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lancia_ThemaIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Volvo XC90!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volvo_XC90Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Acura CSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Acura_CSXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Saab Sonett II!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Saab_SonettIIIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Renault Floride!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Renault_FlorideIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained BMW e34!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BMW_e34Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.FrameLv1.FrameCount -=1;
	    																		Part.AccessoriesLv1.PartCount -=1;
	    																		Part.BodyLv1.PartCount -=1;
	    																		Part.BrakesLv1.PartCount -=1;
	    																		Part.CoolingLv1.PartCount -=1;
	    																		Part.ElectronicsLv1.PartCount -=1;
	    																		Part.EngineLv1.PartCount -=1;
	    																		Part.ExaustLv1.PartCount -=1;
	    																		Part.FuelLv1.PartCount -=1;
	    																		Part.InteriorLv1.PartCount -=1;
	    																		Part.SteeringLv1.PartCount -=1;
	    																		Part.SuspensionLv1.PartCount -=1;
	    																		Part.TransmissionLv1.PartCount -=1;
	    																		Part.TiresLv1.PartCount -=1;
	    																		Garage.GarageSlots -=1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Cordoba!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chrysler_CordobaIcon);
	    																	}
	    																}
	    																else{
	    																	JOptionPane.showMessageDialog(null, "You have colected all 1 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
	    																}
	    															}
	    															else{
	    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	    								                        	}
	    														}
	    														else{
	    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	    							                        	}
	    													}
	    													else{
	    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	    						                        	}
	    												}
	    												else{
	    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	    					                        	}
	    											}
	    											else{
	    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	    				                        	}
	    										}
	    										else{
	    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	    			                        	}
	    									}
	    									else{
	    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	    		                        	}
	    								}
	    								else{
	    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	    	                        	}
	    							}
	    							else{
	                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	                            	}
	    						}
	    						else{
	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	                        	}
	    					}
	    					else{
	                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	                    	}
	    				}
	    				else{
	                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
	                	}
	    			}
	    			else{
	            		JOptionPane.showMessageDialog (null, "You don't have 1 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
	            	}
	    		}
	    		else{
	        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
	        	}
	    	}
	    	else{
	    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
	    	}
	    }
	    
		
	}

}
