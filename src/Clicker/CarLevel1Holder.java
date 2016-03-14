package Clicker;

public class CarLevel1Holder {


	public Integer cars[] = new Integer[80];

	public CarLevel1Holder(){
		
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
		CarsMaker(0, u, 27, i, 3, o, 0, p);	  //Aston_Martin_DB9
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 13, i, 1,o, 0,p);          //Acura_NSX
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 4, i, 0, o, 0,p);           //Ford_Mustang
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 49, i, 8, o, 0,p);        //Moskvich_412
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 43, i, 6,o, 0,p);            	  //Kia_Venga
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 31, i, 4, o, 0,p);        	  //Fiat_1500
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 34, i, 4, o, 0,p);    	  //Ferrari_Enzo
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 27, i, 3, o, 0,p);	  //Aston_Martin_Rapide
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 44, i, 7, o, 0,p); 	  //Koenigsegg_CCX
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 12, i, 1, o, 0,p);     	  //Honda_Civic
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 1, i, 0, o, 0,p); 	  //Cadilliac_ATS
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 14, i, 1, o, 0,p);	  //Mitsubishi_LancerEvolutionX
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 16, i, 1, o, 0,p);  	  //Infiniti_FX
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 37, i, 4, o, 0,p);   	      //Lancia_Thema
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 45, i, 7, o, 0,p);    	      //Volvo_XC90
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 13, i, 1, o, 0,p);  	      //Acura_CSX
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 46, i, 7, o, 0,p);     	      //Saab_SonettII
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 39, i, 5, o, 0,p);   	      //Renault_Floride
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 20, i, 2, o, 0,p);      	      //BMW_e34
		u += 4; i += 4; o +=4; p+= 4;
		CarsMaker(0, u, 5, i, 0, o, 0,p);	      //Chrysler_Cordoba
		u += 4; i += 4; o +=4; p+=4;
	
		
		

//      CarsLv1 Aston_Martin_DB9 = new CarsLv1("Type", "Aston_Martin", "British", 0);		
//	    CarsLv1 Acura_NSX = new CarsLv1("Type", "Acura", "Japanese", 0);
//	    CarsLv1 Ford_Mustang = new CarsLv1("Type", "Ford", "American", 0);
//	    CarsLv1 Moskvich_412 = new CarsLv1("Type", "Moskvich", "Russian", 0);
//	    CarsLv1 Kia_Venga = new CarsLv1("Type", "Kia", "Korean", 0);
//	    CarsLv1 Fiat_1500 = new CarsLv1("Type", "Fiat", "Italian", 0);
//	    CarsLv1 Ferrari_Enzo = new CarsLv1("Type", "Ferrari", "Italian", 0);
//	    CarsLv1 Aston_Martin_Rapide = new CarsLv1("Type", "Aston_Martin", "British", 0);
//	    CarsLv1 Koenigsegg_CCX = new CarsLv1("Type", "Koenigsegg", "Swedish", 0);
//	    CarsLv1 Honda_Civic = new CarsLv1("Type", "Honda", "Japanese", 0);
//	    CarsLv1 Cadilliac_ATS = new CarsLv1("Type", "Cadilliac", "American", 0);
//	    CarsLv1 Mitsubishi_LancerEvolutionX = new CarsLv1("Type", "Mitsubishi", "Japanese", 0);
//	    CarsLv1 Infiniti_FX = new CarsLv1("Type", "Infiniti", "Japanese", 0);
//	    CarsLv1 Lancia_Thema = new CarsLv1("Type", "Lancia", "Italian", 0);
//	    CarsLv1 Volvo_XC90 = new CarsLv1("Type", "Volvo", "Swedish",  0);
//	    CarsLv1 Acura_CSX = new CarsLv1("Type", "Acura", "Japanese", 0);
//	    CarsLv1 Saab_SonettII = new CarsLv1("Type", "Saab", "Swedish", 0);
//	    CarsLv1 Renault_Floride = new CarsLv1("Type", "Renault", "French", 0);
//	    CarsLv1 BMW_e34 = new CarsLv1("Type", "BMW", "Germany", 0);
//	    CarsLv1 Chrysler_Cordoba = new CarsLv1("Type", "Chrysler", "American", 0);
		
		
	}
	
}
