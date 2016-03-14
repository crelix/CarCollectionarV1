package Clicker;

public class CarLevel3Holder {

	public Integer cars[] = new Integer[80];

	public CarLevel3Holder(){
		
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
			CarsMaker(0, u, 26, i, 3,o,  0,p);        	//Mini_Moke
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 43, i, 6, o, 0,p);        	//Kia_Rondo
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 3, i, 0, o, 0,p);          //GMC_Suburban	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 12, i, 1,o, 0,p);         //Honda_Prelude	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 40, i, 5, o, 0,p);    	//Citroen_Saxo
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 21, i, 2, o, 0,p);    //Volkswagen_Tiguan
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 21, i, 2, o, 0,p);	//Volkswagen_Phaeton	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 2, i, 0, o, 0,p);  		//Buick_Centry	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 25, i, 3, o, 0,p);    //Land_Rover_Discovery
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 16, i, 1, o, 0,p);  	//Infiniti_Etherea
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 38, i, 5, o, 0,p); 		//Peugeot_308		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 9, i, 1, o, 0,p); 		//Toyota_Auris
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 36, i, 4, o, 0,p);    	//Pagani_ZondaF	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 37, i, 4, o, 0,p);       	//Lancia_Phedra		
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 0, i, 0, o, 0,p);  	//Chevrolet_Impala
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 22, i, 2, o, 0,p);    	//Porsche_Boxster
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 27, i, 3, o, 0,p);  //Aston_Martin_DB6	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 47, i, 8, o, 0,p);           //Vaz_2103	
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 42, i, 6, o, 0,p); 		//Hyundai_Mistra
			u += 4; i += 4; o +=4; p+= 4;
			CarsMaker(0, u, 26, i, 3, o, 0,p); 			//Mini_CountryMan
			u += 4; i += 4; o +=4; p+= 4;
		
	}
		

	    //CarsLv3 Mini_Moke = new CarsLv3("Type", "Mini", "British", 0);
	    //CarsLv3 Kia_Rondo = new CarsLv3("Type", "Kia", "Korean", 0);
	    //CarsLv3 GMC_Suburban = new CarsLv3("Type", "GMC", "American", 0);
	    //CarsLv3 Honda_Prelude = new CarsLv3("Type", "Honda", "Japanese", 0);
	    //CarsLv3 Citroen_Saxo = new CarsLv3("Type", "Citroen", "French", 0);
	    //CarsLv3 Volkswagen_Tiguan = new CarsLv3("Type", "Volkswagen", "Germany", 0);
	    //CarsLv3 Volkswagen_Phaeton = new CarsLv3("Type", "Volkswagen", "Germany", 0);
	    //CarsLv3 Buick_Centry = new CarsLv3("Type", "Buick", "American", 0);
	    //CarsLv3 Land_Rover_Discovery = new CarsLv3("Type", "Land_Rover", "British", 0);
	    //CarsLv3 Infiniti_Etherea = new CarsLv3("Type", "Infiniti", "Japanese", 0);
	    //CarsLv3 Peugeot_308 = new CarsLv3("Type", "Peugeot", "French", 0);
	    //CarsLv3 Toyota_Auris = new CarsLv3("Type", "Toyota", "Japanese", 0);
	    //CarsLv3 Pagani_ZondaF = new CarsLv3("Type", "Pagani", "Italian", 0);
	    //CarsLv3 Lancia_Phedra = new CarsLv3("Type", "Lancia", "Italian", 0);
	    //CarsLv3 Chevrolet_Impala = new CarsLv3("Type", "Chevrolet", "American", 0);
	    //CarsLv3 Porsche_Boxster = new CarsLv3("Type", "Porsche", "Germany", 0);
	    //CarsLv3 Aston_Martin_DB6 = new CarsLv3("Type", "Aston_Martin", "British", 0);
	    //CarsLv3 Vaz_2103 = new CarsLv3("Type", "Lada", "Russian", 0);
	    //CarsLv3 Hyundai_Mistra = new CarsLv3("Type", "Hyundai", "Korean", 0);
	    //CarsLv3 Mini_Countryman = new CarsLv3("Type", "Mini", "British", 0);
}
