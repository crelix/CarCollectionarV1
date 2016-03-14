package Clicker;

public class CarLevel6Holder {

	public Integer cars[] = new Integer[80];

	public CarLevel6Holder(){
		
		MakeCars();
	}
	
	public void CarsMaker(int a1,int k, int a2,int k1, int a3,int k2,int a4,int k3){

		cars[k] = a1;
		cars[k1] = a2;
		cars[k2] = a3;
		cars[k3] = a4;
	}
		
		public void MakeCars(){
			
			int u = 0;int i = 1;int o = 2;int p = 3;
			CarsMaker(0, u, 29, i, 3,o,  0,p);       //Rolls_Royce_Phantom
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 9, i, 1, o, 0,p);        	//Toyota_86
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 20, i, 2, o, 0,p);          	 	//BMW_e70
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 5, i, 0,o, 0,p);         	//Chrysler_Voyager
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 29, i, 3, o, 0,p);    	//Rolls_Royce_PhantomIII
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 12, i, 1, o, 0,p);    	 	//Honda_CRX
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 17, i, 1, o, 0,p);		 	//Subaru_1000
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 1, i, 0, o, 0,p);  		//Cadilliac_Eldorado
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 25, i, 3, o, 0,p);    	//Land_Rover_Freelander
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 39, i, 5, o, 0,p);  		 	//Renault_Spider
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 48, i, 8, o, 0,p); 				//Gaz_21	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 13, i, 1, o, 0,p); 			//Acura_EL
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 41, i, 5, o, 0,p);    		//Bugatti_Veyron
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 19, i, 2, o, 0,p);    	//Mercedes_Benz_SL600
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 29, i, 3, o, 0,p);  		//Rolls_Royce_Silver
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 26, i, 3, o, 0,p);    			//Mini_Paceman
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 42, i, 6, o, 0,p);  			//Hyundai_Excel
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 48, i, 8, o, 0,p);           	//Gaz_24	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 38, i, 5, o, 0,p); 			//Peugeot_107
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 18, i, 2, o, 0,p); 				//Audi_A4
			u += 4; i += 4; o +=4; p+= 4;
			
	}
		
		 	//CarsLv6 Rolls_Royce_Phantom = new CarsLv6("Type", "Rolls_Royce", "British", 0);
		    //CarsLv6 Toyota_86 = new CarsLv6("Type", "Toyota", "Japanese", 0);
		    //CarsLv6 BMW_e70 = new CarsLv6("Type", "BMW", "Germany", 0);
		    //CarsLv6 Chrysler_Voyager = new CarsLv6("Type", "Chrysler", "American", 0);
		    //CarsLv6 Rolls_Royce_PhantomIII = new CarsLv6("Type", "Rolls_Royce", "British", 0);
		    //CarsLv6 Honda_CRX = new CarsLv6("Type", "Honda", "Japanese", 0);
		    //CarsLv6 Subaru_1000 = new CarsLv6("Type", "Subaru", "Japanese", 0);
		    //CarsLv6 Cadilliac_Eldorado = new CarsLv6("Type", "Cadilliac", "American", 0);
		    //CarsLv6 Land_Rover_Freelander = new CarsLv6("Type", "Land_Rover", "British", 0);
		    //CarsLv6 Renault_Spider = new CarsLv6("Type", "Renault", "French", 0);
		    //CarsLv6 Gaz_21 = new CarsLv6("Type", "GAZ", "Russian", 0);
		    //CarsLv6 Acura_EL = new CarsLv6("Type", "Acura", "Japanese", 0);
		    //CarsLv6 Bugatti_Veyron = new CarsLv6("Type", "Bugatti", "French", 0);
		    //CarsLv6 Mercedes_Benz_SL600 = new CarsLv6("Type", "Mercedes_Benz", "Germany", 0);
		    //CarsLv6 Rolls_Royce_Silver = new CarsLv6("Type", "Rolls_Royce", "British", 0);
		    //CarsLv6 Mini_Paceman = new CarsLv6("Type", "Mini", "British", 0);
		    //CarsLv6 Hyundai_Excel = new CarsLv6("Type", "Hyundai", "Korean", 0);
		    //CarsLv6 Gaz_24 = new CarsLv6("Type", "GAZ", "Russian", 0);
		    //CarsLv6 Peugeot_107 = new CarsLv6("Type", "Peugeot", "French", 0);
		    //CarsLv6 Audi_A4 = new CarsLv6("Type", "Audi", "Germany", 0);

}
