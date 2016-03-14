package Clicker;

public class CarLevel10Holder {

	public Integer cars[] = new Integer[80];

	public CarLevel10Holder(){
		
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
			CarsMaker(0, u, 24, i, 3,o,  0,p);        	 //Jaguar_X_Type
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 34, i, 4, o, 0,p);       	 //Ferrari_308
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 11, i, 1, o, 0,p);          	 //Mazda_626
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 33, i, 4,o, 0,p);         	 //Maserati_Shamal
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 15, i, 1, o, 0,p);    		 //Nissan_240sx
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 32, i, 4, o, 0,p);    	 //Alfa_Romeo_4C
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 15, i, 1, o, 0,p);		 	 //Nissan_Juke
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 21, i, 2, o, 0,p);  		 //Volkswagen_Golf1
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 7, i, 0, o, 0,p);    	 		 //Jeep_Gladiator
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 6, i, 0, o, 0,p);  		 	 //Dodge_Matador
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 41, i, 5, o, 0,p); 			 //Bugatti_Royale	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 40, i, 5, o, 0,p); 			 //Citroen_CX
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 35, i, 4, o, 0,p);    	 //Lamborghini_350GT
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 14, i, 1, o, 0,p);    	 //Mitsubishi_GTO	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 2, i, 0, o, 0,p);  			 //Buick_Invicta
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 22, i, 2, o, 0,p);    		 //Porsche_911	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 17, i, 1, o, 0,p);  			 //Subaru_Forester	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 40, i, 5, o, 0,p);           	 //Citroen_BX	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 41, i, 5, o, 0,p); 			 //Bugatti_Type252
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 34, i, 4, o, 0,p); 			 //Ferrari_488
			u += 4; i += 4; o +=4; p+= 4;
		
	}
		
	    //CarsLv10 Jaguar_X_Type = new CarsLv10("Type", "Jaguar", "British", 0);
	    //CarsLv10 Ferrari_308 = new CarsLv10("Type", "Ferrari", "Italian", 0);
	    //CarsLv10 Mazda_626 = new CarsLv10("Type", "Mazda", "Japanese", 0);
	    //CarsLv10 Maserati_Shamal = new CarsLv10("Type", "Maserati", "Italian", 0);
	    //CarsLv10 Nissan_240sx = new CarsLv10("Type", "Nissan", "Japanese", 0);
	    //CarsLv10 Alfa_Romeo_4C = new CarsLv10("Type", "Alfa_Romeo", "Italian", 0);
	    //CarsLv10 Nissan_Juke = new CarsLv10("Type", "Nissan", "Japanese", 0);
	    //CarsLv10 Volkswagen_Golf1 = new CarsLv10("Type", "Volkswagen", "Germany", 0);
	    //CarsLv10 Jeep_Gladiator = new CarsLv10("Type", "Jeep", "American", 0);
	    //CarsLv10 Dodge_Matador = new CarsLv10("Type", "Dodge", "American", 0);
	    //CarsLv10 Bugatti_Royale = new CarsLv10("Type", "Bugatti", "French", 0);
	    //CarsLv10 Citroen_CX = new CarsLv10("Type", "Citroen", "French", 0);
	    //CarsLv10 Lamborghini_350GT = new CarsLv10("Type", "Lamborghini", "Italian", 0);
	    //CarsLv10 Mitsubishi_GTO = new CarsLv10("Type", "Mitsubishi", "Japanese", 0);
	    //CarsLv10 Buick_Invicta = new CarsLv10("Type", "Buick", "American", 0);
	    //CarsLv10 Porsche_911 = new CarsLv10("Type", "Porsche", "Germany", 0);
	    //CarsLv10 Subaru_Forester = new CarsLv10("Type", "Subaru", "Japanese", 0);
	    //CarsLv10 Citroen_BX = new CarsLv10("Type", "Citroen", "French", 0);
	    //CarsLv10 Bugatti_Type252 = new CarsLv10("Type", "Bugatti", "French", 0);
	    //CarsLv10 Ferrari_488 = new CarsLv10("Type", "Ferrari", "Italian", 0);

}
