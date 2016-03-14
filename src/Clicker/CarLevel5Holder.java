package Clicker;

public class CarLevel5Holder {

	public Integer  cars[] = new Integer [80];

	public CarLevel5Holder(){
		
		MakeCars();
	}
	
	public void CarsMaker(int a1,int k, int a2,int k1, int  a3,int k2,int  a4,int k3){

		cars[k] = a1;
		cars[k1] = a2;
		cars[k2] = a3;
		cars[k3] = a4;
	}
		
		public void MakeCars(){
			
			int u = 0;int i = 1;int o = 2;int p = 3;
			CarsMaker(0, u, 29, i, 3,o,  0,p);        //Rolls_Royce_Wraith
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 35, i, 4, o, 0,p);        //Lamborghini_Diablo
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 7, i, 0, o, 0,p);          	 //Jeep_Scrambler
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 28, i, 3,o, 0,p);         	 //Bentley_Continental
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 28, i, 3, o, 0,p);    		 //Bentley_Azure
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 44, i, 7, o, 0,p);    	 //Koenigsegg_One
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 1, i, 0, o, 0,p);		 //Cadilliac_XTS
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 31, i, 4, o, 0,p);  			 //Fiat_500		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 14, i, 1, o, 0,p);    	 //Mitsubishi_Pajero
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 49, i, 8, o, 0,p);  		 //Moskvich_2140
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 23, i, 2, o, 0,p); 				 //Opel_GT		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 42, i, 6, o, 0,p); 			 //Hyundai_Getz
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 33, i, 4, o, 0,p);    		 //Maserati_Coupe
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 12, i, 1, o, 0,p);       	   	 //Honda_S2000	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 32, i, 4, o, 0,p);  		 //Alfa_Romeo_Spider
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 20, i, 2, o, 0,p);    			 //BMW_M5	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 20, i, 2, o, 0,p);  				 //BMW_I8	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 40, i, 5, o, 0,p);           	 //Citroen_C5	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 31, i, 4, o, 0,p); 				 //Fiat_Punto
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 18, i, 2, o, 0,p); 				 //Audi_100
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
