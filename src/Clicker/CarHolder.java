package Clicker;

public class CarHolder {


	
	public String cars[] = new String[100];
	
	public CarHolder(){
		
		 
		
	}
	public void CarsMaker(String a1,int k, String a2,int k1, String a3,int k2,String a4,int k3){
cars[k] = a1;
cars[k1] = a2;
cars[k2] = a3;
cars[k3] = a4;

	}
	
	
	
	public void MakeCars(){
		
		
		CarsMaker("Type", 0,"Aston_Martin", 1,"British",2, "0",3);
		CarsMaker("Type", 4,"Acura", 5,"Japanese", 6,"0",7);
		
	    CarsLv1 Acura_NSX = new CarsLv1("Type", "Acura", "Japanese", 0);
	    CarsLv1 Ford_Mustang = new CarsLv1("Type", "Ford", "American", 0);
	    CarsLv1 Moskvich_412 = new CarsLv1("Type", "Moskvich", "Russian", 0);
	    CarsLv1 Kia_Venga = new CarsLv1("Type", "Kia", "Korean", 0);
	    CarsLv1 Fiat_1500 = new CarsLv1("Type", "Fiat", "Italian", 0);
	    CarsLv1 Ferrari_Enzo = new CarsLv1("Type", "Ferrari", "Italian", 0);
	    CarsLv1 Aston_Martin_Rapide = new CarsLv1("Type", "Aston_Martin", "British", 0);
	    CarsLv1 Koenigsegg_CCX = new CarsLv1("Type", "Koenigsegg", "Swedish", 0);
	    CarsLv1 Honda_Civic = new CarsLv1("Type", "Honda", "Japanese", 0);
	    CarsLv1 Cadilliac_ATS = new CarsLv1("Type", "Cadilliac", "American", 0);
	    CarsLv1 Mitsubishi_LancerEvolutionX = new CarsLv1("Type", "Mitsubishi", "Japanese", 0);
	    CarsLv1 Infiniti_FX = new CarsLv1("Type", "Infiniti", "Japanese", 0);
	    CarsLv1 Lancia_Thema = new CarsLv1("Type", "Lancia", "Italian", 0);
	    CarsLv1 Volvo_XC90 = new CarsLv1("Type", "Volvo", "Swedish",  0);
	    CarsLv1 Acura_CSX = new CarsLv1("Type", "Acura", "Japanese", 0);
	    CarsLv1 Saab_SonettII = new CarsLv1("Type", "Saab", "Swedish", 0);
	    CarsLv1 Renault_Floride = new CarsLv1("Type", "Renault", "French", 0);
	    CarsLv1 BMW_e34 = new CarsLv1("Type", "BMW", "Germany", 0);
	    CarsLv1 Chrysler_Cordoba = new CarsLv1("Type", "Chrysler", "American", 0);
		
		
	}
	
}
