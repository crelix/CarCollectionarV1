package Clicker;

public class CarLevel7Holder {

	public Integer cars[] = new Integer[80];

	public CarLevel7Holder(){
		
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
			CarsMaker(0, u, 35, i, 4,o,  0,p);       //Lamborghini_Aventador
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 15, i, 1, o, 0,p);        	//Nissan_350z
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 24, i, 3, o, 0,p);          	//Jaguar_XJ6
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 39, i, 5,o, 0,p);         	//Renault_Clio
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 9, i, 1, o, 0,p);    		//Toyota_Avensis
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 17, i, 1, o, 0,p);    	 	//Subaru_Outback
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 46, i, 7, o, 0,p);		 		//Saab_900
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 23, i, 2, o, 0,p);  			//Opel_Vectra	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 5, i, 0, o, 0,p);    		//Chrysler_Charger
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 34, i, 4, o, 0,p);  		 	//Ferrari_348
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 42, i, 6, o, 0,p); 			//Hyundai_XG	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 10, i, 1, o, 0,p); 			//Lexus_RX
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 6, i, 0, o, 0,p);    		//Dodge_400
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 3, i, 0, o, 0,p);    			//GMC_Terrain
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 45, i, 7, o, 0,p);  			//Volvo_C70
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 4, i, 0, o, 0,p);    			//Ford_Sierra	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 17, i, 1, o, 0,p);  			//Subaru_Impreza
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 20, i, 2, o, 0,p);           	//BMW_e90	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 15, i, 1, o, 0,p); 			//Nissan_Skyline
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 18, i, 2, o, 0,p); 				//Audi_Q7
			u += 4; i += 4; o +=4; p+= 4;
			
	}
		
		 	//CarsLv7 Lamborghini_Aventador = new CarsLv7("Type", "Lamborghini", "Italian", 0);
		    //CarsLv7 Nissan_350z = new CarsLv7("Type", "Nissan", "Japanese", 0);
		    //CarsLv7 Jaguar_XJ6 = new CarsLv7("Type", "Jaguar", "British", 0);
		    //CarsLv7 Renault_Clio = new CarsLv7("Type", "Renault", "French", 0);
		    //CarsLv7 Toyota_Avensis = new CarsLv7("Type", "Toyota", "Japanese", 0);
		    //CarsLv7 Subaru_Outback = new CarsLv7("Type", "Subaru", "Japanese", 0);
		    //CarsLv7 Saab_900 = new CarsLv7("Type", "Saab", "Swedish", 0);
		    //CarsLv7 Opel_Vectra = new CarsLv7("Type", "Opel", "Germany", 0);
		    //CarsLv7 Chrysler_Charger = new CarsLv7("Type", "Chrysler", "American", 0);
		    //CarsLv7 Ferrari_348 = new CarsLv7("Type", "Ferrari", "Italian", 0);
		    //CarsLv7 Hyundai_XG = new CarsLv7("Type", "Hyundai", "Korean", 0);
		    //CarsLv7 Lexus_RX = new CarsLv7("Type", "Lexus", "Japanese", 0);
		    //CarsLv7 Dodge_400 = new CarsLv7("Type", "Dodge", "American", 0);
		    //CarsLv7 GMC_Terrain = new CarsLv7("Type", "GMC", "American", 0);
		    //CarsLv7 Volvo_C70 = new CarsLv7("Type", "Volvo", "Swedish", 0);
		    //CarsLv7 Ford_Sierra = new CarsLv7("Type", "Ford", "American", 0);
		    //CarsLv7 Subaru_Impreza = new CarsLv7("Type", "Subaru", "Japanese", 0);
		    //CarsLv7 BMW_e90 = new CarsLv7("Type", "BMW", "Germany", 0);
		    //CarsLv7 Nissan_Skyline = new CarsLv7("Type", "Nissan", "Japanese", 0);
		    //CarsLv7 Audi_Q7 = new CarsLv7("Type", "Audi", "Germany", 0);

}