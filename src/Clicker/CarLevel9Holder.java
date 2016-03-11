package Clicker;

public class CarLevel9Holder {

	public String cars[] = new String[80];

	public CarLevel9Holder(){
		
		
	}
	
	public void CarsMaker(String a1,int k, String a2,int k1, String a3,int k2,String a4,int k3){

		cars[k] = a1;
		cars[k1] = a2;
		cars[k2] = a3;
		cars[k3] = a4;
	}
		
		public void MakeCars(){
			
			int u = 0;int i = 1;int o = 2;int p = 3;
			CarsMaker("Type", u,"Kia", i,"Korean",o, "0",p);        	//Kia_Forte
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Lancia", i,"Italian", o,"0",p);        //Lancia_Voyager
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Porsche", i,"Germany", o,"0",p);       //Porsche_Cayenne
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"McLaren", i,"British",o,"0",p);  	 	//McLaren_650s
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Jaguar", i,"British", o,"0",p);    	//Jaguar_E_Type
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Peugeot", i,"French", o,"0",p);    	//Peugeot_601
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Jaguar", i,"British", o,"0",p);		//Jaguar_F_Type
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Fiat", i,"Italian", o,"0",p);  		//Fiat_Doblo	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Vaz", i,"Russian", o,"0",p);    	 	//Vaz_2103
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"McLaren", i,"British", o,"0",p);  		//McLaren_P1
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Peugeot", i,"French", o,"0",p); 		//Peugeot_405
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"GMC", i,"American", o,"0",p); 			//GMC_Envoy
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Chevrolet", i,"American", o,"0",p);    //Chevrolet_Corvete
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Pagani", i,"Italian", o,"0",p);       	//Pagani_Huayra	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Moskvich", i,"Russian", o,"0",p);  	//Moskvich_402
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Alfa_Romeo", i,"Italian", o,"0",p);    //Alfa_Romeo_159
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Renault", i,"French", o,"0",p);  		//Renault_Fregate
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Mini", i,"British", o,"0",p);          //Mini_Coopet
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Dodge", i,"American", o,"0",p); 		//Dodge_Viper
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker("Type", u,"Vaz", i,"Russian", o,"0",p); 			//Vaz_Niva
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
