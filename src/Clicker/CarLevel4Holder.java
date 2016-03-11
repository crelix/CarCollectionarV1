package Clicker;

public class CarLevel4Holder {

	public String cars[] = new String[80];

	public CarLevel4Holder(){
		
		
	}
	
	public void CarsMaker(String a1,int k, String a2,int k1, String a3,int k2,String a4,int k3){

		cars[k] = a1;
		cars[k1] = a2;
		cars[k2] = a3;
		cars[k3] = a4;
	}
		
		public void MakeCars(){
			
			int u = 0;int i = 1;int o = 2;int p = 3;
			CarsMaker("Type", u,"Mazda", i,"Japanese",o, "0",p);        	//Mazda_MX6
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Chrysler", i,"American", o,"0",p);        	//Chrysler_Daytona
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Buick", i,"American", o,"0",p);          	//Buick_Roadmaster
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Volvo", i,"Swedish",o,"0",p);         		//Volvo_S80
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Porsche", i,"Germany", o,"0",p);    		//Porsche_Cayman
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Volkswagen", i,"Germany", o,"0",p);    	//Volkswagen_Beetle
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Bugatti", i,"French", o,"0",p);			//Bugatti_EB110		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Opel", i,"Germany", o,"0",p);  			//Opel_Zafira	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Saab", i,"Swedish", o,"0",p);    			//Saab_9000
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"McLaren", i,"British", o,"0",p);  			//McLaren_F1
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Audi", i,"Germany", o,"0",p); 				//Audi_R8	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Alfa_Romeo", i,"Italian", o,"0",p); 		//Alfa_Romeo_8c
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Ford", i,"American", o,"0",p);    			//Ford_Fiesta
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Infiniti", i,"Japanese", o,"0",p);       	//Infiniti_Q50
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Maserati", i,"Italian", o,"0",p);  		//Maserati_5000GT	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Mercedes_Benz", i,"Germany", o,"0",p);    	//Mercedes_Benz_CLA250	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Lamborghini", i,"Italian", o,"0",p);  		//Lamborghini_Gallardo		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Mazda", i,"Japanese", o,"0",p);           	//Mazda_RX7	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Mitsubishi", i,"Japanese", o,"0",p); 		//Mitsubishi_Colt
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Kia", i,"Korean", o,"0",p); 				//Kia_Sorento
			u += 4; i += 4; o +=4; p+= 4;
		
	}
		

		 	//CarsLv4 Mazda_MX6 = new CarsLv4("Type", "Mazda", "Japanese", 0);
		    //CarsLv4 Chrysler_Daytona = new CarsLv4("Type", "Chrysler", "American", 0);
		    //CarsLv4 Buick_Roadmaster = new CarsLv4("Type", "Buick", "American", 0);
		    //CarsLv4 Volvo_S80 = new CarsLv4("Type", "Volvo", "Swedish", 0);
		    //CarsLv4 Porsche_Cayman = new CarsLv4("Type", "Porsche", "Germany", 0);
		    //CarsLv4 Volkswagen_Beetle = new CarsLv4("Type", "Volkswagen", "Germany", 0);
		    //CarsLv4 Bugatti_EB110 = new CarsLv4("Type", "Bugatti", "French", 0);
		    //CarsLv4 Opel_Zafira = new CarsLv4("Type", "Opel", "Germany", 0);
		    //CarsLv4 Saab_9000 = new CarsLv4("Type", "Saab", "Swedish", 0);
		    //CarsLv4 McLaren_F1 = new CarsLv4("Type", "McLaren", "British", 0);
		    //CarsLv4 Audi_R8 = new CarsLv4("Type", "Audi", "Germany", 0);
		    //CarsLv4 Alfa_Romeo_8C = new CarsLv4("Type", "Alfa_Romeo", "Italian", 0);
		    //CarsLv4 Ford_Fiesta = new CarsLv4("Type", "Ford", "American", 0);
		    //CarsLv4 Infiniti_Q50 = new CarsLv4("Type", "Infiniti", "Japanese", 0);
		    //CarsLv4 Maserati_5000GT = new CarsLv4("Type", "Maserati", "Italian", 0);
		    //CarsLv4 Mercedes_Benz_CLA250 = new CarsLv4("Type", "Mercedes_Benz", "Germany", 0);
		    //CarsLv4 Lamborghini_Gallardo = new CarsLv4("Type", "Lamborghini", "Italian", 0);
		    //CarsLv4 Mazda_RX7 = new CarsLv4("Type", "Mazda", "Japanese", 0);
		    //CarsLv4 Mitsubishi_Colt = new CarsLv4("Type", "Mitsubishi", "Japanese", 0);
		    //CarsLv4 Kia_Sorento = new CarsLv4("Type", "Kia", "Korean", 0);
}
