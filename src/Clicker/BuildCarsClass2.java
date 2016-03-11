package Clicker;

import java.awt.event.*;
import javax.swing.*;

public class BuildCarsClass2 implements ActionListener {

    JButton jbtnBuildCarLv6 = new JButton("Build");
    JButton jbtnBuildCarLv7 = new JButton("Build");
    JButton jbtnBuildCarLv8 = new JButton("Build");
    JButton jbtnBuildCarLv9 = new JButton("Build");
    JButton jbtnBuildCarLv10 = new JButton("Build");

	MainHolder CarMain = new MainHolder();
	ImagesHolder ImagesHolder = new ImagesHolder();
    BoxesHolder Box = new BoxesHolder();
    FramesHolder CarFrame = new FramesHolder();
    PartHolder Part = new PartHolder();
	CarLevel6Holder CarsLv6 = new CarLevel6Holder(); 
	CarLevel7Holder CarsLv7 = new CarLevel7Holder(); 
	CarLevel8Holder CarsLv8 = new CarLevel8Holder(); 
	CarLevel9Holder CarsLv9 = new CarLevel9Holder(); 
	CarLevel10Holder CarsLv10 = new CarLevel10Holder();
	
	public BuildCarsClass2(){
		
        jbtnBuildCarLv6.addActionListener(this);
        jbtnBuildCarLv7.addActionListener(this);
        jbtnBuildCarLv8.addActionListener(this);
        jbtnBuildCarLv9.addActionListener(this);
        jbtnBuildCarLv10.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource() == jbtnBuildCarLv6){
		    	if(CarMain.main[5] >=6){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[11] >0){
		    				if(Part.parts[131] >0){
		    					if(Part.parts[133] >0){
		    						if(Part.parts[135] >0){
		    							if(Part.parts[137] >0){
		    								if(Part.parts[139] >0){
		    									if(Part.parts[141] >0){
		    										if(Part.parts[143] >0){
		    											if(Part.parts[145] >0){
		    												if(Part.parts[147] >0){
		    													if(Part.parts[149] >0){
		    														if(Part.parts[151] >0){
		    															if(Part.parts[153] >0){
		    																if(Part.parts[155] >0){
		    																	int level6carticker= 3;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		for(int i=131; i <=155; i +=2){
		    																			Part.parts[i] --;
		    																		}
		    																	//	Part.parts[131] = Part.parts[131] - 1;
		    																	//	Part.parts[133] = Part.parts[133] - 1;
		    																	//	Part.parts[135] = Part.parts[135] - 1;
		    																	//	Part.parts[137] = Part.parts[137] - 1;
		    																	//	Part.parts[139] = Part.parts[139] - 1;
		    																	//	Part.parts[141] = Part.parts[141] - 1;
		    																	//	Part.parts[143] = Part.parts[143] - 1;
		    																	//	Part.parts[145] = Part.parts[145] - 1;
		    																	//	Part.parts[147] = Part.parts[147] - 1;
		    																	//	Part.parts[149] = Part.parts[149] - 1;
		    																	//	Part.parts[151] = Part.parts[151] - 1;
		    																	//	Part.parts[153] = Part.parts[153] - 1;
		    																	//	Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[3]); skaitlis+=1; 
		    																		CarsLv6.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Phantom", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_PhantomIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Toyota 86!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_86Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained BMW e70!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e70Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Voyager!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_VoyagerIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce PhantomIII!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_PhantomIIIIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Honda CRX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_CRXIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Subaru 1000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_1000Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac Eldorado!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_EldoradoIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover Freelander!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_FreelanderIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Renault_Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_SpiderIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Gaz 21!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Gaz_21Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Acura EL!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_ELIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Veyron!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_VeyronIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz SL600!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_SL600Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Silver!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_SilverIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mini Paceman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_PacemanIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai Excel!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_ExcelIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Gaz 24!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Gaz_24Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 107!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_107Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = CarFrame.frames[11] - 1;
		    																		Part.parts[131] = Part.parts[131] - 1;
		    																		Part.parts[133] = Part.parts[133] - 1;
		    																		Part.parts[135] = Part.parts[135] - 1;
		    																		Part.parts[137] = Part.parts[137] - 1;
		    																		Part.parts[139] = Part.parts[139] - 1;
		    																		Part.parts[141] = Part.parts[141] - 1;
		    																		Part.parts[143] = Part.parts[143] - 1;
		    																		Part.parts[145] = Part.parts[145] - 1;
		    																		Part.parts[147] = Part.parts[147] - 1;
		    																		Part.parts[149] = Part.parts[149] - 1;
		    																		Part.parts[151] = Part.parts[151] - 1;
		    																		Part.parts[153] = Part.parts[153] - 1;
		    																		Part.parts[155] = Part.parts[155] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi_A4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_A4Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 6 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
		    																}
		    															}
		    															else{
		    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    								                        	}
		    														}
		    														else{
		    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    							                        	}
		    													}
		    													else{
		    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    						                        	}
		    												}
		    												else{
		    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    					                        	}
		    											}
		    											else{
		    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    				                        	}
		    										}
		    										else{
		    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    			                        	}
		    									}
		    									else{
		    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    		                        	}
		    								}
		    								else{
		    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    	                        	}
		    							}
		    							else{
		                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                            	}
		    						}
		    						else{
		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                        	}
		    					}
		    					else{
		                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                    	}
		    				}
		    				else{
		                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                	}
		    			}
		    			else{
		            		JOptionPane.showMessageDialog (null, "You don't have 6 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
		            	}
		    		}
		    		else{
		        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		        	}
		    	}
		    	else{
		    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
		    	}
		    }
		    if(ae.getSource() == jbtnBuildCarLv7){
		    	if(CarMain.main[5] >=7){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[13] >0){
		    				if(Part.parts[157] >0){
		    					if(Part.parts[159] >0){
		    						if(Part.parts[161] >0){
		    							if(Part.parts[163] >0){
		    								if(Part.parts[165] >0){
		    									if(Part.parts[167] >0){
		    										if(Part.parts[169] >0){
		    											if(Part.parts[171] >0){
		    												if(Part.parts[173] >0){
		    													if(Part.parts[175] >0){
		    														if(Part.parts[177] >0){
		    															if(Part.parts[179] >0){
		    																if(Part.parts[181] >0){
		    																	int level7carticker= 3;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[3]); skaitlis+=1; 
		    																		CarsLv7.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini Aventador", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_AventadorIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Nissan 350z", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_350zIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar XJ6", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_XJ6Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Renault Clio", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_ClioIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Toyota Avensis", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_AvensisIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Outback", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_OutbackIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Saab 900", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_900Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Opel Vectra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_VectraIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Charger", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_ChargerIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari_348", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_348Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai XG", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_XGIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lexus RX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_RXIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Dodge 400", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_400Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained GMC Terrain", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_TerrainIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volvo C70", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_C70Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ford_Sierra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_SierraIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Impreza", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_ImprezaIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained BMW e90", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e90Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Nissan Skyline", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_SkylineIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = CarFrame.frames[13] - 1;
		    																		Part.parts[157] = Part.parts[157] - 1;
		    																		Part.parts[159] = Part.parts[159] - 1;
		    																		Part.parts[161] = Part.parts[161] - 1;
		    																		Part.parts[163] = Part.parts[163] - 1;
		    																		Part.parts[165] = Part.parts[165] - 1;
		    																		Part.parts[167] = Part.parts[167] - 1;
		    																		Part.parts[169] = Part.parts[169] - 1;
		    																		Part.parts[171] = Part.parts[171] - 1;
		    																		Part.parts[173] = Part.parts[173] - 1;
		    																		Part.parts[175] = Part.parts[175] - 1;
		    																		Part.parts[177] = Part.parts[177] - 1;
		    																		Part.parts[179] = Part.parts[179] - 1;
		    																		Part.parts[181] = Part.parts[181] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi Q7", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_Q7Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 7 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
		    																}
		    															}
		    															else{
		    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    								                        	}
		    														}
		    														else{
		    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    							                        	}
		    													}
		    													else{
		    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    						                        	}
		    												}
		    												else{
		    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    					                        	}
		    											}
		    											else{
		    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    				                        	}
		    										}
		    										else{
		    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    			                        	}
		    									}
		    									else{
		    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    		                        	}
		    								}
		    								else{
		    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    	                        	}
		    							}
		    							else{
		                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                            	}
		    						}
		    						else{
		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                        	}
		    					}
		    					else{
		                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                    	}
		    				}
		    				else{
		                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                	}
		    			}
		    			else{
		            		JOptionPane.showMessageDialog (null, "You don't have 7 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
		            	}
		    		}
		    		else{
		        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		        	}
		    	}
		    	else{
		    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
		    	}
		    }
		    if(ae.getSource() == jbtnBuildCarLv8){
		    	if(CarMain.main[5] >=8){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[15] >0){
		    				if(Part.parts[183] >0){
		    					if(Part.parts[185] >0){
		    						if(Part.parts[187] >0){
		    							if(Part.parts[189] >0){
		    								if(Part.parts[191] >0){
		    									if(Part.parts[193] >0){
		    										if(Part.parts[195] >0){
		    											if(Part.parts[197] >0){
		    												if(Part.parts[199] >0){
		    													if(Part.parts[201] >0){
		    														if(Part.parts[203] >0){
		    															if(Part.parts[205] >0){
		    																if(Part.parts[207] >0){
		    																	int level8carticker= 3;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[3]); skaitlis+=1; 
		    																		CarsLv8.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bentley Arnage", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_ArnageIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volvo 850", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_850Icon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Toyota Rav4", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_Rav4Icon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ford Focus", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_FocusIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Spin", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_SpinIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bentley GTZ", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_GTZIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lexus LS", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_LSIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover RangeRover", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_RangeRoverIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lexus GX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_GXIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jeep Wrangler", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_WranglerIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Maserati GranTurismo", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_GranTurismoIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Agera", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_AgeraIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Acura MDX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_MDXIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi RS6", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_RS6Icon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac DeVille", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_DeVilleIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained McLaren Veneno", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_VenenoIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Tesla X", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_XIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz G55", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_G55Icon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Lybra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_LybraIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = CarFrame.frames[15] - 1;
		    																		Part.parts[183] = Part.parts[183] - 1;
		    																		Part.parts[185] = Part.parts[185] - 1;
		    																		Part.parts[187] = Part.parts[187] - 1;
		    																		Part.parts[189] = Part.parts[189] - 1;
		    																		Part.parts[191] = Part.parts[191] - 1;
		    																		Part.parts[193] = Part.parts[193] - 1;
		    																		Part.parts[195] = Part.parts[195] - 1;
		    																		Part.parts[197] = Part.parts[197] - 1;
		    																		Part.parts[199] = Part.parts[199] - 1;
		    																		Part.parts[201] = Part.parts[201] - 1;
		    																		Part.parts[203] = Part.parts[203] - 1;
		    																		Part.parts[205] = Part.parts[205] - 1;
		    																		Part.parts[207] = Part.parts[207] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1;
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti QX60", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_QX60Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 8 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
		    																}
		    															}
		    															else{
		    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    								                        	}
		    														}
		    														else{
		    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    							                        	}
		    													}
		    													else{
		    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    						                        	}
		    												}
		    												else{
		    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    					                        	}
		    											}
		    											else{
		    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    				                        	}
		    										}
		    										else{
		    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    			                        	}
		    									}
		    									else{
		    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    		                        	}
		    								}
		    								else{
		    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    	                        	}
		    							}
		    							else{
		                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                            	}
		    						}
		    						else{
		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                        	}
		    					}
		    					else{
		                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                    	}
		    				}
		    				else{
		                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                	}
		    			}
		    			else{
		            		JOptionPane.showMessageDialog (null, "You don't have 8 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
		            	}
		    		}
		    		else{
		        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		        	}
		    	}
		    	else{
		    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
		    	}
		    }
		    if(ae.getSource() == jbtnBuildCarLv9){
		    	if(CarMain.main[5] >=9){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[17] >0){
		    				if(Part.parts[209] >0){
		    					if(Part.parts[211] >0){
		    						if(Part.parts[213] >0){
		    							if(Part.parts[215] >0){
		    								if(Part.parts[217] >0){
		    									if(Part.parts[219] >0){
		    										if(Part.parts[221] >0){
		    											if(Part.parts[223] >0){
		    												if(Part.parts[225] >0){
		    													if(Part.parts[227] >0){
		    														if(Part.parts[229] >0){
		    															if(Part.parts[231] >0){
		    																if(Part.parts[233] >0){
		    																	int level9carticker= 3;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[3]); skaitlis+=1; 
		    																		CarsLv9.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Kia Forte", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_ForteIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Voyager", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_VoyagerIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Porsche_Cayenne", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_CayenneIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained McLaren_650s", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_650sIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar E-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_E_TypeIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 601", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_601Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar F-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_F_TypeIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Fiat Doblo", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_DobloIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Vaz 2101", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_2101Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained McLaren P1", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_P1Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 405", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_405Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained GMC Envoy", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_EnvoyIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Corvete", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_CorveteIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Pagani Huayra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Pagani_HuayraIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 402", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_402Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 159", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_159Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Renault Fregate", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_FregateIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mini Cooper", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_CooperIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Dodge Viper", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_ViperIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = CarFrame.frames[17] - 1;
		    																		Part.parts[209] = Part.parts[209] - 1;
		    																		Part.parts[211] = Part.parts[211] - 1;
		    																		Part.parts[213] = Part.parts[213] - 1;
		    																		Part.parts[215] = Part.parts[215] - 1;
		    																		Part.parts[217] = Part.parts[217] - 1;
		    																		Part.parts[219] = Part.parts[219] - 1;
		    																		Part.parts[221] = Part.parts[221] - 1;
		    																		Part.parts[223] = Part.parts[223] - 1;
		    																		Part.parts[225] = Part.parts[225] - 1;
		    																		Part.parts[227] = Part.parts[227] - 1;
		    																		Part.parts[229] = Part.parts[229] - 1;
		    																		Part.parts[231] = Part.parts[231] - 1;
		    																		Part.parts[233] = Part.parts[233] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1;
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Vaz Niva", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_NivaIcon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 9 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
		    																}
		    															}
		    															else{
		    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    								                        	}
		    														}
		    														else{
		    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    							                        	}
		    													}
		    													else{
		    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    						                        	}
		    												}
		    												else{
		    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    					                        	}
		    											}
		    											else{
		    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    				                        	}
		    										}
		    										else{
		    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    			                        	}
		    									}
		    									else{
		    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    		                        	}
		    								}
		    								else{
		    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    	                        	}
		    							}
		    							else{
		                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                            	}
		    						}
		    						else{
		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                        	}
		    					}
		    					else{
		                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                    	}
		    				}
		    				else{
		                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                	}
		    			}
		    			else{
		            		JOptionPane.showMessageDialog (null, "You don't have 9 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
		            	}
		    		}
		    		else{
		        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		        	}
		    	}
		    	else{
		    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
		    	}
		    }
		    if(ae.getSource() == jbtnBuildCarLv10){
		    	if(CarMain.main[5] >=10){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[19] >0){
		    				if(Part.parts[235] >0){
		    					if(Part.parts[237] >0){
		    						if(Part.parts[239] >0){
		    							if(Part.parts[241] >0){
		    								if(Part.parts[243] >0){
		    									if(Part.parts[245] >0){
		    										if(Part.parts[247] >0){
		    											if(Part.parts[249] >0){
		    												if(Part.parts[251] >0){
		    													if(Part.parts[253] >0){
		    														if(Part.parts[255] >0){
		    															if(Part.parts[257] >0){
		    																if(Part.parts[259] >0){
		    																	int level10carticker= 3;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[3]); skaitlis+=1; 
		    																		CarsLv10.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar X-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_X_TypeIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari 308", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_308Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mazda 626", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_626Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Maserati Shamal", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_ShamalIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Nissan 240sx", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_240sxIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 4C", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_4CIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Nissan Juke", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_JukeIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Golf1", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_Golf1Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jeep Gladiator", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_GladiatorIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Dodge Matador", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_MatadorIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Royale", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_RoyaleIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Citroen CX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_CXIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini 350GT", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_350GTIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi GTO", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_GTOIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Buick Invicta", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_InvictaIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Porsche 911", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_911Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Forester", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_ForesterIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Citroen BX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_BXIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Type252", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_Type252Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = CarFrame.frames[19] - 1;
		    																		Part.parts[235] = Part.parts[235] - 1;
		    																		Part.parts[237] = Part.parts[237] - 1;
		    																		Part.parts[239] = Part.parts[239] - 1;
		    																		Part.parts[241] = Part.parts[241] - 1;
		    																		Part.parts[243] = Part.parts[243] - 1;
		    																		Part.parts[245] = Part.parts[245] - 1;
		    																		Part.parts[247] = Part.parts[247] - 1;
		    																		Part.parts[249] = Part.parts[249] - 1;
		    																		Part.parts[251] = Part.parts[251] - 1;
		    																		Part.parts[253] = Part.parts[253] - 1;
		    																		Part.parts[255] = Part.parts[255] - 1;
		    																		Part.parts[257] = Part.parts[257] - 1;
		    																		Part.parts[259] = Part.parts[259] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1;
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari 488", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_488Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 10 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
		    																}
		    															}
		    															else{
		    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    								                        	}
		    														}
		    														else{
		    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    							                        	}
		    													}
		    													else{
		    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    						                        	}
		    												}
		    												else{
		    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    					                        	}
		    											}
		    											else{
		    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    				                        	}
		    										}
		    										else{
		    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    			                        	}
		    									}
		    									else{
		    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    		                        	}
		    								}
		    								else{
		    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		    	                        	}
		    							}
		    							else{
		                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                            	}
		    						}
		    						else{
		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                        	}
		    					}
		    					else{
		                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                    	}
		    				}
		    				else{
		                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
		                	}
		    			}
		    			else{
		            		JOptionPane.showMessageDialog (null, "You don't have 10 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
		            	}
		    		}
		    		else{
		        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		        	}
		    	}
		    	else{
		    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
		    	}
		    }
		}
		
		
	}
