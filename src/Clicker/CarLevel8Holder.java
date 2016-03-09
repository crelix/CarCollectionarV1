package Clicker;

public class CarLevel8Holder {

	public String cars[] = new String[80];

	public CarLevel8Holder(){
		
		
	}
	
	public void CarsMaker(String a1,int k, String a2,int k1, String a3,int k2,String a4,int k3){

		cars[k] = a1;
		cars[k1] = a2;
		cars[k2] = a3;
		cars[k3] = a4;
	}
		
		public void MakeCars(){
			
			int u = 0;int i = 1;int o = 2;int p = 3;
			CarsMaker("Type", u,"Bentley", i,"British",o, "0",p);        	//Bentley_Arnage
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Volvo", i,"Swedish", o,"0",p);       		//Volvo_850
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Toyota", i,"Japanese", o,"0",p);          	//Toyota_Rav4
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Ford", i,"American",o,"0",p);         		//Ford_Focus
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Chevrolet", i,"American", o,"0",p);   	    //Chevrolet_Spin
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Bentley", i,"British", o,"0",p);    	 	//Bentley_GTZ
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Lexus", i,"Japanese", o,"0",p);		 	//Lexus_LS
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Land_Rover", i,"British", o,"0",p);  		//Land_Rover_RangeRover	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Lexus", i,"Japanese", o,"0",p);    	 	//Lexus_GX
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Jeep", i,"American", o,"0",p);  		 	//Jeep_Wrangler
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Maserati", i,"Italian", o,"0",p); 			//Maserati_GranTurismo
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Koenigsegg", i,"Swedish", o,"0",p); 		//Koenigsegg_Agera
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Acura", i,"Japanese", o,"0",p);    		//Acura_MDX
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Audi", i,"Germany", o,"0",p);       	   	//Audi_RS6	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Cadilliac", i,"American", o,"0",p);  		//Cadilliac_DeVille
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"McLaren", i,"British", o,"0",p);    		//McLaren_Veneno
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Tesla", i,"American", o,"0",p);  			//Tesla_X
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Mercedes_Benz", i,"Germany", o,"0",p);     //Mercedes_Benz_G55	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Lancia", i,"Italian", o,"0",p); 			//Lancia_Lybra
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Infiniti", i,"Japanese", o,"0",p); 		//Infiniti_QX60
			u += 4; i += 4; o +=4; p+= 4;
		
	}
		

		 	//CarsLv8 Bentley_Arnage = new CarsLv8("Type", "Bentley", "British", 0);
		    //CarsLv8 Volvo_850 = new CarsLv8("Type", "Volvo", "Swedish", 0);
		    //CarsLv8 Toyota_Rav4 = new CarsLv8("Type", "Toyota", "Japanese", 0);
		    //CarsLv8 Ford_Focus = new CarsLv8("Type", "Ford", "American", 0);
		    //CarsLv8 Chevrolet_Spin = new CarsLv8("Type", "Chevrolet", "American", 0);
		    //CarsLv8 Bentley_GTZ = new CarsLv8("Type", "Bentley", "British", 0);
		    //CarsLv8 Lexus_LS = new CarsLv8("Type", "Lexus", "Japanese", 0);
		    //CarsLv8 Land_Rover_RangeRover = new CarsLv8("Type", "Land_Rover", "British", 0);
		    //CarsLv8 Lexus_GX = new CarsLv8("Type", "Lexus", "Japanese", 0);
		    //CarsLv8 Jeep_Wrangler = new CarsLv8("Type", "Jeep", "American", 0);
		    //CarsLv8 Maserati_GranTurismo = new CarsLv8("Type", "Maserati", "Italian", 0);
		    //CarsLv8 Koenigsegg_Agera = new CarsLv8("Type", "Koenigsegg", "Swedish", 0);
		    //CarsLv8 Acura_MDX = new CarsLv8("Type", "Acura", "Japanese", 0);
		    //CarsLv8 Audi_RS6 = new CarsLv8("Type", "Audi", "Germany", 0);
		    //CarsLv8 Cadilliac_DeVille = new CarsLv8("Type", "Cadilliac", "American", 0);
		    //CarsLv8 McLaren_Veneno = new CarsLv8("Type", "McLaren", "British", 0);
		    //CarsLv8 Tesla_X = new CarsLv8("Type", "Tesla", "American", 0);
		    //CarsLv8 Mercedes_Benz_G55 = new CarsLv8("Type", "Mercedes_Benz", "Germany", 0);
		    //CarsLv8 Lancia_Lybra = new CarsLv8("Type", "Lancia", "Italian", 0);
		    //CarsLv8 Infiniti_QX60 = new CarsLv8("Type", "Infiniti", "Japanese", 0);

}
