package Clicker;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;
import javax.swing.border.Border;

import java.util.Random;

public class ClickerGame implements ActionListener {
	
	//For CarBuild
    int count0 = 0;
    
    //Strings
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
    final static String Collections = "Collections";
    final static String ByCountry = "By Country";
    final static String ByBrand = "By Brand";
    final static String American = "American";
    final static String Japanese = "Japanese";
    final static String German = "German";
    final static String British = "British";
    final static String Italian = "Italian";
    final static String French = "French";
    final static String Korean = "Korean";
    final static String Swedish = "Swedish";
    final static String Russian = "Russian";
    final static String Chevrolet = "Chevrolet";
    final static String Cadilliac = "Cadilliac";
    final static String Buick = "Buick";
    final static String GMC = "GMC";
    final static String Ford = "Ford";
    final static String Chrysler = "Chrysler";
    final static String Dodge = "Dodge";
    final static String Jeep = "Jeep";
    final static String Tesla = "Tesla";
    final static String Toyota = "Toyota";
    final static String Lexus = "Lexus";
    final static String Mazda = "Mazda";
    final static String Honda = "Honda";
    final static String Acura = "Acura";
    final static String Mitsubishi = "Mitsubishi";
    final static String Nissan = "Nissan";
    final static String Infiniti = "Infiniti";
    final static String Subaru = "Subaru";
    final static String Audi = "Audi";
    final static String Mercedes_Benz = "Mercedes Benz";
    final static String BMW = "BMW";
    final static String Volkswagen = "Volkswagen";
    final static String Porsche = "Porsche";
    final static String Opel = "Opel";
    final static String Jaguar = "Jaguar";
    final static String Land_Rover = "Land Rover";
    final static String Mini = "Mini";
    final static String Aston_Martin = "Aston Martin";
    final static String Bentley = "Bentley";
    final static String Rolls_Royce = "Rolls Royce";
    final static String McLaren = "McLaren";
    final static String Fiat = "Fiat";
    final static String Alfa_Romeo = "Alfa Romeo";
    final static String Maserati = "Maserati";
    final static String Ferrari = "Ferrari";
    final static String Lamborghini = "Lamborghini";
    final static String Pagani = "Pagani";
    final static String Lancia = "Lancia";
    final static String Peugeot = "Peugeot";
    final static String Renault = "Renault";
    final static String Citroen = "Citroen";
    final static String Bugatti = "Bugatti";
    final static String Hyundai = "Hyundai";
    final static String Kia = "Kia";
    final static String Koenigsegg = "Koenigsegg";
    final static String Volvo = "Volvo";
    final static String Saab = "Saab";
    final static String VAZ = "VAZ";
    final static String GAZ = "GAZ";
    final static String Moskvich = "Moskvich";
    final static String Statistics = "Statistic";
    final static String Main = "Main";
    final static String Boxes = "Boxes";
    final static String Parts = "Parts";


    ImagesHolder ImagesHolder = new ImagesHolder();
    LabelsHolder Labels = new LabelsHolder();
 
    // Buttons
    
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
    	
    //Make TabbedPane
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
        
        //For BuildCarsClass
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
	          
    	jbtnPartsLv1.setEnabled(false);
    	jbtnBuyBoxLv1.setEnabled(false);
    	jbtnBuyFrameLv1.setEnabled(false);
    	jbtnBuildCarLv1.setEnabled(false);
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

		jbtnPartsLv2.setEnabled(false);
    	jbtnBuyBoxLv2.setEnabled(false);
    	jbtnBuyFrameLv2.setEnabled(false);
    	jbtnBuildCarLv2.setEnabled(false);
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

		jbtnPartsLv3.setEnabled(false);
    	jbtnBuyBoxLv3.setEnabled(false);
    	jbtnBuyFrameLv3.setEnabled(false);
    	jbtnBuildCarLv3.setEnabled(false);
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

		jbtnPartsLv4.setEnabled(false);
    	jbtnBuyBoxLv4.setEnabled(false);
    	jbtnBuyFrameLv4.setEnabled(false);
    	jbtnBuildCarLv4.setEnabled(false);
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

		jbtnPartsLv5.setEnabled(false);
    	jbtnBuyBoxLv5.setEnabled(false);
    	jbtnBuyFrameLv5.setEnabled(false);
    	jbtnBuildCarLv5.setEnabled(false);
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

		jbtnPartsLv6.setEnabled(false);
    	jbtnBuyBoxLv6.setEnabled(false);
    	jbtnBuyFrameLv6.setEnabled(false);
    	jbtnBuildCarLv6.setEnabled(false);
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

		jbtnPartsLv7.setEnabled(false);
    	jbtnBuyBoxLv7.setEnabled(false);
    	jbtnBuyFrameLv7.setEnabled(false);
    	jbtnBuildCarLv7.setEnabled(false);
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

		jbtnPartsLv8.setEnabled(false);
    	jbtnBuyBoxLv8.setEnabled(false);
    	jbtnBuyFrameLv8.setEnabled(false);
    	jbtnBuildCarLv8.setEnabled(false);
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

		jbtnPartsLv9.setEnabled(false);
    	jbtnBuyBoxLv9.setEnabled(false);
    	jbtnBuyFrameLv9.setEnabled(false);
    	jbtnBuildCarLv9.setEnabled(false);
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

		jbtnPartsLv10.setEnabled(false);
    	jbtnBuyBoxLv10.setEnabled(false);
    	jbtnBuyFrameLv10.setEnabled(false);
    	jbtnBuildCarLv10.setEnabled(false);
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
        
        jbtnMoney.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnMoney.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.MoneyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBoxes.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBoxes.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnUpgradeLevel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnUpgradeLevel.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.PlayerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnUpgradeBoxesLevel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnUpgradeBoxesLevel.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVLLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnUpgradeGarageLevel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnUpgradeGarageLevel.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.GarageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnPartsLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnPartsLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.OpenBoxesLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyBoxLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyBoxLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BoxesLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuyFrameLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuyFrameLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FrameLv10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnBuildCarLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnBuildCarLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CarsLv10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellAccessoriesLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellAccessoriesLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.AccessoriesLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBodyLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBodyLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BodyLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellBrakesLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellBrakesLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.BrakesLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellCoolingLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellCoolingLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.CoolingLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellElectronicsLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellElectronicsLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ElectronicsLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellEngineLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellEngineLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.EngineLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellExaustLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellExaustLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.ExaustLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellFuelLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellFuelLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.FuelLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellInteriorLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellInteriorLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.InteriorLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSteeringLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSteeringLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SteeringLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellSuspensionLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellSuspensionLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.SuspensionLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTransmissionLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTransmissionLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TransmissionLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL1Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL2Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL3Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL4Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv5.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL5Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv6.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL6Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv7.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL7Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv8.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL8Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv9.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL9Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        jbtnSellTiresLv10.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jbtnSellTiresLv10.setAlignmentX(Component.CENTER_ALIGNMENT);
        Labels.TiresLVL10Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
         //Tabbed Pane  
    	JTabbedPane tabbedPane = new JTabbedPane();
    	tabbedPane.setTabPlacement(JTabbedPane.TOP);
    	
    	//JLabel Border
    	Border  raisedbevel, loweredbevel;
    	raisedbevel = BorderFactory.createRaisedBevelBorder();
    	loweredbevel = BorderFactory.createLoweredBevelBorder();
    	
    	//MainPanel
    	GridLayout MainLayout = new GridLayout(3,5);
    	JPanel MainPanel = new JPanel();
    	MainPanel.setLayout(MainLayout);	
    	
    	JPanel MainPanelSub = new JPanel();
    	MainPanelSub.setLayout(new BoxLayout(MainPanelSub, BoxLayout.PAGE_AXIS));
    	MainPanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
    	
    	JPanel MainPanelSub2 = new JPanel();
    	MainPanelSub2.setLayout(new BoxLayout(MainPanelSub2, BoxLayout.PAGE_AXIS));
    	MainPanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
    	       
    	MainPanelSub.add(Labels.MoneyLabel);
    	MainPanelSub.add(jbtnMoney);
    	MainPanelSub2.add(Labels.BoxesLabel);
       	MainPanelSub2.add(jbtnBoxes);
       	
       	MainPanel.add(new JLabel(""));
       	MainPanel.add(new JLabel(""));
       	MainPanel.add(new JLabel(""));
       	MainPanel.add(new JLabel(""));
       	MainPanel.add(new JLabel(""));
       	MainPanel.add(new JLabel(""));
    	MainPanel.add(MainPanelSub);
    	MainPanel.add(new JLabel(""));
    	MainPanel.add(MainPanelSub2);
    	MainPanel.add(new JLabel(""));
    	MainPanel.add(new JLabel(""));
    	MainPanel.add(new JLabel(""));
    	MainPanel.add(new JLabel(""));
    	MainPanel.add(new JLabel(""));
    	
        
        //Upgrades Panel
    	
    	GridLayout UpgradesLayout = new GridLayout(3,3);
        JPanel UpgradesPanel = new JPanel();
        UpgradesPanel.setLayout(UpgradesLayout);
        
        JPanel UpgradesPanelSub = new JPanel();
        UpgradesPanelSub.setLayout(new BoxLayout(UpgradesPanelSub, BoxLayout.PAGE_AXIS));
        UpgradesPanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel UpgradesPanelSub2 = new JPanel();
        UpgradesPanelSub2.setLayout(new BoxLayout(UpgradesPanelSub2, BoxLayout.PAGE_AXIS));
        UpgradesPanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel UpgradesPanelSub3 = new JPanel();
        UpgradesPanelSub3.setLayout(new BoxLayout(UpgradesPanelSub3, BoxLayout.PAGE_AXIS));
        UpgradesPanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
    	
        UpgradesPanelSub.add(Labels.PlayerLabel);
        UpgradesPanelSub.add(jbtnUpgradeLevel);
        UpgradesPanelSub2.add(Labels.GarageLabel);
        UpgradesPanelSub2.add(jbtnUpgradeGarageLevel);
        UpgradesPanelSub3.add(Labels.BoxesLVLLabel);
        UpgradesPanelSub3.add(jbtnUpgradeBoxesLevel);
        
        UpgradesPanel.add(new JLabel(""));
        UpgradesPanel.add(new JLabel(""));
        UpgradesPanel.add(new JLabel(""));
        UpgradesPanel.add(UpgradesPanelSub);
        UpgradesPanel.add(UpgradesPanelSub2);
        UpgradesPanel.add(UpgradesPanelSub3);
        UpgradesPanel.add(new JLabel(""));
        UpgradesPanel.add(new JLabel(""));
        UpgradesPanel.add(new JLabel(""));
      
        // Buy Boxes Panel
       
        GridLayout BoxesLayout = new GridLayout(3,5);
        JPanel BuyBoxesPanel = new JPanel();
        BuyBoxesPanel.setLayout(BoxesLayout);
        
        JPanel BuyBoxesPanelSub = new JPanel();
        BuyBoxesPanelSub.setLayout(new BoxLayout(BuyBoxesPanelSub, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub2 = new JPanel();
        BuyBoxesPanelSub2.setLayout(new BoxLayout(BuyBoxesPanelSub2, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub3 = new JPanel();
        BuyBoxesPanelSub3.setLayout(new BoxLayout(BuyBoxesPanelSub3, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub4 = new JPanel();
        BuyBoxesPanelSub4.setLayout(new BoxLayout(BuyBoxesPanelSub4, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub5 = new JPanel();
        BuyBoxesPanelSub5.setLayout(new BoxLayout(BuyBoxesPanelSub5, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub6 = new JPanel();
        BuyBoxesPanelSub6.setLayout(new BoxLayout(BuyBoxesPanelSub6, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub7 = new JPanel();
        BuyBoxesPanelSub7.setLayout(new BoxLayout(BuyBoxesPanelSub7, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub8 = new JPanel();
        BuyBoxesPanelSub8.setLayout(new BoxLayout(BuyBoxesPanelSub8, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub9 = new JPanel();
        BuyBoxesPanelSub9.setLayout(new BoxLayout(BuyBoxesPanelSub9, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyBoxesPanelSub10 = new JPanel();
        BuyBoxesPanelSub10.setLayout(new BoxLayout(BuyBoxesPanelSub10, BoxLayout.PAGE_AXIS));
        BuyBoxesPanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
 	
        BuyBoxesPanelSub.add(Labels.BoxesLVL1Label);
        BuyBoxesPanelSub.add(jbtnBuyBoxLv1);
        BuyBoxesPanelSub2.add(Labels.BoxesLVL2Label);
        BuyBoxesPanelSub2.add(jbtnBuyBoxLv2);
        BuyBoxesPanelSub3.add(Labels.BoxesLVL3Label);
        BuyBoxesPanelSub3.add(jbtnBuyBoxLv3);
        BuyBoxesPanelSub4.add(Labels.BoxesLVL4Label);
        BuyBoxesPanelSub4.add(jbtnBuyBoxLv4);
        BuyBoxesPanelSub5.add(Labels.BoxesLVL5Label);
        BuyBoxesPanelSub5.add(jbtnBuyBoxLv5);
        BuyBoxesPanelSub6.add(Labels.BoxesLVL6Label);
        BuyBoxesPanelSub6.add(jbtnBuyBoxLv6);
        BuyBoxesPanelSub7.add(Labels.BoxesLVL7Label);
        BuyBoxesPanelSub7.add(jbtnBuyBoxLv7);
        BuyBoxesPanelSub8.add(Labels.BoxesLVL8Label);
        BuyBoxesPanelSub8.add(jbtnBuyBoxLv8);
        BuyBoxesPanelSub9.add(Labels.BoxesLVL9Label);
        BuyBoxesPanelSub9.add(jbtnBuyBoxLv9);
        BuyBoxesPanelSub10.add(Labels.BoxesLVL10Label);
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
        BuyBoxesPanel.add(new JLabel(""));
        BuyBoxesPanel.add(new JLabel(""));
        BuyBoxesPanel.add(new JLabel(""));
        BuyBoxesPanel.add(new JLabel(""));
        BuyBoxesPanel.add(new JLabel(""));
        
        // Open Boxes Panel
        
        JPanel OpenBoxesPanel = new JPanel();
        OpenBoxesPanel.setLayout(BoxesLayout);
        
        JPanel OpenBoxesPanelSub = new JPanel();
        OpenBoxesPanelSub.setLayout(new BoxLayout(OpenBoxesPanelSub, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub2 = new JPanel();
        OpenBoxesPanelSub2.setLayout(new BoxLayout(OpenBoxesPanelSub2, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub3 = new JPanel();
        OpenBoxesPanelSub3.setLayout(new BoxLayout(OpenBoxesPanelSub3, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub4 = new JPanel();
        OpenBoxesPanelSub4.setLayout(new BoxLayout(OpenBoxesPanelSub4, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub5 = new JPanel();
        OpenBoxesPanelSub5.setLayout(new BoxLayout(OpenBoxesPanelSub5, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub6 = new JPanel();
        OpenBoxesPanelSub6.setLayout(new BoxLayout(OpenBoxesPanelSub6, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub7 = new JPanel();
        OpenBoxesPanelSub7.setLayout(new BoxLayout(OpenBoxesPanelSub7, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub8 = new JPanel();
        OpenBoxesPanelSub8.setLayout(new BoxLayout(OpenBoxesPanelSub8, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub9 = new JPanel();
        OpenBoxesPanelSub9.setLayout(new BoxLayout(OpenBoxesPanelSub9, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel OpenBoxesPanelSub10 = new JPanel();
        OpenBoxesPanelSub10.setLayout(new BoxLayout(OpenBoxesPanelSub10, BoxLayout.PAGE_AXIS));
        OpenBoxesPanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
            	  	
        OpenBoxesPanelSub.add(Labels.OpenBoxesLVL1Label);
        OpenBoxesPanelSub.add(jbtnPartsLv1);
        OpenBoxesPanelSub2.add(Labels.OpenBoxesLVL2Label);
        OpenBoxesPanelSub2.add(jbtnPartsLv2);
        OpenBoxesPanelSub3.add(Labels.OpenBoxesLVL3Label);
        OpenBoxesPanelSub3.add(jbtnPartsLv3);
        OpenBoxesPanelSub4.add(Labels.OpenBoxesLVL4Label);
        OpenBoxesPanelSub4.add(jbtnPartsLv4);
        OpenBoxesPanelSub5.add(Labels.OpenBoxesLVL5Label);
        OpenBoxesPanelSub5.add(jbtnPartsLv5);
        OpenBoxesPanelSub6.add(Labels.OpenBoxesLVL6Label);
        OpenBoxesPanelSub6.add(jbtnPartsLv6);
        OpenBoxesPanelSub7.add(Labels.OpenBoxesLVL7Label);
        OpenBoxesPanelSub7.add(jbtnPartsLv7);
        OpenBoxesPanelSub8.add(Labels.OpenBoxesLVL8Label);
        OpenBoxesPanelSub8.add(jbtnPartsLv8);
        OpenBoxesPanelSub9.add(Labels.OpenBoxesLVL9Label);
        OpenBoxesPanelSub9.add(jbtnPartsLv9);
        OpenBoxesPanelSub10.add(Labels.OpenBoxesLVL10Label);
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
        OpenBoxesPanel.add(new JLabel(""));
        OpenBoxesPanel.add(new JLabel(""));
        OpenBoxesPanel.add(new JLabel(""));
        OpenBoxesPanel.add(new JLabel(""));
        OpenBoxesPanel.add(new JLabel(""));
         
        // Build Cars Panel
        
        GridLayout BuildCarsLayout = new GridLayout(3,5);
        JPanel BuildCarsPanel = new JPanel();
        BuildCarsPanel.setLayout(BuildCarsLayout);
        
        JPanel BuildCarsPanelSub = new JPanel();
        BuildCarsPanelSub.setLayout(new BoxLayout(BuildCarsPanelSub, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub2 = new JPanel();
        BuildCarsPanelSub2.setLayout(new BoxLayout(BuildCarsPanelSub2, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub3 = new JPanel();
        BuildCarsPanelSub3.setLayout(new BoxLayout(BuildCarsPanelSub3, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub4 = new JPanel();
        BuildCarsPanelSub4.setLayout(new BoxLayout(BuildCarsPanelSub4, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub5 = new JPanel();
        BuildCarsPanelSub5.setLayout(new BoxLayout(BuildCarsPanelSub5, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub6 = new JPanel();
        BuildCarsPanelSub6.setLayout(new BoxLayout(BuildCarsPanelSub6, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub7 = new JPanel();
        BuildCarsPanelSub7.setLayout(new BoxLayout(BuildCarsPanelSub7, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub8 = new JPanel();
        BuildCarsPanelSub8.setLayout(new BoxLayout(BuildCarsPanelSub8, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub9 = new JPanel();
        BuildCarsPanelSub9.setLayout(new BoxLayout(BuildCarsPanelSub9, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuildCarsPanelSub10 = new JPanel();
        BuildCarsPanelSub10.setLayout(new BoxLayout(BuildCarsPanelSub10, BoxLayout.PAGE_AXIS));
        BuildCarsPanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
     	
     	BuildCarsPanelSub.add(Labels.CarsLv1Label);
     	BuildCarsPanelSub.add(jbtnBuildCarLv1);
     	BuildCarsPanelSub2.add(Labels.CarsLv2Label);
     	BuildCarsPanelSub2.add(jbtnBuildCarLv2);
     	BuildCarsPanelSub3.add(Labels.CarsLv3Label);
     	BuildCarsPanelSub3.add(jbtnBuildCarLv3);
     	BuildCarsPanelSub4.add(Labels.CarsLv4Label);
     	BuildCarsPanelSub4.add(jbtnBuildCarLv4);
     	BuildCarsPanelSub5.add(Labels.CarsLv5Label);
     	BuildCarsPanelSub5.add(jbtnBuildCarLv5);
     	BuildCarsPanelSub6.add(Labels.CarsLv6Label);
     	BuildCarsPanelSub6.add(jbtnBuildCarLv6);
     	BuildCarsPanelSub7.add(Labels.CarsLv7Label);
     	BuildCarsPanelSub7.add(jbtnBuildCarLv7);
     	BuildCarsPanelSub8.add(Labels.CarsLv8Label);
     	BuildCarsPanelSub8.add(jbtnBuildCarLv8);
     	BuildCarsPanelSub9.add(Labels.CarsLv9Label);
     	BuildCarsPanelSub9.add(jbtnBuildCarLv9);
     	BuildCarsPanelSub10.add(Labels.CarsLv10Label);
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
     	BuildCarsPanel.add(new JLabel(""));
     	BuildCarsPanel.add(new JLabel(""));
     	BuildCarsPanel.add(new JLabel(""));
     	BuildCarsPanel.add(new JLabel(""));
     	BuildCarsPanel.add(new JLabel(""));
        
     	// Buy Frames Panel
     	
     	GridLayout BuyFramesLayout = new GridLayout(3,5);
        JPanel BuyFramesPanel = new JPanel();
        BuyFramesPanel.setLayout(BuyFramesLayout);
        
        JPanel BuyFramesPanelSub = new JPanel();
        BuyFramesPanelSub.setLayout(new BoxLayout(BuyFramesPanelSub, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub2 = new JPanel();
        BuyFramesPanelSub2.setLayout(new BoxLayout(BuyFramesPanelSub2, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub3 = new JPanel();
        BuyFramesPanelSub3.setLayout(new BoxLayout(BuyFramesPanelSub3, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub4 = new JPanel();
        BuyFramesPanelSub4.setLayout(new BoxLayout(BuyFramesPanelSub4, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub5 = new JPanel();
        BuyFramesPanelSub5.setLayout(new BoxLayout(BuyFramesPanelSub5, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub6 = new JPanel();
        BuyFramesPanelSub6.setLayout(new BoxLayout(BuyFramesPanelSub6, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub7 = new JPanel();
        BuyFramesPanelSub7.setLayout(new BoxLayout(BuyFramesPanelSub7, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub8 = new JPanel();
        BuyFramesPanelSub8.setLayout(new BoxLayout(BuyFramesPanelSub8, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub9 = new JPanel();
        BuyFramesPanelSub9.setLayout(new BoxLayout(BuyFramesPanelSub9, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel BuyFramesPanelSub10 = new JPanel();
        BuyFramesPanelSub10.setLayout(new BoxLayout(BuyFramesPanelSub10, BoxLayout.PAGE_AXIS));
        BuyFramesPanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
          	         	
     	BuyFramesPanelSub.add(Labels.FrameLv1Label);
     	BuyFramesPanelSub.add(jbtnBuyFrameLv1);
     	BuyFramesPanelSub2.add(Labels.FrameLv2Label);
     	BuyFramesPanelSub2.add(jbtnBuyFrameLv2);
     	BuyFramesPanelSub3.add(Labels.FrameLv3Label);
     	BuyFramesPanelSub3.add(jbtnBuyFrameLv3);
     	BuyFramesPanelSub4.add(Labels.FrameLv4Label);
     	BuyFramesPanelSub4.add(jbtnBuyFrameLv4);
     	BuyFramesPanelSub5.add(Labels.FrameLv5Label);
     	BuyFramesPanelSub5.add(jbtnBuyFrameLv5);
     	BuyFramesPanelSub6.add(Labels.FrameLv6Label);
     	BuyFramesPanelSub6.add(jbtnBuyFrameLv6);
     	BuyFramesPanelSub7.add(Labels.FrameLv7Label);
     	BuyFramesPanelSub7.add(jbtnBuyFrameLv7);
     	BuyFramesPanelSub8.add(Labels.FrameLv8Label);
     	BuyFramesPanelSub8.add(jbtnBuyFrameLv8);
     	BuyFramesPanelSub9.add(Labels.FrameLv9Label);
     	BuyFramesPanelSub9.add(jbtnBuyFrameLv9);
     	BuyFramesPanelSub10.add(Labels.FrameLv10Label);
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
     	BuyFramesPanel.add(new JLabel(""));
     	BuyFramesPanel.add(new JLabel(""));
     	BuyFramesPanel.add(new JLabel(""));
     	BuyFramesPanel.add(new JLabel(""));
     	BuyFramesPanel.add(new JLabel(""));
        
     	// Sell Parts Level 1 Panel
     	
     	GridLayout PartsLayout = new GridLayout(3,5);
        JPanel SellPartsLVL1Panel = new JPanel();
        SellPartsLVL1Panel.setLayout(PartsLayout);
        
        JPanel SellPartsLVL1PanelSub = new JPanel();
        SellPartsLVL1PanelSub.setLayout(new BoxLayout(SellPartsLVL1PanelSub, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub2 = new JPanel();
        SellPartsLVL1PanelSub2.setLayout(new BoxLayout(SellPartsLVL1PanelSub2, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub3 = new JPanel();
        SellPartsLVL1PanelSub3.setLayout(new BoxLayout(SellPartsLVL1PanelSub3, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub4 = new JPanel();
        SellPartsLVL1PanelSub4.setLayout(new BoxLayout(SellPartsLVL1PanelSub4, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub5 = new JPanel();
        SellPartsLVL1PanelSub5.setLayout(new BoxLayout(SellPartsLVL1PanelSub5, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub6 = new JPanel();
        SellPartsLVL1PanelSub6.setLayout(new BoxLayout(SellPartsLVL1PanelSub6, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub7 = new JPanel();
        SellPartsLVL1PanelSub7.setLayout(new BoxLayout(SellPartsLVL1PanelSub7, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub8 = new JPanel();
        SellPartsLVL1PanelSub8.setLayout(new BoxLayout(SellPartsLVL1PanelSub8, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub9 = new JPanel();
        SellPartsLVL1PanelSub9.setLayout(new BoxLayout(SellPartsLVL1PanelSub9, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub10 = new JPanel();
        SellPartsLVL1PanelSub10.setLayout(new BoxLayout(SellPartsLVL1PanelSub10, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub11 = new JPanel();
        SellPartsLVL1PanelSub11.setLayout(new BoxLayout(SellPartsLVL1PanelSub11, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub12 = new JPanel();
        SellPartsLVL1PanelSub12.setLayout(new BoxLayout(SellPartsLVL1PanelSub12, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
        
        JPanel SellPartsLVL1PanelSub13 = new JPanel();
        SellPartsLVL1PanelSub13.setLayout(new BoxLayout(SellPartsLVL1PanelSub13, BoxLayout.PAGE_AXIS));
        SellPartsLVL1PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
            	               
        SellPartsLVL1PanelSub.add(Labels.AccessoriesLVL1Label);
        SellPartsLVL1PanelSub.add(jbtnSellAccessoriesLv1);
        SellPartsLVL1PanelSub2.add(Labels.BodyLVL1Label);
        SellPartsLVL1PanelSub2.add(jbtnSellBodyLv1);
        SellPartsLVL1PanelSub3.add(Labels.BrakesLVL1Label);
        SellPartsLVL1PanelSub3.add(jbtnSellBrakesLv1);
        SellPartsLVL1PanelSub4.add(Labels.CoolingLVL1Label);
        SellPartsLVL1PanelSub4.add(jbtnSellCoolingLv1);
        SellPartsLVL1PanelSub5.add(Labels.ElectronicsLVL1Label);
        SellPartsLVL1PanelSub5.add(jbtnSellElectronicsLv1);
        SellPartsLVL1PanelSub6.add(Labels.EngineLVL1Label);
        SellPartsLVL1PanelSub6.add(jbtnSellEngineLv1);
        SellPartsLVL1PanelSub7.add(Labels.ExaustLVL1Label);
        SellPartsLVL1PanelSub7.add(jbtnSellExaustLv1);
        SellPartsLVL1PanelSub8.add(Labels.FuelLVL1Label);
        SellPartsLVL1PanelSub8.add(jbtnSellFuelLv1);
        SellPartsLVL1PanelSub9.add(Labels.InteriorLVL1Label);
        SellPartsLVL1PanelSub9.add(jbtnSellInteriorLv1);
        SellPartsLVL1PanelSub10.add(Labels.SteeringLVL1Label);
        SellPartsLVL1PanelSub10.add(jbtnSellSteeringLv1);
        SellPartsLVL1PanelSub11.add(Labels.SuspensionLVL1Label);
        SellPartsLVL1PanelSub11.add(jbtnSellSuspensionLv1);
        SellPartsLVL1PanelSub12.add(Labels.TransmissionLVL1Label);
        SellPartsLVL1PanelSub12.add(jbtnSellTransmissionLv1);
        SellPartsLVL1PanelSub13.add(Labels.TiresLVL1Label);
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
        SellPartsLVL1Panel.add(new JLabel(""));
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub11);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub12);
        SellPartsLVL1Panel.add(SellPartsLVL1PanelSub13);

        // Sell Parts Level 2 Panel
        
   	 	JPanel SellPartsLVL2Panel = new JPanel();
   	 	SellPartsLVL2Panel.setLayout(PartsLayout);
   	 	
   	 	JPanel SellPartsLVL2PanelSub = new JPanel();
   	 	SellPartsLVL2PanelSub.setLayout(new BoxLayout(SellPartsLVL2PanelSub, BoxLayout.PAGE_AXIS));
   	 	SellPartsLVL2PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	JPanel SellPartsLVL2PanelSub2 = new JPanel();
	 	SellPartsLVL2PanelSub2.setLayout(new BoxLayout(SellPartsLVL2PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub3 = new JPanel();
	 	SellPartsLVL2PanelSub3.setLayout(new BoxLayout(SellPartsLVL2PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub4 = new JPanel();
	 	SellPartsLVL2PanelSub4.setLayout(new BoxLayout(SellPartsLVL2PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub5 = new JPanel();
	 	SellPartsLVL2PanelSub5.setLayout(new BoxLayout(SellPartsLVL2PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub6 = new JPanel();
	 	SellPartsLVL2PanelSub6.setLayout(new BoxLayout(SellPartsLVL2PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub7 = new JPanel();
	 	SellPartsLVL2PanelSub7.setLayout(new BoxLayout(SellPartsLVL2PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub8 = new JPanel();
	 	SellPartsLVL2PanelSub8.setLayout(new BoxLayout(SellPartsLVL2PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub9 = new JPanel();
	 	SellPartsLVL2PanelSub9.setLayout(new BoxLayout(SellPartsLVL2PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub10 = new JPanel();
	 	SellPartsLVL2PanelSub10.setLayout(new BoxLayout(SellPartsLVL2PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub11 = new JPanel();
	 	SellPartsLVL2PanelSub11.setLayout(new BoxLayout(SellPartsLVL2PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub12 = new JPanel();
	 	SellPartsLVL2PanelSub12.setLayout(new BoxLayout(SellPartsLVL2PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL2PanelSub13 = new JPanel();
	 	SellPartsLVL2PanelSub13.setLayout(new BoxLayout(SellPartsLVL2PanelSub13, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL2PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
               
        SellPartsLVL2PanelSub.add(Labels.AccessoriesLVL2Label);
        SellPartsLVL2PanelSub.add(jbtnSellAccessoriesLv2);
        SellPartsLVL2PanelSub2.add(Labels.BodyLVL2Label);
        SellPartsLVL2PanelSub2.add(jbtnSellBodyLv2);
        SellPartsLVL2PanelSub3.add(Labels.BrakesLVL2Label);
        SellPartsLVL2PanelSub3.add(jbtnSellBrakesLv2);
        SellPartsLVL2PanelSub4.add(Labels.CoolingLVL2Label);
        SellPartsLVL2PanelSub4.add(jbtnSellCoolingLv2);
        SellPartsLVL2PanelSub5.add(Labels.ElectronicsLVL2Label);
        SellPartsLVL2PanelSub5.add(jbtnSellElectronicsLv2);
        SellPartsLVL2PanelSub6.add(Labels.EngineLVL2Label);
        SellPartsLVL2PanelSub6.add(jbtnSellEngineLv2);
        SellPartsLVL2PanelSub7.add(Labels.ExaustLVL2Label);
        SellPartsLVL2PanelSub7.add(jbtnSellExaustLv2);
        SellPartsLVL2PanelSub8.add(Labels.FuelLVL2Label);
        SellPartsLVL2PanelSub8.add(jbtnSellFuelLv2);
        SellPartsLVL2PanelSub9.add(Labels.InteriorLVL2Label);
        SellPartsLVL2PanelSub9.add(jbtnSellInteriorLv2);
        SellPartsLVL2PanelSub10.add(Labels.SteeringLVL2Label);
        SellPartsLVL2PanelSub10.add(jbtnSellSteeringLv2);
        SellPartsLVL2PanelSub11.add(Labels.SuspensionLVL2Label);
        SellPartsLVL2PanelSub11.add(jbtnSellSuspensionLv2);
        SellPartsLVL2PanelSub12.add(Labels.TransmissionLVL2Label);
        SellPartsLVL2PanelSub12.add(jbtnSellTransmissionLv2);
        SellPartsLVL2PanelSub13.add(Labels.TiresLVL2Label);
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
        SellPartsLVL2Panel.add(new JLabel(""));
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub11);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub12);
        SellPartsLVL2Panel.add(SellPartsLVL2PanelSub13);
   	 
        // Sell Parts Level 3 Panel
        
   	 	JPanel SellPartsLVL3Panel = new JPanel();
   	 	SellPartsLVL3Panel.setLayout(PartsLayout);
   	 	
   	 	JPanel SellPartsLVL3PanelSub = new JPanel();
	 	SellPartsLVL3PanelSub.setLayout(new BoxLayout(SellPartsLVL3PanelSub, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub2 = new JPanel();
	 	SellPartsLVL3PanelSub2.setLayout(new BoxLayout(SellPartsLVL3PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub3 = new JPanel();
	 	SellPartsLVL3PanelSub3.setLayout(new BoxLayout(SellPartsLVL3PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub4 = new JPanel();
	 	SellPartsLVL3PanelSub4.setLayout(new BoxLayout(SellPartsLVL3PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub5 = new JPanel();
	 	SellPartsLVL3PanelSub5.setLayout(new BoxLayout(SellPartsLVL3PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub6 = new JPanel();
	 	SellPartsLVL3PanelSub6.setLayout(new BoxLayout(SellPartsLVL3PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub7 = new JPanel();
	 	SellPartsLVL3PanelSub7.setLayout(new BoxLayout(SellPartsLVL3PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub8 = new JPanel();
	 	SellPartsLVL3PanelSub8.setLayout(new BoxLayout(SellPartsLVL3PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub9 = new JPanel();
	 	SellPartsLVL3PanelSub9.setLayout(new BoxLayout(SellPartsLVL3PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub10 = new JPanel();
	 	SellPartsLVL3PanelSub10.setLayout(new BoxLayout(SellPartsLVL3PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub11 = new JPanel();
	 	SellPartsLVL3PanelSub11.setLayout(new BoxLayout(SellPartsLVL3PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub12 = new JPanel();
	 	SellPartsLVL3PanelSub12.setLayout(new BoxLayout(SellPartsLVL3PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL3PanelSub13 = new JPanel();
	 	SellPartsLVL3PanelSub13.setLayout(new BoxLayout(SellPartsLVL3PanelSub13, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL3PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	    	                
        SellPartsLVL3PanelSub.add(Labels.AccessoriesLVL3Label);
        SellPartsLVL3PanelSub.add(jbtnSellAccessoriesLv3);
        SellPartsLVL3PanelSub2.add(Labels.BodyLVL3Label);
        SellPartsLVL3PanelSub2.add(jbtnSellBodyLv3);
        SellPartsLVL3PanelSub3.add(Labels.BrakesLVL3Label);
        SellPartsLVL3PanelSub3.add(jbtnSellBrakesLv3);
        SellPartsLVL3PanelSub4.add(Labels.CoolingLVL3Label);
        SellPartsLVL3PanelSub4.add(jbtnSellCoolingLv3);
        SellPartsLVL3PanelSub5.add(Labels.ElectronicsLVL3Label);
        SellPartsLVL3PanelSub5.add(jbtnSellElectronicsLv3);
        SellPartsLVL3PanelSub6.add(Labels.EngineLVL3Label);
        SellPartsLVL3PanelSub6.add(jbtnSellEngineLv3);
        SellPartsLVL3PanelSub7.add(Labels.ExaustLVL3Label);
        SellPartsLVL3PanelSub7.add(jbtnSellExaustLv3);
        SellPartsLVL3PanelSub8.add(Labels.FuelLVL3Label);
        SellPartsLVL3PanelSub8.add(jbtnSellFuelLv3);
        SellPartsLVL3PanelSub9.add(Labels.InteriorLVL3Label);
        SellPartsLVL3PanelSub9.add(jbtnSellInteriorLv3);
        SellPartsLVL3PanelSub10.add(Labels.SteeringLVL3Label);
        SellPartsLVL3PanelSub10.add(jbtnSellSteeringLv3);
        SellPartsLVL3PanelSub11.add(Labels.SuspensionLVL3Label);
        SellPartsLVL3PanelSub11.add(jbtnSellSuspensionLv3);
        SellPartsLVL3PanelSub12.add(Labels.TransmissionLVL3Label);
        SellPartsLVL3PanelSub12.add(jbtnSellTransmissionLv3);
        SellPartsLVL3PanelSub13.add(Labels.TiresLVL3Label);
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
        SellPartsLVL3Panel.add(new JLabel(""));
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub11);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub12);
        SellPartsLVL3Panel.add(SellPartsLVL3PanelSub13);
   	 	
        // Sell Parts Level 4 Panel
        
   	 	JPanel SellPartsLVL4Panel = new JPanel();
   	 	SellPartsLVL4Panel.setLayout(PartsLayout);
   	 	
   	 	JPanel SellPartsLVL4PanelSub = new JPanel();
	 	SellPartsLVL4PanelSub.setLayout(new BoxLayout(SellPartsLVL4PanelSub, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub2 = new JPanel();
	 	SellPartsLVL4PanelSub2.setLayout(new BoxLayout(SellPartsLVL4PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub3 = new JPanel();
	 	SellPartsLVL4PanelSub3.setLayout(new BoxLayout(SellPartsLVL4PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub4 = new JPanel();
	 	SellPartsLVL4PanelSub4.setLayout(new BoxLayout(SellPartsLVL4PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub5 = new JPanel();
	 	SellPartsLVL4PanelSub5.setLayout(new BoxLayout(SellPartsLVL4PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub6 = new JPanel();
	 	SellPartsLVL4PanelSub6.setLayout(new BoxLayout(SellPartsLVL4PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub7 = new JPanel();
	 	SellPartsLVL4PanelSub7.setLayout(new BoxLayout(SellPartsLVL4PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub8 = new JPanel();
	 	SellPartsLVL4PanelSub8.setLayout(new BoxLayout(SellPartsLVL4PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub9 = new JPanel();
	 	SellPartsLVL4PanelSub9.setLayout(new BoxLayout(SellPartsLVL4PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub10 = new JPanel();
	 	SellPartsLVL4PanelSub10.setLayout(new BoxLayout(SellPartsLVL4PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub11 = new JPanel();
	 	SellPartsLVL4PanelSub11.setLayout(new BoxLayout(SellPartsLVL4PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub12 = new JPanel();
	 	SellPartsLVL4PanelSub12.setLayout(new BoxLayout(SellPartsLVL4PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL4PanelSub13 = new JPanel();
	 	SellPartsLVL4PanelSub13.setLayout(new BoxLayout(SellPartsLVL4PanelSub13, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL4PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	    	
        SellPartsLVL4PanelSub.add(Labels.AccessoriesLVL4Label);
        SellPartsLVL4PanelSub.add(jbtnSellAccessoriesLv4);
        SellPartsLVL4PanelSub2.add(Labels.BodyLVL4Label);
        SellPartsLVL4PanelSub2.add(jbtnSellBodyLv4);
        SellPartsLVL4PanelSub3.add(Labels.BrakesLVL4Label);
        SellPartsLVL4PanelSub3.add(jbtnSellBrakesLv4);
        SellPartsLVL4PanelSub4.add(Labels.CoolingLVL4Label);
        SellPartsLVL4PanelSub4.add(jbtnSellCoolingLv4);
        SellPartsLVL4PanelSub5.add(Labels.ElectronicsLVL4Label);
        SellPartsLVL4PanelSub5.add(jbtnSellElectronicsLv4);
        SellPartsLVL4PanelSub6.add(Labels.EngineLVL4Label);
        SellPartsLVL4PanelSub6.add(jbtnSellEngineLv4);
        SellPartsLVL4PanelSub7.add(Labels.ExaustLVL4Label);
        SellPartsLVL4PanelSub7.add(jbtnSellExaustLv4);
        SellPartsLVL4PanelSub8.add(Labels.FuelLVL4Label);
        SellPartsLVL4PanelSub8.add(jbtnSellFuelLv4);
        SellPartsLVL4PanelSub9.add(Labels.InteriorLVL4Label);
        SellPartsLVL4PanelSub9.add(jbtnSellInteriorLv4);
        SellPartsLVL4PanelSub10.add(Labels.SteeringLVL4Label);
        SellPartsLVL4PanelSub10.add(jbtnSellSteeringLv4);
        SellPartsLVL4PanelSub11.add(Labels.SuspensionLVL4Label);
        SellPartsLVL4PanelSub11.add(jbtnSellSuspensionLv4);
        SellPartsLVL4PanelSub12.add(Labels.TransmissionLVL4Label);
        SellPartsLVL4PanelSub12.add(jbtnSellTransmissionLv4);
        SellPartsLVL4PanelSub13.add(Labels.TiresLVL4Label);
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
        SellPartsLVL4Panel.add(new JLabel(""));
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub11);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub12);
        SellPartsLVL4Panel.add(SellPartsLVL4PanelSub13);
   	 	
        // Sell Parts Level 5 Panel
        
   	 	JPanel SellPartsLVL5Panel = new JPanel();
   	 	SellPartsLVL5Panel.setLayout(PartsLayout);
   	 	
   	 	JPanel SellPartsLVL5PanelSub = new JPanel();
	 	SellPartsLVL5PanelSub.setLayout(new BoxLayout(SellPartsLVL5PanelSub, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub2 = new JPanel();
	 	SellPartsLVL5PanelSub2.setLayout(new BoxLayout(SellPartsLVL5PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub3 = new JPanel();
	 	SellPartsLVL5PanelSub3.setLayout(new BoxLayout(SellPartsLVL5PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub4 = new JPanel();
	 	SellPartsLVL5PanelSub4.setLayout(new BoxLayout(SellPartsLVL5PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub5 = new JPanel();
	 	SellPartsLVL5PanelSub5.setLayout(new BoxLayout(SellPartsLVL5PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub6 = new JPanel();
	 	SellPartsLVL5PanelSub6.setLayout(new BoxLayout(SellPartsLVL5PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub7 = new JPanel();
	 	SellPartsLVL5PanelSub7.setLayout(new BoxLayout(SellPartsLVL5PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub8 = new JPanel();
	 	SellPartsLVL5PanelSub8.setLayout(new BoxLayout(SellPartsLVL5PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub9 = new JPanel();
	 	SellPartsLVL5PanelSub9.setLayout(new BoxLayout(SellPartsLVL5PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub10 = new JPanel();
	 	SellPartsLVL5PanelSub10.setLayout(new BoxLayout(SellPartsLVL5PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub11 = new JPanel();
	 	SellPartsLVL5PanelSub11.setLayout(new BoxLayout(SellPartsLVL5PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub12 = new JPanel();
	 	SellPartsLVL5PanelSub12.setLayout(new BoxLayout(SellPartsLVL5PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL5PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL5PanelSub13 = new JPanel();
	 	SellPartsLVL5PanelSub13.setLayout(new BoxLayout(SellPartsLVL5PanelSub13, BoxLayout.PAGE_AXIS));  
	 	SellPartsLVL5PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
               
        SellPartsLVL5PanelSub.add(Labels.AccessoriesLVL5Label);
        SellPartsLVL5PanelSub.add(jbtnSellAccessoriesLv5);
        SellPartsLVL5PanelSub2.add(Labels.BodyLVL5Label);
        SellPartsLVL5PanelSub2.add(jbtnSellBodyLv5);
        SellPartsLVL5PanelSub3.add(Labels.BrakesLVL5Label);
        SellPartsLVL5PanelSub3.add(jbtnSellBrakesLv5);
        SellPartsLVL5PanelSub4.add(Labels.CoolingLVL5Label);
        SellPartsLVL5PanelSub4.add(jbtnSellCoolingLv5);
        SellPartsLVL5PanelSub5.add(Labels.ElectronicsLVL5Label);
        SellPartsLVL5PanelSub5.add(jbtnSellElectronicsLv5);
        SellPartsLVL5PanelSub6.add(Labels.EngineLVL5Label);
        SellPartsLVL5PanelSub6.add(jbtnSellEngineLv5);
        SellPartsLVL5PanelSub7.add(Labels.ExaustLVL5Label);
        SellPartsLVL5PanelSub7.add(jbtnSellExaustLv5);
        SellPartsLVL5PanelSub8.add(Labels.FuelLVL5Label);
        SellPartsLVL5PanelSub8.add(jbtnSellFuelLv5);
        SellPartsLVL5PanelSub9.add(Labels.InteriorLVL5Label);
        SellPartsLVL5PanelSub9.add(jbtnSellInteriorLv5);
        SellPartsLVL5PanelSub10.add(Labels.SteeringLVL5Label);
        SellPartsLVL5PanelSub10.add(jbtnSellSteeringLv5);
        SellPartsLVL5PanelSub11.add(Labels.SuspensionLVL5Label);
        SellPartsLVL5PanelSub11.add(jbtnSellSuspensionLv5);
        SellPartsLVL5PanelSub12.add(Labels.TransmissionLVL5Label);
        SellPartsLVL5PanelSub12.add(jbtnSellTransmissionLv5);
        SellPartsLVL5PanelSub13.add(Labels.TiresLVL5Label);
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
        SellPartsLVL5Panel.add(new JLabel(""));
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub11);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub12);
        SellPartsLVL5Panel.add(SellPartsLVL5PanelSub13);
   	 	
        // Sell Parts Level 6 Panel
        
   	 	JPanel SellPartsLVL6Panel = new JPanel();
   	 	SellPartsLVL6Panel.setLayout(PartsLayout);
   	 	
   	 	JPanel SellPartsLVL6PanelSub = new JPanel();
	 	SellPartsLVL6PanelSub.setLayout(new BoxLayout(SellPartsLVL6PanelSub, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub2 = new JPanel();
	 	SellPartsLVL6PanelSub2.setLayout(new BoxLayout(SellPartsLVL6PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub3 = new JPanel();
	 	SellPartsLVL6PanelSub3.setLayout(new BoxLayout(SellPartsLVL6PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub4 = new JPanel();
	 	SellPartsLVL6PanelSub4.setLayout(new BoxLayout(SellPartsLVL6PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub5 = new JPanel();
	 	SellPartsLVL6PanelSub5.setLayout(new BoxLayout(SellPartsLVL6PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub6 = new JPanel();
	 	SellPartsLVL6PanelSub6.setLayout(new BoxLayout(SellPartsLVL6PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub7 = new JPanel();
	 	SellPartsLVL6PanelSub7.setLayout(new BoxLayout(SellPartsLVL6PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub8 = new JPanel();
	 	SellPartsLVL6PanelSub8.setLayout(new BoxLayout(SellPartsLVL6PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub9 = new JPanel();
	 	SellPartsLVL6PanelSub9.setLayout(new BoxLayout(SellPartsLVL6PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub10 = new JPanel();
	 	SellPartsLVL6PanelSub10.setLayout(new BoxLayout(SellPartsLVL6PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub11 = new JPanel();
	 	SellPartsLVL6PanelSub11.setLayout(new BoxLayout(SellPartsLVL6PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub12 = new JPanel();
	 	SellPartsLVL6PanelSub12.setLayout(new BoxLayout(SellPartsLVL6PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL6PanelSub13 = new JPanel();
	 	SellPartsLVL6PanelSub13.setLayout(new BoxLayout(SellPartsLVL6PanelSub13, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL6PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	    	                     
        SellPartsLVL6PanelSub.add(Labels.AccessoriesLVL6Label);
        SellPartsLVL6PanelSub.add(jbtnSellAccessoriesLv6);
        SellPartsLVL6PanelSub2.add(Labels.BodyLVL6Label);
        SellPartsLVL6PanelSub2.add(jbtnSellBodyLv6);
        SellPartsLVL6PanelSub3.add(Labels.BrakesLVL6Label);
        SellPartsLVL6PanelSub3.add(jbtnSellBrakesLv6);
        SellPartsLVL6PanelSub4.add(Labels.CoolingLVL6Label);
        SellPartsLVL6PanelSub4.add(jbtnSellCoolingLv6);
        SellPartsLVL6PanelSub5.add(Labels.ElectronicsLVL6Label);
        SellPartsLVL6PanelSub5.add(jbtnSellElectronicsLv6);
        SellPartsLVL6PanelSub6.add(Labels.EngineLVL6Label);
        SellPartsLVL6PanelSub6.add(jbtnSellEngineLv6);
        SellPartsLVL6PanelSub7.add(Labels.ExaustLVL6Label);
        SellPartsLVL6PanelSub7.add(jbtnSellExaustLv6);
        SellPartsLVL6PanelSub8.add(Labels.FuelLVL6Label);
        SellPartsLVL6PanelSub8.add(jbtnSellFuelLv6);
        SellPartsLVL6PanelSub9.add(Labels.InteriorLVL6Label);
        SellPartsLVL6PanelSub9.add(jbtnSellInteriorLv6);
        SellPartsLVL6PanelSub10.add(Labels.SteeringLVL6Label);
        SellPartsLVL6PanelSub10.add(jbtnSellSteeringLv6);
        SellPartsLVL6PanelSub11.add(Labels.SuspensionLVL6Label);
        SellPartsLVL6PanelSub11.add(jbtnSellSuspensionLv6);
        SellPartsLVL6PanelSub12.add(Labels.TransmissionLVL6Label);
        SellPartsLVL6PanelSub12.add(jbtnSellTransmissionLv6);
        SellPartsLVL6PanelSub13.add(Labels.TiresLVL6Label);
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
        SellPartsLVL6Panel.add(new JLabel(""));
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub11);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub12);
        SellPartsLVL6Panel.add(SellPartsLVL6PanelSub13);
   	 	
        // Sell Parts Level 7 Panel
        
   	 	JPanel SellPartsLVL7Panel = new JPanel();
   	 	SellPartsLVL7Panel.setLayout(PartsLayout);
   	 	
   	 	JPanel SellPartsLVL7PanelSub = new JPanel();
	 	SellPartsLVL7PanelSub.setLayout(new BoxLayout(SellPartsLVL7PanelSub, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub2 = new JPanel();
	 	SellPartsLVL7PanelSub2.setLayout(new BoxLayout(SellPartsLVL7PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub3 = new JPanel();
	 	SellPartsLVL7PanelSub3.setLayout(new BoxLayout(SellPartsLVL7PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub4 = new JPanel();
	 	SellPartsLVL7PanelSub4.setLayout(new BoxLayout(SellPartsLVL7PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub5 = new JPanel();
	 	SellPartsLVL7PanelSub5.setLayout(new BoxLayout(SellPartsLVL7PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub6 = new JPanel();
	 	SellPartsLVL7PanelSub6.setLayout(new BoxLayout(SellPartsLVL7PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub7 = new JPanel();
	 	SellPartsLVL7PanelSub7.setLayout(new BoxLayout(SellPartsLVL7PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub8 = new JPanel();
	 	SellPartsLVL7PanelSub8.setLayout(new BoxLayout(SellPartsLVL7PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub9 = new JPanel();
	 	SellPartsLVL7PanelSub9.setLayout(new BoxLayout(SellPartsLVL7PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub10 = new JPanel();
	 	SellPartsLVL7PanelSub10.setLayout(new BoxLayout(SellPartsLVL7PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub11 = new JPanel();
	 	SellPartsLVL7PanelSub11.setLayout(new BoxLayout(SellPartsLVL7PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub12 = new JPanel();
	 	SellPartsLVL7PanelSub12.setLayout(new BoxLayout(SellPartsLVL7PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL7PanelSub13 = new JPanel();
	 	SellPartsLVL7PanelSub13.setLayout(new BoxLayout(SellPartsLVL7PanelSub13, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL7PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
              
        SellPartsLVL7PanelSub.add(Labels.AccessoriesLVL7Label);
        SellPartsLVL7PanelSub.add(jbtnSellAccessoriesLv7);
        SellPartsLVL7PanelSub2.add(Labels.BodyLVL7Label);
        SellPartsLVL7PanelSub2.add(jbtnSellBodyLv7);
        SellPartsLVL7PanelSub3.add(Labels.BrakesLVL7Label);
        SellPartsLVL7PanelSub3.add(jbtnSellBrakesLv7);
        SellPartsLVL7PanelSub4.add(Labels.CoolingLVL7Label);
        SellPartsLVL7PanelSub4.add(jbtnSellCoolingLv7);
        SellPartsLVL7PanelSub5.add(Labels.ElectronicsLVL7Label);
        SellPartsLVL7PanelSub5.add(jbtnSellElectronicsLv7);
        SellPartsLVL7PanelSub6.add(Labels.EngineLVL7Label);
        SellPartsLVL7PanelSub6.add(jbtnSellEngineLv7);
        SellPartsLVL7PanelSub7.add(Labels.ExaustLVL7Label);
        SellPartsLVL7PanelSub7.add(jbtnSellExaustLv7);
        SellPartsLVL7PanelSub8.add(Labels.FuelLVL7Label);
        SellPartsLVL7PanelSub8.add(jbtnSellFuelLv7);
        SellPartsLVL7PanelSub9.add(Labels.InteriorLVL7Label);
        SellPartsLVL7PanelSub9.add(jbtnSellInteriorLv7);
        SellPartsLVL7PanelSub10.add(Labels.SteeringLVL7Label);
        SellPartsLVL7PanelSub10.add(jbtnSellSteeringLv7);
        SellPartsLVL7PanelSub11.add(Labels.SuspensionLVL7Label);
        SellPartsLVL7PanelSub11.add(jbtnSellSuspensionLv7);
        SellPartsLVL7PanelSub12.add(Labels.TransmissionLVL7Label);
        SellPartsLVL7PanelSub12.add(jbtnSellTransmissionLv7);
        SellPartsLVL7PanelSub13.add(Labels.TiresLVL7Label);
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
        SellPartsLVL7Panel.add(new JLabel(""));
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub11);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub12);
        SellPartsLVL7Panel.add(SellPartsLVL7PanelSub13);
   	 	
        // Sell Parts Level 8 Panel
        
   	 	JPanel SellPartsLVL8Panel = new JPanel();
   	 	SellPartsLVL8Panel.setLayout(PartsLayout);
   	 	
   	 	JPanel SellPartsLVL8PanelSub = new JPanel();
	 	SellPartsLVL8PanelSub.setLayout(new BoxLayout(SellPartsLVL8PanelSub, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub2 = new JPanel();
	 	SellPartsLVL8PanelSub2.setLayout(new BoxLayout(SellPartsLVL8PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub3 = new JPanel();
	 	SellPartsLVL8PanelSub3.setLayout(new BoxLayout(SellPartsLVL8PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub4 = new JPanel();
	 	SellPartsLVL8PanelSub4.setLayout(new BoxLayout(SellPartsLVL8PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub5 = new JPanel();
	 	SellPartsLVL8PanelSub5.setLayout(new BoxLayout(SellPartsLVL8PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub6 = new JPanel();
	 	SellPartsLVL8PanelSub6.setLayout(new BoxLayout(SellPartsLVL8PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub7 = new JPanel();
	 	SellPartsLVL8PanelSub7.setLayout(new BoxLayout(SellPartsLVL8PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub8 = new JPanel();
	 	SellPartsLVL8PanelSub8.setLayout(new BoxLayout(SellPartsLVL8PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub9 = new JPanel();
	 	SellPartsLVL8PanelSub9.setLayout(new BoxLayout(SellPartsLVL8PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub10 = new JPanel();
	 	SellPartsLVL8PanelSub10.setLayout(new BoxLayout(SellPartsLVL8PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub11 = new JPanel();
	 	SellPartsLVL8PanelSub11.setLayout(new BoxLayout(SellPartsLVL8PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub12 = new JPanel();
	 	SellPartsLVL8PanelSub12.setLayout(new BoxLayout(SellPartsLVL8PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL8PanelSub13 = new JPanel();
	 	SellPartsLVL8PanelSub13.setLayout(new BoxLayout(SellPartsLVL8PanelSub13, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL8PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));

        SellPartsLVL8PanelSub.add(Labels.AccessoriesLVL8Label);
        SellPartsLVL8PanelSub.add(jbtnSellAccessoriesLv8);
        SellPartsLVL8PanelSub2.add(Labels.BodyLVL8Label);
        SellPartsLVL8PanelSub2.add(jbtnSellBodyLv8);
        SellPartsLVL8PanelSub3.add(Labels.BrakesLVL8Label);
        SellPartsLVL8PanelSub3.add(jbtnSellBrakesLv8);
        SellPartsLVL8PanelSub4.add(Labels.CoolingLVL8Label);
        SellPartsLVL8PanelSub4.add(jbtnSellCoolingLv8);
        SellPartsLVL8PanelSub5.add(Labels.ElectronicsLVL8Label);
        SellPartsLVL8PanelSub5.add(jbtnSellElectronicsLv8);
        SellPartsLVL8PanelSub6.add(Labels.EngineLVL8Label);
        SellPartsLVL8PanelSub6.add(jbtnSellEngineLv8);
        SellPartsLVL8PanelSub7.add(Labels.ExaustLVL8Label);
        SellPartsLVL8PanelSub7.add(jbtnSellExaustLv8);
        SellPartsLVL8PanelSub8.add(Labels.FuelLVL8Label);
        SellPartsLVL8PanelSub8.add(jbtnSellFuelLv8);
        SellPartsLVL8PanelSub9.add(Labels.InteriorLVL8Label);
        SellPartsLVL8PanelSub9.add(jbtnSellInteriorLv8);
        SellPartsLVL8PanelSub10.add(Labels.SteeringLVL8Label);
        SellPartsLVL8PanelSub10.add(jbtnSellSteeringLv8);
        SellPartsLVL8PanelSub11.add(Labels.SuspensionLVL8Label);
        SellPartsLVL8PanelSub11.add(jbtnSellSuspensionLv8);
        SellPartsLVL8PanelSub12.add(Labels.TransmissionLVL8Label);
        SellPartsLVL8PanelSub12.add(jbtnSellTransmissionLv8);
        SellPartsLVL8PanelSub13.add(Labels.TiresLVL8Label);
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
        SellPartsLVL8Panel.add(new JLabel(""));
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub11);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub12);
        SellPartsLVL8Panel.add(SellPartsLVL8PanelSub13);
   	 	
        // Sell Parts Level 9 Panel
        
   	 	JPanel SellPartsLVL9Panel = new JPanel();
   	 	SellPartsLVL9Panel.setLayout(PartsLayout);
   	 	
   	 	JPanel SellPartsLVL9PanelSub = new JPanel();
	 	SellPartsLVL9PanelSub.setLayout(new BoxLayout(SellPartsLVL9PanelSub, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub2 = new JPanel();
	 	SellPartsLVL9PanelSub2.setLayout(new BoxLayout(SellPartsLVL9PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub3 = new JPanel();
	 	SellPartsLVL9PanelSub3.setLayout(new BoxLayout(SellPartsLVL9PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub4 = new JPanel();
	 	SellPartsLVL9PanelSub4.setLayout(new BoxLayout(SellPartsLVL9PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub5 = new JPanel();
	 	SellPartsLVL9PanelSub5.setLayout(new BoxLayout(SellPartsLVL9PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub6 = new JPanel();
	 	SellPartsLVL9PanelSub6.setLayout(new BoxLayout(SellPartsLVL9PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub7 = new JPanel();
	 	SellPartsLVL9PanelSub7.setLayout(new BoxLayout(SellPartsLVL9PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub8 = new JPanel();
	 	SellPartsLVL9PanelSub8.setLayout(new BoxLayout(SellPartsLVL9PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub9 = new JPanel();
	 	SellPartsLVL9PanelSub9.setLayout(new BoxLayout(SellPartsLVL9PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub10 = new JPanel();
	 	SellPartsLVL9PanelSub10.setLayout(new BoxLayout(SellPartsLVL9PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub11 = new JPanel();
	 	SellPartsLVL9PanelSub11.setLayout(new BoxLayout(SellPartsLVL9PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub12 = new JPanel();
	 	SellPartsLVL9PanelSub12.setLayout(new BoxLayout(SellPartsLVL9PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL9PanelSub13 = new JPanel();
	 	SellPartsLVL9PanelSub13.setLayout(new BoxLayout(SellPartsLVL9PanelSub13, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL9PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
        SellPartsLVL9PanelSub.add(Labels.AccessoriesLVL9Label);
        SellPartsLVL9PanelSub.add(jbtnSellAccessoriesLv9);
        SellPartsLVL9PanelSub2.add(Labels.BodyLVL9Label);
        SellPartsLVL9PanelSub2.add(jbtnSellBodyLv9);
        SellPartsLVL9PanelSub3.add(Labels.BrakesLVL9Label);
        SellPartsLVL9PanelSub3.add(jbtnSellBrakesLv9);
        SellPartsLVL9PanelSub4.add(Labels.CoolingLVL9Label);
        SellPartsLVL9PanelSub4.add(jbtnSellCoolingLv9);
        SellPartsLVL9PanelSub5.add(Labels.ElectronicsLVL9Label);
        SellPartsLVL9PanelSub5.add(jbtnSellElectronicsLv9);
        SellPartsLVL9PanelSub6.add(Labels.EngineLVL9Label);
        SellPartsLVL9PanelSub6.add(jbtnSellEngineLv9);
        SellPartsLVL9PanelSub7.add(Labels.ExaustLVL9Label);
        SellPartsLVL9PanelSub7.add(jbtnSellExaustLv9);
        SellPartsLVL9PanelSub8.add(Labels.FuelLVL9Label);
        SellPartsLVL9PanelSub8.add(jbtnSellFuelLv9);
        SellPartsLVL9PanelSub9.add(Labels.InteriorLVL9Label);
        SellPartsLVL9PanelSub9.add(jbtnSellInteriorLv9);
        SellPartsLVL9PanelSub10.add(Labels.SteeringLVL9Label);
        SellPartsLVL9PanelSub10.add(jbtnSellSteeringLv9);
        SellPartsLVL9PanelSub11.add(Labels.SuspensionLVL9Label);
        SellPartsLVL9PanelSub11.add(jbtnSellSuspensionLv9);
        SellPartsLVL9PanelSub12.add(Labels.TransmissionLVL9Label);
        SellPartsLVL9PanelSub12.add(jbtnSellTransmissionLv9);
        SellPartsLVL9PanelSub13.add(Labels.TiresLVL9Label);
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
        SellPartsLVL9Panel.add(new JLabel(""));
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub11);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub12);
        SellPartsLVL9Panel.add(SellPartsLVL9PanelSub13);
   	 	
        // Sell Parts Level 10 Panel
        
   	 	JPanel SellPartsLVL10Panel = new JPanel();
   	 	SellPartsLVL10Panel.setLayout(PartsLayout);
   	 	
   		JPanel SellPartsLVL10PanelSub = new JPanel();
	 	SellPartsLVL10PanelSub.setLayout(new BoxLayout(SellPartsLVL10PanelSub, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub2 = new JPanel();
	 	SellPartsLVL10PanelSub2.setLayout(new BoxLayout(SellPartsLVL10PanelSub2, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub2.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub3 = new JPanel();
	 	SellPartsLVL10PanelSub3.setLayout(new BoxLayout(SellPartsLVL10PanelSub3, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub3.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub4 = new JPanel();
	 	SellPartsLVL10PanelSub4.setLayout(new BoxLayout(SellPartsLVL10PanelSub4, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub4.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub5 = new JPanel();
	 	SellPartsLVL10PanelSub5.setLayout(new BoxLayout(SellPartsLVL10PanelSub5, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub5.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub6 = new JPanel();
	 	SellPartsLVL10PanelSub6.setLayout(new BoxLayout(SellPartsLVL10PanelSub6, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub6.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub7 = new JPanel();
	 	SellPartsLVL10PanelSub7.setLayout(new BoxLayout(SellPartsLVL10PanelSub7, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub7.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub8 = new JPanel();
	 	SellPartsLVL10PanelSub8.setLayout(new BoxLayout(SellPartsLVL10PanelSub8, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub8.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub9 = new JPanel();
	 	SellPartsLVL10PanelSub9.setLayout(new BoxLayout(SellPartsLVL10PanelSub9, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub9.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub10 = new JPanel();
	 	SellPartsLVL10PanelSub10.setLayout(new BoxLayout(SellPartsLVL10PanelSub10, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub10.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub11 = new JPanel();
	 	SellPartsLVL10PanelSub11.setLayout(new BoxLayout(SellPartsLVL10PanelSub11, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub11.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub12 = new JPanel();
	 	SellPartsLVL10PanelSub12.setLayout(new BoxLayout(SellPartsLVL10PanelSub12, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub12.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	
	 	JPanel SellPartsLVL10PanelSub13 = new JPanel();
	 	SellPartsLVL10PanelSub13.setLayout(new BoxLayout(SellPartsLVL10PanelSub13, BoxLayout.PAGE_AXIS));
	 	SellPartsLVL10PanelSub13.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
       
        SellPartsLVL10PanelSub.add(Labels.AccessoriesLVL10Label);
        SellPartsLVL10PanelSub.add(jbtnSellAccessoriesLv10);
        SellPartsLVL10PanelSub2.add(Labels.BodyLVL10Label);
        SellPartsLVL10PanelSub2.add(jbtnSellBodyLv10);
        SellPartsLVL10PanelSub3.add(Labels.BrakesLVL10Label);
        SellPartsLVL10PanelSub3.add(jbtnSellBrakesLv10);
        SellPartsLVL10PanelSub4.add(Labels.CoolingLVL10Label);
        SellPartsLVL10PanelSub4.add(jbtnSellCoolingLv10);
        SellPartsLVL10PanelSub5.add(Labels.ElectronicsLVL10Label);
        SellPartsLVL10PanelSub5.add(jbtnSellElectronicsLv10);
        SellPartsLVL10PanelSub6.add(Labels.EngineLVL10Label);
        SellPartsLVL10PanelSub6.add(jbtnSellEngineLv10);
        SellPartsLVL10PanelSub7.add(Labels.ExaustLVL10Label);
        SellPartsLVL10PanelSub7.add(jbtnSellExaustLv10);
        SellPartsLVL10PanelSub8.add(Labels.FuelLVL10Label);
        SellPartsLVL10PanelSub8.add(jbtnSellFuelLv10);
        SellPartsLVL10PanelSub9.add(Labels.InteriorLVL10Label);
        SellPartsLVL10PanelSub9.add(jbtnSellInteriorLv10);
        SellPartsLVL10PanelSub10.add(Labels.SteeringLVL10Label);
        SellPartsLVL10PanelSub10.add(jbtnSellSteeringLv10);
        SellPartsLVL10PanelSub11.add(Labels.SuspensionLVL10Label);
        SellPartsLVL10PanelSub11.add(jbtnSellSuspensionLv10);
        SellPartsLVL10PanelSub12.add(Labels.TransmissionLVL10Label);
        SellPartsLVL10PanelSub12.add(jbtnSellTransmissionLv10);
        SellPartsLVL10PanelSub13.add(Labels.TiresLVL10Label);
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
        SellPartsLVL10Panel.add(new JLabel(""));
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub11);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub12);
        SellPartsLVL10Panel.add(SellPartsLVL10PanelSub13);
        
        // Collections
        
   	 	JTabbedPane CollectionsPanel = new JTabbedPane();
   	 	
   	 	GridLayout Car2Layout = new GridLayout(3,5);
   	 	GridLayout Car3Layout = new GridLayout(3,3);
   	 	GridLayout Car4Layout = new GridLayout(3,4);
   	 	GridLayout Car5Layout = new GridLayout(2,3);
   	 	GridLayout Car7Layout = new GridLayout(2,4);
   	 	
   	 	// Collection Acura
   	 	
   	 	JPanel CollectionAcuraPanel = new JPanel();
   	 	CollectionAcuraPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionAcuraPanel.add(new JLabel(""));
   	 	CollectionAcuraPanel.add(new JLabel(""));
   	 	CollectionAcuraPanel.add(new JLabel(""));
   	 	CollectionAcuraPanel.add(new JLabel(""));
   	 	CollectionAcuraPanel.add(Labels.Acura_CSXLabel);
   	 	CollectionAcuraPanel.add(Labels.Acura_ELLabel);
   	 	CollectionAcuraPanel.add(Labels.Acura_MDXLabel);
   	 	CollectionAcuraPanel.add(Labels.Acura_NSXLabel);
   	 	CollectionAcuraPanel.add(new JLabel(""));
   	 	CollectionAcuraPanel.add(new JLabel(""));
   	 	CollectionAcuraPanel.add(new JLabel(""));
   	 	CollectionAcuraPanel.add(new JLabel(""));
   	 	
   	 	Labels.Acura_CSXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Acura_ELLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Acura_MDXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Acura_NSXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Alfa Romeo
   	 	
   	 	JPanel CollectionAlfa_RomeoPanel = new JPanel();
   	 	CollectionAlfa_RomeoPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionAlfa_RomeoPanel.add(new JLabel(""));
   	 	CollectionAlfa_RomeoPanel.add(new JLabel(""));
   	 	CollectionAlfa_RomeoPanel.add(new JLabel(""));
   	 	CollectionAlfa_RomeoPanel.add(new JLabel(""));
   	 	CollectionAlfa_RomeoPanel.add(Labels.Alfa_Romeo_159Label);
   	 	CollectionAlfa_RomeoPanel.add(Labels.Alfa_Romeo_4CLabel);
   	 	CollectionAlfa_RomeoPanel.add(Labels.Alfa_Romeo_8CLabel);
   	 	CollectionAlfa_RomeoPanel.add(Labels.Alfa_Romeo_SpiderLabel);
   	 	CollectionAlfa_RomeoPanel.add(new JLabel(""));
   	 	CollectionAlfa_RomeoPanel.add(new JLabel(""));
   	 	CollectionAlfa_RomeoPanel.add(new JLabel(""));
   	 	CollectionAlfa_RomeoPanel.add(new JLabel(""));
   	 	
   	 	Labels.Alfa_Romeo_159Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Alfa_Romeo_4CLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Alfa_Romeo_8CLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Alfa_Romeo_SpiderLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Aston Martin
   	 	
   	 	JPanel CollectionAston_MartinPanel = new JPanel();
   	 	CollectionAston_MartinPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionAston_MartinPanel.add(new JLabel(""));
   	 	CollectionAston_MartinPanel.add(new JLabel(""));
   	 	CollectionAston_MartinPanel.add(new JLabel(""));
   	 	CollectionAston_MartinPanel.add(new JLabel(""));
   	 	CollectionAston_MartinPanel.add(Labels.Aston_Martin_DB6Label);
   	 	CollectionAston_MartinPanel.add(Labels.Aston_Martin_DB9Label);
   	 	CollectionAston_MartinPanel.add(Labels.Aston_Martin_OneLabel);
   	 	CollectionAston_MartinPanel.add(Labels.Aston_Martin_RapideLabel);
   	 	CollectionAston_MartinPanel.add(new JLabel(""));
   	 	CollectionAston_MartinPanel.add(new JLabel(""));
   	 	CollectionAston_MartinPanel.add(new JLabel(""));
   	 	CollectionAston_MartinPanel.add(new JLabel(""));
   	
   	 	Labels.Aston_Martin_DB6Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Aston_Martin_DB9Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Aston_Martin_OneLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Aston_Martin_RapideLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Audi
   	 	
   	 	JPanel CollectionAudiPanel = new JPanel();
   	 	CollectionAudiPanel.setLayout(Car7Layout);
   	 	
   	 	CollectionAudiPanel.add(Labels.Audi_100Label);
   	 	CollectionAudiPanel.add(Labels.Audi_80Label);
   	 	CollectionAudiPanel.add(Labels.Audi_A4Label);
   	 	CollectionAudiPanel.add(Labels.Audi_CoupeLabel);
   	 	CollectionAudiPanel.add(Labels.Audi_Q7Label);
   	 	CollectionAudiPanel.add(Labels.Audi_R8Label);
   	 	CollectionAudiPanel.add(Labels.Audi_RS6Label);
   	 	
   	 	Labels.Audi_100Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Audi_80Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Audi_A4Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Audi_CoupeLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Audi_Q7Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Audi_R8Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Audi_RS6Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Bentley
   	 	
   	 	JPanel CollectionBentleyPanel = new JPanel();
   	 	CollectionBentleyPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionBentleyPanel.add(new JLabel(""));
   	 	CollectionBentleyPanel.add(new JLabel(""));
   	 	CollectionBentleyPanel.add(new JLabel(""));
   	 	CollectionBentleyPanel.add(new JLabel(""));
   	 	CollectionBentleyPanel.add(Labels.Bentley_ArnageLabel);
   	 	CollectionBentleyPanel.add(Labels.Bentley_AzureLabel);
   	 	CollectionBentleyPanel.add(Labels.Bentley_ContinentalLabel);
   	 	CollectionBentleyPanel.add(Labels.Bentley_GTZLabel);
   	 	CollectionBentleyPanel.add(new JLabel(""));
   	 	CollectionBentleyPanel.add(new JLabel(""));
   	 	CollectionBentleyPanel.add(new JLabel(""));
   	 	CollectionBentleyPanel.add(new JLabel(""));
   	 	
   	 	Labels.Bentley_ArnageLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Bentley_AzureLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Bentley_ContinentalLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Bentley_GTZLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection BMW
   	 	
   	 	JPanel CollectionBMWPanel = new JPanel();
   	 	CollectionBMWPanel.setLayout(Car7Layout);
   	 	
   	 	CollectionBMWPanel.add(Labels.BMW_e30Label);
   	 	CollectionBMWPanel.add(Labels.BMW_e34Label);
   	 	CollectionBMWPanel.add(Labels.BMW_e36Label);
   	 	CollectionBMWPanel.add(Labels.BMW_e70Label);
   	 	CollectionBMWPanel.add(Labels.BMW_e90Label);
   	 	CollectionBMWPanel.add(Labels.BMW_M5Label);
   	 	CollectionBMWPanel.add(Labels.BMW_I8Label);
   	 	
   	 	Labels.BMW_e30Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.BMW_e34Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.BMW_e36Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.BMW_e70Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.BMW_e90Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.BMW_M5Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.BMW_I8Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Bugatti
   	 	
   	 	JPanel CollectionBugattiPanel = new JPanel();
   	 	CollectionBugattiPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionBugattiPanel.add(new JLabel(""));
   	 	CollectionBugattiPanel.add(new JLabel(""));
   	 	CollectionBugattiPanel.add(new JLabel(""));
   	 	CollectionBugattiPanel.add(new JLabel(""));
   	 	CollectionBugattiPanel.add(Labels.Bugatti_EB110Label);
   	 	CollectionBugattiPanel.add(Labels.Bugatti_RoyaleLabel);
   	 	CollectionBugattiPanel.add(Labels.Bugatti_Type252Label);
   	 	CollectionBugattiPanel.add(Labels.Bugatti_VeyronLabel);
   	 	CollectionBugattiPanel.add(new JLabel(""));
   	 	CollectionBugattiPanel.add(new JLabel(""));
   	 	CollectionBugattiPanel.add(new JLabel(""));
   	 	CollectionBugattiPanel.add(new JLabel(""));
   	 	
   	 	Labels.Bugatti_EB110Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Bugatti_RoyaleLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Bugatti_Type252Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Bugatti_VeyronLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Buick
   	 	
   	 	JPanel CollectionBuickPanel = new JPanel();
   	 	CollectionBuickPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionBuickPanel.add(new JLabel(""));
   	 	CollectionBuickPanel.add(new JLabel(""));
   	 	CollectionBuickPanel.add(new JLabel(""));
   	 	CollectionBuickPanel.add(new JLabel(""));
   	 	CollectionBuickPanel.add(Labels.Buick_CentryLabel);
   	 	CollectionBuickPanel.add(Labels.Buick_InvictaLabel);
   	 	CollectionBuickPanel.add(Labels.Buick_RivieraLabel);
   	 	CollectionBuickPanel.add(Labels.Buick_RoadmasterLabel);
   	 	CollectionBuickPanel.add(new JLabel(""));
   	 	CollectionBuickPanel.add(new JLabel(""));
   	 	CollectionBuickPanel.add(new JLabel(""));
   	 	CollectionBuickPanel.add(new JLabel(""));
   	 	
   	 	Labels.Buick_CentryLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Buick_InvictaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Buick_RivieraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Buick_RoadmasterLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Cadilliac
   	 	
   	 	JPanel CollectionCadilliacPanel = new JPanel();
   	 	CollectionCadilliacPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionCadilliacPanel.add(new JLabel(""));
   	 	CollectionCadilliacPanel.add(new JLabel(""));
   	 	CollectionCadilliacPanel.add(new JLabel(""));
   	 	CollectionCadilliacPanel.add(new JLabel(""));
   	 	CollectionCadilliacPanel.add(Labels.Cadilliac_ATSLabel);
   	 	CollectionCadilliacPanel.add(Labels.Cadilliac_DeVilleLabel);
   	 	CollectionCadilliacPanel.add(Labels.Cadilliac_EldoradoLabel);
   	 	CollectionCadilliacPanel.add(Labels.Cadilliac_XTSLabel);
   	 	CollectionCadilliacPanel.add(new JLabel(""));
   	 	CollectionCadilliacPanel.add(new JLabel(""));
   	 	CollectionCadilliacPanel.add(new JLabel(""));
   	 	CollectionCadilliacPanel.add(new JLabel(""));
   	 	
   	 	Labels.Cadilliac_ATSLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Cadilliac_DeVilleLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Cadilliac_EldoradoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Cadilliac_XTSLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Chevrolet
   	 	
   	 	JPanel CollectionChevroletPanel = new JPanel();
   	 	CollectionChevroletPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionChevroletPanel.add(new JLabel(""));
   	 	CollectionChevroletPanel.add(new JLabel(""));
   	 	CollectionChevroletPanel.add(new JLabel(""));
   	 	CollectionChevroletPanel.add(new JLabel(""));
   	 	CollectionChevroletPanel.add(Labels.Chevrolet_CorveteLabel);
   	 	CollectionChevroletPanel.add(Labels.Chevrolet_ImpalaLabel);
   	 	CollectionChevroletPanel.add(Labels.Chevrolet_SpinLabel);
   	 	CollectionChevroletPanel.add(Labels.Chevrolet_VikingLabel);
   	 	CollectionChevroletPanel.add(new JLabel(""));
   	 	CollectionChevroletPanel.add(new JLabel(""));
   	 	CollectionChevroletPanel.add(new JLabel(""));
   	 	CollectionChevroletPanel.add(new JLabel(""));
   	 	
   	 	Labels.Chevrolet_CorveteLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Chevrolet_ImpalaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Chevrolet_SpinLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Chevrolet_VikingLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Chrysler
   	 	
   	 	JPanel CollectionChryslerPanel = new JPanel();
   	 	CollectionChryslerPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionChryslerPanel.add(new JLabel(""));
   	 	CollectionChryslerPanel.add(new JLabel(""));
   	 	CollectionChryslerPanel.add(new JLabel(""));
   	 	CollectionChryslerPanel.add(new JLabel(""));
   	 	CollectionChryslerPanel.add(Labels.Chrysler_ChargerLabel);
   	 	CollectionChryslerPanel.add(Labels.Chrysler_CordobaLabel);
   	 	CollectionChryslerPanel.add(Labels.Chrysler_DaytonaLabel);
   	 	CollectionChryslerPanel.add(Labels.Chrysler_VoyagerLabel);
   	 	CollectionChryslerPanel.add(new JLabel(""));
   	 	CollectionChryslerPanel.add(new JLabel(""));
   	 	CollectionChryslerPanel.add(new JLabel(""));
   	 	CollectionChryslerPanel.add(new JLabel(""));
   	 	
   	 	Labels.Chrysler_ChargerLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Chrysler_CordobaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Chrysler_DaytonaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Chrysler_VoyagerLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Citroen
   	 	
   	 	JPanel CollectionCitroenPanel = new JPanel();
   	 	CollectionCitroenPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionCitroenPanel.add(new JLabel(""));
   	 	CollectionCitroenPanel.add(new JLabel(""));
   	 	CollectionCitroenPanel.add(new JLabel(""));
   	 	CollectionCitroenPanel.add(new JLabel(""));
   	 	CollectionCitroenPanel.add(Labels.Citroen_BXLabel);
   	 	CollectionCitroenPanel.add(Labels.Citroen_C5Label);
   	 	CollectionCitroenPanel.add(Labels.Citroen_CXLabel);
   	 	CollectionCitroenPanel.add(Labels.Citroen_SaxoLabel);
   	 	CollectionCitroenPanel.add(new JLabel(""));
   	 	CollectionCitroenPanel.add(new JLabel(""));
   	 	CollectionCitroenPanel.add(new JLabel(""));
   	 	CollectionCitroenPanel.add(new JLabel(""));
   	 	
   	 	Labels.Citroen_BXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Citroen_C5Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Citroen_CXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Citroen_SaxoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Dodge
   	 	
   	 	JPanel CollectionDodgePanel = new JPanel();
   	 	CollectionDodgePanel.setLayout(Car4Layout);
   	 	
   	 	CollectionDodgePanel.add(new JLabel(""));
   	 	CollectionDodgePanel.add(new JLabel(""));
   	 	CollectionDodgePanel.add(new JLabel(""));
   	 	CollectionDodgePanel.add(new JLabel(""));
   	 	CollectionDodgePanel.add(Labels.Dodge_400Label);
   	 	CollectionDodgePanel.add(Labels.Dodge_MatadorLabel);
   	 	CollectionDodgePanel.add(Labels.Dodge_NeonLabel);
   	 	CollectionDodgePanel.add(Labels.Dodge_ViperLabel);
   	 	CollectionDodgePanel.add(new JLabel(""));
   	 	CollectionDodgePanel.add(new JLabel(""));
   	 	CollectionDodgePanel.add(new JLabel(""));
   	 	CollectionDodgePanel.add(new JLabel(""));
   	 	
   	 	Labels.Dodge_400Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Dodge_MatadorLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Dodge_NeonLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Dodge_ViperLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Ferrari
   	 	
   	 	JPanel CollectionFerrariPanel = new JPanel();
   	 	CollectionFerrariPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionFerrariPanel.add(new JLabel(""));
   	 	CollectionFerrariPanel.add(new JLabel(""));
   	 	CollectionFerrariPanel.add(new JLabel(""));
   	 	CollectionFerrariPanel.add(new JLabel(""));
   	 	CollectionFerrariPanel.add(Labels.Ferrari_308Label);
   	 	CollectionFerrariPanel.add(Labels.Ferrari_348Label);
   	 	CollectionFerrariPanel.add(Labels.Ferrari_488Label);
   	 	CollectionFerrariPanel.add(Labels.Ferrari_EnzoLabel);
   	 	CollectionFerrariPanel.add(new JLabel(""));
   	 	CollectionFerrariPanel.add(new JLabel(""));
   	 	CollectionFerrariPanel.add(new JLabel(""));
   	 	CollectionFerrariPanel.add(new JLabel(""));
   	 	
   	 	Labels.Ferrari_308Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Ferrari_348Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Ferrari_488Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Ferrari_EnzoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Fiat
   	 	
   	 	JPanel CollectionFiatPanel = new JPanel();
   	 	CollectionFiatPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionFiatPanel.add(new JLabel(""));
   	 	CollectionFiatPanel.add(new JLabel(""));
   	 	CollectionFiatPanel.add(new JLabel(""));
   	 	CollectionFiatPanel.add(new JLabel(""));
   	 	CollectionFiatPanel.add(Labels.Fiat_1500Label);
   	 	CollectionFiatPanel.add(Labels.Fiat_500Label);
   	 	CollectionFiatPanel.add(Labels.Fiat_DobloLabel);
   	 	CollectionFiatPanel.add(Labels.Fiat_PuntoLabel);
   	 	CollectionFiatPanel.add(new JLabel(""));
   	 	CollectionFiatPanel.add(new JLabel(""));
   	 	CollectionFiatPanel.add(new JLabel(""));
   	 	CollectionFiatPanel.add(new JLabel(""));
   	 	
   	 	Labels.Fiat_1500Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Fiat_500Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Fiat_DobloLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Fiat_PuntoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Ford
   	 	
   	 	JPanel CollectionFordPanel = new JPanel();
   	 	CollectionFordPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionFordPanel.add(new JLabel(""));
   	 	CollectionFordPanel.add(new JLabel(""));
   	 	CollectionFordPanel.add(new JLabel(""));
   	 	CollectionFordPanel.add(new JLabel(""));
   	 	CollectionFordPanel.add(Labels.Ford_FiestaLabel);
   	 	CollectionFordPanel.add(Labels.Ford_FocusLabel);
   	 	CollectionFordPanel.add(Labels.Ford_MustangLabel);
   	 	CollectionFordPanel.add(Labels.Ford_SierraLabel);
   	 	CollectionFordPanel.add(new JLabel(""));
   	 	CollectionFordPanel.add(new JLabel(""));
   	 	CollectionFordPanel.add(new JLabel(""));
   	 	CollectionFordPanel.add(new JLabel(""));
   	 	
   	 	Labels.Ford_FiestaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Ford_FocusLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Ford_MustangLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Ford_SierraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection GAZ
   	 	
   	 	JPanel CollectionGAZPanel = new JPanel();
   	 	CollectionGAZPanel.setLayout(Car2Layout);
   	 	
   	 	CollectionGAZPanel.add(new JLabel(""));
   	 	CollectionGAZPanel.add(new JLabel(""));
 	 	CollectionGAZPanel.add(new JLabel(""));
 	 	CollectionGAZPanel.add(new JLabel(""));
 	 	CollectionGAZPanel.add(new JLabel(""));
 	 	CollectionGAZPanel.add(new JLabel(""));
   	 	CollectionGAZPanel.add(Labels.Gaz_21Label);
   	 	CollectionGAZPanel.add(new JLabel(""));
   	 	CollectionGAZPanel.add(Labels.Gaz_24Label);
   	 	CollectionGAZPanel.add(new JLabel(""));
   	 	CollectionGAZPanel.add(new JLabel(""));
   	 	CollectionGAZPanel.add(new JLabel(""));
   	 	CollectionGAZPanel.add(new JLabel(""));
   	 	CollectionGAZPanel.add(new JLabel(""));
   	 	CollectionGAZPanel.add(new JLabel(""));
   	 	
   	 	Labels.Gaz_21Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Gaz_24Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection GMC
   	 	
   	 	JPanel CollectionGMCPanel = new JPanel();
   	 	CollectionGMCPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionGMCPanel.add(new JLabel(""));
   	 	CollectionGMCPanel.add(new JLabel(""));
   	 	CollectionGMCPanel.add(new JLabel(""));
   	 	CollectionGMCPanel.add(new JLabel(""));
   	 	CollectionGMCPanel.add(Labels.GMC_EnvoyLabel);
   	 	CollectionGMCPanel.add(Labels.GMC_SuburbanLabel);
   	 	CollectionGMCPanel.add(Labels.GMC_TerrainLabel);
   	 	CollectionGMCPanel.add(Labels.GMC_YukonLabel);
   	 	CollectionGMCPanel.add(new JLabel(""));
   	 	CollectionGMCPanel.add(new JLabel(""));
   	 	CollectionGMCPanel.add(new JLabel(""));
   	 	CollectionGMCPanel.add(new JLabel(""));
   	 	
   	 	Labels.GMC_EnvoyLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.GMC_SuburbanLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.GMC_TerrainLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.GMC_YukonLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Hyundai
   	 	
   	 	JPanel CollectionHyundaiPanel = new JPanel();
   	 	CollectionHyundaiPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionHyundaiPanel.add(new JLabel(""));
   	 	CollectionHyundaiPanel.add(new JLabel(""));
   	 	CollectionHyundaiPanel.add(new JLabel(""));
   	 	CollectionHyundaiPanel.add(new JLabel(""));
   	 	CollectionHyundaiPanel.add(Labels.Hyundai_ExcelLabel);
   	 	CollectionHyundaiPanel.add(Labels.Hyundai_GetzLabel);
   	 	CollectionHyundaiPanel.add(Labels.Hyundai_MistraLabel);
   	 	CollectionHyundaiPanel.add(Labels.Hyundai_XGLabel);
   	 	CollectionHyundaiPanel.add(new JLabel(""));
   	 	CollectionHyundaiPanel.add(new JLabel(""));
   	 	CollectionHyundaiPanel.add(new JLabel(""));
   	 	CollectionHyundaiPanel.add(new JLabel(""));
   	 	
   	 	Labels.Hyundai_ExcelLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Hyundai_GetzLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Hyundai_MistraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Hyundai_XGLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Honda
   	 	
   	 	JPanel CollectionHondaPanel = new JPanel();
   	 	CollectionHondaPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionHondaPanel.add(new JLabel(""));
   	 	CollectionHondaPanel.add(new JLabel(""));
   	 	CollectionHondaPanel.add(new JLabel(""));
   	 	CollectionHondaPanel.add(new JLabel(""));
   	 	CollectionHondaPanel.add(Labels.Honda_CivicLabel);
   	 	CollectionHondaPanel.add(Labels.Honda_CRXLabel);
   	 	CollectionHondaPanel.add(Labels.Honda_PreludeLabel);
   	 	CollectionHondaPanel.add(Labels.Honda_S2000Label);
   	 	CollectionHondaPanel.add(new JLabel(""));
   	 	CollectionHondaPanel.add(new JLabel(""));
   	 	CollectionHondaPanel.add(new JLabel(""));
   	 	CollectionHondaPanel.add(new JLabel(""));
   	 	
   	 	Labels.Honda_CivicLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Honda_CRXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Honda_PreludeLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Honda_S2000Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Infiniti
   	 	
   	 	JPanel CollectionInfinitiPanel = new JPanel();
   	 	CollectionInfinitiPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionInfinitiPanel.add(new JLabel(""));
   	 	CollectionInfinitiPanel.add(new JLabel(""));
   	 	CollectionInfinitiPanel.add(new JLabel(""));
   	 	CollectionInfinitiPanel.add(new JLabel(""));
   	 	CollectionInfinitiPanel.add(Labels.Infiniti_EthereaLabel);
   	 	CollectionInfinitiPanel.add(Labels.Infiniti_FXLabel);
   	 	CollectionInfinitiPanel.add(Labels.Infiniti_Q50Label);
   	 	CollectionInfinitiPanel.add(Labels.Infiniti_QX60Label);
   	 	CollectionInfinitiPanel.add(new JLabel(""));
   	 	CollectionInfinitiPanel.add(new JLabel(""));
   	 	CollectionInfinitiPanel.add(new JLabel(""));
   	 	CollectionInfinitiPanel.add(new JLabel(""));
   	 	
   	 	Labels.Infiniti_EthereaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Infiniti_FXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Infiniti_Q50Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Infiniti_QX60Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Jaguar
   	 	
   	 	JPanel CollectionJaguarPanel = new JPanel();
   	 	CollectionJaguarPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionJaguarPanel.add(new JLabel(""));
   	 	CollectionJaguarPanel.add(new JLabel(""));
   	 	CollectionJaguarPanel.add(new JLabel(""));
   	 	CollectionJaguarPanel.add(new JLabel(""));
   	 	CollectionJaguarPanel.add(Labels.Jaguar_E_TypeLabel);
   	 	CollectionJaguarPanel.add(Labels.Jaguar_F_TypeLabel);
   	 	CollectionJaguarPanel.add(Labels.Jaguar_X_TypeLabel);
   	 	CollectionJaguarPanel.add(Labels.Jaguar_XJ6Label);
   	 	CollectionJaguarPanel.add(new JLabel(""));
   	 	CollectionJaguarPanel.add(new JLabel(""));
   	 	CollectionJaguarPanel.add(new JLabel(""));
   	 	CollectionJaguarPanel.add(new JLabel(""));
   	 	
   	 	Labels.Jaguar_E_TypeLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Jaguar_F_TypeLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Jaguar_X_TypeLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Jaguar_XJ6Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Jeep
   	 	
   	 	JPanel CollectionJeepPanel = new JPanel();
   	 	CollectionJeepPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionJeepPanel.add(new JLabel(""));
   	 	CollectionJeepPanel.add(new JLabel(""));
   	 	CollectionJeepPanel.add(new JLabel(""));
   	 	CollectionJeepPanel.add(new JLabel(""));
   	 	CollectionJeepPanel.add(Labels.Jeep_GladiatorLabel);
   	 	CollectionJeepPanel.add(Labels.Jeep_ScramblerLabel);
   	 	CollectionJeepPanel.add(Labels.Jeep_WranglerLabel);
   	 	CollectionJeepPanel.add(Labels.Jeep_ZJLabel);
   	 	CollectionJeepPanel.add(new JLabel(""));
   	 	CollectionJeepPanel.add(new JLabel(""));
   	 	CollectionJeepPanel.add(new JLabel(""));
   	 	CollectionJeepPanel.add(new JLabel(""));
   	 	
   	 	Labels.Jeep_GladiatorLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Jeep_ScramblerLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Jeep_WranglerLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Jeep_ZJLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Kia
   	 	
   	 	JPanel CollectionKiaPanel = new JPanel();
   	 	CollectionKiaPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionKiaPanel.add(new JLabel(""));
   	 	CollectionKiaPanel.add(new JLabel(""));
   	 	CollectionKiaPanel.add(new JLabel(""));
   	 	CollectionKiaPanel.add(new JLabel(""));
   	 	CollectionKiaPanel.add(Labels.Kia_ForteLabel);
   	 	CollectionKiaPanel.add(Labels.Kia_RondoLabel);
   	 	CollectionKiaPanel.add(Labels.Kia_SorentoLabel);
   	 	CollectionKiaPanel.add(Labels.Kia_VengaLabel);
   	 	CollectionKiaPanel.add(new JLabel(""));
   	 	CollectionKiaPanel.add(new JLabel(""));
   	 	CollectionKiaPanel.add(new JLabel(""));
   	 	CollectionKiaPanel.add(new JLabel(""));
   	 	
   	 	Labels.Kia_ForteLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Kia_RondoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Kia_SorentoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Kia_VengaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Koenigsegg
   	 	
   	 	JPanel CollectionKoenigseggPanel = new JPanel();
   	 	CollectionKoenigseggPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionKoenigseggPanel.add(new JLabel(""));
   	 	CollectionKoenigseggPanel.add(new JLabel(""));
   	 	CollectionKoenigseggPanel.add(new JLabel(""));
   	 	CollectionKoenigseggPanel.add(new JLabel(""));
   	 	CollectionKoenigseggPanel.add(new JLabel(""));
   	 	CollectionKoenigseggPanel.add(Labels.Koenigsegg_AgeraLabel);
   	 	CollectionKoenigseggPanel.add(Labels.Koenigsegg_CCXLabel);
   	 	CollectionKoenigseggPanel.add(Labels.Koenigsegg_OneLabel);
	 	CollectionKoenigseggPanel.add(Labels.Koenigsegg_RegeraLabel);
	 	CollectionKoenigseggPanel.add(new JLabel(""));
	 	CollectionKoenigseggPanel.add(new JLabel(""));
	 	CollectionKoenigseggPanel.add(new JLabel(""));
	 	CollectionKoenigseggPanel.add(new JLabel(""));
	 	
	 	Labels.Koenigsegg_AgeraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	Labels.Koenigsegg_CCXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	Labels.Koenigsegg_OneLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
	 	Labels.Koenigsegg_RegeraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Lamborghini
   	 	
   	 	JPanel CollectionLamborghiniPanel = new JPanel();
   	 	CollectionLamborghiniPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionLamborghiniPanel.add(new JLabel(""));
   	 	CollectionLamborghiniPanel.add(new JLabel(""));
   	 	CollectionLamborghiniPanel.add(new JLabel(""));
   	 	CollectionLamborghiniPanel.add(new JLabel(""));
   	 	CollectionLamborghiniPanel.add(Labels.Lamborghini_350GTLabel);
   	 	CollectionLamborghiniPanel.add(Labels.Lamborghini_AventadorLabel);
   	 	CollectionLamborghiniPanel.add(Labels.Lamborghini_DiabloLabel);
   	 	CollectionLamborghiniPanel.add(Labels.Lamborghini_GallardoLabel);
   	 	CollectionLamborghiniPanel.add(new JLabel(""));
   	 	CollectionLamborghiniPanel.add(new JLabel(""));
   	 	CollectionLamborghiniPanel.add(new JLabel(""));
   	 	CollectionLamborghiniPanel.add(new JLabel(""));
   	 
   	 	Labels.Lamborghini_350GTLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lamborghini_AventadorLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lamborghini_DiabloLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lamborghini_GallardoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Lancia
   	 	
   	 	JPanel CollectionLanciaPanel = new JPanel();
   	 	CollectionLanciaPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionLanciaPanel.add(new JLabel(""));
   	 	CollectionLanciaPanel.add(new JLabel(""));
   	 	CollectionLanciaPanel.add(new JLabel(""));
   	 	CollectionLanciaPanel.add(new JLabel(""));
   	 	CollectionLanciaPanel.add(Labels.Lancia_LybraLabel);
   	 	CollectionLanciaPanel.add(Labels.Lancia_PhedraLabel);
   	 	CollectionLanciaPanel.add(Labels.Lancia_ThemaLabel);
   	 	CollectionLanciaPanel.add(Labels.Lancia_VoyagerLabel);
   	 	CollectionLanciaPanel.add(new JLabel(""));
   	 	CollectionLanciaPanel.add(new JLabel(""));
   	 	CollectionLanciaPanel.add(new JLabel(""));
   	 	CollectionLanciaPanel.add(new JLabel(""));
   	 	
   	 	Labels.Lancia_LybraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lancia_PhedraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lancia_ThemaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lancia_VoyagerLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Land Rover
   	 	
   	 	JPanel CollectionLand_RoverPanel = new JPanel();
   	 	CollectionLand_RoverPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionLand_RoverPanel.add(new JLabel(""));
   	 	CollectionLand_RoverPanel.add(new JLabel(""));
   	 	CollectionLand_RoverPanel.add(new JLabel(""));
   	 	CollectionLand_RoverPanel.add(new JLabel(""));
   	 	CollectionLand_RoverPanel.add(Labels.Land_Rover_DefenderLabel);
   	 	CollectionLand_RoverPanel.add(Labels.Land_Rover_DiscoveryLabel);
   	 	CollectionLand_RoverPanel.add(Labels.Land_Rover_FreelanderLabel);
   	 	CollectionLand_RoverPanel.add(Labels.Land_Rover_RangeRoverLabel);
   	 	CollectionLand_RoverPanel.add(new JLabel(""));
   	 	CollectionLand_RoverPanel.add(new JLabel(""));
   	 	CollectionLand_RoverPanel.add(new JLabel(""));
   	 	CollectionLand_RoverPanel.add(new JLabel(""));
   	 	
   	 	Labels.Land_Rover_DefenderLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Land_Rover_DiscoveryLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Land_Rover_FreelanderLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Land_Rover_RangeRoverLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Lexus
   	 	
   	 	JPanel CollectionLexusPanel = new JPanel();
   	 	CollectionLexusPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionLexusPanel.add(new JLabel(""));
   	 	CollectionLexusPanel.add(new JLabel(""));
   	 	CollectionLexusPanel.add(new JLabel(""));
   	 	CollectionLexusPanel.add(new JLabel(""));
   	 	CollectionLexusPanel.add(Labels.Lexus_GXLabel);
   	 	CollectionLexusPanel.add(Labels.Lexus_ISLabel);
   	 	CollectionLexusPanel.add(Labels.Lexus_LSLabel);
   	 	CollectionLexusPanel.add(Labels.Lexus_RXLabel);
   	 	CollectionLexusPanel.add(new JLabel(""));
   	 	CollectionLexusPanel.add(new JLabel(""));
   	 	CollectionLexusPanel.add(new JLabel(""));
   	 	CollectionLexusPanel.add(new JLabel(""));
   	 	
   	 	Labels.Lexus_GXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lexus_ISLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lexus_LSLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Lexus_RXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Maserati
   	 	
   	 	JPanel CollectionMaseratiPanel = new JPanel();
   	 	CollectionMaseratiPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionMaseratiPanel.add(new JLabel(""));
   	 	CollectionMaseratiPanel.add(new JLabel(""));
   	 	CollectionMaseratiPanel.add(new JLabel(""));
   	 	CollectionMaseratiPanel.add(new JLabel(""));
   	 	CollectionMaseratiPanel.add(Labels.Maserati_5000GTLabel);
   	 	CollectionMaseratiPanel.add(Labels.Maserati_CoupeLabel);
   	 	CollectionMaseratiPanel.add(Labels.Maserati_GranTurismoLabel);
   	 	CollectionMaseratiPanel.add(Labels.Maserati_ShamalLabel);
   	 	CollectionMaseratiPanel.add(new JLabel(""));
   	 	CollectionMaseratiPanel.add(new JLabel(""));
   	 	CollectionMaseratiPanel.add(new JLabel(""));
   	 	CollectionMaseratiPanel.add(new JLabel(""));
   	 	
   	 	Labels.Maserati_5000GTLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Maserati_CoupeLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Maserati_GranTurismoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Maserati_ShamalLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Mazda
   	 	
   	 	JPanel CollectionMazdaPanel = new JPanel();
   	 	CollectionMazdaPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionMazdaPanel.add(new JLabel(""));
   	 	CollectionMazdaPanel.add(new JLabel(""));
   	 	CollectionMazdaPanel.add(new JLabel(""));
   	 	CollectionMazdaPanel.add(new JLabel(""));
   	 	CollectionMazdaPanel.add(Labels.Mazda_3Label);
   	 	CollectionMazdaPanel.add(Labels.Mazda_626Label);
   	 	CollectionMazdaPanel.add(Labels.Mazda_MX6Label);
   	 	CollectionMazdaPanel.add(Labels.Mazda_RX7Label);
   	 	CollectionMazdaPanel.add(new JLabel(""));
   	 	CollectionMazdaPanel.add(new JLabel(""));
   	 	CollectionMazdaPanel.add(new JLabel(""));
   	 	CollectionMazdaPanel.add(new JLabel(""));
   	 	
   	 	Labels.Mazda_3Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mazda_626Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mazda_MX6Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mazda_RX7Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection McLaren
   	 	
   	 	JPanel CollectionMcLarenPanel = new JPanel();
   	 	CollectionMcLarenPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionMcLarenPanel.add(new JLabel(""));
   	 	CollectionMcLarenPanel.add(new JLabel(""));
   	 	CollectionMcLarenPanel.add(new JLabel(""));
   	 	CollectionMcLarenPanel.add(new JLabel(""));
   	 	CollectionMcLarenPanel.add(Labels.McLaren_650sLabel);
   	 	CollectionMcLarenPanel.add(Labels.McLaren_F1Label);
   	 	CollectionMcLarenPanel.add(Labels.McLaren_P1Label);
   	 	CollectionMcLarenPanel.add(Labels.McLaren_VenenoLabel);
   	 	CollectionMcLarenPanel.add(new JLabel(""));
   	 	CollectionMcLarenPanel.add(new JLabel(""));
   	 	CollectionMcLarenPanel.add(new JLabel(""));
   	 	CollectionMcLarenPanel.add(new JLabel(""));
   	 	
   	 	Labels.McLaren_650sLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.McLaren_F1Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.McLaren_P1Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.McLaren_VenenoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Mercedes Benz
   	 	
   	 	JPanel CollectionMercedes_BenzPanel = new JPanel();
   	 	CollectionMercedes_BenzPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionMercedes_BenzPanel.add(new JLabel(""));
   	 	CollectionMercedes_BenzPanel.add(new JLabel(""));
   	 	CollectionMercedes_BenzPanel.add(new JLabel(""));
   	 	CollectionMercedes_BenzPanel.add(new JLabel(""));
   	 	CollectionMercedes_BenzPanel.add(Labels.Mercedes_Benz_CLA250Label);
   	 	CollectionMercedes_BenzPanel.add(Labels.Mercedes_Benz_G55Label);
   	 	CollectionMercedes_BenzPanel.add(Labels.Mercedes_Benz_SL600Label);
   	 	CollectionMercedes_BenzPanel.add(Labels.Mercedes_Benz_W123Label);
   	 	CollectionMercedes_BenzPanel.add(new JLabel(""));
   	 	CollectionMercedes_BenzPanel.add(new JLabel(""));
   	 	CollectionMercedes_BenzPanel.add(new JLabel(""));
   	 	CollectionMercedes_BenzPanel.add(new JLabel(""));
   	 	
   	 	Labels.Mercedes_Benz_CLA250Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mercedes_Benz_G55Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mercedes_Benz_SL600Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mercedes_Benz_W123Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Mini
   	 	
   	 	JPanel CollectionMiniPanel = new JPanel();
   	 	CollectionMiniPanel.setLayout(Car4Layout);
   	 	
   	 	CollectionMiniPanel.add(new JLabel(""));
   	 	CollectionMiniPanel.add(new JLabel(""));
   	 	CollectionMiniPanel.add(new JLabel(""));
   	 	CollectionMiniPanel.add(new JLabel(""));
   	 	CollectionMiniPanel.add(Labels.Mini_CooperLabel);
   	 	CollectionMiniPanel.add(Labels.Mini_CountrymanLabel);
   	 	CollectionMiniPanel.add(Labels.Mini_MokeLabel);
   	 	CollectionMiniPanel.add(Labels.Mini_PacemanLabel);
   	 	CollectionMiniPanel.add(new JLabel(""));
   	 	CollectionMiniPanel.add(new JLabel(""));
   	 	CollectionMiniPanel.add(new JLabel(""));
   	 	CollectionMiniPanel.add(new JLabel(""));
   	 	
   	 	Labels.Mini_CooperLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mini_CountrymanLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mini_MokeLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mini_PacemanLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Mitsubishi
   	 	
   	 	JPanel CollectionMitsubishiPanel = new JPanel();
   		CollectionMitsubishiPanel.setLayout(Car4Layout);
   	 
   		CollectionMitsubishiPanel.add(new JLabel(""));
 		CollectionMitsubishiPanel.add(new JLabel(""));
 		CollectionMitsubishiPanel.add(new JLabel(""));
 		CollectionMitsubishiPanel.add(new JLabel(""));
   	 	CollectionMitsubishiPanel.add(Labels.Mitsubishi_ColtLabel);
   	 	CollectionMitsubishiPanel.add(Labels.Mitsubishi_GTOLabel);
   	 	CollectionMitsubishiPanel.add(Labels.Mitsubishi_LancerEvolutionXLabel);
   	 	CollectionMitsubishiPanel.add(Labels.Mitsubishi_PajeroLabel);
 		CollectionMitsubishiPanel.add(new JLabel(""));
 		CollectionMitsubishiPanel.add(new JLabel(""));
 		CollectionMitsubishiPanel.add(new JLabel(""));
 		CollectionMitsubishiPanel.add(new JLabel(""));
   	 	
   	 	Labels.Mitsubishi_ColtLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mitsubishi_GTOLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mitsubishi_LancerEvolutionXLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Mitsubishi_PajeroLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Moskvich
   	 	
   	 	JPanel CollectionMoskvichPanel = new JPanel();
   	 	CollectionMoskvichPanel.setLayout(Car3Layout);
   	 
 		CollectionMoskvichPanel.add(new JLabel(""));
 		CollectionMoskvichPanel.add(new JLabel(""));
 		CollectionMoskvichPanel.add(new JLabel(""));
   	 	CollectionMoskvichPanel.add(Labels.Moskvich_2140Label);
   	 	CollectionMoskvichPanel.add(Labels.Moskvich_402Label);
   	 	CollectionMoskvichPanel.add(Labels.Moskvich_412Label);
   		CollectionMoskvichPanel.add(new JLabel(""));
   		CollectionMoskvichPanel.add(new JLabel(""));
   		CollectionMoskvichPanel.add(new JLabel(""));
   	 	
   	 	Labels.Moskvich_2140Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Moskvich_402Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Moskvich_412Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Nissan
   	 	
   	 	JPanel CollectionNissanPanel = new JPanel();
   	 	CollectionNissanPanel.setLayout(Car4Layout);
   	 	
   		CollectionNissanPanel.add(new JLabel(""));
   		CollectionNissanPanel.add(new JLabel(""));
   		CollectionNissanPanel.add(new JLabel(""));
   		CollectionNissanPanel.add(new JLabel(""));
   	 	CollectionNissanPanel.add(Labels.Nissan_240sxLabel);
   	 	CollectionNissanPanel.add(Labels.Nissan_350zLabel);
   	 	CollectionNissanPanel.add(Labels.Nissan_JukeLabel);
   	 	CollectionNissanPanel.add(Labels.Nissan_SkylineLabel);
   		CollectionNissanPanel.add(new JLabel(""));
   		CollectionNissanPanel.add(new JLabel(""));
   		CollectionNissanPanel.add(new JLabel(""));
   		CollectionNissanPanel.add(new JLabel(""));
   	 	
   	 	Labels.Nissan_240sxLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Nissan_350zLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Nissan_JukeLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Nissan_SkylineLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Opel
   	 	
   	 	JPanel CollectionOpelPanel = new JPanel();
   	 	CollectionOpelPanel.setLayout(Car4Layout);
   	 	
   		CollectionOpelPanel.add(new JLabel(""));
   		CollectionOpelPanel.add(new JLabel(""));
   		CollectionOpelPanel.add(new JLabel(""));
   		CollectionOpelPanel.add(new JLabel(""));
   	 	CollectionOpelPanel.add(Labels.Opel_AstraLabel);
   	 	CollectionOpelPanel.add(Labels.Opel_GTLabel);
   	 	CollectionOpelPanel.add(Labels.Opel_VectraLabel);
   	 	CollectionOpelPanel.add(Labels.Opel_ZafiraLabel);
   		CollectionOpelPanel.add(new JLabel(""));
   		CollectionOpelPanel.add(new JLabel(""));
   		CollectionOpelPanel.add(new JLabel(""));
   		CollectionOpelPanel.add(new JLabel(""));
   	 	
   	 	Labels.Opel_AstraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Opel_GTLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Opel_VectraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Opel_ZafiraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Pagani
   	 	
   	 	JPanel CollectionPaganiPanel = new JPanel();
   	 	CollectionPaganiPanel.setLayout(Car2Layout);
   	 	
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   	 	CollectionPaganiPanel.add(Labels.Pagani_HuayraLabel);
   		CollectionPaganiPanel.add(new JLabel(""));
   	 	CollectionPaganiPanel.add(Labels.Pagani_ZondaFLabel);
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   		CollectionPaganiPanel.add(new JLabel(""));
   	 	
   	 	Labels.Pagani_HuayraLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Pagani_ZondaFLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Peugeot
   	 	
   	 	JPanel CollectionPeugeotPanel = new JPanel();
   	 	CollectionPeugeotPanel.setLayout(Car4Layout);
   	 	
   		CollectionPeugeotPanel.add(new JLabel(""));
   		CollectionPeugeotPanel.add(new JLabel(""));
   		CollectionPeugeotPanel.add(new JLabel(""));
   		CollectionPeugeotPanel.add(new JLabel(""));
   	 	CollectionPeugeotPanel.add(Labels.Peugeot_107Label);
   	 	CollectionPeugeotPanel.add(Labels.Peugeot_308Label);
   	 	CollectionPeugeotPanel.add(Labels.Peugeot_405Label);
   	 	CollectionPeugeotPanel.add(Labels.Peugeot_601Label);
   	 	CollectionPeugeotPanel.add(new JLabel(""));
   	 	CollectionPeugeotPanel.add(new JLabel(""));
   	 	CollectionPeugeotPanel.add(new JLabel(""));
   	 	CollectionPeugeotPanel.add(new JLabel(""));
   	 	
   	 	Labels.Peugeot_107Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Peugeot_308Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
  		Labels.Peugeot_405Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
  		Labels.Peugeot_601Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Porsche
   	 	
   	 	JPanel CollectionPorschePanel = new JPanel();
   	 	CollectionPorschePanel.setLayout(Car4Layout);
   	 	
   		CollectionPorschePanel.add(new JLabel(""));
   		CollectionPorschePanel.add(new JLabel(""));
   		CollectionPorschePanel.add(new JLabel(""));
   		CollectionPorschePanel.add(new JLabel(""));
   	 	CollectionPorschePanel.add(Labels.Porsche_911Label);
   	 	CollectionPorschePanel.add(Labels.Porsche_BoxsterLabel);
   	 	CollectionPorschePanel.add(Labels.Porsche_CayenneLabel);
   	 	CollectionPorschePanel.add(Labels.Porsche_CaymanLabel);
   		CollectionPorschePanel.add(new JLabel(""));
   		CollectionPorschePanel.add(new JLabel(""));
   		CollectionPorschePanel.add(new JLabel(""));
   		CollectionPorschePanel.add(new JLabel(""));
   	 	
   	 	Labels.Porsche_911Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Porsche_BoxsterLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Porsche_CayenneLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Porsche_CaymanLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Renault
   	 	
   	 	JPanel CollectionRenaultPanel = new JPanel();
   	 	CollectionRenaultPanel.setLayout(Car4Layout);
   	 	
   		CollectionRenaultPanel.add(new JLabel(""));
   		CollectionRenaultPanel.add(new JLabel(""));
   		CollectionRenaultPanel.add(new JLabel(""));
   		CollectionRenaultPanel.add(new JLabel(""));
   	 	CollectionRenaultPanel.add(Labels.Renault_ClioLabel);
   	 	CollectionRenaultPanel.add(Labels.Renault_FlorideLabel);
   	 	CollectionRenaultPanel.add(Labels.Renault_FregateLabel);
   	 	CollectionRenaultPanel.add(Labels.Renault_SpiderLabel);
   		CollectionRenaultPanel.add(new JLabel(""));
   		CollectionRenaultPanel.add(new JLabel(""));
   		CollectionRenaultPanel.add(new JLabel(""));
   		CollectionRenaultPanel.add(new JLabel(""));
   	 	
   	 	Labels.Renault_ClioLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Renault_FlorideLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Renault_FregateLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Renault_SpiderLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Rolls Royce
   	 	
   	 	JPanel CollectionRolls_RoycePanel = new JPanel();
   	 	CollectionRolls_RoycePanel.setLayout(Car4Layout);
   	 	
   		CollectionRolls_RoycePanel.add(new JLabel(""));
   		CollectionRolls_RoycePanel.add(new JLabel(""));
   		CollectionRolls_RoycePanel.add(new JLabel(""));
   		CollectionRolls_RoycePanel.add(new JLabel(""));
   	 	CollectionRolls_RoycePanel.add(Labels.Rolls_Royce_PhantomIIILabel);
   	 	CollectionRolls_RoycePanel.add(Labels.Rolls_Royce_PhantomLabel);
   	 	CollectionRolls_RoycePanel.add(Labels.Rolls_Royce_SilverLabel);
   	 	CollectionRolls_RoycePanel.add(Labels.Rolls_Royce_WraithLabel);
   		CollectionRolls_RoycePanel.add(new JLabel(""));
   		CollectionRolls_RoycePanel.add(new JLabel(""));
   		CollectionRolls_RoycePanel.add(new JLabel(""));
   		CollectionRolls_RoycePanel.add(new JLabel(""));
   	 	
   	 	Labels.Rolls_Royce_PhantomIIILabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Rolls_Royce_PhantomLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Rolls_Royce_SilverLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Rolls_Royce_WraithLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Saab
   	 	
   	 	JPanel CollectionSaabPanel = new JPanel();
   	 	CollectionSaabPanel.setLayout(Car4Layout);
   	 	
   		CollectionSaabPanel.add(new JLabel(""));
   		CollectionSaabPanel.add(new JLabel(""));
   		CollectionSaabPanel.add(new JLabel(""));
   		CollectionSaabPanel.add(new JLabel(""));
   	 	CollectionSaabPanel.add(Labels.Saab_9000Label);
   	 	CollectionSaabPanel.add(Labels.Saab_900Label);
   	 	CollectionSaabPanel.add(Labels.Saab_9_5Label);
   	 	CollectionSaabPanel.add(Labels.Saab_SonettIILabel);
   		CollectionSaabPanel.add(new JLabel(""));
   		CollectionSaabPanel.add(new JLabel(""));
   		CollectionSaabPanel.add(new JLabel(""));
   		CollectionSaabPanel.add(new JLabel(""));
   	 	
   	 	Labels.Saab_9000Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Saab_900Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Saab_9_5Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Saab_SonettIILabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Subaru
   	 	
   	 	JPanel CollectionSubaruPanel = new JPanel();
   	 	CollectionSubaruPanel.setLayout(Car4Layout);
   	 	
   		CollectionSubaruPanel.add(new JLabel(""));
   		CollectionSubaruPanel.add(new JLabel(""));
   		CollectionSubaruPanel.add(new JLabel(""));
   		CollectionSubaruPanel.add(new JLabel(""));
   	 	CollectionSubaruPanel.add(Labels.Subaru_1000Label);
   	 	CollectionSubaruPanel.add(Labels.Subaru_ForesterLabel);
   	 	CollectionSubaruPanel.add(Labels.Subaru_ImprezaLabel);
   	 	CollectionSubaruPanel.add(Labels.Subaru_OutbackLabel);
   	 	CollectionSubaruPanel.add(new JLabel(""));
   	 	CollectionSubaruPanel.add(new JLabel(""));
   	 	CollectionSubaruPanel.add(new JLabel(""));
   	 	CollectionSubaruPanel.add(new JLabel(""));
   	 	
   	 	Labels.Subaru_1000Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Subaru_ForesterLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Subaru_ImprezaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Subaru_OutbackLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Tesla
   	 	
   	 	JPanel CollectionTeslaPanel = new JPanel();
   	 	CollectionTeslaPanel.setLayout(Car3Layout);
   	 	
   	 	CollectionTeslaPanel.add(new JLabel(""));
   		CollectionTeslaPanel.add(new JLabel(""));
   		CollectionTeslaPanel.add(new JLabel(""));
   	 	CollectionTeslaPanel.add(Labels.Tesla_RoadsterLabel);
   	 	CollectionTeslaPanel.add(Labels.Tesla_SLabel);
   	 	CollectionTeslaPanel.add(Labels.Tesla_XLabel);
   		CollectionTeslaPanel.add(new JLabel(""));
   		CollectionTeslaPanel.add(new JLabel(""));
   		CollectionTeslaPanel.add(new JLabel(""));
   	 	
   	 	Labels.Tesla_RoadsterLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Tesla_SLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Tesla_XLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Toyota
   	 	
   	 	JPanel CollectionToyotaPanel = new JPanel();
   	 	CollectionToyotaPanel.setLayout(Car4Layout);
   	 	
   		CollectionToyotaPanel.add(new JLabel(""));
   		CollectionToyotaPanel.add(new JLabel(""));
   		CollectionToyotaPanel.add(new JLabel(""));
   		CollectionToyotaPanel.add(new JLabel(""));
   	 	CollectionToyotaPanel.add(Labels.Toyota_86Label);
   	 	CollectionToyotaPanel.add(Labels.Toyota_AurisLabel);
   	 	CollectionToyotaPanel.add(Labels.Toyota_AvensisLabel);
   	 	CollectionToyotaPanel.add(Labels.Toyota_Rav4Label);
   		CollectionToyotaPanel.add(new JLabel(""));
   		CollectionToyotaPanel.add(new JLabel(""));
   		CollectionToyotaPanel.add(new JLabel(""));
   		CollectionToyotaPanel.add(new JLabel(""));
   	 	
   	 	Labels.Toyota_86Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Toyota_AurisLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Toyota_AvensisLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Toyota_Rav4Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Vaz
   	 	
   	 	JPanel CollectionVazPanel = new JPanel();
   	 	CollectionVazPanel.setLayout(Car3Layout);
   	 	
   		CollectionVazPanel.add(new JLabel(""));
   		CollectionVazPanel.add(new JLabel(""));
   		CollectionVazPanel.add(new JLabel(""));
   	 	CollectionVazPanel.add(Labels.Vaz_2101Label);
   	 	CollectionVazPanel.add(Labels.Vaz_2103Label);
   	 	CollectionVazPanel.add(Labels.Vaz_NivaLabel);
   		CollectionVazPanel.add(new JLabel(""));
   		CollectionVazPanel.add(new JLabel(""));
   		CollectionVazPanel.add(new JLabel(""));
   	 	
   	 	Labels.Vaz_2101Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Vaz_2103Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Vaz_NivaLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Volkswagen
   	 	
   	 	JPanel CollectionVolkswagenPanel = new JPanel();
   	 	CollectionVolkswagenPanel.setLayout(Car5Layout);
   	 	
   	 	CollectionVolkswagenPanel.add(Labels.Volkswagen_BeetleLabel);
   	 	CollectionVolkswagenPanel.add(Labels.Volkswagen_Golf1Label);
   	 	CollectionVolkswagenPanel.add(Labels.Volkswagen_PhaetonLabel);
   	 	CollectionVolkswagenPanel.add(Labels.Volkswagen_SciroccoLabel);
   	 	CollectionVolkswagenPanel.add(Labels.Volkswagen_TiguanLabel);
   	 	
   	 	Labels.Volkswagen_BeetleLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Volkswagen_Golf1Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Volkswagen_PhaetonLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Volkswagen_SciroccoLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Volkswagen_TiguanLabel.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	
   	 	// Collection Volvo
   	 	
   	 	JPanel CollectionVolvoPanel = new JPanel();
   	 	CollectionVolvoPanel.setLayout(Car4Layout);
   	 	
   		CollectionVolvoPanel.add(new JLabel(""));
   		CollectionVolvoPanel.add(new JLabel(""));
   		CollectionVolvoPanel.add(new JLabel(""));
   		CollectionVolvoPanel.add(new JLabel(""));
   	 	CollectionVolvoPanel.add(Labels.Volvo_850Label);
   	 	CollectionVolvoPanel.add(Labels.Volvo_C70Label);
   	 	CollectionVolvoPanel.add(Labels.Volvo_S80Label);
   	 	CollectionVolvoPanel.add(Labels.Volvo_XC90Label);
   		CollectionVolvoPanel.add(new JLabel(""));
   		CollectionVolvoPanel.add(new JLabel(""));
   		CollectionVolvoPanel.add(new JLabel(""));
   		CollectionVolvoPanel.add(new JLabel(""));
   	 	
   	 	Labels.Volvo_850Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Volvo_C70Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Volvo_S80Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
   	 	Labels.Volvo_XC90Label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));

   	 	// Statistic Main Panel
   	 	
   	 	JPanel StatisticMainPanel = new JPanel();
   	 	
   	 	
   	 	// Statistic Main Money Panel
   	 	JPanel StatisticMainPanelSub = new JPanel();
   	 	
   	 	// Statistic Main Boxes Panel
   	 	JPanel StatisticMainPanelSub2 = new JPanel();
   	 	
   	 	// Statistic Main Frames Panel
   	 	
   	 	JPanel StatisticMainPanelSub3 = new JPanel();
   	 	
   	 	// Statistic Main Collections Panel
   	 	
   	 	JPanel StatisticMainPanelSub4 = new JPanel();
   	 	
   	 	// Statistic Boxes Panel
   	 	
   	 	JPanel StatisticBoxesPanel = new JPanel();
   	 	
   	 	// Statistic Parts Panel
   	 	
   	 	JPanel StatisticPartsPanel = new JPanel();
   	 	
   	 	StatisticMainPanel.add(StatisticMainPanelSub);
   	 	StatisticMainPanel.add(StatisticMainPanelSub2);
   	 	StatisticMainPanel.add(StatisticMainPanelSub3);
   	 	StatisticMainPanel.add(StatisticMainPanelSub4);
   	 	
	 	//TabbedPane 
   	 	
   	 	JTabbedPane StatisticsPane = new JTabbedPane();
   	 	StatisticsPane.addTab(Main, StatisticMainPanel);
   	 	StatisticsPane.addTab(Boxes, StatisticBoxesPanel);
   	 	StatisticsPane.addTab(Parts, StatisticPartsPanel);
   	 	
   	 	JTabbedPane CollectionsAmericanPane = new JTabbedPane();
   	 	CollectionsAmericanPane.addTab(Buick, CollectionBuickPanel);
   	 	CollectionsAmericanPane.addTab(Cadilliac, CollectionCadilliacPanel);
   	 	CollectionsAmericanPane.addTab(Chevrolet, CollectionChevroletPanel);
   	 	CollectionsAmericanPane.addTab(Chrysler, CollectionChryslerPanel);
   	 	CollectionsAmericanPane.addTab(Dodge, CollectionDodgePanel);
   	 	CollectionsAmericanPane.addTab(Ford, CollectionFordPanel);
   	 	CollectionsAmericanPane.addTab(GMC, CollectionGMCPanel);
   	 	CollectionsAmericanPane.addTab(Jeep, CollectionJeepPanel);
   	 	CollectionsAmericanPane.addTab(Tesla, CollectionTeslaPanel);
   	 	
   	 	JTabbedPane CollectionsJapanesePane = new JTabbedPane();
   	 	CollectionsJapanesePane.addTab(Acura, CollectionAcuraPanel);
   	 	CollectionsJapanesePane.addTab(Honda, CollectionHondaPanel); 
   	 	CollectionsJapanesePane.addTab(Infiniti, CollectionInfinitiPanel);
   	 	CollectionsJapanesePane.addTab(Lexus, CollectionLexusPanel);
   	 	CollectionsJapanesePane.addTab(Mazda, CollectionMazdaPanel);
   	 	CollectionsJapanesePane.addTab(Mitsubishi, CollectionMitsubishiPanel);
   	 	CollectionsJapanesePane.addTab(Nissan, CollectionNissanPanel);
   	 	CollectionsJapanesePane.addTab(Subaru, CollectionSubaruPanel); 
   	 	CollectionsJapanesePane.addTab(Toyota, CollectionToyotaPanel);
   	 	
   	 	JTabbedPane CollectionsGermanPane = new JTabbedPane();
   	 	CollectionsGermanPane.addTab(Audi, CollectionAudiPanel);
   	 	CollectionsGermanPane.addTab(BMW, CollectionBMWPanel);
   	 	CollectionsGermanPane.addTab(Mercedes_Benz, CollectionMercedes_BenzPanel);
   	 	CollectionsGermanPane.addTab(Opel, CollectionOpelPanel);
   	 	CollectionsGermanPane.addTab(Porsche, CollectionPorschePanel);
   	 	CollectionsGermanPane.addTab(Volkswagen, CollectionVolkswagenPanel);
   	 	
   	 	JTabbedPane CollectionsBritishPane = new JTabbedPane();
   	 	CollectionsBritishPane.addTab(Aston_Martin, CollectionAston_MartinPanel); 
   	 	CollectionsBritishPane.addTab(Bentley, CollectionBentleyPanel);	
   	 	CollectionsBritishPane.addTab(Jaguar, CollectionJaguarPanel); 
   	 	CollectionsBritishPane.addTab(Land_Rover, CollectionLand_RoverPanel);
   	 	CollectionsBritishPane.addTab(McLaren, CollectionMcLarenPanel);
   	 	CollectionsBritishPane.addTab(Mini, CollectionMiniPanel);
   	 	CollectionsBritishPane.addTab(Rolls_Royce, CollectionRolls_RoycePanel);
   	 	
   	 	JTabbedPane CollectionsItalianPane = new JTabbedPane();
   	 	CollectionsItalianPane.addTab(Alfa_Romeo, CollectionAlfa_RomeoPanel);  
   	 	CollectionsItalianPane.addTab(Ferrari, CollectionFerrariPanel);
   	 	CollectionsItalianPane.addTab(Fiat, CollectionFiatPanel); 
   	 	CollectionsItalianPane.addTab(Lamborghini, CollectionLamborghiniPanel);
   	 	CollectionsItalianPane.addTab(Lancia, CollectionLanciaPanel);
   	 	CollectionsItalianPane.addTab(Maserati, CollectionMaseratiPanel);
   	 	CollectionsItalianPane.addTab(Pagani, CollectionPaganiPanel);
   	 	
   	 	JTabbedPane CollectionsFrenchPane = new JTabbedPane();
   	 	CollectionsFrenchPane.addTab(Bugatti, CollectionBugattiPanel);  	 
   	 	CollectionsFrenchPane.addTab(Citroen, CollectionCitroenPanel); 
   	 	CollectionsFrenchPane.addTab(Peugeot, CollectionPeugeotPanel);
   	 	CollectionsFrenchPane.addTab(Renault, CollectionRenaultPanel);
   	 	
   	 	JTabbedPane CollectionsKoreanPane = new JTabbedPane();
   	 	CollectionsKoreanPane.addTab(Hyundai, CollectionHyundaiPanel);  
   	 	CollectionsKoreanPane.addTab(Kia, CollectionKiaPanel);
   	 	
   	 	JTabbedPane CollectionsSwedishPane = new JTabbedPane();
   	 	CollectionsSwedishPane.addTab(Koenigsegg, CollectionKoenigseggPanel);	
   	 	CollectionsSwedishPane.addTab(Saab, CollectionSaabPanel);
   	 	CollectionsSwedishPane.addTab(Volvo, CollectionVolvoPanel);
   	 	
   	 	JTabbedPane CollectionsRussianPane = new JTabbedPane();  
   	 	CollectionsRussianPane.addTab(GAZ, CollectionGAZPanel);   	 
   	 	CollectionsRussianPane.addTab(Moskvich, CollectionMoskvichPanel);  	  
   	 	CollectionsRussianPane.addTab(VAZ, CollectionVazPanel);

   	     	  
      JTabbedPane tabbedPane2 = new JTabbedPane();
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
         
   	  CollectionsPanel.addTab(American, CollectionsAmericanPane);
   	  CollectionsPanel.addTab(British, CollectionsBritishPane);
   	  CollectionsPanel.addTab(French, CollectionsFrenchPane);
   	  CollectionsPanel.addTab(German, CollectionsGermanPane);	  
   	  CollectionsPanel.addTab(Italian, CollectionsItalianPane);
   	  CollectionsPanel.addTab(Japanese, CollectionsJapanesePane);
   	  CollectionsPanel.addTab(Korean, CollectionsKoreanPane);
   	  CollectionsPanel.addTab(Russian, CollectionsRussianPane);
   	  CollectionsPanel.addTab(Swedish, CollectionsSwedishPane);
      
      tabbedPane.addTab(Click, MainPanel);
      tabbedPane.addTab(Upgrades, UpgradesPanel);
      tabbedPane.addTab(BuyBoxes, BuyBoxesPanel);
      tabbedPane.addTab(OpenBoxes, OpenBoxesPanel);
      tabbedPane.addTab(BuildCars, BuildCarsPanel);
      tabbedPane.addTab(BuyFrames, BuyFramesPanel);
      tabbedPane.addTab(SellParts ,tabbedPane2);
      tabbedPane.addTab(Collections, CollectionsPanel);
      tabbedPane.addTab(Statistics, StatisticsPane);
   
      pane.add(tabbedPane, BorderLayout.CENTER);
      
      
    }
    
    // Counting
       
    public int CountLv1Cars(){
    	int countcarsLv1 = 0;
    	for(int i = 3; i < CarsLv1.cars.length;i+=4){		
    		countcarsLv1+= CarsLv1.cars[i];
    	} 
    	return countcarsLv1;
    	    	
    }
    
    public int CountLv2Cars(){
    	int countcarsLv2 = 0;
    	for(int i = 3;i < CarsLv2.cars.length;i+=4){
    		countcarsLv2+= CarsLv2.cars[i];
    	} 
    	return countcarsLv2;
    
    }
    
    public int CountLv3Cars(){
    	int countcarsLv3 = 0;
    	for(int i = 3;i < CarsLv3.cars.length;i+=4){
    		countcarsLv3+= CarsLv3.cars[i];
    	} 
    	return countcarsLv3;
    
    }
    
    public int CountLv4Cars(){
    	int countcarsLv4 = 0;
    	for(int i = 3;i < CarsLv4.cars.length;i+=4){
    		countcarsLv4+= CarsLv4.cars[i];
    	} 
    	return countcarsLv4;
    
    }
    
    public int CountLv5Cars(){
    	int countcarsLv5 = 0;
    	for(int i = 3;i < CarsLv5.cars.length;i+=4){
    		countcarsLv5+= CarsLv5.cars[i];
    	} 
    	return countcarsLv5;
    
    }
    
    public int CountLv6Cars(){
    	int countcarsLv6 = 0;
    	for(int i = 3;i < CarsLv6.cars.length;i+=4){
    		countcarsLv6+= CarsLv6.cars[i];
    	} 
    	return countcarsLv6;
    
    }
    
    public int CountLv7Cars(){
    	int countcarsLv7 = 0;
    	for(int i = 3;i < CarsLv7.cars.length;i+=4){
    		countcarsLv7+= CarsLv7.cars[i];
    	} 
    	return countcarsLv7;
    
    }
    
    public int CountLv8Cars(){
    	int countcarsLv8 = 0;
    	for(int i = 3;i < CarsLv8.cars.length;i+=4){
    		countcarsLv8+= CarsLv8.cars[i];
    	} 
    	return countcarsLv8;
    
    }
    
    public int CountLv9Cars(){
    	int countcarsLv9 = 0;
    	for(int i = 3;i < CarsLv9.cars.length;i+=4){
    		countcarsLv9+= CarsLv9.cars[i];
    	} 
    	return countcarsLv9;
    
    }
    
    public int CountLv10Cars(){
    	int countcarsLv10 = 0;
    	for(int i = 3;i < CarsLv10.cars.length;i+=4){
    		countcarsLv10+= CarsLv10.cars[i];
    	} 
    	return countcarsLv10;
    
    }
    	
 	public int AmericanCars(){
 		int AmericanCars = 0;
 		for(int i = 2; i <= 80; i+=4){
 				for(int j = 3; j <=80; j+=4){	
 		 			if(CarsLv1.cars[i] == 0){
 		 				if(CarsLv1.cars[j] == 1){
 		 					AmericanCars +=1;
 					}
 		 			}
 			}
 		}
 		return AmericanCars;
 	}

	MainHolder CarMain = new MainHolder();
    BoxesHolder Box = new BoxesHolder();
    FramesHolder CarFrame = new FramesHolder();
    PartHolder Part = new PartHolder();
    StatisticHolder Statistic = new StatisticHolder();
    CarLevel1Holder CarsLv1 = new CarLevel1Holder();
    CarLevel2Holder CarsLv2 = new CarLevel2Holder();
    CarLevel3Holder CarsLv3 = new CarLevel3Holder();
    CarLevel4Holder CarsLv4 = new CarLevel4Holder();
    CarLevel5Holder CarsLv5 = new CarLevel5Holder();
    CarLevel6Holder CarsLv6 = new CarLevel6Holder();
    CarLevel7Holder CarsLv7 = new CarLevel7Holder();
    CarLevel8Holder CarsLv8 = new CarLevel8Holder();
    CarLevel9Holder CarsLv9 = new CarLevel9Holder();
    CarLevel10Holder CarsLv10 = new CarLevel10Holder();

    void refresh() {			
		Labels.MoneyLabel.setText("Money: " + CarMain.main[0]);
		Labels.BoxesLabel.setText("Boxes: " + CarMain.main[2]);
		Labels.BoxesLVLLabel.setText("Boxes Level: " + CarMain.main[4]);
		Labels.PlayerLabel.setText("Player Level: " + CarMain.main[5]);
		Labels.GarageLabel.setText("Garage Level: " + CarMain.main[6]);
		Labels.BoxesLVL1Label.setText("<html>1 LVL Box<br>" + "Count: " + Box.boxes[1]);
		Labels.BoxesLVL2Label.setText("<html>2 LVL Box<br>" + "Count: " + Box.boxes[3]);
		Labels.BoxesLVL3Label.setText("<html>3 LVL Box<br>" + "Count: " + Box.boxes[5]);
		Labels.BoxesLVL4Label.setText("<html>4 LVL Box<br>" + "Count: " + Box.boxes[7]);
		Labels.BoxesLVL5Label.setText("<html>5 LVL Box<br>" + "Count: " + Box.boxes[9]);
		Labels.BoxesLVL6Label.setText("<html>6 LVL Box<br>" + "Count: " + Box.boxes[11]);
		Labels.BoxesLVL7Label.setText("<html>7 LVL Box<br>" + "Count: " + Box.boxes[13]);
		Labels.BoxesLVL8Label.setText("<html>8 LVL Box<br>" + "Count: " + Box.boxes[15]);
		Labels.BoxesLVL9Label.setText("<html>9 LVL Box<br>" + "Count: " + Box.boxes[17]);
		Labels.BoxesLVL10Label.setText("<html>10 LVL Box<br>" + "Count: " + Box.boxes[19]);
		Labels.OpenBoxesLVL1Label.setText("<html>1 LVL Box<br>" + "Count: " + Box.boxes[1]);
		Labels.OpenBoxesLVL2Label.setText("<html>2 LVL Box<br>" + "Count: " + Box.boxes[3]);
		Labels.OpenBoxesLVL3Label.setText("<html>3 LVL Box<br>" + "Count: " + Box.boxes[5]);
		Labels.OpenBoxesLVL4Label.setText("<html>4 LVL Box<br>" + "Count: " + Box.boxes[7]);
		Labels.OpenBoxesLVL5Label.setText("<html>5 LVL Box<br>" + "Count: " + Box.boxes[9]);
		Labels.OpenBoxesLVL6Label.setText("<html>6 LVL Box<br>" + "Count: " + Box.boxes[11]);
		Labels.OpenBoxesLVL7Label.setText("<html>7 LVL Box<br>" + "Count: " + Box.boxes[13]);
		Labels.OpenBoxesLVL8Label.setText("<html>8 LVL Box<br>" + "Count: " + Box.boxes[15]);
		Labels.OpenBoxesLVL9Label.setText("<html>9 LVL Box<br>" + "Count: " + Box.boxes[17]);
		Labels.OpenBoxesLVL10Label.setText("<html>10 LVL Box<br>" + "Count: " + Box.boxes[19]);
		Labels.FrameLv1Label.setText("<html>1 LVL Frame<br>" + "Count: " + CarFrame.frames[1]);
		Labels.FrameLv2Label.setText("<html>2 LVL Frame<br>" + "Count: " + CarFrame.frames[3]);
		Labels.FrameLv3Label.setText("<html>3 LVL Frame<br>" + "Count: " + CarFrame.frames[5]);
		Labels.FrameLv4Label.setText("<html>4 LVL Frame<br>" + "Count: " + CarFrame.frames[7]);
		Labels.FrameLv5Label.setText("<html>5 LVL Frame<br>" + "Count: " + CarFrame.frames[9]);
		Labels.FrameLv6Label.setText("<html>6 LVL Frame<br>" + "Count: " + CarFrame.frames[11]);
		Labels.FrameLv7Label.setText("<html>7 LVL Frame<br>" + "Count: " + CarFrame.frames[13]);
		Labels.FrameLv8Label.setText("<html>8 LVL Frame<br>" + "Count: " + CarFrame.frames[15]);
		Labels.FrameLv9Label.setText("<html>9 LVL Frame<br>" + "Count: " + CarFrame.frames[17]);
		Labels.FrameLv10Label.setText("<html>10 LVL Frame<br>" + "Count: " + CarFrame.frames[19]);
		Labels.CarsLv1Label.setText("<html>1 LVL Cars<br>" + "Owned: " + CountLv1Cars() + " of 20");
		Labels.CarsLv2Label.setText("<html>2 LVL Cars<br>" + "Owned: " + CountLv2Cars() + " of 20");
		Labels.CarsLv3Label.setText("<html>3 LVL Cars<br>" + "Owned: " + CountLv3Cars() + " of 20");
		Labels.CarsLv4Label.setText("<html>4 LVL Cars<br>" + "Owned: " + CountLv4Cars() + " of 20");
		Labels.CarsLv5Label.setText("<html>5 LVL Cars<br>" + "Owned: " + CountLv5Cars() + " of 20");
		Labels.CarsLv6Label.setText("<html>6 LVL Cars<br>" + "Owned: " + CountLv6Cars() + " of 20");
		Labels.CarsLv7Label.setText("<html>7 LVL Cars<br>" + "Owned: " + CountLv7Cars() + " of 20");
		Labels.CarsLv8Label.setText("<html>8 LVL Cars<br>" + "Owned: " + CountLv8Cars() + " of 20");
		Labels.CarsLv9Label.setText("<html>9 LVL Cars<br>" + "Owned: " + CountLv9Cars() + " of 20");
		Labels.CarsLv10Label.setText("<html>10 LVL Cars<br>" + "Owned: " + CountLv10Cars() + " of 20");
		Labels.AccessoriesLVL1Label.setText("<html>Accessories LVL 1<br>" + "Count: " + Part.parts[1]);
		Labels.BodyLVL1Label.setText("<html>Body LVL 1<br>" + "Count: " + Part.parts[3]);
		Labels.BrakesLVL1Label.setText("<html>Brakes LVL 1<br>" + "Count: " + Part.parts[5]);
		Labels.CoolingLVL1Label.setText("<html>Cooling LVL 1<br>" + "Count: " + Part.parts[7]);
		Labels.ElectronicsLVL1Label.setText("<html>Electronics LVL 1<br>" + "Count: " + Part.parts[9]);
		Labels.EngineLVL1Label.setText("<html>Engine LVL 1<br>" + "Count: " + Part.parts[11]);
		Labels.ExaustLVL1Label.setText("<html>Exaust LVL 1<br>" + "Count: " + Part.parts[13]);
		Labels.FuelLVL1Label.setText("<html>Fuel LVL 1<br>" + "Count: " + Part.parts[15]);
		Labels.InteriorLVL1Label.setText("<html>Interior LVL 1<br>" + "Count: " + Part.parts[17]);
		Labels.SteeringLVL1Label.setText("<html>Steering LVL 1<br>" + "Count: " + Part.parts[19]);
		Labels.SuspensionLVL1Label.setText("<html>Suspension LVL 1<br>" + "Count: " + Part.parts[21]);
		Labels.TransmissionLVL1Label.setText("<html>Transmission LVL 1<br>" + "Count: " + Part.parts[23]);
		Labels.TiresLVL1Label.setText("<html>Tires LVL 1<br>" + "Count: " + Part.parts[25]);
		Labels.AccessoriesLVL2Label.setText("<html>Accessories LVL 2<br>" + "Count: " + Part.parts[27]);
		Labels.BodyLVL2Label.setText("<html>Body LVL 2<br>" + "Count: " + Part.parts[29]);
		Labels.BrakesLVL2Label.setText("<html>Brakes LVL 2<br>" + "Count: " + Part.parts[31]);
		Labels.CoolingLVL2Label.setText("<html>Cooling LVL 2<br>" + "Count: " + Part.parts[33]);
		Labels.ElectronicsLVL2Label.setText("<html>Electronics LVL 2<br>" + "Count: " + Part.parts[35]);
		Labels.EngineLVL2Label.setText("<html>Engine LVL 2<br>" + "Count: " + Part.parts[37]);
		Labels.ExaustLVL2Label.setText("<html>Exaust LVL 2<br>" + "Count: " + Part.parts[39]);
		Labels.FuelLVL2Label.setText("<html>Fuel LVL 2<br>" + "Count: " + Part.parts[41]);
		Labels.InteriorLVL2Label.setText("<html>Interior LVL 2<br>" + "Count: " + Part.parts[43]);
		Labels.SteeringLVL2Label.setText("<html>Steering LVL 2<br>" + "Count: " + Part.parts[45]);
		Labels.SuspensionLVL2Label.setText("<html>Suspension LVL 2<br>" + "Count: " + Part.parts[47]);
		Labels.TransmissionLVL2Label.setText("<html>Transmission LVL 2<br>" + "Count: " + Part.parts[49]);
		Labels.TiresLVL2Label.setText("<html>Tires LVL 2<br>" + "Count: " + Part.parts[51]);
		Labels.AccessoriesLVL3Label.setText("<html>Accessories LVL 3<br>" + "Count: " + Part.parts[53]);
		Labels.BodyLVL3Label.setText("<html>Body LVL 3<br>" + "Count: " + Part.parts[55]);
		Labels.BrakesLVL3Label.setText("<html>Brakes LVL 3<br>" + "Count: " + Part.parts[57]);
		Labels.CoolingLVL3Label.setText("<html>Cooling LVL 3<br>" + "Count: " + Part.parts[59]);
		Labels.ElectronicsLVL3Label.setText("<html>Electronics LVL 3<br>" + "Count: " + Part.parts[61]);
		Labels.EngineLVL3Label.setText("<html>Engine LVL 3<br>" + "Count: " + Part.parts[63]);
		Labels.ExaustLVL3Label.setText("<html>Exaust LVL 3<br>" + "Count: " + Part.parts[65]);
		Labels.FuelLVL3Label.setText("<html>Fuel LVL 3<br>" + "Count: " + Part.parts[67]);
		Labels.InteriorLVL3Label.setText("<html>Interior LVL 3<br>" + "Count: " + Part.parts[69]);
		Labels.SteeringLVL3Label.setText("<html>Steering LVL 3<br>" + "Count: " + Part.parts[71]);
		Labels.SuspensionLVL3Label.setText("<html>Suspension LVL 3<br>" + "Count: " + Part.parts[73]);
		Labels.TransmissionLVL3Label.setText("<html>Transmission LVL 3<br>" + "Count: " + Part.parts[75]);
		Labels.TiresLVL3Label.setText("<html>Tires LVL 3<br>" + "Count: " + Part.parts[77]);
		Labels.AccessoriesLVL4Label.setText("<html>Accessories LVL 4<br>" + "Count: " + Part.parts[79]);
		Labels.BodyLVL4Label.setText("<html>Body LVL 4<br>" + "Count: " + Part.parts[81]);
		Labels.BrakesLVL4Label.setText("<html>Brakes LVL 4<br>" + "Count: " + Part.parts[83]);
		Labels.CoolingLVL4Label.setText("<html>Cooling LVL 4<br>" + "Count: " + Part.parts[85]);
		Labels.ElectronicsLVL4Label.setText("<html>Electronics LVL 4<br>" + "Count: " + Part.parts[87]);
		Labels.EngineLVL4Label.setText("<html>Engine LVL 4<br>" + "Count: " + Part.parts[89]);
		Labels.ExaustLVL4Label.setText("<html>Exaust LVL 4<br>" + "Count: " + Part.parts[91]);
		Labels.FuelLVL4Label.setText("<html>Fuel LVL 4<br>" + "Count: " + Part.parts[93]);
		Labels.InteriorLVL4Label.setText("<html>Interior LVL 4<br>" + "Count: " + Part.parts[95]);
		Labels.SteeringLVL4Label.setText("<html>Steering LVL 4<br>" + "Count: " + Part.parts[97]);
		Labels.SuspensionLVL4Label.setText("<html>Suspension LVL 4<br>" + "Count: " + Part.parts[99]);
		Labels.TransmissionLVL4Label.setText("<html>Transmission LVL 4<br>" + "Count: " + Part.parts[101]);
		Labels.TiresLVL4Label.setText("<html>Tires LVL 4<br>" + "Count: " + Part.parts[103]);
		Labels.AccessoriesLVL5Label.setText("<html>Accessories LVL 5<br>" + "Count: " + Part.parts[105]);
		Labels.BodyLVL5Label.setText("<html>Body LVL 5<br>" + "Count: " + Part.parts[107]);
		Labels.BrakesLVL5Label.setText("<html>Brakes LVL 5<br>" + "Count: " + Part.parts[109]);
		Labels.CoolingLVL5Label.setText("<html>Cooling LVL 5<br>" + "Count: " + Part.parts[111]);
		Labels.ElectronicsLVL5Label.setText("<html>Electronics LVL 5<br>" + "Count: " + Part.parts[113]);
		Labels.EngineLVL5Label.setText("<html>Engine LVL 5<br>" + "Count: " + Part.parts[115]);
		Labels.ExaustLVL5Label.setText("<html>Exaust LVL 5<br>" + "Count: " + Part.parts[117]);
		Labels.FuelLVL5Label.setText("<html>Fuel LVL 5<br>" + "Count: " + Part.parts[119]);
		Labels.InteriorLVL5Label.setText("<html>Interior LVL 5<br>" + "Count: " + Part.parts[121]);
		Labels.SteeringLVL5Label.setText("<html>Steering LVL 5<br>" + "Count: " + Part.parts[123]);
		Labels.SuspensionLVL5Label.setText("<html>Suspension LVL 5<br>" + "Count: " + Part.parts[125]);
		Labels.TransmissionLVL5Label.setText("<html>Transmission LVL 5<br>" + "Count: " + Part.parts[127]);
		Labels.TiresLVL5Label.setText("<html>Tires LVL 5<br>" + "Count: " + Part.parts[129]);
		Labels.AccessoriesLVL6Label.setText("<html>Accessories LVL 6<br>" + "Count: " + Part.parts[131]);
		Labels.BodyLVL6Label.setText("<html>Body LVL 6<br>" + "Count: " + Part.parts[133]);
		Labels.BrakesLVL6Label.setText("<html>Brakes LVL 6<br>" + "Count: " + Part.parts[135]);
		Labels.CoolingLVL6Label.setText("<html>Cooling LVL 6<br>" + "Count: " + Part.parts[137]);
		Labels.ElectronicsLVL6Label.setText("<html>Electronics LVL 6<br>" + "Count: " + Part.parts[139]);
		Labels.EngineLVL6Label.setText("<html>Engine LVL 6<br>" + "Count: " + Part.parts[141]);
		Labels.ExaustLVL6Label.setText("<html>Exaust LVL 6<br>" + "Count: " + Part.parts[143]);
		Labels.FuelLVL6Label.setText("<html>Fuel LVL 6<br>" + "Count: " + Part.parts[145]);
		Labels.InteriorLVL6Label.setText("<html>Interior LVL 6<br>" + "Count: " + Part.parts[147]);
		Labels.SteeringLVL6Label.setText("<html>Steering LVL 6<br>" + "Count: " + Part.parts[149]);
		Labels.SuspensionLVL6Label.setText("<html>Suspension LVL 6<br>" + "Count: " + Part.parts[151]);
		Labels.TransmissionLVL6Label.setText("<html>Transmission LVL 6<br>" + "Count: " + Part.parts[153]);
		Labels.TiresLVL6Label.setText("<html>Tires LVL 6<br>" + "Count: " + Part.parts[155]);
		Labels.AccessoriesLVL7Label.setText("<html>Accessories LVL 7<br>" + "Count: " + Part.parts[157]);
		Labels.BodyLVL7Label.setText("<html>Body LVL 7<br>" + "Count: " + Part.parts[159]);
		Labels.BrakesLVL7Label.setText("<html>Brakes LVL 7<br>" + "Count: " + Part.parts[161]);
		Labels.CoolingLVL7Label.setText("<html>Cooling LVL 7<br>" + "Count: " + Part.parts[163]);
		Labels.ElectronicsLVL7Label.setText("<html>Electronics LVL 7<br>" + "Count: " + Part.parts[165]);
		Labels.EngineLVL7Label.setText("<html>Engine LVL 7<br>" + "Count: " + Part.parts[167]);
		Labels.ExaustLVL7Label.setText("<html>Exaust LVL 7<br>" + "Count: " + Part.parts[169]);
		Labels.FuelLVL7Label.setText("<html>Fuel LVL 7<br>" + "Count: " + Part.parts[171]);
		Labels.InteriorLVL7Label.setText("<html>Interior LVL 7<br>" + "Count: " + Part.parts[173]);
		Labels.SteeringLVL7Label.setText("<html>Steering LVL 7<br>" + "Count: " + Part.parts[175]);
		Labels.SuspensionLVL7Label.setText("<html>Suspension LVL 7<br>" + "Count: " + Part.parts[177]);
		Labels.TransmissionLVL7Label.setText("<html>Transmission LVL 7<br>" + "Count: " + Part.parts[179]);
		Labels.TiresLVL7Label.setText("<html>Tires LVL 7<br>" + "Count: " + Part.parts[181]);
		Labels.AccessoriesLVL8Label.setText("<html>Accessories LVL 8<br>" + "Count: " + Part.parts[183]);
		Labels.BodyLVL8Label.setText("<html>Body LVL 8<br>" + "Count: " + Part.parts[185]);
		Labels.BrakesLVL8Label.setText("<html>Brakes LVL 8<br>" + "Count: " + Part.parts[187]);
		Labels.CoolingLVL8Label.setText("<html>Cooling LVL 8<br>" + "Count: " + Part.parts[189]);
		Labels.ElectronicsLVL8Label.setText("<html>Electronics LVL 8<br>" + "Count: " + Part.parts[191]);
		Labels.EngineLVL8Label.setText("<html>Engine LVL 8<br>" + "Count: " + Part.parts[193]);
		Labels.ExaustLVL8Label.setText("<html>Exaust LVL 8<br>" + "Count: " + Part.parts[195]);
		Labels.FuelLVL8Label.setText("<html>Fuel LVL 8<br>" + "Count: " + Part.parts[197]);
		Labels.InteriorLVL8Label.setText("<html>Interior LVL 8<br>" + "Count: " + Part.parts[199]);
		Labels.SteeringLVL8Label.setText("<html>Steering LVL 8<br>" + "Count: " + Part.parts[201]);
		Labels.SuspensionLVL8Label.setText("<html>Suspension LVL 8<br>" + "Count: " + Part.parts[203]);
		Labels.TransmissionLVL8Label.setText("<html>Transmission LVL 8<br>" + "Count: " + Part.parts[205]);
		Labels.TiresLVL8Label.setText("<html>Tires LVL 8<br>" + "Count: " + Part.parts[207]);
		Labels.AccessoriesLVL9Label.setText("<html>Accessories LVL 9<br>" + "Count: " + Part.parts[209]);
		Labels.BodyLVL9Label.setText("<html>Body LVL 9<br>" + "Count: " + Part.parts[211]);
		Labels.BrakesLVL9Label.setText("<html>Brakes LVL 9<br>" + "Count: " + Part.parts[213]);
		Labels.CoolingLVL9Label.setText("<html>Cooling LVL 9<br>" + "Count: " + Part.parts[215]);
		Labels.ElectronicsLVL9Label.setText("<html>Electronics LVL 9<br>" + "Count: " + Part.parts[217]);
		Labels.EngineLVL9Label.setText("<html>Engine LVL 9<br>" + "Count: " + Part.parts[219]);
		Labels.ExaustLVL9Label.setText("<html>Exaust LVL 9<br>" + "Count: " + Part.parts[221]);
		Labels.FuelLVL9Label.setText("<html>Fuel LVL 9<br>" + "Count: " + Part.parts[223]);
		Labels.InteriorLVL9Label.setText("<html>Interior LVL 9<br>" + "Count: " + Part.parts[225]);
		Labels.SteeringLVL9Label.setText("<html>Steering LVL 9<br>" + "Count: " + Part.parts[227]);
		Labels.SuspensionLVL9Label.setText("<html>Suspension LVL 9<br>" + "Count: " + Part.parts[229]);
		Labels.TransmissionLVL9Label.setText("<html>Transmission LVL 9<br>" + "Count: " + Part.parts[231]);
		Labels.TiresLVL9Label.setText("<html>Tires LVL 9<br>" + "Count: " + Part.parts[233]);
		Labels.AccessoriesLVL10Label.setText("<html>Accessories LVL 10<br>" + "Count: " + Part.parts[235]);
		Labels.BodyLVL10Label.setText("<html>Body LVL 10<br>" + "Count: " + Part.parts[237]);
		Labels.BrakesLVL10Label.setText("<html>Brakes LVL 10<br>" + "Count: " + Part.parts[239]);
		Labels.CoolingLVL10Label.setText("<html>Cooling LVL 10<br>" + "Count: " + Part.parts[241]);
		Labels.ElectronicsLVL10Label.setText("<html>Electronics LVL 10<br>" + "Count: " + Part.parts[243]);
		Labels.EngineLVL10Label.setText("<html>Engine LVL 10<br>" + "Count: " + Part.parts[245]);
		Labels.ExaustLVL10Label.setText("<html>Exaust LVL 10<br>" + "Count: " + Part.parts[247]);
		Labels.FuelLVL10Label.setText("<html>Fuel LVL 10<br>" + "Count: " + Part.parts[249]);
		Labels.InteriorLVL10Label.setText("<html>Interior LVL 10<br>" + "Count: " + Part.parts[251]);
		Labels.SteeringLVL10Label.setText("<html>Steering LVL 10<br>" + "Count: " + Part.parts[253]);
		Labels.SuspensionLVL10Label.setText("<html>Suspension LVL 10<br>" + "Count: " + Part.parts[255]);
		Labels.TransmissionLVL10Label.setText("<html>Transmission LVL 10<br>" + "Count: " + Part.parts[257]);
		Labels.TiresLVL10Label.setText("<html>Tires LVL 10<br>" + "Count: " + Part.parts[259]);
	
		if(CarMain.main[5] >=1){
        	jbtnPartsLv1.setEnabled(true);
        	jbtnBuyBoxLv1.setEnabled(true);
        	jbtnBuyFrameLv1.setEnabled(true);
        	jbtnBuildCarLv1.setEnabled(true);
        	jbtnSellAccessoriesLv1.setEnabled(true);
            jbtnSellBodyLv1.setEnabled(true);
            jbtnSellBrakesLv1.setEnabled(true);
            jbtnSellCoolingLv1.setEnabled(true);
            jbtnSellElectronicsLv1.setEnabled(true);
            jbtnSellEngineLv1.setEnabled(true);
            jbtnSellExaustLv1.setEnabled(true);
            jbtnSellFuelLv1.setEnabled(true);
            jbtnSellInteriorLv1.setEnabled(true);
            jbtnSellSteeringLv1.setEnabled(true);
            jbtnSellSuspensionLv1.setEnabled(true);
            jbtnSellTransmissionLv1.setEnabled(true);
            jbtnSellTiresLv1.setEnabled(true);
            Labels.MoneyLabel.setIcon(ImagesHolder.MoneyIcon);
            Labels.BoxesLabel.setIcon(ImagesHolder.BoxLv9_10Icon);
            Labels.GarageLabel.setIcon(ImagesHolder.GarageIcon);
            Labels.PlayerLabel.setIcon(ImagesHolder.PlayerIcon);
            Labels.BoxesLVLLabel.setIcon(ImagesHolder.BoxLv9_10Icon);
            Labels.BoxesLVL1Label.setIcon(ImagesHolder.BoxLv1_2Icon);
            Labels.OpenBoxesLVL1Label.setIcon(ImagesHolder.BoxLv1_2Icon);
            Labels.FrameLv1Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv1Label.setIcon(ImagesHolder.Saab_900Icon);
            Labels.AccessoriesLVL1Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL1Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL1Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL1Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL1Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL1Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL1Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL1Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL1Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL1Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL1Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL1Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL1Label.setIcon(ImagesHolder.TiresIcon);
        }
		
		if(CarMain.main[5] >=2){
			jbtnPartsLv2.setEnabled(true);
        	jbtnBuyBoxLv2.setEnabled(true);
        	jbtnBuyFrameLv2.setEnabled(true);
        	jbtnBuildCarLv2.setEnabled(true);
        	jbtnSellAccessoriesLv2.setEnabled(true);
            jbtnSellBodyLv2.setEnabled(true);
            jbtnSellBrakesLv2.setEnabled(true);
            jbtnSellCoolingLv2.setEnabled(true);
            jbtnSellElectronicsLv2.setEnabled(true);
            jbtnSellEngineLv2.setEnabled(true);
            jbtnSellExaustLv2.setEnabled(true);
            jbtnSellFuelLv2.setEnabled(true);
            jbtnSellInteriorLv2.setEnabled(true);
            jbtnSellSteeringLv2.setEnabled(true);
            jbtnSellSuspensionLv2.setEnabled(true);
            jbtnSellTransmissionLv2.setEnabled(true);
            jbtnSellTiresLv2.setEnabled(true);
            Labels.BoxesLVL2Label.setIcon(ImagesHolder.BoxLv1_2Icon);
            Labels.OpenBoxesLVL2Label.setIcon(ImagesHolder.BoxLv1_2Icon);
            Labels.FrameLv2Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv2Label.setIcon(ImagesHolder.Bentley_ContinentalIcon);
            Labels.AccessoriesLVL2Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL2Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL2Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL2Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL2Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL2Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL2Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL2Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL2Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL2Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL2Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL2Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL2Label.setIcon(ImagesHolder.TiresIcon);
		}		
		if(CarMain.main[5] >=3){
			jbtnPartsLv3.setEnabled(true);
        	jbtnBuyBoxLv3.setEnabled(true);
        	jbtnBuyFrameLv3.setEnabled(true);
        	jbtnBuildCarLv3.setEnabled(true);
        	jbtnSellAccessoriesLv3.setEnabled(true);
            jbtnSellBodyLv3.setEnabled(true);
            jbtnSellBrakesLv3.setEnabled(true);
            jbtnSellCoolingLv3.setEnabled(true);
            jbtnSellElectronicsLv3.setEnabled(true);
            jbtnSellEngineLv3.setEnabled(true);
            jbtnSellExaustLv3.setEnabled(true);
            jbtnSellFuelLv3.setEnabled(true);
            jbtnSellInteriorLv3.setEnabled(true);
            jbtnSellSteeringLv3.setEnabled(true);
            jbtnSellSuspensionLv3.setEnabled(true);
            jbtnSellTransmissionLv3.setEnabled(true);
            jbtnSellTiresLv3.setEnabled(true);
            Labels.BoxesLVL3Label.setIcon(ImagesHolder.BoxLv3_4Icon);
            Labels.OpenBoxesLVL3Label.setIcon(ImagesHolder.BoxLv3_4Icon);
            Labels.FrameLv3Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv3Label.setIcon(ImagesHolder.Audi_RS6Icon);
            Labels.AccessoriesLVL3Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL3Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL3Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL3Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL3Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL3Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL3Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL3Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL3Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL3Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL3Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL3Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL3Label.setIcon(ImagesHolder.TiresIcon);
		}		
		if(CarMain.main[5] >=4){
			jbtnPartsLv4.setEnabled(true);
        	jbtnBuyBoxLv4.setEnabled(true);
        	jbtnBuyFrameLv4.setEnabled(true);
        	jbtnBuildCarLv4.setEnabled(true);
        	jbtnSellAccessoriesLv4.setEnabled(true);
            jbtnSellBodyLv4.setEnabled(true);
            jbtnSellBrakesLv4.setEnabled(true);
            jbtnSellCoolingLv4.setEnabled(true);
            jbtnSellElectronicsLv4.setEnabled(true);
            jbtnSellEngineLv4.setEnabled(true);
            jbtnSellExaustLv4.setEnabled(true);
            jbtnSellFuelLv4.setEnabled(true);
            jbtnSellInteriorLv4.setEnabled(true);
            jbtnSellSteeringLv4.setEnabled(true);
            jbtnSellSuspensionLv4.setEnabled(true);
            jbtnSellTransmissionLv4.setEnabled(true);
            jbtnSellTiresLv4.setEnabled(true);
            Labels.BoxesLVL4Label.setIcon(ImagesHolder.BoxLv3_4Icon);
            Labels.OpenBoxesLVL4Label.setIcon(ImagesHolder.BoxLv3_4Icon);
            Labels.FrameLv4Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv4Label.setIcon(ImagesHolder.Opel_ZafiraIcon);
            Labels.AccessoriesLVL4Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL4Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL4Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL4Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL4Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL4Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL4Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL4Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL4Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL4Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL4Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL4Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL4Label.setIcon(ImagesHolder.TiresIcon);
		}		
		if(CarMain.main[5] >=5){
			jbtnPartsLv5.setEnabled(true);
        	jbtnBuyBoxLv5.setEnabled(true);
        	jbtnBuyFrameLv5.setEnabled(true);
        	jbtnBuildCarLv5.setEnabled(true);
        	jbtnSellAccessoriesLv5.setEnabled(true);
            jbtnSellBodyLv5.setEnabled(true);
            jbtnSellBrakesLv5.setEnabled(true);
            jbtnSellCoolingLv5.setEnabled(true);
            jbtnSellElectronicsLv5.setEnabled(true);
            jbtnSellEngineLv5.setEnabled(true);
            jbtnSellExaustLv5.setEnabled(true);
            jbtnSellFuelLv5.setEnabled(true);
            jbtnSellInteriorLv5.setEnabled(true);
            jbtnSellSteeringLv5.setEnabled(true);
            jbtnSellSuspensionLv5.setEnabled(true);
            jbtnSellTransmissionLv5.setEnabled(true);
            jbtnSellTiresLv5.setEnabled(true);
            Labels.BoxesLVL5Label.setIcon(ImagesHolder.BoxLv5_6Icon);
            Labels.OpenBoxesLVL5Label.setIcon(ImagesHolder.BoxLv5_6Icon);
            Labels.FrameLv5Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv5Label.setIcon(ImagesHolder.Ferrari_308Icon);
            Labels.AccessoriesLVL5Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL5Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL5Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL5Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL5Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL5Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL5Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL5Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL5Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL5Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL5Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL5Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL5Label.setIcon(ImagesHolder.TiresIcon);
		}		
		if(CarMain.main[5] >=6){
			jbtnPartsLv6.setEnabled(true);
        	jbtnBuyBoxLv6.setEnabled(true);
        	jbtnBuyFrameLv6.setEnabled(true);
        	jbtnBuildCarLv6.setEnabled(true);
        	jbtnSellAccessoriesLv6.setEnabled(true);
            jbtnSellBodyLv6.setEnabled(true);
            jbtnSellBrakesLv6.setEnabled(true);
            jbtnSellCoolingLv6.setEnabled(true);
            jbtnSellElectronicsLv6.setEnabled(true);
            jbtnSellEngineLv6.setEnabled(true);
            jbtnSellExaustLv6.setEnabled(true);
            jbtnSellFuelLv6.setEnabled(true);
            jbtnSellInteriorLv6.setEnabled(true);
            jbtnSellSteeringLv6.setEnabled(true);
            jbtnSellSuspensionLv6.setEnabled(true);
            jbtnSellTransmissionLv6.setEnabled(true);
            jbtnSellTiresLv6.setEnabled(true);
            Labels.BoxesLVL6Label.setIcon(ImagesHolder.BoxLv5_6Icon);
            Labels.OpenBoxesLVL6Label.setIcon(ImagesHolder.BoxLv5_6Icon);
            Labels.FrameLv6Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv6Label.setIcon(ImagesHolder.Fiat_PuntoIcon);
            Labels.AccessoriesLVL6Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL6Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL6Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL6Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL6Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL6Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL6Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL6Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL6Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL6Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL6Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL6Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL6Label.setIcon(ImagesHolder.TiresIcon);
		}		
		if(CarMain.main[5] >=7){
			jbtnPartsLv7.setEnabled(true);
        	jbtnBuyBoxLv7.setEnabled(true);
        	jbtnBuyFrameLv7.setEnabled(true);
        	jbtnBuildCarLv7.setEnabled(true);
        	jbtnSellAccessoriesLv7.setEnabled(true);
            jbtnSellBodyLv7.setEnabled(true);
            jbtnSellBrakesLv7.setEnabled(true);
            jbtnSellCoolingLv7.setEnabled(true);
            jbtnSellElectronicsLv7.setEnabled(true);
            jbtnSellEngineLv7.setEnabled(true);
            jbtnSellExaustLv7.setEnabled(true);
            jbtnSellFuelLv7.setEnabled(true);
            jbtnSellInteriorLv7.setEnabled(true);
            jbtnSellSteeringLv7.setEnabled(true);
            jbtnSellSuspensionLv7.setEnabled(true);
            jbtnSellTransmissionLv7.setEnabled(true);
            jbtnSellTiresLv7.setEnabled(true);
            Labels.BoxesLVL7Label.setIcon(ImagesHolder.BoxLv7_8Icon);
            Labels.OpenBoxesLVL7Label.setIcon(ImagesHolder.BoxLv7_8Icon);
            Labels.FrameLv7Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv7Label.setIcon(ImagesHolder.Volkswagen_BeetleIcon);
            Labels.AccessoriesLVL7Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL7Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL7Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL7Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL7Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL7Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL7Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL7Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL7Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL7Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL7Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL7Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL7Label.setIcon(ImagesHolder.TiresIcon);
		}		
		if(CarMain.main[5] >=8){
			jbtnPartsLv8.setEnabled(true);
        	jbtnBuyBoxLv8.setEnabled(true);
        	jbtnBuyFrameLv8.setEnabled(true);
        	jbtnBuildCarLv8.setEnabled(true);
        	jbtnSellAccessoriesLv8.setEnabled(true);
            jbtnSellBodyLv8.setEnabled(true);
            jbtnSellBrakesLv8.setEnabled(true);
            jbtnSellCoolingLv8.setEnabled(true);
            jbtnSellElectronicsLv8.setEnabled(true);
            jbtnSellEngineLv8.setEnabled(true);
            jbtnSellExaustLv8.setEnabled(true);
            jbtnSellFuelLv8.setEnabled(true);
            jbtnSellInteriorLv8.setEnabled(true);
            jbtnSellSteeringLv8.setEnabled(true);
            jbtnSellSuspensionLv8.setEnabled(true);
            jbtnSellTransmissionLv8.setEnabled(true);
            jbtnSellTiresLv8.setEnabled(true);
            Labels.BoxesLVL8Label.setIcon(ImagesHolder.BoxLv7_8Icon);
            Labels.OpenBoxesLVL8Label.setIcon(ImagesHolder.BoxLv7_8Icon);
            Labels.FrameLv8Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv8Label.setIcon(ImagesHolder.Cadilliac_EldoradoIcon);
            Labels.AccessoriesLVL8Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL8Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL8Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL8Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL8Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL8Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL8Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL8Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL8Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL8Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL8Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL8Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL8Label.setIcon(ImagesHolder.TiresIcon);
		}		
		if(CarMain.main[5] >=9){
			jbtnPartsLv9.setEnabled(true);
        	jbtnBuyBoxLv9.setEnabled(true);
        	jbtnBuyFrameLv9.setEnabled(true);
        	jbtnBuildCarLv9.setEnabled(true);
        	jbtnSellAccessoriesLv9.setEnabled(true);
            jbtnSellBodyLv9.setEnabled(true);
            jbtnSellBrakesLv9.setEnabled(true);
            jbtnSellCoolingLv9.setEnabled(true);
            jbtnSellElectronicsLv9.setEnabled(true);
            jbtnSellEngineLv9.setEnabled(true);
            jbtnSellExaustLv9.setEnabled(true);
            jbtnSellFuelLv9.setEnabled(true);
            jbtnSellInteriorLv9.setEnabled(true);
            jbtnSellSteeringLv9.setEnabled(true);
            jbtnSellSuspensionLv9.setEnabled(true);
            jbtnSellTransmissionLv9.setEnabled(true);
            jbtnSellTiresLv9.setEnabled(true);
            Labels.BoxesLVL9Label.setIcon(ImagesHolder.BoxLv9_10Icon);
            Labels.OpenBoxesLVL9Label.setIcon(ImagesHolder.BoxLv9_10Icon);
            Labels.FrameLv9Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv9Label.setIcon(ImagesHolder.Honda_S2000Icon);
            Labels.AccessoriesLVL9Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL9Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL9Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL9Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL9Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL9Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL9Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL9Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL9Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL9Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL9Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL9Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL9Label.setIcon(ImagesHolder.TiresIcon);
		}		
		if(CarMain.main[5] >=10){
			jbtnPartsLv10.setEnabled(true);
        	jbtnBuyBoxLv10.setEnabled(true);
        	jbtnBuyFrameLv10.setEnabled(true);
        	jbtnBuildCarLv10.setEnabled(true);
        	jbtnSellAccessoriesLv10.setEnabled(true);
            jbtnSellBodyLv10.setEnabled(true);
            jbtnSellBrakesLv10.setEnabled(true);
            jbtnSellCoolingLv10.setEnabled(true);
            jbtnSellElectronicsLv10.setEnabled(true);
            jbtnSellEngineLv10.setEnabled(true);
            jbtnSellExaustLv10.setEnabled(true);
            jbtnSellFuelLv10.setEnabled(true);
            jbtnSellInteriorLv10.setEnabled(true);
            jbtnSellSteeringLv10.setEnabled(true);
            jbtnSellSuspensionLv10.setEnabled(true);
            jbtnSellTransmissionLv10.setEnabled(true);
            jbtnSellTiresLv10.setEnabled(true);
            Labels.BoxesLVL10Label.setIcon(ImagesHolder.BoxLv9_10Icon);
            Labels.OpenBoxesLVL10Label.setIcon(ImagesHolder.BoxLv9_10Icon);
            Labels.FrameLv10Label.setIcon(ImagesHolder.CarFrameIcon);
            Labels.CarsLv10Label.setIcon(ImagesHolder.Peugeot_308Icon);
            Labels.AccessoriesLVL10Label.setIcon(ImagesHolder.AccessoriesIcon);
            Labels.BodyLVL10Label.setIcon(ImagesHolder.BodyIcon);
            Labels.BrakesLVL10Label.setIcon(ImagesHolder.BrakesIcon);
            Labels.CoolingLVL10Label.setIcon(ImagesHolder.CoolingIcon);
            Labels.ElectronicsLVL10Label.setIcon(ImagesHolder.ElectronicsIcon);
            Labels.EngineLVL10Label.setIcon(ImagesHolder.EngineIcon);
            Labels.ExaustLVL10Label.setIcon(ImagesHolder.ExaustIcon);
            Labels.FuelLVL10Label.setIcon(ImagesHolder.FuelIcon);
            Labels.InteriorLVL10Label.setIcon(ImagesHolder.InteriorIcon);
            Labels.SteeringLVL10Label.setIcon(ImagesHolder.SteeringIcon);
            Labels.SuspensionLVL10Label.setIcon(ImagesHolder.SuspensionIcon);
            Labels.TransmissionLVL10Label.setIcon(ImagesHolder.TransmissionIcon);
            Labels.TiresLVL10Label.setIcon(ImagesHolder.TiresIcon);
	}
		if(CountLv1Cars() == 20){
			jbtnBuildCarLv1.setEnabled(false);
		}
		if(CountLv2Cars() == 20){
			jbtnBuildCarLv2.setEnabled(false);
		}
		if(CountLv3Cars() == 20){
			jbtnBuildCarLv3.setEnabled(false);
		}
		if(CountLv4Cars() == 20){
			jbtnBuildCarLv4.setEnabled(false);
		}
		if(CountLv5Cars() == 20){
			jbtnBuildCarLv5.setEnabled(false);
		}
		if(CountLv6Cars() == 20){
			jbtnBuildCarLv6.setEnabled(false);
		}
		if(CountLv7Cars() == 20){
			jbtnBuildCarLv7.setEnabled(false);
		}
		if(CountLv8Cars() == 20){
			jbtnBuildCarLv8.setEnabled(false);
		}
		if(CountLv9Cars() == 20){
			jbtnBuildCarLv9.setEnabled(false);
		}
		if(CountLv10Cars() == 20){
			jbtnBuildCarLv10.setEnabled(false);
		}
		if(CarsLv1.cars[3] == 1){
            Labels.Aston_Martin_DB9Label.setIcon(ImagesHolder.Aston_Martin_DB9Icon);
            Labels.Aston_Martin_DB9Label.setText("Aston Martin DB9");
		}
		if(CarsLv1.cars[7] == 1){
            Labels.Acura_NSXLabel.setIcon(ImagesHolder.Acura_NSXIcon);
            Labels.Acura_NSXLabel.setText("Acura NSX");
		}
		if(CarsLv1.cars[11] == 1){
            Labels.Ford_MustangLabel.setIcon(ImagesHolder.Ford_MustangIcon);
            Labels.Ford_MustangLabel.setText("Ford Mustang");
		}
		if(CarsLv1.cars[15] == 1){
            Labels.Moskvich_412Label.setIcon(ImagesHolder.Moskvich_412Icon);
            Labels.Moskvich_412Label.setText("Moskvich 412");
		}
		if(CarsLv1.cars[19] == 1){
            Labels.Kia_VengaLabel.setIcon(ImagesHolder.Kia_VengaIcon);
            Labels.Kia_VengaLabel.setText("Kia Venga");
		}
		if(CarsLv1.cars[23] == 1){
            Labels.Fiat_1500Label.setIcon(ImagesHolder.Fiat_1500Icon);
            Labels.Fiat_1500Label.setText("Fiat 1500");
		}
		if(CarsLv1.cars[27] == 1){
            Labels.Ferrari_EnzoLabel.setIcon(ImagesHolder.Ferrari_EnzoIcon);
            Labels.Ferrari_EnzoLabel.setText("Ferrari Enzo");
		}
		if(CarsLv1.cars[31] == 1){
            Labels.Aston_Martin_RapideLabel.setIcon(ImagesHolder.Aston_Martin_RapideIcon);
            Labels.Aston_Martin_RapideLabel.setText("Aston Martin Rapide");
		}
		if(CarsLv1.cars[35] == 1){
            Labels.Koenigsegg_CCXLabel.setIcon(ImagesHolder.Koenigsegg_CCXIcon);
            Labels.Koenigsegg_CCXLabel.setText("Koenigsegg CCX");
		}
		if(CarsLv1.cars[39] == 1){
            Labels.Honda_CivicLabel.setIcon(ImagesHolder.Honda_CivicIcon);
            Labels.Honda_CivicLabel.setText("Honda Civic");
		}
		if(CarsLv1.cars[43] == 1){
            Labels.Cadilliac_ATSLabel.setIcon(ImagesHolder.Cadilliac_ATSIcon);
            Labels.Cadilliac_ATSLabel.setText("Cadilliac ATS");
		}
		if(CarsLv1.cars[47] == 1){
            Labels.Mitsubishi_LancerEvolutionXLabel.setIcon(ImagesHolder.Mitsubishi_LancerEvolutionXIcon);
            Labels.Mitsubishi_LancerEvolutionXLabel.setText("MitsubishiLancerEvolutionX");
		}
		if(CarsLv1.cars[51] == 1){
            Labels.Infiniti_FXLabel.setIcon(ImagesHolder.Infiniti_FXIcon);
            Labels.Infiniti_FXLabel.setText("Infiniti FX");
		}
		if(CarsLv1.cars[55] == 1){
            Labels.Lancia_ThemaLabel.setIcon(ImagesHolder.Lancia_ThemaIcon);
            Labels.Lancia_ThemaLabel.setText("Lancia Thema");
		}
		if(CarsLv1.cars[59] == 1){
            Labels.Volvo_XC90Label.setIcon(ImagesHolder.Volvo_XC90Icon);
            Labels.Volvo_XC90Label.setText("Volvo XC90");
		}
		if(CarsLv1.cars[63] == 1){
            Labels.Acura_CSXLabel.setIcon(ImagesHolder.Acura_CSXIcon);
            Labels.Acura_CSXLabel.setText("Acura CSX");
		}
		if(CarsLv1.cars[67] == 1){
            Labels.Saab_SonettIILabel.setIcon(ImagesHolder.Saab_SonettIIIcon);
            Labels.Saab_SonettIILabel.setText("Saab SonettII");
		}
		if(CarsLv1.cars[71] == 1){
            Labels.Renault_FlorideLabel.setIcon(ImagesHolder.Renault_FlorideIcon);
            Labels.Renault_FlorideLabel.setText("Renault Floride");
		}
		if(CarsLv1.cars[75] == 1){
            Labels.BMW_e34Label.setIcon(ImagesHolder.BMW_e34Icon);
            Labels.BMW_e34Label.setText("BMW e34");
		}
		if(CarsLv1.cars[79] == 1){
            Labels.Chrysler_CordobaLabel.setIcon(ImagesHolder.Chrysler_CordobaIcon);
            Labels.Chrysler_CordobaLabel.setText("Chrysler Cordoba");
		}
		if(CarsLv2.cars[3] == 1){
			Labels.Buick_RivieraLabel.setIcon(ImagesHolder.Buick_RivieraIcon);
			Labels.Buick_RivieraLabel.setText("Buick Riviera");
		}
		if(CarsLv2.cars[7] == 1){
			Labels.Tesla_RoadsterLabel.setIcon(ImagesHolder.Tesla_RoadsterIcon);
			Labels.Tesla_RoadsterLabel.setText("Tesla Roadster");
		}
		if(CarsLv2.cars[11] == 1){
			Labels.Audi_80Label.setIcon(ImagesHolder.Audi_80Icon);
			Labels.Audi_80Label.setText("Audi 80");
		}
		if(CarsLv2.cars[15] == 1){
			Labels.BMW_e36Label.setIcon(ImagesHolder.BMW_e36Icon);
			Labels.BMW_e36Label.setText("BMW e36");
		}
		if(CarsLv2.cars[19] == 1){
			Labels.Volkswagen_SciroccoLabel.setIcon(ImagesHolder.Volkswagen_SciroccoIcon);
			Labels.Volkswagen_SciroccoLabel.setText("Volkswagen Scirocco");
		}
		if(CarsLv2.cars[23] == 1){
			Labels.Mazda_3Label.setIcon(ImagesHolder.Mazda_3Icon);
			Labels.Mazda_3Label.setText("Mazda 3");
		}
		if(CarsLv2.cars[27] == 1){
			Labels.Chevrolet_VikingLabel.setIcon(ImagesHolder.Chevrolet_VikingIcon);
			Labels.Chevrolet_VikingLabel.setText("Chevrolet Viking");
		}
		if(CarsLv2.cars[31] == 1){
			Labels.Tesla_SLabel.setIcon(ImagesHolder.Tesla_SIcon);
			Labels.Tesla_SLabel.setText("Tesla S");
		}
		if(CarsLv2.cars[35] == 1){
			Labels.Jeep_ZJLabel.setIcon(ImagesHolder.Jeep_ZJIcon);
			Labels.Jeep_ZJLabel.setText("Jeep ZJ");
		}
		if(CarsLv2.cars[39] == 1){
			Labels.Dodge_NeonLabel.setIcon(ImagesHolder.Dodge_NeonIcon);
			Labels.Dodge_NeonLabel.setText("Dodge Neon");
		}
		if(CarsLv2.cars[43] == 1){
			Labels.BMW_e30Label.setIcon(ImagesHolder.BMW_e30Icon);
			Labels.BMW_e30Label.setText("BMW e30");
		}
		if(CarsLv2.cars[47] == 1){
			Labels.Mercedes_Benz_W123Label.setIcon(ImagesHolder.Mercedes_Benz_W123Icon);
			Labels.Mercedes_Benz_W123Label.setText("Mercedes Benz W123");
		}
		if(CarsLv2.cars[51] == 1){
			Labels.Land_Rover_DefenderLabel.setIcon(ImagesHolder.Land_Rover_DefenderIcon);
			Labels.Land_Rover_DefenderLabel.setText("Land Rover Defender");
		}
		if(CarsLv2.cars[55] == 1){
			Labels.Saab_9_5Label.setIcon(ImagesHolder.Saab_9_5Icon);
			Labels.Saab_9_5Label.setText("Saab 9-5");
		}
		if(CarsLv2.cars[59] == 1){
			Labels.Aston_Martin_OneLabel.setIcon(ImagesHolder.Aston_Martin_OneIcon);
			Labels.Aston_Martin_OneLabel.setText("Aston Martin One");
		}
		if(CarsLv2.cars[63] == 1){
			Labels.Koenigsegg_RegeraLabel.setIcon(ImagesHolder.Koenigsegg_RegeraIcon);
			Labels.Koenigsegg_RegeraLabel.setText("Koenigsegg Regera");
		}
		if(CarsLv2.cars[67] == 1){
			Labels.Lexus_ISLabel.setIcon(ImagesHolder.Lexus_ISIcon);
			Labels.Lexus_ISLabel.setText("Lexus IS");
		}
		if(CarsLv2.cars[71] == 1){
			Labels.GMC_YukonLabel.setIcon(ImagesHolder.GMC_YukonIcon);
			Labels.GMC_YukonLabel.setText("GMC Yukon");
		}
		if(CarsLv2.cars[75] == 1){
			Labels.Opel_AstraLabel.setIcon(ImagesHolder.Opel_AstraIcon);
			Labels.Opel_AstraLabel.setText("Opel Astra");
		}
		if(CarsLv2.cars[79] == 1){
			Labels.Audi_CoupeLabel.setIcon(ImagesHolder.Audi_CoupeIcon);
			Labels.Audi_CoupeLabel.setText("Audi Coupe");
		}
		if(CarsLv3.cars[3] == 1){
			Labels.Mini_MokeLabel.setIcon(ImagesHolder.Mini_MokeIcon);
			Labels.Mini_MokeLabel.setText("Mini Moke");
		}
		if(CarsLv3.cars[7] == 1){
			Labels.Kia_RondoLabel.setIcon(ImagesHolder.Kia_RondoIcon);
			Labels.Kia_RondoLabel.setText("Kia Rondo");
		}
		if(CarsLv3.cars[11] == 1){
			Labels.GMC_SuburbanLabel.setIcon(ImagesHolder.GMC_SuburbanIcon);
			Labels.GMC_SuburbanLabel.setText("GMC Suburban");
		}
		if(CarsLv3.cars[15] == 1){
			Labels.Honda_PreludeLabel.setIcon(ImagesHolder.Honda_PreludeIcon);
			Labels.Honda_PreludeLabel.setText("Honda Prelude");
		}
		if(CarsLv3.cars[19] == 1){
			Labels.Citroen_SaxoLabel.setIcon(ImagesHolder.Citroen_SaxoIcon);
			Labels.Citroen_SaxoLabel.setText("Citroen Saxo");
		}
		if(CarsLv3.cars[23] == 1){
			Labels.Volkswagen_TiguanLabel.setIcon(ImagesHolder.Volkswagen_TiguanIcon);
			Labels.Volkswagen_TiguanLabel.setText("Volkswagen Tiguan");
		}
		if(CarsLv3.cars[27] == 1){
			Labels.Volkswagen_PhaetonLabel.setIcon(ImagesHolder.Volkswagen_PhaetonIcon);
			Labels.Volkswagen_PhaetonLabel.setText("Volkswagen Phaeton");
		}
		if(CarsLv3.cars[31] == 1){
			Labels.Buick_CentryLabel.setIcon(ImagesHolder.Buick_CentryIcon);
			Labels.Buick_CentryLabel.setText("Buick Centry");
		}
		if(CarsLv3.cars[35] == 1){
			Labels.Land_Rover_DiscoveryLabel.setIcon(ImagesHolder.Land_Rover_DiscoveryIcon);
			Labels.Land_Rover_DiscoveryLabel.setText("Land Rover Discovery");
		}
		if(CarsLv3.cars[39] == 1){
			Labels.Infiniti_EthereaLabel.setIcon(ImagesHolder.Infiniti_EthereaIcon);
			Labels.Infiniti_EthereaLabel.setText("Infiniti Etherea");
		}
		if(CarsLv3.cars[43] == 1){
			Labels.Peugeot_308Label.setIcon(ImagesHolder.Peugeot_308Icon);
			Labels.Peugeot_308Label.setText("Peugeot 308");
		}
		if(CarsLv3.cars[47] == 1){
			Labels.Toyota_AurisLabel.setIcon(ImagesHolder.Toyota_AurisIcon);
			Labels.Toyota_AurisLabel.setText("Toyota Auris");
		}
		if(CarsLv3.cars[51] == 1){
			Labels.Pagani_ZondaFLabel.setIcon(ImagesHolder.Pagani_ZondaFIcon);
			Labels.Pagani_ZondaFLabel.setText("Pagani ZondaF");
		}
		if(CarsLv3.cars[55] == 1){
			Labels.Lancia_PhedraLabel.setIcon(ImagesHolder.Lancia_PhedraIcon);
			Labels.Lancia_PhedraLabel.setText("Lancia Phedra");
		}
		if(CarsLv3.cars[59] == 1){
			Labels.Chevrolet_ImpalaLabel.setIcon(ImagesHolder.Chevrolet_ImpalaIcon);
			Labels.Chevrolet_ImpalaLabel.setText("Chevrolet Impala");
		}
		if(CarsLv3.cars[63] == 1){
			Labels.Porsche_BoxsterLabel.setIcon(ImagesHolder.Porsche_BoxsterIcon);
			Labels.Porsche_BoxsterLabel.setText("Porsche Boxster");
		}
		if(CarsLv3.cars[67] == 1){
			Labels.Aston_Martin_DB6Label.setIcon(ImagesHolder.Aston_Martin_DB6Icon);
			Labels.Aston_Martin_DB6Label.setText("Aston Martin DB6");
		}
		if(CarsLv3.cars[71] == 1){
			Labels.Vaz_2103Label.setIcon(ImagesHolder.Vaz_2103Icon);
			Labels.Vaz_2103Label.setText("Vaz 2103");
		}
		if(CarsLv3.cars[75] == 1){
			Labels.Hyundai_MistraLabel.setIcon(ImagesHolder.Hyundai_MistraIcon);
			Labels.Hyundai_MistraLabel.setText("Hyundai Mistra");
		}
		if(CarsLv3.cars[79] == 1){
			Labels.Mini_CountrymanLabel.setIcon(ImagesHolder.Mini_CountrymanIcon);
			Labels.Mini_CountrymanLabel.setText("Mini Countryman");
		}
		if(CarsLv4.cars[3] == 1){
			Labels.Mazda_MX6Label.setIcon(ImagesHolder.Mazda_MX6Icon);
			Labels.Mazda_MX6Label.setText("Mazda MX6");
		}
		if(CarsLv4.cars[7] == 1){
			Labels.Chrysler_DaytonaLabel.setIcon(ImagesHolder.Chrysler_DaytonaIcon);
			Labels.Chrysler_DaytonaLabel.setText("Chrysler Daytona");
		}
		if(CarsLv4.cars[11] == 1){
			Labels.Buick_RoadmasterLabel.setIcon(ImagesHolder.Buick_RoadmasterIcon);
			Labels.Buick_RoadmasterLabel.setText("Buick Roadmaster");
		}
		if(CarsLv4.cars[15] == 1){
			Labels.Volvo_S80Label.setIcon(ImagesHolder.Volvo_S80Icon);
			Labels.Volvo_S80Label.setText("Volvo S80");
		}
		if(CarsLv4.cars[19] == 1){
			Labels.Porsche_CaymanLabel.setIcon(ImagesHolder.Porsche_CaymanIcon);
			Labels.Porsche_CaymanLabel.setText("Porsche Cayman");
		}
		if(CarsLv4.cars[23] == 1){
			Labels.Volkswagen_BeetleLabel.setIcon(ImagesHolder.Volkswagen_BeetleIcon);
			Labels.Volkswagen_BeetleLabel.setText("Volkswagen Beetle");
		}
		if(CarsLv4.cars[27] == 1){
			Labels.Bugatti_EB110Label.setIcon(ImagesHolder.Bugatti_EB110Icon);
			Labels.Bugatti_EB110Label.setText("Bugatti EB110");
		}
		if(CarsLv4.cars[31] == 1){
			Labels.Opel_ZafiraLabel.setIcon(ImagesHolder.Opel_ZafiraIcon);
			Labels.Opel_ZafiraLabel.setText("Opel Zafira");
		}
		if(CarsLv4.cars[35] == 1){
			Labels.Saab_9000Label.setIcon(ImagesHolder.Saab_9000Icon);
			Labels.Saab_9000Label.setText("Saab 9000");
		}
		if(CarsLv4.cars[39] == 1){
			Labels.McLaren_F1Label.setIcon(ImagesHolder.McLaren_F1Icon);
			Labels.McLaren_F1Label.setText("McLaren F1");
		}
		if(CarsLv4.cars[43] == 1){
			Labels.Audi_R8Label.setIcon(ImagesHolder.Audi_R8Icon);
			Labels.Audi_R8Label.setText("Audi R8");
		}
		if(CarsLv4.cars[47] == 1){
			Labels.Alfa_Romeo_8CLabel.setIcon(ImagesHolder.Alfa_Romeo_8CIcon);
			Labels.Alfa_Romeo_8CLabel.setText("Alfa Romeo 8C");
		}
		if(CarsLv4.cars[51] == 1){
			Labels.Ford_FiestaLabel.setIcon(ImagesHolder.Ford_FiestaIcon);
			Labels.Ford_FiestaLabel.setText("Ford Fiesta");
		}
		if(CarsLv4.cars[55] == 1){
			Labels.Infiniti_Q50Label.setIcon(ImagesHolder.Infiniti_Q50Icon);
			Labels.Infiniti_Q50Label.setText("Infiniti Q50");
		}
		if(CarsLv4.cars[59] == 1){
			Labels.Maserati_5000GTLabel.setIcon(ImagesHolder.Maserati_5000GTIcon);
			Labels.Maserati_5000GTLabel.setText("Maserati 5000GT");
		}
		if(CarsLv4.cars[63] == 1){
			Labels.Mercedes_Benz_CLA250Label.setIcon(ImagesHolder.Mercedes_Benz_CLA250Icon);
			Labels.Mercedes_Benz_CLA250Label.setText("Mercedes Benz CLA250");
		}
		if(CarsLv4.cars[67] == 1){
			Labels.Lamborghini_GallardoLabel.setIcon(ImagesHolder.Lamborghini_GallardoIcon);
			Labels.Lamborghini_GallardoLabel.setText("Lamborghini Gallardo");
		}
		if(CarsLv4.cars[71] == 1){
			Labels.Mazda_RX7Label.setIcon(ImagesHolder.Mazda_RX7Icon);
			Labels.Mazda_RX7Label.setText("Mazda RX7");
		}
		if(CarsLv4.cars[75] == 1){
			Labels.Mitsubishi_ColtLabel.setIcon(ImagesHolder.Mitsubishi_ColtIcon);
			Labels.Mitsubishi_ColtLabel.setText("Mitsubishi Colt");
		}
		if(CarsLv4.cars[79] == 1){
			Labels.Kia_SorentoLabel.setIcon(ImagesHolder.Kia_SorentoIcon);
			Labels.Kia_SorentoLabel.setText("Kia Sorento");
		}
		if(CarsLv5.cars[3] == 1){
			Labels.Rolls_Royce_WraithLabel.setIcon(ImagesHolder.Rolls_Royce_WraithIcon);
			Labels.Rolls_Royce_WraithLabel.setText("Rolls Royce Wraith");
		}
		if(CarsLv5.cars[7] == 1){
			Labels.Lamborghini_DiabloLabel.setIcon(ImagesHolder.Lamborghini_DiabloIcon);
			Labels.Lamborghini_DiabloLabel.setText("Lamborghini Diablo");
		}
		if(CarsLv5.cars[11] == 1){
			Labels.Jeep_ScramblerLabel.setIcon(ImagesHolder.Jeep_ScramblerIcon);
			Labels.Jeep_ScramblerLabel.setText("Jeep Scrambler");
		}
		if(CarsLv5.cars[15] == 1){
			Labels.Bentley_ContinentalLabel.setIcon(ImagesHolder.Bentley_ContinentalIcon);
			Labels.Bentley_ContinentalLabel.setText("Bentley Continental");
		}
		if(CarsLv5.cars[19] == 1){
			Labels.Bentley_AzureLabel.setIcon(ImagesHolder.Bentley_AzureIcon);
			Labels.Bentley_AzureLabel.setText("Bentley Azure");
		}
		if(CarsLv5.cars[23] == 1){
			Labels.Koenigsegg_OneLabel.setIcon(ImagesHolder.Koenigsegg_OneIcon);
			Labels.Koenigsegg_OneLabel.setText("Koenigsegg One");
		}
		if(CarsLv5.cars[27] == 1){
			Labels.Cadilliac_XTSLabel.setIcon(ImagesHolder.Cadilliac_XTSIcon);
			Labels.Cadilliac_XTSLabel.setText("Cadilliac XTS");
		}
		if(CarsLv5.cars[31] == 1){
			Labels.Fiat_500Label.setIcon(ImagesHolder.Fiat_500Icon);
			Labels.Fiat_500Label.setText("Fiat 500");
		}
		if(CarsLv5.cars[35] == 1){
			Labels.Mitsubishi_PajeroLabel.setIcon(ImagesHolder.Mitsubishi_PajeroIcon);
			Labels.Mitsubishi_PajeroLabel.setText("Mitsubishi Pajero");
		}
		if(CarsLv5.cars[39] == 1){
			Labels.Moskvich_2140Label.setIcon(ImagesHolder.Moskvich_2140Icon);
			Labels.Moskvich_2140Label.setText("Moskvich 2140");
		}
		if(CarsLv5.cars[43] == 1){
			Labels.Opel_GTLabel.setIcon(ImagesHolder.Opel_GTIcon);
			Labels.Opel_GTLabel.setText("Opel GT");
		}
		if(CarsLv5.cars[47] == 1){
			Labels.Hyundai_GetzLabel.setIcon(ImagesHolder.Hyundai_GetzIcon);
			Labels.Hyundai_GetzLabel.setText("Hyundai Getz");
		}
		if(CarsLv5.cars[51] == 1){
			Labels.Maserati_CoupeLabel.setIcon(ImagesHolder.Maserati_CoupeIcon);
			Labels.Maserati_CoupeLabel.setText("Maserati Coupe");
		}
		if(CarsLv5.cars[55] == 1){
			Labels.Honda_S2000Label.setIcon(ImagesHolder.Honda_S2000Icon);
			Labels.Honda_S2000Label.setText("Honda S2000");
		}
		if(CarsLv5.cars[59] == 1){
			Labels.Alfa_Romeo_SpiderLabel.setIcon(ImagesHolder.Alfa_Romeo_SpiderIcon);
			Labels.Alfa_Romeo_SpiderLabel.setText("Alfa Romeo Spider");
		}
		if(CarsLv5.cars[63] == 1){
			Labels.BMW_M5Label.setIcon(ImagesHolder.BMW_M5Icon);
			Labels.BMW_M5Label.setText("BMW M5");
		}
		if(CarsLv5.cars[67] == 1){
			Labels.BMW_I8Label.setIcon(ImagesHolder.BMW_I8Icon);
			Labels.BMW_I8Label.setText("BMW I8");
		}
		if(CarsLv5.cars[71] == 1){
			Labels.Citroen_C5Label.setIcon(ImagesHolder.Citroen_C5Icon);
			Labels.Citroen_C5Label.setText("Citroen C5");
		}
		if(CarsLv5.cars[75] == 1){
			Labels.Fiat_PuntoLabel.setIcon(ImagesHolder.Fiat_PuntoIcon);
			Labels.Fiat_PuntoLabel.setText("Fiat Punto");
		}
		if(CarsLv5.cars[79] == 1){
			Labels.Audi_100Label.setIcon(ImagesHolder.Audi_100Icon);
			Labels.Audi_100Label.setText("Audi 100");
		}
		if(CarsLv6.cars[3] == 1){
			Labels.Rolls_Royce_PhantomLabel.setIcon(ImagesHolder.Rolls_Royce_PhantomIcon);
			Labels.Rolls_Royce_PhantomLabel.setText("Rolls Royce Phantom");
		}
		if(CarsLv6.cars[7] == 1){
			Labels.Toyota_86Label.setIcon(ImagesHolder.Toyota_86Icon);
			Labels.Toyota_86Label.setText("Toyota 86");
		}
		if(CarsLv6.cars[11] == 1){
			Labels.BMW_e70Label.setIcon(ImagesHolder.BMW_e70Icon);
			Labels.BMW_e70Label.setText("BMW e70");
		}
		if(CarsLv6.cars[15] == 1){
			Labels.Chrysler_VoyagerLabel.setIcon(ImagesHolder.Chrysler_VoyagerIcon);
			Labels.Chrysler_VoyagerLabel.setText("Chrysler Voyager");
		}
		if(CarsLv6.cars[19] == 1){
			Labels.Rolls_Royce_PhantomIIILabel.setIcon(ImagesHolder.Rolls_Royce_PhantomIIIIcon);
			Labels.Rolls_Royce_PhantomIIILabel.setText("Rolls Royce PhantomIII");
		}
		if(CarsLv6.cars[23] == 1){
			Labels.Honda_CRXLabel.setIcon(ImagesHolder.Honda_CRXIcon);
			Labels.Honda_CRXLabel.setText("Honda CRX");
		}
		if(CarsLv6.cars[27] == 1){
			Labels.Subaru_1000Label.setIcon(ImagesHolder.Subaru_1000Icon);
			Labels.Subaru_1000Label.setText("Subaru 1000");
		}
		if(CarsLv6.cars[31] == 1){
			Labels.Cadilliac_EldoradoLabel.setIcon(ImagesHolder.Cadilliac_EldoradoIcon);
			Labels.Cadilliac_EldoradoLabel.setText("Cadilliac Eldorado");
		}
		if(CarsLv6.cars[35] == 1){
			Labels.Land_Rover_FreelanderLabel.setIcon(ImagesHolder.Land_Rover_FreelanderIcon);
			Labels.Land_Rover_FreelanderLabel.setText("Land Rover Freelander");
		}
		if(CarsLv6.cars[39] == 1){
			Labels.Renault_SpiderLabel.setIcon(ImagesHolder.Renault_SpiderIcon);
			Labels.Renault_SpiderLabel.setText("Renault Spider");
		}
		if(CarsLv6.cars[44] == 1){
			Labels.Gaz_21Label.setIcon(ImagesHolder.Gaz_21Icon);
			Labels.Gaz_21Label.setText("Gaz 21");
		}
		if(CarsLv6.cars[47] == 1){
			Labels.Acura_ELLabel.setIcon(ImagesHolder.Acura_ELIcon);
			Labels.Acura_ELLabel.setText("Acura EL");
		}
		if(CarsLv6.cars[51] == 1){
			Labels.Bugatti_VeyronLabel.setIcon(ImagesHolder.Bugatti_VeyronIcon);
			Labels.Bugatti_VeyronLabel.setText("Bugatti Veyron");
		}
		if(CarsLv6.cars[55] == 1){
			Labels.Mercedes_Benz_SL600Label.setIcon(ImagesHolder.Mercedes_Benz_SL600Icon);
			Labels.Mercedes_Benz_SL600Label.setText("Mercedes Benz SL600");
		}
		if(CarsLv6.cars[59] == 1){
			Labels.Rolls_Royce_SilverLabel.setIcon(ImagesHolder.Rolls_Royce_SilverIcon);
			Labels.Rolls_Royce_SilverLabel.setText("Rolls Royce Silver");
		}
		if(CarsLv6.cars[63] == 1){
			Labels.Mini_PacemanLabel.setIcon(ImagesHolder.Mini_PacemanIcon);
			Labels.Mini_PacemanLabel.setText("Mini Paceman");
		}
		if(CarsLv6.cars[67] == 1){
			Labels.Hyundai_ExcelLabel.setIcon(ImagesHolder.Hyundai_ExcelIcon);
			Labels.Hyundai_ExcelLabel.setText("Hyundai Excel");
		}
		if(CarsLv6.cars[71] == 1){
			Labels.Gaz_24Label.setIcon(ImagesHolder.Gaz_24Icon);
			Labels.Gaz_24Label.setText("Gaz 24");
		}
		if(CarsLv6.cars[75] == 1){
			Labels.Peugeot_107Label.setIcon(ImagesHolder.Peugeot_107Icon);
			Labels.Peugeot_107Label.setText("Peugeot 107");
		}
		if(CarsLv6.cars[79] == 1){
			Labels.Audi_A4Label.setIcon(ImagesHolder.Audi_A4Icon);
			Labels.Audi_A4Label.setText("Audi A4");
		}
		if(CarsLv7.cars[3] == 1){
			Labels.Lamborghini_AventadorLabel.setIcon(ImagesHolder.Lamborghini_AventadorIcon);
			Labels.Lamborghini_AventadorLabel.setText("Lamborghini Aventador");
		}
		if(CarsLv7.cars[5] == 1){
			Labels.Nissan_350zLabel.setIcon(ImagesHolder.Nissan_350zIcon);
			Labels.Nissan_350zLabel.setText("Nissan 350z");
		}
		if(CarsLv7.cars[11] == 1){
			Labels.Jaguar_XJ6Label.setIcon(ImagesHolder.Jaguar_XJ6Icon);
			Labels.Jaguar_XJ6Label.setText("Jaguar XJ6");
		}
		if(CarsLv7.cars[15] == 1){
			Labels.Renault_ClioLabel.setIcon(ImagesHolder.Renault_ClioIcon);
			Labels.Renault_ClioLabel.setText("Renault Clio");
		}
		if(CarsLv7.cars[19] == 1){
			Labels.Toyota_AvensisLabel.setIcon(ImagesHolder.Toyota_AvensisIcon);
			Labels.Toyota_AvensisLabel.setText("Toyota Avensis");
		}
		if(CarsLv7.cars[23] == 1){
			Labels.Subaru_OutbackLabel.setIcon(ImagesHolder.Subaru_OutbackIcon);
			Labels.Subaru_OutbackLabel.setText("Subaru Outback");
		}
		if(CarsLv7.cars[27] == 1){
			Labels.Saab_900Label.setIcon(ImagesHolder.Saab_900Icon);
			Labels.Saab_900Label.setText("Saab 900");
		}
		if(CarsLv7.cars[31] == 1){
			Labels.Opel_VectraLabel.setIcon(ImagesHolder.Opel_VectraIcon);
			Labels.Opel_VectraLabel.setText("Opel Vectra");
		}
		if(CarsLv7.cars[35] == 1){
			Labels.Chrysler_ChargerLabel.setIcon(ImagesHolder.Chrysler_ChargerIcon);
			Labels.Chrysler_ChargerLabel.setText("Chrysler Charger");
		}
		if(CarsLv7.cars[39] == 1){
			Labels.Ferrari_348Label.setIcon(ImagesHolder.Ferrari_348Icon);
			Labels.Ferrari_348Label.setText("Ferrari 348");
		}
		if(CarsLv7.cars[43] == 1){
			Labels.Hyundai_XGLabel.setIcon(ImagesHolder.Hyundai_XGIcon);
			Labels.Hyundai_XGLabel.setText("Hyundai XG");
		}
		if(CarsLv7.cars[47] == 1){
			Labels.Lexus_RXLabel.setIcon(ImagesHolder.Lexus_RXIcon);
			Labels.Lexus_RXLabel.setText("Lexus RX");
		}
		if(CarsLv7.cars[51] == 1){
			Labels.Dodge_400Label.setIcon(ImagesHolder.Dodge_400Icon);
			Labels.Dodge_400Label.setText("Dodge 400");
		}
		if(CarsLv7.cars[55] == 1){
			Labels.GMC_TerrainLabel.setIcon(ImagesHolder.GMC_TerrainIcon);
			Labels.GMC_TerrainLabel.setText("GMC Terrain");
		}
		if(CarsLv7.cars[59] == 1){
			Labels.Volvo_C70Label.setIcon(ImagesHolder.Volvo_C70Icon);
			Labels.Volvo_C70Label.setText("Volvo C70");
		}
		if(CarsLv7.cars[63] == 1){
			Labels.Ford_SierraLabel.setIcon(ImagesHolder.Ford_SierraIcon);
			Labels.Ford_SierraLabel.setText("Ford Sierra");
		}
		if(CarsLv7.cars[67] == 1){
			Labels.Subaru_ImprezaLabel.setIcon(ImagesHolder.Subaru_ImprezaIcon);
			Labels.Subaru_ImprezaLabel.setText("Subaru Impreza");
		}
		if(CarsLv7.cars[71] == 1){
			Labels.BMW_e90Label.setIcon(ImagesHolder.BMW_e90Icon);
			Labels.BMW_e90Label.setText("BMW e90");
		}
		if(CarsLv7.cars[75] == 1){
			Labels.Nissan_SkylineLabel.setIcon(ImagesHolder.Nissan_SkylineIcon);
			Labels.Nissan_SkylineLabel.setText("Nissan Skyline");
		}
		if(CarsLv7.cars[79] == 1){
			Labels.Audi_Q7Label.setIcon(ImagesHolder.Audi_Q7Icon);
			Labels.Audi_Q7Label.setText("Audi Q7");
		}
		if(CarsLv8.cars[3] == 1){
			Labels.Bentley_ArnageLabel.setIcon(ImagesHolder.Bentley_ArnageIcon);
			Labels.Bentley_ArnageLabel.setText("Bentley Arnage");
		}
		if(CarsLv8.cars[7] == 1){
			Labels.Volvo_850Label.setIcon(ImagesHolder.Volvo_850Icon);
			Labels.Volvo_850Label.setText("Volvo 850");
		}
		if(CarsLv8.cars[11] == 1){
			Labels.Toyota_Rav4Label.setIcon(ImagesHolder.Toyota_Rav4Icon);
			Labels.Toyota_Rav4Label.setText("Toyota Rav4");
		}
		if(CarsLv8.cars[15] == 1){
			Labels.Ford_FocusLabel.setIcon(ImagesHolder.Ford_FocusIcon);
			Labels.Ford_FocusLabel.setText("Ford Focus");
		}
		if(CarsLv8.cars[19] == 1){
			Labels.Chevrolet_SpinLabel.setIcon(ImagesHolder.Chevrolet_SpinIcon);
			Labels.Chevrolet_SpinLabel.setText("Chevrolet Spin");
		}
		if(CarsLv8.cars[23] == 1){
			Labels.Bentley_GTZLabel.setIcon(ImagesHolder.Bentley_GTZIcon);
			Labels.Bentley_GTZLabel.setText("Bentley GTZ");
		}
		if(CarsLv8.cars[27] == 1){
			Labels.Lexus_LSLabel.setIcon(ImagesHolder.Lexus_LSIcon);
			Labels.Lexus_LSLabel.setText("Lexus LS");
		}
		if(CarsLv8.cars[31] == 1){
			Labels.Land_Rover_RangeRoverLabel.setIcon(ImagesHolder.Land_Rover_RangeRoverIcon);
			Labels.Land_Rover_RangeRoverLabel.setText("Land Rover RangeRover");
		}
		if(CarsLv8.cars[35] == 1){
			Labels.Lexus_GXLabel.setIcon(ImagesHolder.Lexus_GXIcon);
			Labels.Lexus_GXLabel.setText("Lexus GX");
		}
		if(CarsLv8.cars[39] == 1){
			Labels.Jeep_WranglerLabel.setIcon(ImagesHolder.Jeep_WranglerIcon);
			Labels.Jeep_WranglerLabel.setText("Jeep Wrangler");
		}
		if(CarsLv8.cars[43] == 1){
			Labels.Maserati_GranTurismoLabel.setIcon(ImagesHolder.Maserati_GranTurismoIcon);
			Labels.Maserati_GranTurismoLabel.setText("Maserati GranTurismo");
		}
		if(CarsLv8.cars[47] == 1){
			Labels.Koenigsegg_AgeraLabel.setIcon(ImagesHolder.Koenigsegg_AgeraIcon);
			Labels.Koenigsegg_AgeraLabel.setText("Koenigsegg Agera");
		}
		if(CarsLv8.cars[51] == 1){
			Labels.Acura_MDXLabel.setIcon(ImagesHolder.Acura_MDXIcon);
			Labels.Acura_MDXLabel.setText("Acura MDX");
		}
		if(CarsLv8.cars[55] == 1){
			Labels.Audi_RS6Label.setIcon(ImagesHolder.Audi_RS6Icon);
			Labels.Audi_RS6Label.setText("Audi RS6");
		}
		if(CarsLv8.cars[59] == 1){
			Labels.Cadilliac_DeVilleLabel.setIcon(ImagesHolder.Cadilliac_DeVilleIcon);
			Labels.Cadilliac_DeVilleLabel.setText("Cadilliac DeVille");
		}
		if(CarsLv8.cars[63] == 1){
			Labels.McLaren_VenenoLabel.setIcon(ImagesHolder.McLaren_VenenoIcon);
			Labels.McLaren_VenenoLabel.setText("McLaren Veneno");
		}
		if(CarsLv8.cars[67] == 1){
			Labels.Tesla_XLabel.setIcon(ImagesHolder.Tesla_XIcon);
			Labels.Tesla_XLabel.setText("Tesla X");
		}
		if(CarsLv8.cars[71] == 1){
			Labels.Mercedes_Benz_G55Label.setIcon(ImagesHolder.Mercedes_Benz_G55Icon);
			Labels.Mercedes_Benz_G55Label.setText("Mercedes Benz G55");
		}
		if(CarsLv8.cars[75] == 1){
			Labels.Lancia_LybraLabel.setIcon(ImagesHolder.Lancia_LybraIcon);
			Labels.Lancia_LybraLabel.setText("Lancia Lybra");
		}
		if(CarsLv8.cars[79] == 1){
			Labels.Infiniti_QX60Label.setIcon(ImagesHolder.Infiniti_QX60Icon);
			Labels.Infiniti_QX60Label.setText("Infiniti QX60");
		}
		if(CarsLv9.cars[3] == 1){
			Labels.Kia_ForteLabel.setIcon(ImagesHolder.Kia_ForteIcon);
			Labels.Kia_ForteLabel.setText("Kia Forte");
		}
		if(CarsLv9.cars[7] == 1){
			Labels.Lancia_VoyagerLabel.setIcon(ImagesHolder.Lancia_VoyagerIcon);
			Labels.Lancia_VoyagerLabel.setText("Lancia Voyager");
		}
		if(CarsLv9.cars[11] == 1){
			Labels.Porsche_CayenneLabel.setIcon(ImagesHolder.Porsche_CayenneIcon);
			Labels.Porsche_CayenneLabel.setText("Porsche Cayenne");
		}
		if(CarsLv9.cars[15] == 1){
			Labels.McLaren_650sLabel.setIcon(ImagesHolder.McLaren_650sIcon);
			Labels.McLaren_650sLabel.setText("McLaren 650s");
		}
		if(CarsLv9.cars[19] == 1){
			Labels.Jaguar_E_TypeLabel.setIcon(ImagesHolder.Jaguar_E_TypeIcon);
			Labels.Jaguar_E_TypeLabel.setText("Jaguar E-Type");
		}
		if(CarsLv9.cars[23] == 1){
			Labels.Peugeot_601Label.setIcon(ImagesHolder.Peugeot_601Icon);
			Labels.Peugeot_601Label.setText("Peugeot 601");
		}
		if(CarsLv9.cars[27] == 1){
			Labels.Jaguar_F_TypeLabel.setIcon(ImagesHolder.Jaguar_F_TypeIcon);
			Labels.Jaguar_F_TypeLabel.setText("Jaguar F-Type");
		}
		if(CarsLv9.cars[31] == 1){
			Labels.Fiat_DobloLabel.setIcon(ImagesHolder.Fiat_DobloIcon);
			Labels.Fiat_DobloLabel.setText("Fiat Doblo");
		}
		if(CarsLv9.cars[35] == 1){
			Labels.Vaz_2101Label.setIcon(ImagesHolder.Vaz_2101Icon);
			Labels.Vaz_2101Label.setText("Vaz 2101");
		}
		if(CarsLv9.cars[39] == 1){
			Labels.McLaren_P1Label.setIcon(ImagesHolder.McLaren_P1Icon);
			Labels.McLaren_P1Label.setText("McLaren P1");
		}
		if(CarsLv9.cars[43] == 1){
			Labels.Peugeot_405Label.setIcon(ImagesHolder.Peugeot_405Icon);
			Labels.Peugeot_405Label.setText("Peugeot 405");
		}
		if(CarsLv9.cars[47] == 1){
			Labels.GMC_EnvoyLabel.setIcon(ImagesHolder.GMC_EnvoyIcon);
			Labels.GMC_EnvoyLabel.setText("GMC Envoy");
		}
		if(CarsLv9.cars[51] == 1){
			Labels.Chevrolet_CorveteLabel.setIcon(ImagesHolder.Chevrolet_CorveteIcon);
			Labels.Chevrolet_CorveteLabel.setText("Chevrolet Corvete");
		}
		if(CarsLv9.cars[55] == 1){
			Labels.Pagani_HuayraLabel.setIcon(ImagesHolder.Pagani_HuayraIcon);
			Labels.Pagani_HuayraLabel.setText("Pagani Huayra");
		}
		if(CarsLv9.cars[59] == 1){
			Labels.Moskvich_402Label.setIcon(ImagesHolder.Moskvich_402Icon);
			Labels.Moskvich_402Label.setText("Moskvich 402");
		}
		if(CarsLv9.cars[63] == 1){
			Labels.Alfa_Romeo_159Label.setIcon(ImagesHolder.Alfa_Romeo_159Icon);
			Labels.Alfa_Romeo_159Label.setText("Alfa Romeo 159");
		}
		if(CarsLv9.cars[67] == 1){
			Labels.Renault_FregateLabel.setIcon(ImagesHolder.Renault_FregateIcon);
			Labels.Renault_FregateLabel.setText("Renault Fregate");
		}
		if(CarsLv9.cars[71] == 1){
			Labels.Mini_CooperLabel.setIcon(ImagesHolder.Mini_CooperIcon);
			Labels.Mini_CooperLabel.setText("Mini Cooper");
		}
		if(CarsLv9.cars[75] == 1){
			Labels.Dodge_ViperLabel.setIcon(ImagesHolder.Dodge_ViperIcon);
			Labels.Dodge_ViperLabel.setText("Dodge Viper");
		}
		if(CarsLv9.cars[79] == 1){
			Labels.Vaz_NivaLabel.setIcon(ImagesHolder.Vaz_NivaIcon);
			Labels.Vaz_NivaLabel.setText("Vaz Niva");
		}
		if(CarsLv10.cars[3] == 1){
			Labels.Jaguar_X_TypeLabel.setIcon(ImagesHolder.Jaguar_X_TypeIcon);
			Labels.Jaguar_X_TypeLabel.setText("Jaguar X-Type");
		}
		if(CarsLv10.cars[7] == 1){
			Labels.Ferrari_308Label.setIcon(ImagesHolder.Ferrari_308Icon);
			Labels.Ferrari_308Label.setText("Ferrari 308");
		}
		if(CarsLv10.cars[11] == 1){
			Labels.Mazda_626Label.setIcon(ImagesHolder.Mazda_626Icon);
			Labels.Mazda_626Label.setText("Mazda 626");
		}
		if(CarsLv10.cars[15] == 1){
			Labels.Maserati_ShamalLabel.setIcon(ImagesHolder.Maserati_ShamalIcon);
			Labels.Maserati_ShamalLabel.setText("Maserati Shamal");
		}
		if(CarsLv10.cars[19] == 1){
			Labels.Nissan_240sxLabel.setIcon(ImagesHolder.Nissan_240sxIcon);
			Labels.Nissan_240sxLabel.setText("Nissan 240sx");
		}
		if(CarsLv10.cars[23] == 1){
			Labels.Alfa_Romeo_4CLabel.setIcon(ImagesHolder.Alfa_Romeo_4CIcon);
			Labels.Alfa_Romeo_4CLabel.setText("Alfa Romeo 4C");
		}
		if(CarsLv10.cars[27] == 1){
			Labels.Nissan_JukeLabel.setIcon(ImagesHolder.Nissan_JukeIcon);
			Labels.Nissan_JukeLabel.setText("Nissan Juke");
		}
		if(CarsLv10.cars[31] == 1){
			Labels.Volkswagen_Golf1Label.setIcon(ImagesHolder.Volkswagen_Golf1Icon);
			Labels.Volkswagen_Golf1Label.setText("Volkswagen Golf1");
		}
		if(CarsLv10.cars[35] == 1){
			Labels.Jeep_GladiatorLabel.setIcon(ImagesHolder.Jeep_GladiatorIcon);
			Labels.Jeep_GladiatorLabel.setText("Jeep Gladiator");
		}
		if(CarsLv10.cars[39] == 1){
			Labels.Dodge_MatadorLabel.setIcon(ImagesHolder.Dodge_MatadorIcon);
			Labels.Dodge_MatadorLabel.setText("Dodge Matador");
		}
		if(CarsLv10.cars[43] == 1){
			Labels.Bugatti_RoyaleLabel.setIcon(ImagesHolder.Bugatti_RoyaleIcon);
			Labels.Bugatti_RoyaleLabel.setText("Bugatti Royale");
		}
		if(CarsLv10.cars[47] == 1){
			Labels.Citroen_CXLabel.setIcon(ImagesHolder.Citroen_CXIcon);
			Labels.Citroen_CXLabel.setText("Citroen CX");
		}
		if(CarsLv10.cars[51] == 1){
			Labels.Lamborghini_350GTLabel.setIcon(ImagesHolder.Lamborghini_350GTIcon);
			Labels.Lamborghini_350GTLabel.setText("Lamborghini 350GT");
		}
		if(CarsLv10.cars[55] == 1){
			Labels.Mitsubishi_GTOLabel.setIcon(ImagesHolder.Mitsubishi_GTOIcon);
			Labels.Mitsubishi_GTOLabel.setText("Mitsubishi GTO");
		}
		if(CarsLv10.cars[59] == 1){
			Labels.Buick_InvictaLabel.setIcon(ImagesHolder.Buick_InvictaIcon);
			Labels.Buick_InvictaLabel.setText("Buick Invicta");
		}
		if(CarsLv10.cars[63] == 1){
			Labels.Porsche_911Label.setIcon(ImagesHolder.Porsche_911Icon);
			Labels.Porsche_911Label.setText("Porsche 911");
		}
		if(CarsLv10.cars[67] == 1){
			Labels.Subaru_ForesterLabel.setIcon(ImagesHolder.Subaru_ForesterIcon);
			Labels.Subaru_ForesterLabel.setText("Subaru Forester");
		}
		if(CarsLv10.cars[71] == 1){
			Labels.Citroen_BXLabel.setIcon(ImagesHolder.Citroen_BXIcon);
			Labels.Citroen_BXLabel.setText("Citroen BX");
		}
		if(CarsLv10.cars[75] == 1){
			Labels.Bugatti_Type252Label.setIcon(ImagesHolder.Bugatti_Type252Icon);
			Labels.Bugatti_Type252Label.setText("Bugatti Type252");
		}
		if(CarsLv10.cars[79] == 1){
			Labels.Ferrari_488Label.setIcon(ImagesHolder.Ferrari_488Icon);
			Labels.Ferrari_488Label.setText("Ferrari 488");
		}
    }

    public void SaveFile(){
    	try{
    		File SaveFile = new File("SaveFile.sav");
    		if(!SaveFile.exists()) {
    		    SaveFile.createNewFile();
    		} 
    		FileOutputStream saveFileSub = new FileOutputStream(SaveFile);
    		ObjectOutputStream save = new ObjectOutputStream(saveFileSub);
    		
    		save.writeObject(CarMain.main);
    		save.writeObject(Box.boxes);
    		save.writeObject(CarFrame.frames);
    		save.writeObject(Part.parts);
    		save.writeObject(CarsLv1.cars);
    		save.writeObject(CarsLv2.cars);
    		save.writeObject(CarsLv3.cars);
    		save.writeObject(CarsLv4.cars);
    		save.writeObject(CarsLv5.cars);
    		save.writeObject(CarsLv6.cars);
    		save.writeObject(CarsLv7.cars);
    		save.writeObject(CarsLv8.cars);
    		save.writeObject(CarsLv9.cars);
    		save.writeObject(CarsLv10.cars);
    		save.writeObject(Statistic.statistic);
    		
    		save.close();
    		}
    		catch(Exception exc){
    		exc.printStackTrace();
    		}
    }
    
    public void LoadFile(){
    try{
		File SaveFile = new File("SaveFile.sav");
		FileInputStream SaveFileSub = new FileInputStream(SaveFile);
		ObjectInputStream load = new ObjectInputStream(SaveFileSub);

		CarMain.main = (Integer[]) load.readObject();
		Box.boxes = (Integer[]) load.readObject();
		CarFrame.frames = (Integer[]) load.readObject();
		Part.parts = (Integer[]) load.readObject();
		CarsLv1.cars = (Integer[]) load.readObject();
		CarsLv2.cars = (Integer[]) load.readObject();
		CarsLv3.cars = (Integer[]) load.readObject();
		CarsLv4.cars = (Integer[]) load.readObject();
		CarsLv5.cars = (Integer[]) load.readObject();
		CarsLv6.cars = (Integer[]) load.readObject();
		CarsLv7.cars = (Integer[]) load.readObject();
		CarsLv8.cars = (Integer[]) load.readObject();
		CarsLv9.cars = (Integer[]) load.readObject();
		CarsLv10.cars = (Integer[]) load.readObject();
		Statistic.statistic = (Integer[]) load.readObject();
		
		load.close();
		}
		catch(Exception exc){
		exc.printStackTrace();
		}
		}
    
    //Button Click
    
   public void actionPerformed(ActionEvent ae) {
	   	   
	    //Money Button Click
        if(ae.getSource() == jbtnMoney) {       	
            CarMain.main[0] += 1;   
            CarMain.main[1] += 1;
        }
        
        //Boxes Button Click       
        if(ae.getSource() == jbtnBoxes){
        	CarMain.main[2] += 1;
            CarMain.main[3] += 1;
            System.out.println(AmericanCars());
            if(CarMain.main[2] == 5){
                CarMain.main[2] -= 5;
                if(CarMain.main[4] == 1){
                    Box.boxes[1] = Box.boxes[1] + 1;
                    JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}                  
                if(CarMain.main[4] == 2){ 
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(2)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                    	Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    }
                if(CarMain.main[4] == 3){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(3)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                    	Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 3){
                    	Box.boxes[5] = Box.boxes[5] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    }
                if(CarMain.main[4] == 4){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(4)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                    	Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 3){
                    	Box.boxes[5] = Box.boxes[5] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 4){
                    	Box.boxes[7] = Box.boxes[7] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    }
               
                if(CarMain.main[4] == 5){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(5)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                    	Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 3){
                    	Box.boxes[5] = Box.boxes[5] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 4){
                    	Box.boxes[7] = Box.boxes[7] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 5){
                    	Box.boxes[9] = Box.boxes[9] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    }
               
                if(CarMain.main[4] == 6){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(6)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.boxes[5] = Box.boxes[5] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.boxes[7] = Box.boxes[7] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.boxes[9] = Box.boxes[9] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.boxes[11] = Box.boxes[11] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    }
                if(CarMain.main[4] == 7){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(7)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.boxes[5] = Box.boxes[5] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.boxes[7] = Box.boxes[7] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.boxes[9] = Box.boxes[9] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.boxes[11] = Box.boxes[11] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 7){
                        Box.boxes[13] = Box.boxes[13] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 7 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
                    }              
                if(CarMain.main[4] == 8){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(8)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.boxes[5] = Box.boxes[5] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.boxes[7] = Box.boxes[7] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.boxes[9] = Box.boxes[9] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.boxes[11] = Box.boxes[11] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 7){
                        Box.boxes[13] = Box.boxes[13] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 7 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
                    if (randomInt == 8){
                        Box.boxes[15] = Box.boxes[15] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 8 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
                    }  
                if(CarMain.main[4] == 9){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(9)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.boxes[5] = Box.boxes[5] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.boxes[7] = Box.boxes[7] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.boxes[9] = Box.boxes[9] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.boxes[11] = Box.boxes[11] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 7){
                        Box.boxes[13] = Box.boxes[13] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 7 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
                    if (randomInt == 8){
                        Box.boxes[15] = Box.boxes[15] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 8 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
                    if (randomInt == 9){
                        Box.boxes[17] = Box.boxes[17] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 9 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv9_10Icon);}
                    }  
                if(CarMain.main[4] == 10){
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(10)+1;
                    if (randomInt == 1){
                        Box.boxes[1] = Box.boxes[1] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 2){
                        Box.boxes[3] = Box.boxes[3] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 2 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    if (randomInt == 3){
                        Box.boxes[5] = Box.boxes[5] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 3 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 4){
                        Box.boxes[7] = Box.boxes[7] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 4 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
                    if (randomInt == 5){
                        Box.boxes[9] = Box.boxes[9] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 5 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 6){
                        Box.boxes[11] = Box.boxes[11] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 6 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
                    if (randomInt == 7){
                        Box.boxes[13] = Box.boxes[13] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 7 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
                    if (randomInt == 8){
                        Box.boxes[15] = Box.boxes[15] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 8 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
                    if (randomInt == 9){
                        Box.boxes[17] = Box.boxes[17] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 9 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv9_10Icon);}                  
                    if (randomInt == 10){
                        Box.boxes[19] = Box.boxes[19] + 1;
                        JOptionPane.showMessageDialog (null, "You have gained 10 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv9_10Icon);}
                    }     
            }
        }    
        // Upgrade Player Level Button Click
        
        if(ae.getSource() == jbtnUpgradeLevel){          	
        	for (int i =9; i >=0; i--){            		
        		   if (CarMain.main[5] == i){
                   	if (CarMain.main[0] >= 100*i){
                   		CarMain.main[0] = CarMain.main[0] - (100*i);
                   		CarMain.main[5] = CarMain.main[5] + 1;
                   		JOptionPane.showMessageDialog (null, "You have purchased " + CarMain.main[5] + " Player level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.PlayerIcon);}                      	
                   	else{                       	
                   		JOptionPane.showMessageDialog (null, "You dont have enought money. This Upgrade costs 100*Next LVL!", "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}               
                   }            		   
        	}
        	if (CarMain.main[5] == 10){
 			   JOptionPane.showMessageDialog(null, "You have gained MAX Player level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
 		   }
        } 
        
        // Upgrade Garage Level Button Click
        
        if(ae.getSource() == jbtnUpgradeGarageLevel){          	
        	for (int i =9; i >=0; i--){            		
        		   if (CarMain.main[6] == i){
                   	if (CarMain.main[0] >= 100*i){
                   		CarMain.main[0] = CarMain.main[0] - (100*i);
                   		CarMain.main[6] = CarMain.main[6] + 1;
                   		CarMain.main[7] = CarMain.main[7] + 25;
                   		JOptionPane.showMessageDialog (null, "You have purchased " + CarMain.main[6] + " garage level. Now you can carry 25 more cars!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GarageIcon);}                      	
                   	else{                       	
                   		JOptionPane.showMessageDialog (null, "You dont have enought money. This Upgrade costs 100*Next LVL!", "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}               
                   }            		   
        	}
        	if (CarMain.main[6] == 10){
 			   JOptionPane.showMessageDialog(null, "You have gained MAX Garage level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
 		   }
        } 
        
        // Upgrade Boxes Level Button Click
        
        if(ae.getSource() == jbtnUpgradeBoxesLevel){          	
        	for (int i =9; i >=0; i--){            		
        		   if (CarMain.main[4] == i){
                   	if (CarMain.main[0] >= 100*i){
                   		CarMain.main[0] = CarMain.main[0] - (100*i);
                   		CarMain.main[4] = CarMain.main[4] + 1;
                   		JOptionPane.showMessageDialog (null, "You have purchased " + CarMain.main[4] + " BOX level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv9_10Icon);}                      	
                   	else{                       	
                   		JOptionPane.showMessageDialog (null, "You dont have enought money. This Upgrade costs 100*Next LVL!", "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}               
                   }
        	}
        	if (CarMain.main[4] == 10){
  			   JOptionPane.showMessageDialog(null, "You have gained MAX Garage level!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
  		   }
        }
        
        // Buy Frame Level 1 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv1){
        	if (CarMain.main[5] >=1){
        		if (CarMain.main[0] >= CarFrame.frames[0]){
        			CarFrame.frames[1] = CarFrame.frames[1] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[0]; 
        			JOptionPane.showMessageDialog(null, "You have bought 1 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[0], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 2 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv2){
        	if (CarMain.main[5] >=2){
        		if (CarMain.main[0] >= CarFrame.frames[2]){
        			CarFrame.frames[3] = CarFrame.frames[3] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[2];
        			JOptionPane.showMessageDialog(null, "You have bought 2 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[2], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 3 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv3){
        	if (CarMain.main[5] >=3){
        		if (CarMain.main[0] >= CarFrame.frames[4]){
        			CarFrame.frames[5] = CarFrame.frames[5] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[4];
        			JOptionPane.showMessageDialog(null, "You have bought 3 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[4], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 4 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv4){
        	if (CarMain.main[5] >=4){
        		if (CarMain.main[0] >= CarFrame.frames[6]){
        			CarFrame.frames[7] = CarFrame.frames[7] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[6];
        			JOptionPane.showMessageDialog(null, "You have bought 4 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[6], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 5 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv5){
        	if (CarMain.main[5] >=5){
        		if (CarMain.main[0] >= CarFrame.frames[8]){
        			CarFrame.frames[9] = CarFrame.frames[9] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[8];
        			JOptionPane.showMessageDialog(null, "You have bought 5 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[8], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 6 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv6){
        	if (CarMain.main[5] >=6){
        		if (CarMain.main[0] >= CarFrame.frames[10]){
        			CarFrame.frames[11] = CarFrame.frames[11] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[10];
        			JOptionPane.showMessageDialog(null, "You have bought 6 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[10], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 7 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv7){
        	if (CarMain.main[5] >=7){
        		if (CarMain.main[0] >= CarFrame.frames[12]){
        			CarFrame.frames[13] = CarFrame.frames[13] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[12];
        			JOptionPane.showMessageDialog(null, "You have bought 7 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[12], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 8 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv8){
        	if (CarMain.main[5] >=8){
        		if (CarMain.main[0] >= CarFrame.frames[14]){
        			CarFrame.frames[15] = CarFrame.frames[15] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[14];
        			JOptionPane.showMessageDialog(null, "You have bought 8 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[14], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 9 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv9){
        	if (CarMain.main[5] >=9){
        		if (CarMain.main[0] >= CarFrame.frames[16]){
        			CarFrame.frames[17] = CarFrame.frames[17] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[16];
        			JOptionPane.showMessageDialog(null, "You have bought 9 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[16], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Frame Level 10 Button Click
        
        if(ae.getSource() == jbtnBuyFrameLv10){
        	if (CarMain.main[5] >=10){
        		if (CarMain.main[0] >= CarFrame.frames[18]){
        			CarFrame.frames[19] = CarFrame.frames[19] + 1;
        			CarMain.main[0] = CarMain.main[0] - CarFrame.frames[18];
        			JOptionPane.showMessageDialog(null, "You have bought 10 LVL Car Frame!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CarFrameIcon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This frame costs: " + CarFrame.frames[18], "No money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);
        		}
        	}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        }
        
        // Buy Box Level 1 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv1){
        	if (CarMain.main[5] >=1){
        		if (CarMain.main[0] >= Box.boxes[0]){
        			Box.boxes[1] = Box.boxes[1] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[0];
        			JOptionPane.showMessageDialog(null, "You have bought 1 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[0], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 2 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv2){
        	if (CarMain.main[5] >=2){
        		if (CarMain.main[0] >= Box.boxes[2]){
        			Box.boxes[3] = Box.boxes[3] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[2];
        			JOptionPane.showMessageDialog(null, "You have bought 2 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[2], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 3 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv3){
        	if (CarMain.main[5] >=3){
        		if (CarMain.main[0] >= Box.boxes[4]){
        			Box.boxes[5] = Box.boxes[5] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[4];
        			JOptionPane.showMessageDialog(null, "You have bought 3 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[4], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 4 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv4){
        	if (CarMain.main[5] >=4){
        		if (CarMain.main[0] >= Box.boxes[6]){
        			Box.boxes[7] = Box.boxes[7] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[6];
        			JOptionPane.showMessageDialog(null, "You have bought 4 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv3_4Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[6], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 5 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv5){
        	if (CarMain.main[5] >=5){
        		if (CarMain.main[0] >= Box.boxes[8]){
        			Box.boxes[9] = Box.boxes[9] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[8];
        			JOptionPane.showMessageDialog(null, "You have bought 5 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[8], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 6 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv6){
        	if (CarMain.main[5] >=6){
        		if (CarMain.main[0] >= Box.boxes[10]){
        			Box.boxes[11] = Box.boxes[11] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[10];
        			JOptionPane.showMessageDialog(null, "You have bought 6 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv5_6Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[10], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 7 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv7){
        	if (CarMain.main[5] >=7){
        		if (CarMain.main[0] >= Box.boxes[12]){
        			Box.boxes[13] = Box.boxes[13] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[12];;
        			JOptionPane.showMessageDialog(null, "You have bought 7 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[12], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 8 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv8){
        	if (CarMain.main[5] >=8){
        		if (CarMain.main[0] >= Box.boxes[14]){
        			Box.boxes[15] = Box.boxes[15] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[14];
        			JOptionPane.showMessageDialog(null, "You have bought 8 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv7_8Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[14], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 9 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv9){
        	if (CarMain.main[5] >=9){
        		if (CarMain.main[0] >= Box.boxes[16]){
        			Box.boxes[17] = Box.boxes[17] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[16];
        			JOptionPane.showMessageDialog(null, "You have bought 9 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv9_10Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[16], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Buy Box Level 10 Button Click
        
        if(ae.getSource() == jbtnBuyBoxLv10){
        	if (CarMain.main[5] >=10){
        		if (CarMain.main[0] >= Box.boxes[18]){
        			Box.boxes[19] = Box.boxes[19] + 1;
        			CarMain.main[0] = CarMain.main[0] - Box.boxes[18];
        			JOptionPane.showMessageDialog(null, "You have bought 10 LVL Box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv9_10Icon);}
        		else{
        			JOptionPane.showMessageDialog(null, "You don't have enought money! This Box costs: " + Box.boxes[18], "No Money", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoMoneyIcon);}
        		}
        	else{
        		JOptionPane.showMessageDialog(null, "You don't have enought Player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
        	}
        	}
        
        // Open Box Level 1 Button Click
        
        if(ae.getSource() == jbtnPartsLv1){
        	if (Box.boxes[1] > 0){
        		if (CarMain.main[4] >=1){
        			if (CarMain.main[5] >=1){
        				Box.boxes[1] = Box.boxes[1] - 1;
        				Random randomGenerator = new Random();
        				for (int i =0; i <2; i++ ){
        					int randomInt = randomGenerator.nextInt(13)+1;           					
                 		    if (randomInt == 1){
                		    	Part.parts[1] = Part.parts[1] + 1;
                 		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
                		    if (randomInt == 2){
                		    	Part.parts[3] = Part.parts[3] + 1;;
                		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
                		    if (randomInt == 3){
                		    	Part.parts[5] = Part.parts[5] + 1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
                		    if (randomInt == 4){
                		    	Part.parts[7] = Part.parts[7] + 1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
                		    if (randomInt == 5){
                		    	Part.parts[9] = Part.parts[9] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
                		    if (randomInt == 6){
                		    	Part.parts[11] = Part.parts[11] + 1;           		    	   		
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
                		    if (randomInt == 7){
                		    	Part.parts[13] = Part.parts[13] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL !1", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
                		    if (randomInt == 8){
                		    	Part.parts[15] = Part.parts[15] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
                		    if (randomInt == 9){
                		    	Part.parts[17] = Part.parts[17] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
                		    if (randomInt == 10){
                		    	Part.parts[19] = Part.parts[19] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
                		    if (randomInt == 11){
                		    	Part.parts[21] = Part.parts[21] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
                		    if (randomInt == 12){
                		    	Part.parts[23] = Part.parts[23] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
                		    if (randomInt == 13){
                		    	Part.parts[25] = Part.parts[25] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
        					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
        
        // Open Box Level 2 Button Click
        
        if(ae.getSource() == jbtnPartsLv2){
        	if (Box.boxes[3] > 0){
        		if (CarMain.main[4] >=2){
        			if (CarMain.main[5] >=2){
        				Box.boxes[3] = Box.boxes[3] - 1;
        				Random randomGenerator = new Random();
        				for (int i =0; i <2; i++ ){
        					int randomInt = randomGenerator.nextInt(13)+1;     					
                		    if (randomInt == 1){
                		    	Part.parts[27] = Part.parts[27] + 1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
                		    if (randomInt == 2){
                		    	Part.parts[29] = Part.parts[29] + 1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
                		    if (randomInt == 3){
                		    	Part.parts[31] = Part.parts[31] + 1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
                		    if (randomInt == 4){
                		    	Part.parts[33] = Part.parts[33] + 1;
                		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
                		    if (randomInt == 5){
                		    	Part.parts[35] = Part.parts[35] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
                		    if (randomInt == 6){
                		    	Part.parts[37] = Part.parts[37] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
                		    if (randomInt == 7){
                		    	Part.parts[39] = Part.parts[39] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
                		    if (randomInt == 8){
                		    	Part.parts[41] = Part.parts[41] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
                		    if (randomInt == 9){
                		    	Part.parts[43] = Part.parts[43] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
                		    if (randomInt == 10){
                		    	Part.parts[45] = Part.parts[45] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
                		    if (randomInt == 11){
                		    	Part.parts[47] = Part.parts[47] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
                		    if (randomInt == 12){
                		    	Part.parts[49] = Part.parts[49] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
                		    if (randomInt == 13){
                		    	Part.parts[51] = Part.parts[51] + 1;
         		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 2!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
        					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
        
        // Open Box Level 3 Button Click
        
        if(ae.getSource() == jbtnPartsLv3){
        	if (Box.boxes[5] > 0){
        		if (CarMain.main[4] >=3){
        			if (CarMain.main[5] >=3){
        				Box.boxes[5] = Box.boxes[5] - 1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.parts[53] = Part.parts[53] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.parts[55] = Part.parts[55] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.parts[57] = Part.parts[57] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.parts[59] = Part.parts[59] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
            		    if (randomInt == 5){
            		    	Part.parts[61] = Part.parts[61] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
            		    if (randomInt == 6){
            		    	Part.parts[63] = Part.parts[63] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
            		    if (randomInt == 7){
            		    	Part.parts[65] = Part.parts[65] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
            		    if (randomInt == 8){
            		    	Part.parts[67] = Part.parts[67] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
            		    if (randomInt == 9){
            		    	Part.parts[69] = Part.parts[69] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
            		    if (randomInt == 10){
            		    	Part.parts[71] = Part.parts[71] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
            		    if (randomInt == 11){
            		    	Part.parts[73] = Part.parts[73] + 1;;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
            		    if (randomInt == 12){
            		    	Part.parts[75] = Part.parts[75] + 1;;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
            		    if (randomInt == 13){
            		    	Part.parts[77] = Part.parts[77] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
        
        // Open Box Level 4 Button Click
        
        if(ae.getSource() == jbtnPartsLv4){
        	if (Box.boxes[7] > 0){
        		if (CarMain.main[4] >=4){
        			if (CarMain.main[5] >=4){
        				Box.boxes[7] = Box.boxes[7] - 1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.parts[79] = Part.parts[79] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.parts[81] = Part.parts[81] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.parts[83] = Part.parts[83] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.parts[85] = Part.parts[85] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
            		    if (randomInt == 5){
            		    	Part.parts[87] = Part.parts[87] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
            		    if (randomInt == 6){
            		    	Part.parts[89] = Part.parts[89] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
            		    if (randomInt == 7){
            		    	Part.parts[91] = Part.parts[91] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
            		    if (randomInt == 8){
            		    	Part.parts[93] = Part.parts[93] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
            		    if (randomInt == 9){
            		    	Part.parts[95] = Part.parts[95] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
            		    if (randomInt == 10){
            		    	Part.parts[97] = Part.parts[97] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
            		    if (randomInt == 11){
            		    	Part.parts[99] = Part.parts[99] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
            		    if (randomInt == 12){
            		    	Part.parts[101] = Part.parts[101] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
            		    if (randomInt == 13){
            		    	Part.parts[103] = Part.parts[103] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
        
        // Open Box Level 5 Button Click
        
        if(ae.getSource() == jbtnPartsLv5){
        	if (Box.boxes[9] > 0){
        		if (CarMain.main[4] >=5){
        			if (CarMain.main[5] >=5){
        				Box.boxes[9] = Box.boxes[9] - 1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.parts[105] = Part.parts[105] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.parts[107] = Part.parts[107] + 1;;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.parts[109] = Part.parts[109] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.parts[111] = Part.parts[111] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
            		    if (randomInt == 5){
            		    	Part.parts[113] = Part.parts[113] + 1;;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
            		    if (randomInt == 6){
            		    	Part.parts[115] = Part.parts[115] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
            		    if (randomInt == 7){
            		    	Part.parts[117] = Part.parts[117] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
            		    if (randomInt == 8){
            		    	Part.parts[119] = Part.parts[119] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
            		    if (randomInt == 9){
            		    	Part.parts[121] = Part.parts[121] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
            		    if (randomInt == 10){
            		    	Part.parts[123] = Part.parts[123] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
            		    if (randomInt == 11){
            		    	Part.parts[125] = Part.parts[125] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
            		    if (randomInt == 12){
            		    	Part.parts[127] = Part.parts[127] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmisson LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
            		    if (randomInt == 13){
            		    	Part.parts[129] = Part.parts[129] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
        
        // Open Box Level 6 Button Click
        
        if(ae.getSource() == jbtnPartsLv6){
        	if (Box.boxes[11] > 0){
        		if (CarMain.main[4] >=6){
        			if (CarMain.main[5] >=6){
        				Box.boxes[11] = Box.boxes[11] - 1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.parts[131] = Part.parts[131] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.parts[133] = Part.parts[133] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.parts[135] = Part.parts[135] + 1;;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.parts[137] = Part.parts[137] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
            		    if (randomInt == 5){
            		    	Part.parts[139] = Part.parts[139] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
            		    if (randomInt == 6){
            		    	Part.parts[141] = Part.parts[141] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
            		    if (randomInt == 7){
            		    	Part.parts[143] = Part.parts[143] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
            		    if (randomInt == 8){
            		    	Part.parts[145] = Part.parts[145] + 1;;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
            		    if (randomInt == 9){
            		    	Part.parts[147] = Part.parts[147] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
            		    if (randomInt == 10){
            		    	Part.parts[149] = Part.parts[149] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
            		    if (randomInt == 11){
            		    	Part.parts[151] = Part.parts[151] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
            		    if (randomInt == 12){
            		    	Part.parts[153] = Part.parts[153] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
            		    if (randomInt == 13){
            		    	Part.parts[155] = Part.parts[155] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
        
        // Open Box Level 7 Button Click
        
        if(ae.getSource() == jbtnPartsLv7){
        	if (Box.boxes[13] > 0){
        		if (CarMain.main[4] >=7){
        			if (CarMain.main[5] >=7){
        				Box.boxes[13] = Box.boxes[13] - 1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.parts[157] = Part.parts[157] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.parts[159] = Part.parts[159] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.parts[161] = Part.parts[161] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.parts[163] = Part.parts[163] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
            		    if (randomInt == 5){
            		    	Part.parts[165] = Part.parts[165] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
            		    if (randomInt == 6){
            		    	Part.parts[167] = Part.parts[167] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
            		    if (randomInt == 7){
            		    	Part.parts[169] = Part.parts[169] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
            		    if (randomInt == 8){
            		    	Part.parts[171] = Part.parts[171] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
            		    if (randomInt == 9){
            		    	Part.parts[173] = Part.parts[173] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
            		    if (randomInt == 10){
            		    	Part.parts[175] = Part.parts[175] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
            		    if (randomInt == 11){
            		    	Part.parts[177] = Part.parts[177] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
            		    if (randomInt == 12){
            		    	Part.parts[179] = Part.parts[179] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
            		    if (randomInt == 13){
            		    	Part.parts[181] = Part.parts[181] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
        
        // Open Box Level 8 Button Click
        
        if(ae.getSource() == jbtnPartsLv8){
        	if (Box.boxes[15] > 0){
        		if (CarMain.main[4] >=8){
        			if (CarMain.main[5] >=8){
        				Box.boxes[15] = Box.boxes[15] - 1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.parts[183] = Part.parts[183] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.parts[185] = Part.parts[185] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.parts[187] = Part.parts[187] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.parts[189] = Part.parts[189] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
            		    if (randomInt == 5){
            		    	Part.parts[191] = Part.parts[191] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
            		    if (randomInt == 6){
            		    	Part.parts[193] = Part.parts[193] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
            		    if (randomInt == 7){
            		    	Part.parts[195] = Part.parts[195] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}                    		
     		    	   	if (randomInt == 8){
     		    	   		Part.parts[197] = Part.parts[197] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
            		    if (randomInt == 9){
            		    	Part.parts[199] = Part.parts[199] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
            		    if (randomInt == 10){
            		    	Part.parts[201] = Part.parts[201] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
            		    if (randomInt == 11){
            		    	Part.parts[203] = Part.parts[203] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
            		    if (randomInt == 12){
            		    	Part.parts[205] = Part.parts[205] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
            		    if (randomInt == 13){
            		    	Part.parts[207] = Part.parts[207] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
     		    	   		}
        				}
        			}
        			else{
            				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}        			        			
        		}                	        	
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        }
        
        // Open Box Level 9 Button Click
        
        if(ae.getSource() == jbtnPartsLv9){
        	if (Box.boxes[17] > 0){
        		if (CarMain.main[4] >=9){
        			if (CarMain.main[5] >=9){
        				Box.boxes[17] = Box.boxes[17] - 1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
            		    int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.parts[209] = Part.parts[209] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.parts[211] = Part.parts[211] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.parts[213] = Part.parts[213] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.parts[215] = Part.parts[215] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
            		    if (randomInt == 5){
            		    	Part.parts[217] = Part.parts[217] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
            		    if (randomInt == 6){
            		    	Part.parts[219] = Part.parts[219] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
            		    if (randomInt == 7){
            		    	Part.parts[221] = Part.parts[221] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
            		    if (randomInt == 8){
            		    	Part.parts[223] = Part.parts[223] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
            		    if (randomInt == 9){
            		    	Part.parts[225] = Part.parts[225] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
            		    if (randomInt == 10){
            		    	Part.parts[227] = Part.parts[227] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
            		    if (randomInt == 11){
            		    	Part.parts[229] = Part.parts[229] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
            		    if (randomInt == 12){
            		    	Part.parts[231] = Part.parts[231] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
            		    if (randomInt == 13){
            		    	Part.parts[233] = Part.parts[233] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
    					}
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
        
        // Open Box Level 10 Button Click
        
        if(ae.getSource() == jbtnPartsLv10){
        	if (Box.boxes[19] > 0){
        		if (CarMain.main[4] >=10){
        			if (CarMain.main[5] >=10){
        				Box.boxes[19] = Box.boxes[19] - 1;
        				Random randomGenerator = new Random();
    					for (int i =0; i <2; i++){
    					int randomInt = randomGenerator.nextInt(13)+1;
            		    if (randomInt == 1){
            		    	Part.parts[235] = Part.parts[235] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Accessories LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesIcon);}
            		    if (randomInt == 2){
            		    	Part.parts[237] = Part.parts[237] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Body LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodyIcon);}
            		    if (randomInt == 3){
            		    	Part.parts[239] = Part.parts[239] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Brakes LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesIcon);}
            		    if (randomInt == 4){
            		    	Part.parts[241] = Part.parts[241] + 1;
            		    	JOptionPane.showMessageDialog (null, "You have gained Cooling LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingIcon);}
            		    if (randomInt == 5){
            		    	Part.parts[243] = Part.parts[243] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Electronics LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsIcon);}
            		    if (randomInt == 6){
            		    	Part.parts[245] = Part.parts[245] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Engine LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineIcon);}
            		    if (randomInt == 7){
            		    	Part.parts[247] = Part.parts[247] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Exaust LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustIcon);}
            		    if (randomInt == 8){
            		    	Part.parts[249] = Part.parts[249] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Fuel LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelIcon);}
            		    if (randomInt == 9){
            		    	Part.parts[251] = Part.parts[251] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Interior LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorIcon);}
            		    if (randomInt == 10){
            		    	Part.parts[253] = Part.parts[253] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Steering LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringIcon);}
            		    if (randomInt == 11){
            		    	Part.parts[255] = Part.parts[255] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Suspension LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionIcon);}
            		    if (randomInt == 12){
            		    	Part.parts[257] = Part.parts[257] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Transmission LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionIcon);}
            		    if (randomInt == 13){
            		    	Part.parts[259] = Part.parts[259] + 1;
     		    	   		JOptionPane.showMessageDialog (null, "You have gained Tires LVL 10!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresIcon);}
    					}          					   
        				}
        			else{
        				JOptionPane.showMessageDialog (null, "Not Enought Player Level!", "No Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);}
        			}           	                	
        		}
        	else{
        		JOptionPane.showMessageDialog (null, "No more boxes left!", "No Boxes", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoBoxesIcon);}
        	}
               
        // Sell Accessories Level 1 Button Click
         
        if(ae.getSource() == jbtnSellAccessoriesLv1){
        	if (Part.parts[1] >0){
        		Part.parts[1] = Part.parts[1] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[0];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 1 LVL For: " +Part.parts[0], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
            
        // Sell Accessories Level 2 Button Click
      	
        }
        if(ae.getSource() == jbtnSellAccessoriesLv2){
        	if (Part.parts[27] >0){
        		Part.parts[27] = Part.parts[27] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[26];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 2 LVL For: " +Part.parts[26], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Accessories Level 3 Button Click
  
        if(ae.getSource() == jbtnSellAccessoriesLv3){
        	if (Part.parts[53] >0){
        		Part.parts[53] = Part.parts[53] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[52];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 3 LVL For: " +Part.parts[52], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Accessories Level 4 Button Click
  
        if(ae.getSource() == jbtnSellAccessoriesLv4){
        	if (Part.parts[79] >0){
        		Part.parts[79] = Part.parts[79] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[78];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 4 LVL For: " +Part.parts[78], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Accessories Level 5 Button Click
  
        if(ae.getSource() == jbtnSellAccessoriesLv5){
        	if (Part.parts[105] >0){
        		Part.parts[105] = Part.parts[105] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[104];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 5 LVL For: " +Part.parts[104], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Accessories Level 6 Button Click
  
        if(ae.getSource() == jbtnSellAccessoriesLv6){
        	if (Part.parts[131] >0){
        		Part.parts[131] = Part.parts[131] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[130];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 6 LVL For: " +Part.parts[130], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Accessories Level 7 Button Click
  
        if(ae.getSource() == jbtnSellAccessoriesLv7){
        	if (Part.parts[157] >0){
        		Part.parts[157] = Part.parts[157] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[156];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 7 LVL For: " +Part.parts[156], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Accessories Level 8 Button Click
  
        if(ae.getSource() == jbtnSellAccessoriesLv8){
        	if (Part.parts[183] >0){
        		Part.parts[183] = Part.parts[183] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[182];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 8 LVL For: " +Part.parts[182], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Accessories Level 9 Button Click
  
        if(ae.getSource() == jbtnSellAccessoriesLv9){
        	if (Part.parts[209] >0){
        		Part.parts[209] = Part.parts[209] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[208];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 9 LVL For: " +Part.parts[208], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
         // Sell Accessories Level 10 Button Click
  
        if(ae.getSource() == jbtnSellAccessoriesLv10){
        	if (Part.parts[235] >0){
        		Part.parts[235] = Part.parts[235] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[234];
        		JOptionPane.showMessageDialog (null, "You have sold Accessories 10 LVL For: " +Part.parts[234], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.AccessoriesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 1 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv1){
        	if (Part.parts[3] >0){
        		Part.parts[3] = Part.parts[3] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[2];
        		JOptionPane.showMessageDialog (null, "You have sold Body 1 LVL For: " +Part.parts[2], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 2 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv2){
        	if (Part.parts[29] >0){
        		Part.parts[29] = Part.parts[29] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[28];
        		JOptionPane.showMessageDialog (null, "You have sold Body 2 LVL For: " +Part.parts[28], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 3 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv3){
        	if (Part.parts[55] >0){
        		Part.parts[55] = Part.parts[55] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[54];
        		JOptionPane.showMessageDialog (null, "You have sold Body 3 LVLFor: " + Part.parts[54], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 4 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv4){
        	if (Part.parts[81] >0){
        		Part.parts[81] = Part.parts[81] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[80];
        		JOptionPane.showMessageDialog (null, "You have sold Body 4 LVL For: " +Part.parts[80], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 5 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv5){
        	if (Part.parts[107] >0){
        		Part.parts[107] = Part.parts[107] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[106];
        		JOptionPane.showMessageDialog (null, "You have sold Body 5 LVL For: " +Part.parts[106], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 6 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv6){
        	if (Part.parts[133] >0){
        		Part.parts[133] = Part.parts[133] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[132];
        		JOptionPane.showMessageDialog (null, "You have sold Body 6 LVL For: " +Part.parts[132], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 7 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv7){
        	if (Part.parts[159] >0){
        		Part.parts[159] = Part.parts[159] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[158];
        		JOptionPane.showMessageDialog (null, "You have sold Body 7 LVL For: " +Part.parts[158], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 8 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv8){
        	if (Part.parts[185] >0){
        		Part.parts[185] = Part.parts[185] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[184];
        		JOptionPane.showMessageDialog (null, "You have sold Body 8 LVL For: " +Part.parts[184], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 9 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv9){
        	if (Part.parts[211] >0){
        		Part.parts[211] = Part.parts[211] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[210];
        		JOptionPane.showMessageDialog (null, "You have sold Body 9 LVL For: " +Part.parts[210], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Body Level 10 Button Click
 
        if(ae.getSource() == jbtnSellBodyLv10){
        	if (Part.parts[237] >0){
        		Part.parts[237] = Part.parts[237] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[236];
        		JOptionPane.showMessageDialog (null, "You have sold Body 10 LVL For: " +Part.parts[236], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BodySoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 1 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv1){
        	if (Part.parts[5] >0){
        		Part.parts[5] = Part.parts[5] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[4];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 1 LVL For: " +Part.parts[4], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 2 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv2){
        	if (Part.parts[31] >0){
        		Part.parts[31] = Part.parts[31] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[30];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 2 LVL For: " +Part.parts[30], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 3 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv3){
        	if (Part.parts[57] >0){
        		Part.parts[57] = Part.parts[57] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[56];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 3 LVL For: " +Part.parts[56], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 4 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv4){
        	if (Part.parts[83] >0){
        		Part.parts[83] = Part.parts[83] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[82];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 4 LVL For: " +Part.parts[82], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 5 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv5){
        	if (Part.parts[109] >0){
        		Part.parts[109] = Part.parts[109] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[108];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 5 LVL For: " +Part.parts[108], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 6 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv6){
        	if (Part.parts[135] >0){
        		Part.parts[135] = Part.parts[135] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[134];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 6 LVL For: " +Part.parts[134], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 7 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv7){
        	if (Part.parts[161] >0){
        		Part.parts[161] = Part.parts[161] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[160];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 7 LVL For: " +Part.parts[160], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 8 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv8){
        	if (Part.parts[187] >0){
        		Part.parts[187] = Part.parts[187] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[186];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 8 LVL For: " +Part.parts[186], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 9 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv9){
        	if (Part.parts[213] >0){
        		Part.parts[213] = Part.parts[213] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[212];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 9 LVL For: " +Part.parts[212], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Brakes Level 10 Button Click
 
        if(ae.getSource() == jbtnSellBrakesLv10){
        	if (Part.parts[239] >0){
        		Part.parts[239] = Part.parts[239] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[238];
        		JOptionPane.showMessageDialog (null, "You have sold Brakes 10 LVL For: " +Part.parts[238], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BrakesSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 1 Button Click
 
        if(ae.getSource() == jbtnSellCoolingLv1){
        	if (Part.parts[7] >0){
        		Part.parts[7] = Part.parts[7] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[6];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 1 LVL For: " +Part.parts[6], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 2 Button Click
 
        if(ae.getSource() == jbtnSellCoolingLv2){
        	if (Part.parts[33] >0){
        		Part.parts[33] = Part.parts[33] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[32];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 2 LVL For: " +Part.parts[32], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 3 Button Click
        
        if(ae.getSource() == jbtnSellCoolingLv3){
        	if (Part.parts[59] >0){
        		Part.parts[59] = Part.parts[59] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[58];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 3 LVL For: " +Part.parts[58], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 4 Button Click
      
        if(ae.getSource() == jbtnSellCoolingLv4){
        	if (Part.parts[85] >0){
        		Part.parts[85] = Part.parts[85] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[84];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 4 LVL For: " +Part.parts[84], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 5 Button Click
  
        if(ae.getSource() == jbtnSellCoolingLv1){
        	if (Part.parts[111] >0){
        		Part.parts[111] = Part.parts[111] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[110];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 5 LVL For: " +Part.parts[110], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 6 Button Click
 
        if(ae.getSource() == jbtnSellCoolingLv6){
        	if (Part.parts[137] >0){
        		Part.parts[137] = Part.parts[137] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[136];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 6 LVL For: " +Part.parts[136], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 7 Button Click
  
        if(ae.getSource() == jbtnSellCoolingLv7){
        	if (Part.parts[163] >0){
        		Part.parts[163] = Part.parts[163] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[162];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 7 LVL For: " +Part.parts[162], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 8 Button Click
 
        if(ae.getSource() == jbtnSellCoolingLv8){
        	if (Part.parts[189] >0){
        		Part.parts[189] = Part.parts[189] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[188];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 8 LVL For: " +Part.parts[188], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 9 Button Click
 
        if(ae.getSource() == jbtnSellCoolingLv9){
        	if (Part.parts[215] >0){
        		Part.parts[215] = Part.parts[215] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[214];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 9 LVL FFor: " +Part.parts[214], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Cooling Level 10 Button Click
 
        if(ae.getSource() == jbtnSellCoolingLv10){
        	if (Part.parts[241] >0){
        		Part.parts[241] = Part.parts[241] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[240];
        		JOptionPane.showMessageDialog (null, "You have sold Cooling 10 LVL For: " +Part.parts[240], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.CoolingSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 1 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv1){
        	if (Part.parts[9] >0){
        		Part.parts[9] = Part.parts[9] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[8];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 1 LVL For: " +Part.parts[8], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 2 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv2){
        	if (Part.parts[35] >0){
        		Part.parts[35] = Part.parts[35] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[34];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 2 LVL For: " +Part.parts[34], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 3 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv3){
        	if (Part.parts[61] >0){
        		Part.parts[61] = Part.parts[61] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[60];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 3 LVL For: " +Part.parts[60], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 4 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv4){
        	if (Part.parts[87] >0){
        		Part.parts[87] = Part.parts[87] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[86];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 4 LVL For: " +Part.parts[86], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 5 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv5){
        	if (Part.parts[113] >0){
        		Part.parts[113] = Part.parts[113] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[112];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 5 LVL For: " +Part.parts[112], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 6 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv6){
        	if (Part.parts[139] >0){
        		Part.parts[139] = Part.parts[139] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[138];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 6 LVL For: " +Part.parts[138], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 7 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv7){
        	if (Part.parts[165] >0){
        		Part.parts[165] = Part.parts[165] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[164];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 7 LVL For: " +Part.parts[164], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 8 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv8){
        	if (Part.parts[191] >0){
        		Part.parts[191] = Part.parts[191] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[190];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 8 LVL For: " +Part.parts[190], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 9 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv9){
        	if (Part.parts[217] >0){
        		Part.parts[217] = Part.parts[217] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[216];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 9 LVL For: " +Part.parts[216], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Electronics Level 10 Button Click
 
        if(ae.getSource() == jbtnSellElectronicsLv10){
        	if (Part.parts[243] >0){
        		Part.parts[243] = Part.parts[243] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[242];
        		JOptionPane.showMessageDialog (null, "You have sold Electronics 10 LVL For: " +Part.parts[242], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ElectronicsSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 1 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv1){
        	if (Part.parts[11] >0){
        		Part.parts[11] = Part.parts[11] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[10];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 1 LVL For For: " +Part.parts[10], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 2 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv2){
        	if (Part.parts[37] >0){
        		Part.parts[37] = Part.parts[37] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[36];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 2 LVL For: " +Part.parts[36], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 3 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv3){
        	if (Part.parts[63] >0){
        		Part.parts[63] = Part.parts[63] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[62];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 3 LVL For: " +Part.parts[62], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 4 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv4){
        	if (Part.parts[89] >0){
        		Part.parts[89] = Part.parts[89] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[88];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 4 LVL For: " +Part.parts[88], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 5 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv5){
        	if (Part.parts[115] >0){
        		Part.parts[115] = Part.parts[115] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[114];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 5 LVL For: " +Part.parts[114], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 6 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv6){
        	if (Part.parts[141] >0){
        		Part.parts[141] = Part.parts[141] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[140];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 6 LVL For: " +Part.parts[140], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 7 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv7){
        	if (Part.parts[167] >0){
        		Part.parts[167] = Part.parts[167] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[166];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 7 LVL For: " +Part.parts[166], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 8 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv8){
        	if (Part.parts[193] >0){
        		Part.parts[193] = Part.parts[193] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[192];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 8 LVL For: " +Part.parts[192], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 9 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv9){
        	if (Part.parts[219] >0){
        		Part.parts[219] = Part.parts[219] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[218];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 9 LVL For: " +Part.parts[218], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Engine Level 10 Button Click
 
        if(ae.getSource() == jbtnSellEngineLv10){
        	if (Part.parts[245] >0){
        		Part.parts[245] = Part.parts[245] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[244];
        		JOptionPane.showMessageDialog (null, "You have sold Engine 10 LVL For: " +Part.parts[244], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.EngineSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 1 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv1){
        	if (Part.parts[13] >0){
        		Part.parts[13] = Part.parts[13] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[12];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 1 LVL For: " +Part.parts[12], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 2 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv2){
        	if (Part.parts[39] >0){
        		Part.parts[39] = Part.parts[39] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[38];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 2 LVL For: " +Part.parts[38], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 3 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv3){
        	if (Part.parts[65] >0){
        		Part.parts[65] = Part.parts[65] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[64];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 3 LVL For: " +Part.parts[64], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 4 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv4){
        	if (Part.parts[91] >0){
        		Part.parts[91] = Part.parts[91] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[90];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 4 LVL For: " +Part.parts[90], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 5 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv5){
        	if (Part.parts[117] >0){
        		Part.parts[117] = Part.parts[117] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[116];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 5 LVL For: " +Part.parts[116], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 6 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv6){
        	if (Part.parts[143] >0){
        		Part.parts[143] = Part.parts[143] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[142];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 6 LVL For: " +Part.parts[142], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 7 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv7){
        	if (Part.parts[169] >0){
        		Part.parts[169] = Part.parts[169] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[168];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 7 LVL For: " +Part.parts[168], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 8 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv8){
        	if (Part.parts[195] >0){
        		Part.parts[195] = Part.parts[195] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[194];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 8 LVL For: " +Part.parts[194], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 9 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv9){
        	if (Part.parts[221] >0){
        		Part.parts[221] = Part.parts[221] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[220];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 9 LVL For: " +Part.parts[220], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Exaust Level 10 Button Click
 
        if(ae.getSource() == jbtnSellExaustLv10){
        	if (Part.parts[247] >0){
        		Part.parts[247] = Part.parts[247] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[246];
        		JOptionPane.showMessageDialog (null, "You have sold Exaust 10 LVL For: " +Part.parts[246], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.ExaustSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 1 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv1){
        	if (Part.parts[15] >0){
        		Part.parts[15] = Part.parts[15] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[14];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 1 LVL For: " +Part.parts[14], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 2 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv2){
        	if (Part.parts[41] >0){
        		Part.parts[41] = Part.parts[41] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[40];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 2 LVL For: " +Part.parts[40], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 3 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv3){
        	if (Part.parts[67] >0){
        		Part.parts[67] = Part.parts[67] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[66];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 3 LVL For: " +Part.parts[66], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 4 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv4){
        	if (Part.parts[93] >0){
        		Part.parts[93] = Part.parts[93] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[92];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 4 LVL For: " +Part.parts[92], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 5 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv5){
        	if (Part.parts[119] >0){
        		Part.parts[119] = Part.parts[119] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[118];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 5 LVL For: " +Part.parts[118], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 6 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv6){
        	if (Part.parts[145] >0){
        		Part.parts[145] = Part.parts[145] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[144];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 6 LVL FFor: " +Part.parts[144], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 7 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv7){
        	if (Part.parts[171] >0){
        		Part.parts[171] = Part.parts[171] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[170];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 7 LVL For: " +Part.parts[170], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 8 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv8){
        	if (Part.parts[197] >0){
        		Part.parts[197] = Part.parts[197] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[196];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 8 LVL For: " +Part.parts[196], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 9 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv9){
        	if (Part.parts[223] >0){
        		Part.parts[223] = Part.parts[223] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[222];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 9 LVL For: " +Part.parts[222], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Fuel Level 10 Button Click
 
        if(ae.getSource() == jbtnSellFuelLv10){
        	if (Part.parts[249] >0){
        		Part.parts[249] = Part.parts[249] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[248];
        		JOptionPane.showMessageDialog (null, "You have sold Fuel 10 LVL For: " +Part.parts[248], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.FuelSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 1 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv1){
        	if (Part.parts[17] >0){
        		Part.parts[17] = Part.parts[17] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[16];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 1 LVL LVL For: " +Part.parts[16], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
                
        // Sell Interior Level 2 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv2){
        	if (Part.parts[43] >0){
        		Part.parts[43] = Part.parts[43] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[42];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 2 LVL For: " +Part.parts[42], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 3 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv3){
        	if (Part.parts[69] >0){
        		Part.parts[69] = Part.parts[69] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[68];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 3 LVL For: " +Part.parts[68], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 4 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv4){
        	if (Part.parts[95] >0){
        		Part.parts[95] = Part.parts[95] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[94];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 4 LVL For: " +Part.parts[94], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 5 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv5){
        	if (Part.parts[121] >0){
        		Part.parts[121] = Part.parts[121] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[120];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 5 LVL For: " +Part.parts[120], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 6 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv6){
        	if (Part.parts[147] >0){
        		Part.parts[147] = Part.parts[147] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[146];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 6 LVL For: " +Part.parts[146], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 7 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv7){
        	if (Part.parts[173] >0){
        		Part.parts[173] = Part.parts[173] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[172];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 7 LVL For: " +Part.parts[172], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 8 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv8){
        	if (Part.parts[199] >0){
        		Part.parts[199] = Part.parts[199] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[198];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 8 LVL For: " +Part.parts[198], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 9 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv9){
        	if (Part.parts[225] >0){
        		Part.parts[225] = Part.parts[225] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[224];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 9 LVL For: " +Part.parts[224], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Interior Level 10 Button Click
 
        if(ae.getSource() == jbtnSellInteriorLv10){
        	if (Part.parts[251] >0){
        		Part.parts[251] = Part.parts[251] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[250];
        		JOptionPane.showMessageDialog (null, "You have sold Interior 10 LVL For: " +Part.parts[250], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.InteriorSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 1 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv1){
        	if (Part.parts[19] >0){
        		Part.parts[19] = Part.parts[19] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[18];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 1 LVL FFor: " +Part.parts[18], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 2 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv2){
        	if (Part.parts[45] >0){
        		Part.parts[45] = Part.parts[45] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[44];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 2 LVL For: " +Part.parts[44], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 3 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv3){
        	if (Part.parts[71] >0){
        		Part.parts[71] = Part.parts[71] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[70];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 3 LVL For: " +Part.parts[70], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 4 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv4){
        	if (Part.parts[97] >0){
        		Part.parts[97] = Part.parts[97] - 1;;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[96];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 4 LVL For: " +Part.parts[96], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 5 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv5){
        	if (Part.parts[123] >0){
        		Part.parts[123] = Part.parts[123] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[122];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 5 LVL For: " +Part.parts[122], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 6 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv6){
        	if (Part.parts[149] >0){
        		Part.parts[149] = Part.parts[149] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[148];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 6 LVL For: " +Part.parts[148], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 7 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv7){
        	if (Part.parts[175] >0){
        		Part.parts[175] = Part.parts[175] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[174];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 7 LVL For: " +Part.parts[174], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 8 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv8){
        	if (Part.parts[201] >0){
        		Part.parts[201] = Part.parts[201] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[200];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 8 LVL For: " +Part.parts[200], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 9 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv9){
        	if (Part.parts[227] >0){
        		Part.parts[227] = Part.parts[227] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[266];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 9 LVL For: " +Part.parts[266], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Steering Level 10 Button Click
 
        if(ae.getSource() == jbtnSellSteeringLv10){
        	if (Part.parts[253] >0){
        		Part.parts[253] = Part.parts[253] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[252];
        		JOptionPane.showMessageDialog (null, "You have sold Steering 10 LVL For: " +Part.parts[252], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SteeringSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 1 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv1){
        	if (Part.parts[21] >0){
        		Part.parts[21] = Part.parts[21] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[20];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 1 LVL For: " +Part.parts[20], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 2 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv2){
        	if (Part.parts[47] >0){
        		Part.parts[47] = Part.parts[47] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[46];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 2 LVL For: " +Part.parts[46], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 3 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv3){
        	if (Part.parts[73] >0){
        		Part.parts[73] = Part.parts[73] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[72];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 3 LVL For: " +Part.parts[72], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 4 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv4){
        	if (Part.parts[99] >0){
        		Part.parts[99] = Part.parts[99] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[98];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 4 LVL For: " +Part.parts[98], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 5 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv5){
        	if (Part.parts[125] >0){
        		Part.parts[125] = Part.parts[125] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[124];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 5 LVL For: " +Part.parts[124], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 6 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv6){
        	if (Part.parts[151] >0){
        		Part.parts[151] = Part.parts[151] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[150];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 6 LVL For: " +Part.parts[150], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 7 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv7){
        	if (Part.parts[177] >0){
        		Part.parts[177] = Part.parts[177] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[176];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 7 LVL For: " +Part.parts[176], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 8 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv8){
        	if (Part.parts[203] >0){
        		Part.parts[203] = Part.parts[203] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[202];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 8 LVL For: " +Part.parts[202], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 9 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv9){
        	if (Part.parts[229] >0){
        		Part.parts[229] = Part.parts[229] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[228];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 9 LVL For: " +Part.parts[228], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Suspension Level 10 Button Click
 
        if(ae.getSource() == jbtnSellSuspensionLv10){
        	if (Part.parts[255] >0){
        		Part.parts[255] = Part.parts[255] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[254];
        		JOptionPane.showMessageDialog (null, "You have sold Suspension 10 LVL For: " +Part.parts[254], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.SuspensionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 1 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv1){
        	if (Part.parts[23] >0){
        		Part.parts[23] = Part.parts[23] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[22];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 1 LVL For: " +Part.parts[22], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 2 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv2){
        	if (Part.parts[49] >0){
        		Part.parts[49] = Part.parts[49] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[48];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 2 LVL For: " +Part.parts[48], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 3 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv3){
        	if (Part.parts[75] >0){
        		Part.parts[75] = Part.parts[75] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[74];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 3 LVL For: " +Part.parts[74], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 4 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv4){
        	if (Part.parts[101] >0){
        		Part.parts[101] = Part.parts[101] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[100];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 4 LVL For: " +Part.parts[100], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 5 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv5){
        	if (Part.parts[127]>0){
        		Part.parts[127] = Part.parts[127] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[126];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 5 LVL For: " +Part.parts[126], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 6 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv6){
        	if (Part.parts[153] >0){
        		Part.parts[153] = Part.parts[153] - 1;;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[152];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 6 LVL For: " +Part.parts[152], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 7 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv7){
        	if (Part.parts[179] >0){
        		Part.parts[179] = Part.parts[179] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[178];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 7 LVL For: " +Part.parts[178], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 8 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv8){
        	if (Part.parts[205] >0){
        		Part.parts[205] = Part.parts[205] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[204];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 8 LVL For: " +Part.parts[204], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 9 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv9){
        	if (Part.parts[231] >0){
        		Part.parts[231] = Part.parts[231] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[230];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 9 LVL For: " +Part.parts[230], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Transmission Level 10 Button Click
 
        if(ae.getSource() == jbtnSellTransmissionLv10){
        	if (Part.parts[257] >0){
        		Part.parts[257] = Part.parts[257] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[256];
        		JOptionPane.showMessageDialog (null, "You have sold Transmission 10 LVL For: " +Part.parts[256], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TransmissionSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Tires Level 1 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv1){
        	if (Part.parts[25] >0){
        		Part.parts[25] = Part.parts[25] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[24];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 1 LVL For: " +Part.parts[24], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Tires Level 2 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv2){
        	if (Part.parts[51] >0){
        		Part.parts[51] = Part.parts[51] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[50];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 2 LVL For: " +Part.parts[50], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE);}
        	
        }
        
        // Sell Tires Level 3 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv3){
        	if (Part.parts[77] >0){
        		Part.parts[77] = Part.parts[77] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[76];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 3 LVL For: " +Part.parts[76], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE);}
        	
        }
        
        // Sell Tires Level 4 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv4){
        	if (Part.parts[103] >0){
        		Part.parts[103] = Part.parts[103] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[102];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 4 LVL For: " +Part.parts[102], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE);}
        	
        }
        
        // Sell Tires Level 5 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv5){
        	if (Part.parts[129] >0){
        		Part.parts[129] = Part.parts[129] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[128];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 5 LVL For: " +Part.parts[128], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Tires Level 6 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv6){
        	if (Part.parts[155] >0){
        		Part.parts[155] = Part.parts[155] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[154];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 6 LVL For: " +Part.parts[154], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Tires Level 7 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv7){
        	if (Part.parts[181] >0){
        		Part.parts[181] = Part.parts[181] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[180];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 7 LVL For: " +Part.parts[180], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Tires Level 8 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv8){
        	if (Part.parts[207] >0){
        		Part.parts[207] = Part.parts[207] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[206];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 8 LVL For: " +Part.parts[206], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Tires Level 9 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv9){
        	if (Part.parts[233] >0){
        		Part.parts[233] = Part.parts[233] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[232];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 9 LVL For: " +Part.parts[232], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Sell Tires Level 10 Button Click
 
        if(ae.getSource() == jbtnSellTiresLv10){
        	if (Part.parts[259] >0){
        		Part.parts[259] = Part.parts[259] - 1;
        		CarMain.main[0] = CarMain.main[0] + Part.parts[258];
        		JOptionPane.showMessageDialog (null, "You have sold Tires 10 LVL For: " +Part.parts[258], "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.TiresSoldIcon);}
        	else{
        		JOptionPane.showMessageDialog(null, "No available parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);}
        	
        }
        
        // Build Cars 1-5LVL        
        if(ae.getSource() == jbtnBuildCarLv1){
	    	if(CarMain.main[5] >=1){
	    		if(CarMain.main[7] >0){
	    			if(CarFrame.frames[1] >0){ 
	    				
//	    				for(int i=1;i <= 25;i+=2){
//	    					if(Part.parts[i] >0){
//	    						count0+=1;
//	    				
//	    					}
//	    					else{
//	    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);
//	    						break;}	    					
//						}
	    							    				
					if (count0 == 0){				
						for (int j = 3;j <= 80; j+=4){
							if(CarsLv1.cars[j] == 0){
								for(int i=1;i <= 25;i+=2){
									Part.parts[i] -=1;
								}	
									//CarFrame.frames[1] -=1;								
									CarsLv1.cars[j] +=1;
									
									switch(j){
										
									case 3:{
										JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB9!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_DB9Icon);
										break;}
									case 7:{
										JOptionPane.showMessageDialog (null, "You have gained Acura NSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_NSXIcon);
										break;}
									case 11:{
										JOptionPane.showMessageDialog (null, "You have gained Ford Mustang!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_MustangIcon);
										break;
									}
									case 15:{
										JOptionPane.showMessageDialog (null, "You have gained Moskvich 412!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_412Icon);
										break;
									}
									case 19:{
										JOptionPane.showMessageDialog (null, "You have gained Kia Venga!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_VengaIcon);
										break;
									}
									case 23:{
										JOptionPane.showMessageDialog (null, "You have gained Fiat 1500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_1500Icon);
										break;
									}
									case 27:{
										JOptionPane.showMessageDialog (null, "You have gained Ferrari Enzo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_EnzoIcon);
										break;
									}
									case 31:{
										JOptionPane.showMessageDialog (null, "You have gained Aston Martin Rapide!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_RapideIcon);
										break;
									}
									case 35:{
										JOptionPane.showMessageDialog (null, "You have gained Koenigsegg CCX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_CCXIcon);
										break;
									}
									case 39:{
										JOptionPane.showMessageDialog (null, "You have gained Honda Civic!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_CivicIcon);
										break;
									}
									case 43:{
										JOptionPane.showMessageDialog (null, "You have gained Cadilliac ATS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_ATSIcon);
										break;
									}
									case 47:{
										JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Lancer Evolution X!", "Congralations", JOptionPane.INFORMATION_MESSAGE,ImagesHolder.Mitsubishi_LancerEvolutionXIcon);
										break;
									}
									case 51:{
										JOptionPane.showMessageDialog (null, "You have gained Infiniti FX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_FXIcon);
										break;
									}
									case 55:{
										JOptionPane.showMessageDialog (null, "You have gained Lancia Thema!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_ThemaIcon);
										break;
									}
									case 59:{
										JOptionPane.showMessageDialog (null, "You have gained Volvo XC90!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_XC90Icon);
										break;
									}
									case 63:{
										JOptionPane.showMessageDialog (null, "You have gained Acura CSX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_CSXIcon);
										break;
									}
									case 67:{
										JOptionPane.showMessageDialog (null, "You have gained Saab Sonett II!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_SonettIIIcon);
										break;
									}
									case 71:{
										JOptionPane.showMessageDialog (null, "You have gained Renault Floride!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_FlorideIcon);
										break;
									}
									case 75:{
										JOptionPane.showMessageDialog (null, "You have gained BMW e34!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e34Icon);
										break;
									}
									case 79:{
										JOptionPane.showMessageDialog (null, "You have gained Chrysler Cordoba!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_CordobaIcon);									
										JOptionPane.showMessageDialog(null, "You have colected all 1 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
										break;
									}
									default:{
										JOptionPane.showMessageDialog(null, "You have colected all 1 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
										break;
									}
									}
									break;
							}
						}
					}
	    			}
	    			else{
	    				JOptionPane.showMessageDialog (null, "You don't have 1 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
	    			}
	    		else{
	    			JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
	    		}
	    		}
	    	else{
	    		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
	    	}  
	    }
	
																
if(ae.getSource() == jbtnBuildCarLv2){
if(CarMain.main[5] >=2){
	if(CarMain.main[7] >0){
		if(CarFrame.frames[3] >0){ 
			
			for(int i=27;i <= 51;i+=2){
				if(Part.parts[i] >0){					
					count0+=1;					
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);	    					
					break;}
			}
			
		if (count0 == 13){
			for (int j = 3;j <= 80; j+= 4){
				if(CarsLv2.cars[j] == 0){
					for(int i=27;i <= 51;i+=2){
						Part.parts[i] --;
					}	
						CarFrame.frames[3] -=1;								
						CarsLv2.cars[j] +=1;
						
						switch(j){
						
						case 3:{
							JOptionPane.showMessageDialog (null, "You have gained Buick Riviera!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_RivieraIcon);
							break;
						}
						case 7:{
							JOptionPane.showMessageDialog (null, "You have gained Tesla Roadster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_RoadsterIcon);
							break;
						}
						case 11:{
							JOptionPane.showMessageDialog (null, "You have gained Audi 80!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_80Icon);
							break;
						}
						case 15:{
							JOptionPane.showMessageDialog (null, "You have gained BMW e36!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e36Icon);
							break;
						}
						case 19:{
							JOptionPane.showMessageDialog (null, "You have gained Volkswagen Scirocco!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_SciroccoIcon);
							break;
						}
						case 23:{
							JOptionPane.showMessageDialog (null, "You have gained Mazda 3!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_3Icon);
							break;
						}
						case 27:{
							JOptionPane.showMessageDialog (null, "You have gained Chevrolet Viking!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_VikingIcon);
							break;
						}
						case 31:{
							JOptionPane.showMessageDialog (null, "You have gained Tesla S!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_SIcon);
							break;
						}
						case 35:{
							JOptionPane.showMessageDialog (null, "You have gained Jeep ZJ!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_ZJIcon);
							break;
						}
						case 39:{
							JOptionPane.showMessageDialog (null, "You have gained Dodge Neon!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_NeonIcon);
							break;
						}
						case 43:{
							JOptionPane.showMessageDialog (null, "You have gained BMW e30!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e30Icon);
							break;
						}
						case 47:{
							JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz W123!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_W123Icon);
							break;
						}
						case 51:{
							JOptionPane.showMessageDialog (null, "You have gained Land Rover Defender!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_DefenderIcon);
							break;
						}
						case 55:{
							JOptionPane.showMessageDialog (null, "You have gained Saab 9_5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_9_5Icon);
							break;
						}
						case 59:{
							JOptionPane.showMessageDialog (null, "You have gained Aston Martin One!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_OneIcon);
							break;
						}
						case 63:{
							JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Regera!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_RegeraIcon);
							break;
						}
						case 67:{
							JOptionPane.showMessageDialog (null, "You have gained Lexus IS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_ISIcon);
							break;
						}
						case 71:{
							JOptionPane.showMessageDialog (null, "You have gained GMC Yukon!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_YukonIcon);
							break;
						}
						case 75:{
							JOptionPane.showMessageDialog (null, "You have gained Opel_Astra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_AstraIcon);
							break;
						}
						case 79:{
							JOptionPane.showMessageDialog (null, "You have gained Audi Coupe!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_CoupeIcon);
							break;
						}
						default:{
							JOptionPane.showMessageDialog(null, "You have colected all 2 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
							break;
						}
						}
						break;
	
			}
		}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have 2 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		}
		}
	else{
		JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
		}  
}	
}

if(ae.getSource() == jbtnBuildCarLv3){
if(CarMain.main[5] >=3){
	if(CarMain.main[7] >0){
		if(CarFrame.frames[5] >0){ 
			
			for(int i=53;i <= 77;i+=2){
				if(Part.parts[i] >0){
					count0+=1;
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);	    					
					break;}
			}
			
		if (count0 == 13){
			for (int j = 3;j <= 80; j+= 4){
				if(CarsLv3.cars[j] == 0){
					for(int i=53;i <= 77;i+=2){
						Part.parts[i] --;
					}	
						CarFrame.frames[5] -=1;								
						CarsLv3.cars[j] +=1;
						
						switch(j){
						
						case 3:{
							JOptionPane.showMessageDialog (null, "You have gained Mini Moke!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_MokeIcon);
							break;
						}
						case 7:{
							JOptionPane.showMessageDialog (null, "You have gained Kia Rondo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_RondoIcon);
							break;
						}
						case 11:{
							JOptionPane.showMessageDialog (null, "You have gained GMC Suburban!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_SuburbanIcon);
							break;
						}
						case 15:{
							JOptionPane.showMessageDialog (null, "You have gained Honda Prelude!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_PreludeIcon);
							break;
						}
						case 19:{
							JOptionPane.showMessageDialog (null, "You have gained Citroen_Saxo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_SaxoIcon);
							break;
						}
						case 23:{
							JOptionPane.showMessageDialog (null, "You have gained Volkswagen Tiguan!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_TiguanIcon);
							break;
						}
						case 27:{
							JOptionPane.showMessageDialog (null, "You have gained Volkswagen Phaeton!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_PhaetonIcon);
							break;
						}
						case 31:{
							JOptionPane.showMessageDialog (null, "You have gained Buick Centry!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_CentryIcon);
							break;
						}
						case 35:{
							JOptionPane.showMessageDialog (null, "You have gained Land Rover Discovery!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_DiscoveryIcon);
							break;
						}
						case 39:{
							JOptionPane.showMessageDialog (null, "You have gained Infiniti Etherea!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_EthereaIcon);
							break;
						}
						case 43:{
							JOptionPane.showMessageDialog (null, "You have gained Peugeot 308!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_308Icon);
							break;
						}
						case 47:{
							JOptionPane.showMessageDialog (null, "You have gained Toyota Auris!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_AurisIcon);
							break;
						}
						case 51:{
							JOptionPane.showMessageDialog (null, "You have gained Pagani ZondaF!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Pagani_ZondaFIcon);
							break;
						}
						case 55:{
							JOptionPane.showMessageDialog (null, "You have gained Lancia Phedra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_PhedraIcon);
							break;
						}
						case 59:{
							JOptionPane.showMessageDialog (null, "You have gained Chevrolet Impala!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_ImpalaIcon);
							break;
						}
						case 63:{
							JOptionPane.showMessageDialog (null, "You have gained Porsche Boxster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_BoxsterIcon);
							break;
						}
						case 67:{
							JOptionPane.showMessageDialog (null, "You have gained Aston Martin DB6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Aston_Martin_DB6Icon);
							break;
						}
						case 71:{
							JOptionPane.showMessageDialog (null, "You have gained Vaz 2103!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_2103Icon);
							break;
						}
						case 75:{
							JOptionPane.showMessageDialog (null, "You have gained Hyundai Mistra!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_MistraIcon);
							break;
						}
						case 79:{
							JOptionPane.showMessageDialog (null, "You have gained Mini Countryman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_CountrymanIcon);
							break;
						}
						default:{
							JOptionPane.showMessageDialog(null, "You have colected all 3 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
							break;
						}
						}
						break;
			}
		}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have 3 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
		}  
}
}		
if(ae.getSource() == jbtnBuildCarLv4){
	if(CarMain.main[5] >=4){
		if(CarMain.main[7] >0){
			if(CarFrame.frames[7] >0){ 
				
				for(int i=79;i <= 103;i+=2){
					if(Part.parts[i] >0){
						count0+=1;
					}
					else{
						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);	    					
						break;}
				}
				
			if (count0 == 13){
				for (int j = 3;j <= 80; j+= 4){
					if(CarsLv4.cars[j] == 0){
						for(int i=79;i <= 103;i+=2){
							Part.parts[i] --;
						
						}	
							CarFrame.frames[7] -=1;								
							CarsLv4.cars[j] +=1;
							
							switch(j){
							
							case 3:{
								JOptionPane.showMessageDialog (null, "You have gained Mazda MX6!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_MX6Icon);
								break;
							}
							case 7:{
								JOptionPane.showMessageDialog (null, "You have gained Chrysler Daytona!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_DaytonaIcon);
								break;
							}
							case 11:{
								JOptionPane.showMessageDialog (null, "You have gained Buick Roadmaster!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_RoadmasterIcon);
								break;
							}
							case 15:{
								JOptionPane.showMessageDialog (null, "You have gained Volvo S80!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_S80Icon);
								break;
							}
							case 19:{
								JOptionPane.showMessageDialog (null, "You have gained Porsche Cayman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_CaymanIcon);
								break;
							}
							case 23:{
								JOptionPane.showMessageDialog (null, "You have gained Volkswagen Beetle!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_BeetleIcon);
								break;
							}
							case 27:{
								JOptionPane.showMessageDialog (null, "You have gained Bugatti EB110!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_EB110Icon);
								break;
							}
							case 31:{
								JOptionPane.showMessageDialog (null, "You have gained Opel Zafira!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_ZafiraIcon);
								break;
							}
							case 35:{
								JOptionPane.showMessageDialog (null, "You have gained Saab 9000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_9000Icon);
								break;
							}
							case 39:{
								JOptionPane.showMessageDialog (null, "You have gained McLaren F1!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_F1Icon);
								break;
							}
							case 43:{
								JOptionPane.showMessageDialog (null, "You have gained Audi R8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_R8Icon);
								break;
							}
							case 47:{
								JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 8C!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_8CIcon);
								break;
							}
							case 51:{
								JOptionPane.showMessageDialog (null, "You have gained Ford_Fiesta!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_FiestaIcon);
								break;
							}
							case 55:{
								JOptionPane.showMessageDialog (null, "You have gained Infiniti Q50!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_Q50Icon);
								break;
							}
							case 59:{
								JOptionPane.showMessageDialog (null, "You have gained Maserati 5000GT!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_5000GTIcon);
								break;
							}
							case 63:{
								JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz CLA250!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_CLA250Icon);
								break;
							}
							case 67:{
								JOptionPane.showMessageDialog (null, "You have gained Lamborghini Gallardo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_GallardoIcon);
								break;
							}
							case 71:{
								JOptionPane.showMessageDialog (null, "You have gained Mazda RX7!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_RX7Icon);
								break;
							}
							case 75:{
								JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Colt!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_ColtIcon);
							}
							case 79:{
								JOptionPane.showMessageDialog (null, "You have gained Kia Sorento!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_SorentoIcon);
								break;
							}
							default:{
								JOptionPane.showMessageDialog(null, "You have colected all 4 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
								break;
							}
							}
							break;
				}
			}
			}
			else{
				JOptionPane.showMessageDialog (null, "You don't have 4 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
			}
			else{
				JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
			}
			}
			else{
				JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
			}  
}
}

	if(ae.getSource() == jbtnBuildCarLv5){
		if(CarMain.main[5] >=5){
			if(CarMain.main[7] >0){
				if(CarFrame.frames[9] >0){ 
					
					for(int i=105;i <= 129;i+=2){
						if(Part.parts[i] >0){
							count0+=1;
						}
						else{
							JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);  					
							break;}
					}
					
				if (count0 == 13){
					for (int j = 3;j <= 80; j+= 4){
						if(CarsLv5.cars[j] == 0){
							for(int i=105;i <= 129;i+=2){
								Part.parts[i] --;
							}	
								CarFrame.frames[9] -=1;								
								CarsLv5.cars[j] +=1;
							
								switch(j){
								
								case 3:{
									JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Wraith!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_WraithIcon);
									break;
								}
								case 7:{
									JOptionPane.showMessageDialog (null, "You have gained Lamborghini Diablo!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_DiabloIcon);
									break;
								}
								case 11:{
									JOptionPane.showMessageDialog (null, "You have gained Jeep Scrambler!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_ScramblerIcon);
									break;
								}
								case 15:{
									JOptionPane.showMessageDialog (null, "You have gained Bentley Continental!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_ContinentalIcon);
									break;
								}
								case 19:{
									JOptionPane.showMessageDialog (null, "You have gained Bentley Azure!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_AzureIcon);
									break;
								}
								case 23:{
									JOptionPane.showMessageDialog (null, "You have gained Koenigsegg One!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_OneIcon);
									break;
								}
								case 27:{
									JOptionPane.showMessageDialog (null, "You have gained Cadilliac XTS!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_XTSIcon);
									break;
								}
								case 31:{
									JOptionPane.showMessageDialog (null, "You have gained Fiat 500!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_500Icon);
									break;
								}
								case 35:{
									JOptionPane.showMessageDialog (null, "You have gained Mitsubishi Pajero!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_PajeroIcon);
									break;
								}
								case 39:{
									JOptionPane.showMessageDialog (null, "You have gained Moskvich 2140!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_2140Icon);
									break;
								}
								case 43:{
									JOptionPane.showMessageDialog (null, "You have gained Opel GT!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_GTIcon);
									break;
								}
								case 47:{
									JOptionPane.showMessageDialog (null, "You have gained Hyundai Getz!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_GetzIcon);
									break;
								}
								case 51:{
									JOptionPane.showMessageDialog (null, "You have gained Maserati Coupe!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_CoupeIcon);
									break;
								}
								case 55:{
									JOptionPane.showMessageDialog (null, "You have gained Honda S2000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_S2000Icon);
									break;
								}
								case 59:{
									JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_SpiderIcon);
									break;
								}
								case 63:{
									JOptionPane.showMessageDialog (null, "You have gained BMW M5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_M5Icon);
									break;
								}
								case 67:{
									JOptionPane.showMessageDialog (null, "You have gained BMW I8!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_I8Icon);
									break;
								}
								case 71:{
									JOptionPane.showMessageDialog (null, "You have gained Citroen C5!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_C5Icon);
									break;
								}
								case 75:{
									JOptionPane.showMessageDialog (null, "You have gained Fiat Punto!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_PuntoIcon);
									break;
								}
								case 79:{
									JOptionPane.showMessageDialog (null, "You have gained Audi 100!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_100Icon);
									break;
								}						
								default:{
									JOptionPane.showMessageDialog(null, "You have colected all 5 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									break;
								}
								}
								break;
					}
				}
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have 5 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
				}
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
				}  
}
	}
	
	//Build Cars Lv6-10
	
	if(ae.getSource() == jbtnBuildCarLv6){
    	if(CarMain.main[5] >=6){
    		if(CarMain.main[7] >0){
    			if(CarFrame.frames[11] >0){ 
    				
    				for(int i=131;i <= 155;i+=2){
    					if(Part.parts[i] >0){
    						count0+=1;
    					}
    					else{
    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);    					
    						break;}
    				}
    				
				if (count0 == 13){
					for (int j = 3;j <= 80; j+= 4){
						if(CarsLv6.cars[j] == 0){
							for(int i=131;i <= 155;i+=2){
								Part.parts[i] --;
							}	
								CarFrame.frames[11] -=1;								
								CarsLv6.cars[j] +=1;
								
								switch(j){
								
								case 3:{
									JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Phantom", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_PhantomIcon);
									break; 
								}
								case 7:{
									JOptionPane.showMessageDialog (null, "You have gained Toyota 86!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_86Icon);
									break; 
								}
								case 11:{
									JOptionPane.showMessageDialog (null, "You have gained BMW e70!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e70Icon);
									break;
								}
								case 15:{
									JOptionPane.showMessageDialog (null, "You have gained Chrysler Voyager!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_VoyagerIcon);
									break;
								}
								case 19:{
									JOptionPane.showMessageDialog (null, "You have gained Rolls Royce PhantomIII!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_PhantomIIIIcon);
									break;
								}
								case 23:{
									JOptionPane.showMessageDialog (null, "You have gained Honda CRX!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Honda_CRXIcon);
									break;
								}
								case 27:{
									JOptionPane.showMessageDialog (null, "You have gained Subaru 1000!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_1000Icon);
									break; 
								}
								case 31:{
									JOptionPane.showMessageDialog (null, "You have gained Cadilliac Eldorado!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_EldoradoIcon);
									break; 
								}
								case 35:{
									JOptionPane.showMessageDialog (null, "You have gained Land Rover Freelander!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_FreelanderIcon);
									break;
								}
								case 39:{
									JOptionPane.showMessageDialog (null, "You have gained Renault_Spider!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_SpiderIcon);
									break;
								}
								case 43:{
									JOptionPane.showMessageDialog (null, "You have gained Gaz 21!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Gaz_21Icon);
									break;
								}
								case 47:{
									JOptionPane.showMessageDialog (null, "You have gained Acura EL!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_ELIcon);
									break;
								}
								case 51:{
									JOptionPane.showMessageDialog (null, "You have gained Bugatti Veyron!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_VeyronIcon);
									break; 
								}
								case 55:{
									JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz SL600!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_SL600Icon);
									break;
								}
								case 59:{
									JOptionPane.showMessageDialog (null, "You have gained Rolls Royce Silver!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Rolls_Royce_SilverIcon);
									break; 
								}
								case 63:{
									JOptionPane.showMessageDialog (null, "You have gained Mini Paceman!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_PacemanIcon);
									break; 
								}
								case 67:{
									JOptionPane.showMessageDialog (null, "You have gained Hyundai Excel!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_ExcelIcon);
									break;
								}
								case 71:{
									JOptionPane.showMessageDialog (null, "You have gained Gaz 24!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Gaz_24Icon);
									break; 
								}
								case 75:{
									JOptionPane.showMessageDialog (null, "You have gained Peugeot 107!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_107Icon);
									break; 
								}
								case 79:{
									JOptionPane.showMessageDialog (null, "You have gained Audi_A4!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_A4Icon);
									break;
								}
								default:{
									JOptionPane.showMessageDialog(null, "You have colected all 6 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									break;
								}
								}
								break;
					}
				}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have 6 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
    			}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
    			}  
}
	}
	
	
	if(ae.getSource() == jbtnBuildCarLv7){
    	if(CarMain.main[5] >=7){
    		if(CarMain.main[7] >0){
    			if(CarFrame.frames[13] >0){ 
    				
    				for(int i=157;i <= 181;i+=2){
    					if(Part.parts[i] >0){
    						count0+=1;
    					}
    					else{
    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);	    					
    						break;}
    				}
    				
				if (count0 == 13){
					for (int j = 3;j <= 80; j+= 4){
						if(CarsLv7.cars[j] == 0){
							for(int i=157;i <= 181;i+=2){
								Part.parts[i] --;
							}	
								CarFrame.frames[13] -=1;								
								CarsLv7.cars[j] +=1;
								
								switch(j){
								
								case 3:{
									JOptionPane.showMessageDialog (null, "You have gained Lamborghini Aventador", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_AventadorIcon);
									break;
								}
								case 7:{
									JOptionPane.showMessageDialog (null, "You have gained Nissan 350z", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_350zIcon);
									break;
								}
								case 11:{
									JOptionPane.showMessageDialog (null, "You have gained Jaguar XJ6", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_XJ6Icon);
									break;
								}
								case 15:{
									JOptionPane.showMessageDialog (null, "You have gained Renault Clio", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_ClioIcon);
									break;
								}
								case 19:{
									JOptionPane.showMessageDialog (null, "You have gained Toyota Avensis", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_AvensisIcon);
									break;
								}
								case 23:{
									JOptionPane.showMessageDialog (null, "You have gained Subaru Outback", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_OutbackIcon);
									break;
								}
								case 27:{
									JOptionPane.showMessageDialog (null, "You have gained Saab 900", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Saab_900Icon);
									break;
								}
								case 31:{
									JOptionPane.showMessageDialog (null, "You have gained Opel Vectra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Opel_VectraIcon);
									break;
								}
								case 35:{
									JOptionPane.showMessageDialog (null, "You have gained Chrysler Charger", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chrysler_ChargerIcon);
									break;
								}
								case 39:{
									JOptionPane.showMessageDialog (null, "You have gained Ferrari_348", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_348Icon);
									break;
								}
								case 43:{
									JOptionPane.showMessageDialog (null, "You have gained Hyundai XG", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Hyundai_XGIcon);
									break;
								}
								case 47:{
									JOptionPane.showMessageDialog (null, "You have gained Lexus RX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_RXIcon);
									break;
								}
								case 51:{
									JOptionPane.showMessageDialog (null, "You have gained Dodge 400", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_400Icon);
									break;
								}
								case 55:{
									JOptionPane.showMessageDialog (null, "You have gained GMC Terrain", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_TerrainIcon);
									break;
								}
								case 59:{
									JOptionPane.showMessageDialog (null, "You have gained Volvo C70", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_C70Icon);
									break;
								}
								case 63:{
									JOptionPane.showMessageDialog (null, "You have gained Ford_Sierra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_SierraIcon);
									break;
								}
								case 67:{
									JOptionPane.showMessageDialog (null, "You have gained Subaru Impreza", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_ImprezaIcon);
									break;
								}
								case 71:{
									JOptionPane.showMessageDialog (null, "You have gained BMW e90", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BMW_e90Icon);
									break;
								}
								case 75:{
									JOptionPane.showMessageDialog (null, "You have gained Nissan Skyline", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_SkylineIcon);
									break;
								}
								case 79:{
									JOptionPane.showMessageDialog (null, "You have gained Audi Q7", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_Q7Icon);
									break;
								}
								default:{
									JOptionPane.showMessageDialog(null, "You have colected all 7 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									break;
								}
								}
								break;
					}
				}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have 7 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
    			}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
    			}  
}
	}	    																		
	    																		
	if(ae.getSource() == jbtnBuildCarLv8){
    	if(CarMain.main[5] >=8){
    		if(CarMain.main[7] >0){
    			if(CarFrame.frames[15] >0){ 
    				
    				for(int i=183;i <= 207;i+=2){
    					if(Part.parts[i] >0){
    						count0+=1;
    					}
    					else{
    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);	    					
    						break;}
    				}
    				
				if (count0 == 13){
					for (int j = 3;j <= 80; j+= 4){
						if(CarsLv8.cars[j] == 0){
							for(int i=183;i <= 207;i+=2){
								Part.parts[i] --;
							}	
								CarFrame.frames[15] -=1;								
								CarsLv8.cars[j] +=1;
								
								switch(j){
								
								case 3:{
									JOptionPane.showMessageDialog (null, "You have gained Bentley Arnage", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_ArnageIcon);
									break;
								}
								case 7:{
									JOptionPane.showMessageDialog (null, "You have gained Volvo 850", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volvo_850Icon);
									break;
								}
								case 11:{
									JOptionPane.showMessageDialog (null, "You have gained Toyota Rav4", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Toyota_Rav4Icon);
									break;
								}
								case 15:{
									JOptionPane.showMessageDialog (null, "You have gained Ford Focus", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ford_FocusIcon);
									break;
								}
								case 19:{
									JOptionPane.showMessageDialog (null, "You have gained Chevrolet Spin", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_SpinIcon);
									break;
								}
								case 23:{
									JOptionPane.showMessageDialog (null, "You have gained Bentley GTZ", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bentley_GTZIcon);
									break;
								}
								case 27:{
									JOptionPane.showMessageDialog (null, "You have gained Lexus LS", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_LSIcon);
									break;
								}
								case 31:{
									JOptionPane.showMessageDialog (null, "You have gained Land Rover RangeRover", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Land_Rover_RangeRoverIcon);
									break;
								}
								case 35:{
									JOptionPane.showMessageDialog (null, "You have gained Lexus GX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lexus_GXIcon);
									break;
								}
								case 39:{
									JOptionPane.showMessageDialog (null, "You have gained Jeep Wrangler", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_WranglerIcon);
									break;
								}
								case 43:{
									JOptionPane.showMessageDialog (null, "You have gained Maserati GranTurismo", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_GranTurismoIcon);
									break;
								}
								case 47:{
									JOptionPane.showMessageDialog (null, "You have gained Koenigsegg Agera", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Koenigsegg_AgeraIcon);
									break;
								}
								case 51:{
									JOptionPane.showMessageDialog (null, "You have gained Acura MDX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Acura_MDXIcon);
									break;
								}
								case 55:{
									JOptionPane.showMessageDialog (null, "You have gained Audi RS6", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Audi_RS6Icon);
									break;
								}
								case 59:{
									JOptionPane.showMessageDialog (null, "You have gained Cadilliac DeVille", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Cadilliac_DeVilleIcon);
									break;
								}
								case 63:{
									JOptionPane.showMessageDialog (null, "You have gained McLaren Veneno", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_VenenoIcon);
									break;
								}
								case 67:{
									JOptionPane.showMessageDialog (null, "You have gained Tesla X", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Tesla_XIcon);
									break;
								}
								case 71:{
									JOptionPane.showMessageDialog (null, "You have gained Mercedes Benz G55", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mercedes_Benz_G55Icon);
									break;
								}
								case 75:{
									JOptionPane.showMessageDialog (null, "You have gained Lancia Lybra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_LybraIcon);
									break;
								}
								case 79:{
									JOptionPane.showMessageDialog (null, "You have gained Infiniti QX60", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Infiniti_QX60Icon);
									break;
								}
								default:{
									JOptionPane.showMessageDialog(null, "You have colected all 8 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									break;
								}
								}
								break;
					}
				}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have 8 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
    				}
    				}
    				else{
    					JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
    				}  
}												
	}   																		
	    																		
	if(ae.getSource() == jbtnBuildCarLv9){
    	if(CarMain.main[5] >=9){
    		if(CarMain.main[7] >0){
    			if(CarFrame.frames[17] >0){ 
    				
    				for(int i=209;i <= 233;i+=2){
    					if(Part.parts[i] >0){
    						count0+=1;
    					}
    					else{
    						JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);	    					
    						break;}
    				}
    				
				if (count0 == 13){
					for (int j = 3;j <= 80; j+= 4){
						if(CarsLv9.cars[j] == 0){
							for(int i=209;i <= 233;i+=2){
								Part.parts[i] --;
							}	
								CarFrame.frames[17] -=1;								
								CarsLv9.cars[j] +=1;
								
								switch(j){
								
								case 3:{
									JOptionPane.showMessageDialog (null, "You have gained Kia Forte", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Kia_ForteIcon);
									break;
								}
								case 7:{
									JOptionPane.showMessageDialog (null, "You have gained Lancia Voyager", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lancia_VoyagerIcon);
									break;
								}
								case 11:{
									JOptionPane.showMessageDialog (null, "You have gained Porsche_Cayenne", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_CayenneIcon);
									break;
								}
								case 15:{
									JOptionPane.showMessageDialog (null, "You have gained McLaren_650s", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_650sIcon);
									break;
								}
								case 19:{
									JOptionPane.showMessageDialog (null, "You have gained Jaguar E-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_E_TypeIcon);
									break;
								}
								case 23:{
									JOptionPane.showMessageDialog (null, "You have gained Peugeot 601", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_601Icon);
									break;
								}
								case 27:{
									JOptionPane.showMessageDialog (null, "You have gained Jaguar F-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_F_TypeIcon);
									break;
								}
								case 31:{
									JOptionPane.showMessageDialog (null, "You have gained Fiat Doblo", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Fiat_DobloIcon);
									break;
								}
								case 35:{
									JOptionPane.showMessageDialog (null, "You have gained Vaz 2101", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_2101Icon);
									break;
								}
								case 39:{
									JOptionPane.showMessageDialog (null, "You have gained McLaren P1", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.McLaren_P1Icon);
									break;
								}
								case 43:{
									JOptionPane.showMessageDialog (null, "You have gained Peugeot 405", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Peugeot_405Icon);
									break;
								}
								case 47:{
									JOptionPane.showMessageDialog (null, "You have gained GMC Envoy", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.GMC_EnvoyIcon);
									break;
								}
								case 51:{
									JOptionPane.showMessageDialog (null, "You have gained Chevrolet Corvete", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Chevrolet_CorveteIcon);
									break;
								}
								case 55:{
									JOptionPane.showMessageDialog (null, "You have gained Pagani Huayra", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Pagani_HuayraIcon);
									break;
								}
								case 59:{
									JOptionPane.showMessageDialog (null, "You have gained Moskvich 402", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Moskvich_402Icon);
									break;
								}
								case 63:{
									JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 159", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_159Icon);
									break;
								}
								case 67:{
									JOptionPane.showMessageDialog (null, "You have gained Renault Fregate", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Renault_FregateIcon);
									break;
								}
								case 71:{
									JOptionPane.showMessageDialog (null, "You have gained Mini Cooper", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mini_CooperIcon);
									break;
								}
								case 75:{
									JOptionPane.showMessageDialog (null, "You have gained Dodge Viper", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_ViperIcon);
									break;
								}
								case 79:{
									JOptionPane.showMessageDialog (null, "You have gained Vaz Niva", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Vaz_NivaIcon);
									break;
								}
								default:{
									JOptionPane.showMessageDialog(null, "You have colected all 9 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
									break;
								}
								}
								break;
					}
				}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have 9 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
    			}
    			}
    			else{
    				JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
    			}  
}											
	}	

if(ae.getSource() == jbtnBuildCarLv10){
if(CarMain.main[5] >=10){
	if(CarMain.main[7] >0){
		if(CarFrame.frames[19] >0){ 
			
			for(int i=235;i <= 259;i+=2){
				if(Part.parts[i] >0){
					count0+=1;
				}
				else{
					JOptionPane.showMessageDialog (null, "You don't have enought parts!", "No Parts", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPartsIcon);	    					
					break;}
			}
			
		if (count0 == 13){
			for (int j = 3;j <= 80; j+= 4){
				if(CarsLv10.cars[j] == 0){
					for(int i=235;i <= 259;i+=2){
						Part.parts[i] --;
					}	
						CarFrame.frames[19] -=1;								
						CarsLv10.cars[j] +=1;
						
						switch(j){
						
						case 3:{
							JOptionPane.showMessageDialog (null, "You have gained Jaguar X-Type", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jaguar_X_TypeIcon);
							break;
						}
						case 7:{
							JOptionPane.showMessageDialog (null, "You have gained Ferrari 308", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_308Icon);
							break;
						}
						case 11:{
							JOptionPane.showMessageDialog (null, "You have gained Mazda 626", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mazda_626Icon);
							break;
						}
						case 15:{
							JOptionPane.showMessageDialog (null, "You have gained Maserati Shamal", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Maserati_ShamalIcon);
							break;
						}
						case 19:{
							JOptionPane.showMessageDialog (null, "You have gained Nissan 240sx", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_240sxIcon);
							break;
						}
						case 23:{
							JOptionPane.showMessageDialog (null, "You have gained Alfa Romeo 4C", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Alfa_Romeo_4CIcon);
							break;
						}
						case 27:{
							JOptionPane.showMessageDialog (null, "You have gained Nissan Juke", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Nissan_JukeIcon);
							break;
						}
						case 31:{
							JOptionPane.showMessageDialog (null, "You have gained Volkswagen Golf1", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Volkswagen_Golf1Icon);
							break;
						}
						case 35:{
							JOptionPane.showMessageDialog (null, "You have gained Jeep Gladiator", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Jeep_GladiatorIcon);
							break;
						}
						case 39:{
							JOptionPane.showMessageDialog (null, "You have gained Dodge Matador", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Dodge_MatadorIcon);
							break;
						}
						case 43:{
							JOptionPane.showMessageDialog (null, "You have gained Bugatti Royale", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_RoyaleIcon);
							break;
						}
						case 47:{
							JOptionPane.showMessageDialog (null, "You have gained Citroen CX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_CXIcon);
							break;
						}
						case 51:{
							JOptionPane.showMessageDialog (null, "You have gained Lamborghini 350GT", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Lamborghini_350GTIcon);
							break;
						}
						case 55:{
							JOptionPane.showMessageDialog (null, "You have gained Mitsubishi GTO", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Mitsubishi_GTOIcon);
							break;
						}
						case 59:{
							JOptionPane.showMessageDialog (null, "You have gained Buick Invicta", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Buick_InvictaIcon);
							break;
						}
						case 63:{
							JOptionPane.showMessageDialog (null, "You have gained Porsche 911", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Porsche_911Icon);
							break;
						}
						case 67:{
							JOptionPane.showMessageDialog (null, "You have gained Subaru Forester", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Subaru_ForesterIcon);
							break;
						}
						case 71:{
							JOptionPane.showMessageDialog (null, "You have gained Citroen BX", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Citroen_BXIcon);
							break;
						}
						case 75:{
							JOptionPane.showMessageDialog (null, "You have gained Bugatti Type252", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Bugatti_Type252Icon);
							break;
						}
						case 79:{
							JOptionPane.showMessageDialog (null, "You have gained Ferrari 488", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.Ferrari_488Icon);
							break;
						}
						default:{
							JOptionPane.showMessageDialog(null, "You have colected all 1 LVL cars", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.MaxUpgradeIcon);
							break;
						}
						}
						break;
			}
		}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have 1 LVL car frame!", "No Car Frame", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoFrameIcon);}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have available garage slot!", "No Garage Slot", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoGarageIcon);
		}
		}
		else{
			JOptionPane.showMessageDialog (null, "You don't have enought player level!", "No Player Level", JOptionPane.ERROR_MESSAGE, ImagesHolder.NoPlayerIcon);
		}  
}}
}}
