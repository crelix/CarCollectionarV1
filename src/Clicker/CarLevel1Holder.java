package Clicker;

public class CarLevel1Holder {


	//Public cars[] array. 
	public String cars[] = new String[76];
	//Constructor ja nu kas
	public CarLevel1Holder(){
		
		
	}
	
	
	//Void Funkcija kura saglaba masinas cars array
	//Viena masina aiznem no array 3 vietas
	//CarsMaker void funckija darbojas , ka panem String tad ievada int kura array vieta vajag ievadit to String
	public void CarsMaker(String a1,int k, String a2,int k1, String a3,int k2,String a4,int k3){
//panem k integer kurs ir ievadits un a1 string tiek ielikts cars array k vieta
cars[k] = a1;
cars[k1] = a2;
cars[k2] = a3;
cars[k3] = a4;

	}
	
	
	//Izveido masinas saja funkcija 
	public void MakeCars(){
		
		//DROSVIEN KA BIJA VIEGLAKS CELS CAUR FOR LOOP TO DARIT BET MAN SLINKUMS DOMAT KA VINU TAISIT
		
		
		int u = 0;int i = 1;int o = 2;int p = 3; //Izveido integer lai velak liekot array nesajauktu array 
		CarsMaker("Type", u,"Acura", i,"Japanese",o, "0",p);          //Acura_NSX
		 u += 4; i += 4; o +=4; p+= 4; //Pieskaita +4 pie katra variable jo katrs nakamais atrodas 4 vietas talak
		CarsMaker("Type", u,"Ford", i,"American", o,"0",p);           //Ford_Mustang
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Moskvich", i,"Russian", o,"0",p);        //Moskvich_412
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Kia", i,"Korean",o,"0",p);            //Kia_Venga
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Fiat", i,"Italian", o,"0",p);        //Fiat_1500
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Ferrari", i,"Italian", o,"0",p);     //Ferrari_Enzo
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Aston_Martin", i,"British", o,"0",p);//Aston_Martin_Rapide
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Koenigsegg", i,"Swedish", o,"0",p);  //Koenigsegg_CCX
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Honda", i,"Japanese", o,"0",p);      //Honda_Civic
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Cadilliac", i,"American", o,"0",p);  //Cadilliac_ATS
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Mitsubishi", i,"Japanese", o,"0",p); //Mitsubishi_LancerEvolutionX
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Infiniti", i,"Japanese", o,"0",p);   //Infiniti_FX
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Lancia", i,"Italian", o,"0",p);      //Lancia_Thema
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Volvo", i,"Swedish", o,"0",p);       //Volvo_XC90
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Acura", i,"Japanese", o,"0",p);      //Acura_CSX
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Saab", i,"Swedish", o,"0",p);        //Saab_SonettII
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Renault", i,"French", o,"0",p);      //Renault_Floride
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"BMW", i,"Germany", o,"0",p);         //BMW_e34
		 u += 4; i += 4; o +=4; p+= 4;
		CarsMaker("Type", u,"Chrysler", i,"American", o,"0",p);   //Chrysler_Cordoba
	
		
		

		
// ATSTAJU JA NU KAS, ja nu atpakal gribi likt tos CarsLV constructors		
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
