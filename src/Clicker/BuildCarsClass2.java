package Clicker;

import java.awt.event.*;
import javax.swing.*;

public class BuildCarsClass2 implements ActionListener {

    int count = 0;
    int count0 = 0;
	
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
        
        for(int i=1;i <= 25;i+=2){
			count+=1;
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
		count=0;
		
		if(ae.getSource() == jbtnBuildCarLv6){
	    	if(CarMain.main[5] >=6){
	    		if(CarMain.main[7] >0){
	    			if(CarFrame.frames[11] >0){ 
	    				
	    				for(int i=131;i <= 155;i+=2){
	    					if(Part.parts[i] >0){
	    						count0+=1;
	    					}
	    					else{
	    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
						}
	    				
					if (count0 == count){
						for (int j = 3;j >= 80; j+= 4){
							if(Integer.parseInt(CarsLv6.cars[j]) == 0){
								for(int i=131;i <= 155;i+=2){
									Part.parts[i] --;
								
									int count = Integer.parseInt(CarsLv6.cars[3]); count+=1; 
									CarsLv6.cars[j] = Integer.toString(count);
									
									if(j == 3){
										JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Phantom", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_PhantomIcon);
									}
									if(j == 7){
										JOptionPane.showMessageDialog (null, "You have gained Toyota 86!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_86Icon);
									}
									if(j == 11){
										JOptionPane.showMessageDialog (null, "You have gained BMW e70!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e70Icon);
									}
									if(j == 15){
										JOptionPane.showMessageDialog (null, "You have gained Chrysler Voyager!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_VoyagerIcon);
									}
									if(j == 19){
										JOptionPane.showMessageDialog (null, "You have gained Rolls Royce PhantomIII!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_PhantomIIIIcon);
									}
									if(j == 23){
										JOptionPane.showMessageDialog (null, "You have gained Honda CRX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_CRXIcon);
									}
									if(j == 27){
										JOptionPane.showMessageDialog (null, "You have gained Subaru 1000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_1000Icon);
									}
									if(j == 31){
										JOptionPane.showMessageDialog (null, "You have gained Cadilliac Eldorado!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_EldoradoIcon);
									}
									if(j == 35){
										JOptionPane.showMessageDialog (null, "You have gained Land Rover Freelander!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_FreelanderIcon);
									}
									if(j == 39){
										JOptionPane.showMessageDialog (null, "You have gained Renault_Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_SpiderIcon);
									}
									if(j == 43){
										JOptionPane.showMessageDialog (null, "You have gained Gaz 21!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Gaz_21Icon);
									}
									if(j == 47){
										JOptionPane.showMessageDialog (null, "You have gained Acura EL!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_ELIcon);
									}
									if(j == 51){
										JOptionPane.showMessageDialog (null, "You have gained Bugatti Veyron!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_VeyronIcon);
									}
									if(j == 55){
										JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz SL600!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_SL600Icon);
									}
									if(j == 59){
										JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Silver!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_SilverIcon);
									}
									if(j == 63){
										JOptionPane.showMessageDialog (null, "You have gained Mini Paceman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_PacemanIcon);
									}
									if(j == 67){
										JOptionPane.showMessageDialog (null, "You have gained Hyundai Excel!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_ExcelIcon);
									}
									if(j == 71){
										JOptionPane.showMessageDialog (null, "You have gained Gaz 24!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Gaz_24Icon);
									}
									if(j == 75){
										JOptionPane.showMessageDialog (null, "You have gained Peugeot 107!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_107Icon);
									}
									if(j == 79){
										JOptionPane.showMessageDialog (null, "You have gained Audi_A4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_A4Icon);
									}
									else{
										JOptionPane.showMessageDialog(null, "You have colected all 6 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									}
								}
								
							}
						}
					}
	    			}
	    			else{
	    				JOptionPane.showMessageDialog (null, "You don't have 6 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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
	    				
	    				for(int i=157;i <= 181;i+=2){
	    					if(Part.parts[i] >0){
	    						count0+=1;
	    					}
	    					else{
	    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
						}
	    				
					if (count0 == count){
						for (int j = 3;j >= 80; j+= 4){
							if(Integer.parseInt(CarsLv7.cars[j]) == 0){
								for(int i=157;i <= 181;i+=2){
									Part.parts[i] --;
								
									int count = Integer.parseInt(CarsLv7.cars[3]); count+=1; 
									CarsLv7.cars[j] = Integer.toString(count);
									
									if(j == 3){
										JOptionPane.showMessageDialog (null, "You have gained Lamborghini Aventador", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_AventadorIcon);
									}
									if(j == 7){
										JOptionPane.showMessageDialog (null, "You have gained Nissan 350z", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_350zIcon);
									}
									if(j == 11){
										JOptionPane.showMessageDialog (null, "You have gained Jaguar XJ6", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_XJ6Icon);
									}
									if(j == 15){
										JOptionPane.showMessageDialog (null, "You have gained Renault Clio", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_ClioIcon);
									}
									if(j == 19){
										JOptionPane.showMessageDialog (null, "You have gained Toyota Avensis", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_AvensisIcon);
									}
									if(j == 23){
										JOptionPane.showMessageDialog (null, "You have gained Subaru Outback", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_OutbackIcon);
									}
									if(j == 27){
										JOptionPane.showMessageDialog (null, "You have gained Saab 900", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_900Icon);
									}
									if(j == 31){
										JOptionPane.showMessageDialog (null, "You have gained Opel Vectra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_VectraIcon);
									}
									if(j == 35){
										JOptionPane.showMessageDialog (null, "You have gained Chrysler Charger", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_ChargerIcon);
									}
									if(j == 39){
										JOptionPane.showMessageDialog (null, "You have gained Ferrari_348", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_348Icon);
									}
									if(j == 43){
										JOptionPane.showMessageDialog (null, "You have gained Hyundai XG", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_XGIcon);
									}
									if(j == 47){
										JOptionPane.showMessageDialog (null, "You have gained Lexus RX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_RXIcon);
									}
									if(j == 51){
										JOptionPane.showMessageDialog (null, "You have gained Dodge 400", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_400Icon);
									}
									if(j == 55){
										JOptionPane.showMessageDialog (null, "You have gained GMC Terrain", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_TerrainIcon);
									}
									if(j == 59){
										JOptionPane.showMessageDialog (null, "You have gained Volvo C70", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_C70Icon);
									}
									if(j == 63){
										JOptionPane.showMessageDialog (null, "You have gained Ford_Sierra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_SierraIcon);
									}
									if(j == 67){
										JOptionPane.showMessageDialog (null, "You have gained Subaru Impreza", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_ImprezaIcon);
									}
									if(j == 71){
										JOptionPane.showMessageDialog (null, "You have gained BMW e90", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e90Icon);
									}
									if(j == 75){
										JOptionPane.showMessageDialog (null, "You have gained Nissan Skyline", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_SkylineIcon);
									}
									if(j == 79){
										JOptionPane.showMessageDialog (null, "You have gained Audi Q7", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_Q7Icon);
									}
									else{
										JOptionPane.showMessageDialog(null, "You have colected all 7 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									}
								}
								
							}
						}
					}
	    			}
	    			else{
	    				JOptionPane.showMessageDialog (null, "You don't have 7 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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
	    				
	    				for(int i=183;i <= 207;i+=2){
	    					if(Part.parts[i] >0){
	    						count0+=1;
	    					}
	    					else{
	    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
						}
	    				
					if (count0 == count){
						for (int j = 3;j >= 80; j+= 4){
							if(Integer.parseInt(CarsLv8.cars[j]) == 0){
								for(int i=183;i <= 207;i+=2){
									Part.parts[i] --;
								
									int count = Integer.parseInt(CarsLv8.cars[3]); count+=1; 
									CarsLv8.cars[j] = Integer.toString(count);
									
									if(j == 3){
										JOptionPane.showMessageDialog (null, "You have gained Bentley Arnage", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_ArnageIcon);
									}
									if(j == 7){
										JOptionPane.showMessageDialog (null, "You have gained Volvo 850", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_850Icon);
									}
									if(j == 11){
										JOptionPane.showMessageDialog (null, "You have gained Toyota Rav4", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_Rav4Icon);
									}
									if(j == 15){
										JOptionPane.showMessageDialog (null, "You have gained Ford Focus", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_FocusIcon);
									}
									if(j == 19){
										JOptionPane.showMessageDialog (null, "You have gained Chevrolet Spin", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_SpinIcon);
									}
									if(j == 23){
										JOptionPane.showMessageDialog (null, "You have gained Bentley GTZ", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_GTZIcon);
									}
									if(j == 27){
										JOptionPane.showMessageDialog (null, "You have gained Lexus LS", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_LSIcon);
									}
									if(j == 31){
										JOptionPane.showMessageDialog (null, "You have gained Land Rover RangeRover", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_RangeRoverIcon);
									}
									if(j == 35){
										JOptionPane.showMessageDialog (null, "You have gained Lexus GX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_GXIcon);
									}
									if(j == 39){
										JOptionPane.showMessageDialog (null, "You have gained Jeep Wrangler", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_WranglerIcon);
									}
									if(j == 43){
										JOptionPane.showMessageDialog (null, "You have gained Maserati GranTurismo", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_GranTurismoIcon);
									}
									if(j == 47){
										JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Agera", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_AgeraIcon);
									}
									if(j == 51){
										JOptionPane.showMessageDialog (null, "You have gained Acura MDX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_MDXIcon);
									}
									if(j == 55){
										JOptionPane.showMessageDialog (null, "You have gained Audi RS6", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_RS6Icon);
									}
									if(j == 59){
										JOptionPane.showMessageDialog (null, "You have gained Cadilliac DeVille", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_DeVilleIcon);
									}
									if(j == 63){
										JOptionPane.showMessageDialog (null, "You have gained McLaren Veneno", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_VenenoIcon);
									}
									if(j == 67){
										JOptionPane.showMessageDialog (null, "You have gained Tesla X", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_XIcon);
									}
									if(j == 71){
										JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz G55", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_G55Icon);
									}
									if(j == 75){
										JOptionPane.showMessageDialog (null, "You have gained Lancia Lybra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_LybraIcon);
									}
									if(j == 79){
										JOptionPane.showMessageDialog (null, "You have gained Infiniti QX60", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_QX60Icon);
									}
									else{
										JOptionPane.showMessageDialog(null, "You have colected all 8 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									}
								}
								
							}
						}
					}
	    			}
	    			else{
	    				JOptionPane.showMessageDialog (null, "You don't have 8 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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
	    				
	    				for(int i=209;i <= 233;i+=2){
	    					if(Part.parts[i] >0){
	    						count0+=1;
	    					}
	    					else{
	    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
						}
	    				
					if (count0 == count){
						for (int j = 3;j >= 80; j+= 4){
							if(Integer.parseInt(CarsLv9.cars[j]) == 0){
								for(int i=209;i <= 233;i+=2){
									Part.parts[i] --;
								
									int count = Integer.parseInt(CarsLv9.cars[3]); count+=1; 
									CarsLv9.cars[j] = Integer.toString(count);
									
									if(j == 3){
										JOptionPane.showMessageDialog (null, "You have gained Kia Forte", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_ForteIcon);
									}
									if(j == 7){
										JOptionPane.showMessageDialog (null, "You have gained Lancia Voyager", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_VoyagerIcon);
									}
									if(j == 11){
										JOptionPane.showMessageDialog (null, "You have gained Porsche_Cayenne", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_CayenneIcon);
									}
									if(j == 15){
										JOptionPane.showMessageDialog (null, "You have gained McLaren_650s", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_650sIcon);
									}
									if(j == 19){
										JOptionPane.showMessageDialog (null, "You have gained Jaguar E-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_E_TypeIcon);
									}
									if(j == 23){
										JOptionPane.showMessageDialog (null, "You have gained Peugeot 601", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_601Icon);
									}
									if(j == 27){
										JOptionPane.showMessageDialog (null, "You have gained Jaguar F-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_F_TypeIcon);
									}
									if(j == 31){
										JOptionPane.showMessageDialog (null, "You have gained Fiat Doblo", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_DobloIcon);
									}
									if(j == 35){
										JOptionPane.showMessageDialog (null, "You have gained Vaz 2101", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_2101Icon);
									}
									if(j == 39){
										JOptionPane.showMessageDialog (null, "You have gained McLaren P1", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_P1Icon);
									}
									if(j == 43){
										JOptionPane.showMessageDialog (null, "You have gained Peugeot 405", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_405Icon);
									}
									if(j == 47){
										JOptionPane.showMessageDialog (null, "You have gained GMC Envoy", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_EnvoyIcon);
									}
									if(j == 51){
										JOptionPane.showMessageDialog (null, "You have gained Chevrolet Corvete", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_CorveteIcon);
									}
									if(j == 55){
										JOptionPane.showMessageDialog (null, "You have gained Pagani Huayra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Pagani_HuayraIcon);
									}
									if(j == 59){
										JOptionPane.showMessageDialog (null, "You have gained Moskvich 402", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_402Icon);
									}
									if(j == 63){
										JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 159", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_159Icon);
									}
									if(j == 67){
										JOptionPane.showMessageDialog (null, "You have gained Renault Fregate", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_FregateIcon);
									}
									if(j == 71){
										JOptionPane.showMessageDialog (null, "You have gained Mini Cooper", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_CooperIcon);
									}
									if(j == 75){
										JOptionPane.showMessageDialog (null, "You have gained Dodge Viper", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_ViperIcon);
									}
									if(j == 79){
										JOptionPane.showMessageDialog (null, "You have gained Vaz Niva", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_NivaIcon);
									}
									else{
										JOptionPane.showMessageDialog(null, "You have colected all  LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									}
								}
								
							}
						}
					}
	    			}
	    			else{
	    				JOptionPane.showMessageDialog (null, "You don't have 9 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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
				
				for(int i=235;i <= 259;i+=2){
					if(Part.parts[i] >0){
						count0+=1;
					}
					else{
						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
				}
				
			if (count0 == count){
				for (int j = 3;j >= 80; j+= 4){
					if(Integer.parseInt(CarsLv10.cars[j]) == 0){
						for(int i=235;i <= 259;i+=2){
							Part.parts[i] --;
						
							int count = Integer.parseInt(CarsLv10.cars[3]); count+=1; 
							CarsLv10.cars[j] = Integer.toString(count);
							
							if(j == 3){
								JOptionPane.showMessageDialog (null, "You have gained Jaguar X-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_X_TypeIcon);
							}
							if(j == 7){
								JOptionPane.showMessageDialog (null, "You have gained Ferrari 308", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_308Icon);
							}
							if(j == 11){
								JOptionPane.showMessageDialog (null, "You have gained Mazda 626", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_626Icon);
							}
							if(j == 15){
								JOptionPane.showMessageDialog (null, "You have gained Maserati Shamal", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_ShamalIcon);
							}
							if(j == 19){
								JOptionPane.showMessageDialog (null, "You have gained Nissan 240sx", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_240sxIcon);
							}
							if(j == 23){
								JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 4C", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_4CIcon);
							}
							if(j == 27){
								JOptionPane.showMessageDialog (null, "You have gained Nissan Juke", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_JukeIcon);
							}
							if(j == 31){
								JOptionPane.showMessageDialog (null, "You have gained Volkswagen Golf1", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_Golf1Icon);
							}
							if(j == 35){
								JOptionPane.showMessageDialog (null, "You have gained Jeep Gladiator", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_GladiatorIcon);
							}
							if(j == 39){
								JOptionPane.showMessageDialog (null, "You have gained Dodge Matador", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_MatadorIcon);
							}
							if(j == 43){
								JOptionPane.showMessageDialog (null, "You have gained Bugatti Royale", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_RoyaleIcon);
							}
							if(j == 47){
								JOptionPane.showMessageDialog (null, "You have gained Citroen CX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_CXIcon);
							}
							if(j == 51){
								JOptionPane.showMessageDialog (null, "You have gained Lamborghini 350GT", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_350GTIcon);
							}
							if(j == 55){
								JOptionPane.showMessageDialog (null, "You have gained Mitsubishi GTO", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_GTOIcon);
							}
							if(j == 59){
								JOptionPane.showMessageDialog (null, "You have gained Buick Invicta", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_InvictaIcon);
							}
							if(j == 63){
								JOptionPane.showMessageDialog (null, "You have gained Porsche 911", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_911Icon);
							}
							if(j == 67){
								JOptionPane.showMessageDialog (null, "You have gained Subaru Forester", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_ForesterIcon);
							}
							if(j == 71){
								JOptionPane.showMessageDialog (null, "You have gained Citroen BX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_BXIcon);
							}
							if(j == 75){
								JOptionPane.showMessageDialog (null, "You have gained Bugatti Type252", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_Type252Icon);
							}
							if(j == 79){
								JOptionPane.showMessageDialog (null, "You have gained Ferrari 488", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_488Icon);
							}
							else{
								JOptionPane.showMessageDialog(null, "You have colected all 10 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
							}
						}
						
					}
				}
			}
			}
			else{
				JOptionPane.showMessageDialog (null, "You don't have 10 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
			}
		else{
			JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		}
		}
	else{
		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
	}  
}
	}}	
