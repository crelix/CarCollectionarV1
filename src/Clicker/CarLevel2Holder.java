package Clicker;

public class CarLevel2Holder {

	public String cars[] = new String[80];

	public CarLevel2Holder(){
		
		
	}
	
	public void CarsMaker(String a1,int k, String a2,int k1, String a3,int k2,String a4,int k3){

		cars[k] = a1;
		cars[k1] = a2;
		cars[k2] = a3;
		cars[k3] = a4;
	}
		
		public void MakeCars(){
			
			int u = 0;int i = 1;int o = 2;int p = 3;
			CarsMaker("Type", u,"Buick", i,"American",o, "0",p);        //Buick_Riviera
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Tesla", i,"American", o,"0",p);        //Tesla_Roadster
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Audi", i,"Germany", o,"0",p);          //Audi_80	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"BMW", i,"Germany",o,"0",p);            //BMW_e36	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Volkswagen", i,"Germany", o,"0",p);    //Volkswagen_Scirocco	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Mazda", i,"Japanese", o,"0",p);     	//Mazda_3	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Chevrolet", i,"American", o,"0",p);	//Chevrolet_Viking		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Tesla", i,"American", o,"0",p);  		//Tesla_S		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Jeep", i,"American", o,"0",p);      	//Jeep_ZJ	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Dodge", i,"American", o,"0",p);  		//Dodge_Neon
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"BMW", i,"Germany", o,"0",p); 			//BMW_e30		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Mercedes_Benz", i,"Germany", o,"0",p); //Mercedes_Benz_W123
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Land_Rover", i,"British", o,"0",p);    //Land_Rover_Defender	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Saab", i,"Swedish", o,"0",p);       	//Saab_9_5			
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Aston_Martin", i,"British", o,"0",p);  //Aston_Martin_One	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Koenigsegg", i,"Swedish", o,"0",p);    //Koenigsegg_Regera	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Lexus", i,"Japanese", o,"0",p);      	//Lexus_IS		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"GMC", i,"American", o,"0",p);          //GMC_Yukon		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Opel", i,"Germany", o,"0",p); 		    //Opel_Astra
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Audi", i,"Germany", o,"0",p); 			//Audi_Coupe
			u += 4; i += 4; o +=4; p+= 4;
		
	}
		
			//CarsLv2 Buick_Riviera = new CarsLv2("Type", "Buick", "American", 0);
			//CarsLv2 Tesla_Roadster = new CarsLv2("Type", "Tesla", "American", 0);
		    //CarsLv2 Audi_80 = new CarsLv2("Type", "Audi", "Germany", 0);
		    //CarsLv2 BMW_e36 = new CarsLv2("Type", "BMW", "Germany", 0);
		    //CarsLv2 Volkswagen_Scirocco = new CarsLv2("Type", "Volkswagen", "Germany", 0);
		    //CarsLv2 Mazda_3 = new CarsLv2("Type", "Mazda", "Japanese", 0);
		    //CarsLv2 Chevrolet_Viking = new CarsLv2("Type", "Chevrolet", "American", 0);
		    //CarsLv2 Tesla_s = new CarsLv2("Type", "Tesla", "American", 0);
		    //CarsLv2 Jeep_ZJ = new CarsLv2("Type", "Jeep", "American", 0);
		    //CarsLv2 Dodge_Neon = new CarsLv2("Type", "Dodge", "American", 0);
		    //CarsLv2 BMW_e30 = new CarsLv2("Type", "BMW", "Germany", 0);
		    //CarsLv2 Mercedes_Benz_W123 = new CarsLv2("Type", "Mercedes_Benz", "Germany", 0);
		    //CarsLv2 Land_Rover_Defender = new CarsLv2("Type", "Land_Rover", "British", 0);
		    //CarsLv2 Saab_9_5 = new CarsLv2("Type", "Saab", "Swedish", 0);
		    //CarsLv2 Aston_Martin_One = new CarsLv2("Type", "Aston_Martin", "British", 0);
		    //CarsLv2 Koenigsegg_Regera = new CarsLv2("Type", "Koenigsegg", "Swedish", 0);
		    //CarsLv2 Lexus_IS = new CarsLv2("Type", "Lexus", "Japanese", 0);
		    //CarsLv2 GMC_Yukon = new CarsLv2("Type", "GMC", "American", 0);
		    //CarsLv2 Opel_Astra = new CarsLv2("Type", "Opel", "Germany", 0);
		    //CarsLv2 Audi_Coupe = new CarsLv2("Type", "Audi", "Germany", 0);
}
