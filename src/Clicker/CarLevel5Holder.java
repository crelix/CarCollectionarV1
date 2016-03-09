package Clicker;

public class CarLevel5Holder {

	public String cars[] = new String[80];

	public CarLevel5Holder(){
		
		
	}
	
	public void CarsMaker(String a1,int k, String a2,int k1, String a3,int k2,String a4,int k3){

		cars[k] = a1;
		cars[k1] = a2;
		cars[k2] = a3;
		cars[k3] = a4;
	}
		
		public void MakeCars(){
			
			int u = 0;int i = 1;int o = 2;int p = 3;
			CarsMaker("Type", u,"Rolls_Royce", i,"British",o, "0",p);        //Rolls_Royce_Wraith
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Lamborghini", i,"Italian", o,"0",p);        //Lamborghini_Diablo
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Jeep", i,"American", o,"0",p);          	 //Jeep_Scrambler
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Bentley", i,"British",o,"0",p);         	 //Bentley_Continental
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Bentley", i,"British", o,"0",p);    		 //Bentley_Azure
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Koenigsegg", i,"Swedish", o,"0",p);    	 //Koenigsegg_One
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Cadilliac", i,"American", o,"0",p);		 //Cadilliac_XTS
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Fiat", i,"Italian", o,"0",p);  			 //Fiat_500		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Mitsubishi", i,"Japanese", o,"0",p);    	 //Mitsubishi_Pajero
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Moskvich", i,"Russian", o,"0",p);  		 //Moskvich_2140
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Opel", i,"Germany", o,"0",p); 				 //Opel_GT		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Hyundai", i,"Korean", o,"0",p); 			 //Hyundai_Getz
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Maserati", i,"Italian", o,"0",p);    		 //Maserati_Coupe
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Honda", i,"Japanese", o,"0",p);       	   	 //Honda_S2000	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Alfa_Romeo", i,"Italian", o,"0",p);  		 //Alfa_Romeo_Spider
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"BMW", i,"Germany", o,"0",p);    			 //BMW_M5	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"BMW", i,"Germany", o,"0",p);  				 //BMW_I8	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Citroen", i,"French", o,"0",p);           	 //Citroen_C5	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Fiat", i,"Italian", o,"0",p); 				 //Fiat_Punto
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Audi", i,"Germany", o,"0",p); 				 //Audi_100
			u += 4; i += 4; o +=4; p+= 4;
		
	}
		

		//CarsLv5 Rolls_Royce_Wraith = new CarsLv5("Type", "Rolls_Royce", "British", 0);
	    //CarsLv5 Lamborghini_Diablo = new CarsLv5("Type", "Lamborghini", "Italian", 0);
	    //CarsLv5 Jeep_Scrambler = new CarsLv5("Type", "Jeep", "American", 0);
	    //CarsLv5 Bentley_Continental = new CarsLv5("Type", "Bentley", "British", 0);
	    //CarsLv5 Bentley_Azure = new CarsLv5("Type", "Bentley", "British", 0);
	    //CarsLv5 Koenigsegg_One = new CarsLv5("Type", "Koenigsegg", "Swedish", 0);
	    //CarsLv5 Cadilliac_XTS = new CarsLv5("Type", "Cadilliac", "American", 0);
	    //CarsLv5 Fiat_500 = new CarsLv5("Type", "Fiat", "Italian", 0);
	    //CarsLv5 Mitsubishi_Pajero = new CarsLv5("Type", "Mitsubishi", "Japanese", 0);
	    //CarsLv5 Moskvich_2140 = new CarsLv5("Type", "Moskvich", "Russian", 0);
	    //CarsLv5 Opel_GT = new CarsLv5("Type", "Opel", "Germany", 0);
	    //CarsLv5 Hyundai_Getz = new CarsLv5("Type", "Hyundai", "Korean", 0);
	    //CarsLv5 Maserati_Coupe = new CarsLv5("Type", "Maserati", "Italian", 0);
	    //CarsLv5 Honda_S2000 = new CarsLv5("Type", "Honda", "Japanese", 0);
	    //CarsLv5 Alfa_Romeo_Spider = new CarsLv5("Type", "Alfa_Romeo", "Italian", 0 );
	    //CarsLv5 BMW_M5 = new CarsLv5("Type", "BMW", "Germany", 0);
	    //CarsLv5 BMW_I8 = new CarsLv5("Type", "BMW", "Germany", 0);
	    //CarsLv5 Citroen_C5 = new CarsLv5("Type", "Citroen", "French", 0);
	    //CarsLv5 Fiat_Punto = new CarsLv5("Type", "Fiat", "Italian", 0);
	    //CarsLv5 Audi_100 = new CarsLv5("Type", "Audi", "Germany", 0);
}
