package Clicker;

public class CarLevel9Holder {

	public Integer cars[] = new Integer[80];

	public CarLevel9Holder(){
		
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
			CarsMaker(0, u, 43, i, 6,o,  0,p);        	//Kia_Forte
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 37, i, 4, o, 0,p);        //Lancia_Voyager
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 22, i, 2, o, 0,p);       //Porsche_Cayenne
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 30, i, 3,o, 0,p);  	 	//McLaren_650s
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 24, i, 3, o, 0,p);    	//Jaguar_E_Type
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 38, i, 5, o, 0,p);    	//Peugeot_601
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 24, i, 3, o, 0,p);		//Jaguar_F_Type
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 31, i, 4, o, 0,p);  		//Fiat_Doblo	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 47, i, 8, o, 0,p);    	 	//Vaz_2103
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 30, i, 3, o, 0,p);  		//McLaren_P1
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 38, i, 5, o, 0,p); 		//Peugeot_405
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 3, i, 0, o, 0,p); 			//GMC_Envoy
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 0, i, 0, o, 0,p);    //Chevrolet_Corvete
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 36, i, 4, o, 0,p);       	//Pagani_Huayra	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 49, i, 8, o, 0,p);  	//Moskvich_402
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 32, i, 4, o, 0,p);    //Alfa_Romeo_159
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 39, i, 5, o, 0,p);  		//Renault_Fregate
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 26, i, 3, o, 0,p);          //Mini_Coopet
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 6, i, 0, o, 0,p); 		//Dodge_Viper
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 47, i, 8, o, 0,p); 			//Vaz_Niva
			u += 4; i += 4; o +=4; p+= 4;
		
	}
		
		 	//CarsLv9 Kia_Forte = new CarsLv9("Type", "Kia", "Korean", 0);
		    //CarsLv9 Lancia_Voyager = new CarsLv9("Type", "Lancia", "Italian", 0);
		    //CarsLv9 Porsche_Cayenne = new CarsLv9("Type", "Porsche", "Germany", 0);
		    //CarsLv9 McLaren_650s = new CarsLv9("Type", "McLaren", "British", 0);
		    //CarsLv9 Jaguar_E_Type = new CarsLv9("Type", "Jaguar", "British", 0);
		    //CarsLv9 Peugeot_601 = new CarsLv9("Type", "Peugeot", "French", 0);
		    //CarsLv9 Jaguar_F_Type = new CarsLv9("Type", "Jaguar", "British", 0);
		    //CarsLv9 Fiat_Doblo = new CarsLv9("Type", "Fiat", "Italian", 0);
		    //CarsLv9 Vaz_2101 = new CarsLv9("Type", "Lada", "Russian", 0);
		    //CarsLv9 McLaren_P1 = new CarsLv9("Type", "McLaren", "British", 0);
		    //CarsLv9 Peugeot_405 = new CarsLv9("Type", "Peugeot", "French", 0);
		    //CarsLv9 GMC_Envoy = new CarsLv9("Type", "GMC", "American", 0);
		    //CarsLv9 Chevrolet_Corvete = new CarsLv9("Type", "Chevrolet", "American", 0);
		    //CarsLv9 Pagani_Huayra = new CarsLv9("Type", "Pagani", "Italian", 0);
		    //CarsLv9 Moskvich_402 = new CarsLv9("Type", "Moskvich", "Russian", 0);
		    //CarsLv9 Alfa_Romeo_159 = new CarsLv9("Type", "Alfa_Romeo", "Italian", 0);
		    //CarsLv9 Renault_Fregate = new CarsLv9("Type", "Renault", "French", 0);
		    //CarsLv9 Mini_Cooper = new CarsLv9("Type", "Mini", "British", 0);
		    //CarsLv9 Dodge_Viper = new CarsLv9("Type", "Dodge", "American", 0);
		    //CarsLv9 Vaz_Niva = new CarsLv9("Type", "Lada", "Russian", 0);

}
