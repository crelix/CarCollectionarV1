package Clicker;

import java.awt.event.*;
import javax.swing.*;

public class BuildCarsClass2 implements ActionListener {

    JButton jbtnBuildCarLv6 = new JButton("Build");
    JButton jbtnBuildCarLv7 = new JButton("Build");
    JButton jbtnBuildCarLv8 = new JButton("Build");
    JButton jbtnBuildCarLv9 = new JButton("Build");
    JButton jbtnBuildCarLv10 = new JButton("Build");
	
	ClickerGame CG =new ClickerGame();
	MainHolder CarMain = new MainHolder();
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
		    	if(Integer.parseInt(CarMain.main[5]) >=6){
		    		if(Integer.parseInt(CarMain.main[7]) >0){
		    			if(Integer.parseInt(CarFrame.frames[11]) >0){
		    				if(Integer.parseInt(Part.parts[131]) >0){
		    					if(Integer.parseInt(Part.parts[133]) >0){
		    						if(Integer.parseInt(Part.parts[135]) >0){
		    							if(Integer.parseInt(Part.parts[137]) >0){
		    								if(Integer.parseInt(Part.parts[139]) >0){
		    									if(Integer.parseInt(Part.parts[141]) >0){
		    										if(Integer.parseInt(Part.parts[143]) >0){
		    											if(Integer.parseInt(Part.parts[145]) >0){
		    												if(Integer.parseInt(Part.parts[147]) >0){
		    													if(Integer.parseInt(Part.parts[149]) >0){
		    														if(Integer.parseInt(Part.parts[151]) >0){
		    															if(Integer.parseInt(Part.parts[153]) >0){
		    																if(Integer.parseInt(Part.parts[155]) >0){
		    																	int level6carticker= 3;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[3]); skaitlis+=1; 
		    																		CarsLv6.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Phantom", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Rolls_Royce_PhantomIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Toyota 86!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Toyota_86Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained BMW e70!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.BMW_e70Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Voyager!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Chrysler_VoyagerIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce PhantomIII!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Rolls_Royce_PhantomIIIIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Honda CRX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Honda_CRXIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Subaru 1000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Subaru_1000Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac Eldorado!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Cadilliac_EldoradoIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover Freelander!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Land_Rover_FreelanderIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Renault_Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Renault_SpiderIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Gaz 21!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Gaz_21Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Acura EL!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Acura_ELIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Veyron!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Bugatti_VeyronIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz SL600!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Mercedes_Benz_SL600Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Silver!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Rolls_Royce_SilverIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mini Paceman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Mini_PacemanIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai Excel!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Hyundai_ExcelIcon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Gaz 24!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Gaz_24Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 107!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Peugeot_107Icon);
		    																	}
		    																	level6carticker+=4;
		    																	if(Integer.parseInt(CarsLv6.cars[level6carticker]) == 0){  
		    																		CarFrame.frames[11] = Integer.toString(Integer.parseInt(CarFrame.frames[11]) - 1);
		    																		Part.parts[131] = Integer.toString(Integer.parseInt(Part.parts[131]) - 1);
		    																		Part.parts[133] = Integer.toString(Integer.parseInt(Part.parts[133]) - 1);
		    																		Part.parts[135] = Integer.toString(Integer.parseInt(Part.parts[135]) - 1);
		    																		Part.parts[137] = Integer.toString(Integer.parseInt(Part.parts[137]) - 1);
		    																		Part.parts[139] = Integer.toString(Integer.parseInt(Part.parts[139]) - 1);
		    																		Part.parts[141] = Integer.toString(Integer.parseInt(Part.parts[141]) - 1);
		    																		Part.parts[143] = Integer.toString(Integer.parseInt(Part.parts[143]) - 1);
		    																		Part.parts[145] = Integer.toString(Integer.parseInt(Part.parts[145]) - 1);
		    																		Part.parts[147] = Integer.toString(Integer.parseInt(Part.parts[147]) - 1);
		    																		Part.parts[149] = Integer.toString(Integer.parseInt(Part.parts[149]) - 1);
		    																		Part.parts[151] = Integer.toString(Integer.parseInt(Part.parts[151]) - 1);
		    																		Part.parts[153] = Integer.toString(Integer.parseInt(Part.parts[153]) - 1);
		    																		Part.parts[155] = Integer.toString(Integer.parseInt(Part.parts[155]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv6.cars[level6carticker]); skaitlis+=1; 
		    																		CarsLv6.cars[level6carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi_A4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Audi_A4Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 6 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 6 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, CG.NoFrameIcon);
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
		    if(ae.getSource() == jbtnBuildCarLv7){
		    	if(Integer.parseInt(CarMain.main[5]) >=7){
		    		if(Integer.parseInt(CarMain.main[7]) >0){
		    			if(Integer.parseInt(CarFrame.frames[13]) >0){
		    				if(Integer.parseInt(Part.parts[157]) >0){
		    					if(Integer.parseInt(Part.parts[159]) >0){
		    						if(Integer.parseInt(Part.parts[161]) >0){
		    							if(Integer.parseInt(Part.parts[163]) >0){
		    								if(Integer.parseInt(Part.parts[165]) >0){
		    									if(Integer.parseInt(Part.parts[167]) >0){
		    										if(Integer.parseInt(Part.parts[169]) >0){
		    											if(Integer.parseInt(Part.parts[171]) >0){
		    												if(Integer.parseInt(Part.parts[173]) >0){
		    													if(Integer.parseInt(Part.parts[175]) >0){
		    														if(Integer.parseInt(Part.parts[177]) >0){
		    															if(Integer.parseInt(Part.parts[179]) >0){
		    																if(Integer.parseInt(Part.parts[181]) >0){
		    																	int level7carticker= 3;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[3]); skaitlis+=1; 
		    																		CarsLv7.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini Aventador", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Lamborghini_AventadorIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Nissan 350z", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Nissan_350zIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar XJ6", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Jaguar_XJ6Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Renault Clio", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Renault_ClioIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Toyota Avensis", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Toyota_AvensisIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Outback", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Subaru_OutbackIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Saab 900", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Saab_900Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Opel Vectra", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Opel_VectraIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Charger", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Chrysler_ChargerIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari_348", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Ferrari_348Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai XG", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Hyundai_XGIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lexus RX", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Lexus_RXIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Dodge 400", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Dodge_400Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained GMC Terrain", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.GMC_TerrainIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volvo C70", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Volvo_C70Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ford_Sierra", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Ford_SierraIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Impreza", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Subaru_ImprezaIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained BMW e90", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.BMW_e90Icon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Nissan Skyline", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Nissan_SkylineIcon);
		    																	}
		    																	level7carticker+=4;
		    																	if(Integer.parseInt(CarsLv7.cars[level7carticker]) == 0){  
		    																		CarFrame.frames[13] = Integer.toString(Integer.parseInt(CarFrame.frames[13]) - 1);
		    																		Part.parts[157] = Integer.toString(Integer.parseInt(Part.parts[157]) - 1);
		    																		Part.parts[159] = Integer.toString(Integer.parseInt(Part.parts[159]) - 1);
		    																		Part.parts[161] = Integer.toString(Integer.parseInt(Part.parts[161]) - 1);
		    																		Part.parts[163] = Integer.toString(Integer.parseInt(Part.parts[163]) - 1);
		    																		Part.parts[165] = Integer.toString(Integer.parseInt(Part.parts[165]) - 1);
		    																		Part.parts[167] = Integer.toString(Integer.parseInt(Part.parts[167]) - 1);
		    																		Part.parts[169] = Integer.toString(Integer.parseInt(Part.parts[169]) - 1);
		    																		Part.parts[171] = Integer.toString(Integer.parseInt(Part.parts[171]) - 1);
		    																		Part.parts[173] = Integer.toString(Integer.parseInt(Part.parts[173]) - 1);
		    																		Part.parts[175] = Integer.toString(Integer.parseInt(Part.parts[175]) - 1);
		    																		Part.parts[177] = Integer.toString(Integer.parseInt(Part.parts[177]) - 1);
		    																		Part.parts[179] = Integer.toString(Integer.parseInt(Part.parts[179]) - 1);
		    																		Part.parts[181] = Integer.toString(Integer.parseInt(Part.parts[181]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv7.cars[level7carticker]); skaitlis+=1; 
		    																		CarsLv7.cars[level7carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi Q7", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Audi_Q7Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 7 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 7 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, CG.NoFrameIcon);
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
		    if(ae.getSource() == jbtnBuildCarLv8){
		    	if(Integer.parseInt(CarMain.main[5]) >=8){
		    		if(Integer.parseInt(CarMain.main[7]) >0){
		    			if(Integer.parseInt(CarFrame.frames[15]) >0){
		    				if(Integer.parseInt(Part.parts[183]) >0){
		    					if(Integer.parseInt(Part.parts[185]) >0){
		    						if(Integer.parseInt(Part.parts[187]) >0){
		    							if(Integer.parseInt(Part.parts[189]) >0){
		    								if(Integer.parseInt(Part.parts[191]) >0){
		    									if(Integer.parseInt(Part.parts[193]) >0){
		    										if(Integer.parseInt(Part.parts[195]) >0){
		    											if(Integer.parseInt(Part.parts[197]) >0){
		    												if(Integer.parseInt(Part.parts[199]) >0){
		    													if(Integer.parseInt(Part.parts[201]) >0){
		    														if(Integer.parseInt(Part.parts[203]) >0){
		    															if(Integer.parseInt(Part.parts[205]) >0){
		    																if(Integer.parseInt(Part.parts[207]) >0){
		    																	int level8carticker= 3;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[3]); skaitlis+=1; 
		    																		CarsLv8.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bentley Arnage", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Bentley_ArnageIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volvo 850", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Volvo_850Icon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Toyota Rav4", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Toyota_Rav4Icon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ford Focus", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Ford_FocusIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Spin", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Chevrolet_SpinIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bentley GTZ", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Bentley_GTZIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lexus LS", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Lexus_LSIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover RangeRover", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Land_Rover_RangeRoverIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lexus GX", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Lexus_GXIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jeep Wrangler", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Jeep_WranglerIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Maserati GranTurismo", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Maserati_GranTurismoIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Agera", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Koenigsegg_AgeraIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Acura MDX", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Acura_MDXIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi RS6", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Audi_RS6Icon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac DeVille", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Cadilliac_DeVilleIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained McLaren Veneno", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.McLaren_VenenoIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Tesla X", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Tesla_XIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz G55", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Mercedes_Benz_G55Icon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Lybra", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Lancia_LybraIcon);
		    																	}
		    																	level8carticker+=4;
		    																	if(Integer.parseInt(CarsLv8.cars[level8carticker]) == 0){  
		    																		CarFrame.frames[15] = Integer.toString(Integer.parseInt(CarFrame.frames[15]) - 1);
		    																		Part.parts[183] = Integer.toString(Integer.parseInt(Part.parts[183]) - 1);
		    																		Part.parts[185] = Integer.toString(Integer.parseInt(Part.parts[185]) - 1);
		    																		Part.parts[187] = Integer.toString(Integer.parseInt(Part.parts[187]) - 1);
		    																		Part.parts[189] = Integer.toString(Integer.parseInt(Part.parts[189]) - 1);
		    																		Part.parts[191] = Integer.toString(Integer.parseInt(Part.parts[191]) - 1);
		    																		Part.parts[193] = Integer.toString(Integer.parseInt(Part.parts[193]) - 1);
		    																		Part.parts[195] = Integer.toString(Integer.parseInt(Part.parts[195]) - 1);
		    																		Part.parts[197] = Integer.toString(Integer.parseInt(Part.parts[197]) - 1);
		    																		Part.parts[199] = Integer.toString(Integer.parseInt(Part.parts[199]) - 1);
		    																		Part.parts[201] = Integer.toString(Integer.parseInt(Part.parts[201]) - 1);
		    																		Part.parts[203] = Integer.toString(Integer.parseInt(Part.parts[203]) - 1);
		    																		Part.parts[205] = Integer.toString(Integer.parseInt(Part.parts[205]) - 1);
		    																		Part.parts[207] = Integer.toString(Integer.parseInt(Part.parts[207]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv8.cars[level8carticker]); skaitlis+=1; 
		    																		CarsLv8.cars[level8carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti QX60", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Infiniti_QX60Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 8 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 8 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, CG.NoFrameIcon);
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
		    if(ae.getSource() == jbtnBuildCarLv9){
		    	if(Integer.parseInt(CarMain.main[5]) >=9){
		    		if(Integer.parseInt(CarMain.main[7]) >0){
		    			if(Integer.parseInt(CarFrame.frames[17]) >0){
		    				if(Integer.parseInt(Part.parts[209]) >0){
		    					if(Integer.parseInt(Part.parts[211]) >0){
		    						if(Integer.parseInt(Part.parts[213]) >0){
		    							if(Integer.parseInt(Part.parts[215]) >0){
		    								if(Integer.parseInt(Part.parts[217]) >0){
		    									if(Integer.parseInt(Part.parts[219]) >0){
		    										if(Integer.parseInt(Part.parts[221]) >0){
		    											if(Integer.parseInt(Part.parts[223]) >0){
		    												if(Integer.parseInt(Part.parts[225]) >0){
		    													if(Integer.parseInt(Part.parts[227]) >0){
		    														if(Integer.parseInt(Part.parts[229]) >0){
		    															if(Integer.parseInt(Part.parts[231]) >0){
		    																if(Integer.parseInt(Part.parts[233]) >0){
		    																	int level9carticker= 3;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[3]); skaitlis+=1; 
		    																		CarsLv9.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Kia Forte", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Kia_ForteIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Voyager", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Lancia_VoyagerIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Porsche_Cayenne", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Porsche_CayenneIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained McLaren_650s", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.McLaren_650sIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar E-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Jaguar_E_TypeIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 601", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Peugeot_601Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar F-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Jaguar_F_TypeIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Fiat Doblo", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Fiat_DobloIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Vaz 2101", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Vaz_2101Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained McLaren P1", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.McLaren_P1Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 405", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Peugeot_405Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained GMC Envoy", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.GMC_EnvoyIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Corvete", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Chevrolet_CorveteIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Pagani Huayra", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Pagani_HuayraIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 402", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Moskvich_402Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 159", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Alfa_Romeo_159Icon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Renault Fregate", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Renault_FregateIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mini Cooper", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Mini_CooperIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Dodge Viper", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Dodge_ViperIcon);
		    																	}
		    																	level9carticker+=4;
		    																	if(Integer.parseInt(CarsLv9.cars[level9carticker]) == 0){  
		    																		CarFrame.frames[17] = Integer.toString(Integer.parseInt(CarFrame.frames[17]) - 1);
		    																		Part.parts[209] = Integer.toString(Integer.parseInt(Part.parts[209]) - 1);
		    																		Part.parts[211] = Integer.toString(Integer.parseInt(Part.parts[211]) - 1);
		    																		Part.parts[213] = Integer.toString(Integer.parseInt(Part.parts[213]) - 1);
		    																		Part.parts[215] = Integer.toString(Integer.parseInt(Part.parts[215]) - 1);
		    																		Part.parts[217] = Integer.toString(Integer.parseInt(Part.parts[217]) - 1);
		    																		Part.parts[219] = Integer.toString(Integer.parseInt(Part.parts[219]) - 1);
		    																		Part.parts[221] = Integer.toString(Integer.parseInt(Part.parts[221]) - 1);
		    																		Part.parts[223] = Integer.toString(Integer.parseInt(Part.parts[223]) - 1);
		    																		Part.parts[225] = Integer.toString(Integer.parseInt(Part.parts[225]) - 1);
		    																		Part.parts[227] = Integer.toString(Integer.parseInt(Part.parts[227]) - 1);
		    																		Part.parts[229] = Integer.toString(Integer.parseInt(Part.parts[229]) - 1);
		    																		Part.parts[231] = Integer.toString(Integer.parseInt(Part.parts[231]) - 1);
		    																		Part.parts[233] = Integer.toString(Integer.parseInt(Part.parts[233]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv9.cars[level9carticker]); skaitlis+=1; 
		    																		CarsLv9.cars[level9carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Vaz Niva", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Vaz_NivaIcon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 9 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 9 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, CG.NoFrameIcon);
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
		    if(ae.getSource() == jbtnBuildCarLv10){
		    	if(Integer.parseInt(CarMain.main[5]) >=10){
		    		if(Integer.parseInt(CarMain.main[7]) >0){
		    			if(Integer.parseInt(CarFrame.frames[19]) >0){
		    				if(Integer.parseInt(Part.parts[235]) >0){
		    					if(Integer.parseInt(Part.parts[237]) >0){
		    						if(Integer.parseInt(Part.parts[239]) >0){
		    							if(Integer.parseInt(Part.parts[241]) >0){
		    								if(Integer.parseInt(Part.parts[243]) >0){
		    									if(Integer.parseInt(Part.parts[245]) >0){
		    										if(Integer.parseInt(Part.parts[247]) >0){
		    											if(Integer.parseInt(Part.parts[249]) >0){
		    												if(Integer.parseInt(Part.parts[251]) >0){
		    													if(Integer.parseInt(Part.parts[253]) >0){
		    														if(Integer.parseInt(Part.parts[255]) >0){
		    															if(Integer.parseInt(Part.parts[257]) >0){
		    																if(Integer.parseInt(Part.parts[259]) >0){
		    																	int level10carticker= 3;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[3]); skaitlis+=1; 
		    																		CarsLv10.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar X-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Jaguar_X_TypeIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari 308", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Ferrari_308Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mazda 626", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Mazda_626Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Maserati Shamal", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Maserati_ShamalIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Nissan 240sx", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Nissan_240sxIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 4C", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Alfa_Romeo_4CIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Nissan Juke", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Nissan_JukeIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Golf1", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Volkswagen_Golf1Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jeep Gladiator", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Jeep_GladiatorIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Dodge Matador", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Dodge_MatadorIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Royale", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Bugatti_RoyaleIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Citroen CX", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Citroen_CXIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini 350GT", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Lamborghini_350GTIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi GTO", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Mitsubishi_GTOIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Buick Invicta", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Buick_InvictaIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Porsche 911", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Porsche_911Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Forester", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Subaru_ForesterIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Citroen BX", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Citroen_BXIcon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Type252", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Bugatti_Type252Icon);
		    																	}
		    																	level10carticker+=4;
		    																	if(Integer.parseInt(CarsLv10.cars[level10carticker]) == 0){  
		    																		CarFrame.frames[19] = Integer.toString(Integer.parseInt(CarFrame.frames[19]) - 1);
		    																		Part.parts[235] = Integer.toString(Integer.parseInt(Part.parts[235]) - 1);
		    																		Part.parts[237] = Integer.toString(Integer.parseInt(Part.parts[237]) - 1);
		    																		Part.parts[239] = Integer.toString(Integer.parseInt(Part.parts[239]) - 1);
		    																		Part.parts[241] = Integer.toString(Integer.parseInt(Part.parts[241]) - 1);
		    																		Part.parts[243] = Integer.toString(Integer.parseInt(Part.parts[243]) - 1);
		    																		Part.parts[245] = Integer.toString(Integer.parseInt(Part.parts[245]) - 1);
		    																		Part.parts[247] = Integer.toString(Integer.parseInt(Part.parts[247]) - 1);
		    																		Part.parts[249] = Integer.toString(Integer.parseInt(Part.parts[249]) - 1);
		    																		Part.parts[251] = Integer.toString(Integer.parseInt(Part.parts[251]) - 1);
		    																		Part.parts[253] = Integer.toString(Integer.parseInt(Part.parts[253]) - 1);
		    																		Part.parts[255] = Integer.toString(Integer.parseInt(Part.parts[255]) - 1);
		    																		Part.parts[257] = Integer.toString(Integer.parseInt(Part.parts[257]) - 1);
		    																		Part.parts[259] = Integer.toString(Integer.parseInt(Part.parts[259]) - 1);
		    																		CarMain.main[7] = Integer.toString(Integer.parseInt(CarMain.main[7]) - 1);
		    																		int skaitlis = 	Integer.parseInt(CarsLv10.cars[level10carticker]); skaitlis+=1; 
		    																		CarsLv10.cars[level10carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari 488", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Ferrari_488Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 10 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 10 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, CG.NoFrameIcon);
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
