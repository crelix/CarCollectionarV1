package Clicker;

import java.awt.event.*;
import javax.swing.*;


public class BuildCarsClass implements ActionListener {
	
    int count = 0;
    int count0 = 0;
    
    ImagesHolder ImagesHolder = new ImagesHolder();
	MainHolder CarMain = new MainHolder();
    BoxesHolder Box = new BoxesHolder();
    FramesHolder CarFrame = new FramesHolder();
    PartHolder Part = new PartHolder();
	CarLevel1Holder CarsLv1 = new CarLevel1Holder(); 
	CarLevel2Holder CarsLv2 = new CarLevel2Holder(); 
	CarLevel3Holder CarsLv3 = new CarLevel3Holder(); 
	CarLevel4Holder CarsLv4 = new CarLevel4Holder(); 
	CarLevel5Holder CarsLv5 = new CarLevel5Holder(); 
	
	JButton jbtnBuildCarLv1 = new JButton("Build");
	JButton jbtnBuildCarLv2 = new JButton("Build");
	JButton jbtnBuildCarLv3 = new JButton("Build");
	JButton jbtnBuildCarLv4 = new JButton("Build");
	JButton jbtnBuildCarLv5 = new JButton("Build");

	public BuildCarsClass(){
		
		jbtnBuildCarLv1.addActionListener(this);
        jbtnBuildCarLv2.addActionListener(this);
        jbtnBuildCarLv3.addActionListener(this);
        jbtnBuildCarLv4.addActionListener(this);
        jbtnBuildCarLv5.addActionListener(this);
	    
        for(int i=1;i <= 25;i+=2){
			count+=1;
		}
	}

	public void actionPerformed(ActionEvent ae) {
		count=0;
		if(ae.getSource() == jbtnBuildCarLv1){
	    	if(CarMain.main[5] >=1){
	    		if(CarMain.main[7] >0){
	    			if(CarFrame.frames[1] >0){ 
	    				
	    				for(int i=1;i <= 25;i+=2){
	    					if(Part.parts[i] >0){
	    						count0+=1;
	    					}
	    					else{
	    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
						}
	    				
					if (count0 == count){
						for (int j = 3;j >= 80; j+= 4){
							if(Integer.parseInt(CarsLv1.cars[j]) == 0){
								for(int i=1;i <= 25;i+=2){
									Part.parts[i] --;
								
									int count = Integer.parseInt(CarsLv1.cars[3]); count+=1; 
									CarsLv1.cars[j] = Integer.toString(count);
									
									if(j == 3){
										JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_DB9Icon);
									}
									if(j == 7){
										JOptionPane.showMessageDialog (null, "You have gained Acura NSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_NSXIcon);
									}
									if(j == 11){
										JOptionPane.showMessageDialog (null, "You have gained Ford Mustang!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_MustangIcon);
									}
									if(j == 15){
										JOptionPane.showMessageDialog (null, "You have gained Moskvich 412!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_412Icon);
									}
									if(j == 19){
										JOptionPane.showMessageDialog (null, "You have gained Kia Venga!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_VengaIcon);
									}
									if(j == 23){
										JOptionPane.showMessageDialog (null, "You have gained Fiat 1500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_1500Icon);
									}
									if(j == 27){
										JOptionPane.showMessageDialog (null, "You have gained Ferrari Enzo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_EnzoIcon);
									}
									if(j == 31){
										JOptionPane.showMessageDialog (null, "You have gained Aston Martin Rapide!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_RapideIcon);
									}
									if(j == 35){
										JOptionPane.showMessageDialog (null, "You have gained Koenigsegg CCX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_CCXIcon);
									}
									if(j == 39){
										JOptionPane.showMessageDialog (null, "You have gained Honda Civic!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_CivicIcon);
									}
									if(j == 43){
										JOptionPane.showMessageDialog (null, "You have gained Cadilliac ATS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_ATSIcon);
									}
									if(j == 47){
										JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Lancer Evolution X!", "Congralations", JOptionPane.INFORMATION_MESSAGE,ImagesHolder.Mitsubishi_LancerEvolutionXIcon);
									}
									if(j == 51){
										JOptionPane.showMessageDialog (null, "You have gained Infiniti FX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_FXIcon);
									}
									if(j == 55){
										JOptionPane.showMessageDialog (null, "You have gained Lancia Thema!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_ThemaIcon);
									}
									if(j == 59){
										JOptionPane.showMessageDialog (null, "You have gained Volvo XC90!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_XC90Icon);
									}
									if(j == 63){
										JOptionPane.showMessageDialog (null, "You have gained Acura CSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_CSXIcon);
									}
									if(j == 67){
										JOptionPane.showMessageDialog (null, "You have gained Saab Sonett II!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_SonettIIIcon);
									}
									if(j == 71){
										JOptionPane.showMessageDialog (null, "You have gained Renault Floride!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_FlorideIcon);
									}
									if(j == 75){
										JOptionPane.showMessageDialog (null, "You have gained BMW e34!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e34Icon);
									}
									if(j == 79){
										JOptionPane.showMessageDialog (null, "You have gained Chrysler Cordoba!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_CordobaIcon);
									}
									else{
										JOptionPane.showMessageDialog(null, "You have colected all 1 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									}
								}
								
							}
						}
					}
	    			}
	    			else{
	    				JOptionPane.showMessageDialog (null, "You don't have 1 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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
			
			for(int i=27;i <= 51;i+=2){
				if(Part.parts[i] >0){
					count0+=1;
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
			}
			
		if (count0 == count){
			for (int j = 3;j >= 80; j+= 4){
				if(Integer.parseInt(CarsLv2.cars[j]) == 0){
					for(int i=27;i <= 51;i+=2){
						Part.parts[i] --;
					
						int count = Integer.parseInt(CarsLv2.cars[3]); count+=1; 
						CarsLv2.cars[j] = Integer.toString(count);
						
						if(j == 3){
							JOptionPane.showMessageDialog (null, "You have gained Buick Riviera!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_RivieraIcon);
						}
						if(j == 7){
							JOptionPane.showMessageDialog (null, "You have gained Tesla Roadster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_RoadsterIcon);
						}
						if(j == 11){
							JOptionPane.showMessageDialog (null, "You have gained Audi 80!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_80Icon);
						}
						if(j == 15){
							JOptionPane.showMessageDialog (null, "You have gained BMW e36!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e36Icon);
						}
						if(j == 19){
							JOptionPane.showMessageDialog (null, "You have gained Volkswagen Scirocco!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_SciroccoIcon);
						}
						if(j == 23){
							JOptionPane.showMessageDialog (null, "You have gained Mazda 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_3Icon);
						}
						if(j == 27){
							JOptionPane.showMessageDialog (null, "You have gained Chevrolet Viking!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_VikingIcon);
						}
						if(j == 31){
							JOptionPane.showMessageDialog (null, "You have gained Tesla S!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_SIcon);
						}
						if(j == 35){
							JOptionPane.showMessageDialog (null, "You have gained Jeep ZJ!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_ZJIcon);
						}
						if(j == 39){
							JOptionPane.showMessageDialog (null, "You have gained Dodge Neon!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_NeonIcon);
						}
						if(j == 43){
							JOptionPane.showMessageDialog (null, "You have gained BMW e30!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e30Icon);
						}
						if(j == 47){
							JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz W123!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_W123Icon);
						}
						if(j == 51){
							JOptionPane.showMessageDialog (null, "You have gained Land Rover Defender!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_DefenderIcon);
						}
						if(j == 55){
							JOptionPane.showMessageDialog (null, "You have gained Saab 9_5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_9_5Icon);
						}
						if(j == 59){
							JOptionPane.showMessageDialog (null, "You have gained Aston Martin One!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_OneIcon);
						}
						if(j == 63){
							JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Regera!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_RegeraIcon);
						}
						if(j == 67){
							JOptionPane.showMessageDialog (null, "You have gained Lexus IS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_ISIcon);
						}
						if(j == 71){
							JOptionPane.showMessageDialog (null, "You have gained GMC Yukon!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_YukonIcon);
						}
						if(j == 75){
							JOptionPane.showMessageDialog (null, "You have gained Opel_Astra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_AstraIcon);
						}
						if(j == 79){
							JOptionPane.showMessageDialog (null, "You have gained Audi Coupe!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_CoupeIcon);
						}
						else{
							JOptionPane.showMessageDialog(null, "You have colected all 2 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
						}
					}
					
				}
			}
		}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have 2 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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
			
			for(int i=53;i <= 77;i+=2){
				if(Part.parts[i] >0){
					count0+=1;
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
			}
			
		if (count0 == count){
			for (int j = 3;j >= 80; j+= 4){
				if(Integer.parseInt(CarsLv3.cars[j]) == 0){
					for(int i=53;i <= 77;i+=2){
						Part.parts[i] --;
					
						int count = Integer.parseInt(CarsLv3.cars[3]); count+=1; 
						CarsLv3.cars[j] = Integer.toString(count);
						
						if(j == 3){
							JOptionPane.showMessageDialog (null, "You have gained Mini Moke!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_MokeIcon);
						}
						if(j == 7){
							JOptionPane.showMessageDialog (null, "You have gained Kia Rondo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_RondoIcon);
						}
						if(j == 11){
							JOptionPane.showMessageDialog (null, "You have gained GMC Suburban!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_SuburbanIcon);
						}
						if(j == 15){
							JOptionPane.showMessageDialog (null, "You have gained Honda Prelude!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_PreludeIcon);
						}
						if(j == 19){
							JOptionPane.showMessageDialog (null, "You have gained Citroen_Saxo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_SaxoIcon);
						}
						if(j == 23){
							JOptionPane.showMessageDialog (null, "You have gained Volkswagen Tiguan!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_TiguanIcon);
						}
						if(j == 27){
							JOptionPane.showMessageDialog (null, "You have gained Volkswagen Phaeton!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_PhaetonIcon);
						}
						if(j == 31){
							JOptionPane.showMessageDialog (null, "You have gained Buick Centry!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_CentryIcon);
						}
						if(j == 35){
							JOptionPane.showMessageDialog (null, "You have gained Land Rover Discovery!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_DiscoveryIcon);
						}
						if(j == 39){
							JOptionPane.showMessageDialog (null, "You have gained Infiniti Etherea!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_EthereaIcon);
						}
						if(j == 43){
							JOptionPane.showMessageDialog (null, "You have gained Peugeot 308!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_308Icon);
						}
						if(j == 47){
							JOptionPane.showMessageDialog (null, "You have gained Toyota Auris!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_AurisIcon);
						}
						if(j == 51){
							JOptionPane.showMessageDialog (null, "You have gained Pagani ZondaF!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Pagani_ZondaFIcon);
						}
						if(j == 55){
							JOptionPane.showMessageDialog (null, "You have gained Lancia Phedra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_PhedraIcon);
						}
						if(j == 59){
							JOptionPane.showMessageDialog (null, "You have gained Chevrolet Impala!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_ImpalaIcon);
						}
						if(j == 63){
							JOptionPane.showMessageDialog (null, "You have gained Porsche Boxster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_BoxsterIcon);
						}
						if(j == 67){
							JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_DB6Icon);
						}
						if(j == 71){
							JOptionPane.showMessageDialog (null, "You have gained Vaz 2103!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_2103Icon);
						}
						if(j == 75){
							JOptionPane.showMessageDialog (null, "You have gained Hyundai Mistra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_MistraIcon);
						}
						if(j == 79){
							JOptionPane.showMessageDialog (null, "You have gained Mini Countryman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_CountrymanIcon);
						}
						else{
							JOptionPane.showMessageDialog(null, "You have colected all 3 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
						}
					}
					
				}
			}
		}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have 3 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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
				
				for(int i=79;i <= 103;i+=2){
					if(Part.parts[i] >0){
						count0+=1;
					}
					else{
						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
				}
				
			if (count0 == count){
				for (int j = 3;j >= 80; j+= 4){
					if(Integer.parseInt(CarsLv4.cars[j]) == 0){
						for(int i=79;i <= 103;i+=2){
							Part.parts[i] --;
						
							int count = Integer.parseInt(CarsLv4.cars[3]); count+=1; 
							CarsLv4.cars[j] = Integer.toString(count);
							
							if(j == 3){
								JOptionPane.showMessageDialog (null, "You have gained Mazda MX6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_MX6Icon);
							}
							if(j == 7){
								JOptionPane.showMessageDialog (null, "You have gained Chrysler Daytona!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_DaytonaIcon);
							}
							if(j == 11){
								JOptionPane.showMessageDialog (null, "You have gained Buick Roadmaster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_RoadmasterIcon);
							}
							if(j == 15){
								JOptionPane.showMessageDialog (null, "You have gained Volvo S80!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_S80Icon);
							}
							if(j == 19){
								JOptionPane.showMessageDialog (null, "You have gained Porsche Cayman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_CaymanIcon);
							}
							if(j == 23){
								JOptionPane.showMessageDialog (null, "You have gained Volkswagen Beetle!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_BeetleIcon);
							}
							if(j == 27){
								JOptionPane.showMessageDialog (null, "You have gained Bugatti EB110!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_EB110Icon);
							}
							if(j == 31){
								JOptionPane.showMessageDialog (null, "You have gained Opel Zafira!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_ZafiraIcon);
							}
							if(j == 35){
								JOptionPane.showMessageDialog (null, "You have gained Saab 9000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_9000Icon);
							}
							if(j == 39){
								JOptionPane.showMessageDialog (null, "You have gained McLaren F1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_F1Icon);
							}
							if(j == 43){
								JOptionPane.showMessageDialog (null, "You have gained Audi R8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_R8Icon);
							}
							if(j == 47){
								JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 8C!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_8CIcon);
							}
							if(j == 51){
								JOptionPane.showMessageDialog (null, "You have gained Ford_Fiesta!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_FiestaIcon);
							}
							if(j == 55){
								JOptionPane.showMessageDialog (null, "You have gained Infiniti Q50!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_Q50Icon);
							}
							if(j == 59){
								JOptionPane.showMessageDialog (null, "You have gained Maserati 5000GT!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_5000GTIcon);
							}
							if(j == 63){
								JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz CLA250!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_CLA250Icon);
							}
							if(j == 67){
								JOptionPane.showMessageDialog (null, "You have gained Lamborghini Gallardo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_GallardoIcon);
							}
							if(j == 71){
								JOptionPane.showMessageDialog (null, "You have gained Mazda RX7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_RX7Icon);
							}
							if(j == 75){
								JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Colt!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_ColtIcon);
							}
							if(j == 79){
								JOptionPane.showMessageDialog (null, "You have gained Kia Sorento!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_SorentoIcon);
							}
							else{
								JOptionPane.showMessageDialog(null, "You have colected all 4 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
							}
						}
						
					}
				}
			}
			}
			else{
				JOptionPane.showMessageDialog (null, "You don't have 4 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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
					
					for(int i=105;i <= 129;i+=2){
						if(Part.parts[i] >0){
							count0+=1;
						}
						else{
							JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}	    					
					}
					
				if (count0 == count){
					for (int j = 3;j >= 80; j+= 4){
						if(Integer.parseInt(CarsLv5.cars[j]) == 0){
							for(int i=105;i <= 129;i+=2){
								Part.parts[i] --;
							
								int count = Integer.parseInt(CarsLv5.cars[3]); count+=1; 
								CarsLv5.cars[j] = Integer.toString(count);
								
								if(j == 3){
									JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Wraith!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_WraithIcon);
								}
								if(j == 7){
									JOptionPane.showMessageDialog (null, "You have gained Lamborghini Diablo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_DiabloIcon);
								}
								if(j == 11){
									JOptionPane.showMessageDialog (null, "You have gained Jeep Scrambler!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_ScramblerIcon);
								}
								if(j == 15){
									JOptionPane.showMessageDialog (null, "You have gained Bentley Continental!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_ContinentalIcon);
								}
								if(j == 19){
									JOptionPane.showMessageDialog (null, "You have gained Bentley Azure!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_AzureIcon);
								}
								if(j == 23){
									JOptionPane.showMessageDialog (null, "You have gained Koenigsegg One!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_OneIcon);
								}
								if(j == 27){
									JOptionPane.showMessageDialog (null, "You have gained Cadilliac XTS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_XTSIcon);
								}
								if(j == 31){
									JOptionPane.showMessageDialog (null, "You have gained Fiat 500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_500Icon);
								}
								if(j == 35){
									JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Pajero!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_PajeroIcon);
								}
								if(j == 39){
									JOptionPane.showMessageDialog (null, "You have gained Moskvich 2140!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_2140Icon);
								}
								if(j == 43){
									JOptionPane.showMessageDialog (null, "You have gained Opel GT!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_GTIcon);
								}
								if(j == 47){
									JOptionPane.showMessageDialog (null, "You have gained Hyundai Getz!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_GetzIcon);
								}
								if(j == 51){
									JOptionPane.showMessageDialog (null, "You have gained Maserati Coupe!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_CoupeIcon);
								}
								if(j == 55){
									JOptionPane.showMessageDialog (null, "You have gained Honda S2000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_S2000Icon);
								}
								if(j == 59){
									JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_SpiderIcon);
								}
								if(j == 63){
									JOptionPane.showMessageDialog (null, "You have gained BMW M5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_M5Icon);
								}
								if(j == 67){
									JOptionPane.showMessageDialog (null, "You have gained BMW I8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_I8Icon);
								}
								if(j == 71){
									JOptionPane.showMessageDialog (null, "You have gained Citroen C5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_C5Icon);
								}
								if(j == 75){
									JOptionPane.showMessageDialog (null, "You have gained Fiat Punto!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_PuntoIcon);
								}
								if(j == 79){
									JOptionPane.showMessageDialog (null, "You have gained Audi 100!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_100Icon);
								}
								else{
									JOptionPane.showMessageDialog(null, "You have colected all 5 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
								}
							}
							
						}
					}
				}
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have 5 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
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