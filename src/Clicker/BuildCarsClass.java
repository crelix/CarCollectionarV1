package Clicker;

import java.awt.event.*;
import javax.swing.*;

//   int skaits;
//    int skaits0 = 0;
//    
//    ClickerGame CG = new ClickerGame();
//	MainHolder CarMain = new MainHolder();
//    BoxesHolder Box = new BoxesHolder();
//    FramesHolder CarFrame = new FramesHolder();
//    PartHolder Part = new PartHolder();
//	CarLevel1Holder CarsLv1 = new CarLevel1Holder(); 
//	CarLevel2Holder CarsLv2 = new CarLevel2Holder(); 
//	CarLevel3Holder CarsLv3 = new CarLevel3Holder(); 
//	CarLevel4Holder CarsLv4 = new CarLevel4Holder(); 
//	CarLevel5Holder CarsLv5 = new CarLevel5Holder(); 
//	
//	public BuildCarsClass(){
//		
//		jbtnBuildCarLv1.addActionListener(this);
//        jbtnBuildCarLv2.addActionListener(this);
//        jbtnBuildCarLv3.addActionListener(this);
//        jbtnBuildCarLv4.addActionListener(this);
//        jbtnBuildCarLv5.addActionListener(this);
//        
//        for(int i=1;i <= 25;i+=2){
//			skaits+=1;
//		}
//	}
//
//	public void actionPerformed(ActionEvent ae) {
//		skaits=0;
//		if(ae.getSource() == jbtnBuildCarLv1){
//	    	if(CarMain.main[5] >=1){
//	    		if(CarMain.main[7] >0){
//	    			if(CarFrame.frames[1] >0){
//	    				
//	    				for(int i=1;i <= 25;i+=2){
//	    					if(Part.parts[i] >0){
//	    						skaits0+=1;
//	    					}else{
//	    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, CG.NoPartsIcon);
//	    					}
//						}
//					if (skaits0 == skaits){
//						for (int j =3;j  >= 80; j+=4){
//							if(Integer.parseInt(CarsLv1.cars[j]) == 0){
//								for(int i=1;i <= 25;i+=2){
//									Part.parts[i] --;
//								
//									int skaitlis = 	Integer.parseInt(CarsLv1.cars[3]); skaitlis+=1; 
//									CarsLv1.cars[j] = Integer.toString(skaitlis);
//									
//									if(j == 3){
//										JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Aston_Martin_DB9Icon);
//										
//									}else if(j ==7){
//										JOptionPane.showMessageDialog (null, "You have gained Acura NSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE,CG.Acura_NSXIcon);
//									}else if(j ==11){
//										JOptionPane.showMessageDialog (null, "You have gained Moskvich 412!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CG.Moskvich_412Icon);
//									}
//									
//									
//								}
//								
//							}
//						}
//					}
//	    			}}}}


public class BuildCarsClass implements ActionListener {

	JButton jbtnBuildCarLv1 = new JButton("Build");
    JButton jbtnBuildCarLv2 = new JButton("Build");
    JButton jbtnBuildCarLv3 = new JButton("Build");
    JButton jbtnBuildCarLv4 = new JButton("Build");
    JButton jbtnBuildCarLv5 = new JButton("Build");

	MainHolder CarMain = new MainHolder();
	ImagesHolder ImagesHolder = new ImagesHolder();
    BoxesHolder Box = new BoxesHolder();
    FramesHolder CarFrame = new FramesHolder();
    PartHolder Part = new PartHolder();
	CarLevel1Holder CarsLv1 = new CarLevel1Holder(); 
	CarLevel2Holder CarsLv2 = new CarLevel2Holder(); 
	CarLevel3Holder CarsLv3 = new CarLevel3Holder(); 
	CarLevel4Holder CarsLv4 = new CarLevel4Holder(); 
	CarLevel5Holder CarsLv5 = new CarLevel5Holder(); 
	
	public BuildCarsClass(){
		
		jbtnBuildCarLv1.addActionListener(this);
        jbtnBuildCarLv2.addActionListener(this);
        jbtnBuildCarLv3.addActionListener(this);
        jbtnBuildCarLv4.addActionListener(this);
        jbtnBuildCarLv5.addActionListener(this);
        
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jbtnBuildCarLv1){
	    	if(CarMain.main[5] >=1){
	    		if(CarMain.main[7] >0){
	    			if(CarFrame.frames[1] >0){
	    				if(Part.parts[1] >0){
	    					if(Part.parts[3] >0){
	    						if(Part.parts[5] >0){
	    							if(Part.parts[7] >0){
	    								if(Part.parts[9] >0){
	    									if(Part.parts[11] >0){
	    										if(Part.parts[13] >0){
	    											if(Part.parts[15] >0){
	    												if(Part.parts[17] >0){
	    													if(Part.parts[19] >0){
	    														if(Part.parts[21] >0){
	    															if(Part.parts[23] >0){
	    																if(Part.parts[25] >0){
	    																	int level1carticker= 3;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){  
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[3]); skaitlis+=1; 
	    																		CarsLv1.cars[3] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_DB9Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Acura NSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE,ImagesHolder.Acura_NSXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Ford Mustang!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_MustangIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 412!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_412Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1;   
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Kia Venga!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_VengaIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Fiat 1500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_1500Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari Enzo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_EnzoIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin Rapide!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_RapideIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg CCX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_CCXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Honda Civic!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_CivicIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac ATS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_ATSIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Lancer Evolution X!", "Congralations", JOptionPane.INFORMATION_MESSAGE,ImagesHolder.Mitsubishi_LancerEvolutionXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti FX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_FXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Thema!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_ThemaIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1;  
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Volvo XC90!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_XC90Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Acura CSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_CSXIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Saab Sonett II!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_SonettIIIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Renault Floride!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_FlorideIcon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained BMW e34!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e34Icon);
	    																	}
	    																	level1carticker+=4;
	    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
	    																		CarFrame.frames[1] = CarFrame.frames[1] - 1;
	    																		Part.parts[1] = Part.parts[1] - 1;
	    																		Part.parts[3] = Part.parts[3] - 1;
	    																		Part.parts[5] = Part.parts[5] - 1;
	    																		Part.parts[7] = Part.parts[7] - 1;
	    																		Part.parts[9] = Part.parts[9] - 1;
	    																		Part.parts[11] = Part.parts[11] - 1;
	    																		Part.parts[13] = Part.parts[13] - 1;
	    																		Part.parts[15] = Part.parts[15] - 1;
	    																		Part.parts[17] = Part.parts[17] - 1;
	    																		Part.parts[19] = Part.parts[19] - 1;
	    																		Part.parts[21] = Part.parts[21] - 1;
	    																		Part.parts[23] = Part.parts[23] - 1;
	    																		Part.parts[25] = Part.parts[25] - 1;
	    																		CarMain.main[7] = CarMain.main[7] - 1;
	    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
	    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
	    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Cordoba!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_CordobaIcon);
	    																	}
	    																}
	    																else{
	    																	JOptionPane.showMessageDialog(null, "You have colected all 1 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
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
	            		JOptionPane.showMessageDialog (null, "You don't have 1 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
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
		 if(ae.getSource() == jbtnBuildCarLv2){
		    	if(CarMain.main[5] >=2){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[3] >0){
		    				if(Part.parts[27] >0){
		    					if(Part.parts[29] >0){
		    						if(Part.parts[31] >0){
		    							if(Part.parts[33] >0){
		    								if(Part.parts[35] >0){
		    									if(Part.parts[37] >0){
		    										if(Part.parts[39] >0){
		    											if(Part.parts[41] >0){
		    												if(Part.parts[43] >0){
		    													if(Part.parts[45] >0){
		    														if(Part.parts[47] >0){
		    															if(Part.parts[49] >0){
		    																if(Part.parts[51] >0){
		    																	int level2carticker= 3;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[3]); skaitlis+=1; 
		    																		CarsLv2.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Buick Riviera!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_RivieraIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Tesla Roadster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_RoadsterIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi 80!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_80Icon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained BMW e36!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e36Icon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Scirocco!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_SciroccoIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mazda 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_3Icon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Viking!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_VikingIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Tesla S!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_SIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jeep ZJ!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_ZJIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Dodge Neon!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_NeonIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained BMW e30!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e30Icon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz W123!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_W123Icon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover Defender!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_DefenderIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Saab 9_5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_9_5Icon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin One!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_OneIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Regera!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_RegeraIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lexus IS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_ISIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained GMC Yukon!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_YukonIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Opel_Astra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_AstraIcon);
		    																	}
		    																	level2carticker+=4;
		    																	if(Integer.parseInt(CarsLv2.cars[level2carticker]) == 0){  
		    																		CarFrame.frames[3] = CarFrame.frames[3] - 1;
		    																		Part.parts[27] = Part.parts[27] - 1;
		    																		Part.parts[29] = Part.parts[29] - 1;
		    																		Part.parts[31] = Part.parts[31] - 1;
		    																		Part.parts[33] = Part.parts[33] - 1;
		    																		Part.parts[35] = Part.parts[35] - 1;
		    																		Part.parts[37] = Part.parts[37] - 1;
		    																		Part.parts[39] = Part.parts[39] - 1;
		    																		Part.parts[41] = Part.parts[41] - 1;
		    																		Part.parts[43] = Part.parts[43] - 1;
		    																		Part.parts[45] = Part.parts[45] - 1;
		    																		Part.parts[47] = Part.parts[47] - 1;
		    																		Part.parts[49] = Part.parts[49] - 1;
		    																		Part.parts[51] = Part.parts[51] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv2.cars[level2carticker]); skaitlis+=1; 
		    																		CarsLv2.cars[level2carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi Coupe!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_CoupeIcon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 2 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 2 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
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
		    if(ae.getSource() == jbtnBuildCarLv3){
		    	if(CarMain.main[5] >=3){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[5] >0){
		    				if(Part.parts[53] >0){
		    					if(Part.parts[55] >0){
		    						if(Part.parts[57] >0){
		    							if(Part.parts[59] >0){
		    								if(Part.parts[61] >0){
		    									if(Part.parts[63] >0){
		    										if(Part.parts[65] >0){
		    											if(Part.parts[67] >0){
		    												if(Part.parts[69] >0){
		    													if(Part.parts[71] >0){
		    														if(Part.parts[73] >0){
		    															if(Part.parts[75] >0){
		    																if(Part.parts[77] >0){
		    																	int level3carticker= 3;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[3]); skaitlis+=1; 
		    																		CarsLv3.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mini Moke!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_MokeIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Kia Rondo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_RondoIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained GMC Suburban!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_SuburbanIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Honda Prelude!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_PreludeIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Citroen_Saxo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_SaxoIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Tiguan!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_TiguanIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mini Moke!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_MokeIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Phaeton!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_PhaetonIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Buick Centry!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_CentryIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover Discovery!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_DiscoveryIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti Etherea!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_EthereaIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 308!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_308Icon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Toyota Auris!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_AurisIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Pagani ZondaF!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Pagani_ZondaFIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Phedra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_PhedraIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Impala!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_ImpalaIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Porsche Boxster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_BoxsterIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_DB6Icon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Vaz 2103!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_2103Icon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai Mistra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_MistraIcon);
		    																	}
		    																	level3carticker+=4;
		    																	if(Integer.parseInt(CarsLv3.cars[level3carticker]) == 0){  
		    																		CarFrame.frames[5] = CarFrame.frames[5] - 1;
		    																		Part.parts[53] = Part.parts[53] - 1;
		    																		Part.parts[55] = Part.parts[55] - 1;
		    																		Part.parts[57] = Part.parts[57] - 1;
		    																		Part.parts[59] = Part.parts[59] - 1;
		    																		Part.parts[61] = Part.parts[61] - 1;
		    																		Part.parts[63] = Part.parts[63] - 1;
		    																		Part.parts[65] = Part.parts[65] - 1;
		    																		Part.parts[67] = Part.parts[67] - 1;
		    																		Part.parts[69] = Part.parts[69] - 1;
		    																		Part.parts[71] = Part.parts[71] - 1;
		    																		Part.parts[73] = Part.parts[73] - 1;
		    																		Part.parts[75] = Part.parts[75] - 1;
		    																		Part.parts[77] = Part.parts[77] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv3.cars[level3carticker]); skaitlis+=1; 
		    																		CarsLv3.cars[level3carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mini Countryman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_CountrymanIcon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 3 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 3 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
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
		    if(ae.getSource() == jbtnBuildCarLv4){
		    	if(CarMain.main[5] >=4){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[7] >0){
		    				if(Part.parts[79] >0){
		    					if(Part.parts[81] >0){
		    						if(Part.parts[83] >0){
		    							if(Part.parts[85] >0){
		    								if(Part.parts[87] >0){
		    									if(Part.parts[89] >0){
		    										if(Part.parts[91] >0){
		    											if(Part.parts[93] >0){
		    												if(Part.parts[95] >0){
		    													if(Part.parts[97] >0){
		    														if(Part.parts[99] >0){
		    															if(Part.parts[101] >0){
		    																if(Part.parts[103] >0){
		    																	int level4carticker= 3;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[3]); skaitlis+=1; 
		    																		CarsLv4.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mazda MX6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_MX6Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1; 
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Daytona!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_DaytonaIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Buick Roadmaster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_RoadmasterIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volvo S80!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_S80Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Porsche Cayman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_CaymanIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Beetle!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_BeetleIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti EB110!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_EB110Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Opel Zafira!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_ZafiraIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Saab 9000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_9000Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained McLaren F1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_F1Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi R8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_R8Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 8C!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_8CIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Ford_Fiesta!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_FiestaIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti Q50!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_Q50Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Maserati 5000GT!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_5000GTIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz CLA250!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_CLA250Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini Gallardo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_GallardoIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mazda RX7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_RX7Icon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Colt!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_ColtIcon);
		    																	}
		    																	level4carticker+=4;
		    																	if(Integer.parseInt(CarsLv4.cars[level4carticker]) == 0){  
		    																		CarFrame.frames[7] = CarFrame.frames[7] - 1;
		    																		Part.parts[79] = Part.parts[79] - 1;
		    																		Part.parts[81] = Part.parts[81] - 1;
		    																		Part.parts[83] = Part.parts[83] - 1;
		    																		Part.parts[85] = Part.parts[85] - 1;
		    																		Part.parts[87] = Part.parts[87] - 1;
		    																		Part.parts[89] = Part.parts[89] - 1;
		    																		Part.parts[91] = Part.parts[91] - 1;
		    																		Part.parts[93] = Part.parts[93] - 1;
		    																		Part.parts[95] = Part.parts[95] - 1;
		    																		Part.parts[97] = Part.parts[97] - 1;
		    																		Part.parts[99] = Part.parts[99] - 1;
		    																		Part.parts[101] = Part.parts[101] - 1;
		    																		Part.parts[103] = Part.parts[103] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv4.cars[level4carticker]); skaitlis+=1;
		    																		CarsLv4.cars[level4carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Kia Sorento!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_SorentoIcon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 4 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 4 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
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
		    if(ae.getSource() == jbtnBuildCarLv5){
		    	if(CarMain.main[5] >=5){
		    		if(CarMain.main[7] >0){
		    			if(CarFrame.frames[9] >0){
		    				if(Part.parts[105] >0){
		    					if(Part.parts[107] >0){
		    						if(Part.parts[109] >0){
		    							if(Part.parts[111] >0){
		    								if(Part.parts[113] >0){
		    									if(Part.parts[115] >0){
		    										if(Part.parts[117] >0){
		    											if(Part.parts[119] >0){
		    												if(Part.parts[121] >0){
		    													if(Part.parts[123] >0){
		    														if(Part.parts[125] >0){
		    															if(Part.parts[127] >0){
		    																if(Part.parts[129] >0){
		    																	int level5carticker= 3;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[5]); skaitlis+=1;
		    																		CarsLv5.cars[3] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Wraith!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_WraithIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini Diablo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_DiabloIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Jeep Scrambler!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_ScramblerIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bentley Continental!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_ContinentalIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Bentley Azure!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_AzureIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg One!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_OneIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac XTS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_XTSIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Fiat 500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_500Icon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Pajero!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_PajeroIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 2140!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_2140Icon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Opel GT!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_GTIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai Getz!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_GetzIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Maserati Coupe!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_CoupeIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Honda S2000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_S2000Icon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_SpiderIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained BMW M5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_M5Icon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained BMW I8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_I8Icon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Citroen C5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_C5Icon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Fiat Punto!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_PuntoIcon);
		    																	}
		    																	level5carticker+=4;
		    																	if(Integer.parseInt(CarsLv5.cars[level5carticker]) == 0){  
		    																		CarFrame.frames[9] = CarFrame.frames[9] - 1;
		    																		Part.parts[105] = Part.parts[105] - 1;
		    																		Part.parts[107] = Part.parts[107] - 1;
		    																		Part.parts[109] = Part.parts[109] - 1;
		    																		Part.parts[111] = Part.parts[111] - 1;
		    																		Part.parts[113] = Part.parts[113] - 1;
		    																		Part.parts[115] = Part.parts[115] - 1;
		    																		Part.parts[117] = Part.parts[117] - 1;
		    																		Part.parts[119] = Part.parts[119] - 1;
		    																		Part.parts[121] = Part.parts[121] - 1;
		    																		Part.parts[123] = Part.parts[123] - 1;
		    																		Part.parts[125] = Part.parts[125] - 1;
		    																		Part.parts[127] = Part.parts[127] - 1;
		    																		Part.parts[129] = Part.parts[129] - 1;
		    																		CarMain.main[7] = CarMain.main[7] - 1;
		    																		int skaitlis = 	Integer.parseInt(CarsLv5.cars[level5carticker]); skaitlis+=1; 
		    																		CarsLv5.cars[level5carticker] = Integer.toString(skaitlis);
		    																		JOptionPane.showMessageDialog (null, "You have gained Audi 100!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_100Icon);
		    																	}
		    																}
		    																else{
		    																	JOptionPane.showMessageDialog(null, "You have colected all 5 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
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
		            		JOptionPane.showMessageDialog (null, "You don't have 5 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);
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

