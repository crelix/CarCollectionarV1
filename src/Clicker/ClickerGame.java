package Clicker;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import java.util.Random;

class CarMain implements Serializable{
    public  int Money;
    public  int Boxes;
    public  int MoneyClicks;
    public  int BoxesClicks;
    public  int PlayerLevel;
    public  int BoxLevel;
}
 
class CarsLv2{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv2(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsLv3{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv3(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsLv4{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv4(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsLv5{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv5(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsLv6{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv6(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsLv7{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv7(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsLv8{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv8(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsLv9{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv9(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsLv10{
    public String CarType;
    public String CarBrand;
    public String CarCountry;
    public int CarCount = 0;
   
    CarsLv10(String t, String b, String c, int cc){
        CarType = t;
        CarBrand = b;
        CarCountry = c;
        CarCount = cc;
    }    
}
class CarsObjLv2{
    CarsLv2 Buick_Riviera = new CarsLv2("Type", "Buick", "American", 0);
    CarsLv2 Tesla_Roadster = new CarsLv2("Type", "Tesla", "American", 0);
    CarsLv2 Audi_80 = new CarsLv2("Type", "Audi", "Germany", 0);
    CarsLv2 BMW_e36 = new CarsLv2("Type", "BMW", "Germany", 0);
    CarsLv2 Volkswagen_Scirocco = new CarsLv2("Type", "Volkswagen", "Germany", 0);
    CarsLv2 Mazda_3 = new CarsLv2("Type", "Mazda", "Japanese", 0);
    CarsLv2 Chevrolet_Viking = new CarsLv2("Type", "Chevrolet", "American", 0);
    CarsLv2 Tesla_s = new CarsLv2("Type", "Tesla", "American", 0);
    CarsLv2 Jeep_ZJ = new CarsLv2("Type", "Jeep", "American", 0);
    CarsLv2 Dodge_Neon = new CarsLv2("Type", "Dodge", "American", 0);
    CarsLv2 BMW_e30 = new CarsLv2("Type", "BMW", "Germany", 0);
    CarsLv2 Mercedes_Benz_W123 = new CarsLv2("Type", "Mercedes_Benz", "Germany", 0);
    CarsLv2 Land_Rover_Defender = new CarsLv2("Type", "Land_Rover", "British", 0);
    CarsLv2 Saab_9_5 = new CarsLv2("Type", "Saab", "Swedish", 0);
    CarsLv2 Aston_Martin_One = new CarsLv2("Type", "Aston_Martin", "British", 0);
    CarsLv2 Koenigsegg_Regera = new CarsLv2("Type", "Koenigsegg", "Swedish", 0);
    CarsLv2 Lexus_IS = new CarsLv2("Type", "Lexus", "Japanese", 0);
    CarsLv2 GMC_Yukon = new CarsLv2("Type", "GMC", "American", 0);
    CarsLv2 Opel_Astra = new CarsLv2("Type", "Opel", "Germany", 0);
    CarsLv2 Audi_Coupe = new CarsLv2("Type", "Audi", "Germany", 0);
}
class CarsObjLv3{
    CarsLv3 Mini_Moke = new CarsLv3("Type", "Mini", "British", 0);
    CarsLv3 Kia_Rondo = new CarsLv3("Type", "Kia", "Korean", 0);
    CarsLv3 GMC_Suburban = new CarsLv3("Type", "GMC", "American", 0);
    CarsLv3 Honda_Prelude = new CarsLv3("Type", "Honda", "Japanese", 0);
    CarsLv3 Citroen_Saxo = new CarsLv3("Type", "Citroen", "French", 0);
    CarsLv3 Volkswagen_Tiguan = new CarsLv3("Type", "Volkswagen", "Germany", 0);
    CarsLv3 Volkswagen_Phaeton = new CarsLv3("Type", "Volkswagen", "Germany", 0);
    CarsLv3 Buick_Centry = new CarsLv3("Type", "Buick", "American", 0);
    CarsLv3 Land_Rover_Discovery = new CarsLv3("Type", "Land_Rover", "British", 0);
    CarsLv3 Infiniti_Etherea = new CarsLv3("Type", "Infiniti", "Japanese", 0);
    CarsLv3 Peugeot_308 = new CarsLv3("Type", "Peugeot", "French", 0);
    CarsLv3 Toyota_Auris = new CarsLv3("Type", "Toyota", "Japanese", 0);
    CarsLv3 Pagani_ZondaF = new CarsLv3("Type", "Pagani", "Italian", 0);
    CarsLv3 Lancia_Phedra = new CarsLv3("Type", "Lancia", "Italian", 0);
    CarsLv3 Chevrolet_Impala = new CarsLv3("Type", "Chevrolet", "American", 0);
    CarsLv3 Porsche_Boxster = new CarsLv3("Type", "Porsche", "Germany", 0);
    CarsLv3 Aston_Martin_DB6 = new CarsLv3("Type", "Aston_Martin", "British", 0);
    CarsLv3 Vaz_2103 = new CarsLv3("Type", "Lada", "Russian", 0);
    CarsLv3 Hyundai_Mistra = new CarsLv3("Type", "Hyundai", "Korean", 0);
    CarsLv3 Mini_Countryman = new CarsLv3("Type", "Mini", "British", 0);
}
class CarsObjLv4{
    CarsLv4 Mazda_MX6 = new CarsLv4("Type", "Mazda", "Japanese", 0);
    CarsLv4 Chrysler_Daytona = new CarsLv4("Type", "Chrysler", "American", 0);
    CarsLv4 Buick_Roadmaster = new CarsLv4("Type", "Buick", "American", 0);
    CarsLv4 Volvo_S80 = new CarsLv4("Type", "Volvo", "Swedish", 0);
    CarsLv4 Porsche_Cayman = new CarsLv4("Type", "Porsche", "Germany", 0);
    CarsLv4 Volkswagen_Beetle = new CarsLv4("Type", "Volkswagen", "Germany", 0);
    CarsLv4 Bugatti_EB110 = new CarsLv4("Type", "Bugatti", "French", 0);
    CarsLv4 Opel_Zafira = new CarsLv4("Type", "Opel", "Germany", 0);
    CarsLv4 Saab_9000 = new CarsLv4("Type", "Saab", "Swedish", 0);
    CarsLv4 McLaren_F1 = new CarsLv4("Type", "McLaren", "British", 0);
    CarsLv4 Audi_R8 = new CarsLv4("Type", "Audi", "Germany", 0);
    CarsLv4 Alfa_Romeo_8C = new CarsLv4("Type", "Alfa_Romeo", "Italian", 0);
    CarsLv4 Ford_Fiesta = new CarsLv4("Type", "Ford", "American", 0);
    CarsLv4 Infiniti_Q50 = new CarsLv4("Type", "Infiniti", "Japanese", 0);
    CarsLv4 Maserati_5000GT = new CarsLv4("Type", "Maserati", "Italian", 0);
    CarsLv4 Mercedes_Benz_CLA250 = new CarsLv4("Type", "Mercedes_Benz", "Germany", 0);
    CarsLv4 Lamborghini_Gallardo = new CarsLv4("Type", "Lamborghini", "Italian", 0);
    CarsLv4 Mazda_RX7 = new CarsLv4("Type", "Mazda", "Japanese", 0);
    CarsLv4 Mitsubishi_Colt = new CarsLv4("Type", "Mitsubishi", "Japanese", 0);
    CarsLv4 Kia_Sorento = new CarsLv4("Type", "Kia", "Korean", 0);
}
class CarsObjLv5{
    CarsLv5 Rolls_Royce_Wraith = new CarsLv5("Type", "Rolls_Royce", "British", 0);
    CarsLv5 Lamborghini_Diablo = new CarsLv5("Type", "Lamborghini", "Italian", 0);
    CarsLv5 Jeep_Scrambler = new CarsLv5("Type", "Jeep", "American", 0);
    CarsLv5 Bentley_Continental = new CarsLv5("Type", "Bentley", "British", 0);
    CarsLv5 Bentley_Azure = new CarsLv5("Type", "Bentley", "British", 0);
    CarsLv5 Koenigsegg_One = new CarsLv5("Type", "Koenigsegg", "Swedish", 0);
    CarsLv5 Cadilliac_XTS = new CarsLv5("Type", "Cadilliac", "American", 0);
    CarsLv5 Fiat_500 = new CarsLv5("Type", "Fiat", "Italian", 0);
    CarsLv5 Mitsubishi_Pajero = new CarsLv5("Type", "Mitsubishi", "Japanese", 0);
    CarsLv5 Moskvich_2140 = new CarsLv5("Type", "Moskvich", "Russian", 0);
    CarsLv5 Opel_GT = new CarsLv5("Type", "Opel", "Germany", 0);
    CarsLv5 Hyundai_Getz = new CarsLv5("Type", "Hyundai", "Korean", 0);
    CarsLv5 Maserati_Coupe = new CarsLv5("Type", "Maserati", "Italian", 0);
    CarsLv5 Honda_S2000 = new CarsLv5("Type", "Honda", "Japanese", 0);
    CarsLv5 Alfa_Romeo_Spider = new CarsLv5("Type", "Alfa_Romeo", "Italian", 0 );
    CarsLv5 BMW_M5 = new CarsLv5("Type", "BMW", "Germany", 0);
    CarsLv5 BMW_I8 = new CarsLv5("Type", "BMW", "Germany", 0);
    CarsLv5 Citroen_C5 = new CarsLv5("Type", "Citroen", "French", 0);
    CarsLv5 Fiat_Punto = new CarsLv5("Type", "Fiat", "Italian", 0);
    CarsLv5 Audi_100 = new CarsLv5("Type", "Audi", "Germany", 0);
}
class CarsObjLv6{
    CarsLv6 Rolls_Royce_Phantom = new CarsLv6("Type", "Rolls_Royce", "British", 0);
    CarsLv6 Toyota_86 = new CarsLv6("Type", "Toyota", "Japanese", 0);
    CarsLv6 BMW_e70 = new CarsLv6("Type", "BMW", "Germany", 0);
    CarsLv6 Chrysler_Voyager = new CarsLv6("Type", "Chrysler", "American", 0);
    CarsLv6 Rolls_Royce_PhantomIII = new CarsLv6("Type", "Rolls_Royce", "British", 0);
    CarsLv6 Honda_CRX = new CarsLv6("Type", "Honda", "Japanese", 0);
    CarsLv6 Subaru_1000 = new CarsLv6("Type", "Subaru", "Japanese", 0);
    CarsLv6 Cadilliac_Eldorado = new CarsLv6("Type", "Cadilliac", "American", 0);
    CarsLv6 Land_Rover_Freelander = new CarsLv6("Type", "Land_Rover", "British", 0);
    CarsLv6 Renault_Spider = new CarsLv6("Type", "Renault", "French", 0);
    CarsLv6 Gaz_21 = new CarsLv6("Type", "GAZ", "Russian", 0);
    CarsLv6 Acura_EL = new CarsLv6("Type", "Acura", "Japanese", 0);
    CarsLv6 Bugatti_Veyron = new CarsLv6("Type", "Bugatti", "French", 0);
    CarsLv6 Mercedes_Benz_SL600 = new CarsLv6("Type", "Mercedes_Benz", "Germany", 0);
    CarsLv6 Rolls_Royce_Silver = new CarsLv6("Type", "Rolls_Royce", "British", 0);
    CarsLv6 Mini_Paceman = new CarsLv6("Type", "Mini", "British", 0);
    CarsLv6 Hyundai_Excel = new CarsLv6("Type", "Hyundai", "Korean", 0);
    CarsLv6 Gaz_24 = new CarsLv6("Type", "GAZ", "Russian", 0);
    CarsLv6 Peugeot_107 = new CarsLv6("Type", "Peugeot", "French", 0);
    CarsLv6 Audi_A4 = new CarsLv6("Type", "Audi", "Germany", 0);
}
class CarsObjLv7{
    CarsLv7 Lamborghini_Aventador = new CarsLv7("Type", "Lamborghini", "Italian", 0);
    CarsLv7 Nissan_350z = new CarsLv7("Type", "Nissan", "Japanese", 0);
    CarsLv7 Jaguar_XJ6 = new CarsLv7("Type", "Jaguar", "British", 0);
    CarsLv7 Renault_Clio = new CarsLv7("Type", "Renault", "French", 0);
    CarsLv7 Toyota_Avensis = new CarsLv7("Type", "Toyota", "Japanese", 0);
    CarsLv7 Subaru_Outback = new CarsLv7("Type", "Subaru", "Japanese", 0);
    CarsLv7 Saab_900 = new CarsLv7("Type", "Saab", "Swedish", 0);
    CarsLv7 Opel_Vectra = new CarsLv7("Type", "Opel", "Germany", 0);
    CarsLv7 Chrysler_Charger = new CarsLv7("Type", "Chrysler", "American", 0);
    CarsLv7 Ferrari_348 = new CarsLv7("Type", "Ferrari", "Italian", 0);
    CarsLv7 Hyundai_XG = new CarsLv7("Type", "Hyundai", "Korean", 0);
    CarsLv7 Lexus_RX = new CarsLv7("Type", "Lexus", "Japanese", 0);
    CarsLv7 Dodge_400 = new CarsLv7("Type", "Dodge", "American", 0);
    CarsLv7 GMC_Terrain = new CarsLv7("Type", "GMC", "American", 0);
    CarsLv7 Volvo_C70 = new CarsLv7("Type", "Volvo", "Swedish", 0);
    CarsLv7 Ford_Sierra = new CarsLv7("Type", "Ford", "American", 0);
    CarsLv7 Subaru_Impreza = new CarsLv7("Type", "Subaru", "Japanese", 0);
    CarsLv7 BMW_e90 = new CarsLv7("Type", "BMW", "Germany", 0);
    CarsLv7 Nissan_Skyline = new CarsLv7("Type", "Nissan", "Japanese", 0);
    CarsLv7 Audi_Q7 = new CarsLv7("Type", "Audi", "Germany", 0);
}
class CarsObjLv8{
    CarsLv8 Bentley_Arnage = new CarsLv8("Type", "Bentley", "British", 0);
    CarsLv8 Volvo_850 = new CarsLv8("Type", "Volvo", "Swedish", 0);
    CarsLv8 Toyota_Rav4 = new CarsLv8("Type", "Toyota", "Japanese", 0);
    CarsLv8 Ford_Focus = new CarsLv8("Type", "Ford", "American", 0);
    CarsLv8 Chevrolet_Spin = new CarsLv8("Type", "Chevrolet", "American", 0);
    CarsLv8 Bentley_GTZ = new CarsLv8("Type", "Bentley", "British", 0);
    CarsLv8 Lexus_LS = new CarsLv8("Type", "Lexus", "Japanese", 0);
    CarsLv8 Land_Rover_RangeRover = new CarsLv8("Type", "Land_Rover", "British", 0);
    CarsLv8 Lexus_GX = new CarsLv8("Type", "Lexus", "Japanese", 0);
    CarsLv8 Jeep_Wrangler = new CarsLv8("Type", "Jeep", "American", 0);
    CarsLv8 Maserati_GranTurismo = new CarsLv8("Type", "Maserati", "Italian", 0);
    CarsLv8 Koenigsegg_Agera = new CarsLv8("Type", "Koenigsegg", "Swedish", 0);
    CarsLv8 Acura_MDX = new CarsLv8("Type", "Acura", "Japanese", 0);
    CarsLv8 Audi_RS6 = new CarsLv8("Type", "Audi", "Germany", 0);
    CarsLv8 Cadilliac_DeVille = new CarsLv8("Type", "Cadilliac", "American", 0);
    CarsLv8 McLaren_Veneno = new CarsLv8("Type", "McLaren", "British", 0);
    CarsLv8 Tesla_X = new CarsLv8("Type", "Tesla", "American", 0);
    CarsLv8 Mercedes_Benz_G55 = new CarsLv8("Type", "Mercedes_Benz", "Germany", 0);
    CarsLv8 Lancia_Lybra = new CarsLv8("Type", "Lancia", "Italian", 0);
    CarsLv8 Infiniti_QX60 = new CarsLv8("Type", "Infiniti", "Japanese", 0);
}
class CarsObjLv9{
    CarsLv9 Kia_Forte = new CarsLv9("Type", "Kia", "Korean", 0);
    CarsLv9 Lancia_Voyager = new CarsLv9("Type", "Lancia", "Italian", 0);
    CarsLv9 Porsche_Cayenne = new CarsLv9("Type", "Porsche", "Germany", 0);
    CarsLv9 McLaren_650s = new CarsLv9("Type", "McLaren", "British", 0);
    CarsLv9 Jaguar_E_Type = new CarsLv9("Type", "Jaguar", "British", 0);
    CarsLv9 Peugeot_601 = new CarsLv9("Type", "Peugeot", "French", 0);
    CarsLv9 Jaguar_F_Type = new CarsLv9("Type", "Jaguar", "British", 0);
    CarsLv9 Fiat_Doblo = new CarsLv9("Type", "Fiat", "Italian", 0);
    CarsLv9 Vaz_2101 = new CarsLv9("Type", "Lada", "Russian", 0);
    CarsLv9 McLaren_P1 = new CarsLv9("Type", "McLaren", "British", 0);
    CarsLv9 Peugeot_405 = new CarsLv9("Type", "Peugeot", "French", 0);
    CarsLv9 GMC_Envoy = new CarsLv9("Type", "GMC", "American", 0);
    CarsLv9 Chevrolet_Corvete = new CarsLv9("Type", "Chevrolet", "American", 0);
    CarsLv9 Pagani_Huayra = new CarsLv9("Type", "Pagani", "Italian", 0);
    CarsLv9 Moskvich_402 = new CarsLv9("Type", "Moskvich", "Russian", 0);
    CarsLv9 Alfa_Romeo_159 = new CarsLv9("Type", "Alfa_Romeo", "Italian", 0);
    CarsLv9 Renault_Fregate = new CarsLv9("Type", "Renault", "French", 0);
    CarsLv9 Mini_Cooper = new CarsLv9("Type", "Mini", "British", 0);
    CarsLv9 Dodge_Viper = new CarsLv9("Type", "Dodge", "American", 0);
    CarsLv9 Vaz_Niva = new CarsLv9("Type", "Lada", "Russian", 0);
}
class CarsObjLv10{
    CarsLv10 Jaguar_X_Type = new CarsLv10("Type", "Jaguar", "British", 0);
    CarsLv10 Ferrari_308 = new CarsLv10("Type", "Ferrari", "Italian", 0);
    CarsLv10 Mazda_626 = new CarsLv10("Type", "Mazda", "Japanese", 0);
    CarsLv10 Maserati_Shamal = new CarsLv10("Type", "Maserati", "Italian", 0);
    CarsLv10 Nissan_240sx = new CarsLv10("Type", "Nissan", "Japanese", 0);
    CarsLv10 Alfa_Romeo_4C = new CarsLv10("Type", "Alfa_Romeo", "Italian", 0);
    CarsLv10 Nissan_Juke = new CarsLv10("Type", "Nissan", "Japanese", 0);
    CarsLv10 Volkswagen_Golf1 = new CarsLv10("Type", "Volkswagen", "Germany", 0);
    CarsLv10 Jeep_Gladiator = new CarsLv10("Type", "Jeep", "American", 0);
    CarsLv10 Dodge_Matador = new CarsLv10("Type", "Dodge", "American", 0);
    CarsLv10 Bugatti_Royale = new CarsLv10("Type", "Bugatti", "French", 0);
    CarsLv10 Citroen_CX = new CarsLv10("Type", "Citroen", "French", 0);
    CarsLv10 Lamborghini_350GT = new CarsLv10("Type", "Lamborghini", "Italian", 0);
    CarsLv10 Mitsubishi_GTO = new CarsLv10("Type", "Mitsubishi", "Japanese", 0);
    CarsLv10 Buick_Invicta = new CarsLv10("Type", "Buick", "American", 0);
    CarsLv10 Porsche_911 = new CarsLv10("Type", "Porsche", "Germany", 0);
    CarsLv10 Subaru_Forester = new CarsLv10("Type", "Subaru", "Japanese", 0);
    CarsLv10 Citroen_BX = new CarsLv10("Type", "Citroen", "French", 0);
    CarsLv10 Bugatti_Type252 = new CarsLv10("Type", "Bugatti", "French", 0);
    CarsLv10 Ferrari_488 = new CarsLv10("Type", "Ferrari", "Italian", 0);
}



class Part{
    public int PartCount;
   
    Part(int c) {
        PartCount = c;
    }
}
class PartObj{
    Part AccessoriesLv1 = new Part(0);
    Part BodyLv1 = new Part(0);
    Part BrakesLv1 = new Part(0);
    Part CoolingLv1 = new Part(0);
    Part ElectronicsLv1 = new Part(0);
    Part EngineLv1 = new Part(0);
    Part ExaustLv1 = new Part(0);
    Part FuelLv1 = new Part(0);
    Part InteriorLv1 = new Part(0);
    Part SteeringLv1 = new Part(0);
    Part SuspensionLv1 = new Part(0);
    Part TransmissionLv1 = new Part(0);
    Part TiresLv1 = new Part(0);
    
    Part AccessoriesLv2 = new Part(0);
    Part BodyLv2 = new Part(0);
    Part BrakesLv2 = new Part(0);
    Part CoolingLv2 = new Part(0);
    Part ElectronicsLv2 = new Part(0);
    Part EngineLv2 = new Part(0);
    Part ExaustLv2 = new Part(0);
    Part FuelLv2 = new Part(0);
    Part InteriorLv2 = new Part(0);
    Part SteeringLv2 = new Part(0);
    Part SuspensionLv2 = new Part(0);
    Part TransmissionLv2 = new Part(0);
    Part TiresLv2 = new Part(0);
    
    Part AccessoriesLv3 = new Part(0);
    Part BodyLv3 = new Part(0);
    Part BrakesLv3 = new Part(0);
    Part CoolingLv3 = new Part(0);
    Part ElectronicsLv3 = new Part(0);
    Part EngineLv3 = new Part(0);
    Part ExaustLv3 = new Part(0);
    Part FuelLv3 = new Part(0);
    Part InteriorLv3 = new Part(0);
    Part SteeringLv3 = new Part(0);
    Part SuspensionLv3 = new Part(0);
    Part TransmissionLv3 = new Part(0);
    Part TiresLv3 = new Part(0);
    
    Part AccessoriesLv4 = new Part(0);
    Part BodyLv4 = new Part(0);
    Part BrakesLv4 = new Part(0);
    Part CoolingLv4 = new Part(0);
    Part ElectronicsLv4 = new Part(0);
    Part EngineLv4 = new Part(0);
    Part ExaustLv4 = new Part(0);
    Part FuelLv4 = new Part(0);
    Part InteriorLv4 = new Part(0);
    Part SteeringLv4 = new Part(0);
    Part SuspensionLv4 = new Part(0);
    Part TransmissionLv4 = new Part(0);
    Part TiresLv4 = new Part(0);
    
    Part AccessoriesLv5 = new Part(0);
    Part BodyLv5 = new Part(0);
    Part BrakesLv5 = new Part(0);
    Part CoolingLv5 = new Part(0);
    Part ElectronicsLv5 = new Part(0);
    Part EngineLv5 = new Part(0);
    Part ExaustLv5 = new Part(0);
    Part FuelLv5 = new Part(0);
    Part InteriorLv5 = new Part(0);
    Part SteeringLv5 = new Part(0);
    Part SuspensionLv5 = new Part(0);
    Part TransmissionLv5 = new Part(0);
    Part TiresLv5 = new Part(0);
    
    Part AccessoriesLv6 = new Part(0);
    Part BodyLv6 = new Part(0);
    Part BrakesLv6 = new Part(0);
    Part CoolingLv6 = new Part(0);
    Part ElectronicsLv6 = new Part(0);
    Part EngineLv6 = new Part(0);
    Part ExaustLv6 = new Part(0);
    Part FuelLv6 = new Part(0);
    Part InteriorLv6 = new Part(0);
    Part SteeringLv6 = new Part(0);
    Part SuspensionLv6 = new Part(0);
    Part TransmissionLv6 = new Part(0);
    Part TiresLv6 = new Part(0);
    
    Part AccessoriesLv7 = new Part(0);
    Part BodyLv7 = new Part(0);
    Part BrakesLv7 = new Part(0);
    Part CoolingLv7 = new Part(0);
    Part ElectronicsLv7 = new Part(0);
    Part EngineLv7 = new Part(0);
    Part ExaustLv7 = new Part(0);
    Part FuelLv7 = new Part(0);
    Part InteriorLv7 = new Part(0);
    Part SteeringLv7 = new Part(0);
    Part SuspensionLv7 = new Part(0);
    Part TransmissionLv7 = new Part(0);
    Part TiresLv7 = new Part(0);
    
    Part AccessoriesLv8 = new Part(0);
    Part BodyLv8 = new Part(0);
    Part BrakesLv8 = new Part(0);
    Part CoolingLv8 = new Part(0);
    Part ElectronicsLv8 = new Part(0);
    Part EngineLv8 = new Part(0);
    Part ExaustLv8 = new Part(0);
    Part FuelLv8 = new Part(0);
    Part InteriorLv8 = new Part(0);
    Part SteeringLv8 = new Part(0);
    Part SuspensionLv8 = new Part(0);
    Part TransmissionLv8 = new Part(0);
    Part TiresLv8 = new Part(0);
    
    Part AccessoriesLv9 = new Part(0);
    Part BodyLv9 = new Part(0);
    Part BrakesLv9 = new Part(0);
    Part CoolingLv9 = new Part(0);
    Part ElectronicsLv9 = new Part(0);
    Part EngineLv9 = new Part(0);
    Part ExaustLv9 = new Part(0);
    Part FuelLv9 = new Part(0);
    Part InteriorLv9 = new Part(0);
    Part SteeringLv9 = new Part(0);
    Part SuspensionLv9 = new Part(0);
    Part TransmissionLv9 = new Part(0);
    Part TiresLv9 = new Part(0);
    
    Part AccessoriesLv10 = new Part(0);
    Part BodyLv10 = new Part(0);
    Part BrakesLv10 = new Part(0);
    Part CoolingLv10 = new Part(0);
    Part ElectronicsLv10 = new Part(0);
    Part EngineLv10 = new Part(0);
    Part ExaustLv10 = new Part(0);
    Part FuelLv10 = new Part(0);
    Part InteriorLv10 = new Part(0);
    Part SteeringLv10 = new Part(0);
    Part SuspensionLv10 = new Part(0);
    Part TransmissionLv10 = new Part(0);
    Part TiresLv10 = new Part(0);
   
}
 
class Garages{
    public int GarageLevel;
    public int GarageSlots;
}   

class Boxes{
    public int BoxCount;
   
    Boxes(int c){
        BoxCount = c;
    }
}
class BoxesObj{
    Boxes BoxLv1 = new Boxes(0);
    Boxes BoxLv2 = new Boxes(0);
    Boxes BoxLv3 = new Boxes(0);
    Boxes BoxLv4 = new Boxes(0);
    Boxes BoxLv5 = new Boxes(0);
    Boxes BoxLv6 = new Boxes(0);
    Boxes BoxLv7 = new Boxes(0);
    Boxes BoxLv8 = new Boxes(0);
    Boxes BoxLv9 = new Boxes(0);
    Boxes BoxLv10 = new Boxes(0);
}
 
class CarFrames{
	public int FrameCount;

	CarFrames(int c){
		FrameCount = c;
	}
	}
class FramesObj{
	CarFrames FrameLv1 = new CarFrames(0);
	CarFrames FrameLv2 = new CarFrames(0);
	CarFrames FrameLv3 = new CarFrames(0);
	CarFrames FrameLv4 = new CarFrames(0);
	CarFrames FrameLv5 = new CarFrames(0);
	CarFrames FrameLv6 = new CarFrames(0);
	CarFrames FrameLv7 = new CarFrames(0);
	CarFrames FrameLv8 = new CarFrames(0);
	CarFrames FrameLv9 = new CarFrames(0);
	CarFrames FrameLv10 = new CarFrames(0);
}


public class ClickerGame implements ActionListener {
	
	CarMain CarMain;
    BoxesObj Box;
    PartObj Part;
    Garages Garage;
    FramesObj CarFrame;
    CarLevel1Holder CarsLv1 = new CarLevel1Holder();
    CarsObjLv2 CarsLv2;
    CarsObjLv3 CarsLv3;
    CarsObjLv4 CarsLv4;
    CarsObjLv5 CarsLv5;
    CarsObjLv6 CarsLv6;
    CarsObjLv7 CarsLv7;
    CarsObjLv8 CarsLv8;
    CarsObjLv9 CarsLv9;
    CarsObjLv10 CarsLv10;
    
	
    final static String Click = "Click";
    final static String Upgrades = "Upgrades";
    final static String BuyBoxes = "Buy Boxes";
    final static String OpenBoxes = "Open Boxes";
    final static String BuildCars = "Build Cars";
    final static String BuyFrames = "Buy Frames";
    final static String SellParts = "Sell Parts";
    final static String LVL1 = "Level 1";
    final static String LVL2 = "Level 2";
    final static String LVL3 = "Level 3";
    final static String LVL4 = "Level 4";
    final static String LVL5 = "Level 5";
    final static String LVL6 = "Level 6";
    final static String LVL7 = "Level 7";
    final static String LVL8 = "Level 8";
    final static String LVL9 = "Level 9";
    final static String LVL10 = "Level 10";
    
    
    JButton jbtnMoney = new JButton("Click");
    JButton jbtnBoxes = new JButton("Click");
    
    JButton jbtnUpgradeLevel = new JButton("Upgrade PlayerLVL");
    JButton jbtnUpgradeGarageLevel = new JButton ("Upgrade GarageLVL");
    JButton jbtnUpgradeBoxesLevel = new JButton ("Upgrade BoxLVL");
    
    JButton jbtnBuyBoxLv1 = new JButton("Buy");
    JButton jbtnBuyBoxLv2 = new JButton("Buy");
    JButton jbtnBuyBoxLv3 = new JButton("Buy");
    JButton jbtnBuyBoxLv4 = new JButton("Buy");
    JButton jbtnBuyBoxLv5 = new JButton("Buy");
    JButton jbtnBuyBoxLv6 = new JButton("Buy");
    JButton jbtnBuyBoxLv7 = new JButton("Buy");
    JButton jbtnBuyBoxLv8 = new JButton("Buy");
    JButton jbtnBuyBoxLv9 = new JButton("Buy");
    JButton jbtnBuyBoxLv10 = new JButton("Buy");
    
    JButton jbtnPartsLv1 = new JButton("Open");
    JButton jbtnPartsLv2 = new JButton("Open");
    JButton jbtnPartsLv3 = new JButton("Open");
    JButton jbtnPartsLv4 = new JButton("Open");
    JButton jbtnPartsLv5 = new JButton("Open");
    JButton jbtnPartsLv6 = new JButton("Open");
    JButton jbtnPartsLv7 = new JButton("Open");
    JButton jbtnPartsLv8 = new JButton("Open");
    JButton jbtnPartsLv9 = new JButton("Open");
    JButton jbtnPartsLv10 = new JButton("Open");
    
    JButton jbtnBuildCarLv1 = new JButton("Build");
    JButton jbtnBuildCarLv2 = new JButton("Build");
    JButton jbtnBuildCarLv3 = new JButton("Build");
    JButton jbtnBuildCarLv4 = new JButton("Build");
    JButton jbtnBuildCarLv5 = new JButton("Build");
    JButton jbtnBuildCarLv6 = new JButton("Build");
    JButton jbtnBuildCarLv7 = new JButton("Build");
    JButton jbtnBuildCarLv8 = new JButton("Build");
    JButton jbtnBuildCarLv9 = new JButton("Build");
    JButton jbtnBuildCarLv10 = new JButton("Build");
    
    JButton jbtnBuyFrameLv1 = new JButton("Buy");
    JButton jbtnBuyFrameLv2 = new JButton("Buy");
    JButton jbtnBuyFrameLv3 = new JButton("Buy");
    JButton jbtnBuyFrameLv4 = new JButton("Buy");
    JButton jbtnBuyFrameLv5 = new JButton("Buy");
    JButton jbtnBuyFrameLv6 = new JButton("Buy");
    JButton jbtnBuyFrameLv7 = new JButton("Buy");
    JButton jbtnBuyFrameLv8 = new JButton("Buy");
    JButton jbtnBuyFrameLv9 = new JButton("Buy");
    JButton jbtnBuyFrameLv10 = new JButton("Buy");
    
    JButton jbtnSellAccessoriesLv1 = new JButton("Sell");
    JButton jbtnSellBodyLv1 = new JButton("Sell");
    JButton jbtnSellBrakesLv1 = new JButton("Sell");
    JButton jbtnSellCoolingLv1 = new JButton("Sell");
    JButton jbtnSellElectronicsLv1 = new JButton("Sell");
    JButton jbtnSellEngineLv1 = new JButton("Sell");
    JButton jbtnSellExaustLv1 = new JButton("Sell");
    JButton jbtnSellFuelLv1 = new JButton("Sell");
    JButton jbtnSellInteriorLv1 = new JButton("Sell");
    JButton jbtnSellSteeringLv1 = new JButton("Sell");
    JButton jbtnSellSuspensionLv1 = new JButton("Sell");
    JButton jbtnSellTransmissionLv1 = new JButton("Sell");
    JButton jbtnSellTiresLv1 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv2 = new JButton("Sell");
    JButton jbtnSellBodyLv2 = new JButton("Sell");
    JButton jbtnSellBrakesLv2 = new JButton("Sell");
    JButton jbtnSellCoolingLv2 = new JButton("Sell");
    JButton jbtnSellElectronicsLv2 = new JButton("Sell");
    JButton jbtnSellEngineLv2 = new JButton("Sell");
    JButton jbtnSellExaustLv2 = new JButton("Sell");
    JButton jbtnSellFuelLv2 = new JButton("Sell");
    JButton jbtnSellInteriorLv2 = new JButton("Sell");
    JButton jbtnSellSteeringLv2 = new JButton("Sell");
    JButton jbtnSellSuspensionLv2 = new JButton("Sell");
    JButton jbtnSellTransmissionLv2 = new JButton("Sell");
    JButton jbtnSellTiresLv2 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv3 = new JButton("Sell");
    JButton jbtnSellBodyLv3 = new JButton("Sell");
    JButton jbtnSellBrakesLv3 = new JButton("Sell");
    JButton jbtnSellCoolingLv3 = new JButton("Sell");
    JButton jbtnSellElectronicsLv3 = new JButton("Sell");
    JButton jbtnSellEngineLv3 = new JButton("Sell");
    JButton jbtnSellExaustLv3 = new JButton("Sell");
    JButton jbtnSellFuelLv3 = new JButton("Sell");
    JButton jbtnSellInteriorLv3 = new JButton("Sell");
    JButton jbtnSellSteeringLv3 = new JButton("Sell");
    JButton jbtnSellSuspensionLv3 = new JButton("Sell");
    JButton jbtnSellTransmissionLv3 = new JButton("Sell");
    JButton jbtnSellTiresLv3 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv4 = new JButton("Sell");
    JButton jbtnSellBodyLv4 = new JButton("Sell");
    JButton jbtnSellBrakesLv4 = new JButton("Sell");
    JButton jbtnSellCoolingLv4 = new JButton("Sell");
    JButton jbtnSellElectronicsLv4 = new JButton("Sell");
    JButton jbtnSellEngineLv4 = new JButton("Sell");
    JButton jbtnSellExaustLv4 = new JButton("Sell");
    JButton jbtnSellFuelLv4 = new JButton("Sell");
    JButton jbtnSellInteriorLv4 = new JButton("Sell");
    JButton jbtnSellSteeringLv4 = new JButton("Sell");
    JButton jbtnSellSuspensionLv4 = new JButton("Sell");
    JButton jbtnSellTransmissionLv4 = new JButton("Sell");
    JButton jbtnSellTiresLv4 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv5 = new JButton("Sell");
    JButton jbtnSellBodyLv5 = new JButton("Sell");
    JButton jbtnSellBrakesLv5 = new JButton("Sell");
    JButton jbtnSellCoolingLv5 = new JButton("Sell");
    JButton jbtnSellElectronicsLv5 = new JButton("Sell");
    JButton jbtnSellEngineLv5 = new JButton("Sell");
    JButton jbtnSellExaustLv5 = new JButton("Sell");
    JButton jbtnSellFuelLv5 = new JButton("Sell");
    JButton jbtnSellInteriorLv5 = new JButton("Sell");
    JButton jbtnSellSteeringLv5 = new JButton("Sell");
    JButton jbtnSellSuspensionLv5 = new JButton("Sell");
    JButton jbtnSellTransmissionLv5 = new JButton("Sell");
    JButton jbtnSellTiresLv5 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv6 = new JButton("Sell");
    JButton jbtnSellBodyLv6 = new JButton("Sell");
    JButton jbtnSellBrakesLv6 = new JButton("Sell");
    JButton jbtnSellCoolingLv6 = new JButton("Sell");
    JButton jbtnSellElectronicsLv6 = new JButton("Sell");
    JButton jbtnSellEngineLv6 = new JButton("Sell");
    JButton jbtnSellExaustLv6 = new JButton("Sell");
    JButton jbtnSellFuelLv6 = new JButton("Sell");
    JButton jbtnSellInteriorLv6 = new JButton("Sell");
    JButton jbtnSellSteeringLv6 = new JButton("Sell");
    JButton jbtnSellSuspensionLv6 = new JButton("Sell");
    JButton jbtnSellTransmissionLv6 = new JButton("Sell");
    JButton jbtnSellTiresLv6 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv7 = new JButton("Sell");
    JButton jbtnSellBodyLv7 = new JButton("Sell");
    JButton jbtnSellBrakesLv7 = new JButton("Sell");
    JButton jbtnSellCoolingLv7 = new JButton("Sell");
    JButton jbtnSellElectronicsLv7 = new JButton("Sell");
    JButton jbtnSellEngineLv7 = new JButton("Sell");
    JButton jbtnSellExaustLv7 = new JButton("Sell");
    JButton jbtnSellFuelLv7 = new JButton("Sell");
    JButton jbtnSellInteriorLv7 = new JButton("Sell");
    JButton jbtnSellSteeringLv7 = new JButton("Sell");
    JButton jbtnSellSuspensionLv7 = new JButton("Sell");
    JButton jbtnSellTransmissionLv7 = new JButton("Sell");
    JButton jbtnSellTiresLv7 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv8 = new JButton("Sell");
    JButton jbtnSellBodyLv8 = new JButton("Sell");
    JButton jbtnSellBrakesLv8 = new JButton("Sell");
    JButton jbtnSellCoolingLv8 = new JButton("Sell");
    JButton jbtnSellElectronicsLv8 = new JButton("Sell");
    JButton jbtnSellEngineLv8 = new JButton("Sell");
    JButton jbtnSellExaustLv8 = new JButton("Sell");
    JButton jbtnSellFuelLv8 = new JButton("Sell");
    JButton jbtnSellInteriorLv8 = new JButton("Sell");
    JButton jbtnSellSteeringLv8 = new JButton("Sell");
    JButton jbtnSellSuspensionLv8 = new JButton("Sell");
    JButton jbtnSellTransmissionLv8 = new JButton("Sell");
    JButton jbtnSellTiresLv8 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv9 = new JButton("Sell");
    JButton jbtnSellBodyLv9 = new JButton("Sell");
    JButton jbtnSellBrakesLv9 = new JButton("Sell");
    JButton jbtnSellCoolingLv9 = new JButton("Sell");
    JButton jbtnSellElectronicsLv9 = new JButton("Sell");
    JButton jbtnSellEngineLv9 = new JButton("Sell");
    JButton jbtnSellExaustLv9 = new JButton("Sell");
    JButton jbtnSellFuelLv9 = new JButton("Sell");
    JButton jbtnSellInteriorLv9 = new JButton("Sell");
    JButton jbtnSellSteeringLv9 = new JButton("Sell");
    JButton jbtnSellSuspensionLv9 = new JButton("Sell");
    JButton jbtnSellTransmissionLv9 = new JButton("Sell");
    JButton jbtnSellTiresLv9 = new JButton("Sell");
    
    JButton jbtnSellAccessoriesLv10 = new JButton("Sell");
    JButton jbtnSellBodyLv10 = new JButton("Sell");
    JButton jbtnSellBrakesLv10 = new JButton("Sell");
    JButton jbtnSellCoolingLv10 = new JButton("Sell");
    JButton jbtnSellElectronicsLv10 = new JButton("Sell");
    JButton jbtnSellEngineLv10 = new JButton("Sell");
    JButton jbtnSellExaustLv10 = new JButton("Sell");
    JButton jbtnSellFuelLv10 = new JButton("Sell");
    JButton jbtnSellInteriorLv10 = new JButton("Sell");
    JButton jbtnSellSteeringLv10 = new JButton("Sell");
    JButton jbtnSellSuspensionLv10 = new JButton("Sell");
    JButton jbtnSellTransmissionLv10 = new JButton("Sell");
    JButton jbtnSellTiresLv10 = new JButton("Sell");

    
    public void addComponentToPane(Container pane){
       
    	jbtnMoney.addActionListener(this);
        jbtnBoxes.addActionListener(this);
        
        jbtnUpgradeLevel.addActionListener(this);
        jbtnUpgradeGarageLevel.addActionListener(this);
        jbtnUpgradeBoxesLevel.addActionListener(this);
        
        jbtnPartsLv1.addActionListener(this);
        jbtnPartsLv2.addActionListener(this);
        jbtnPartsLv3.addActionListener(this);
        jbtnPartsLv4.addActionListener(this);
        jbtnPartsLv5.addActionListener(this);
        jbtnPartsLv6.addActionListener(this);
        jbtnPartsLv7.addActionListener(this);
        jbtnPartsLv8.addActionListener(this);
        jbtnPartsLv9.addActionListener(this);
        jbtnPartsLv10.addActionListener(this);
        
        jbtnBuyBoxLv1.addActionListener(this);
        jbtnBuyBoxLv2.addActionListener(this);
        jbtnBuyBoxLv3.addActionListener(this);
        jbtnBuyBoxLv4.addActionListener(this);
        jbtnBuyBoxLv5.addActionListener(this);
        jbtnBuyBoxLv6.addActionListener(this);
        jbtnBuyBoxLv7.addActionListener(this);
        jbtnBuyBoxLv8.addActionListener(this);
        jbtnBuyBoxLv9.addActionListener(this);
        jbtnBuyBoxLv10.addActionListener(this);
        
        jbtnBuyFrameLv1.addActionListener(this);
        jbtnBuyFrameLv2.addActionListener(this);
        jbtnBuyFrameLv3.addActionListener(this);
        jbtnBuyFrameLv4.addActionListener(this);
        jbtnBuyFrameLv5.addActionListener(this);
        jbtnBuyFrameLv6.addActionListener(this);
        jbtnBuyFrameLv7.addActionListener(this);
        jbtnBuyFrameLv8.addActionListener(this);
        jbtnBuyFrameLv9.addActionListener(this);
        jbtnBuyFrameLv10.addActionListener(this);
          
        jbtnSellAccessoriesLv1.addActionListener(this);
        jbtnSellBodyLv1.addActionListener(this);
        jbtnSellBrakesLv1.addActionListener(this);
        jbtnSellCoolingLv1.addActionListener(this);
        jbtnSellElectronicsLv1.addActionListener(this);
        jbtnSellEngineLv1.addActionListener(this);
        jbtnSellExaustLv1.addActionListener(this);
        jbtnSellFuelLv1.addActionListener(this);
        jbtnSellInteriorLv1.addActionListener(this);
        jbtnSellSteeringLv1.addActionListener(this);
        jbtnSellSuspensionLv1.addActionListener(this);
        jbtnSellTransmissionLv1.addActionListener(this);
        jbtnSellTiresLv1.addActionListener(this);
        
        jbtnSellAccessoriesLv2.addActionListener(this);
        jbtnSellBodyLv2.addActionListener(this);
        jbtnSellBrakesLv2.addActionListener(this);
        jbtnSellCoolingLv2.addActionListener(this);
        jbtnSellElectronicsLv2.addActionListener(this);
        jbtnSellEngineLv2.addActionListener(this);
        jbtnSellExaustLv2.addActionListener(this);
        jbtnSellFuelLv2.addActionListener(this);
        jbtnSellInteriorLv2.addActionListener(this);
        jbtnSellSteeringLv2.addActionListener(this);
        jbtnSellSuspensionLv2.addActionListener(this);
        jbtnSellTransmissionLv2.addActionListener(this);
        jbtnSellTiresLv2.addActionListener(this);
        
        jbtnSellAccessoriesLv3.addActionListener(this);
        jbtnSellBodyLv3.addActionListener(this);
        jbtnSellBrakesLv3.addActionListener(this);
        jbtnSellCoolingLv3.addActionListener(this);
        jbtnSellElectronicsLv3.addActionListener(this);
        jbtnSellEngineLv3.addActionListener(this);
        jbtnSellExaustLv3.addActionListener(this);
        jbtnSellFuelLv3.addActionListener(this);
        jbtnSellInteriorLv3.addActionListener(this);
        jbtnSellSteeringLv3.addActionListener(this);
        jbtnSellSuspensionLv3.addActionListener(this);
        jbtnSellTransmissionLv3.addActionListener(this);
        jbtnSellTiresLv3.addActionListener(this);
        
        jbtnSellAccessoriesLv4.addActionListener(this);
        jbtnSellBodyLv4.addActionListener(this);
        jbtnSellBrakesLv4.addActionListener(this);
        jbtnSellCoolingLv4.addActionListener(this);
        jbtnSellElectronicsLv4.addActionListener(this);
        jbtnSellEngineLv4.addActionListener(this);
        jbtnSellExaustLv4.addActionListener(this);
        jbtnSellFuelLv4.addActionListener(this);
        jbtnSellInteriorLv4.addActionListener(this);
        jbtnSellSteeringLv4.addActionListener(this);
        jbtnSellSuspensionLv4.addActionListener(this);
        jbtnSellTransmissionLv4.addActionListener(this);
        jbtnSellTiresLv4.addActionListener(this);
        
        jbtnSellAccessoriesLv5.addActionListener(this);
        jbtnSellBodyLv5.addActionListener(this);
        jbtnSellBrakesLv5.addActionListener(this);
        jbtnSellCoolingLv5.addActionListener(this);
        jbtnSellElectronicsLv5.addActionListener(this);
        jbtnSellEngineLv5.addActionListener(this);
        jbtnSellExaustLv5.addActionListener(this);
        jbtnSellFuelLv5.addActionListener(this);
        jbtnSellInteriorLv5.addActionListener(this);
        jbtnSellSteeringLv5.addActionListener(this);
        jbtnSellSuspensionLv5.addActionListener(this);
        jbtnSellTransmissionLv5.addActionListener(this);
        jbtnSellTiresLv5.addActionListener(this);
        
        jbtnSellAccessoriesLv6.addActionListener(this);
        jbtnSellBodyLv6.addActionListener(this);
        jbtnSellBrakesLv6.addActionListener(this);
        jbtnSellCoolingLv6.addActionListener(this);
        jbtnSellElectronicsLv6.addActionListener(this);
        jbtnSellEngineLv6.addActionListener(this);
        jbtnSellExaustLv6.addActionListener(this);
        jbtnSellFuelLv6.addActionListener(this);
        jbtnSellInteriorLv6.addActionListener(this);
        jbtnSellSteeringLv6.addActionListener(this);
        jbtnSellSuspensionLv6.addActionListener(this);
        jbtnSellTransmissionLv6.addActionListener(this);
        jbtnSellTiresLv6.addActionListener(this);
        
        jbtnSellAccessoriesLv7.addActionListener(this);
        jbtnSellBodyLv7.addActionListener(this);
        jbtnSellBrakesLv7.addActionListener(this);
        jbtnSellCoolingLv7.addActionListener(this);
        jbtnSellElectronicsLv7.addActionListener(this);
        jbtnSellEngineLv7.addActionListener(this);
        jbtnSellExaustLv7.addActionListener(this);
        jbtnSellFuelLv7.addActionListener(this);
        jbtnSellInteriorLv7.addActionListener(this);
        jbtnSellSteeringLv7.addActionListener(this);
        jbtnSellSuspensionLv7.addActionListener(this);
        jbtnSellTransmissionLv7.addActionListener(this);
        jbtnSellTiresLv7.addActionListener(this);
        
        jbtnSellAccessoriesLv8.addActionListener(this);
        jbtnSellBodyLv8.addActionListener(this);
        jbtnSellBrakesLv8.addActionListener(this);
        jbtnSellCoolingLv8.addActionListener(this);
        jbtnSellElectronicsLv8.addActionListener(this);
        jbtnSellEngineLv8.addActionListener(this);
        jbtnSellExaustLv8.addActionListener(this);
        jbtnSellFuelLv8.addActionListener(this);
        jbtnSellInteriorLv8.addActionListener(this);
        jbtnSellSteeringLv8.addActionListener(this);
        jbtnSellSuspensionLv8.addActionListener(this);
        jbtnSellTransmissionLv8.addActionListener(this);
        jbtnSellTiresLv8.addActionListener(this);
        
        jbtnSellAccessoriesLv9.addActionListener(this);
        jbtnSellBodyLv9.addActionListener(this);
        jbtnSellBrakesLv9.addActionListener(this);
        jbtnSellCoolingLv9.addActionListener(this);
        jbtnSellElectronicsLv9.addActionListener(this);
        jbtnSellEngineLv9.addActionListener(this);
        jbtnSellExaustLv9.addActionListener(this);
        jbtnSellFuelLv9.addActionListener(this);
        jbtnSellInteriorLv9.addActionListener(this);
        jbtnSellSteeringLv9.addActionListener(this);
        jbtnSellSuspensionLv9.addActionListener(this);
        jbtnSellTransmissionLv9.addActionListener(this);
        jbtnSellTiresLv9.addActionListener(this);
        
        jbtnSellAccessoriesLv10.addActionListener(this);
        jbtnSellBodyLv10.addActionListener(this);
        jbtnSellBrakesLv10.addActionListener(this);
        jbtnSellCoolingLv10.addActionListener(this);
        jbtnSellElectronicsLv10.addActionListener(this);
        jbtnSellEngineLv10.addActionListener(this);
        jbtnSellExaustLv10.addActionListener(this);
        jbtnSellFuelLv10.addActionListener(this);
        jbtnSellInteriorLv10.addActionListener(this);
        jbtnSellSteeringLv10.addActionListener(this);
        jbtnSellSuspensionLv10.addActionListener(this);
        jbtnSellTransmissionLv10.addActionListener(this);
        jbtnSellTiresLv10.addActionListener(this);
        
        jbtnBuildCarLv1.addActionListener(this);
        jbtnBuildCarLv2.addActionListener(this);
        jbtnBuildCarLv3.addActionListener(this);
        jbtnBuildCarLv4.addActionListener(this);
        jbtnBuildCarLv5.addActionListener(this);
        jbtnBuildCarLv6.addActionListener(this);
        jbtnBuildCarLv7.addActionListener(this);
        jbtnBuildCarLv8.addActionListener(this);
        jbtnBuildCarLv9.addActionListener(this);
        jbtnBuildCarLv10.addActionListener(this);
        
        jbtnPartsLv1.setEnabled(true);
        jbtnPartsLv2.setEnabled(false);
        jbtnPartsLv3.setEnabled(false);
        jbtnPartsLv4.setEnabled(false);
        jbtnPartsLv5.setEnabled(false);
        jbtnPartsLv6.setEnabled(false);
        jbtnPartsLv7.setEnabled(false);
        jbtnPartsLv8.setEnabled(false);
        jbtnPartsLv9.setEnabled(false);
        jbtnPartsLv10.setEnabled(false);
        
        jbtnBuyBoxLv1.setEnabled(false);
        jbtnBuyBoxLv2.setEnabled(false);
        jbtnBuyBoxLv3.setEnabled(false);
        jbtnBuyBoxLv4.setEnabled(false);
        jbtnBuyBoxLv5.setEnabled(false);
        jbtnBuyBoxLv6.setEnabled(false);
        jbtnBuyBoxLv7.setEnabled(false);
        jbtnBuyBoxLv8.setEnabled(false);
        jbtnBuyBoxLv9.setEnabled(false);
        jbtnBuyBoxLv10.setEnabled(false);
        
        jbtnBuyFrameLv1.setEnabled(true);
        jbtnBuyFrameLv2.setEnabled(false);
        jbtnBuyFrameLv3.setEnabled(false);
        jbtnBuyFrameLv4.setEnabled(false);
        jbtnBuyFrameLv5.setEnabled(false);
        jbtnBuyFrameLv6.setEnabled(false);
        jbtnBuyFrameLv7.setEnabled(false);
        jbtnBuyFrameLv8.setEnabled(false);
        jbtnBuyFrameLv9.setEnabled(false);
        jbtnBuyFrameLv10.setEnabled(false);
        
        jbtnSellAccessoriesLv1.setEnabled(false);
        jbtnSellBodyLv1.setEnabled(false);
        jbtnSellBrakesLv1.setEnabled(false);
        jbtnSellCoolingLv1.setEnabled(false);
        jbtnSellElectronicsLv1.setEnabled(false);
        jbtnSellEngineLv1.setEnabled(false);
        jbtnSellExaustLv1.setEnabled(false);
        jbtnSellFuelLv1.setEnabled(false);
        jbtnSellInteriorLv1.setEnabled(false);
        jbtnSellSteeringLv1.setEnabled(false);
        jbtnSellSuspensionLv1.setEnabled(false);
        jbtnSellTransmissionLv1.setEnabled(false);
        jbtnSellTiresLv1.setEnabled(false);
        
        jbtnSellAccessoriesLv2.setEnabled(false);
        jbtnSellBodyLv2.setEnabled(false);
        jbtnSellBrakesLv2.setEnabled(false);
        jbtnSellCoolingLv2.setEnabled(false);
        jbtnSellElectronicsLv2.setEnabled(false);
        jbtnSellEngineLv2.setEnabled(false);
        jbtnSellExaustLv2.setEnabled(false);
        jbtnSellFuelLv2.setEnabled(false);
        jbtnSellInteriorLv2.setEnabled(false);
        jbtnSellSteeringLv2.setEnabled(false);
        jbtnSellSuspensionLv2.setEnabled(false);
        jbtnSellTransmissionLv2.setEnabled(false);
        jbtnSellTiresLv2.setEnabled(false);
        
        jbtnSellAccessoriesLv3.setEnabled(false);
        jbtnSellBodyLv3.setEnabled(false);
        jbtnSellBrakesLv3.setEnabled(false);
        jbtnSellCoolingLv3.setEnabled(false);
        jbtnSellElectronicsLv3.setEnabled(false);
        jbtnSellEngineLv3.setEnabled(false);
        jbtnSellExaustLv3.setEnabled(false);
        jbtnSellFuelLv3.setEnabled(false);
        jbtnSellInteriorLv3.setEnabled(false);
        jbtnSellSteeringLv3.setEnabled(false);
        jbtnSellSuspensionLv3.setEnabled(false);
        jbtnSellTransmissionLv3.setEnabled(false);
        jbtnSellTiresLv3.setEnabled(false);
        
        jbtnSellAccessoriesLv4.setEnabled(false);
        jbtnSellBodyLv4.setEnabled(false);
        jbtnSellBrakesLv4.setEnabled(false);
        jbtnSellCoolingLv4.setEnabled(false);
        jbtnSellElectronicsLv4.setEnabled(false);
        jbtnSellEngineLv4.setEnabled(false);
        jbtnSellExaustLv4.setEnabled(false);
        jbtnSellFuelLv4.setEnabled(false);
        jbtnSellInteriorLv4.setEnabled(false);
        jbtnSellSteeringLv4.setEnabled(false);
        jbtnSellSuspensionLv4.setEnabled(false);
        jbtnSellTransmissionLv4.setEnabled(false);
        jbtnSellTiresLv4.setEnabled(false);
        
        jbtnSellAccessoriesLv5.setEnabled(false);
        jbtnSellBodyLv5.setEnabled(false);
        jbtnSellBrakesLv5.setEnabled(false);
        jbtnSellCoolingLv5.setEnabled(false);
        jbtnSellElectronicsLv5.setEnabled(false);
        jbtnSellEngineLv5.setEnabled(false);
        jbtnSellExaustLv5.setEnabled(false);
        jbtnSellFuelLv5.setEnabled(false);
        jbtnSellInteriorLv5.setEnabled(false);
        jbtnSellSteeringLv5.setEnabled(false);
        jbtnSellSuspensionLv5.setEnabled(false);
        jbtnSellTransmissionLv5.setEnabled(false);
        jbtnSellTiresLv5.setEnabled(false);
        
        jbtnSellAccessoriesLv6.setEnabled(false);
        jbtnSellBodyLv6.setEnabled(false);
        jbtnSellBrakesLv6.setEnabled(false);
        jbtnSellCoolingLv6.setEnabled(false);
        jbtnSellElectronicsLv6.setEnabled(false);
        jbtnSellEngineLv6.setEnabled(false);
        jbtnSellExaustLv6.setEnabled(false);
        jbtnSellFuelLv6.setEnabled(false);
        jbtnSellInteriorLv6.setEnabled(false);
        jbtnSellSteeringLv6.setEnabled(false);
        jbtnSellSuspensionLv6.setEnabled(false);
        jbtnSellTransmissionLv6.setEnabled(false);
        jbtnSellTiresLv6.setEnabled(false);
        
        jbtnSellAccessoriesLv7.setEnabled(false);
        jbtnSellBodyLv7.setEnabled(false);
        jbtnSellBrakesLv7.setEnabled(false);
        jbtnSellCoolingLv7.setEnabled(false);
        jbtnSellElectronicsLv7.setEnabled(false);
        jbtnSellEngineLv7.setEnabled(false);
        jbtnSellExaustLv7.setEnabled(false);
        jbtnSellFuelLv7.setEnabled(false);
        jbtnSellInteriorLv7.setEnabled(false);
        jbtnSellSteeringLv7.setEnabled(false);
        jbtnSellSuspensionLv7.setEnabled(false);
        jbtnSellTransmissionLv7.setEnabled(false);
        jbtnSellTiresLv7.setEnabled(false);
        
        jbtnSellAccessoriesLv8.setEnabled(false);
        jbtnSellBodyLv8.setEnabled(false);
        jbtnSellBrakesLv8.setEnabled(false);
        jbtnSellCoolingLv8.setEnabled(false);
        jbtnSellElectronicsLv8.setEnabled(false);
        jbtnSellEngineLv8.setEnabled(false);
        jbtnSellExaustLv8.setEnabled(false);
        jbtnSellFuelLv8.setEnabled(false);
        jbtnSellInteriorLv8.setEnabled(false);
        jbtnSellSteeringLv8.setEnabled(false);
        jbtnSellSuspensionLv8.setEnabled(false);
        jbtnSellTransmissionLv8.setEnabled(false);
        jbtnSellTiresLv8.setEnabled(false);
        
        jbtnSellAccessoriesLv9.setEnabled(false);
        jbtnSellBodyLv9.setEnabled(false);
        jbtnSellBrakesLv9.setEnabled(false);
        jbtnSellCoolingLv9.setEnabled(false);
        jbtnSellElectronicsLv9.setEnabled(false);
        jbtnSellEngineLv9.setEnabled(false);
        jbtnSellExaustLv9.setEnabled(false);
        jbtnSellFuelLv9.setEnabled(false);
        jbtnSellInteriorLv9.setEnabled(false);
        jbtnSellSteeringLv9.setEnabled(false);
        jbtnSellSuspensionLv9.setEnabled(false);
        jbtnSellTransmissionLv9.setEnabled(false);
        jbtnSellTiresLv9.setEnabled(false);
        
        jbtnSellAccessoriesLv10.setEnabled(false);
        jbtnSellBodyLv10.setEnabled(false);
        jbtnSellBrakesLv10.setEnabled(false);
        jbtnSellCoolingLv10.setEnabled(false);
        jbtnSellElectronicsLv10.setEnabled(false);
        jbtnSellEngineLv10.setEnabled(false);
        jbtnSellExaustLv10.setEnabled(false);
        jbtnSellFuelLv10.setEnabled(false);
        jbtnSellInteriorLv10.setEnabled(false);
        jbtnSellSteeringLv10.setEnabled(false);
        jbtnSellSuspensionLv10.setEnabled(false);
        jbtnSellTransmissionLv10.setEnabled(false);
        jbtnSellTiresLv10.setEnabled(false);
        
        jbtnBuildCarLv1.setEnabled(true);
        jbtnBuildCarLv2.setEnabled(true);
        jbtnBuildCarLv3.setEnabled(false);
        jbtnBuildCarLv4.setEnabled(false);
        jbtnBuildCarLv5.setEnabled(false);
        jbtnBuildCarLv6.setEnabled(false);
        jbtnBuildCarLv7.setEnabled(false);
        jbtnBuildCarLv8.setEnabled(false);
        jbtnBuildCarLv9.setEnabled(false);
        jbtnBuildCarLv10.setEnabled(false);
      
        CarMain = new CarMain();
        Box = new BoxesObj();
        Part = new PartObj(); 
        Garage = new Garages();
        CarFrame = new FramesObj();
        CarsLv2 = new CarsObjLv2();
        CarsLv3 = new CarsObjLv3();
        CarsLv4 = new CarsObjLv4();
        CarsLv5 = new CarsObjLv5();
        CarsLv6 = new CarsObjLv6();
        CarsLv7 = new CarsObjLv7();
        CarsLv8 = new CarsObjLv8();
        CarsLv9 = new CarsObjLv9();
        CarsLv10 = new CarsObjLv10();

        jbtnBuyBoxLv2.setEnabled(false);
        if(CarMain.PlayerLevel >=2){
        	jbtnBuyBoxLv2.setEnabled(true);
        }
       
 	            
    	JTabbedPane tabbedPane = new JTabbedPane();
    	tabbedPane.setTabPlacement(JTabbedPane.TOP);
    	
    	JPanel MainPanel = new JPanel();
    	
    	JPanel MainPanelSub = new JPanel();
    	MainPanelSub.setLayout(new BoxLayout(MainPanelSub, BoxLayout.PAGE_AXIS));
    	
    	JPanel MainPanelSub2 = new JPanel();
    	MainPanelSub2.setLayout(new BoxLayout(MainPanelSub2, BoxLayout.PAGE_AXIS));
    	
        JLabel MoneyLabel = new JLabel(MoneyIcon);    	
    	MoneyLabel.setHorizontalTextPosition(JLabel.CENTER);
    	MoneyLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	MoneyLabel.setText("Money: " + CarMain.Money);
    	
    	JLabel MoneyClicksLabel = new JLabel();
    	MoneyClicksLabel.setHorizontalTextPosition(JLabel.CENTER);
    	MoneyClicksLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	MoneyClicksLabel.setText("Money Clicks: " + CarMain.MoneyClicks);
    	
        JLabel BoxesLabel = new JLabel(BoxLv9_10Icon);  	
    	BoxesLabel.setHorizontalTextPosition(JLabel.CENTER);
    	BoxesLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	BoxesLabel.setText("Boxes: " + CarMain.Boxes);
    	
    	JLabel BoxesClicksLabel = new JLabel();
    	BoxesClicksLabel.setHorizontalTextPosition(JLabel.CENTER);
    	BoxesClicksLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	BoxesClicksLabel.setText("Boxes Clicks: " + CarMain.BoxesClicks);

    	MainPanelSub.add(MoneyLabel);
    	MainPanelSub.add(MoneyClicksLabel);
    	MainPanelSub.add(jbtnMoney);
    	MainPanelSub2.add(BoxesLabel);
    	MainPanelSub2.add(BoxesClicksLabel);
       	MainPanelSub2.add(jbtnBoxes);
    	MainPanel.add(MainPanelSub);
    	MainPanel.add(MainPanelSub2);
        
        
        JPanel UpgradesPanel = new JPanel();
        
        JPanel UpgradesPanelSub = new JPanel();
        UpgradesPanelSub.setLayout(new BoxLayout(UpgradesPanelSub, BoxLayout.PAGE_AXIS));
        
        JPanel UpgradesPanelSub2 = new JPanel();
        UpgradesPanelSub2.setLayout(new BoxLayout(UpgradesPanelSub2, BoxLayout.PAGE_AXIS));
        
        JPanel UpgradesPanelSub3 = new JPanel();
        UpgradesPanelSub3.setLayout(new BoxLayout(UpgradesPanelSub3, BoxLayout.PAGE_AXIS));
        
        JLabel PlayerLabel = new JLabel(PlayerIcon);    	
    	PlayerLabel.setHorizontalTextPosition(JLabel.CENTER);
    	PlayerLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	PlayerLabel.setText("Player Level: " + CarMain.PlayerLevel);
        
    	JLabel GarageLabel = new JLabel(GarageIcon);    	
    	GarageLabel.setHorizontalTextPosition(JLabel.CENTER);
    	GarageLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	GarageLabel.setText("Garage Level: " + Garage.GarageLevel);
    	
    	JLabel BoxesLVLLabel = new JLabel(BoxLv9_10Icon);    	
    	BoxesLVLLabel.setHorizontalTextPosition(JLabel.CENTER);
    	BoxesLVLLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	BoxesLVLLabel.setText("Box Level: " + CarMain.BoxLevel);
    	
        UpgradesPanelSub.add(PlayerLabel);
        UpgradesPanelSub.add(jbtnUpgradeLevel);
        UpgradesPanelSub2.add(GarageLabel);
        UpgradesPanelSub2.add(jbtnUpgradeGarageLevel);
        UpgradesPanelSub3.add(BoxesLVLLabel);
        UpgradesPanelSub3.add(jbtnUpgradeBoxesLevel);
        UpgradesPanel.add(UpgradesPanelSub);
        UpgradesPanel.add(UpgradesPanelSub2);
        UpgradesPanel.add(UpgradesPanelSub3);
      
        JPanel BuyBoxesPanel = new JPanel();
        
        JPanel BuyBoxesPanelSub = new JPanel();
        BuyBoxesPanelSub.setLayout(new BoxLayout(BuyBoxesPanelSub, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub2 = new JPanel();
        BuyBoxesPanelSub2.setLayout(new BoxLayout(BuyBoxesPanelSub2, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub3 = new JPanel();
        BuyBoxesPanelSub3.setLayout(new BoxLayout(BuyBoxesPanelSub3, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub4 = new JPanel();
        BuyBoxesPanelSub4.setLayout(new BoxLayout(BuyBoxesPanelSub4, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub5 = new JPanel();
        BuyBoxesPanelSub5.setLayout(new BoxLayout(BuyBoxesPanelSub5, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub6 = new JPanel();
        BuyBoxesPanelSub6.setLayout(new BoxLayout(BuyBoxesPanelSub6, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub7 = new JPanel();
        BuyBoxesPanelSub7.setLayout(new BoxLayout(BuyBoxesPanelSub7, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub8 = new JPanel();
        BuyBoxesPanelSub8.setLayout(new BoxLayout(BuyBoxesPanelSub8, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub9 = new JPanel();
        BuyBoxesPanelSub9.setLayout(new BoxLayout(BuyBoxesPanelSub9, BoxLayout.PAGE_AXIS));
        
        JPanel BuyBoxesPanelSub10 = new JPanel();
        BuyBoxesPanelSub10.setLayout(new BoxLayout(BuyBoxesPanelSub10, BoxLayout.PAGE_AXIS));
        
        
        JLabel BoxesLVL1Label = new JLabel(BoxLv1_2Icon);    	
    	BoxesLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
    	BoxesLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
    	BoxesLVL1Label.setText("<html>1 LVL Box<br>" + "Count: " + Box.BoxLv1.BoxCount);
    	
    	JLabel BoxesLVL2Label = new JLabel(BoxLv1_2Icon);    	
     	BoxesLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL2Label.setText("<html>2 LVL Box<br>" + "Count: " + Box.BoxLv2.BoxCount);
    	
     	JLabel BoxesLVL3Label = new JLabel(BoxLv3_4Icon);    	
     	BoxesLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL3Label.setText("<html>3 LVL Box<br>" + "Count: " + Box.BoxLv3.BoxCount);
    	
     	JLabel BoxesLVL4Label = new JLabel(BoxLv3_4Icon);    	
     	BoxesLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL4Label.setText("<html>4 LVL Box<br>" + "Count: " + Box.BoxLv4.BoxCount);
     	
     	JLabel BoxesLVL5Label = new JLabel(BoxLv5_6Icon);    	
     	BoxesLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL5Label.setText("<html>5 LVL Box<br>" + "Count: " + Box.BoxLv5.BoxCount);
     	
     	JLabel BoxesLVL6Label = new JLabel(BoxLv5_6Icon);    	
     	BoxesLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL6Label.setText("<html>6 LVL Box<br>" + "Count: " + Box.BoxLv6.BoxCount);
     	
     	JLabel BoxesLVL7Label = new JLabel(BoxLv7_8Icon);    	
     	BoxesLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL7Label.setText("<html>7 LVL Box<br>" + "Count: " + Box.BoxLv7.BoxCount);
     	
     	JLabel BoxesLVL8Label = new JLabel(BoxLv7_8Icon);    	
     	BoxesLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL8Label.setText("<html>8 LVL Box<br>" + "Count: " + Box.BoxLv8.BoxCount);
     	
     	JLabel BoxesLVL9Label = new JLabel(BoxLv9_10Icon);    	
     	BoxesLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL9Label.setText("<html>9 LVL Box<br>" + "Count: " + Box.BoxLv9.BoxCount);
     	
     	JLabel BoxesLVL10Label = new JLabel(BoxLv9_10Icon);    	
     	BoxesLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL10Label.setText("<html>10 LVL Box<br>" + "Count: " + Box.BoxLv10.BoxCount);
    	    
        BuyBoxesPanelSub.add(BoxesLVL1Label);
        BuyBoxesPanelSub.add(jbtnBuyBoxLv1);
        BuyBoxesPanelSub2.add(BoxesLVL2Label);
        BuyBoxesPanelSub2.add(jbtnBuyBoxLv2);
        BuyBoxesPanelSub3.add(BoxesLVL3Label);
        BuyBoxesPanelSub3.add(jbtnBuyBoxLv3);
        BuyBoxesPanelSub4.add(BoxesLVL4Label);
        BuyBoxesPanelSub4.add(jbtnBuyBoxLv4);
        BuyBoxesPanelSub5.add(BoxesLVL5Label);
        BuyBoxesPanelSub5.add(jbtnBuyBoxLv5);
        BuyBoxesPanelSub6.add(BoxesLVL6Label);
        BuyBoxesPanelSub6.add(jbtnBuyBoxLv6);
        BuyBoxesPanelSub7.add(BoxesLVL7Label);
        BuyBoxesPanelSub7.add(jbtnBuyBoxLv7);
        BuyBoxesPanelSub8.add(BoxesLVL8Label);
        BuyBoxesPanelSub8.add(jbtnBuyBoxLv8);
        BuyBoxesPanelSub9.add(BoxesLVL9Label);
        BuyBoxesPanelSub9.add(jbtnBuyBoxLv9);
        BuyBoxesPanelSub10.add(BoxesLVL10Label);
        BuyBoxesPanelSub10.add(jbtnBuyBoxLv10);
        
        BuyBoxesPanel.add(BuyBoxesPanelSub);
        BuyBoxesPanel.add(BuyBoxesPanelSub2);
        BuyBoxesPanel.add(BuyBoxesPanelSub3);
        BuyBoxesPanel.add(BuyBoxesPanelSub4);
        BuyBoxesPanel.add(BuyBoxesPanelSub5);
        BuyBoxesPanel.add(BuyBoxesPanelSub6);
        BuyBoxesPanel.add(BuyBoxesPanelSub7);
        BuyBoxesPanel.add(BuyBoxesPanelSub8);
        BuyBoxesPanel.add(BuyBoxesPanelSub9);
        BuyBoxesPanel.add(BuyBoxesPanelSub10);
        
        
        JPanel OpenBoxesPanel = new JPanel();
        
        JPanel OpenBoxesPanelSub = new JPanel();
        OpenBoxesPanelSub.setLayout(new BoxLayout(OpenBoxesPanelSub, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub2 = new JPanel();
        OpenBoxesPanelSub2.setLayout(new BoxLayout(OpenBoxesPanelSub2, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub3 = new JPanel();
        OpenBoxesPanelSub3.setLayout(new BoxLayout(OpenBoxesPanelSub3, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub4 = new JPanel();
        OpenBoxesPanelSub4.setLayout(new BoxLayout(OpenBoxesPanelSub4, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub5 = new JPanel();
        OpenBoxesPanelSub5.setLayout(new BoxLayout(OpenBoxesPanelSub5, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub6 = new JPanel();
        OpenBoxesPanelSub6.setLayout(new BoxLayout(OpenBoxesPanelSub6, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub7 = new JPanel();
        OpenBoxesPanelSub7.setLayout(new BoxLayout(OpenBoxesPanelSub7, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub8 = new JPanel();
        OpenBoxesPanelSub8.setLayout(new BoxLayout(OpenBoxesPanelSub8, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub9 = new JPanel();
        OpenBoxesPanelSub9.setLayout(new BoxLayout(OpenBoxesPanelSub9, BoxLayout.PAGE_AXIS));
        
        JPanel OpenBoxesPanelSub10 = new JPanel();
        OpenBoxesPanelSub10.setLayout(new BoxLayout(OpenBoxesPanelSub10, BoxLayout.PAGE_AXIS));
        
        JLabel OpenBoxesLVL1Label = new JLabel(BoxLv1_2Icon);    	
    	OpenBoxesLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
    	OpenBoxesLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
    	OpenBoxesLVL1Label.setText("<html>1 LVL Box<br>" + "Count: " + Box.BoxLv1.BoxCount);
    	
    	JLabel OpenBoxesLVL2Label = new JLabel(BoxLv1_2Icon);    	
     	OpenBoxesLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL2Label.setText("<html>2 LVL Box<br>" + "Count: " + Box.BoxLv2.BoxCount);
    	
     	JLabel OpenBoxesLVL3Label = new JLabel(BoxLv3_4Icon);    	
     	OpenBoxesLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL3Label.setText("<html>3 LVL Box<br>" + "Count: " + Box.BoxLv3.BoxCount);
    	
     	JLabel OpenBoxesLVL4Label = new JLabel(BoxLv3_4Icon);    	
     	OpenBoxesLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL4Label.setText("<html>4 LVL Box<br>" + "Count: " + Box.BoxLv4.BoxCount);
     	
     	JLabel OpenBoxesLVL5Label = new JLabel(BoxLv5_6Icon);    	
     	OpenBoxesLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL5Label.setText("<html>5 LVL Box<br>" + "Count: " + Box.BoxLv5.BoxCount);
     	
     	JLabel OpenBoxesLVL6Label = new JLabel(BoxLv5_6Icon);    	
     	OpenBoxesLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL6Label.setText("<html>6 LVL Box<br>" + "Count: " + Box.BoxLv6.BoxCount);
     	
     	JLabel OpenBoxesLVL7Label = new JLabel(BoxLv7_8Icon);    	
     	OpenBoxesLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL7Label.setText("<html>7 LVL Box<br>" + "Count: " + Box.BoxLv7.BoxCount);
     	
     	JLabel OpenBoxesLVL8Label = new JLabel(BoxLv7_8Icon);    	
     	OpenBoxesLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL8Label.setText("<html>8 LVL Box<br>" + "Count: " + Box.BoxLv8.BoxCount);
     	
     	JLabel OpenBoxesLVL9Label = new JLabel(BoxLv9_10Icon);    	
     	OpenBoxesLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL9Label.setText("<html>9 LVL Box<br>" + "Count: " + Box.BoxLv9.BoxCount);
     	
     	JLabel OpenBoxesLVL10Label = new JLabel(BoxLv9_10Icon);    	
     	OpenBoxesLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL10Label.setText("<html>10 LVL Box<br>" + "Count: " + Box.BoxLv10.BoxCount);
                    
        OpenBoxesPanelSub.add(OpenBoxesLVL1Label);
        OpenBoxesPanelSub.add(jbtnPartsLv1);
        OpenBoxesPanelSub2.add(OpenBoxesLVL2Label);
        OpenBoxesPanelSub2.add(jbtnPartsLv2);
        OpenBoxesPanelSub3.add(OpenBoxesLVL3Label);
        OpenBoxesPanelSub3.add(jbtnPartsLv3);
        OpenBoxesPanelSub4.add(OpenBoxesLVL4Label);
        OpenBoxesPanelSub4.add(jbtnPartsLv4);
        OpenBoxesPanelSub5.add(OpenBoxesLVL5Label);
        OpenBoxesPanelSub5.add(jbtnPartsLv5);
        OpenBoxesPanelSub6.add(OpenBoxesLVL6Label);
        OpenBoxesPanelSub6.add(jbtnPartsLv6);
        OpenBoxesPanelSub7.add(OpenBoxesLVL7Label);
        OpenBoxesPanelSub7.add(jbtnPartsLv7);
        OpenBoxesPanelSub8.add(OpenBoxesLVL8Label);
        OpenBoxesPanelSub8.add(jbtnPartsLv8);
        OpenBoxesPanelSub9.add(OpenBoxesLVL9Label);
        OpenBoxesPanelSub9.add(jbtnPartsLv9);
        OpenBoxesPanelSub10.add(OpenBoxesLVL10Label);
        OpenBoxesPanelSub10.add(jbtnPartsLv10);
        
        OpenBoxesPanel.add(OpenBoxesPanelSub);
        OpenBoxesPanel.add(OpenBoxesPanelSub2);
        OpenBoxesPanel.add(OpenBoxesPanelSub3);
        OpenBoxesPanel.add(OpenBoxesPanelSub4);
        OpenBoxesPanel.add(OpenBoxesPanelSub5);
        OpenBoxesPanel.add(OpenBoxesPanelSub6);
        OpenBoxesPanel.add(OpenBoxesPanelSub7);
        OpenBoxesPanel.add(OpenBoxesPanelSub8);
        OpenBoxesPanel.add(OpenBoxesPanelSub9);
        OpenBoxesPanel.add(OpenBoxesPanelSub10);
         
        
        JPanel BuildCarsPanel = new JPanel();
        
        JPanel BuildCarsPanelSub = new JPanel();
        BuildCarsPanelSub.setLayout(new BoxLayout(BuildCarsPanelSub, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub2 = new JPanel();
        BuildCarsPanelSub2.setLayout(new BoxLayout(BuildCarsPanelSub2, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub3 = new JPanel();
        BuildCarsPanelSub3.setLayout(new BoxLayout(BuildCarsPanelSub3, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub4 = new JPanel();
        BuildCarsPanelSub4.setLayout(new BoxLayout(BuildCarsPanelSub4, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub5 = new JPanel();
        BuildCarsPanelSub5.setLayout(new BoxLayout(BuildCarsPanelSub5, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub6 = new JPanel();
        BuildCarsPanelSub6.setLayout(new BoxLayout(BuildCarsPanelSub6, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub7 = new JPanel();
        BuildCarsPanelSub7.setLayout(new BoxLayout(BuildCarsPanelSub7, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub8 = new JPanel();
        BuildCarsPanelSub8.setLayout(new BoxLayout(BuildCarsPanelSub8, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub9 = new JPanel();
        BuildCarsPanelSub9.setLayout(new BoxLayout(BuildCarsPanelSub9, BoxLayout.PAGE_AXIS));
        
        JPanel BuildCarsPanelSub10 = new JPanel();
        BuildCarsPanelSub10.setLayout(new BoxLayout(BuildCarsPanelSub10, BoxLayout.PAGE_AXIS));
        
        JLabel CarsLv1Label = new JLabel(Opel_ZafiraIcon);    	
     	CarsLv1Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv1Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv1Label.setText("<html>1 LVL Cars<br>" + "Owned: " + CountLv1Cars() + " of 20");
     	
     	JLabel CarsLv2Label = new JLabel(Ferrari_EnzoIcon);    	
     	CarsLv2Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv2Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv2Label.setText("<html>2 LVL Cars<br>" + "Owned: " + CountLv2Cars() + " of 20");
     	
     	JLabel CarsLv3Label = new JLabel(Fiat_500Icon);    	
     	CarsLv3Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv3Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv3Label.setText("<html>3 LVL Cars<br>" + "Owned: " + CountLv3Cars() + " of 20");
     	
     	JLabel CarsLv4Label = new JLabel(BMW_e30Icon);    	
     	CarsLv4Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv4Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv4Label.setText("<html>4 LVL Cars<br>" + "Owned: " + CountLv4Cars() + " of 20");
     	
     	JLabel CarsLv5Label = new JLabel(Pagani_ZondaFIcon);    	
     	CarsLv5Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv5Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv5Label.setText("<html>5 LVL Cars<br>" + "Owned: " + CountLv5Cars() + " of 20");
     	
     	JLabel CarsLv6Label = new JLabel(Vaz_2103Icon);    	
     	CarsLv6Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv6Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv6Label.setText("<html>6 LVL Cars<br>" + "Owned: " + CountLv6Cars() + " of 20");
     	
     	JLabel CarsLv7Label = new JLabel(Audi_CoupeIcon);    	
     	CarsLv7Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv7Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv7Label.setText("<html>7 LVL Cars<br>" + "Owned: " + CountLv7Cars() + " of 20");
     	
     	JLabel CarsLv8Label = new JLabel(Ford_MustangIcon);    	
     	CarsLv8Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv8Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv8Label.setText("<html>8 LVL Cars<br>" + "Owned: " + CountLv8Cars() + " of 20");
     	
     	JLabel CarsLv9Label = new JLabel(GMC_YukonIcon);    	
     	CarsLv9Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv9Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv9Label.setText("<html>9 LVL Cars<br>" + "Owned: " + CountLv9Cars() + " of 20");
     	
     	JLabel CarsLv10Label = new JLabel(Cadilliac_EldoradoIcon);    	
     	CarsLv10Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv10Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv10Label.setText("<html>10 LVL Cars<br>" + "Owned: " + CountLv10Cars() + " of 20");
        
     	
     	BuildCarsPanelSub.add(CarsLv1Label);
     	BuildCarsPanelSub.add(jbtnBuildCarLv1);
     	BuildCarsPanelSub2.add(CarsLv2Label);
     	BuildCarsPanelSub2.add(jbtnBuildCarLv2);
     	BuildCarsPanelSub3.add(CarsLv3Label);
     	BuildCarsPanelSub3.add(jbtnBuildCarLv3);
     	BuildCarsPanelSub4.add(CarsLv4Label);
     	BuildCarsPanelSub4.add(jbtnBuildCarLv4);
     	BuildCarsPanelSub5.add(CarsLv5Label);
     	BuildCarsPanelSub5.add(jbtnBuildCarLv5);
     	BuildCarsPanelSub6.add(CarsLv6Label);
     	BuildCarsPanelSub6.add(jbtnBuildCarLv6);
     	BuildCarsPanelSub7.add(CarsLv7Label);
     	BuildCarsPanelSub7.add(jbtnBuildCarLv7);
     	BuildCarsPanelSub8.add(CarsLv8Label);
     	BuildCarsPanelSub8.add(jbtnBuildCarLv8);
     	BuildCarsPanelSub9.add(CarsLv9Label);
     	BuildCarsPanelSub9.add(jbtnBuildCarLv9);
     	BuildCarsPanelSub10.add(CarsLv10Label);
     	BuildCarsPanelSub10.add(jbtnBuildCarLv10);
     	
     	BuildCarsPanel.add(BuildCarsPanelSub);
     	BuildCarsPanel.add(BuildCarsPanelSub2);
     	BuildCarsPanel.add(BuildCarsPanelSub3);
     	BuildCarsPanel.add(BuildCarsPanelSub4);
     	BuildCarsPanel.add(BuildCarsPanelSub5);
     	BuildCarsPanel.add(BuildCarsPanelSub6);
     	BuildCarsPanel.add(BuildCarsPanelSub7);
     	BuildCarsPanel.add(BuildCarsPanelSub8);
     	BuildCarsPanel.add(BuildCarsPanelSub9);
     	BuildCarsPanel.add(BuildCarsPanelSub10);
        
        JPanel BuyFramesPanel = new JPanel();
        
        JPanel BuyFramesPanelSub = new JPanel();
        BuyFramesPanelSub.setLayout(new BoxLayout(BuyFramesPanelSub, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub2 = new JPanel();
        BuyFramesPanelSub2.setLayout(new BoxLayout(BuyFramesPanelSub2, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub3 = new JPanel();
        BuyFramesPanelSub3.setLayout(new BoxLayout(BuyFramesPanelSub3, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub4 = new JPanel();
        BuyFramesPanelSub4.setLayout(new BoxLayout(BuyFramesPanelSub4, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub5 = new JPanel();
        BuyFramesPanelSub5.setLayout(new BoxLayout(BuyFramesPanelSub5, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub6 = new JPanel();
        BuyFramesPanelSub6.setLayout(new BoxLayout(BuyFramesPanelSub6, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub7 = new JPanel();
        BuyFramesPanelSub7.setLayout(new BoxLayout(BuyFramesPanelSub7, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub8 = new JPanel();
        BuyFramesPanelSub8.setLayout(new BoxLayout(BuyFramesPanelSub8, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub9 = new JPanel();
        BuyFramesPanelSub9.setLayout(new BoxLayout(BuyFramesPanelSub9, BoxLayout.PAGE_AXIS));
        
        JPanel BuyFramesPanelSub10 = new JPanel();
        BuyFramesPanelSub10.setLayout(new BoxLayout(BuyFramesPanelSub10, BoxLayout.PAGE_AXIS));
        
        JLabel FrameLv1Label = new JLabel(CarFrameIcon);    	
     	FrameLv1Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv1Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv1Label.setText("<html>1 LVL Frame<br>" + "Count: " + CarFrame.FrameLv1.FrameCount);
     	
     	JLabel FrameLv2Label = new JLabel(CarFrameIcon);    	
     	FrameLv2Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv2Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv2Label.setText("<html>2 LVL Frame<br>" + "Count: " + CarFrame.FrameLv2.FrameCount);
     	
     	JLabel FrameLv3Label = new JLabel(CarFrameIcon);    	
     	FrameLv3Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv3Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv3Label.setText("<html>3 LVL Frame<br>" + "Count: " + CarFrame.FrameLv3.FrameCount);
     	
     	JLabel FrameLv4Label = new JLabel(CarFrameIcon);    	
     	FrameLv4Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv4Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv4Label.setText("<html>4 LVL Frame<br>" + "Count: " + CarFrame.FrameLv4.FrameCount);
     	
     	JLabel FrameLv5Label = new JLabel(CarFrameIcon);    	
     	FrameLv5Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv5Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv5Label.setText("<html>5 LVL Frame<br>" + "Count: " + CarFrame.FrameLv5.FrameCount);
     	
     	JLabel FrameLv6Label = new JLabel(CarFrameIcon);    	
     	FrameLv6Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv6Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv6Label.setText("<html>6 LVL Frame<br>" + "Count: " + CarFrame.FrameLv6.FrameCount);
     	
     	JLabel FrameLv7Label = new JLabel(CarFrameIcon);    	
     	FrameLv7Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv7Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv7Label.setText("<html>7 LVL Frame<br>" + "Count: " + CarFrame.FrameLv7.FrameCount);
     	
     	JLabel FrameLv8Label = new JLabel(CarFrameIcon);    	
     	FrameLv8Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv8Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv8Label.setText("<html>8 LVL Frame<br>" + "Count: " + CarFrame.FrameLv8.FrameCount);
     	
     	JLabel FrameLv9Label = new JLabel(CarFrameIcon);    	
     	FrameLv9Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv9Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv9Label.setText("<html>9 LVL Frame<br>" + "Count: " + CarFrame.FrameLv9.FrameCount);
     	
     	JLabel FrameLv10Label = new JLabel(CarFrameIcon);    	
     	FrameLv10Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv10Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv10Label.setText("<html>10 LVL Frame<br>" + "Count: " + CarFrame.FrameLv10.FrameCount);
          	
     	BuyFramesPanelSub.add(FrameLv1Label);
     	BuyFramesPanelSub.add(jbtnBuyFrameLv1);
     	BuyFramesPanelSub2.add(FrameLv2Label);
     	BuyFramesPanelSub2.add(jbtnBuyFrameLv2);
     	BuyFramesPanelSub3.add(FrameLv3Label);
     	BuyFramesPanelSub3.add(jbtnBuyFrameLv3);
     	BuyFramesPanelSub4.add(FrameLv4Label);
     	BuyFramesPanelSub4.add(jbtnBuyFrameLv4);
     	BuyFramesPanelSub5.add(FrameLv5Label);
     	BuyFramesPanelSub5.add(jbtnBuyFrameLv5);
     	BuyFramesPanelSub6.add(FrameLv6Label);
     	BuyFramesPanelSub6.add(jbtnBuyFrameLv6);
     	BuyFramesPanelSub7.add(FrameLv7Label);
     	BuyFramesPanelSub7.add(jbtnBuyFrameLv7);
     	BuyFramesPanelSub8.add(FrameLv8Label);
     	BuyFramesPanelSub8.add(jbtnBuyFrameLv8);
     	BuyFramesPanelSub9.add(FrameLv9Label);
     	BuyFramesPanelSub9.add(jbtnBuyFrameLv9);
     	BuyFramesPanelSub10.add(FrameLv10Label);
     	BuyFramesPanelSub10.add(jbtnBuyFrameLv10);
     	
     	BuyFramesPanel.add(BuyFramesPanelSub);
     	BuyFramesPanel.add(BuyFramesPanelSub2);
     	BuyFramesPanel.add(BuyFramesPanelSub3);
     	BuyFramesPanel.add(BuyFramesPanelSub4);
     	BuyFramesPanel.add(BuyFramesPanelSub5);
     	BuyFramesPanel.add(BuyFramesPanelSub6);
     	BuyFramesPanel.add(BuyFramesPanelSub7);
     	BuyFramesPanel.add(BuyFramesPanelSub8);
     	BuyFramesPanel.add(BuyFramesPanelSub9);
     	BuyFramesPanel.add(BuyFramesPanelSub10);
        
        JPanel SellPartsPanel = new JPanel();
        
        JPanel SellPartsLVL1Panel = new JPanel();
        
        JPanel SellPartsLVL1PanelSub = new JPanel();
        SellPartsLVL1PanelSub.setLayout(new BoxLayout(SellPartsLVL1PanelSub, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub2 = new JPanel();
        SellPartsLVL1PanelSub2.setLayout(new BoxLayout(SellPartsLVL1PanelSub2, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub3 = new JPanel();
        SellPartsLVL1PanelSub3.setLayout(new BoxLayout(SellPartsLVL1PanelSub3, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub4 = new JPanel();
        SellPartsLVL1PanelSub4.setLayout(new BoxLayout(SellPartsLVL1PanelSub4, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub5 = new JPanel();
        SellPartsLVL1PanelSub5.setLayout(new BoxLayout(SellPartsLVL1PanelSub5, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub6 = new JPanel();
        SellPartsLVL1PanelSub6.setLayout(new BoxLayout(SellPartsLVL1PanelSub6, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub7 = new JPanel();
        SellPartsLVL1PanelSub7.setLayout(new BoxLayout(SellPartsLVL1PanelSub7, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub8 = new JPanel();
        SellPartsLVL1PanelSub8.setLayout(new BoxLayout(SellPartsLVL1PanelSub8, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub9 = new JPanel();
        SellPartsLVL1PanelSub9.setLayout(new BoxLayout(SellPartsLVL1PanelSub9, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub10 = new JPanel();
        SellPartsLVL1PanelSub10.setLayout(new BoxLayout(SellPartsLVL1PanelSub10, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub11 = new JPanel();
        SellPartsLVL1PanelSub11.setLayout(new BoxLayout(SellPartsLVL1PanelSub11, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub12 = new JPanel();
        SellPartsLVL1PanelSub12.setLayout(new BoxLayout(SellPartsLVL1PanelSub12, BoxLayout.PAGE_AXIS));
        
        JPanel SellPartsLVL1PanelSub13 = new JPanel();
        SellPartsLVL1PanelSub13.setLayout(new BoxLayout(SellPartsLVL1PanelSub13, BoxLayout.PAGE_AXIS));
        
        JLabel AccessoriesLVL1Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL1Label.setText("<html>Accessories LVL 1<br>" + "Count: " + Part.AccessoriesLv1.PartCount);
        
        JLabel BodyLVL1Label = new JLabel(BodyIcon);    	
        BodyLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL1Label.setText("<html>Body LVL 1<br>" + "Count: " + Part.BodyLv1.PartCount);
        
        JLabel BrakesLVL1Label = new JLabel(BrakesIcon);    	
        BrakesLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL1Label.setText("<html>Brakes LVL 1<br>" + "Count: " + Part.BrakesLv1.PartCount);
        
        JLabel CoolingLVL1Label = new JLabel(CoolingIcon);    	
        CoolingLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL1Label.setText("<html>Cooling LVL 1<br>" + "Count: " + Part.CoolingLv1.PartCount);
        
        JLabel ElectronicsLVL1Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL1Label.setText("<html>Electronics LVL 1<br>" + "Count: " + Part.ElectronicsLv1.PartCount);
        
        JLabel EngineLVL1Label = new JLabel(EngineIcon);    	
        EngineLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL1Label.setText("<html>Engine LVL 1<br>" + "Count: " + Part.EngineLv1.PartCount);
        
        JLabel ExaustLVL1Label = new JLabel(ExaustIcon);    	
        ExaustLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL1Label.setText("<html>Exaust LVL 1<br>" + "Count: " + Part.ExaustLv1.PartCount);
        
        JLabel FuelLVL1Label = new JLabel(FuelIcon);    	
        FuelLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL1Label.setText("<html>Fuel LVL 1<br>" + "Count: " + Part.FuelLv1.PartCount);
        
        JLabel InteriorLVL1Label = new JLabel(InteriorIcon);    	
        InteriorLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL1Label.setText("<html>Interior LVL 1<br>" + "Count: " + Part.InteriorLv1.PartCount);
        
        JLabel SteeringLVL1Label = new JLabel(SteeringIcon);    	
        SteeringLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL1Label.setText("<html>Steering LVL 1<br>" + "Count: " + Part.SteeringLv1.PartCount);
        
        JLabel SuspensionLVL1Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL1Label.setText("<html>Suspension LVL 1<br>" + "Count: " + Part.SuspensionLv1.PartCount);
        
        JLabel TransmissionLVL1Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL1Label.setText("<html>Transmission LVL 1<br>" + "Count: " + Part.TransmissionLv1.PartCount);
        
        JLabel TiresLVL1Label = new JLabel(TiresIcon);    	
        TiresLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL1Label.setText("<html>Tires LVL 1<br>" + "Count: " + Part.TiresLv1.PartCount);
               
        SellPartsLVL1PanelSub.add(AccessoriesLVL1Label);
        SellPartsLVL1PanelSub.add(jbtnSellAccessoriesLv1);
        SellPartsLVL1PanelSub2.add(BodyLVL1Label);
        SellPartsLVL1PanelSub2.add(jbtnSellBodyLv1);
        SellPartsLVL1PanelSub3.add(BrakesLVL1Label);
        SellPartsLVL1PanelSub3.add(jbtnSellBrakesLv1);
        SellPartsLVL1PanelSub4.add(CoolingLVL1Label);
        SellPartsLVL1PanelSub4.add(jbtnSellCoolingLv1);
        SellPartsLVL1PanelSub5.add(ElectronicsLVL1Label);
        SellPartsLVL1PanelSub5.add(jbtnSellElectronicsLv1);
        SellPartsLVL1PanelSub6.add(EngineLVL1Label);
        SellPartsLVL1PanelSub6.add(jbtnSellEngineLv1);
        SellPartsLVL1PanelSub7.add(ExaustLVL1Label);
        SellPartsLVL1PanelSub7.add(jbtnSellExaustLv1);
        SellPartsLVL1PanelSub8.add(FuelLVL1Label);
        SellPartsLVL1PanelSub8.add(jbtnSellFuelLv1);
        SellPartsLVL1PanelSub9.add(InteriorLVL1Label);
        SellPartsLVL1PanelSub9.add(jbtnSellInteriorLv1);
        SellPartsLVL1PanelSub10.add(SteeringLVL1Label);
        SellPartsLVL1PanelSub10.add(jbtnSellSteeringLv1);
        SellPartsLVL1PanelSub11.add(SuspensionLVL1Label);
        SellPartsLVL1PanelSub11.add(jbtnSellSuspensionLv1);
        SellPartsLVL1PanelSub12.add(TransmissionLVL1Label);
        SellPartsLVL1PanelSub12.add(jbtnSellTransmissionLv1);
        SellPartsLVL1PanelSub13.add(TiresLVL1Label);
        SellPartsLVL1PanelSub13.add(jbtnSellTiresLv1);
        
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub2);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub3);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub4);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub5);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub6);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub7);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub8);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub9);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub10);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub11);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub12);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub13);

        
   	 	JPanel SellPartsLVL2Panel = new JPanel();
   	 	
   	 	JPanel SellPartsLVL2PanelSub = new JPanel();
   	 	SellPartsLVL2PanelSub.setLayout(new BoxLayout(SellPartsLVL2PanelSub, BoxLayout.PAGE_AXIS));
   	 	
   	 	JPanel SellPartsLVL2PanelSub2 = new JPanel();
	 	SellPartsLVL2PanelSub2.setLayout(new BoxLayout(SellPartsLVL2PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub3 = new JPanel();
	 	SellPartsLVL2PanelSub3.setLayout(new BoxLayout(SellPartsLVL2PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub4 = new JPanel();
	 	SellPartsLVL2PanelSub4.setLayout(new BoxLayout(SellPartsLVL2PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub5 = new JPanel();
	 	SellPartsLVL2PanelSub5.setLayout(new BoxLayout(SellPartsLVL2PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub6 = new JPanel();
	 	SellPartsLVL2PanelSub6.setLayout(new BoxLayout(SellPartsLVL2PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub7 = new JPanel();
	 	SellPartsLVL2PanelSub7.setLayout(new BoxLayout(SellPartsLVL2PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub8 = new JPanel();
	 	SellPartsLVL2PanelSub8.setLayout(new BoxLayout(SellPartsLVL2PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub9 = new JPanel();
	 	SellPartsLVL2PanelSub9.setLayout(new BoxLayout(SellPartsLVL2PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub10 = new JPanel();
	 	SellPartsLVL2PanelSub10.setLayout(new BoxLayout(SellPartsLVL2PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub11 = new JPanel();
	 	SellPartsLVL2PanelSub11.setLayout(new BoxLayout(SellPartsLVL2PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub12 = new JPanel();
	 	SellPartsLVL2PanelSub12.setLayout(new BoxLayout(SellPartsLVL2PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL2PanelSub13 = new JPanel();
	 	SellPartsLVL2PanelSub13.setLayout(new BoxLayout(SellPartsLVL2PanelSub13, BoxLayout.PAGE_AXIS));
   	 	
	 	JLabel AccessoriesLVL2Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL2Label.setText("<html>Accessories LVL 2<br>" + "Count: " + Part.AccessoriesLv2.PartCount);
        
        JLabel BodyLVL2Label = new JLabel(BodyIcon);    	
        BodyLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL2Label.setText("<html>Body LVL 2<br>" + "Count: " + Part.BodyLv2.PartCount);
        
        JLabel BrakesLVL2Label = new JLabel(BrakesIcon);    	
        BrakesLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL2Label.setText("<html>Brakes LVL 2<br>" + "Count: " + Part.BrakesLv2.PartCount);
        
        JLabel CoolingLVL2Label = new JLabel(CoolingIcon);    	
        CoolingLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL2Label.setText("<html>Cooling LVL 2<br>" + "Count: " + Part.CoolingLv2.PartCount);
        
        JLabel ElectronicsLVL2Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL2Label.setText("<html>Electronics LVL 2<br>" + "Count: " + Part.ElectronicsLv2.PartCount);
        
        JLabel EngineLVL2Label = new JLabel(EngineIcon);    	
        EngineLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL2Label.setText("<html>Engine LVL 2<br>" + "Count: " + Part.EngineLv2.PartCount);
        
        JLabel ExaustLVL2Label = new JLabel(ExaustIcon);    	
        ExaustLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL2Label.setText("<html>Exaust LVL 2<br>" + "Count: " + Part.ExaustLv2.PartCount);
        
        JLabel FuelLVL2Label = new JLabel(FuelIcon);    	
        FuelLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL2Label.setText("<html>Fuel LVL 2<br>" + "Count: " + Part.FuelLv2.PartCount);
        
        JLabel InteriorLVL2Label = new JLabel(InteriorIcon);    	
        InteriorLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL2Label.setText("<html>Interior LVL 2<br>" + "Count: " + Part.InteriorLv2.PartCount);
        
        JLabel SteeringLVL2Label = new JLabel(SteeringIcon);    	
        SteeringLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL2Label.setText("<html>Steering LVL 2<br>" + "Count: " + Part.SteeringLv2.PartCount);
        
        JLabel SuspensionLVL2Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL2Label.setText("<html>Suspension LVL 2<br>" + "Count: " + Part.SuspensionLv2.PartCount);
        
        JLabel TransmissionLVL2Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL2Label.setText("<html>Transmission LVL 2<br>" + "Count: " + Part.TransmissionLv2.PartCount);
        
        JLabel TiresLVL2Label = new JLabel(TiresIcon);    	
        TiresLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL2Label.setText("<html>Tires LVL 2<br>" + "Count: " + Part.TiresLv2.PartCount);
               
        SellPartsLVL2PanelSub.add(AccessoriesLVL2Label);
        SellPartsLVL2PanelSub.add(jbtnSellAccessoriesLv2);
        SellPartsLVL2PanelSub2.add(BodyLVL2Label);
        SellPartsLVL2PanelSub2.add(jbtnSellBodyLv2);
        SellPartsLVL2PanelSub3.add(BrakesLVL2Label);
        SellPartsLVL2PanelSub3.add(jbtnSellBrakesLv2);
        SellPartsLVL2PanelSub4.add(CoolingLVL2Label);
        SellPartsLVL2PanelSub4.add(jbtnSellCoolingLv2);
        SellPartsLVL2PanelSub5.add(ElectronicsLVL2Label);
        SellPartsLVL2PanelSub5.add(jbtnSellElectronicsLv2);
        SellPartsLVL2PanelSub6.add(EngineLVL2Label);
        SellPartsLVL2PanelSub6.add(jbtnSellEngineLv2);
        SellPartsLVL2PanelSub7.add(ExaustLVL2Label);
        SellPartsLVL2PanelSub7.add(jbtnSellExaustLv2);
        SellPartsLVL2PanelSub8.add(FuelLVL2Label);
        SellPartsLVL2PanelSub8.add(jbtnSellFuelLv2);
        SellPartsLVL2PanelSub9.add(InteriorLVL2Label);
        SellPartsLVL2PanelSub9.add(jbtnSellInteriorLv2);
        SellPartsLVL2PanelSub10.add(SteeringLVL2Label);
        SellPartsLVL2PanelSub10.add(jbtnSellSteeringLv2);
        SellPartsLVL2PanelSub11.add(SuspensionLVL2Label);
        SellPartsLVL2PanelSub11.add(jbtnSellSuspensionLv2);
        SellPartsLVL2PanelSub12.add(TransmissionLVL2Label);
        SellPartsLVL2PanelSub12.add(jbtnSellTransmissionLv2);
        SellPartsLVL2PanelSub13.add(TiresLVL2Label);
        SellPartsLVL2PanelSub13.add(jbtnSellTiresLv2);
        
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub2);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub3);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub4);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub5);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub6);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub7);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub8);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub9);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub10);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub11);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub12);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub13);
   	 
   	 	JPanel SellPartsLVL3Panel = new JPanel();
   	 	
   	 	JPanel SellPartsLVL3PanelSub = new JPanel();
	 	SellPartsLVL3PanelSub.setLayout(new BoxLayout(SellPartsLVL3PanelSub, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub2 = new JPanel();
	 	SellPartsLVL3PanelSub2.setLayout(new BoxLayout(SellPartsLVL3PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub3 = new JPanel();
	 	SellPartsLVL3PanelSub3.setLayout(new BoxLayout(SellPartsLVL3PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub4 = new JPanel();
	 	SellPartsLVL3PanelSub4.setLayout(new BoxLayout(SellPartsLVL3PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub5 = new JPanel();
	 	SellPartsLVL3PanelSub5.setLayout(new BoxLayout(SellPartsLVL3PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub6 = new JPanel();
	 	SellPartsLVL3PanelSub6.setLayout(new BoxLayout(SellPartsLVL3PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub7 = new JPanel();
	 	SellPartsLVL3PanelSub7.setLayout(new BoxLayout(SellPartsLVL3PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub8 = new JPanel();
	 	SellPartsLVL3PanelSub8.setLayout(new BoxLayout(SellPartsLVL3PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub9 = new JPanel();
	 	SellPartsLVL3PanelSub9.setLayout(new BoxLayout(SellPartsLVL3PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub10 = new JPanel();
	 	SellPartsLVL3PanelSub10.setLayout(new BoxLayout(SellPartsLVL3PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub11 = new JPanel();
	 	SellPartsLVL3PanelSub11.setLayout(new BoxLayout(SellPartsLVL3PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub12 = new JPanel();
	 	SellPartsLVL3PanelSub12.setLayout(new BoxLayout(SellPartsLVL3PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL3PanelSub13 = new JPanel();
	 	SellPartsLVL3PanelSub13.setLayout(new BoxLayout(SellPartsLVL3PanelSub13, BoxLayout.PAGE_AXIS));
   	 	
	 	JLabel AccessoriesLVL3Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL3Label.setText("<html>Accessories LVL 3<br>" + "Count: " + Part.AccessoriesLv3.PartCount);
        
        JLabel BodyLVL3Label = new JLabel(BodyIcon);    	
        BodyLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL3Label.setText("<html>Body LVL 3<br>" + "Count: " + Part.BodyLv3.PartCount);
        
        JLabel BrakesLVL3Label = new JLabel(BrakesIcon);    	
        BrakesLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL3Label.setText("<html>Brakes LVL 3<br>" + "Count: " + Part.BrakesLv3.PartCount);
        
        JLabel CoolingLVL3Label = new JLabel(CoolingIcon);    	
        CoolingLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL3Label.setText("<html>Cooling LVL 3<br>" + "Count: " + Part.CoolingLv3.PartCount);
        
        JLabel ElectronicsLVL3Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL3Label.setText("<html>Electronics LVL 3<br>" + "Count: " + Part.ElectronicsLv3.PartCount);
        
        JLabel EngineLVL3Label = new JLabel(EngineIcon);    	
        EngineLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL3Label.setText("<html>Engine LVL 3<br>" + "Count: " + Part.EngineLv3.PartCount);
        
        JLabel ExaustLVL3Label = new JLabel(ExaustIcon);    	
        ExaustLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL3Label.setText("<html>Exaust LVL 3<br>" + "Count: " + Part.ExaustLv3.PartCount);
        
        JLabel FuelLVL3Label = new JLabel(FuelIcon);    	
        FuelLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL3Label.setText("<html>Fuel LVL 3<br>" + "Count: " + Part.FuelLv3.PartCount);
        
        JLabel InteriorLVL3Label = new JLabel(InteriorIcon);    	
        InteriorLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL3Label.setText("<html>Interior LVL 3<br>" + "Count: " + Part.InteriorLv3.PartCount);
        
        JLabel SteeringLVL3Label = new JLabel(SteeringIcon);    	
        SteeringLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL3Label.setText("<html>Steering LVL 3<br>" + "Count: " + Part.SteeringLv3.PartCount);
        
        JLabel SuspensionLVL3Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL3Label.setText("<html>Suspension LVL 3<br>" + "Count: " + Part.SuspensionLv3.PartCount);
        
        JLabel TransmissionLVL3Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL3Label.setText("<html>Transmission LVL 3<br>" + "Count: " + Part.TransmissionLv3.PartCount);
        
        JLabel TiresLVL3Label = new JLabel(TiresIcon);    	
        TiresLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL3Label.setText("<html>Tires LVL 3<br>" + "Count: " + Part.TiresLv3.PartCount);
                
        SellPartsLVL3PanelSub.add(AccessoriesLVL3Label);
        SellPartsLVL3PanelSub.add(jbtnSellAccessoriesLv3);
        SellPartsLVL3PanelSub2.add(BodyLVL3Label);
        SellPartsLVL3PanelSub2.add(jbtnSellBodyLv3);
        SellPartsLVL3PanelSub3.add(BrakesLVL3Label);
        SellPartsLVL3PanelSub3.add(jbtnSellBrakesLv3);
        SellPartsLVL3PanelSub4.add(CoolingLVL3Label);
        SellPartsLVL3PanelSub4.add(jbtnSellCoolingLv3);
        SellPartsLVL3PanelSub5.add(ElectronicsLVL3Label);
        SellPartsLVL3PanelSub5.add(jbtnSellElectronicsLv3);
        SellPartsLVL3PanelSub6.add(EngineLVL3Label);
        SellPartsLVL3PanelSub6.add(jbtnSellEngineLv3);
        SellPartsLVL3PanelSub7.add(ExaustLVL3Label);
        SellPartsLVL3PanelSub7.add(jbtnSellExaustLv3);
        SellPartsLVL3PanelSub8.add(FuelLVL3Label);
        SellPartsLVL3PanelSub8.add(jbtnSellFuelLv3);
        SellPartsLVL3PanelSub9.add(InteriorLVL3Label);
        SellPartsLVL3PanelSub9.add(jbtnSellInteriorLv3);
        SellPartsLVL3PanelSub10.add(SteeringLVL3Label);
        SellPartsLVL3PanelSub10.add(jbtnSellSteeringLv3);
        SellPartsLVL3PanelSub11.add(SuspensionLVL3Label);
        SellPartsLVL3PanelSub11.add(jbtnSellSuspensionLv3);
        SellPartsLVL3PanelSub12.add(TransmissionLVL3Label);
        SellPartsLVL3PanelSub12.add(jbtnSellTransmissionLv3);
        SellPartsLVL3PanelSub13.add(TiresLVL3Label);
        SellPartsLVL3PanelSub13.add(jbtnSellTiresLv3);
        
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub2);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub3);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub4);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub5);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub6);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub7);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub8);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub9);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub10);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub11);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub12);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub13);
   	 	
   	 	JPanel SellPartsLVL4Panel = new JPanel();
   	 	
   	 	JPanel SellPartsLVL4PanelSub = new JPanel();
	 	SellPartsLVL4PanelSub.setLayout(new BoxLayout(SellPartsLVL4PanelSub, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub2 = new JPanel();
	 	SellPartsLVL4PanelSub2.setLayout(new BoxLayout(SellPartsLVL4PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub3 = new JPanel();
	 	SellPartsLVL4PanelSub3.setLayout(new BoxLayout(SellPartsLVL4PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub4 = new JPanel();
	 	SellPartsLVL4PanelSub4.setLayout(new BoxLayout(SellPartsLVL4PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub5 = new JPanel();
	 	SellPartsLVL4PanelSub5.setLayout(new BoxLayout(SellPartsLVL4PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub6 = new JPanel();
	 	SellPartsLVL4PanelSub6.setLayout(new BoxLayout(SellPartsLVL4PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub7 = new JPanel();
	 	SellPartsLVL4PanelSub7.setLayout(new BoxLayout(SellPartsLVL4PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub8 = new JPanel();
	 	SellPartsLVL4PanelSub8.setLayout(new BoxLayout(SellPartsLVL4PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub9 = new JPanel();
	 	SellPartsLVL4PanelSub9.setLayout(new BoxLayout(SellPartsLVL4PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub10 = new JPanel();
	 	SellPartsLVL4PanelSub10.setLayout(new BoxLayout(SellPartsLVL4PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub11 = new JPanel();
	 	SellPartsLVL4PanelSub11.setLayout(new BoxLayout(SellPartsLVL4PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub12 = new JPanel();
	 	SellPartsLVL4PanelSub12.setLayout(new BoxLayout(SellPartsLVL4PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL4PanelSub13 = new JPanel();
	 	SellPartsLVL4PanelSub13.setLayout(new BoxLayout(SellPartsLVL4PanelSub13, BoxLayout.PAGE_AXIS));
   	 	
	 	JLabel AccessoriesLVL4Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL4Label.setText("<html>Accessories LVL 4<br>" + "Count: " + Part.AccessoriesLv4.PartCount);
        
        JLabel BodyLVL4Label = new JLabel(BodyIcon);    	
        BodyLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL4Label.setText("<html>Body LVL 4<br>" + "Count: " + Part.BodyLv4.PartCount);
        
        JLabel BrakesLVL4Label = new JLabel(BrakesIcon);    	
        BrakesLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL4Label.setText("<html>Brakes LVL 4<br>" + "Count: " + Part.BrakesLv4.PartCount);
        
        JLabel CoolingLVL4Label = new JLabel(CoolingIcon);    	
        CoolingLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL4Label.setText("<html>Cooling LVL 4<br>" + "Count: " + Part.CoolingLv4.PartCount);
        
        JLabel ElectronicsLVL4Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL4Label.setText("<html>Electronics LVL 4<br>" + "Count: " + Part.ElectronicsLv4.PartCount);
        
        JLabel EngineLVL4Label = new JLabel(EngineIcon);    	
        EngineLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL4Label.setText("<html>Engine LVL 4<br>" + "Count: " + Part.EngineLv4.PartCount);
        
        JLabel ExaustLVL4Label = new JLabel(ExaustIcon);    	
        ExaustLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL4Label.setText("<html>Exaust LVL 4<br>" + "Count: " + Part.ExaustLv4.PartCount);
        
        JLabel FuelLVL4Label = new JLabel(FuelIcon);    	
        FuelLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL4Label.setText("<html>Fuel LVL 4<br>" + "Count: " + Part.FuelLv4.PartCount);
        
        JLabel InteriorLVL4Label = new JLabel(InteriorIcon);    	
        InteriorLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL4Label.setText("<html>Interior LVL 4<br>" + "Count: " + Part.InteriorLv4.PartCount);
        
        JLabel SteeringLVL4Label = new JLabel(SteeringIcon);    	
        SteeringLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL4Label.setText("<html>Steering LVL 4<br>" + "Count: " + Part.SteeringLv4.PartCount);
        
        JLabel SuspensionLVL4Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL4Label.setText("<html>Suspension LVL 4<br>" + "Count: " + Part.SuspensionLv4.PartCount);
        
        JLabel TransmissionLVL4Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL4Label.setText("<html>Transmission LVL 4<br>" + "Count: " + Part.TransmissionLv4.PartCount);
        
        JLabel TiresLVL4Label = new JLabel(TiresIcon);    	
        TiresLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL4Label.setText("<html>Tires LVL 4<br>" + "Count: " + Part.TiresLv4.PartCount);
               
        SellPartsLVL4PanelSub.add(AccessoriesLVL4Label);
        SellPartsLVL4PanelSub.add(jbtnSellAccessoriesLv4);
        SellPartsLVL4PanelSub2.add(BodyLVL4Label);
        SellPartsLVL4PanelSub2.add(jbtnSellBodyLv4);
        SellPartsLVL4PanelSub3.add(BrakesLVL4Label);
        SellPartsLVL4PanelSub3.add(jbtnSellBrakesLv4);
        SellPartsLVL4PanelSub4.add(CoolingLVL4Label);
        SellPartsLVL4PanelSub4.add(jbtnSellCoolingLv4);
        SellPartsLVL4PanelSub5.add(ElectronicsLVL4Label);
        SellPartsLVL4PanelSub5.add(jbtnSellElectronicsLv4);
        SellPartsLVL4PanelSub6.add(EngineLVL4Label);
        SellPartsLVL4PanelSub6.add(jbtnSellEngineLv4);
        SellPartsLVL4PanelSub7.add(ExaustLVL4Label);
        SellPartsLVL4PanelSub7.add(jbtnSellExaustLv4);
        SellPartsLVL4PanelSub8.add(FuelLVL4Label);
        SellPartsLVL4PanelSub8.add(jbtnSellFuelLv4);
        SellPartsLVL4PanelSub9.add(InteriorLVL4Label);
        SellPartsLVL4PanelSub9.add(jbtnSellInteriorLv4);
        SellPartsLVL4PanelSub10.add(SteeringLVL4Label);
        SellPartsLVL4PanelSub10.add(jbtnSellSteeringLv4);
        SellPartsLVL4PanelSub11.add(SuspensionLVL4Label);
        SellPartsLVL4PanelSub11.add(jbtnSellSuspensionLv4);
        SellPartsLVL4PanelSub12.add(TransmissionLVL4Label);
        SellPartsLVL4PanelSub12.add(jbtnSellTransmissionLv4);
        SellPartsLVL4PanelSub13.add(TiresLVL4Label);
        SellPartsLVL4PanelSub13.add(jbtnSellTiresLv4);
        
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub2);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub3);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub4);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub5);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub6);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub7);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub8);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub9);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub10);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub11);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub12);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub13);
   	 	
   	 	JPanel SellPartsLVL5Panel = new JPanel();
   	 	
   	 	JPanel SellPartsLVL5PanelSub = new JPanel();
	 	SellPartsLVL5PanelSub.setLayout(new BoxLayout(SellPartsLVL5PanelSub, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub2 = new JPanel();
	 	SellPartsLVL5PanelSub2.setLayout(new BoxLayout(SellPartsLVL5PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub3 = new JPanel();
	 	SellPartsLVL5PanelSub3.setLayout(new BoxLayout(SellPartsLVL5PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub4 = new JPanel();
	 	SellPartsLVL5PanelSub4.setLayout(new BoxLayout(SellPartsLVL5PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub5 = new JPanel();
	 	SellPartsLVL5PanelSub5.setLayout(new BoxLayout(SellPartsLVL5PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub6 = new JPanel();
	 	SellPartsLVL5PanelSub6.setLayout(new BoxLayout(SellPartsLVL5PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub7 = new JPanel();
	 	SellPartsLVL5PanelSub7.setLayout(new BoxLayout(SellPartsLVL5PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub8 = new JPanel();
	 	SellPartsLVL5PanelSub8.setLayout(new BoxLayout(SellPartsLVL5PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub9 = new JPanel();
	 	SellPartsLVL5PanelSub9.setLayout(new BoxLayout(SellPartsLVL5PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub10 = new JPanel();
	 	SellPartsLVL5PanelSub10.setLayout(new BoxLayout(SellPartsLVL5PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub11 = new JPanel();
	 	SellPartsLVL5PanelSub11.setLayout(new BoxLayout(SellPartsLVL5PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub12 = new JPanel();
	 	SellPartsLVL5PanelSub12.setLayout(new BoxLayout(SellPartsLVL5PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL5PanelSub13 = new JPanel();
	 	SellPartsLVL5PanelSub13.setLayout(new BoxLayout(SellPartsLVL5PanelSub13, BoxLayout.PAGE_AXIS));
   	 	
	 	JLabel AccessoriesLVL5Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL5Label.setText("<html>Accessories LVL 5<br>" + "Count: " + Part.AccessoriesLv5.PartCount);
        
        JLabel BodyLVL5Label = new JLabel(BodyIcon);    	
        BodyLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL5Label.setText("<html>Body LVL 5<br>" + "Count: " + Part.BodyLv5.PartCount);
        
        JLabel BrakesLVL5Label = new JLabel(BrakesIcon);    	
        BrakesLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL5Label.setText("<html>Brakes LVL 5<br>" + "Count: " + Part.BrakesLv5.PartCount);
        
        JLabel CoolingLVL5Label = new JLabel(CoolingIcon);    	
        CoolingLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL5Label.setText("<html>Cooling LVL 5<br>" + "Count: " + Part.CoolingLv5.PartCount);
        
        JLabel ElectronicsLVL5Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL5Label.setText("<html>Electronics LVL 5<br>" + "Count: " + Part.ElectronicsLv5.PartCount);
        
        JLabel EngineLVL5Label = new JLabel(EngineIcon);    	
        EngineLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL5Label.setText("<html>Engine LVL 5<br>" + "Count: " + Part.EngineLv5.PartCount);
        
        JLabel ExaustLVL5Label = new JLabel(ExaustIcon);    	
        ExaustLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL5Label.setText("<html>Exaust LVL 5<br>" + "Count: " + Part.ExaustLv5.PartCount);
        
        JLabel FuelLVL5Label = new JLabel(FuelIcon);    	
        FuelLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL5Label.setText("<html>Fuel LVL 5<br>" + "Count: " + Part.FuelLv5.PartCount);
        
        JLabel InteriorLVL5Label = new JLabel(InteriorIcon);    	
        InteriorLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL5Label.setText("<html>Interior LVL 5<br>" + "Count: " + Part.InteriorLv5.PartCount);
        
        JLabel SteeringLVL5Label = new JLabel(SteeringIcon);    	
        SteeringLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL5Label.setText("<html>Steering LVL 5<br>" + "Count: " + Part.SteeringLv5.PartCount);
        
        JLabel SuspensionLVL5Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL5Label.setText("<html>Suspension LVL 5<br>" + "Count: " + Part.SuspensionLv5.PartCount);
        
        JLabel TransmissionLVL5Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL5Label.setText("<html>Transmission LVL 5<br>" + "Count: " + Part.TransmissionLv5.PartCount);
        
        JLabel TiresLVL5Label = new JLabel(TiresIcon);    	
        TiresLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL5Label.setText("<html>Tires LVL 5<br>" + "Count: " + Part.TiresLv5.PartCount);
               
        SellPartsLVL5PanelSub.add(AccessoriesLVL5Label);
        SellPartsLVL5PanelSub.add(jbtnSellAccessoriesLv5);
        SellPartsLVL5PanelSub2.add(BodyLVL5Label);
        SellPartsLVL5PanelSub2.add(jbtnSellBodyLv5);
        SellPartsLVL5PanelSub3.add(BrakesLVL5Label);
        SellPartsLVL5PanelSub3.add(jbtnSellBrakesLv5);
        SellPartsLVL5PanelSub4.add(CoolingLVL5Label);
        SellPartsLVL5PanelSub4.add(jbtnSellCoolingLv5);
        SellPartsLVL5PanelSub5.add(ElectronicsLVL5Label);
        SellPartsLVL5PanelSub5.add(jbtnSellElectronicsLv5);
        SellPartsLVL5PanelSub6.add(EngineLVL5Label);
        SellPartsLVL5PanelSub6.add(jbtnSellEngineLv5);
        SellPartsLVL5PanelSub7.add(ExaustLVL5Label);
        SellPartsLVL5PanelSub7.add(jbtnSellExaustLv5);
        SellPartsLVL5PanelSub8.add(FuelLVL5Label);
        SellPartsLVL5PanelSub8.add(jbtnSellFuelLv5);
        SellPartsLVL5PanelSub9.add(InteriorLVL5Label);
        SellPartsLVL5PanelSub9.add(jbtnSellInteriorLv5);
        SellPartsLVL5PanelSub10.add(SteeringLVL5Label);
        SellPartsLVL5PanelSub10.add(jbtnSellSteeringLv5);
        SellPartsLVL5PanelSub11.add(SuspensionLVL5Label);
        SellPartsLVL5PanelSub11.add(jbtnSellSuspensionLv5);
        SellPartsLVL5PanelSub12.add(TransmissionLVL5Label);
        SellPartsLVL5PanelSub12.add(jbtnSellTransmissionLv5);
        SellPartsLVL5PanelSub13.add(TiresLVL5Label);
        SellPartsLVL5PanelSub13.add(jbtnSellTiresLv5);
        
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub2);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub3);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub4);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub5);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub6);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub7);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub8);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub9);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub10);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub11);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub12);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub13);
   	 	
   	 	JPanel SellPartsLVL6Panel = new JPanel();
   	 	
   	 	JPanel SellPartsLVL6PanelSub = new JPanel();
	 	SellPartsLVL6PanelSub.setLayout(new BoxLayout(SellPartsLVL6PanelSub, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub2 = new JPanel();
	 	SellPartsLVL6PanelSub2.setLayout(new BoxLayout(SellPartsLVL6PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub3 = new JPanel();
	 	SellPartsLVL6PanelSub3.setLayout(new BoxLayout(SellPartsLVL6PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub4 = new JPanel();
	 	SellPartsLVL6PanelSub4.setLayout(new BoxLayout(SellPartsLVL6PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub5 = new JPanel();
	 	SellPartsLVL6PanelSub5.setLayout(new BoxLayout(SellPartsLVL6PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub6 = new JPanel();
	 	SellPartsLVL6PanelSub6.setLayout(new BoxLayout(SellPartsLVL6PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub7 = new JPanel();
	 	SellPartsLVL6PanelSub7.setLayout(new BoxLayout(SellPartsLVL6PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub8 = new JPanel();
	 	SellPartsLVL6PanelSub8.setLayout(new BoxLayout(SellPartsLVL6PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub9 = new JPanel();
	 	SellPartsLVL6PanelSub9.setLayout(new BoxLayout(SellPartsLVL6PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub10 = new JPanel();
	 	SellPartsLVL6PanelSub10.setLayout(new BoxLayout(SellPartsLVL6PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub11 = new JPanel();
	 	SellPartsLVL6PanelSub11.setLayout(new BoxLayout(SellPartsLVL6PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub12 = new JPanel();
	 	SellPartsLVL6PanelSub12.setLayout(new BoxLayout(SellPartsLVL6PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL6PanelSub13 = new JPanel();
	 	SellPartsLVL6PanelSub13.setLayout(new BoxLayout(SellPartsLVL6PanelSub13, BoxLayout.PAGE_AXIS));
   	 	
	 	JLabel AccessoriesLVL6Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL6Label.setText("<html>Accessories LVL 6<br>" + "Count: " + Part.AccessoriesLv6.PartCount);
        
        JLabel BodyLVL6Label = new JLabel(BodyIcon);    	
        BodyLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL6Label.setText("<html>Body LVL 6<br>" + "Count: " + Part.BodyLv6.PartCount);
        
        JLabel BrakesLVL6Label = new JLabel(BrakesIcon);    	
        BrakesLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL6Label.setText("<html>Brakes LVL 6<br>" + "Count: " + Part.BrakesLv6.PartCount);
        
        JLabel CoolingLVL6Label = new JLabel(CoolingIcon);    	
        CoolingLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL6Label.setText("<html>Cooling LVL 6<br>" + "Count: " + Part.CoolingLv6.PartCount);
        
        JLabel ElectronicsLVL6Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL6Label.setText("<html>Electronics LVL 6<br>" + "Count: " + Part.ElectronicsLv6.PartCount);
        
        JLabel EngineLVL6Label = new JLabel(EngineIcon);    	
        EngineLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL6Label.setText("<html>Engine LVL 6<br>" + "Count: " + Part.EngineLv6.PartCount);
        
        JLabel ExaustLVL6Label = new JLabel(ExaustIcon);    	
        ExaustLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL6Label.setText("<html>Exaust LVL 6<br>" + "Count: " + Part.ExaustLv6.PartCount);
        
        JLabel FuelLVL6Label = new JLabel(FuelIcon);    	
        FuelLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL6Label.setText("<html>Fuel LVL 6<br>" + "Count: " + Part.FuelLv6.PartCount);
        
        JLabel InteriorLVL6Label = new JLabel(InteriorIcon);    	
        InteriorLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL6Label.setText("<html>Interior LVL 6<br>" + "Count: " + Part.InteriorLv6.PartCount);
        
        JLabel SteeringLVL6Label = new JLabel(SteeringIcon);    	
        SteeringLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL6Label.setText("<html>Steering LVL 6<br>" + "Count: " + Part.SteeringLv6.PartCount);
        
        JLabel SuspensionLVL6Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL6Label.setText("<html>Suspension LVL 6<br>" + "Count: " + Part.SuspensionLv6.PartCount);
        
        JLabel TransmissionLVL6Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL6Label.setText("<html>Transmission LVL 6<br>" + "Count: " + Part.TransmissionLv6.PartCount);
        
        JLabel TiresLVL6Label = new JLabel(TiresIcon);    	
        TiresLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL6Label.setText("<html>Tires LVL 6<br>" + "Count: " + Part.TiresLv6.PartCount);
               
        SellPartsLVL6PanelSub.add(AccessoriesLVL6Label);
        SellPartsLVL6PanelSub.add(jbtnSellAccessoriesLv6);
        SellPartsLVL6PanelSub2.add(BodyLVL6Label);
        SellPartsLVL6PanelSub2.add(jbtnSellBodyLv6);
        SellPartsLVL6PanelSub3.add(BrakesLVL6Label);
        SellPartsLVL6PanelSub3.add(jbtnSellBrakesLv6);
        SellPartsLVL6PanelSub4.add(CoolingLVL6Label);
        SellPartsLVL6PanelSub4.add(jbtnSellCoolingLv6);
        SellPartsLVL6PanelSub5.add(ElectronicsLVL6Label);
        SellPartsLVL6PanelSub5.add(jbtnSellElectronicsLv6);
        SellPartsLVL6PanelSub6.add(EngineLVL6Label);
        SellPartsLVL6PanelSub6.add(jbtnSellEngineLv6);
        SellPartsLVL6PanelSub7.add(ExaustLVL6Label);
        SellPartsLVL6PanelSub7.add(jbtnSellExaustLv6);
        SellPartsLVL6PanelSub8.add(FuelLVL6Label);
        SellPartsLVL6PanelSub8.add(jbtnSellFuelLv6);
        SellPartsLVL6PanelSub9.add(InteriorLVL6Label);
        SellPartsLVL6PanelSub9.add(jbtnSellInteriorLv6);
        SellPartsLVL6PanelSub10.add(SteeringLVL6Label);
        SellPartsLVL6PanelSub10.add(jbtnSellSteeringLv6);
        SellPartsLVL6PanelSub11.add(SuspensionLVL6Label);
        SellPartsLVL6PanelSub11.add(jbtnSellSuspensionLv6);
        SellPartsLVL6PanelSub12.add(TransmissionLVL6Label);
        SellPartsLVL6PanelSub12.add(jbtnSellTransmissionLv6);
        SellPartsLVL6PanelSub13.add(TiresLVL6Label);
        SellPartsLVL6PanelSub13.add(jbtnSellTiresLv6);
        
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub2);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub3);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub4);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub5);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub6);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub7);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub8);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub9);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub10);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub11);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub12);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub13);
   	 	
   	 	JPanel SellPartsLVL7Panel = new JPanel();
   	 	
   	 	JPanel SellPartsLVL7PanelSub = new JPanel();
	 	SellPartsLVL7PanelSub.setLayout(new BoxLayout(SellPartsLVL7PanelSub, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub2 = new JPanel();
	 	SellPartsLVL7PanelSub2.setLayout(new BoxLayout(SellPartsLVL7PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub3 = new JPanel();
	 	SellPartsLVL7PanelSub3.setLayout(new BoxLayout(SellPartsLVL7PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub4 = new JPanel();
	 	SellPartsLVL7PanelSub4.setLayout(new BoxLayout(SellPartsLVL7PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub5 = new JPanel();
	 	SellPartsLVL7PanelSub5.setLayout(new BoxLayout(SellPartsLVL7PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub6 = new JPanel();
	 	SellPartsLVL7PanelSub6.setLayout(new BoxLayout(SellPartsLVL7PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub7 = new JPanel();
	 	SellPartsLVL7PanelSub7.setLayout(new BoxLayout(SellPartsLVL7PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub8 = new JPanel();
	 	SellPartsLVL7PanelSub8.setLayout(new BoxLayout(SellPartsLVL7PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub9 = new JPanel();
	 	SellPartsLVL7PanelSub9.setLayout(new BoxLayout(SellPartsLVL7PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub10 = new JPanel();
	 	SellPartsLVL7PanelSub10.setLayout(new BoxLayout(SellPartsLVL7PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub11 = new JPanel();
	 	SellPartsLVL7PanelSub11.setLayout(new BoxLayout(SellPartsLVL7PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub12 = new JPanel();
	 	SellPartsLVL7PanelSub12.setLayout(new BoxLayout(SellPartsLVL7PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL7PanelSub13 = new JPanel();
	 	SellPartsLVL7PanelSub13.setLayout(new BoxLayout(SellPartsLVL7PanelSub13, BoxLayout.PAGE_AXIS));
   	 	
	 	JLabel AccessoriesLVL7Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL7Label.setText("<html>Accessories LVL 7<br>" + "Count: " + Part.AccessoriesLv7.PartCount);
        
        JLabel BodyLVL7Label = new JLabel(BodyIcon);    	
        BodyLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL7Label.setText("<html>Body LVL 7<br>" + "Count: " + Part.BodyLv7.PartCount);
        
        JLabel BrakesLVL7Label = new JLabel(BrakesIcon);    	
        BrakesLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL7Label.setText("<html>Brakes LVL 7<br>" + "Count: " + Part.BrakesLv7.PartCount);
        
        JLabel CoolingLVL7Label = new JLabel(CoolingIcon);    	
        CoolingLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL7Label.setText("<html>Cooling LVL 7<br>" + "Count: " + Part.CoolingLv7.PartCount);
        
        JLabel ElectronicsLVL7Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL7Label.setText("<html>Electronics LVL 7<br>" + "Count: " + Part.ElectronicsLv7.PartCount);
        
        JLabel EngineLVL7Label = new JLabel(EngineIcon);    	
        EngineLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL7Label.setText("<html>Engine LVL 7<br>" + "Count: " + Part.EngineLv7.PartCount);
        
        JLabel ExaustLVL7Label = new JLabel(ExaustIcon);    	
        ExaustLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL7Label.setText("<html>Exaust LVL 7<br>" + "Count: " + Part.ExaustLv7.PartCount);
        
        JLabel FuelLVL7Label = new JLabel(FuelIcon);    	
        FuelLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL7Label.setText("<html>Fuel LVL 7<br>" + "Count: " + Part.FuelLv7.PartCount);
        
        JLabel InteriorLVL7Label = new JLabel(InteriorIcon);    	
        InteriorLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL7Label.setText("<html>Interior LVL 7<br>" + "Count: " + Part.InteriorLv7.PartCount);
        
        JLabel SteeringLVL7Label = new JLabel(SteeringIcon);    	
        SteeringLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL7Label.setText("<html>Steering LVL 7<br>" + "Count: " + Part.SteeringLv7.PartCount);
        
        JLabel SuspensionLVL7Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL7Label.setText("<html>Suspension LVL 7<br>" + "Count: " + Part.SuspensionLv7.PartCount);
        
        JLabel TransmissionLVL7Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL7Label.setText("<html>Transmission LVL 7<br>" + "Count: " + Part.TransmissionLv7.PartCount);
        
        JLabel TiresLVL7Label = new JLabel(TiresIcon);    	
        TiresLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL7Label.setText("<html>Tires LVL 7<br>" + "Count: " + Part.TiresLv7.PartCount);
               
        SellPartsLVL7PanelSub.add(AccessoriesLVL7Label);
        SellPartsLVL7PanelSub.add(jbtnSellAccessoriesLv7);
        SellPartsLVL7PanelSub2.add(BodyLVL7Label);
        SellPartsLVL7PanelSub2.add(jbtnSellBodyLv7);
        SellPartsLVL7PanelSub3.add(BrakesLVL7Label);
        SellPartsLVL7PanelSub3.add(jbtnSellBrakesLv7);
        SellPartsLVL7PanelSub4.add(CoolingLVL7Label);
        SellPartsLVL7PanelSub4.add(jbtnSellCoolingLv7);
        SellPartsLVL7PanelSub5.add(ElectronicsLVL7Label);
        SellPartsLVL7PanelSub5.add(jbtnSellElectronicsLv7);
        SellPartsLVL7PanelSub6.add(EngineLVL7Label);
        SellPartsLVL7PanelSub6.add(jbtnSellEngineLv7);
        SellPartsLVL7PanelSub7.add(ExaustLVL7Label);
        SellPartsLVL7PanelSub7.add(jbtnSellExaustLv7);
        SellPartsLVL7PanelSub8.add(FuelLVL7Label);
        SellPartsLVL7PanelSub8.add(jbtnSellFuelLv7);
        SellPartsLVL7PanelSub9.add(InteriorLVL7Label);
        SellPartsLVL7PanelSub9.add(jbtnSellInteriorLv7);
        SellPartsLVL7PanelSub10.add(SteeringLVL7Label);
        SellPartsLVL7PanelSub10.add(jbtnSellSteeringLv7);
        SellPartsLVL7PanelSub11.add(SuspensionLVL7Label);
        SellPartsLVL7PanelSub11.add(jbtnSellSuspensionLv7);
        SellPartsLVL7PanelSub12.add(TransmissionLVL7Label);
        SellPartsLVL7PanelSub12.add(jbtnSellTransmissionLv7);
        SellPartsLVL7PanelSub13.add(TiresLVL7Label);
        SellPartsLVL7PanelSub13.add(jbtnSellTiresLv7);
        
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub2);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub3);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub4);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub5);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub6);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub7);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub8);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub9);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub10);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub11);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub12);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub13);
   	 	
   	 	JPanel SellPartsLVL8Panel = new JPanel();
   	 	
   	 	JPanel SellPartsLVL8PanelSub = new JPanel();
	 	SellPartsLVL8PanelSub.setLayout(new BoxLayout(SellPartsLVL8PanelSub, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub2 = new JPanel();
	 	SellPartsLVL8PanelSub2.setLayout(new BoxLayout(SellPartsLVL8PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub3 = new JPanel();
	 	SellPartsLVL8PanelSub3.setLayout(new BoxLayout(SellPartsLVL8PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub4 = new JPanel();
	 	SellPartsLVL8PanelSub4.setLayout(new BoxLayout(SellPartsLVL8PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub5 = new JPanel();
	 	SellPartsLVL8PanelSub5.setLayout(new BoxLayout(SellPartsLVL8PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub6 = new JPanel();
	 	SellPartsLVL8PanelSub6.setLayout(new BoxLayout(SellPartsLVL8PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub7 = new JPanel();
	 	SellPartsLVL8PanelSub7.setLayout(new BoxLayout(SellPartsLVL8PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub8 = new JPanel();
	 	SellPartsLVL8PanelSub8.setLayout(new BoxLayout(SellPartsLVL8PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub9 = new JPanel();
	 	SellPartsLVL8PanelSub9.setLayout(new BoxLayout(SellPartsLVL8PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub10 = new JPanel();
	 	SellPartsLVL8PanelSub10.setLayout(new BoxLayout(SellPartsLVL8PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub11 = new JPanel();
	 	SellPartsLVL8PanelSub11.setLayout(new BoxLayout(SellPartsLVL8PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub12 = new JPanel();
	 	SellPartsLVL8PanelSub12.setLayout(new BoxLayout(SellPartsLVL8PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL8PanelSub13 = new JPanel();
	 	SellPartsLVL8PanelSub13.setLayout(new BoxLayout(SellPartsLVL8PanelSub13, BoxLayout.PAGE_AXIS));
   	 	
	 	JLabel AccessoriesLVL8Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL8Label.setText("<html>Accessories LVL 8<br>" + "Count: " + Part.AccessoriesLv8.PartCount);
        
        JLabel BodyLVL8Label = new JLabel(BodyIcon);    	
        BodyLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL8Label.setText("<html>Body LVL 8<br>" + "Count: " + Part.BodyLv8.PartCount);
        
        JLabel BrakesLVL8Label = new JLabel(BrakesIcon);    	
        BrakesLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL8Label.setText("<html>Brakes LVL 8<br>" + "Count: " + Part.BrakesLv8.PartCount);
        
        JLabel CoolingLVL8Label = new JLabel(CoolingIcon);    	
        CoolingLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL8Label.setText("<html>Cooling LVL 8<br>" + "Count: " + Part.CoolingLv8.PartCount);
        
        JLabel ElectronicsLVL8Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL8Label.setText("<html>Electronics LVL 8<br>" + "Count: " + Part.ElectronicsLv8.PartCount);
        
        JLabel EngineLVL8Label = new JLabel(EngineIcon);    	
        EngineLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL8Label.setText("<html>Engine LVL 8<br>" + "Count: " + Part.EngineLv8.PartCount);
        
        JLabel ExaustLVL8Label = new JLabel(ExaustIcon);    	
        ExaustLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL8Label.setText("<html>Exaust LVL 8<br>" + "Count: " + Part.ExaustLv8.PartCount);
        
        JLabel FuelLVL8Label = new JLabel(FuelIcon);    	
        FuelLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL8Label.setText("<html>Fuel LVL 8<br>" + "Count: " + Part.FuelLv8.PartCount);
        
        JLabel InteriorLVL8Label = new JLabel(InteriorIcon);    	
        InteriorLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL8Label.setText("<html>Interior LVL 8<br>" + "Count: " + Part.InteriorLv8.PartCount);
        
        JLabel SteeringLVL8Label = new JLabel(SteeringIcon);    	
        SteeringLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL8Label.setText("<html>Steering LVL 8<br>" + "Count: " + Part.SteeringLv8.PartCount);
        
        JLabel SuspensionLVL8Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL8Label.setText("<html>Suspension LVL 8<br>" + "Count: " + Part.SuspensionLv8.PartCount);
        
        JLabel TransmissionLVL8Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL8Label.setText("<html>Transmission LVL 8<br>" + "Count: " + Part.TransmissionLv8.PartCount);
        
        JLabel TiresLVL8Label = new JLabel(TiresIcon);    	
        TiresLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL8Label.setText("<html>Tires LVL 8<br>" + "Count: " + Part.TiresLv8.PartCount);
    
        SellPartsLVL8PanelSub.add(AccessoriesLVL8Label);
        SellPartsLVL8PanelSub.add(jbtnSellAccessoriesLv8);
        SellPartsLVL8PanelSub2.add(BodyLVL8Label);
        SellPartsLVL8PanelSub2.add(jbtnSellBodyLv8);
        SellPartsLVL8PanelSub3.add(BrakesLVL8Label);
        SellPartsLVL8PanelSub3.add(jbtnSellBrakesLv8);
        SellPartsLVL8PanelSub4.add(CoolingLVL8Label);
        SellPartsLVL8PanelSub4.add(jbtnSellCoolingLv8);
        SellPartsLVL8PanelSub5.add(ElectronicsLVL8Label);
        SellPartsLVL8PanelSub5.add(jbtnSellElectronicsLv8);
        SellPartsLVL8PanelSub6.add(EngineLVL8Label);
        SellPartsLVL8PanelSub6.add(jbtnSellEngineLv8);
        SellPartsLVL8PanelSub7.add(ExaustLVL8Label);
        SellPartsLVL8PanelSub7.add(jbtnSellExaustLv8);
        SellPartsLVL8PanelSub8.add(FuelLVL8Label);
        SellPartsLVL8PanelSub8.add(jbtnSellFuelLv8);
        SellPartsLVL8PanelSub9.add(InteriorLVL8Label);
        SellPartsLVL8PanelSub9.add(jbtnSellInteriorLv8);
        SellPartsLVL8PanelSub10.add(SteeringLVL8Label);
        SellPartsLVL8PanelSub10.add(jbtnSellSteeringLv8);
        SellPartsLVL8PanelSub11.add(SuspensionLVL8Label);
        SellPartsLVL8PanelSub11.add(jbtnSellSuspensionLv8);
        SellPartsLVL8PanelSub12.add(TransmissionLVL8Label);
        SellPartsLVL8PanelSub12.add(jbtnSellTransmissionLv8);
        SellPartsLVL8PanelSub13.add(TiresLVL8Label);
        SellPartsLVL8PanelSub13.add(jbtnSellTiresLv8);
        
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub2);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub3);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub4);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub5);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub6);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub7);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub8);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub9);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub10);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub11);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub12);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub13);
   	 	
   	 	JPanel SellPartsLVL9Panel = new JPanel();
   	 	
   	 	JPanel SellPartsLVL9PanelSub = new JPanel();
	 	SellPartsLVL9PanelSub.setLayout(new BoxLayout(SellPartsLVL9PanelSub, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub2 = new JPanel();
	 	SellPartsLVL9PanelSub2.setLayout(new BoxLayout(SellPartsLVL9PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub3 = new JPanel();
	 	SellPartsLVL9PanelSub3.setLayout(new BoxLayout(SellPartsLVL9PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub4 = new JPanel();
	 	SellPartsLVL9PanelSub4.setLayout(new BoxLayout(SellPartsLVL9PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub5 = new JPanel();
	 	SellPartsLVL9PanelSub5.setLayout(new BoxLayout(SellPartsLVL9PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub6 = new JPanel();
	 	SellPartsLVL9PanelSub6.setLayout(new BoxLayout(SellPartsLVL9PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub7 = new JPanel();
	 	SellPartsLVL9PanelSub7.setLayout(new BoxLayout(SellPartsLVL9PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub8 = new JPanel();
	 	SellPartsLVL9PanelSub8.setLayout(new BoxLayout(SellPartsLVL9PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub9 = new JPanel();
	 	SellPartsLVL9PanelSub9.setLayout(new BoxLayout(SellPartsLVL9PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub10 = new JPanel();
	 	SellPartsLVL9PanelSub10.setLayout(new BoxLayout(SellPartsLVL9PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub11 = new JPanel();
	 	SellPartsLVL9PanelSub11.setLayout(new BoxLayout(SellPartsLVL9PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub12 = new JPanel();
	 	SellPartsLVL9PanelSub12.setLayout(new BoxLayout(SellPartsLVL9PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL9PanelSub13 = new JPanel();
	 	SellPartsLVL9PanelSub13.setLayout(new BoxLayout(SellPartsLVL9PanelSub13, BoxLayout.PAGE_AXIS));
   	 	
	 	JLabel AccessoriesLVL9Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL9Label.setText("<html>Accessories LVL 9<br>" + "Count: " + Part.AccessoriesLv9.PartCount);
        
        JLabel BodyLVL9Label = new JLabel(BodyIcon);    	
        BodyLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL9Label.setText("<html>Body LVL 9<br>" + "Count: " + Part.BodyLv9.PartCount);
        
        JLabel BrakesLVL9Label = new JLabel(BrakesIcon);    	
        BrakesLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL9Label.setText("<html>Brakes LVL 9<br>" + "Count: " + Part.BrakesLv9.PartCount);
        
        JLabel CoolingLVL9Label = new JLabel(CoolingIcon);    	
        CoolingLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL9Label.setText("<html>Cooling LVL 9<br>" + "Count: " + Part.CoolingLv9.PartCount);
        
        JLabel ElectronicsLVL9Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL9Label.setText("<html>Electronics LVL 9<br>" + "Count: " + Part.ElectronicsLv9.PartCount);
        
        JLabel EngineLVL9Label = new JLabel(EngineIcon);    	
        EngineLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL9Label.setText("<html>Engine LVL 9<br>" + "Count: " + Part.EngineLv9.PartCount);
        
        JLabel ExaustLVL9Label = new JLabel(ExaustIcon);    	
        ExaustLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL9Label.setText("<html>Exaust LVL 9<br>" + "Count: " + Part.ExaustLv9.PartCount);
        
        JLabel FuelLVL9Label = new JLabel(FuelIcon);    	
        FuelLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL9Label.setText("<html>Fuel LVL 9<br>" + "Count: " + Part.FuelLv9.PartCount);
        
        JLabel InteriorLVL9Label = new JLabel(InteriorIcon);    	
        InteriorLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL9Label.setText("<html>Interior LVL 9<br>" + "Count: " + Part.InteriorLv9.PartCount);
        
        JLabel SteeringLVL9Label = new JLabel(SteeringIcon);    	
        SteeringLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL9Label.setText("<html>Steering LVL 9<br>" + "Count: " + Part.SteeringLv9.PartCount);
        
        JLabel SuspensionLVL9Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL9Label.setText("<html>Suspension LVL 9<br>" + "Count: " + Part.SuspensionLv9.PartCount);
        
        JLabel TransmissionLVL9Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL9Label.setText("<html>Transmission LVL 9<br>" + "Count: " + Part.TransmissionLv9.PartCount);
        
        JLabel TiresLVL9Label = new JLabel(TiresIcon);    	
        TiresLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL9Label.setText("<html>Tires LVL 9<br>" + "Count: " + Part.TiresLv9.PartCount);
               
        SellPartsLVL9PanelSub.add(AccessoriesLVL9Label);
        SellPartsLVL9PanelSub.add(jbtnSellAccessoriesLv9);
        SellPartsLVL9PanelSub2.add(BodyLVL9Label);
        SellPartsLVL9PanelSub2.add(jbtnSellBodyLv9);
        SellPartsLVL9PanelSub3.add(BrakesLVL9Label);
        SellPartsLVL9PanelSub3.add(jbtnSellBrakesLv9);
        SellPartsLVL9PanelSub4.add(CoolingLVL9Label);
        SellPartsLVL9PanelSub4.add(jbtnSellCoolingLv9);
        SellPartsLVL9PanelSub5.add(ElectronicsLVL9Label);
        SellPartsLVL9PanelSub5.add(jbtnSellElectronicsLv9);
        SellPartsLVL9PanelSub6.add(EngineLVL9Label);
        SellPartsLVL9PanelSub6.add(jbtnSellEngineLv9);
        SellPartsLVL9PanelSub7.add(ExaustLVL9Label);
        SellPartsLVL9PanelSub7.add(jbtnSellExaustLv9);
        SellPartsLVL9PanelSub8.add(FuelLVL9Label);
        SellPartsLVL9PanelSub8.add(jbtnSellFuelLv9);
        SellPartsLVL9PanelSub9.add(InteriorLVL9Label);
        SellPartsLVL9PanelSub9.add(jbtnSellInteriorLv9);
        SellPartsLVL9PanelSub10.add(SteeringLVL9Label);
        SellPartsLVL9PanelSub10.add(jbtnSellSteeringLv9);
        SellPartsLVL9PanelSub11.add(SuspensionLVL9Label);
        SellPartsLVL9PanelSub11.add(jbtnSellSuspensionLv9);
        SellPartsLVL9PanelSub12.add(TransmissionLVL9Label);
        SellPartsLVL9PanelSub12.add(jbtnSellTransmissionLv9);
        SellPartsLVL9PanelSub13.add(TiresLVL9Label);
        SellPartsLVL9PanelSub13.add(jbtnSellTiresLv9);
        
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub2);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub3);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub4);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub5);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub6);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub7);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub8);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub9);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub10);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub11);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub12);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub13);
   	 	
   	 	JPanel SellPartsLVL10Panel = new JPanel();
   	 	
   		JPanel SellPartsLVL10PanelSub = new JPanel();
	 	SellPartsLVL10PanelSub.setLayout(new BoxLayout(SellPartsLVL10PanelSub, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub2 = new JPanel();
	 	SellPartsLVL10PanelSub2.setLayout(new BoxLayout(SellPartsLVL10PanelSub2, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub3 = new JPanel();
	 	SellPartsLVL10PanelSub3.setLayout(new BoxLayout(SellPartsLVL10PanelSub3, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub4 = new JPanel();
	 	SellPartsLVL10PanelSub4.setLayout(new BoxLayout(SellPartsLVL10PanelSub4, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub5 = new JPanel();
	 	SellPartsLVL10PanelSub5.setLayout(new BoxLayout(SellPartsLVL10PanelSub5, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub6 = new JPanel();
	 	SellPartsLVL10PanelSub6.setLayout(new BoxLayout(SellPartsLVL10PanelSub6, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub7 = new JPanel();
	 	SellPartsLVL10PanelSub7.setLayout(new BoxLayout(SellPartsLVL10PanelSub7, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub8 = new JPanel();
	 	SellPartsLVL10PanelSub8.setLayout(new BoxLayout(SellPartsLVL10PanelSub8, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub9 = new JPanel();
	 	SellPartsLVL10PanelSub9.setLayout(new BoxLayout(SellPartsLVL10PanelSub9, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub10 = new JPanel();
	 	SellPartsLVL10PanelSub10.setLayout(new BoxLayout(SellPartsLVL10PanelSub10, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub11 = new JPanel();
	 	SellPartsLVL10PanelSub11.setLayout(new BoxLayout(SellPartsLVL10PanelSub11, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub12 = new JPanel();
	 	SellPartsLVL10PanelSub12.setLayout(new BoxLayout(SellPartsLVL10PanelSub12, BoxLayout.PAGE_AXIS));
	 	
	 	JPanel SellPartsLVL10PanelSub13 = new JPanel();
	 	SellPartsLVL10PanelSub13.setLayout(new BoxLayout(SellPartsLVL10PanelSub13, BoxLayout.PAGE_AXIS));
        
	 	JLabel AccessoriesLVL10Label = new JLabel(AccessoriesIcon);    	
        AccessoriesLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL10Label.setText("<html>Accessories LVL 10<br>" + "Count: " + Part.AccessoriesLv10.PartCount);
        
        JLabel BodyLVL10Label = new JLabel(BodyIcon);    	
        BodyLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL10Label.setText("<html>Body LVL 10<br>" + "Count: " + Part.BodyLv10.PartCount);
        
        JLabel BrakesLVL10Label = new JLabel(BrakesIcon);    	
        BrakesLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL10Label.setText("<html>Brakes LVL 10<br>" + "Count: " + Part.BrakesLv10.PartCount);
        
        JLabel CoolingLVL10Label = new JLabel(CoolingIcon);    	
        CoolingLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL10Label.setText("<html>Cooling LVL 10<br>" + "Count: " + Part.CoolingLv10.PartCount);
        
        JLabel ElectronicsLVL10Label = new JLabel(ElectronicsIcon);    	
        ElectronicsLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL10Label.setText("<html>Electronics LVL 10<br>" + "Count: " + Part.ElectronicsLv10.PartCount);
        
        JLabel EngineLVL10Label = new JLabel(EngineIcon);    	
        EngineLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL10Label.setText("<html>Engine LVL 10<br>" + "Count: " + Part.EngineLv10.PartCount);
        
        JLabel ExaustLVL10Label = new JLabel(ExaustIcon);    	
        ExaustLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL10Label.setText("<html>Exaust LVL 10<br>" + "Count: " + Part.ExaustLv10.PartCount);
        
        JLabel FuelLVL10Label = new JLabel(FuelIcon);    	
        FuelLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL10Label.setText("<html>Fuel LVL 10<br>" + "Count: " + Part.FuelLv10.PartCount);
        
        JLabel InteriorLVL10Label = new JLabel(InteriorIcon);    	
        InteriorLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL10Label.setText("<html>Interior LVL 10<br>" + "Count: " + Part.InteriorLv10.PartCount);
        
        JLabel SteeringLVL10Label = new JLabel(SteeringIcon);    	
        SteeringLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL10Label.setText("<html>Steering LVL 10<br>" + "Count: " + Part.SteeringLv10.PartCount);
        
        JLabel SuspensionLVL10Label = new JLabel(SuspensionIcon);    	
        SuspensionLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL10Label.setText("<html>Suspension LVL 10<br>" + "Count: " + Part.SuspensionLv10.PartCount);
        
        JLabel TransmissionLVL10Label = new JLabel(TransmissionIcon);    	
        TransmissionLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL10Label.setText("<html>Transmission LVL 10<br>" + "Count: " + Part.TransmissionLv10.PartCount);
        
        JLabel TiresLVL10Label = new JLabel(TiresIcon);    	
        TiresLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL10Label.setText("<html>Tires LVL 10<br>" + "Count: " + Part.TiresLv10.PartCount);
               
        SellPartsLVL10PanelSub.add(AccessoriesLVL10Label);
        SellPartsLVL10PanelSub.add(jbtnSellAccessoriesLv10);
        SellPartsLVL10PanelSub2.add(BodyLVL10Label);
        SellPartsLVL10PanelSub2.add(jbtnSellBodyLv10);
        SellPartsLVL10PanelSub3.add(BrakesLVL10Label);
        SellPartsLVL10PanelSub3.add(jbtnSellBrakesLv10);
        SellPartsLVL10PanelSub4.add(CoolingLVL10Label);
        SellPartsLVL10PanelSub4.add(jbtnSellCoolingLv10);
        SellPartsLVL10PanelSub5.add(ElectronicsLVL10Label);
        SellPartsLVL10PanelSub5.add(jbtnSellElectronicsLv10);
        SellPartsLVL10PanelSub6.add(EngineLVL10Label);
        SellPartsLVL10PanelSub6.add(jbtnSellEngineLv10);
        SellPartsLVL10PanelSub7.add(ExaustLVL10Label);
        SellPartsLVL10PanelSub7.add(jbtnSellExaustLv10);
        SellPartsLVL10PanelSub8.add(FuelLVL10Label);
        SellPartsLVL10PanelSub8.add(jbtnSellFuelLv10);
        SellPartsLVL10PanelSub9.add(InteriorLVL10Label);
        SellPartsLVL10PanelSub9.add(jbtnSellInteriorLv10);
        SellPartsLVL10PanelSub10.add(SteeringLVL10Label);
        SellPartsLVL10PanelSub10.add(jbtnSellSteeringLv10);
        SellPartsLVL10PanelSub11.add(SuspensionLVL10Label);
        SellPartsLVL10PanelSub11.add(jbtnSellSuspensionLv10);
        SellPartsLVL10PanelSub12.add(TransmissionLVL10Label);
        SellPartsLVL10PanelSub12.add(jbtnSellTransmissionLv10);
        SellPartsLVL10PanelSub13.add(TiresLVL10Label);
        SellPartsLVL10PanelSub13.add(jbtnSellTiresLv10);
        
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub2);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub3);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub4);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub5);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub6);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub7);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub8);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub9);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub10);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub11);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub12);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub13);
   	 	
        tabbedPane.addTab(Click, MainPanel);
        tabbedPane.addTab(Upgrades, UpgradesPanel);
        tabbedPane.addTab(BuyBoxes, BuyBoxesPanel);
        tabbedPane.addTab(OpenBoxes, OpenBoxesPanel);
        tabbedPane.addTab(BuildCars, BuildCarsPanel);
        tabbedPane.addTab(BuyFrames, BuyFramesPanel);

        pane.add(tabbedPane, BorderLayout.CENTER);

      
      
      JTabbedPane tabbedPane2 = new JTabbedPane();
      tabbedPane2.setTabPlacement(JTabbedPane.RIGHT);
      tabbedPane2.addTab(LVL1, SellPartsLVL1Panel);
      tabbedPane2.addTab(LVL2, SellPartsLVL2Panel);
      tabbedPane2.addTab(LVL3, SellPartsLVL3Panel);
      tabbedPane2.addTab(LVL4, SellPartsLVL4Panel);
      tabbedPane2.addTab(LVL5, SellPartsLVL5Panel);
      tabbedPane2.addTab(LVL6, SellPartsLVL6Panel);
      tabbedPane2.addTab(LVL7, SellPartsLVL7Panel);
      tabbedPane2.addTab(LVL8, SellPartsLVL8Panel);
      tabbedPane2.addTab(LVL9, SellPartsLVL9Panel);
      tabbedPane2.addTab(LVL10, SellPartsLVL10Panel);
   	
   	tabbedPane.add(SellParts ,tabbedPane2);
      
        CarMain = new CarMain();
        Box = new BoxesObj();
        Part = new PartObj(); 
        Garage = new Garages();
        CarFrame = new FramesObj();
        CarsLv2 = new CarsObjLv2();
        CarsLv3 = new CarsObjLv3();
        CarsLv4 = new CarsObjLv4();
        CarsLv5 = new CarsObjLv5();
        CarsLv6 = new CarsObjLv6();
        CarsLv7 = new CarsObjLv7();
        CarsLv8 = new CarsObjLv8();
        CarsLv9 = new CarsObjLv9();
        CarsLv10 = new CarsObjLv10();
        
        CarMain.PlayerLevel = 1;
        CarMain.BoxLevel = 1;
        Garage.GarageLevel = 1;
        Garage.GarageSlots = 20;
    }
    
    
    
    public  int Aboxes(){
    	return Box.BoxLv1.BoxCount + Box.BoxLv2.BoxCount + Box.BoxLv3.BoxCount +
    			Box.BoxLv4.BoxCount + Box.BoxLv5.BoxCount + Box.BoxLv6.BoxCount +
    			Box.BoxLv7.BoxCount + Box.BoxLv8.BoxCount + Box.BoxLv9.BoxCount +
    			Box.BoxLv10.BoxCount;
    }
    
    //Skaita Pirma limena masinu skaitu
    public int CountLv1Cars(){
    	//Initilize countccars intiger lai velak varetu izmantot lai varetu skaitit masinas
    	 int countcars = 0;
    	 //for loop kas sakas no 3 un katru nakamo gajienu skaitas pa +4 jo CountCars variable in cars array atrodas 
    	 //3 vieniba pirmajai masinai un katrai nakosajai
    	 //pa 4 vienibam talak
    	for(int i = 3;i > CarsLv1.cars.length;i+=4){
    		//Panem to array string variable un parvers to pa int
    		countcars+= Integer.parseInt(CarsLv1.cars[i]);
    	} 
    	//Returno varibale uz spaceship
    	return countcars;
    	
    	
    }
    
    public int CountLv2Cars(){
    	return CarsLv2.Buick_Riviera.CarCount + CarsLv2.Tesla_Roadster.CarCount + CarsLv2.Audi_80.CarCount + CarsLv2.BMW_e36.CarCount +
    			CarsLv2.Volkswagen_Scirocco.CarCount + CarsLv2.Mazda_3.CarCount + CarsLv2.Chevrolet_Viking.CarCount + CarsLv2.Tesla_s.CarCount +
    			CarsLv2.Jeep_ZJ.CarCount + CarsLv2.Dodge_Neon.CarCount + CarsLv2.BMW_e30.CarCount + CarsLv2.Mercedes_Benz_W123.CarCount +
    			CarsLv2.Land_Rover_Defender.CarCount + CarsLv2.Saab_9_5.CarCount + CarsLv2.Aston_Martin_One.CarCount + CarsLv2.Koenigsegg_Regera.CarCount +
    			CarsLv2.Lexus_IS.CarCount + CarsLv2.GMC_Yukon.CarCount + CarsLv2.Opel_Astra.CarCount + CarsLv2.Audi_Coupe.CarCount;
    }
    
    public int CountLv3Cars(){
    	return CarsLv3.Mini_Moke.CarCount + CarsLv3.Kia_Rondo.CarCount + CarsLv3.GMC_Suburban.CarCount + CarsLv3.Honda_Prelude.CarCount +
    			CarsLv3.Citroen_Saxo.CarCount + CarsLv3.Volkswagen_Tiguan.CarCount + CarsLv3.Volkswagen_Phaeton.CarCount + CarsLv3.Buick_Centry.CarCount +
    			CarsLv3.Land_Rover_Discovery.CarCount + CarsLv3.Infiniti_Etherea.CarCount + CarsLv3.Peugeot_308.CarCount + CarsLv3.Toyota_Auris.CarCount +
    			CarsLv3.Pagani_ZondaF.CarCount + CarsLv3.Lancia_Phedra.CarCount + CarsLv3.Chevrolet_Impala.CarCount + CarsLv3.Porsche_Boxster.CarCount +
    			CarsLv3.Aston_Martin_DB6.CarCount + CarsLv3.Vaz_2103.CarCount + CarsLv3.Hyundai_Mistra.CarCount + CarsLv3.Mini_Countryman.CarCount;
    }
    
    public int CountLv4Cars(){
    	return CarsLv4.Mazda_MX6.CarCount + CarsLv4.Chrysler_Daytona.CarCount + CarsLv4.Buick_Roadmaster.CarCount + CarsLv4.Volvo_S80.CarCount +
    			CarsLv4.Porsche_Cayman.CarCount + CarsLv4.Volkswagen_Beetle.CarCount + CarsLv4.Bugatti_EB110.CarCount + CarsLv4.Opel_Zafira.CarCount +
    			CarsLv4.Saab_9000.CarCount + CarsLv4.McLaren_F1.CarCount + CarsLv4.Audi_R8.CarCount + CarsLv4.Alfa_Romeo_8C.CarCount +
    			CarsLv4.Ford_Fiesta.CarCount + CarsLv4.Infiniti_Q50.CarCount + CarsLv4.Maserati_5000GT.CarCount + CarsLv4.Mercedes_Benz_CLA250.CarCount +
    			CarsLv4.Lamborghini_Gallardo.CarCount + CarsLv4.Mazda_RX7.CarCount + CarsLv4.Mitsubishi_Colt.CarCount + CarsLv4.Kia_Sorento.CarCount;
    }
    
    public int CountLv5Cars(){
    	return CarsLv5.Rolls_Royce_Wraith.CarCount + CarsLv5.Lamborghini_Diablo.CarCount + CarsLv5.Jeep_Scrambler.CarCount + CarsLv5.Bentley_Continental.CarCount +
    			CarsLv5.Bentley_Azure.CarCount + CarsLv5.Koenigsegg_One.CarCount + CarsLv5.Cadilliac_XTS.CarCount + CarsLv5.Fiat_500.CarCount +
    			CarsLv5.Mitsubishi_Pajero.CarCount + CarsLv5.Moskvich_2140.CarCount + CarsLv5.Opel_GT.CarCount + CarsLv5.Hyundai_Getz.CarCount +
    			CarsLv5.Maserati_Coupe.CarCount + CarsLv5.Honda_S2000.CarCount + CarsLv5.Alfa_Romeo_Spider.CarCount + CarsLv5.BMW_M5.CarCount +
    			CarsLv5.BMW_I8.CarCount + CarsLv5.Citroen_C5.CarCount + CarsLv5.Fiat_Punto.CarCount + CarsLv5.Audi_100.CarCount;
    }
    
    public int CountLv6Cars(){
    	return CarsLv6.Rolls_Royce_Phantom.CarCount + CarsLv6.Toyota_86.CarCount + CarsLv6.BMW_e70.CarCount + CarsLv6.Chrysler_Voyager.CarCount +
    			CarsLv6.Rolls_Royce_PhantomIII.CarCount + CarsLv6.Honda_CRX.CarCount + CarsLv6.Subaru_1000.CarCount + CarsLv6.Cadilliac_Eldorado.CarCount +
    			CarsLv6.Land_Rover_Freelander.CarCount + CarsLv6.Renault_Spider.CarCount + CarsLv6.Gaz_21.CarCount + CarsLv6.Acura_EL.CarCount +
    			CarsLv6.Bugatti_Veyron.CarCount + CarsLv6.Mercedes_Benz_SL600.CarCount + CarsLv6.Rolls_Royce_Silver.CarCount + CarsLv6.Mini_Paceman.CarCount +
    			CarsLv6.Hyundai_Excel.CarCount + CarsLv6.Gaz_24.CarCount + CarsLv6.Peugeot_107.CarCount + CarsLv6.Audi_A4.CarCount;
    }
    
    public int CountLv7Cars(){
    	return CarsLv7.Lamborghini_Aventador.CarCount + CarsLv7.Nissan_350z.CarCount + CarsLv7.Jaguar_XJ6.CarCount + CarsLv7.Renault_Clio.CarCount +
    			CarsLv7.Toyota_Avensis.CarCount + CarsLv7.Subaru_Outback.CarCount + CarsLv7.Saab_900.CarCount + CarsLv7.Opel_Vectra.CarCount +
    			CarsLv7.Chrysler_Charger.CarCount + CarsLv7.Ferrari_348.CarCount + CarsLv7.Hyundai_XG.CarCount + CarsLv7.Lexus_RX.CarCount +
    			CarsLv7.Dodge_400.CarCount + CarsLv7.GMC_Terrain.CarCount + CarsLv7.Volvo_C70.CarCount + CarsLv7.Ford_Sierra.CarCount +
    			CarsLv7.Subaru_Impreza.CarCount + CarsLv7.BMW_e90.CarCount + CarsLv7.Nissan_Skyline.CarCount + CarsLv7.Audi_Q7.CarCount;
    }
    
    public int CountLv8Cars(){
    	return CarsLv8.Bentley_Arnage.CarCount + CarsLv8.Volvo_850.CarCount + CarsLv8.Toyota_Rav4.CarCount + CarsLv8.Ford_Focus.CarCount +
    			CarsLv8.Chevrolet_Spin.CarCount + CarsLv8.Bentley_GTZ.CarCount + CarsLv8.Lexus_LS.CarCount + CarsLv8.Land_Rover_RangeRover.CarCount +
    			CarsLv8.Lexus_GX.CarCount + CarsLv8.Jeep_Wrangler.CarCount + CarsLv8.Maserati_GranTurismo.CarCount + CarsLv8.Koenigsegg_Agera.CarCount +
    			CarsLv8.Acura_MDX.CarCount + CarsLv8.Audi_RS6.CarCount + CarsLv8.Cadilliac_DeVille.CarCount + CarsLv8.McLaren_Veneno.CarCount +
    			CarsLv8.Tesla_X.CarCount + CarsLv8.Mercedes_Benz_G55.CarCount + CarsLv8.Lancia_Lybra.CarCount + CarsLv8.Infiniti_QX60.CarCount;
    }
    
    public int CountLv9Cars(){
    	return CarsLv9.Kia_Forte.CarCount + CarsLv9.Lancia_Voyager.CarCount + CarsLv9.Porsche_Cayenne.CarCount + CarsLv9.McLaren_650s.CarCount +
    			CarsLv9.Jaguar_E_Type.CarCount + CarsLv9.Peugeot_601.CarCount + CarsLv9.Jaguar_F_Type.CarCount + CarsLv9.Fiat_Doblo.CarCount +
    			CarsLv9.Vaz_2101.CarCount + CarsLv9.McLaren_P1.CarCount + CarsLv9.Peugeot_405.CarCount + CarsLv9.GMC_Envoy.CarCount +
    			CarsLv9.Chevrolet_Corvete.CarCount + CarsLv9.Pagani_Huayra.CarCount + CarsLv9.Moskvich_402.CarCount + CarsLv9.Alfa_Romeo_159.CarCount +
    			CarsLv9.Renault_Fregate.CarCount + CarsLv9.Mini_Cooper.CarCount + CarsLv9.Dodge_Viper.CarCount + CarsLv9.Vaz_Niva.CarCount;
    }
    
    public int CountLv10Cars(){
    	return CarsLv10.Jaguar_X_Type.CarCount + CarsLv10.Ferrari_308.CarCount + CarsLv10.Mazda_626.CarCount + CarsLv10.Maserati_Shamal.CarCount + 
    			CarsLv10.Nissan_240sx.CarCount + CarsLv10.Alfa_Romeo_4C.CarCount + CarsLv10.Nissan_Juke.CarCount + CarsLv10.Volkswagen_Golf1.CarCount +
    			CarsLv10.Jeep_Gladiator.CarCount + CarsLv10.Dodge_Matador.CarCount + CarsLv10.Bugatti_Royale.CarCount + CarsLv10.Citroen_CX.CarCount +
    			CarsLv10.Lamborghini_350GT.CarCount + CarsLv10.Mitsubishi_GTO.CarCount + CarsLv10.Buick_Invicta.CarCount + CarsLv10.Porsche_911.CarCount +
    			CarsLv10.Subaru_Forester.CarCount + CarsLv10.Citroen_BX.CarCount + CarsLv10.Bugatti_Type252.CarCount + CarsLv10.Ferrari_488.CarCount;
    }
    
    public int AllClicks(){
    	return CarMain.MoneyClicks + CarMain.BoxesClicks;
    }   
 	


//    protected static void checks(){
//			if(CarMain.PlayerLevel >=1){
//		    	jbtnPartsLv1.setEnabled(true);
//		    	jbtnBuyBoxLv1.setEnabled(true);
//		    	jbtnBuyFrameLv1.setEnabled(true);
//		    	jbtnBuildCarLv1.setEnabled(true);
//		    	jbtnSellAccessoriesLv1.setEnabled(true);
//		        jbtnSellBodyLv1.setEnabled(true);
//		        jbtnSellBrakesLv1.setEnabled(true);
//		        jbtnSellCoolingLv1.setEnabled(true);
//		        jbtnSellElectronicsLv1.setEnabled(true);
//		        jbtnSellEngineLv1.setEnabled(true);
//		        jbtnSellExaustLv1.setEnabled(true);
//		        jbtnSellFuelLv1.setEnabled(true);
//		        jbtnSellInteriorLv1.setEnabled(true);
//		        jbtnSellSteeringLv1.setEnabled(true);
//		        jbtnSellSuspensionLv1.setEnabled(true);
//		        jbtnSellTransmissionLv1.setEnabled(true);
//		        jbtnSellTiresLv1.setEnabled(true);
//		    }
//			
//			if(CarMain.PlayerLevel >=2){
//				jbtnPartsLv2.setEnabled(true);
//		    	jbtnBuyBoxLv2.setEnabled(true);
//		    	jbtnBuyFrameLv2.setEnabled(true);
//		    	jbtnBuildCarLv2.setEnabled(true);
//		    	jbtnSellAccessoriesLv2.setEnabled(true);
//		        jbtnSellBodyLv2.setEnabled(true);
//		        jbtnSellBrakesLv2.setEnabled(true);
//		        jbtnSellCoolingLv2.setEnabled(true);
//		        jbtnSellElectronicsLv2.setEnabled(true);
//		        jbtnSellEngineLv2.setEnabled(true);
//		        jbtnSellExaustLv2.setEnabled(true);
//		        jbtnSellFuelLv2.setEnabled(true);
//		        jbtnSellInteriorLv2.setEnabled(true);
//		        jbtnSellSteeringLv2.setEnabled(true);
//		        jbtnSellSuspensionLv2.setEnabled(true);
//		        jbtnSellTransmissionLv2.setEnabled(true);
//		        jbtnSellTiresLv2.setEnabled(true);
//			}		
//			if(CarMain.PlayerLevel >=3){
//				jbtnPartsLv3.setEnabled(true);
//		    	jbtnBuyBoxLv3.setEnabled(true);
//		    	jbtnBuyFrameLv3.setEnabled(true);
//		    	jbtnBuildCarLv3.setEnabled(true);
//		    	jbtnSellAccessoriesLv3.setEnabled(true);
//		        jbtnSellBodyLv3.setEnabled(true);
//		        jbtnSellBrakesLv3.setEnabled(true);
//		        jbtnSellCoolingLv3.setEnabled(true);
//		        jbtnSellElectronicsLv3.setEnabled(true);
//		        jbtnSellEngineLv3.setEnabled(true);
//		        jbtnSellExaustLv3.setEnabled(true);
//		        jbtnSellFuelLv3.setEnabled(true);
//		        jbtnSellInteriorLv3.setEnabled(true);
//		        jbtnSellSteeringLv3.setEnabled(true);
//		        jbtnSellSuspensionLv3.setEnabled(true);
//		        jbtnSellTransmissionLv3.setEnabled(true);
//		        jbtnSellTiresLv3.setEnabled(true);
//			}		
//			if(CarMain.PlayerLevel >=4){
//				jbtnPartsLv4.setEnabled(true);
//		    	jbtnBuyBoxLv4.setEnabled(true);
//		    	jbtnBuyFrameLv4.setEnabled(true);
//		    	jbtnBuildCarLv4.setEnabled(true);
//		    	jbtnSellAccessoriesLv4.setEnabled(true);
//		        jbtnSellBodyLv4.setEnabled(true);
//		        jbtnSellBrakesLv4.setEnabled(true);
//		        jbtnSellCoolingLv4.setEnabled(true);
//		        jbtnSellElectronicsLv4.setEnabled(true);
//		        jbtnSellEngineLv4.setEnabled(true);
//		        jbtnSellExaustLv4.setEnabled(true);
//		        jbtnSellFuelLv4.setEnabled(true);
//		        jbtnSellInteriorLv4.setEnabled(true);
//		        jbtnSellSteeringLv4.setEnabled(true);
//		        jbtnSellSuspensionLv4.setEnabled(true);
//		        jbtnSellTransmissionLv4.setEnabled(true);
//		        jbtnSellTiresLv4.setEnabled(true);
//			}		
//			if(CarMain.PlayerLevel >=5){
//				jbtnPartsLv5.setEnabled(true);
//		    	jbtnBuyBoxLv5.setEnabled(true);
//		    	jbtnBuyFrameLv5.setEnabled(true);
//		    	jbtnBuildCarLv5.setEnabled(true);
//		    	jbtnSellAccessoriesLv5.setEnabled(true);
//		        jbtnSellBodyLv5.setEnabled(true);
//		        jbtnSellBrakesLv5.setEnabled(true);
//		        jbtnSellCoolingLv5.setEnabled(true);
//		        jbtnSellElectronicsLv5.setEnabled(true);
//		        jbtnSellEngineLv5.setEnabled(true);
//		        jbtnSellExaustLv5.setEnabled(true);
//		        jbtnSellFuelLv5.setEnabled(true);
//		        jbtnSellInteriorLv5.setEnabled(true);
//		        jbtnSellSteeringLv5.setEnabled(true);
//		        jbtnSellSuspensionLv5.setEnabled(true);
//		        jbtnSellTransmissionLv5.setEnabled(true);
//		        jbtnSellTiresLv5.setEnabled(true);
//			}		
//			if(CarMain.PlayerLevel >=6){
//				jbtnPartsLv6.setEnabled(true);
//		    	jbtnBuyBoxLv6.setEnabled(true);
//		    	jbtnBuyFrameLv6.setEnabled(true);
//		    	jbtnBuildCarLv6.setEnabled(true);
//		    	jbtnSellAccessoriesLv6.setEnabled(true);
//		        jbtnSellBodyLv6.setEnabled(true);
//		        jbtnSellBrakesLv6.setEnabled(true);
//		        jbtnSellCoolingLv6.setEnabled(true);
//		        jbtnSellElectronicsLv6.setEnabled(true);
//		        jbtnSellEngineLv6.setEnabled(true);
//		        jbtnSellExaustLv6.setEnabled(true);
//		        jbtnSellFuelLv6.setEnabled(true);
//		        jbtnSellInteriorLv6.setEnabled(true);
//		        jbtnSellSteeringLv6.setEnabled(true);
//		        jbtnSellSuspensionLv6.setEnabled(true);
//		        jbtnSellTransmissionLv6.setEnabled(true);
//		        jbtnSellTiresLv6.setEnabled(true);
//			}		
//			if(CarMain.PlayerLevel >=7){
//				jbtnPartsLv7.setEnabled(true);
//		    	jbtnBuyBoxLv7.setEnabled(true);
//		    	jbtnBuyFrameLv7.setEnabled(true);
//		    	jbtnBuildCarLv7.setEnabled(true);
//		    	jbtnSellAccessoriesLv7.setEnabled(true);
//		        jbtnSellBodyLv7.setEnabled(true);
//		        jbtnSellBrakesLv7.setEnabled(true);
//		        jbtnSellCoolingLv7.setEnabled(true);
//		        jbtnSellElectronicsLv7.setEnabled(true);
//		        jbtnSellEngineLv7.setEnabled(true);
//		        jbtnSellExaustLv7.setEnabled(true);
//		        jbtnSellFuelLv7.setEnabled(true);
//		        jbtnSellInteriorLv7.setEnabled(true);
//		        jbtnSellSteeringLv7.setEnabled(true);
//		        jbtnSellSuspensionLv7.setEnabled(true);
//		        jbtnSellTransmissionLv7.setEnabled(true);
//		        jbtnSellTiresLv7.setEnabled(true);
//			}		
//			if(CarMain.PlayerLevel >=8){
//				jbtnPartsLv8.setEnabled(true);
//		    	jbtnBuyBoxLv8.setEnabled(true);
//		    	jbtnBuyFrameLv8.setEnabled(true);
//		    	jbtnBuildCarLv8.setEnabled(true);
//		    	jbtnSellAccessoriesLv8.setEnabled(true);
//		        jbtnSellBodyLv8.setEnabled(true);
//		        jbtnSellBrakesLv8.setEnabled(true);
//		        jbtnSellCoolingLv8.setEnabled(true);
//		        jbtnSellElectronicsLv8.setEnabled(true);
//		        jbtnSellEngineLv8.setEnabled(true);
//		        jbtnSellExaustLv8.setEnabled(true);
//		        jbtnSellFuelLv8.setEnabled(true);
//		        jbtnSellInteriorLv8.setEnabled(true);
//		        jbtnSellSteeringLv8.setEnabled(true);
//		        jbtnSellSuspensionLv8.setEnabled(true);
//		        jbtnSellTransmissionLv8.setEnabled(true);
//		        jbtnSellTiresLv8.setEnabled(true);
//			}		
//			if(CarMain.PlayerLevel >=9){
//				jbtnPartsLv9.setEnabled(true);
//		    	jbtnBuyBoxLv9.setEnabled(true);
//		    	jbtnBuyFrameLv9.setEnabled(true);
//		    	jbtnBuildCarLv9.setEnabled(true);
//		    	jbtnSellAccessoriesLv9.setEnabled(true);
//		        jbtnSellBodyLv9.setEnabled(true);
//		        jbtnSellBrakesLv9.setEnabled(true);
//		        jbtnSellCoolingLv9.setEnabled(true);
//		        jbtnSellElectronicsLv9.setEnabled(true);
//		        jbtnSellEngineLv9.setEnabled(true);
//		        jbtnSellExaustLv9.setEnabled(true);
//		        jbtnSellFuelLv9.setEnabled(true);
//		        jbtnSellInteriorLv9.setEnabled(true);
//		        jbtnSellSteeringLv9.setEnabled(true);
//		        jbtnSellSuspensionLv9.setEnabled(true);
//		        jbtnSellTransmissionLv9.setEnabled(true);
//		        jbtnSellTiresLv9.setEnabled(true);
//			}		
//			if(CarMain.PlayerLevel >=10){
//				jbtnPartsLv10.setEnabled(true);
//		    	jbtnBuyBoxLv10.setEnabled(true);
//		    	jbtnBuyFrameLv10.setEnabled(true);
//		    	jbtnBuildCarLv10.setEnabled(true);
//		    	jbtnSellAccessoriesLv10.setEnabled(true);
//		        jbtnSellBodyLv10.setEnabled(true);
//		        jbtnSellBrakesLv10.setEnabled(true);
//		        jbtnSellCoolingLv10.setEnabled(true);
//		        jbtnSellElectronicsLv10.setEnabled(true);
//		        jbtnSellEngineLv10.setEnabled(true);
//		        jbtnSellExaustLv10.setEnabled(true);
//		        jbtnSellFuelLv10.setEnabled(true);
//		        jbtnSellInteriorLv10.setEnabled(true);
//		        jbtnSellSteeringLv10.setEnabled(true);
//		        jbtnSellSuspensionLv10.setEnabled(true);
//		        jbtnSellTransmissionLv10.setEnabled(true);
//		        jbtnSellTiresLv10.setEnabled(true);
//			}
			//}
		
	//}


    final ImageIcon MoneyIcon = new ImageIcon("Images/Money.png");   
    final ImageIcon GarageIcon = new ImageIcon("Images/Garage.png");	
    final ImageIcon LockedIcon = new ImageIcon("Images/Locked.png");	
    final ImageIcon PlayerIcon = new ImageIcon("Images/Player.png");
    final ImageIcon CarFrameIcon = new ImageIcon("Images/Frame.png");
	
    final ImageIcon NoMoneyIcon = new ImageIcon("Images/NoMoney.png");
    final ImageIcon NoPartsIcon = new ImageIcon("Images/NoParts.png");
    final ImageIcon NoPlayerIcon = new ImageIcon("Images/NoPlayer.png");
    final ImageIcon NoGarageIcon = new ImageIcon("Images/NoGarage.png");
    final ImageIcon NoBoxesIcon = new ImageIcon("Images/NoBoxes.png");
    final ImageIcon NoFrameIcon = new ImageIcon("Images/NoFrame.png");
	
    final ImageIcon MaxUpgradeIcon = new ImageIcon("Images/Congralations.png");
    
    final ImageIcon BoxLv1_2Icon = new ImageIcon("Images/BoxLv1_2.png");
    final ImageIcon BoxLv3_4Icon = new ImageIcon("Images/BoxLv3_4.png");
    final ImageIcon BoxLv5_6Icon = new ImageIcon("Images/BoxLv5_6.png");
    final ImageIcon BoxLv7_8Icon = new ImageIcon("Images/BoxLv7_8.png");
    final ImageIcon BoxLv9_10Icon = new ImageIcon("Images/BoxLv9_10.png");
	
    final ImageIcon AccessoriesIcon = new ImageIcon("Images/Part_Accessories.png");
    final ImageIcon BodyIcon = new ImageIcon("Images/Part_Body.png");
    final ImageIcon BrakesIcon = new ImageIcon("Images/Part_Brakes.png");
    final ImageIcon CoolingIcon = new ImageIcon("Images/Part_Cooling.png");
    final ImageIcon ElectronicsIcon = new ImageIcon("Images/Part_Electronics.png");
    final ImageIcon EngineIcon = new ImageIcon("Images/Part_Engine.png");
    final ImageIcon ExaustIcon = new ImageIcon("Images/Part_Exaust.png");
    final ImageIcon FuelIcon = new ImageIcon("Images/Part_Fuel.png");
    final ImageIcon InteriorIcon = new ImageIcon("Images/Part_Interior.png");
    final ImageIcon SteeringIcon = new ImageIcon("Images/Part_Steering.png");
    final ImageIcon SuspensionIcon = new ImageIcon("Images/Part_Suspension.png");
    final ImageIcon TransmissionIcon = new ImageIcon("Images/Part_Transmission.png");
    final ImageIcon TiresIcon = new ImageIcon("Images/Part_Tires.png");
	
    final ImageIcon AccessoriesSoldIcon = new ImageIcon("Images/Part_Accessories_Sold.png");
    final ImageIcon BodySoldIcon = new ImageIcon("Images/Part_Body_Sold.png");
    final ImageIcon BrakesSoldIcon = new ImageIcon("Images/Part_Brakes_Sold.png");
    final ImageIcon CoolingSoldIcon = new ImageIcon("Images/Part_Cooling_Sold.png");
    final ImageIcon ElectronicsSoldIcon = new ImageIcon("Images/Part_Electronics_Sold.png");
    final ImageIcon EngineSoldIcon = new ImageIcon("Images/Part_Engine_Sold.png");
    final ImageIcon ExaustSoldIcon = new ImageIcon("Images/Part_Exaust_Sold.png");
    final ImageIcon FuelSoldIcon = new ImageIcon("Images/Part_Fuel_Sold.png");
    final ImageIcon InteriorSoldIcon = new ImageIcon("Images/Part_Interior_Sold.png");
    final ImageIcon SteeringSoldIcon = new ImageIcon("Images/Part_Steering_Sold.png");
    final ImageIcon SuspensionSoldIcon = new ImageIcon("Images/Part_Suspension_Sold.png");
    final ImageIcon TransmissionSoldIcon = new ImageIcon("Images/Part_Transmission_Sold.png");
    final ImageIcon TiresSoldIcon = new ImageIcon("Images/Part_Tires_Sold.png");
		
    final ImageIcon Aston_Martin_DB9Icon = new ImageIcon("Images/Aston_Martin_DB9.jpg");
    final ImageIcon Acura_NSXIcon = new ImageIcon("Images/Acura_NSX.jpg");
    final ImageIcon Ford_MustangIcon = new ImageIcon("Images/Ford_Mustang.jpg");
    final ImageIcon Moskvich_412Icon = new ImageIcon("Images/Moskvich_412.jpg");
    final ImageIcon Kia_VengaIcon = new ImageIcon("Images/Kia_Venga.jpg");
    final ImageIcon Fiat_1500Icon = new ImageIcon("Images/Fiat_1500.jpg");
    final ImageIcon Ferrari_EnzoIcon = new ImageIcon("Images/Ferrari_Enzo.jpg");
    final ImageIcon Aston_Martin_RapideIcon = new ImageIcon("Images/Aston_Martin_Rapide.jpg");
    final ImageIcon Koenigsegg_CCXIcon = new ImageIcon("Images/Koenigsegg_CCX.jpg");
    final ImageIcon Honda_CivicIcon = new ImageIcon("Images/Honda_Civic.jpg");
    final ImageIcon Cadilliac_ATSIcon = new ImageIcon("Images/Cadilliac_ATS.jpg");
    final ImageIcon Mitsubishi_LancerEvolutionXIcon = new ImageIcon("Images/Mitsubishi_LancerEvolutionX.jpg");
    final ImageIcon Infiniti_FXIcon = new ImageIcon("Images/Infiniti_FX.jpg");
    final ImageIcon Lancia_ThemaIcon = new ImageIcon("Images/Lancia_Thema.jpg");
    final ImageIcon Volvo_XC90Icon = new ImageIcon("Images/Volvo_XC90.jpg");
    final ImageIcon Acura_CSXIcon = new ImageIcon("Images/Acura_CSX.jpg");
    final ImageIcon Saab_SonettIIIcon = new ImageIcon("Images/Saab_SonettII.jpg");
    final ImageIcon Renault_FlorideIcon = new ImageIcon("Images/Renault_Floride.jpg");
    final ImageIcon BMW_e34Icon = new ImageIcon("Images/BMW_e34.jpg");
    final ImageIcon Chrysler_CordobaIcon = new ImageIcon("Images/Chrysler_Cordoba.jpg");
    final ImageIcon Buick_RivieraIcon = new ImageIcon("Images/Buick_Riviera.jpg");
    final ImageIcon Tesla_RoadsterIcon = new ImageIcon("Images/Tesla_Roadster.jpg");
    final ImageIcon Audi_80Icon = new ImageIcon("Images/Audi_80.jpg");
    final ImageIcon BMW_e36Icon = new ImageIcon("Images/BMW_e36.jpg");
    final ImageIcon Volkswagen_SciroccoIcon = new ImageIcon("Images/Volkswagen_Scirocco.jpg");
    final ImageIcon Mazda_3Icon = new ImageIcon("Images/Mazda_3.jpg");
    final ImageIcon Chevrolet_VikingIcon = new ImageIcon("Images/Chevrolet_Viking.jpg");
    final ImageIcon Tesla_SIcon = new ImageIcon("Images/Tesla_S.jpg");
    final ImageIcon Jeep_ZJIcon = new ImageIcon("Images/Jeep_ZJ.jpg");
    final ImageIcon Dodge_NeonIcon = new ImageIcon("Images/Dodge_Neon.jpg");
    final ImageIcon BMW_e30Icon = new ImageIcon("Images/BMW_e30.jpg");
    final ImageIcon Mercedes_Benz_W123Icon = new ImageIcon("Images/Mercedes_Benz_W123.jpg");
    final ImageIcon Land_Rover_DefenderIcon = new ImageIcon("Images/Land_Rover_Defender.jpg");
    final ImageIcon Saab_9_5Icon = new ImageIcon("Images/Saab_9_5.jpg");
    final ImageIcon Aston_Martin_OneIcon = new ImageIcon("Images/Aston_Martin_One.jpg");
    final ImageIcon Koenigsegg_RegeraIcon = new ImageIcon("Images/Koenigsegg_Regera.jpg");
    final ImageIcon Lexus_ISIcon = new ImageIcon("Images/Lexus_IS.jpg");
    final ImageIcon GMC_YukonIcon = new ImageIcon("Images/GMC_Yukon.jpg");
    final ImageIcon Opel_AstraIcon = new ImageIcon("Images/Opel_Astra.jpg");
    final ImageIcon Audi_CoupeIcon = new ImageIcon("Images/Audi_Coupe.jpg");
    final ImageIcon Mini_MokeIcon = new ImageIcon("Images/Mini_Moke.jpg");
    final ImageIcon Kia_RondoIcon = new ImageIcon("Images/Kia_Rondo.jpg");
    final ImageIcon GMC_SuburbanIcon = new ImageIcon("Images/GMC_Suburban.jpg");
    final ImageIcon Honda_PreludeIcon = new ImageIcon("Images/Honda_Prelude.jpg");
    final ImageIcon Citroen_SaxoIcon = new ImageIcon("Images/Citroen_Saxo.jpg");
    final ImageIcon Volkswagen_TiguanIcon = new ImageIcon("Images/Volkswagen_Tiguan.jpg");
    final ImageIcon Volkswagen_PhaetonIcon = new ImageIcon("Images/Volkswagen_Phaeton.jpg");
    final ImageIcon Buick_CentryIcon = new ImageIcon("Images/Buick_Centry.jpg");
    final ImageIcon Land_Rover_DiscoveryIcon = new ImageIcon("Images/Land_Rover_Discovery.jpg");
    final ImageIcon Infiniti_EthereaIcon = new ImageIcon("Images/Infiniti_Etherea.jpg");
    final ImageIcon Peugeot_308Icon = new ImageIcon("Images/Peugeot_308.jpg");
    final ImageIcon Toyota_AurisIcon = new ImageIcon("Images/Toyota_Auris.jpg");
    final ImageIcon Pagani_ZondaFIcon = new ImageIcon("Images/Pagani_ZondaF.jpg");
    final ImageIcon Lancia_PhedraIcon = new ImageIcon("Images/Lancia_Phedra.jpg");
    final ImageIcon Chevrolet_ImpalaIcon = new ImageIcon("Images/Chevrolet_Impala.jpg");
    final ImageIcon Porsche_BoxsterIcon = new ImageIcon("Images/Porsche_Boxster.jpg");
    final ImageIcon Aston_Martin_DB6Icon = new ImageIcon("Images/Aston_Martin_DB6.jpg");
    final ImageIcon Vaz_2103Icon = new ImageIcon("Images/Vaz_2103.jpg");
    final ImageIcon Hyundai_MistraIcon = new ImageIcon("Images/Hyundai_Mistra.jpg");
    final ImageIcon Mini_CountrymanIcon = new ImageIcon("Images/Mini_Countryman.jpg");
    final ImageIcon Mazda_MX6Icon = new ImageIcon("Images/Mazda_MX6.jpg");
    final ImageIcon Chrysler_DaytonaIcon = new ImageIcon("Images/Chrysler_Daytona.jpg");
    final ImageIcon Buick_RoadmasterIcon = new ImageIcon("Images/Buick_Roadmaster.jpg");
    final ImageIcon Volvo_S80Icon = new ImageIcon("Images/Volvo_S80.jpg");
    final ImageIcon Porsche_CaymanIcon = new ImageIcon("Images/Porsche_Cayman.jpg");
    final ImageIcon Volkswagen_BeetleIcon = new ImageIcon("Images/Volkswagen_Beetle.jpg");
	final ImageIcon Bugatti_EB110Icon = new ImageIcon("Images/Bugatti_EB110.jpg");
	final ImageIcon Opel_ZafiraIcon = new ImageIcon("Images/Opel_Zafira.jpg");
	final ImageIcon Saab_9000Icon = new ImageIcon("Images/Saab_9000.jpg");
	final ImageIcon McLaren_F1Icon = new ImageIcon("Images/McLaren_F1.jpg");
	final ImageIcon Audi_R8Icon = new ImageIcon("Images/Audi_R8.jpg");
	final ImageIcon Alfa_Romeo_8CIcon = new ImageIcon("Images/Alfa_Romeo_8C.jpg");
	final ImageIcon Ford_FiestaIcon = new ImageIcon("Images/Ford_Fiesta.jpg");
	final ImageIcon Infiniti_Q50Icon = new ImageIcon("Images/Infiniti_Q50.jpg");
	final ImageIcon Maserati_5000GTIcon = new ImageIcon("Images/Maserati_5000GT.jpg");
	final ImageIcon Mercedes_Benz_CLA250Icon = new ImageIcon("Images/Mercedes_Benz_CLA250.jpg");
	final ImageIcon Lamborghini_GallardoIcon = new ImageIcon("Images/Lamborghini_Gallardo.jpg");
	final ImageIcon Mazda_RX7Icon = new ImageIcon("Images/Mazda_RX7.jpg");
	final ImageIcon Mitsubishi_ColtIcon = new ImageIcon("Images/Mitsubishi_Colt.jpg");
	final ImageIcon Kia_SorentoIcon = new ImageIcon("Images/Kia_Sorento.jpg");
	final ImageIcon Rolls_Royce_WraithIcon = new ImageIcon("Images/Rolls_Royce_Wraith.jpg");
	final ImageIcon Lamborghini_DiabloIcon = new ImageIcon("Images/Lamborghini_Diablo.jpg");
	final ImageIcon Jeep_ScramblerIcon = new ImageIcon("Images/Jeep_Scrambler.jpg");
	final ImageIcon Bentley_ContinentalIcon = new ImageIcon("Images/Bentley_Continental.jpg");
	final ImageIcon Bentley_AzureIcon = new ImageIcon("Images/Bentley_Azure.jpg");
	final ImageIcon Koenigsegg_OneIcon = new ImageIcon("Images/Koenigsegg_One.jpg");
	final ImageIcon Cadilliac_XTSIcon = new ImageIcon("Images/Cadilliac_XTS.jpg");
	final ImageIcon Fiat_500Icon = new ImageIcon("Images/Fiat_500.jpg");
	final ImageIcon Mitsubishi_PajeroIcon = new ImageIcon("Images/Mitsubishi_Pajero.jpg");
	final ImageIcon Moskvich_2140Icon = new ImageIcon("Images/Moskvich_2140.jpg");
	final ImageIcon Opel_GTIcon = new ImageIcon("Images/Opel_GT.jpg");
	final ImageIcon Hyundai_GetzIcon = new ImageIcon("Images/Hyundai_Getz.jpg");
	final ImageIcon Maserati_CoupeIcon = new ImageIcon("Images/Maserati_Coupe.jpg");
	final ImageIcon Honda_S2000Icon = new ImageIcon("Images/Honda_S2000.jpg");
	final ImageIcon Alfa_Romeo_SpiderIcon = new ImageIcon("Images/Alfa_Romeo_Spider.jpg");
	final ImageIcon BMW_M5Icon = new ImageIcon("Images/BMW_M5.jpg");
	final ImageIcon BMW_I8Icon = new ImageIcon("Images/BMW_I8.jpg");
	final ImageIcon Citroen_C5Icon = new ImageIcon("Images/Citroen_C5.jpg");
	final ImageIcon Fiat_PuntoIcon = new ImageIcon("Images/Fiat_Punto.jpg");
	final ImageIcon Audi_100Icon = new ImageIcon("Images/Audi_100.jpg");
	final ImageIcon Rolls_Royce_PhantomIcon = new ImageIcon("Images/Rolls_Royce_Phantom.jpg");
	final ImageIcon Toyota_86Icon = new ImageIcon("Images/Toyota_86.jpg");
	final ImageIcon BMW_e70Icon = new ImageIcon("Images/BMW_e70.jpg");
	final ImageIcon Chrysler_VoyagerIcon = new ImageIcon("Images/Chrysler_Voyager.jpg");
	final ImageIcon Rolls_Royce_PhantomIIIIcon = new ImageIcon("Images/Rolls_Royce_PhantomIII.jpg");
	final ImageIcon Honda_CRXIcon = new ImageIcon("Images/Honda_CRX.jpg");
	final ImageIcon Subaru_1000Icon = new ImageIcon("Images/Subaru_1000.jpg");
	final ImageIcon Cadilliac_EldoradoIcon = new ImageIcon("Images/Cadilliac_Eldorado.jpg");
	final ImageIcon Land_Rover_FreelanderIcon = new ImageIcon("Images/Land_Rover_Freelander.jpg");
	final ImageIcon Renault_SpiderIcon = new ImageIcon("Images/Renault_Spider.jpg");
	final ImageIcon Gaz_21Icon = new ImageIcon("Images/Gaz_21.jpg");
	final ImageIcon Acura_ELIcon = new ImageIcon("Images/Acura_EL.jpg");
	final ImageIcon Bugatti_VeyronIcon = new ImageIcon("Images/Bugatti_Veyron.jpg");
	final ImageIcon Mercedes_Benz_SL600Icon = new ImageIcon("Images/Mercedes_Benz_SL600.jpg");
	final ImageIcon Rolls_Royce_SilverIcon = new ImageIcon("Images/Rolls_Royce_Silver.jpg");
	final ImageIcon Mini_PacemanIcon = new ImageIcon("Images/Mini_Paceman.jpg");
	final ImageIcon Hyundai_ExcelIcon = new ImageIcon("Images/Hyundai_Excel.jpg");
	final ImageIcon Gaz_24Icon = new ImageIcon("Images/Gaz_24.jpg");
	final ImageIcon Peugeot_107Icon = new ImageIcon("Images/Peugeot_107.jpg");
	final ImageIcon Audi_A4Icon = new ImageIcon("Images/Audi_A4.jpg");
	final ImageIcon Lamborghini_AventadorIcon = new ImageIcon("Images/Lamborghini_Aventador.jpg");
	final ImageIcon Nissan_350zIcon = new ImageIcon("Images/Nissan_350z.jpg");
	final ImageIcon Jaguar_XJ6Icon = new ImageIcon("Images/Jaguar_XJ6.jpg");
	final ImageIcon Renault_ClioIcon = new ImageIcon("Images/Renault_Clio.jpg");
	final ImageIcon Toyota_AvensisIcon = new ImageIcon("Images/Toyota_Avensis.jpg");
	final ImageIcon Subaru_OutbackIcon = new ImageIcon("Images/Subaru_Outback.jpg");
	final ImageIcon Saab_900Icon = new ImageIcon("Images/Saab_900.jpg");
	final ImageIcon Opel_VectraIcon = new ImageIcon("Images/Opel_Vectra.jpg");
	final ImageIcon Chrysler_ChargerIcon = new ImageIcon("Images/Chrysler_Charger.jpg");
	final ImageIcon Ferrari_348Icon = new ImageIcon("Images/Ferrari_348.jpg");
	final ImageIcon Hyundai_XGIcon = new ImageIcon("Images/Hyundai_XG.jpg");
	final ImageIcon Lexus_RXIcon = new ImageIcon("Images/Lexus_RX.jpg");
	final ImageIcon Dodge_400Icon = new ImageIcon("Images/Dodge_400.jpg");
	final ImageIcon GMC_TerrainIcon = new ImageIcon("Images/GMC_Terrain.jpg");
	final ImageIcon Volvo_C70Icon = new ImageIcon("Images/Volvo_C70.jpg");
	final ImageIcon Ford_SierraIcon = new ImageIcon("Images/Ford_Sierra.jpg");
	final ImageIcon Subaru_ImprezaIcon = new ImageIcon("Images/Subaru_Impreza.jpg");
	final ImageIcon BMW_e90Icon = new ImageIcon("Images/BMW_e90.jpg");
	final ImageIcon Nissan_SkylineIcon = new ImageIcon("Images/Nissan_Skyline.jpg");
	final ImageIcon Audi_Q7Icon = new ImageIcon("Images/Audi_Q7.jpg");
	final ImageIcon Bentley_ArnageIcon = new ImageIcon("Images/Bentley_Arnage.jpg");
	final ImageIcon Volvo_850Icon = new ImageIcon("Images/Volvo_850.jpg");
	final ImageIcon Toyota_Rav4Icon = new ImageIcon("Images/Toyota_Rav4.jpg");
	final ImageIcon Ford_FocusIcon = new ImageIcon("Images/Ford_Focus.jpg");
	final ImageIcon Chevrolet_SpinIcon = new ImageIcon("Images/Chevrolet_Spin.jpg");
	final ImageIcon Bentley_GTZIcon = new ImageIcon("Images/Bentley_GTZ.jpg");
	final ImageIcon Lexus_LSIcon = new ImageIcon("Images/Lexus_LS.jpg");
	final ImageIcon Land_Rover_RangeRoverIcon = new ImageIcon("Images/Land_Rover_RangeRover.jpg");
	final ImageIcon Lexus_GXIcon = new ImageIcon("Images/Lexus_GX.jpg");
	final ImageIcon Jeep_WranglerIcon = new ImageIcon("Images/Jeep_Wrangler.jpg");
	final ImageIcon Maserati_GranTurismoIcon = new ImageIcon("Images/Maserati_GranTurismo.jpg");
	final ImageIcon Koenigsegg_AgeraIcon = new ImageIcon("Images/Koenigsegg_Agera.jpg");
	final ImageIcon Acura_MDXIcon = new ImageIcon("Images/Acura_MDX.jpg");
	final ImageIcon Audi_RS6Icon = new ImageIcon("Images/Audi_RS6.jpg");
	final ImageIcon Cadilliac_DeVilleIcon = new ImageIcon("Images/Cadilliac_DeVille.jpg");
	final ImageIcon McLaren_VenenoIcon = new ImageIcon("Images/McLaren_Veneno.jpg");
	final ImageIcon Tesla_XIcon = new ImageIcon("Images/Tesla_XI.jpg");
	final ImageIcon Mercedes_Benz_G55Icon = new ImageIcon("Images/Mercedes_Benz_G55.jpg");
	final ImageIcon Lancia_LybraIcon = new ImageIcon("Images/Lancia_Lybra.jpg");
	final ImageIcon Infiniti_QX60Icon = new ImageIcon("Images/Infiniti_QX60.jpg");
	final ImageIcon Kia_ForteIcon = new ImageIcon("Images/Kia_Forte.jpg");
	final ImageIcon Lancia_VoyagerIcon = new ImageIcon("Images/Lancia_Voyager.jpg");
	final ImageIcon Porsche_CayenneIcon = new ImageIcon("Images/Porsche_Cayenne.jpg");
	final ImageIcon McLaren_650sIcon = new ImageIcon("Images/McLaren_650s.jpg");
	final ImageIcon Jaguar_E_TypeIcon = new ImageIcon("Images/Jaguar_E_Type.jpg");
	final ImageIcon Peugeot_601Icon = new ImageIcon("Images/Peugeot_601.jpg");
	final ImageIcon Jaguar_F_TypeIcon = new ImageIcon("Images/Jaguar_F_Type.jpg");
	final ImageIcon Fiat_DobloIcon = new ImageIcon("Images/Fiat_Doblo.jpg");
	final ImageIcon Vaz_2101Icon = new ImageIcon("Images/Vaz_2101.jpg");
	final ImageIcon McLaren_P1Icon = new ImageIcon("Images/McLaren_P1.jpg");
	final ImageIcon Peugeot_405Icon = new ImageIcon("Images/Peugeot_405.jpg");
	final ImageIcon GMC_EnvoyIcon = new ImageIcon("Images/GMC_Envoy.jpg");
	final ImageIcon Chevrolet_CorveteIcon = new ImageIcon("Images/Chevrolet_Corvete.jpg");
	final ImageIcon Pagani_HuayraIcon = new ImageIcon("Images/Pagani_Huayra.jpg");
	final ImageIcon Moskvich_402Icon = new ImageIcon("Images/Moskvich_402.jpg");
	final ImageIcon Alfa_Romeo_159Icon = new ImageIcon("Images/Alfa_Romeo_159.jpg");
	final ImageIcon Renault_FregateIcon = new ImageIcon("Images/Renault_Fregate.jpg");
	final ImageIcon Mini_CooperIcon = new ImageIcon("Images/Mini_Cooper.jpg");
	final ImageIcon Dodge_ViperIcon = new ImageIcon("Images/Dodge_Viper.jpg");
	final ImageIcon Vaz_NivaIcon = new ImageIcon("Images/Vaz_Niva.jpg");
	final ImageIcon Jaguar_X_TypeIcon = new ImageIcon("Images/Jaguar_X_Type.jpg");
	final ImageIcon Ferrari_308Icon = new ImageIcon("Images/Ferrari_308.jpg");
	final ImageIcon Mazda_626Icon = new ImageIcon("Images/Mazda_626.jpg");
	final ImageIcon Maserati_ShamalIcon = new ImageIcon("Images/Maserati_Shamal.jpg");
	final ImageIcon Nissan_240sxIcon = new ImageIcon("Images/Nissan_240sx.jpg");
	final ImageIcon Alfa_Romeo_4CIcon = new ImageIcon("Images/Alfa_Romeo_4C.jpg");
	final ImageIcon Nissan_JukeIcon = new ImageIcon("Images/Nisssan_Juke.jpg");
	final ImageIcon Volkswagen_Golf1Icon = new ImageIcon("Images/Volkswagen_Golf1.jpg");
	final ImageIcon Jeep_GladiatorIcon = new ImageIcon("Images/Jeep_Gladiator.jpg");
	final ImageIcon Dodge_MatadorIcon = new ImageIcon("Images/Dodge_Matador.jpg");
	final ImageIcon Bugatti_RoyaleIcon = new ImageIcon("Images/Bugatti_Royale.jpg");
	final ImageIcon Citroen_CXIcon = new ImageIcon("Images/Citroen_CX.jpg");
	final ImageIcon Lamborghini_350GTIcon = new ImageIcon("Images/Lamborghini_350GT.jpg");
	final ImageIcon Mitsubishi_GTOIcon = new ImageIcon("Images/Mitsubishi_GTO.jpg");
	final ImageIcon Buick_InvictaIcon = new ImageIcon("Images/Buick_Invicta.jpg");
	final ImageIcon Porsche_911Icon = new ImageIcon("Images/Porsche_911.jpg");
	final ImageIcon Subaru_ForesterIcon = new ImageIcon("Images/Subaru_Forester.jpg");
	final ImageIcon Citroen_BXIcon = new ImageIcon("Images/Citroen_BX.jpg");
	final ImageIcon Bugatti_Type252Icon = new ImageIcon("Images/Bugatti_Type252.jpg");
	final ImageIcon Ferrari_488Icon = new ImageIcon("Images/Ferrari_488.jpg");
	


	
  //  @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == jbtnMoney) {
            CarMain.Money +=1;
            CarMain.MoneyClicks +=1;
        }
        
        if(ae.getSource() == jbtnBoxes){
        	CarMain.Boxes +=1;
            CarMain.BoxesClicks +=1;          
            if(CarMain.Boxes == 2){
                CarMain.Boxes -=2;
                if(CarMain.BoxLevel == 1){
                    Box.BoxLv1.BoxCount +=1;                            
                    JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    }
                if(CarMain.BoxLevel == 2){ 
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(2)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    }
                if(CarMain.BoxLevel == 3){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(3)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.BoxLv3.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    }
                if(CarMain.BoxLevel == 4){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(4)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.BoxLv3.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.BoxLv4.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    }
               
                if(CarMain.BoxLevel == 5){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(5)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.BoxLv3.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.BoxLv4.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.BoxLv5.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    }
               
                if(CarMain.BoxLevel == 6){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(6)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.BoxLv3.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.BoxLv4.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.BoxLv5.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.BoxLv6.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    }
                if(CarMain.BoxLevel == 7){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(7)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.BoxLv3.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.BoxLv4.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.BoxLv5.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.BoxLv6.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 7){
                        Box.BoxLv7.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 7 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
                    }              
                if(CarMain.BoxLevel == 8){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(8)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.BoxLv3.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.BoxLv4.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.BoxLv5.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.BoxLv6.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 7){
                        Box.BoxLv7.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 7 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
                    if (randomInt == 8){
                        Box.BoxLv8.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 8 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
                    }  
                if(CarMain.BoxLevel == 9){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(9)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.BoxLv3.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.BoxLv4.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.BoxLv5.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.BoxLv6.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 7){
                        Box.BoxLv7.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 7 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
                    if (randomInt == 8){
                        Box.BoxLv8.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 8 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
                    if (randomInt == 9){
                        Box.BoxLv9.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 9 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv9_10Icon);}
                    }  
                if(CarMain.BoxLevel == 10){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(10)+1;
                    if (randomInt == 1){
                        Box.BoxLv1.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.BoxLv2.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.BoxLv3.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.BoxLv4.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.BoxLv5.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.BoxLv6.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
                    if (randomInt == 7){
                        Box.BoxLv7.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 7 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
                    if (randomInt == 8){
                        Box.BoxLv8.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 8 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
                    if (randomInt == 9){
                        Box.BoxLv9.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 9 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv9_10Icon);}                  
                    if (randomInt == 10){
                        Box.BoxLv10.BoxCount +=1;
                        JOptionPane.showMessageDialog (null, "You have gained 10 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv9_10Icon);}
                    }     
            }
        
        if(ae.getSource() == jbtnUpgradeLevel){          	
        	for (int i =9; i >=0; i--){            		
        		   if (CarMain.PlayerLevel == i){
                   	if (CarMain.Money >= 2){
                   		CarMain.Money -= 2;
                   		CarMain.PlayerLevel +=1;
                   		JOptionPane.showMessageDialog (null, "You have purchased " + CarMain.PlayerLevel + " Player level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, PlayerIcon);}                      	
                   	else{                       	
                   		JOptionPane.showMessageDialog (null, "You dont have enought money. This Upgrade costs 100*Next LVL!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}               
                   }            		   
        	}
        	if (CarMain.PlayerLevel == 10){
 			   JOptionPane.showMessageDialog(null, "You have gained MAX Player level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
 		   }
        } 
              
        if(ae.getSource() == jbtnUpgradeGarageLevel){          	
        	for (int i =9; i >=0; i--){            		
        		   if (Garage.GarageLevel == i){
                   	if (CarMain.Money >= 2){
                   		CarMain.Money -= 2;
                   		Garage.GarageLevel +=1;
                   		Garage.GarageSlots +=25;
                   		JOptionPane.showMessageDialog (null, "You have purchased " + Garage.GarageLevel + " garage level. Now you can carry 25 more cars!", "Congralations", JOptionPane.INFORMATION_MESSAGE, GarageIcon);}                      	
                   	else{                       	
                   		JOptionPane.showMessageDialog (null, "You dont have enought money. This Upgrade costs 100*Next LVL!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}               
                   }            		   
        	}
        	if (Garage.GarageLevel == 10){
 			   JOptionPane.showMessageDialog(null, "You have gained MAX Garage level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
 		   }
        } 
        
        if(ae.getSource() == jbtnUpgradeBoxesLevel){          	
        	for (int i =9; i >=0; i--){            		
        		   if (CarMain.BoxLevel == i){
                   	if (CarMain.Money >= 2){
                   		CarMain.Money -= 2;
                   		CarMain.BoxLevel +=1;
                   		JOptionPane.showMessageDialog (null, "You have purchased " + CarMain.BoxLevel + " BOX level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv9_10Icon);}                      	
                   	else{                       	
                   		JOptionPane.showMessageDialog (null, "You dont have enought money. This Upgrade costs 100*Next LVL!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}               
                   }
        	}
        	if (CarMain.BoxLevel == 10){
  			   JOptionPane.showMessageDialog(null, "You have gained MAX Garage level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
  		   }
        }
        
        if(ae.getSource() == jbtnBuyFrameLv1){
        	if (CarMain.PlayerLevel >=1){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv1.FrameCount +=1;
        			CarMain.Money -=10;       			
        			JOptionPane.showMessageDialog(null, "You have bought 1 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv2){
        	if (CarMain.PlayerLevel >=2){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv2.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 2 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv3){
        	if (CarMain.PlayerLevel >=3){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv3.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 3 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv4){
        	if (CarMain.PlayerLevel >=4){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv4.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 4 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv5){
        	if (CarMain.PlayerLevel >=5){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv5.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 5 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv6){
        	if (CarMain.PlayerLevel >=6){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv6.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 6 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv7){
        	if (CarMain.PlayerLevel >=7){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv7.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 7 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv8){
        	if (CarMain.PlayerLevel >=8){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv8.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 8 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv9){
        	if (CarMain.PlayerLevel >=9){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv9.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 9 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyFrameLv10){
        	if (CarMain.PlayerLevel >=10){
        		if (CarMain.Money >= 10){
        			CarFrame.FrameLv10.FrameCount +=1;
        			CarMain.Money -=10;
        			JOptionPane.showMessageDialog(null, "You have bought 10 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);
        		}
        	}
        }
        
        if(ae.getSource() == jbtnBuyBoxLv1){
        	if (CarMain.PlayerLevel >=1){
        		if (CarMain.Money >= 10){
        			Box.BoxLv1.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 1 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv2){
        	if (CarMain.PlayerLevel >=2){
        		if (CarMain.Money >= 10){
        			Box.BoxLv2.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 2 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv1_2Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv3){
        	if (CarMain.PlayerLevel >=3){
        		if (CarMain.Money >= 10){
        			Box.BoxLv3.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 3 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv4){
        	if (CarMain.PlayerLevel >=4){
        		if (CarMain.Money >= 10){
        			Box.BoxLv4.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 4 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv3_4Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv5){
        	if (CarMain.PlayerLevel >=5){
        		if (CarMain.Money >= 10){
        			Box.BoxLv5.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 5 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv6){
        	if (CarMain.PlayerLevel >=6){
        		if (CarMain.Money >= 10){
        			Box.BoxLv6.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 6 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv5_6Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv7){
        	if (CarMain.PlayerLevel >=7){
        		if (CarMain.Money >= 10){
        			Box.BoxLv7.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 7 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv8){
        	if (CarMain.PlayerLevel >=8){
        		if (CarMain.Money >= 10){
        			Box.BoxLv8.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 8 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv7_8Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv9){
        	if (CarMain.PlayerLevel >=9){
        		if (CarMain.Money >= 10){
        			Box.BoxLv9.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 9 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv9_10Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        if(ae.getSource() == jbtnBuyBoxLv10){
        	if (CarMain.PlayerLevel >=10){
        		if (CarMain.Money >= 10){
        			Box.BoxLv10.BoxCount +=1;
        			CarMain.Money -= 10;
        			JOptionPane.showMessageDialog(null, "You have bought 10 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BoxLv9_10Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money!", "No Money", JOptionPane.ERROR_MESSAGE, NoMoneyIcon);}
        		}
        	}
        
        
        if(ae.getSource() == jbtnPartsLv1){
        	if (Box.BoxLv1.BoxCount > 0){
        		if(CarMain.BoxLevel >=1){
        			if (CarMain.PlayerLevel >=1){
        				Box.BoxLv1.BoxCount -=1;
        				Random randomGenerator = new Random();
        				for (int i =0; i <2; i++ ){
        					int randomInt = randomGenerator.nextInt(13)+1;           					
                 		    if (randomInt == 1){
                		    	Part.AccessoriesLv1.PartCount +=1;                 		    	
                 		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
                		    if (randomInt == 2){
                		    	Part.BodyLv1.PartCount +=1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
                		    if (randomInt == 3){
                		    	Part.BrakesLv1.PartCount +=1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
                		    if (randomInt == 4){
                		    	Part.CoolingLv1.PartCount +=1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
                		    if (randomInt == 5){
         		    	   		Part.ElectronicsLv1.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
                		    if (randomInt == 6){
         		    	   		Part.EngineLv1.PartCount +=1;             		    	   		
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
                		    if (randomInt == 7){
         		    	   		Part.ExaustLv1.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL !1", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
                		    if (randomInt == 8){
         		    	   		Part.FuelLv1.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
                		    if (randomInt == 9){
         		    	   		Part.InteriorLv1.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
                		    if (randomInt == 10){
         		    	   		Part.SteeringLv1.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
                		    if (randomInt == 11){
         		    	   		Part.SuspensionLv1.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
                		    if (randomInt == 12){
         		    	   		Part.TransmissionLv1.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
                		    if (randomInt == 13){
         		    	   		Part.TiresLv1.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
        					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
        
        if(ae.getSource() == jbtnPartsLv2){
        	if (Box.BoxLv2.BoxCount > 0){
        		if(CarMain.BoxLevel >=2){
        			if (CarMain.PlayerLevel >=2){
        				Box.BoxLv2.BoxCount -=1;
        				Random randomGenerator = new Random();
        				for (int i =0; i <2; i++ ){
        					int randomInt = randomGenerator.nextInt(13)+1;     					
                		    if (randomInt == 1){
                		    	Part.AccessoriesLv2.PartCount +=1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
                		    if (randomInt == 2){
                		    	Part.BodyLv2.PartCount +=1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
                		    if (randomInt == 3){
                		    	Part.BrakesLv2.PartCount +=1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
                		    if (randomInt == 4){
                		    	Part.CoolingLv2.PartCount +=1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
                		    if (randomInt == 5){
         		    	   		Part.ElectronicsLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
                		    if (randomInt == 6){
         		    	   		Part.EngineLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
                		    if (randomInt == 7){
         		    	   		Part.ExaustLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
                		    if (randomInt == 8){
         		    	   		Part.FuelLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
                		    if (randomInt == 9){
         		    	   		Part.InteriorLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
                		    if (randomInt == 10){
         		    	   		Part.SteeringLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
                		    if (randomInt == 11){
         		    	   		Part.SuspensionLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
                		    if (randomInt == 12){
         		    	   		Part.TransmissionLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
                		    if (randomInt == 13){
         		    	   		Part.TiresLv2.PartCount +=1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
        					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
        
        if(ae.getSource() == jbtnPartsLv3){
        	if (Box.BoxLv3.BoxCount > 0){
        		if(CarMain.BoxLevel >=3){
        			if (CarMain.PlayerLevel >=3){
            		    Box.BoxLv3.BoxCount -=1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.AccessoriesLv3.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.BodyLv3.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.BrakesLv3.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.CoolingLv3.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
            		    if (randomInt == 5){
     		    	   		Part.ElectronicsLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
            		    if (randomInt == 6){
     		    	   		Part.EngineLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
            		    if (randomInt == 7){
     		    	   		Part.ExaustLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
            		    if (randomInt == 8){
     		    	   		Part.FuelLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
            		    if (randomInt == 9){
     		    	   		Part.InteriorLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
            		    if (randomInt == 10){
     		    	   		Part.SteeringLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
            		    if (randomInt == 11){
     		    	   		Part.SuspensionLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
            		    if (randomInt == 12){
     		    	   		Part.TransmissionLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
            		    if (randomInt == 13){
     		    	   		Part.TiresLv3.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
        
        if(ae.getSource() == jbtnPartsLv4){
        	if (Box.BoxLv4.BoxCount > 0){
        		if(CarMain.BoxLevel >=4){
        			if (CarMain.PlayerLevel >=4){
            		    Box.BoxLv4.BoxCount -=1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.AccessoriesLv4.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.BodyLv4.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.BrakesLv4.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.CoolingLv4.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
            		    if (randomInt == 5){
     		    	   		Part.ElectronicsLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
            		    if (randomInt == 6){
     		    	   		Part.EngineLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
            		    if (randomInt == 7){
     		    	   		Part.ExaustLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
            		    if (randomInt == 8){
     		    	   		Part.FuelLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
            		    if (randomInt == 9){
     		    	   		Part.InteriorLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
            		    if (randomInt == 10){
     		    	   		Part.SteeringLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
            		    if (randomInt == 11){
     		    	   		Part.SuspensionLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
            		    if (randomInt == 12){
     		    	   		Part.TransmissionLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
            		    if (randomInt == 13){
     		    	   		Part.TiresLv4.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
        
        if(ae.getSource() == jbtnPartsLv5){
        	if (Box.BoxLv5.BoxCount > 0){
        		if(CarMain.BoxLevel >=5){
        			if (CarMain.PlayerLevel >=5){
            		    Box.BoxLv5.BoxCount -=1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.AccessoriesLv5.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.BodyLv5.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.BrakesLv5.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.CoolingLv5.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
            		    if (randomInt == 5){
     		    	   		Part.ElectronicsLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
            		    if (randomInt == 6){
     		    	   		Part.EngineLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
            		    if (randomInt == 7){
     		    	   		Part.ExaustLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
            		    if (randomInt == 8){
     		    	   		Part.FuelLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
            		    if (randomInt == 9){
     		    	   		Part.InteriorLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
            		    if (randomInt == 10){
     		    	   		Part.SteeringLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
            		    if (randomInt == 11){
     		    	   		Part.SuspensionLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
            		    if (randomInt == 12){
     		    	   		Part.TransmissionLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmisson LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
            		    if (randomInt == 13){
     		    	   		Part.TiresLv5.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
        
        if(ae.getSource() == jbtnPartsLv6){
        	if (Box.BoxLv6.BoxCount > 0){
        		if(CarMain.BoxLevel >=6){
        			if (CarMain.PlayerLevel >=6){
            		    Box.BoxLv6.BoxCount -=1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.AccessoriesLv6.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.BodyLv6.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.BrakesLv6.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.CoolingLv6.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
            		    if (randomInt == 5){
     		    	   		Part.ElectronicsLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
            		    if (randomInt == 6){
     		    	   		Part.EngineLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
            		    if (randomInt == 7){
     		    	   		Part.ExaustLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
            		    if (randomInt == 8){
     		    	   		Part.FuelLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
            		    if (randomInt == 9){
     		    	   		Part.InteriorLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
            		    if (randomInt == 10){
     		    	   		Part.SteeringLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
            		    if (randomInt == 11){
     		    	   		Part.SuspensionLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
            		    if (randomInt == 12){
     		    	   		Part.TransmissionLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
            		    if (randomInt == 13){
     		    	   		Part.TiresLv6.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
 
        if(ae.getSource() == jbtnPartsLv7){
        	if (Box.BoxLv7.BoxCount > 0){
        		if(CarMain.BoxLevel >=7){
        			if (CarMain.PlayerLevel >=7){
            		    Box.BoxLv7.BoxCount -=1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.AccessoriesLv7.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.BodyLv7.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.BrakesLv7.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.CoolingLv7.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
            		    if (randomInt == 5){
     		    	   		Part.ElectronicsLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
            		    if (randomInt == 6){
     		    	   		Part.EngineLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
            		    if (randomInt == 7){
     		    	   		Part.ExaustLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
            		    if (randomInt == 8){
     		    	   		Part.FuelLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
            		    if (randomInt == 9){
     		    	   		Part.InteriorLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
            		    if (randomInt == 10){
     		    	   		Part.SteeringLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
            		    if (randomInt == 11){
     		    	   		Part.SuspensionLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
            		    if (randomInt == 12){
     		    	   		Part.TransmissionLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
            		    if (randomInt == 13){
     		    	   		Part.TiresLv7.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
        
        if(ae.getSource() == jbtnPartsLv8){
        	if (Box.BoxLv8.BoxCount > 0){
        		if(CarMain.BoxLevel >=8){
        			if (CarMain.PlayerLevel >=8){
            		    Box.BoxLv8.BoxCount -=1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.AccessoriesLv8.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.BodyLv8.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.BrakesLv8.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.CoolingLv8.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
            		    if (randomInt == 5){
     		    	   		Part.ElectronicsLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
            		    if (randomInt == 6){
     		    	   		Part.EngineLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
            		    if (randomInt == 7){
     		    	   		Part.ExaustLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}                    		
     		    	   	if (randomInt == 8){
     		    	   		Part.FuelLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
            		    if (randomInt == 9){
     		    	   		Part.InteriorLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
            		    if (randomInt == 10){
     		    	   		Part.SteeringLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
            		    if (randomInt == 11){
     		    	   		Part.SuspensionLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
            		    if (randomInt == 12){
     		    	   		Part.TransmissionLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
            		    if (randomInt == 13){
     		    	   		Part.TiresLv8.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
     		    	   		}
        				}
        			}
        			else{
            				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}        			        			
        		}                	        	
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        }
        
        if(ae.getSource() == jbtnPartsLv9){
        	if (Box.BoxLv9.BoxCount > 0){
        		if(CarMain.BoxLevel >=9){
        			if (CarMain.PlayerLevel >=9){
            		    Box.BoxLv9.BoxCount -=1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.AccessoriesLv9.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.BodyLv9.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.BrakesLv9.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.CoolingLv9.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
            		    if (randomInt == 5){
     		    	   		Part.ElectronicsLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
            		    if (randomInt == 6){
     		    	   		Part.EngineLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
            		    if (randomInt == 7){
     		    	   		Part.ExaustLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
            		    if (randomInt == 8){
     		    	   		Part.FuelLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
            		    if (randomInt == 9){
     		    	   		Part.InteriorLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
            		    if (randomInt == 10){
     		    	   		Part.SteeringLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
            		    if (randomInt == 11){
     		    	   		Part.SuspensionLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
            		    if (randomInt == 12){
     		    	   		Part.TransmissionLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
            		    if (randomInt == 13){
     		    	   		Part.TiresLv9.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
        
        if(ae.getSource() == jbtnPartsLv10){
        	if (Box.BoxLv10.BoxCount > 0){
        		if(CarMain.BoxLevel >=10){
        			if (CarMain.PlayerLevel >=10){
            		    Box.BoxLv10.BoxCount -=1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.AccessoriesLv10.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.BodyLv10.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.BrakesLv10.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.CoolingLv10.PartCount +=1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingIcon);}
            		    if (randomInt == 5){
     		    	   		Part.ElectronicsLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsIcon);}
            		    if (randomInt == 6){
     		    	   		Part.EngineLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineIcon);}
            		    if (randomInt == 7){
     		    	   		Part.ExaustLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustIcon);}
            		    if (randomInt == 8){
     		    	   		Part.FuelLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelIcon);}
            		    if (randomInt == 9){
     		    	   		Part.InteriorLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorIcon);}
            		    if (randomInt == 10){
     		    	   		Part.SteeringLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringIcon);}
            		    if (randomInt == 11){
     		    	   		Part.SuspensionLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionIcon);}
            		    if (randomInt == 12){
     		    	   		Part.TransmissionLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionIcon);}
            		    if (randomInt == 13){
     		    	   		Part.TiresLv10.PartCount +=1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresIcon);}
    					}          					   
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, NoBoxesIcon);}
        	}
            
        
        if(ae.getSource() == jbtnSellAccessoriesLv1){
        	if (Part.AccessoriesLv1.PartCount >0){
        		Part.AccessoriesLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv2){
        	if (Part.AccessoriesLv2.PartCount >0){
        		Part.AccessoriesLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv3){
        	if (Part.AccessoriesLv3.PartCount >0){
        		Part.AccessoriesLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv4){
        	if (Part.AccessoriesLv4.PartCount >0){
        		Part.AccessoriesLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv5){
        	if (Part.AccessoriesLv5.PartCount >0){
        		Part.AccessoriesLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv6){
        	if (Part.AccessoriesLv6.PartCount >0){
        		Part.AccessoriesLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv7){
        	if (Part.AccessoriesLv7.PartCount >0){
        		Part.AccessoriesLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv8){
        	if (Part.AccessoriesLv8.PartCount >0){
        		Part.AccessoriesLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv9){
        	if (Part.AccessoriesLv9.PartCount >0){
        		Part.AccessoriesLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv10){
        	if (Part.AccessoriesLv10.PartCount >0){
        		Part.AccessoriesLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellBodyLv1){
        	if (Part.BodyLv1.PartCount >0){
        		Part.BodyLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv2){
        	if (Part.BodyLv2.PartCount >0){
        		Part.BodyLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv3){
        	if (Part.BodyLv3.PartCount >0){
        		Part.BodyLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv4){
        	if (Part.BodyLv4.PartCount >0){
        		Part.BodyLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv5){
        	if (Part.BodyLv5.PartCount >0){
        		Part.BodyLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv6){
        	if (Part.BodyLv6.PartCount >0){
        		Part.BodyLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv7){
        	if (Part.BodyLv7.PartCount >0){
        		Part.BodyLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv8){
        	if (Part.BodyLv8.PartCount >0){
        		Part.BodyLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv9){
        	if (Part.BodyLv9.PartCount >0){
        		Part.BodyLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBodyLv10){
        	if (Part.BodyLv10.PartCount >0){
        		Part.BodyLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Body 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellBrakesLv1){
        	if (Part.BrakesLv1.PartCount >0){
        		Part.BrakesLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        if(ae.getSource() == jbtnSellBrakesLv2){
        	if (Part.BrakesLv2.PartCount >0){
        		Part.BrakesLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellBrakesLv3){
        	if (Part.BrakesLv3.PartCount >0){
        		Part.BrakesLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellBrakesLv4){
        	if (Part.BrakesLv4.PartCount >0){
        		Part.BrakesLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellBrakesLv5){
        	if (Part.BrakesLv5.PartCount >0){
        		Part.BrakesLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellBrakesLv6){
        	if (Part.BrakesLv6.PartCount >0){
        		Part.BrakesLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellBrakesLv7){
        	if (Part.BrakesLv7.PartCount >0){
        		Part.BrakesLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellBrakesLv8){
        	if (Part.BrakesLv8.PartCount >0){
        		Part.BrakesLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellBrakesLv9){
        	if (Part.BrakesLv9.PartCount >0){
        		Part.BrakesLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellBrakesLv10){
        	if (Part.BrakesLv10.PartCount >0){
        		Part.BrakesLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv1){
        	if (Part.CoolingLv1.PartCount >0){
        		Part.CoolingLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellCoolingLv2){
        	if (Part.CoolingLv2.PartCount >0){
        		Part.CoolingLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv3){
        	if (Part.CoolingLv3.PartCount >0){
        		Part.CoolingLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv4){
        	if (Part.CoolingLv4.PartCount >0){
        		Part.CoolingLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv1){
        	if (Part.CoolingLv5.PartCount >0){
        		Part.CoolingLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv6){
        	if (Part.CoolingLv6.PartCount >0){
        		Part.CoolingLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv7){
        	if (Part.CoolingLv7.PartCount >0){
        		Part.CoolingLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv8){
        	if (Part.CoolingLv8.PartCount >0){
        		Part.CoolingLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv9){
        	if (Part.CoolingLv9.PartCount >0){
        		Part.CoolingLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellCoolingLv10){
        	if (Part.CoolingLv10.PartCount >0){
        		Part.CoolingLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv1){
        	if (Part.ElectronicsLv1.PartCount >0){
        		Part.ElectronicsLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }

        if(ae.getSource() == jbtnSellElectronicsLv2){
        	if (Part.ElectronicsLv2.PartCount >0){
        		Part.ElectronicsLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv3){
        	if (Part.ElectronicsLv3.PartCount >0){
        		Part.ElectronicsLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv4){
        	if (Part.ElectronicsLv4.PartCount >0){
        		Part.ElectronicsLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv5){
        	if (Part.ElectronicsLv5.PartCount >0){
        		Part.ElectronicsLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv6){
        	if (Part.ElectronicsLv6.PartCount >0){
        		Part.ElectronicsLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv7){
        	if (Part.ElectronicsLv7.PartCount >0){
        		Part.ElectronicsLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv8){
        	if (Part.ElectronicsLv8.PartCount >0){
        		Part.ElectronicsLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv9){
        	if (Part.ElectronicsLv9.PartCount >0){
        		Part.ElectronicsLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellElectronicsLv10){
        	if (Part.ElectronicsLv10.PartCount >0){
        		Part.ElectronicsLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv1){
        	if (Part.EngineLv1.PartCount >0){
        		Part.EngineLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv2){
        	if (Part.EngineLv2.PartCount >0){
        		Part.EngineLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv3){
        	if (Part.EngineLv3.PartCount >0){
        		Part.EngineLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv4){
        	if (Part.EngineLv4.PartCount >0){
        		Part.EngineLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv5){
        	if (Part.EngineLv5.PartCount >0){
        		Part.EngineLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv6){
        	if (Part.EngineLv6.PartCount >0){
        		Part.EngineLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv7){
        	if (Part.EngineLv7.PartCount >0){
        		Part.EngineLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv8){
        	if (Part.EngineLv8.PartCount >0){
        		Part.EngineLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv9){
        	if (Part.EngineLv9.PartCount >0){
        		Part.EngineLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellEngineLv10){
        	if (Part.EngineLv10.PartCount >0){
        		Part.EngineLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Engine 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv1){
        	if (Part.ExaustLv1.PartCount >0){
        		Part.ExaustLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv2){
        	if (Part.ExaustLv2.PartCount >0){
        		Part.ExaustLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv3){
        	if (Part.ExaustLv3.PartCount >0){
        		Part.ExaustLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv4){
        	if (Part.ExaustLv4.PartCount >0){
        		Part.ExaustLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv5){
        	if (Part.ExaustLv5.PartCount >0){
        		Part.ExaustLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv6){
        	if (Part.ExaustLv6.PartCount >0){
        		Part.ExaustLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv7){
        	if (Part.ExaustLv7.PartCount >0){
        		Part.ExaustLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv8){
        	if (Part.ExaustLv8.PartCount >0){
        		Part.ExaustLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv9){
        	if (Part.ExaustLv9.PartCount >0){
        		Part.ExaustLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellExaustLv10){
        	if (Part.ExaustLv10.PartCount >0){
        		Part.ExaustLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv1){
        	if (Part.FuelLv1.PartCount >0){
        		Part.FuelLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv2){
        	if (Part.FuelLv2.PartCount >0){
        		Part.FuelLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv3){
        	if (Part.FuelLv3.PartCount >0){
        		Part.FuelLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv4){
        	if (Part.FuelLv4.PartCount >0){
        		Part.FuelLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv5){
        	if (Part.FuelLv5.PartCount >0){
        		Part.FuelLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv6){
        	if (Part.FuelLv6.PartCount >0){
        		Part.FuelLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv7){
        	if (Part.FuelLv7.PartCount >0){
        		Part.FuelLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv8){
        	if (Part.FuelLv8.PartCount >0){
        		Part.FuelLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv9){
        	if (Part.FuelLv9.PartCount >0){
        		Part.FuelLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellFuelLv10){
        	if (Part.FuelLv10.PartCount >0){
        		Part.FuelLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv1){
        	if (Part.InteriorLv1.PartCount >0){
        		Part.InteriorLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv2){
        	if (Part.InteriorLv2.PartCount >0){
        		Part.InteriorLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv3){
        	if (Part.InteriorLv3.PartCount >0){
        		Part.InteriorLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv4){
        	if (Part.InteriorLv4.PartCount >0){
        		Part.InteriorLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv5){
        	if (Part.InteriorLv5.PartCount >0){
        		Part.InteriorLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv6){
        	if (Part.InteriorLv6.PartCount >0){
        		Part.InteriorLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv7){
        	if (Part.InteriorLv7.PartCount >0){
        		Part.InteriorLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv8){
        	if (Part.InteriorLv8.PartCount >0){
        		Part.InteriorLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv9){
        	if (Part.InteriorLv9.PartCount >0){
        		Part.InteriorLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellInteriorLv10){
        	if (Part.InteriorLv10.PartCount >0){
        		Part.InteriorLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Interior 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv1){
        	if (Part.SteeringLv1.PartCount >0){
        		Part.SteeringLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv2){
        	if (Part.SteeringLv2.PartCount >0){
        		Part.SteeringLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv3){
        	if (Part.SteeringLv3.PartCount >0){
        		Part.SteeringLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv4){
        	if (Part.SteeringLv4.PartCount >0){
        		Part.SteeringLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv5){
        	if (Part.SteeringLv5.PartCount >0){
        		Part.SteeringLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv6){
        	if (Part.SteeringLv6.PartCount >0){
        		Part.SteeringLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv7){
        	if (Part.SteeringLv7.PartCount >0){
        		Part.SteeringLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv8){
        	if (Part.SteeringLv8.PartCount >0){
        		Part.SteeringLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv9){
        	if (Part.SteeringLv9.PartCount >0){
        		Part.SteeringLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSteeringLv10){
        	if (Part.SteeringLv10.PartCount >0){
        		Part.SteeringLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Steering 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv1){
        	if (Part.SuspensionLv1.PartCount >0){
        		Part.SuspensionLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv2){
        	if (Part.SuspensionLv2.PartCount >0){
        		Part.SuspensionLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv3){
        	if (Part.SuspensionLv3.PartCount >0){
        		Part.SuspensionLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv4){
        	if (Part.SuspensionLv4.PartCount >0){
        		Part.SuspensionLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv5){
        	if (Part.SuspensionLv5.PartCount >0){
        		Part.SuspensionLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv6){
        	if (Part.SuspensionLv6.PartCount >0){
        		Part.SuspensionLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv7){
        	if (Part.SuspensionLv7.PartCount >0){
        		Part.SuspensionLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv8){
        	if (Part.SuspensionLv8.PartCount >0){
        		Part.SuspensionLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv9){
        	if (Part.SuspensionLv9.PartCount >0){
        		Part.SuspensionLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellSuspensionLv10){
        	if (Part.SuspensionLv10.PartCount >0){
        		Part.SuspensionLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv1){
        	if (Part.TransmissionLv1.PartCount >0){
        		Part.TransmissionLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv2){
        	if (Part.TransmissionLv2.PartCount >0){
        		Part.TransmissionLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv3){
        	if (Part.TransmissionLv3.PartCount >0){
        		Part.TransmissionLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv4){
        	if (Part.TransmissionLv4.PartCount >0){
        		Part.TransmissionLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv5){
        	if (Part.TransmissionLv5.PartCount >0){
        		Part.TransmissionLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv6){
        	if (Part.TransmissionLv6.PartCount >0){
        		Part.TransmissionLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv7){
        	if (Part.TransmissionLv7.PartCount >0){
        		Part.TransmissionLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv8){
        	if (Part.TransmissionLv8.PartCount >0){
        		Part.TransmissionLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv9){
        	if (Part.TransmissionLv9.PartCount >0){
        		Part.TransmissionLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTransmissionLv10){
        	if (Part.TransmissionLv10.PartCount >0){
        		Part.TransmissionLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv1){
        	if (Part.TiresLv1.PartCount >0){
        		Part.TiresLv1.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 1 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv2){
        	if (Part.TiresLv2.PartCount >0){
        		Part.TiresLv2.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 2 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv3){
        	if (Part.TiresLv3.PartCount >0){
        		Part.TiresLv3.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 3 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv4){
        	if (Part.TiresLv4.PartCount >0){
        		Part.TiresLv4.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 4 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv5){
        	if (Part.TiresLv5.PartCount >0){
        		Part.TiresLv5.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 5 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv6){
        	if (Part.TiresLv6.PartCount >0){
        		Part.TiresLv6.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 6 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv7){
        	if (Part.TiresLv7.PartCount >0){
        		Part.TiresLv7.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 7 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv8){
        	if (Part.TiresLv8.PartCount >0){
        		Part.TiresLv8.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 8 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv9){
        	if (Part.TiresLv9.PartCount >0){
        		Part.TiresLv9.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 9 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }
        
        if(ae.getSource() == jbtnSellTiresLv10){
        	if (Part.TiresLv10.PartCount >0){
        		Part.TiresLv10.PartCount -=1;
        		CarMain.Money +=5;
        		JOptionPane.showMessageDialog (null, "You have sold Tires 10 LVL For 5 Money!", "Congralations", JOptionPane.INFORMATION_MESSAGE, TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);}
        	
        }      
    }
     
    public void actionPerformed2(ActionEvent ae) {
    if(ae.getSource() == jbtnBuildCarLv1){
    	System.out.println("Test");
    	if(CarMain.PlayerLevel >=1){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv1.FrameCount >0){
    				if(Part.AccessoriesLv1.PartCount >0){
    					if(Part.BodyLv1.PartCount >0){
    						if(Part.BrakesLv1.PartCount >0){
    							if(Part.CoolingLv1.PartCount >0){
    								if(Part.ElectronicsLv1.PartCount >0){
    									if(Part.EngineLv1.PartCount >0){
    										if(Part.ExaustLv1.PartCount >0){
    											if(Part.FuelLv1.PartCount >0){
    												if(Part.InteriorLv1.PartCount >0){
    													if(Part.SteeringLv1.PartCount >0){
    														if(Part.SuspensionLv1.PartCount >0){
    															if(Part.TransmissionLv1.PartCount >0){
    																if(Part.TiresLv1.PartCount >0){
    																	int level1carticker= 3; //Skaita pa +4 lai atkal nesajauktos arraya, jo ja panems cita array vinibu tad atkal bus pilns ar erroriem
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){   //Penem no array String un to parvest pa int un nochecko vai 0       																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[3]); skaitlis+=1; //Panem no array cars 3 value un ieliek to private int  pec tam pieskaita pie count +1 
    																		CarsLv1.cars[3] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Aston_Martin_DB9Icon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){ //Penem no array String un to parvest pa int un nochecko vai 0 
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; //Panem no array cars 7 value un ieliek to private int  pec tam pieskaita pie count +1 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
    																		JOptionPane.showMessageDialog (null, "You have gained Acura NSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Acura_NSXIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; //Panem no array cars 7 value un ieliek to private int  pec tam pieskaita pie count +1 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis); // Jauno value ieliek array ka String atpakal
    																		JOptionPane.showMessageDialog (null, "You have gained Ford Mustang!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ford_MustangIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 412!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Moskvich_412Icon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Kia Venga!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Kia_VengaIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Fiat 1500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Fiat_1500Icon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari Enzo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ferrari_EnzoIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin Rapide!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Aston_Martin_RapideIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg CCX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Koenigsegg_CCXIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker])  == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Honda Civic!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Honda_CivicIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac ATS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Cadilliac_ATSIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Lancer Evolution X!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mitsubishi_LancerEvolutionXIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti FX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Infiniti_FXIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Thema!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lancia_ThemaIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Volvo XC90!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volvo_XC90Icon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Acura CSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Acura_CSXIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Saab Sonett II!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Saab_SonettIIIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Renault Floride!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Renault_FlorideIcon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained BMW e34!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BMW_e34Icon);
    																	}
    																	level1carticker+=4;
    																	if(Integer.parseInt(CarsLv1.cars[level1carticker]) == 0){
    																		CarFrame.FrameLv1.FrameCount -=1;
    																		Part.AccessoriesLv1.PartCount -=1;
    																		Part.BodyLv1.PartCount -=1;
    																		Part.BrakesLv1.PartCount -=1;
    																		Part.CoolingLv1.PartCount -=1;
    																		Part.ElectronicsLv1.PartCount -=1;
    																		Part.EngineLv1.PartCount -=1;
    																		Part.ExaustLv1.PartCount -=1;
    																		Part.FuelLv1.PartCount -=1;
    																		Part.InteriorLv1.PartCount -=1;
    																		Part.SteeringLv1.PartCount -=1;
    																		Part.SuspensionLv1.PartCount -=1;
    																		Part.TransmissionLv1.PartCount -=1;
    																		Part.TiresLv1.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		int skaitlis = 	Integer.parseInt(CarsLv1.cars[level1carticker]); skaitlis+=1; 
    																		CarsLv1.cars[level1carticker] = Integer.toString(skaitlis);
    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Cordoba!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chrysler_CordobaIcon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 1 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 1 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    
    if(ae.getSource() == jbtnBuildCarLv2){
    	if(CarMain.PlayerLevel >=2){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv2.FrameCount >0){
    				if(Part.AccessoriesLv2.PartCount >0){
    					if(Part.BodyLv2.PartCount >0){
    						if(Part.BrakesLv2.PartCount >0){
    							if(Part.CoolingLv2.PartCount >0){
    								if(Part.ElectronicsLv2.PartCount >0){
    									if(Part.EngineLv2.PartCount >0){
    										if(Part.ExaustLv2.PartCount >0){
    											if(Part.FuelLv2.PartCount >0){
    												if(Part.InteriorLv2.PartCount >0){
    													if(Part.SteeringLv2.PartCount >0){
    														if(Part.SuspensionLv2.PartCount >0){
    															if(Part.TransmissionLv2.PartCount >0){
    																if(Part.TiresLv2.PartCount >0){
    																	if(CarsLv2.Buick_Riviera.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Buick_Riviera.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Buick Riviera!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Buick_RivieraIcon);
    																	}
    																	if(CarsLv2.Tesla_Roadster.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Tesla_Roadster.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Tesla Roadster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Tesla_RoadsterIcon);
    																	}
    																	if(CarsLv2.Audi_80.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Audi_80.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Audi 80!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Audi_80Icon);
    																	}
    																	if(CarsLv2.BMW_e36.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.BMW_e36.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained BMW e36!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BMW_e36Icon);
    																	}
    																	if(CarsLv2.Volkswagen_Scirocco.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Volkswagen_Scirocco.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Scirocco!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volkswagen_SciroccoIcon);
    																	}
    																	if(CarsLv2.Mazda_3.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Mazda_3.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mazda 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mazda_3Icon);
    																	}
    																	if(CarsLv2.Chevrolet_Viking.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Chevrolet_Viking.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Viking!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chevrolet_VikingIcon);
    																	}
    																	if(CarsLv2.Tesla_s.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Tesla_s.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Tesla S!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Tesla_SIcon);
    																	}
    																	if(CarsLv2.Jeep_ZJ.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Jeep_ZJ.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Jeep ZJ!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Jeep_ZJIcon);
    																	}
    																	if(CarsLv2.Dodge_Neon.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Dodge_Neon.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Dodge Neon!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Dodge_NeonIcon);
    																	}
    																	if(CarsLv2.BMW_e30.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.BMW_e30.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained BMW e30!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BMW_e30Icon);
    																	}
    																	if(CarsLv2.Mercedes_Benz_W123.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Mercedes_Benz_W123.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz W123!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mercedes_Benz_W123Icon);
    																	}
    																	if(CarsLv2.Land_Rover_Defender.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Land_Rover_Defender.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover Defender!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Land_Rover_DefenderIcon);
    																	}
    																	if(CarsLv2.Saab_9_5.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Saab_9_5.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Saab 9_5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Saab_9_5Icon);
    																	}
    																	if(CarsLv2.Aston_Martin_One.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Aston_Martin_One.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin One!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Aston_Martin_OneIcon);
    																	}
    																	if(CarsLv2.Koenigsegg_Regera.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Koenigsegg_Regera.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Regera!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Koenigsegg_RegeraIcon);
    																	}
    																	if(CarsLv2.Lexus_IS.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Lexus_IS.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lexus IS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lexus_ISIcon);
    																	}
    																	if(CarsLv2.GMC_Yukon.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.GMC_Yukon.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained GMC Yukon!", "Congralations", JOptionPane.INFORMATION_MESSAGE, GMC_YukonIcon);
    																	}
    																	if(CarsLv2.Opel_Astra.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Opel_Astra.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Opel_Astra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Opel_AstraIcon);
    																	}
    																	if(CarsLv2.Audi_Coupe.CarCount == 0){
    																		CarFrame.FrameLv2.FrameCount -=1;
    																		Part.AccessoriesLv2.PartCount -=1;
    																		Part.BodyLv2.PartCount -=1;
    																		Part.BrakesLv2.PartCount -=1;
    																		Part.CoolingLv2.PartCount -=1;
    																		Part.ElectronicsLv2.PartCount -=1;
    																		Part.EngineLv2.PartCount -=1;
    																		Part.ExaustLv2.PartCount -=1;
    																		Part.FuelLv2.PartCount -=1;
    																		Part.InteriorLv2.PartCount -=1;
    																		Part.SteeringLv2.PartCount -=1;
    																		Part.SuspensionLv2.PartCount -=1;
    																		Part.TransmissionLv2.PartCount -=1;
    																		Part.TiresLv2.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv2.Audi_Coupe.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Audi Coupe!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Audi_CoupeIcon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 2 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 2 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    if(ae.getSource() == jbtnBuildCarLv3){
    	if(CarMain.PlayerLevel >=3){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv3.FrameCount >0){
    				if(Part.AccessoriesLv3.PartCount >0){
    					if(Part.BodyLv3.PartCount >0){
    						if(Part.BrakesLv3.PartCount >0){
    							if(Part.CoolingLv3.PartCount >0){
    								if(Part.ElectronicsLv3.PartCount >0){
    									if(Part.EngineLv3.PartCount >0){
    										if(Part.ExaustLv3.PartCount >0){
    											if(Part.FuelLv3.PartCount >0){
    												if(Part.InteriorLv3.PartCount >0){
    													if(Part.SteeringLv3.PartCount >0){
    														if(Part.SuspensionLv3.PartCount >0){
    															if(Part.TransmissionLv3.PartCount >0){
    																if(Part.TiresLv3.PartCount >0){
    																	if(CarsLv3.Mini_Moke.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Mini_Moke.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mini Moke!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mini_MokeIcon);
    																	}
    																	if(CarsLv3.Kia_Rondo.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Kia_Rondo.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Kia Rondo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Kia_RondoIcon);
    																	}
    																	if(CarsLv3.GMC_Suburban.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.GMC_Suburban.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained GMC Suburban!", "Congralations", JOptionPane.INFORMATION_MESSAGE, GMC_SuburbanIcon);
    																	}
    																	if(CarsLv3.Honda_Prelude.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Honda_Prelude.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Honda Prelude!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Honda_PreludeIcon);
    																	}
    																	if(CarsLv3.Citroen_Saxo.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Citroen_Saxo.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Citroen_Saxo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Citroen_SaxoIcon);
    																	}
    																	if(CarsLv3.Volkswagen_Tiguan.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Volkswagen_Tiguan.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Tiguan!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volkswagen_TiguanIcon);
    																	}
    																	if(CarsLv3.Mini_Moke.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Mini_Moke.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mini Moke!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mini_MokeIcon);
    																	}
    																	if(CarsLv3.Volkswagen_Phaeton.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Volkswagen_Phaeton.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Phaeton!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volkswagen_PhaetonIcon);
    																	}
    																	if(CarsLv3.Buick_Centry.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Buick_Centry.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Buick Centry!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Buick_CentryIcon);
    																	}
    																	if(CarsLv3.Land_Rover_Discovery.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Land_Rover_Discovery.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover Discovery!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Land_Rover_DiscoveryIcon);
    																	}
    																	if(CarsLv3.Infiniti_Etherea.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Infiniti_Etherea.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti Etherea!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Infiniti_EthereaIcon);
    																	}
    																	if(CarsLv3.Peugeot_308.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Peugeot_308.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 308!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Peugeot_308Icon);
    																	}
    																	if(CarsLv3.Toyota_Auris.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Toyota_Auris.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Toyota Auris!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Toyota_AurisIcon);
    																	}
    																	if(CarsLv3.Pagani_ZondaF.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Pagani_ZondaF.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Pagani ZondaF!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Pagani_ZondaFIcon);
    																	}
    																	if(CarsLv3.Lancia_Phedra.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Lancia_Phedra.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Phedra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lancia_PhedraIcon);
    																	}
    																	if(CarsLv3.Chevrolet_Impala.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Chevrolet_Impala.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Impala!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chevrolet_ImpalaIcon);
    																	}
    																	if(CarsLv3.Porsche_Boxster.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Porsche_Boxster.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Porsche Boxster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Porsche_BoxsterIcon);
    																	}
    																	if(CarsLv3.Aston_Martin_DB6.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Aston_Martin_DB6.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Aston_Martin_DB6Icon);
    																	}
    																	if(CarsLv3.Vaz_2103.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Vaz_2103.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Vaz 2103!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Vaz_2103Icon);
    																	}
    																	if(CarsLv3.Hyundai_Mistra.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Hyundai_Mistra.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai Mistra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Hyundai_MistraIcon);
    																	}
    																	if(CarsLv3.Mini_Countryman.CarCount == 0){
    																		CarFrame.FrameLv3.FrameCount -=1;
    																		Part.AccessoriesLv3.PartCount -=1;
    																		Part.BodyLv3.PartCount -=1;
    																		Part.BrakesLv3.PartCount -=1;
    																		Part.CoolingLv3.PartCount -=1;
    																		Part.ElectronicsLv3.PartCount -=1;
    																		Part.EngineLv3.PartCount -=1;
    																		Part.ExaustLv3.PartCount -=1;
    																		Part.FuelLv3.PartCount -=1;
    																		Part.InteriorLv3.PartCount -=1;
    																		Part.SteeringLv3.PartCount -=1;
    																		Part.SuspensionLv3.PartCount -=1;
    																		Part.TransmissionLv3.PartCount -=1;
    																		Part.TiresLv3.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv3.Mini_Countryman.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mini Countryman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mini_CountrymanIcon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 3 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 3 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    if(ae.getSource() == jbtnBuildCarLv4){
    	if(CarMain.PlayerLevel >=4){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv4.FrameCount >0){
    				if(Part.AccessoriesLv4.PartCount >0){
    					if(Part.BodyLv4.PartCount >0){
    						if(Part.BrakesLv4.PartCount >0){
    							if(Part.CoolingLv4.PartCount >0){
    								if(Part.ElectronicsLv4.PartCount >0){
    									if(Part.EngineLv4.PartCount >0){
    										if(Part.ExaustLv4.PartCount >0){
    											if(Part.FuelLv4.PartCount >0){
    												if(Part.InteriorLv4.PartCount >0){
    													if(Part.SteeringLv4.PartCount >0){
    														if(Part.SuspensionLv4.PartCount >0){
    															if(Part.TransmissionLv4.PartCount >0){
    																if(Part.TiresLv4.PartCount >0){
    																	if(CarsLv4.Mazda_MX6.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Mazda_MX6.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mazda MX6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mazda_MX6Icon);
    																	}
    																	if(CarsLv4.Chrysler_Daytona.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Chrysler_Daytona.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Daytona!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chrysler_DaytonaIcon);
    																	}
    																	if(CarsLv4.Buick_Roadmaster.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Buick_Roadmaster.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Buick Roadmaster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Buick_RoadmasterIcon);
    																	}
    																	if(CarsLv4.Volvo_S80.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Volvo_S80.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Volvo S80!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volvo_S80Icon);
    																	}
    																	if(CarsLv4.Porsche_Cayman.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Porsche_Cayman.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Porsche Cayman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Porsche_CaymanIcon);
    																	}
    																	if(CarsLv4.Volkswagen_Beetle.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Volkswagen_Beetle.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Beetle!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volkswagen_BeetleIcon);
    																	}
    																	if(CarsLv4.Bugatti_EB110.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Bugatti_EB110.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti EB110!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Bugatti_EB110Icon);
    																	}
    																	if(CarsLv4.Opel_Zafira.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Opel_Zafira.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Opel Zafira!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Opel_ZafiraIcon);
    																	}
    																	if(CarsLv4.Saab_9000.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Saab_9000.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Saab 9000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Saab_9000Icon);
    																	}
    																	if(CarsLv4.McLaren_F1.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.McLaren_F1.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained McLaren F1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, McLaren_F1Icon);
    																	}
    																	if(CarsLv4.Audi_R8.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Audi_R8.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Audi R8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Audi_R8Icon);
    																	}
    																	if(CarsLv4.Alfa_Romeo_8C.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Alfa_Romeo_8C.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 8C!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Alfa_Romeo_8CIcon);
    																	}
    																	if(CarsLv4.Ford_Fiesta.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Ford_Fiesta.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Ford_Fiesta!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ford_FiestaIcon);
    																	}
    																	if(CarsLv4.Infiniti_Q50.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Infiniti_Q50.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti Q50!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Infiniti_Q50Icon);
    																	}
    																	if(CarsLv4.Maserati_5000GT.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Maserati_5000GT.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Maserati 5000GT!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Maserati_5000GTIcon);
    																	}
    																	if(CarsLv4.Mercedes_Benz_CLA250.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Mercedes_Benz_CLA250.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz CLA250!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mercedes_Benz_CLA250Icon);
    																	}
    																	if(CarsLv4.Lamborghini_Gallardo.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Lamborghini_Gallardo.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini Gallardo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lamborghini_GallardoIcon);
    																	}
    																	if(CarsLv4.Mazda_RX7.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Mazda_RX7.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mazda RX7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mazda_RX7Icon);
    																	}
    																	if(CarsLv4.Mitsubishi_Colt.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Mitsubishi_Colt.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Colt!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mitsubishi_ColtIcon);
    																	}
    																	if(CarsLv4.Kia_Sorento.CarCount == 0){
    																		CarFrame.FrameLv4.FrameCount -=1;
    																		Part.AccessoriesLv4.PartCount -=1;
    																		Part.BodyLv4.PartCount -=1;
    																		Part.BrakesLv4.PartCount -=1;
    																		Part.CoolingLv4.PartCount -=1;
    																		Part.ElectronicsLv4.PartCount -=1;
    																		Part.EngineLv4.PartCount -=1;
    																		Part.ExaustLv4.PartCount -=1;
    																		Part.FuelLv4.PartCount -=1;
    																		Part.InteriorLv4.PartCount -=1;
    																		Part.SteeringLv4.PartCount -=1;
    																		Part.SuspensionLv4.PartCount -=1;
    																		Part.TransmissionLv4.PartCount -=1;
    																		Part.TiresLv4.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv4.Kia_Sorento.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Kia Sorento!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Kia_SorentoIcon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 4 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 4 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    if(ae.getSource() == jbtnBuildCarLv5){
    	if(CarMain.PlayerLevel >=5){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv5.FrameCount >0){
    				if(Part.AccessoriesLv5.PartCount >0){
    					if(Part.BodyLv5.PartCount >0){
    						if(Part.BrakesLv5.PartCount >0){
    							if(Part.CoolingLv5.PartCount >0){
    								if(Part.ElectronicsLv5.PartCount >0){
    									if(Part.EngineLv5.PartCount >0){
    										if(Part.ExaustLv5.PartCount >0){
    											if(Part.FuelLv5.PartCount >0){
    												if(Part.InteriorLv5.PartCount >0){
    													if(Part.SteeringLv5.PartCount >0){
    														if(Part.SuspensionLv5.PartCount >0){
    															if(Part.TransmissionLv5.PartCount >0){
    																if(Part.TiresLv5.PartCount >0){
    																	if(CarsLv5.Rolls_Royce_Wraith.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Rolls_Royce_Wraith.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Wraith!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Rolls_Royce_WraithIcon);
    																	}
    																	if(CarsLv5.Lamborghini_Diablo.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Lamborghini_Diablo.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini Diablo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lamborghini_DiabloIcon);
    																	}
    																	if(CarsLv5.Jeep_Scrambler.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Jeep_Scrambler.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Jeep Scrambler!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Jeep_ScramblerIcon);
    																	}
    																	if(CarsLv5.Bentley_Continental.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Bentley_Continental.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Bentley Continental!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Bentley_ContinentalIcon);
    																	}
    																	if(CarsLv5.Bentley_Azure.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Bentley_Azure.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Bentley Azure!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Bentley_AzureIcon);
    																	}
    																	if(CarsLv5.Koenigsegg_One.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Koenigsegg_One.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg One!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Koenigsegg_OneIcon);
    																	}
    																	if(CarsLv5.Cadilliac_XTS.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Cadilliac_XTS.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac XTS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Cadilliac_XTSIcon);
    																	}
    																	if(CarsLv5.Fiat_500.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Fiat_500.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Fiat 500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Fiat_500Icon);
    																	}
    																	if(CarsLv5.Mitsubishi_Pajero.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Mitsubishi_Pajero.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Pajero!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mitsubishi_PajeroIcon);
    																	}
    																	if(CarsLv5.Moskvich_2140.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Moskvich_2140.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 2140!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Moskvich_2140Icon);
    																	}
    																	if(CarsLv5.Opel_GT.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Opel_GT.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Opel GT!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Opel_GTIcon);
    																	}
    																	if(CarsLv5.Hyundai_Getz.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Hyundai_Getz.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai Getz!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Hyundai_GetzIcon);
    																	}
    																	if(CarsLv5.Maserati_Coupe.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Maserati_Coupe.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Maserati Coupe!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Maserati_CoupeIcon);
    																	}
    																	if(CarsLv5.Honda_S2000.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Honda_S2000.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Honda S2000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Honda_S2000Icon);
    																	}
    																	if(CarsLv5.Alfa_Romeo_Spider.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Alfa_Romeo_Spider.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Alfa_Romeo_SpiderIcon);
    																	}
    																	if(CarsLv5.BMW_M5.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.BMW_M5.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained BMW M5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BMW_M5Icon);
    																	}
    																	if(CarsLv5.BMW_I8.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.BMW_I8.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained BMW I8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BMW_I8Icon);
    																	}
    																	if(CarsLv5.Citroen_C5.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Citroen_C5.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Citroen C5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Citroen_C5Icon);
    																	}
    																	if(CarsLv5.Fiat_Punto.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Fiat_Punto.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Fiat Punto!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Fiat_PuntoIcon);
    																	}
    																	if(CarsLv5.Audi_100.CarCount == 0){
    																		CarFrame.FrameLv5.FrameCount -=1;
    																		Part.AccessoriesLv5.PartCount -=1;
    																		Part.BodyLv5.PartCount -=1;
    																		Part.BrakesLv5.PartCount -=1;
    																		Part.CoolingLv5.PartCount -=1;
    																		Part.ElectronicsLv5.PartCount -=1;
    																		Part.EngineLv5.PartCount -=1;
    																		Part.ExaustLv5.PartCount -=1;
    																		Part.FuelLv5.PartCount -=1;
    																		Part.InteriorLv5.PartCount -=1;
    																		Part.SteeringLv5.PartCount -=1;
    																		Part.SuspensionLv5.PartCount -=1;
    																		Part.TransmissionLv5.PartCount -=1;
    																		Part.TiresLv5.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv5.Audi_100.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Audi 100!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Audi_100Icon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 5 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 5 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    if(ae.getSource() == jbtnBuildCarLv6){
    	if(CarMain.PlayerLevel >=6){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv6.FrameCount >0){
    				if(Part.AccessoriesLv6.PartCount >0){
    					if(Part.BodyLv6.PartCount >0){
    						if(Part.BrakesLv6.PartCount >0){
    							if(Part.CoolingLv6.PartCount >0){
    								if(Part.ElectronicsLv6.PartCount >0){
    									if(Part.EngineLv6.PartCount >0){
    										if(Part.ExaustLv6.PartCount >0){
    											if(Part.FuelLv6.PartCount >0){
    												if(Part.InteriorLv6.PartCount >0){
    													if(Part.SteeringLv6.PartCount >0){
    														if(Part.SuspensionLv6.PartCount >0){
    															if(Part.TransmissionLv6.PartCount >0){
    																if(Part.TiresLv6.PartCount >0){
    																	if(CarsLv6.Rolls_Royce_Phantom.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Rolls_Royce_Phantom.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Phantom", "Congralations", JOptionPane.INFORMATION_MESSAGE, Rolls_Royce_PhantomIcon);
    																	}
    																	if(CarsLv6.Toyota_86.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Toyota_86.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Toyota 86!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Toyota_86Icon);
    																	}
    																	if(CarsLv6.BMW_e70.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.BMW_e70.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained BMW e70!", "Congralations", JOptionPane.INFORMATION_MESSAGE, BMW_e70Icon);
    																	}
    																	if(CarsLv6.Chrysler_Voyager.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Chrysler_Voyager.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Voyager!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chrysler_VoyagerIcon);
    																	}
    																	if(CarsLv6.Rolls_Royce_PhantomIII.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Rolls_Royce_PhantomIII.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce PhantomIII!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Rolls_Royce_PhantomIIIIcon);
    																	}
    																	if(CarsLv6.Honda_CRX.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Honda_CRX.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Honda CRX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Honda_CRXIcon);
    																	}
    																	if(CarsLv6.Subaru_1000.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Subaru_1000.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Subaru 1000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Subaru_1000Icon);
    																	}
    																	if(CarsLv6.Cadilliac_Eldorado.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Cadilliac_Eldorado.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac Eldorado!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Cadilliac_EldoradoIcon);
    																	}
    																	if(CarsLv6.Land_Rover_Freelander.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Land_Rover_Freelander.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover Freelander!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Land_Rover_FreelanderIcon);
    																	}
    																	if(CarsLv6.Renault_Spider.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Renault_Spider.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Renault_Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Renault_SpiderIcon);
    																	}
    																	if(CarsLv6.Gaz_21.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Gaz_21.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Gaz 21!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Gaz_21Icon);
    																	}
    																	if(CarsLv6.Acura_EL.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Acura_EL.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Acura EL!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Acura_ELIcon);
    																	}
    																	if(CarsLv6.Bugatti_Veyron.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Bugatti_Veyron.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Veyron!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Bugatti_VeyronIcon);
    																	}
    																	if(CarsLv6.Mercedes_Benz_SL600.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Mercedes_Benz_SL600.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz SL600!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mercedes_Benz_SL600Icon);
    																	}
    																	if(CarsLv6.Rolls_Royce_Silver.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Rolls_Royce_Silver.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Silver!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Rolls_Royce_SilverIcon);
    																	}
    																	if(CarsLv6.Mini_Paceman.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Mini_Paceman.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mini Paceman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mini_PacemanIcon);
    																	}
    																	if(CarsLv6.Hyundai_Excel.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Hyundai_Excel.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai Excel!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Hyundai_ExcelIcon);
    																	}
    																	if(CarsLv6.Gaz_24.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Gaz_24.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Gaz 24!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Gaz_24Icon);
    																	}
    																	if(CarsLv6.Peugeot_107.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Peugeot_107.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 107!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Peugeot_107Icon);
    																	}
    																	if(CarsLv6.Audi_A4.CarCount == 0){
    																		CarFrame.FrameLv6.FrameCount -=1;
    																		Part.AccessoriesLv6.PartCount -=1;
    																		Part.BodyLv6.PartCount -=1;
    																		Part.BrakesLv6.PartCount -=1;
    																		Part.CoolingLv6.PartCount -=1;
    																		Part.ElectronicsLv6.PartCount -=1;
    																		Part.EngineLv6.PartCount -=1;
    																		Part.ExaustLv6.PartCount -=1;
    																		Part.FuelLv6.PartCount -=1;
    																		Part.InteriorLv6.PartCount -=1;
    																		Part.SteeringLv6.PartCount -=1;
    																		Part.SuspensionLv6.PartCount -=1;
    																		Part.TransmissionLv6.PartCount -=1;
    																		Part.TiresLv6.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv6.Audi_A4.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Audi_A4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, Audi_A4Icon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 6 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 6 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    if(ae.getSource() == jbtnBuildCarLv7){
    	if(CarMain.PlayerLevel >=7){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv7.FrameCount >0){
    				if(Part.AccessoriesLv7.PartCount >0){
    					if(Part.BodyLv7.PartCount >0){
    						if(Part.BrakesLv7.PartCount >0){
    							if(Part.CoolingLv7.PartCount >0){
    								if(Part.ElectronicsLv7.PartCount >0){
    									if(Part.EngineLv7.PartCount >0){
    										if(Part.ExaustLv7.PartCount >0){
    											if(Part.FuelLv7.PartCount >0){
    												if(Part.InteriorLv7.PartCount >0){
    													if(Part.SteeringLv7.PartCount >0){
    														if(Part.SuspensionLv7.PartCount >0){
    															if(Part.TransmissionLv7.PartCount >0){
    																if(Part.TiresLv7.PartCount >0){
    																	if(CarsLv7.Lamborghini_Aventador.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Lamborghini_Aventador.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini Aventador", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lamborghini_AventadorIcon);
    																	}
    																	if(CarsLv7.Nissan_350z.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Nissan_350z.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Nissan 350z", "Congralations", JOptionPane.INFORMATION_MESSAGE, Nissan_350zIcon);
    																	}
    																	if(CarsLv7.Jaguar_XJ6.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Jaguar_XJ6.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar XJ6", "Congralations", JOptionPane.INFORMATION_MESSAGE, Jaguar_XJ6Icon);
    																	}
    																	if(CarsLv7.Renault_Clio.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Renault_Clio.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Renault Clio", "Congralations", JOptionPane.INFORMATION_MESSAGE, Renault_ClioIcon);
    																	}
    																	if(CarsLv7.Toyota_Avensis.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Toyota_Avensis.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Toyota Avensis", "Congralations", JOptionPane.INFORMATION_MESSAGE, Toyota_AvensisIcon);
    																	}
    																	if(CarsLv7.Subaru_Outback.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Subaru_Outback.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Outback", "Congralations", JOptionPane.INFORMATION_MESSAGE, Subaru_OutbackIcon);
    																	}
    																	if(CarsLv7.Saab_900.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Saab_900.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Saab 900", "Congralations", JOptionPane.INFORMATION_MESSAGE, Saab_900Icon);
    																	}
    																	if(CarsLv7.Opel_Vectra.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Opel_Vectra.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Opel Vectra", "Congralations", JOptionPane.INFORMATION_MESSAGE, Opel_VectraIcon);
    																	}
    																	if(CarsLv7.Chrysler_Charger.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Chrysler_Charger.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Chrysler Charger", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chrysler_ChargerIcon);
    																	}
    																	if(CarsLv7.Ferrari_348.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Ferrari_348.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari_348", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ferrari_348Icon);
    																	}
    																	if(CarsLv7.Hyundai_XG.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Hyundai_XG.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Hyundai XG", "Congralations", JOptionPane.INFORMATION_MESSAGE, Hyundai_XGIcon);
    																	}
    																	if(CarsLv7.Lexus_RX.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Lexus_RX.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lexus RX", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lexus_RXIcon);
    																	}
    																	if(CarsLv7.Dodge_400.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Dodge_400.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Dodge 400", "Congralations", JOptionPane.INFORMATION_MESSAGE, Dodge_400Icon);
    																	}
    																	if(CarsLv7.GMC_Terrain.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.GMC_Terrain.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained GMC Terrain", "Congralations", JOptionPane.INFORMATION_MESSAGE, GMC_TerrainIcon);
    																	}
    																	if(CarsLv7.Volvo_C70.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Volvo_C70.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Volvo C70", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volvo_C70Icon);
    																	}
    																	if(CarsLv7.Ford_Sierra.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Ford_Sierra.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Ford_Sierra", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ford_SierraIcon);
    																	}
    																	if(CarsLv7.Subaru_Impreza.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Subaru_Impreza.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Impreza", "Congralations", JOptionPane.INFORMATION_MESSAGE, Subaru_ImprezaIcon);
    																	}
    																	if(CarsLv7.BMW_e90.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.BMW_e90.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained BMW e90", "Congralations", JOptionPane.INFORMATION_MESSAGE, BMW_e90Icon);
    																	}
    																	if(CarsLv7.Nissan_Skyline.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Nissan_Skyline.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Nissan Skyline", "Congralations", JOptionPane.INFORMATION_MESSAGE, Nissan_SkylineIcon);
    																	}
    																	if(CarsLv7.Audi_Q7.CarCount == 0){
    																		CarFrame.FrameLv7.FrameCount -=1;
    																		Part.AccessoriesLv7.PartCount -=1;
    																		Part.BodyLv7.PartCount -=1;
    																		Part.BrakesLv7.PartCount -=1;
    																		Part.CoolingLv7.PartCount -=1;
    																		Part.ElectronicsLv7.PartCount -=1;
    																		Part.EngineLv7.PartCount -=1;
    																		Part.ExaustLv7.PartCount -=1;
    																		Part.FuelLv7.PartCount -=1;
    																		Part.InteriorLv7.PartCount -=1;
    																		Part.SteeringLv7.PartCount -=1;
    																		Part.SuspensionLv7.PartCount -=1;
    																		Part.TransmissionLv7.PartCount -=1;
    																		Part.TiresLv7.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv7.Audi_Q7.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Audi Q7", "Congralations", JOptionPane.INFORMATION_MESSAGE, Audi_Q7Icon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 7 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 7 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    if(ae.getSource() == jbtnBuildCarLv8){
    	if(CarMain.PlayerLevel >=8){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv8.FrameCount >0){
    				if(Part.AccessoriesLv8.PartCount >0){
    					if(Part.BodyLv8.PartCount >0){
    						if(Part.BrakesLv8.PartCount >0){
    							if(Part.CoolingLv8.PartCount >0){
    								if(Part.ElectronicsLv8.PartCount >0){
    									if(Part.EngineLv8.PartCount >0){
    										if(Part.ExaustLv8.PartCount >0){
    											if(Part.FuelLv8.PartCount >0){
    												if(Part.InteriorLv8.PartCount >0){
    													if(Part.SteeringLv8.PartCount >0){
    														if(Part.SuspensionLv8.PartCount >0){
    															if(Part.TransmissionLv8.PartCount >0){
    																if(Part.TiresLv8.PartCount >0){
    																	if(CarsLv8.Bentley_Arnage.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Bentley_Arnage.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Bentley Arnage", "Congralations", JOptionPane.INFORMATION_MESSAGE, Bentley_ArnageIcon);
    																	}
    																	if(CarsLv8.Volvo_850.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Volvo_850.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Volvo 850", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volvo_850Icon);
    																	}
    																	if(CarsLv8.Toyota_Rav4.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Toyota_Rav4.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Toyota Rav4", "Congralations", JOptionPane.INFORMATION_MESSAGE, Toyota_Rav4Icon);
    																	}
    																	if(CarsLv8.Ford_Focus.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Ford_Focus.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Ford Focus", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ford_FocusIcon);
    																	}
    																	if(CarsLv8.Chevrolet_Spin.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Chevrolet_Spin.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Spin", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chevrolet_SpinIcon);
    																	}
    																	if(CarsLv8.Bentley_GTZ.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Bentley_GTZ.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Bentley GTZ", "Congralations", JOptionPane.INFORMATION_MESSAGE, Bentley_GTZIcon);
    																	}
    																	if(CarsLv8.Lexus_LS.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Lexus_LS.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lexus LS", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lexus_LSIcon);
    																	}
    																	if(CarsLv8.Land_Rover_RangeRover.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Land_Rover_RangeRover.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Land Rover RangeRover", "Congralations", JOptionPane.INFORMATION_MESSAGE, Land_Rover_RangeRoverIcon);
    																	}
    																	if(CarsLv8.Lexus_GX.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Lexus_GX.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lexus GX", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lexus_GXIcon);
    																	}
    																	if(CarsLv8.Jeep_Wrangler.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Jeep_Wrangler.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Jeep Wrangler", "Congralations", JOptionPane.INFORMATION_MESSAGE, Jeep_WranglerIcon);
    																	}
    																	if(CarsLv8.Maserati_GranTurismo.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Maserati_GranTurismo.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Maserati GranTurismo", "Congralations", JOptionPane.INFORMATION_MESSAGE, Maserati_GranTurismoIcon);
    																	}
    																	if(CarsLv8.Koenigsegg_Agera.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Koenigsegg_Agera.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Agera", "Congralations", JOptionPane.INFORMATION_MESSAGE, Koenigsegg_AgeraIcon);
    																	}
    																	if(CarsLv8.Acura_MDX.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Acura_MDX.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Acura MDX", "Congralations", JOptionPane.INFORMATION_MESSAGE, Acura_MDXIcon);
    																	}
    																	if(CarsLv8.Audi_RS6.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Audi_RS6.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Audi RS6", "Congralations", JOptionPane.INFORMATION_MESSAGE, Audi_RS6Icon);
    																	}
    																	if(CarsLv8.Cadilliac_DeVille.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Cadilliac_DeVille.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Cadilliac DeVille", "Congralations", JOptionPane.INFORMATION_MESSAGE, Cadilliac_DeVilleIcon);
    																	}
    																	if(CarsLv8.McLaren_Veneno.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.McLaren_Veneno.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained McLaren Veneno", "Congralations", JOptionPane.INFORMATION_MESSAGE, McLaren_VenenoIcon);
    																	}
    																	if(CarsLv8.Tesla_X.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Tesla_X.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Tesla X", "Congralations", JOptionPane.INFORMATION_MESSAGE, Tesla_XIcon);
    																	}
    																	if(CarsLv8.Mercedes_Benz_G55.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Mercedes_Benz_G55.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz G55", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mercedes_Benz_G55Icon);
    																	}
    																	if(CarsLv8.Lancia_Lybra.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Lancia_Lybra.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Lybra", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lancia_LybraIcon);
    																	}
    																	if(CarsLv8.Infiniti_QX60.CarCount == 0){
    																		CarFrame.FrameLv8.FrameCount -=1;
    																		Part.AccessoriesLv8.PartCount -=1;
    																		Part.BodyLv8.PartCount -=1;
    																		Part.BrakesLv8.PartCount -=1;
    																		Part.CoolingLv8.PartCount -=1;
    																		Part.ElectronicsLv8.PartCount -=1;
    																		Part.EngineLv8.PartCount -=1;
    																		Part.ExaustLv8.PartCount -=1;
    																		Part.FuelLv8.PartCount -=1;
    																		Part.InteriorLv8.PartCount -=1;
    																		Part.SteeringLv8.PartCount -=1;
    																		Part.SuspensionLv8.PartCount -=1;
    																		Part.TransmissionLv8.PartCount -=1;
    																		Part.TiresLv8.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv8.Infiniti_QX60.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Infiniti QX60", "Congralations", JOptionPane.INFORMATION_MESSAGE, Infiniti_QX60Icon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 8 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 8 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    if(ae.getSource() == jbtnBuildCarLv9){
    	if(CarMain.PlayerLevel >=9){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv9.FrameCount >0){
    				if(Part.AccessoriesLv9.PartCount >0){
    					if(Part.BodyLv9.PartCount >0){
    						if(Part.BrakesLv9.PartCount >0){
    							if(Part.CoolingLv9.PartCount >0){
    								if(Part.ElectronicsLv9.PartCount >0){
    									if(Part.EngineLv9.PartCount >0){
    										if(Part.ExaustLv9.PartCount >0){
    											if(Part.FuelLv9.PartCount >0){
    												if(Part.InteriorLv9.PartCount >0){
    													if(Part.SteeringLv9.PartCount >0){
    														if(Part.SuspensionLv9.PartCount >0){
    															if(Part.TransmissionLv9.PartCount >0){
    																if(Part.TiresLv9.PartCount >0){
    																	if(CarsLv9.Kia_Forte.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Kia_Forte.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Kia Forte", "Congralations", JOptionPane.INFORMATION_MESSAGE, Kia_ForteIcon);
    																	}
    																	if(CarsLv9.Lancia_Voyager.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Lancia_Voyager.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lancia Voyager", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lancia_VoyagerIcon);
    																	}
    																	if(CarsLv9.Porsche_Cayenne.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Porsche_Cayenne.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Porsche_Cayenne", "Congralations", JOptionPane.INFORMATION_MESSAGE, Porsche_CayenneIcon);
    																	}
    																	if(CarsLv9.McLaren_650s.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.McLaren_650s.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained McLaren_650s", "Congralations", JOptionPane.INFORMATION_MESSAGE, McLaren_650sIcon);
    																	}
    																	if(CarsLv9.Jaguar_E_Type.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Jaguar_E_Type.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar E-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, Jaguar_E_TypeIcon);
    																	}
    																	if(CarsLv9.Peugeot_601.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Peugeot_601.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 601", "Congralations", JOptionPane.INFORMATION_MESSAGE, Peugeot_601Icon);
    																	}
    																	if(CarsLv9.Jaguar_F_Type.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Jaguar_F_Type.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar F-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, Jaguar_F_TypeIcon);
    																	}
    																	if(CarsLv9.Fiat_Doblo.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Fiat_Doblo.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Fiat Doblo", "Congralations", JOptionPane.INFORMATION_MESSAGE, Fiat_DobloIcon);
    																	}
    																	if(CarsLv9.Vaz_2101.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Vaz_2101.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Vaz 2101", "Congralations", JOptionPane.INFORMATION_MESSAGE, Vaz_2101Icon);
    																	}
    																	if(CarsLv9.McLaren_P1.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.McLaren_P1.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained McLaren P1", "Congralations", JOptionPane.INFORMATION_MESSAGE, McLaren_P1Icon);
    																	}
    																	if(CarsLv9.Peugeot_405.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Peugeot_405.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Peugeot 405", "Congralations", JOptionPane.INFORMATION_MESSAGE, Peugeot_405Icon);
    																	}
    																	if(CarsLv9.GMC_Envoy.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.GMC_Envoy.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained GMC Envoy", "Congralations", JOptionPane.INFORMATION_MESSAGE, GMC_EnvoyIcon);
    																	}
    																	if(CarsLv9.Chevrolet_Corvete.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Chevrolet_Corvete.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Chevrolet Corvete", "Congralations", JOptionPane.INFORMATION_MESSAGE, Chevrolet_CorveteIcon);
    																	}
    																	if(CarsLv9.Pagani_Huayra.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Pagani_Huayra.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Pagani Huayra", "Congralations", JOptionPane.INFORMATION_MESSAGE, Pagani_HuayraIcon);
    																	}
    																	if(CarsLv9.Moskvich_402.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Moskvich_402.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Moskvich 402", "Congralations", JOptionPane.INFORMATION_MESSAGE, Moskvich_402Icon);
    																	}
    																	if(CarsLv9.Alfa_Romeo_159.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Alfa_Romeo_159.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 159", "Congralations", JOptionPane.INFORMATION_MESSAGE, Alfa_Romeo_159Icon);
    																	}
    																	if(CarsLv9.Renault_Fregate.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Renault_Fregate.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Renault Fregate", "Congralations", JOptionPane.INFORMATION_MESSAGE, Renault_FregateIcon);
    																	}
    																	if(CarsLv9.Mini_Cooper.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Mini_Cooper.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mini Cooper", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mini_CooperIcon);
    																	}
    																	if(CarsLv9.Dodge_Viper.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Dodge_Viper.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Dodge Viper", "Congralations", JOptionPane.INFORMATION_MESSAGE, Dodge_ViperIcon);
    																	}
    																	if(CarsLv9.Vaz_Niva.CarCount == 0){
    																		CarFrame.FrameLv9.FrameCount -=1;
    																		Part.AccessoriesLv9.PartCount -=1;
    																		Part.BodyLv9.PartCount -=1;
    																		Part.BrakesLv9.PartCount -=1;
    																		Part.CoolingLv9.PartCount -=1;
    																		Part.ElectronicsLv9.PartCount -=1;
    																		Part.EngineLv9.PartCount -=1;
    																		Part.ExaustLv9.PartCount -=1;
    																		Part.FuelLv9.PartCount -=1;
    																		Part.InteriorLv9.PartCount -=1;
    																		Part.SteeringLv9.PartCount -=1;
    																		Part.SuspensionLv9.PartCount -=1;
    																		Part.TransmissionLv9.PartCount -=1;
    																		Part.TiresLv9.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv9.Vaz_Niva.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Vaz Niva", "Congralations", JOptionPane.INFORMATION_MESSAGE, Vaz_NivaIcon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 9 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 9 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
    if(ae.getSource() == jbtnBuildCarLv10){
    	if(CarMain.PlayerLevel >=10){
    		if(Garage.GarageSlots >0){
    			if(CarFrame.FrameLv10.FrameCount >0){
    				if(Part.AccessoriesLv10.PartCount >0){
    					if(Part.BodyLv10.PartCount >0){
    						if(Part.BrakesLv10.PartCount >0){
    							if(Part.CoolingLv10.PartCount >0){
    								if(Part.ElectronicsLv10.PartCount >0){
    									if(Part.EngineLv10.PartCount >0){
    										if(Part.ExaustLv10.PartCount >0){
    											if(Part.FuelLv10.PartCount >0){
    												if(Part.InteriorLv10.PartCount >0){
    													if(Part.SteeringLv10.PartCount >0){
    														if(Part.SuspensionLv10.PartCount >0){
    															if(Part.TransmissionLv10.PartCount >0){
    																if(Part.TiresLv10.PartCount >0){
    																	if(CarsLv10.Jaguar_X_Type.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Jaguar_X_Type.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Jaguar X-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, Jaguar_X_TypeIcon);
    																	}
    																	if(CarsLv10.Ferrari_308.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Ferrari_308.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari 308", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ferrari_308Icon);
    																	}
    																	if(CarsLv10.Mazda_626.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Mazda_626.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mazda 626", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mazda_626Icon);
    																	}
    																	if(CarsLv10.Maserati_Shamal.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Maserati_Shamal.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Maserati Shamal", "Congralations", JOptionPane.INFORMATION_MESSAGE, Maserati_ShamalIcon);
    																	}
    																	if(CarsLv10.Nissan_240sx.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Nissan_240sx.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Nissan 240sx", "Congralations", JOptionPane.INFORMATION_MESSAGE, Nissan_240sxIcon);
    																	}
    																	if(CarsLv10.Alfa_Romeo_4C.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Alfa_Romeo_4C.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 4C", "Congralations", JOptionPane.INFORMATION_MESSAGE, Alfa_Romeo_4CIcon);
    																	}
    																	if(CarsLv10.Nissan_Juke.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Nissan_Juke.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Nissan Juke", "Congralations", JOptionPane.INFORMATION_MESSAGE, Nissan_JukeIcon);
    																	}
    																	if(CarsLv10.Volkswagen_Golf1.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Volkswagen_Golf1.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Volkswagen Golf1", "Congralations", JOptionPane.INFORMATION_MESSAGE, Volkswagen_Golf1Icon);
    																	}
    																	if(CarsLv10.Jeep_Gladiator.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Jeep_Gladiator.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Jeep Gladiator", "Congralations", JOptionPane.INFORMATION_MESSAGE, Jeep_GladiatorIcon);
    																	}
    																	if(CarsLv10.Dodge_Matador.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Dodge_Matador.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Dodge Matador", "Congralations", JOptionPane.INFORMATION_MESSAGE, Dodge_MatadorIcon);
    																	}
    																	if(CarsLv10.Bugatti_Royale.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Bugatti_Royale.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Royale", "Congralations", JOptionPane.INFORMATION_MESSAGE, Bugatti_RoyaleIcon);
    																	}
    																	if(CarsLv10.Citroen_CX.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Citroen_CX.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Citroen CX", "Congralations", JOptionPane.INFORMATION_MESSAGE, Citroen_CXIcon);
    																	}
    																	if(CarsLv10.Lamborghini_350GT.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Lamborghini_350GT.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Lamborghini 350GT", "Congralations", JOptionPane.INFORMATION_MESSAGE, Lamborghini_350GTIcon);
    																	}
    																	if(CarsLv10.Mitsubishi_GTO.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Mitsubishi_GTO.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Mitsubishi GTO", "Congralations", JOptionPane.INFORMATION_MESSAGE, Mitsubishi_GTOIcon);
    																	}
    																	if(CarsLv10.Buick_Invicta.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Buick_Invicta.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Buick Invicta", "Congralations", JOptionPane.INFORMATION_MESSAGE, Buick_InvictaIcon);
    																	}
    																	if(CarsLv10.Porsche_911.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Porsche_911.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Porsche 911", "Congralations", JOptionPane.INFORMATION_MESSAGE, Porsche_911Icon);
    																	}
    																	if(CarsLv10.Subaru_Forester.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Subaru_Forester.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Subaru Forester", "Congralations", JOptionPane.INFORMATION_MESSAGE, Subaru_ForesterIcon);
    																	}
    																	if(CarsLv10.Citroen_BX.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Citroen_BX.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Citroen BX", "Congralations", JOptionPane.INFORMATION_MESSAGE, Citroen_BXIcon);
    																	}
    																	if(CarsLv10.Bugatti_Type252.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Bugatti_Type252.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Bugatti Type252", "Congralations", JOptionPane.INFORMATION_MESSAGE, Bugatti_Type252Icon);
    																	}
    																	if(CarsLv10.Ferrari_488.CarCount == 0){
    																		CarFrame.FrameLv10.FrameCount -=1;
    																		Part.AccessoriesLv10.PartCount -=1;
    																		Part.BodyLv10.PartCount -=1;
    																		Part.BrakesLv10.PartCount -=1;
    																		Part.CoolingLv10.PartCount -=1;
    																		Part.ElectronicsLv10.PartCount -=1;
    																		Part.EngineLv10.PartCount -=1;
    																		Part.ExaustLv10.PartCount -=1;
    																		Part.FuelLv10.PartCount -=1;
    																		Part.InteriorLv10.PartCount -=1;
    																		Part.SteeringLv10.PartCount -=1;
    																		Part.SuspensionLv10.PartCount -=1;
    																		Part.TransmissionLv10.PartCount -=1;
    																		Part.TiresLv10.PartCount -=1;
    																		Garage.GarageSlots -=1;
    																		CarsLv10.Ferrari_488.CarCount +=1;
    																		JOptionPane.showMessageDialog (null, "You have gained Ferrari 488", "Congralations", JOptionPane.INFORMATION_MESSAGE, Ferrari_488Icon);
    																	}
    																}
    																else{
    																	JOptionPane.showMessageDialog(null, "You have colected all 10 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, MaxUpgradeIcon);
    																}
    															}
    															else{
    								                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    								                        	}
    														}
    														else{
    							                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    							                        	}
    													}
    													else{
    						                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    						                        	}
    												}
    												else{
    					                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    					                        	}
    											}
    											else{
    				                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    				                        	}
    										}
    										else{
    			                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    			                        	}
    									}
    									else{
    		                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    		                        	}
    								}
    								else{
    	                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
    	                        	}
    							}
    							else{
                            		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                            	}
    						}
    						else{
                        		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                        	}
    					}
    					else{
                    		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                    	}
    				}
    				else{
                		JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, NoPartsIcon);
                	}
    			}
    			else{
            		JOptionPane.showMessageDialog (null, "You don't have 10 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, NoFrameIcon);
            	}
    		}
    		else{
        		JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, NoGarageIcon);
        	}
    	}
    	else{
    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, NoPlayerIcon);
    	}
    }
}
}

