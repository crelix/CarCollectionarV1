package Clicker;

public class CarLevel1Holder {


	//Public cars[] array 
	public String cars[] = new String[71];
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
		
		
		CarsMaker("Type", 0,"Acura", 1,"Japanese",2, "0",3);          //Acura_NSX
		CarsMaker("Type", 4,"Ford", 5,"American", 6,"0",7);           //Ford_Mustang
		CarsMaker("Type", 4,"Moskvich", 5,"Russian", 6,"0",7);        //Moskvich_412
		CarsMaker("Type", 8,"Kia", 9,"Korean", 10,"0",11);            //Kia_Venga
		CarsMaker("Type", 12,"Fiat", 13,"Italian", 14,"0",15);        //Fiat_1500
		CarsMaker("Type", 16,"Ferrari", 17,"Italian", 18,"0",19);     //Ferrari_Enzo
		CarsMaker("Type", 20,"Aston_Martin", 21,"British", 22,"0",23);//Aston_Martin_Rapide
		CarsMaker("Type", 24,"Koenigsegg", 25,"Swedish", 26,"0",27);  //Koenigsegg_CCX
		CarsMaker("Type", 28,"Honda", 29,"Japanese", 30,"0",31);      //Honda_Civic
		CarsMaker("Type", 32,"Cadilliac", 33,"American", 34,"0",35);  //Cadilliac_ATS
		CarsMaker("Type", 36,"Mitsubishi", 37,"Japanese", 38,"0",39); //Mitsubishi_LancerEvolutionX
		CarsMaker("Type", 40,"Infiniti", 41,"Japanese", 42,"0",43);   //Infiniti_FX
		CarsMaker("Type", 44,"Lancia", 45,"Italian", 46,"0",47);      //Lancia_Thema
		CarsMaker("Type", 48,"Volvo", 49,"Swedish", 50,"0",51);       //Volvo_XC90
		CarsMaker("Type", 52,"Acura", 53,"Japanese", 54,"0",55);      //Acura_CSX
		CarsMaker("Type", 56,"Saab", 57,"Swedish", 58,"0",59);        //Saab_SonettII
		CarsMaker("Type", 60,"Renault", 61,"French", 62,"0",63);      //Renault_Floride
		CarsMaker("Type", 64,"BMW", 65,"Germany", 66,"0",67);         //BMW_e34
		CarsMaker("Type", 68,"Chrysler", 69,"American", 70,"0",71);   //Chrysler_Cordoba
	
		
		

		
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
