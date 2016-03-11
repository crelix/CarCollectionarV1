package Clicker;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.Random;

public class ClickerGame implements ActionListener {
		
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
    

    
    //LABELS
    JLabel MoneyLabel;  
    JLabel MoneyClicksLabel;
    JLabel BoxesLabel;
    JLabel BoxesClicksLabel;
    JLabel PlayerLabel;
    JLabel GarageLabel;
    JLabel BoxesLVLLabel;
    JLabel BoxesLVL1Label;
    JLabel BoxesLVL2Label;
    JLabel BoxesLVL3Label;
    JLabel BoxesLVL4Label;
    JLabel BoxesLVL5Label;
    JLabel BoxesLVL6Label;
    JLabel BoxesLVL7Label;
    JLabel BoxesLVL8Label;
    JLabel BoxesLVL9Label;
    JLabel BoxesLVL10Label;
    JLabel OpenBoxesLVL1Label;
    JLabel OpenBoxesLVL2Label;
    JLabel OpenBoxesLVL3Label;
    JLabel OpenBoxesLVL4Label;
    JLabel OpenBoxesLVL5Label;
    JLabel OpenBoxesLVL6Label;
    JLabel OpenBoxesLVL7Label;
    JLabel OpenBoxesLVL8Label;
    JLabel OpenBoxesLVL9Label;
    JLabel OpenBoxesLVL10Label;
    JLabel FrameLv1Label;
    JLabel FrameLv2Label;
    JLabel FrameLv3Label;
    JLabel FrameLv4Label;
    JLabel FrameLv5Label;
    JLabel FrameLv6Label;
    JLabel FrameLv7Label;
    JLabel FrameLv8Label;
    JLabel FrameLv9Label;
    JLabel FrameLv10Label;
    JLabel CarsLv1Label;
    JLabel CarsLv2Label;
    JLabel CarsLv3Label;
    JLabel CarsLv4Label;
    JLabel CarsLv5Label;
    JLabel CarsLv6Label;
    JLabel CarsLv7Label;
    JLabel CarsLv8Label;
    JLabel CarsLv9Label;
    JLabel CarsLv10Label;
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
      
        MainHolder CarMain = new MainHolder();
        BoxesHolder Box = new BoxesHolder();
        FramesHolder CarFrame = new FramesHolder();
        PartHolder Part = new PartHolder();
 	            
    	JTabbedPane tabbedPane = new JTabbedPane();
    	tabbedPane.setTabPlacement(JTabbedPane.TOP);
    	
    	//MainPanel
    	JPanel MainPanel = new JPanel();
    	
    	JPanel MainPanelSub = new JPanel();
    	MainPanelSub.setLayout(new BoxLayout(MainPanelSub, BoxLayout.PAGE_AXIS));
    	
    	JPanel MainPanelSub2 = new JPanel();
    	MainPanelSub2.setLayout(new BoxLayout(MainPanelSub2, BoxLayout.PAGE_AXIS));
    	
    	MoneyLabel = new JLabel(ImagesHolder.MoneyIcon);  
    	MoneyLabel.setHorizontalTextPosition(JLabel.CENTER);
    	MoneyLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	MoneyLabel.setText("Money: " + CarMain.main[0]);
    	
    	MoneyClicksLabel = new JLabel();
    	MoneyClicksLabel.setHorizontalTextPosition(JLabel.CENTER);
    	MoneyClicksLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	MoneyClicksLabel.setText("Money Clicks: " + CarMain.main[1]);
    	
        BoxesLabel = new JLabel(ImagesHolder.BoxLv9_10Icon);  	
    	BoxesLabel.setHorizontalTextPosition(JLabel.CENTER);
    	BoxesLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	BoxesLabel.setText("Boxes: " + CarMain.main[2]);
    	
    	BoxesClicksLabel = new JLabel();
    	BoxesClicksLabel.setHorizontalTextPosition(JLabel.CENTER);
    	BoxesClicksLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	BoxesClicksLabel.setText("Boxes Clicks: " + CarMain.main[3]);

    	MainPanelSub.add(MoneyLabel);
    	MainPanelSub.add(MoneyClicksLabel);
    	MainPanelSub.add(jbtnMoney);
    	MainPanelSub2.add(BoxesLabel);
    	MainPanelSub2.add(BoxesClicksLabel);
       	MainPanelSub2.add(jbtnBoxes);
    	MainPanel.add(MainPanelSub);
    	MainPanel.add(MainPanelSub2);
        
        //Upgrades Panel
    	
        JPanel UpgradesPanel = new JPanel();
        
        JPanel UpgradesPanelSub = new JPanel();
        UpgradesPanelSub.setLayout(new BoxLayout(UpgradesPanelSub, BoxLayout.PAGE_AXIS));
        
        JPanel UpgradesPanelSub2 = new JPanel();
        UpgradesPanelSub2.setLayout(new BoxLayout(UpgradesPanelSub2, BoxLayout.PAGE_AXIS));
        
        JPanel UpgradesPanelSub3 = new JPanel();
        UpgradesPanelSub3.setLayout(new BoxLayout(UpgradesPanelSub3, BoxLayout.PAGE_AXIS));
        
        PlayerLabel = new JLabel(ImagesHolder.PlayerIcon);    	
    	PlayerLabel.setHorizontalTextPosition(JLabel.CENTER);
    	PlayerLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	PlayerLabel.setText("Player Level: " + CarMain.main[5]);
        
    	GarageLabel = new JLabel(ImagesHolder.GarageIcon);    	
    	GarageLabel.setHorizontalTextPosition(JLabel.CENTER);
    	GarageLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	GarageLabel.setText("Garage Level: " + CarMain.main[6]);
    	
    	BoxesLVLLabel = new JLabel(ImagesHolder.BoxLv9_10Icon);    	
    	BoxesLVLLabel.setHorizontalTextPosition(JLabel.CENTER);
    	BoxesLVLLabel.setVerticalTextPosition(JLabel.BOTTOM);
    	BoxesLVLLabel.setText("Box Level: " + CarMain.main[4]);
    	
        UpgradesPanelSub.add(PlayerLabel);
        UpgradesPanelSub.add(jbtnUpgradeLevel);
        UpgradesPanelSub2.add(GarageLabel);
        UpgradesPanelSub2.add(jbtnUpgradeGarageLevel);
        UpgradesPanelSub3.add(BoxesLVLLabel);
        UpgradesPanelSub3.add(jbtnUpgradeBoxesLevel);
        UpgradesPanel.add(UpgradesPanelSub);
        UpgradesPanel.add(UpgradesPanelSub2);
        UpgradesPanel.add(UpgradesPanelSub3);
      
        // Buy Boxes Panel
       
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
        
        
        BoxesLVL1Label = new JLabel(ImagesHolder.BoxLv1_2Icon);    	
    	BoxesLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
    	BoxesLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
    	BoxesLVL1Label.setText("<html>1 LVL Box<br>" + "Count: " + Box.boxes[1]);
    	
    	BoxesLVL2Label = new JLabel(ImagesHolder.BoxLv1_2Icon);    	
     	BoxesLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL2Label.setText("<html>2 LVL Box<br>" + "Count: " + Box.boxes[3]);
    	
     	BoxesLVL3Label = new JLabel(ImagesHolder.BoxLv3_4Icon);    	
     	BoxesLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL3Label.setText("<html>3 LVL Box<br>" + "Count: " + Box.boxes[5]);
    	
     	BoxesLVL4Label = new JLabel(ImagesHolder.BoxLv3_4Icon);    	
     	BoxesLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL4Label.setText("<html>4 LVL Box<br>" + "Count: " + Box.boxes[7]);
     	
     	BoxesLVL5Label = new JLabel(ImagesHolder.BoxLv5_6Icon);    	
     	BoxesLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL5Label.setText("<html>5 LVL Box<br>" + "Count: " + Box.boxes[9]);
     	
     	BoxesLVL6Label = new JLabel(ImagesHolder.BoxLv5_6Icon);    	
     	BoxesLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL6Label.setText("<html>6 LVL Box<br>" + "Count: " + Box.boxes[11]);
     	
     	BoxesLVL7Label = new JLabel(ImagesHolder.BoxLv7_8Icon);    	
     	BoxesLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL7Label.setText("<html>7 LVL Box<br>" + "Count: " + Box.boxes[13]);
     	
     	BoxesLVL8Label = new JLabel(ImagesHolder.BoxLv7_8Icon);    	
     	BoxesLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL8Label.setText("<html>8 LVL Box<br>" + "Count: " + Box.boxes[15]);
     	
     	BoxesLVL9Label = new JLabel(ImagesHolder.BoxLv9_10Icon);    	
     	BoxesLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL9Label.setText("<html>9 LVL Box<br>" + "Count: " + Box.boxes[17]);
     	
     	BoxesLVL10Label = new JLabel(ImagesHolder.BoxLv9_10Icon);    	
     	BoxesLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
     	BoxesLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
     	BoxesLVL10Label.setText("<html>10 LVL Box<br>" + "Count: " + Box.boxes[19]);
    	    
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
        
        // Open Boxes Panel
        
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
        
        OpenBoxesLVL1Label = new JLabel(ImagesHolder.BoxLv1_2Icon);    	
    	OpenBoxesLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
    	OpenBoxesLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
    	OpenBoxesLVL1Label.setText("<html>1 LVL Box<br>" + "Count: " + Box.boxes[1]);
    	
    	OpenBoxesLVL2Label = new JLabel(ImagesHolder.BoxLv1_2Icon);    	
     	OpenBoxesLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL2Label.setText("<html>2 LVL Box<br>" + "Count: " + Box.boxes[3]);
    	
     	OpenBoxesLVL3Label = new JLabel(ImagesHolder.BoxLv3_4Icon);    	
     	OpenBoxesLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL3Label.setText("<html>3 LVL Box<br>" + "Count: " + Box.boxes[5]);
    	
     	OpenBoxesLVL4Label = new JLabel(ImagesHolder.BoxLv3_4Icon);    	
     	OpenBoxesLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL4Label.setText("<html>4 LVL Box<br>" + "Count: " + Box.boxes[7]);
     	
     	OpenBoxesLVL5Label = new JLabel(ImagesHolder.BoxLv5_6Icon);    	
     	OpenBoxesLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL5Label.setText("<html>5 LVL Box<br>" + "Count: " + Box.boxes[9]);
     	
     	OpenBoxesLVL6Label = new JLabel(ImagesHolder.BoxLv5_6Icon);    	
     	OpenBoxesLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL6Label.setText("<html>6 LVL Box<br>" + "Count: " + Box.boxes[11]);
     	
     	OpenBoxesLVL7Label = new JLabel(ImagesHolder.BoxLv7_8Icon);    	
     	OpenBoxesLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL7Label.setText("<html>7 LVL Box<br>" + "Count: " + Box.boxes[13]);
     	
     	OpenBoxesLVL8Label = new JLabel(ImagesHolder.BoxLv7_8Icon);    	
     	OpenBoxesLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL8Label.setText("<html>8 LVL Box<br>" + "Count: " + Box.boxes[15]);
     	
     	OpenBoxesLVL9Label = new JLabel(ImagesHolder.BoxLv9_10Icon);    	
     	OpenBoxesLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL9Label.setText("<html>9 LVL Box<br>" + "Count: " + Box.boxes[17]);
     	
     	OpenBoxesLVL10Label = new JLabel(ImagesHolder.BoxLv9_10Icon);    	
     	OpenBoxesLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
     	OpenBoxesLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
     	OpenBoxesLVL10Label.setText("<html>10 LVL Box<br>" + "Count: " + Box.boxes[19]);
                    
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
         
        // Build Cars Panel
        
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
        
        CarsLv1Label = new JLabel(ImagesHolder.Opel_ZafiraIcon);    	
     	CarsLv1Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv1Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv1Label.setText("<html>1 LVL Cars<br>" + "Owned: " + CountLv1Cars() + " of 20");
     	
     	CarsLv2Label = new JLabel(ImagesHolder.Ferrari_EnzoIcon);    	
     	CarsLv2Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv2Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv2Label.setText("<html>2 LVL Cars<br>" + "Owned: " + CountLv2Cars() + " of 20");
     	
     	CarsLv3Label = new JLabel(ImagesHolder.Fiat_500Icon);    	
     	CarsLv3Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv3Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv3Label.setText("<html>3 LVL Cars<br>" + "Owned: " + CountLv3Cars() + " of 20");
     	
     	CarsLv4Label = new JLabel(ImagesHolder.BMW_e30Icon);    	
     	CarsLv4Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv4Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv4Label.setText("<html>4 LVL Cars<br>" + "Owned: " + CountLv4Cars() + " of 20");
     	
     	CarsLv5Label = new JLabel(ImagesHolder.Pagani_ZondaFIcon);    	
     	CarsLv5Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv5Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv5Label.setText("<html>5 LVL Cars<br>" + "Owned: " + CountLv5Cars() + " of 20");
     	
     	CarsLv6Label = new JLabel(ImagesHolder.Vaz_2103Icon);    	
     	CarsLv6Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv6Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv6Label.setText("<html>6 LVL Cars<br>" + "Owned: " + CountLv6Cars() + " of 20");
     	
     	CarsLv7Label = new JLabel(ImagesHolder.Audi_CoupeIcon);    	
     	CarsLv7Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv7Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv7Label.setText("<html>7 LVL Cars<br>" + "Owned: " + CountLv7Cars() + " of 20");
     	
     	CarsLv8Label = new JLabel(ImagesHolder.Ford_MustangIcon);    	
     	CarsLv8Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv8Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv8Label.setText("<html>8 LVL Cars<br>" + "Owned: " + CountLv8Cars() + " of 20");
     	
     	CarsLv9Label = new JLabel(ImagesHolder.GMC_YukonIcon);    	
     	CarsLv9Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv9Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv9Label.setText("<html>9 LVL Cars<br>" + "Owned: " + CountLv9Cars() + " of 20");
     	
     	CarsLv10Label = new JLabel(ImagesHolder.Cadilliac_EldoradoIcon);    	
     	CarsLv10Label.setHorizontalTextPosition(JLabel.CENTER);
     	CarsLv10Label.setVerticalTextPosition(JLabel.BOTTOM);
     	CarsLv10Label.setText("<html>10 LVL Cars<br>" + "Owned: " + CountLv10Cars() + " of 20");
        
     	
     	BuildCarsPanelSub.add(CarsLv1Label);
     	BuildCarsPanelSub.add(BuildCarsClass.jbtnBuildCarLv1);
     	BuildCarsPanelSub2.add(CarsLv2Label);
     	BuildCarsPanelSub2.add(BuildCarsClass.jbtnBuildCarLv2);
     	BuildCarsPanelSub3.add(CarsLv3Label);
     	BuildCarsPanelSub3.add(BuildCarsClass.jbtnBuildCarLv3);
     	BuildCarsPanelSub4.add(CarsLv4Label);
     	BuildCarsPanelSub4.add(BuildCarsClass.jbtnBuildCarLv4);
     	BuildCarsPanelSub5.add(CarsLv5Label);
     	BuildCarsPanelSub5.add(BuildCarsClass.jbtnBuildCarLv5);
     	BuildCarsPanelSub6.add(CarsLv6Label);
     	BuildCarsPanelSub6.add(BuildCarsClass2.jbtnBuildCarLv6);
     	BuildCarsPanelSub7.add(CarsLv7Label);
     	BuildCarsPanelSub7.add(BuildCarsClass2.jbtnBuildCarLv7);
     	BuildCarsPanelSub8.add(CarsLv8Label);
     	BuildCarsPanelSub8.add(BuildCarsClass2.jbtnBuildCarLv8);
     	BuildCarsPanelSub9.add(CarsLv9Label);
     	BuildCarsPanelSub9.add(BuildCarsClass2.jbtnBuildCarLv9);
     	BuildCarsPanelSub10.add(CarsLv10Label);
     	BuildCarsPanelSub10.add(BuildCarsClass2.jbtnBuildCarLv10);
     	
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
        
     	// Buy Frames Panel
     	
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
        
        FrameLv1Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv1Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv1Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv1Label.setText("<html>1 LVL Frame<br>" + "Count: " + CarFrame.frames[1]);
     	
     	FrameLv2Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv2Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv2Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv2Label.setText("<html>2 LVL Frame<br>" + "Count: " + CarFrame.frames[3]);
     	
     	FrameLv3Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv3Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv3Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv3Label.setText("<html>3 LVL Frame<br>" + "Count: " + CarFrame.frames[5]);
     	
     	FrameLv4Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv4Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv4Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv4Label.setText("<html>4 LVL Frame<br>" + "Count: " + CarFrame.frames[7]);
     	
     	FrameLv5Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv5Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv5Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv5Label.setText("<html>5 LVL Frame<br>" + "Count: " + CarFrame.frames[9]);
     	
     	FrameLv6Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv6Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv6Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv6Label.setText("<html>6 LVL Frame<br>" + "Count: " + CarFrame.frames[11]);
     	
     	FrameLv7Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv7Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv7Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv7Label.setText("<html>7 LVL Frame<br>" + "Count: " + CarFrame.frames[13]);
     	
     	FrameLv8Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv8Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv8Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv8Label.setText("<html>8 LVL Frame<br>" + "Count: " + CarFrame.frames[15]);
     	
     	FrameLv9Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv9Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv9Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv9Label.setText("<html>9 LVL Frame<br>" + "Count: " + CarFrame.frames[17]);
     	
     	FrameLv10Label = new JLabel(ImagesHolder.CarFrameIcon);    	
     	FrameLv10Label.setHorizontalTextPosition(JLabel.CENTER);
     	FrameLv10Label.setVerticalTextPosition(JLabel.BOTTOM);
     	FrameLv10Label.setText("<html>10 LVL Frame<br>" + "Count: " + CarFrame.frames[19]);
          	
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
        
     	// Sell Parts Level 1 Panel
     	
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
        
        JLabel AccessoriesLVL1Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL1Label.setText("<html>Accessories LVL 1<br>" + "Count: " + Part.parts[1]);
        
        JLabel BodyLVL1Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL1Label.setText("<html>Body LVL 1<br>" + "Count: " + Part.parts[3]);
        
        JLabel BrakesLVL1Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL1Label.setText("<html>Brakes LVL 1<br>" + "Count: " + Part.parts[5]);
        
        JLabel CoolingLVL1Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL1Label.setText("<html>Cooling LVL 1<br>" + "Count: " + Part.parts[7]);
        
        JLabel ElectronicsLVL1Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL1Label.setText("<html>Electronics LVL 1<br>" + "Count: " + Part.parts[9]);
        
        JLabel EngineLVL1Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL1Label.setText("<html>Engine LVL 1<br>" + "Count: " + Part.parts[11]);
        
        JLabel ExaustLVL1Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL1Label.setText("<html>Exaust LVL 1<br>" + "Count: " + Part.parts[13]);
        
        JLabel FuelLVL1Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL1Label.setText("<html>Fuel LVL 1<br>" + "Count: " + Part.parts[15]);
        
        JLabel InteriorLVL1Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL1Label.setText("<html>Interior LVL 1<br>" + "Count: " + Part.parts[17]);
        
        JLabel SteeringLVL1Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL1Label.setText("<html>Steering LVL 1<br>" + "Count: " + Part.parts[19]);
        
        JLabel SuspensionLVL1Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL1Label.setText("<html>Suspension LVL 1<br>" + "Count: " + Part.parts[21]);
        
        JLabel TransmissionLVL1Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL1Label.setText("<html>Transmission LVL 1<br>" + "Count: " + Part.parts[23]);
        
        JLabel TiresLVL1Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL1Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL1Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL1Label.setText("<html>Tires LVL 1<br>" + "Count: " + Part.parts[25]);
               
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

        // Sell Parts Level 2 Panel
        
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
   	 	
	 	JLabel AccessoriesLVL2Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL2Label.setText("<html>Accessories LVL 2<br>" + "Count: " + Part.parts[27]);
        
        JLabel BodyLVL2Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL2Label.setText("<html>Body LVL 2<br>" + "Count: " + Part.parts[29]);
        
        JLabel BrakesLVL2Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL2Label.setText("<html>Brakes LVL 2<br>" + "Count: " + Part.parts[31]);
        
        JLabel CoolingLVL2Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL2Label.setText("<html>Cooling LVL 2<br>" + "Count: " + Part.parts[33]);
        
        JLabel ElectronicsLVL2Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL2Label.setText("<html>Electronics LVL 2<br>" + "Count: " + Part.parts[35]);
        
        JLabel EngineLVL2Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL2Label.setText("<html>Engine LVL 2<br>" + "Count: " + Part.parts[37]);
        
        JLabel ExaustLVL2Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL2Label.setText("<html>Exaust LVL 2<br>" + "Count: " + Part.parts[39]);
        
        JLabel FuelLVL2Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL2Label.setText("<html>Fuel LVL 2<br>" + "Count: " + Part.parts[41]);
        
        JLabel InteriorLVL2Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL2Label.setText("<html>Interior LVL 2<br>" + "Count: " + Part.parts[43]);
        
        JLabel SteeringLVL2Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL2Label.setText("<html>Steering LVL 2<br>" + "Count: " + Part.parts[45]);
        
        JLabel SuspensionLVL2Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL2Label.setText("<html>Suspension LVL 2<br>" + "Count: " + Part.parts[47]);
        
        JLabel TransmissionLVL2Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL2Label.setText("<html>Transmission LVL 2<br>" + "Count: " + Part.parts[49]);
        
        JLabel TiresLVL2Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL2Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL2Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL2Label.setText("<html>Tires LVL 2<br>" + "Count: " + Part.parts[51]);
               
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
   	 
        // Sell Parts Level 3 Panel
        
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
   	 	
	 	JLabel AccessoriesLVL3Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL3Label.setText("<html>Accessories LVL 3<br>" + "Count: " + Part.parts[53]);
        
        JLabel BodyLVL3Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL3Label.setText("<html>Body LVL 3<br>" + "Count: " + Part.parts[55]);
        
        JLabel BrakesLVL3Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL3Label.setText("<html>Brakes LVL 3<br>" + "Count: " + Part.parts[57]);
        
        JLabel CoolingLVL3Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL3Label.setText("<html>Cooling LVL 3<br>" + "Count: " + Part.parts[59]);
        
        JLabel ElectronicsLVL3Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL3Label.setText("<html>Electronics LVL 3<br>" + "Count: " + Part.parts[61]);
        
        JLabel EngineLVL3Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL3Label.setText("<html>Engine LVL 3<br>" + "Count: " + Part.parts[63]);
        
        JLabel ExaustLVL3Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL3Label.setText("<html>Exaust LVL 3<br>" + "Count: " + Part.parts[65]);
        
        JLabel FuelLVL3Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL3Label.setText("<html>Fuel LVL 3<br>" + "Count: " + Part.parts[67]);
        
        JLabel InteriorLVL3Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL3Label.setText("<html>Interior LVL 3<br>" + "Count: " + Part.parts[69]);
        
        JLabel SteeringLVL3Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL3Label.setText("<html>Steering LVL 3<br>" + "Count: " + Part.parts[71]);
        
        JLabel SuspensionLVL3Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL3Label.setText("<html>Suspension LVL 3<br>" + "Count: " + Part.parts[73]);
        
        JLabel TransmissionLVL3Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL3Label.setText("<html>Transmission LVL 3<br>" + "Count: " + Part.parts[75]);
        
        JLabel TiresLVL3Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL3Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL3Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL3Label.setText("<html>Tires LVL 3<br>" + "Count: " + Part.parts[77]);
                
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
   	 	
        // Sell Parts Level 4 Panel
        
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
   	 	
	 	JLabel AccessoriesLVL4Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL4Label.setText("<html>Accessories LVL 4<br>" + "Count: " + Part.parts[79]);
        
        JLabel BodyLVL4Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL4Label.setText("<html>Body LVL 4<br>" + "Count: " + Part.parts[81]);
        
        JLabel BrakesLVL4Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL4Label.setText("<html>Brakes LVL 4<br>" + "Count: " + Part.parts[83]);
        
        JLabel CoolingLVL4Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL4Label.setText("<html>Cooling LVL 4<br>" + "Count: " + Part.parts[85]);
        
        JLabel ElectronicsLVL4Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL4Label.setText("<html>Electronics LVL 4<br>" + "Count: " + Part.parts[87]);
        
        JLabel EngineLVL4Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL4Label.setText("<html>Engine LVL 4<br>" + "Count: " + Part.parts[89]);
        
        JLabel ExaustLVL4Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL4Label.setText("<html>Exaust LVL 4<br>" + "Count: " + Part.parts[91]);
        
        JLabel FuelLVL4Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL4Label.setText("<html>Fuel LVL 4<br>" + "Count: " + Part.parts[93]);
        
        JLabel InteriorLVL4Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL4Label.setText("<html>Interior LVL 4<br>" + "Count: " + Part.parts[95]);
        
        JLabel SteeringLVL4Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL4Label.setText("<html>Steering LVL 4<br>" + "Count: " + Part.parts[97]);
        
        JLabel SuspensionLVL4Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL4Label.setText("<html>Suspension LVL 4<br>" + "Count: " + Part.parts[99]);
        
        JLabel TransmissionLVL4Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL4Label.setText("<html>Transmission LVL 4<br>" + "Count: " + Part.parts[101]);
        
        JLabel TiresLVL4Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL4Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL4Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL4Label.setText("<html>Tires LVL 4<br>" + "Count: " + Part.parts[103]);
               
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
   	 	
        // Sell Parts Level 5 Panel
        
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
   	 	
	 	JLabel AccessoriesLVL5Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL5Label.setText("<html>Accessories LVL 5<br>" + "Count: " + Part.parts[105]);
        
        JLabel BodyLVL5Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL5Label.setText("<html>Body LVL 5<br>" + "Count: " + Part.parts[107]);
        
        JLabel BrakesLVL5Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL5Label.setText("<html>Brakes LVL 5<br>" + "Count: " + Part.parts[109]);
        
        JLabel CoolingLVL5Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL5Label.setText("<html>Cooling LVL 5<br>" + "Count: " + Part.parts[111]);
        
        JLabel ElectronicsLVL5Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL5Label.setText("<html>Electronics LVL 5<br>" + "Count: " + Part.parts[113]);
        
        JLabel EngineLVL5Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL5Label.setText("<html>Engine LVL 5<br>" + "Count: " + Part.parts[115]);
        
        JLabel ExaustLVL5Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL5Label.setText("<html>Exaust LVL 5<br>" + "Count: " + Part.parts[117]);
        
        JLabel FuelLVL5Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL5Label.setText("<html>Fuel LVL 5<br>" + "Count: " + Part.parts[119]);
        
        JLabel InteriorLVL5Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL5Label.setText("<html>Interior LVL 5<br>" + "Count: " + Part.parts[121]);
        
        JLabel SteeringLVL5Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL5Label.setText("<html>Steering LVL 5<br>" + "Count: " + Part.parts[123]);
        
        JLabel SuspensionLVL5Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL5Label.setText("<html>Suspension LVL 5<br>" + "Count: " + Part.parts[125]);
        
        JLabel TransmissionLVL5Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL5Label.setText("<html>Transmission LVL 5<br>" + "Count: " + Part.parts[127]);
        
        JLabel TiresLVL5Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL5Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL5Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL5Label.setText("<html>Tires LVL 5<br>" + "Count: " + Part.parts[129]);
               
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
   	 	
        // Sell Parts Level 6 Panel
        
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
   	 	
	 	JLabel AccessoriesLVL6Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL6Label.setText("<html>Accessories LVL 6<br>" + "Count: " + Part.parts[131]);
        
        JLabel BodyLVL6Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL6Label.setText("<html>Body LVL 6<br>" + "Count: " + Part.parts[133]);
        
        JLabel BrakesLVL6Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL6Label.setText("<html>Brakes LVL 6<br>" + "Count: " + Part.parts[135]);
        
        JLabel CoolingLVL6Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL6Label.setText("<html>Cooling LVL 6<br>" + "Count: " + Part.parts[137]);
        
        JLabel ElectronicsLVL6Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL6Label.setText("<html>Electronics LVL 6<br>" + "Count: " + Part.parts[139]);
        
        JLabel EngineLVL6Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL6Label.setText("<html>Engine LVL 6<br>" + "Count: " + Part.parts[141]);
        
        JLabel ExaustLVL6Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL6Label.setText("<html>Exaust LVL 6<br>" + "Count: " + Part.parts[143]);
        
        JLabel FuelLVL6Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL6Label.setText("<html>Fuel LVL 6<br>" + "Count: " + Part.parts[145]);
        
        JLabel InteriorLVL6Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL6Label.setText("<html>Interior LVL 6<br>" + "Count: " + Part.parts[147]);
        
        JLabel SteeringLVL6Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL6Label.setText("<html>Steering LVL 6<br>" + "Count: " + Part.parts[149]);
        
        JLabel SuspensionLVL6Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL6Label.setText("<html>Suspension LVL 6<br>" + "Count: " + Part.parts[151]);
        
        JLabel TransmissionLVL6Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL6Label.setText("<html>Transmission LVL 6<br>" + "Count: " + Part.parts[153]);
        
        JLabel TiresLVL6Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL6Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL6Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL6Label.setText("<html>Tires LVL 6<br>" + "Count: " + Part.parts[155]);
               
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
   	 	
        // Sell Parts Level 7 Panel
        
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
   	 	
	 	JLabel AccessoriesLVL7Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL7Label.setText("<html>Accessories LVL 7<br>" + "Count: " + Part.parts[157]);
        
        JLabel BodyLVL7Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL7Label.setText("<html>Body LVL 7<br>" + "Count: " + Part.parts[159]);
        
        JLabel BrakesLVL7Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL7Label.setText("<html>Brakes LVL 7<br>" + "Count: " + Part.parts[161]);
        
        JLabel CoolingLVL7Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL7Label.setText("<html>Cooling LVL 7<br>" + "Count: " + Part.parts[163]);
        
        JLabel ElectronicsLVL7Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL7Label.setText("<html>Electronics LVL 7<br>" + "Count: " + Part.parts[165]);
        
        JLabel EngineLVL7Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL7Label.setText("<html>Engine LVL 7<br>" + "Count: " + Part.parts[167]);
        
        JLabel ExaustLVL7Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL7Label.setText("<html>Exaust LVL 7<br>" + "Count: " + Part.parts[169]);
        
        JLabel FuelLVL7Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL7Label.setText("<html>Fuel LVL 7<br>" + "Count: " + Part.parts[171]);
        
        JLabel InteriorLVL7Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL7Label.setText("<html>Interior LVL 7<br>" + "Count: " + Part.parts[173]);
        
        JLabel SteeringLVL7Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL7Label.setText("<html>Steering LVL 7<br>" + "Count: " + Part.parts[175]);
        
        JLabel SuspensionLVL7Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL7Label.setText("<html>Suspension LVL 7<br>" + "Count: " + Part.parts[177]);
        
        JLabel TransmissionLVL7Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL7Label.setText("<html>Transmission LVL 7<br>" + "Count: " + Part.parts[179]);
        
        JLabel TiresLVL7Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL7Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL7Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL7Label.setText("<html>Tires LVL 7<br>" + "Count: " + Part.parts[181]);
               
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
   	 	
        // Sell Parts Level 8 Panel
        
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
   	 	
	 	JLabel AccessoriesLVL8Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL8Label.setText("<html>Accessories LVL 8<br>" + "Count: " + Part.parts[183]);
        
        JLabel BodyLVL8Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL8Label.setText("<html>Body LVL 8<br>" + "Count: " + Part.parts[185]);
        
        JLabel BrakesLVL8Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL8Label.setText("<html>Brakes LVL 8<br>" + "Count: " + Part.parts[187]);
        
        JLabel CoolingLVL8Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL8Label.setText("<html>Cooling LVL 8<br>" + "Count: " + Part.parts[189]);
        
        JLabel ElectronicsLVL8Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL8Label.setText("<html>Electronics LVL 8<br>" + "Count: " + Part.parts[191]);
        
        JLabel EngineLVL8Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL8Label.setText("<html>Engine LVL 8<br>" + "Count: " + Part.parts[193]);
        
        JLabel ExaustLVL8Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL8Label.setText("<html>Exaust LVL 8<br>" + "Count: " + Part.parts[195]);
        
        JLabel FuelLVL8Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL8Label.setText("<html>Fuel LVL 8<br>" + "Count: " + Part.parts[197]);
        
        JLabel InteriorLVL8Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL8Label.setText("<html>Interior LVL 8<br>" + "Count: " + Part.parts[199]);
        
        JLabel SteeringLVL8Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL8Label.setText("<html>Steering LVL 8<br>" + "Count: " + Part.parts[201]);
        
        JLabel SuspensionLVL8Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL8Label.setText("<html>Suspension LVL 8<br>" + "Count: " + Part.parts[203]);
        
        JLabel TransmissionLVL8Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL8Label.setText("<html>Transmission LVL 8<br>" + "Count: " + Part.parts[205]);
        
        JLabel TiresLVL8Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL8Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL8Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL8Label.setText("<html>Tires LVL 8<br>" + "Count: " + Part.parts[207]);
    
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
   	 	
        // Sell Parts Level 9 Panel
        
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
   	 	
	 	JLabel AccessoriesLVL9Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL9Label.setText("<html>Accessories LVL 9<br>" + "Count: " + Part.parts[209]);
        
        JLabel BodyLVL9Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL9Label.setText("<html>Body LVL 9<br>" + "Count: " + Part.parts[211]);
        
        JLabel BrakesLVL9Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL9Label.setText("<html>Brakes LVL 9<br>" + "Count: " + Part.parts[213]);
        
        JLabel CoolingLVL9Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL9Label.setText("<html>Cooling LVL 9<br>" + "Count: " + Part.parts[215]);
        
        JLabel ElectronicsLVL9Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL9Label.setText("<html>Electronics LVL 9<br>" + "Count: " + Part.parts[217]);
        
        JLabel EngineLVL9Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL9Label.setText("<html>Engine LVL 9<br>" + "Count: " + Part.parts[219]);
        
        JLabel ExaustLVL9Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL9Label.setText("<html>Exaust LVL 9<br>" + "Count: " + Part.parts[221]);
        
        JLabel FuelLVL9Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL9Label.setText("<html>Fuel LVL 9<br>" + "Count: " + Part.parts[223]);
        
        JLabel InteriorLVL9Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL9Label.setText("<html>Interior LVL 9<br>" + "Count: " + Part.parts[225]);
        
        JLabel SteeringLVL9Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL9Label.setText("<html>Steering LVL 9<br>" + "Count: " + Part.parts[227]);
        
        JLabel SuspensionLVL9Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL9Label.setText("<html>Suspension LVL 9<br>" + "Count: " + Part.parts[229]);
        
        JLabel TransmissionLVL9Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL9Label.setText("<html>Transmission LVL 9<br>" + "Count: " + Part.parts[231]);
        
        JLabel TiresLVL9Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL9Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL9Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL9Label.setText("<html>Tires LVL 9<br>" + "Count: " + Part.parts[233]);
               
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
   	 	
        // Sell Parts Level 10 Panel
        
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
        
	 	JLabel AccessoriesLVL10Label = new JLabel(ImagesHolder.AccessoriesIcon);    	
        AccessoriesLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        AccessoriesLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        AccessoriesLVL10Label.setText("<html>Accessories LVL 10<br>" + "Count: " + Part.parts[235]);
        
        JLabel BodyLVL10Label = new JLabel(ImagesHolder.BodyIcon);    	
        BodyLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        BodyLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        BodyLVL10Label.setText("<html>Body LVL 10<br>" + "Count: " + Part.parts[237]);
        
        JLabel BrakesLVL10Label = new JLabel(ImagesHolder.BrakesIcon);    	
        BrakesLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        BrakesLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        BrakesLVL10Label.setText("<html>Brakes LVL 10<br>" + "Count: " + Part.parts[239]);
        
        JLabel CoolingLVL10Label = new JLabel(ImagesHolder.CoolingIcon);    	
        CoolingLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        CoolingLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        CoolingLVL10Label.setText("<html>Cooling LVL 10<br>" + "Count: " + Part.parts[241]);
        
        JLabel ElectronicsLVL10Label = new JLabel(ImagesHolder.ElectronicsIcon);    	
        ElectronicsLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        ElectronicsLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        ElectronicsLVL10Label.setText("<html>Electronics LVL 10<br>" + "Count: " + Part.parts[243]);
        
        JLabel EngineLVL10Label = new JLabel(ImagesHolder.EngineIcon);    	
        EngineLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        EngineLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        EngineLVL10Label.setText("<html>Engine LVL 10<br>" + "Count: " + Part.parts[245]);
        
        JLabel ExaustLVL10Label = new JLabel(ImagesHolder.ExaustIcon);    	
        ExaustLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        ExaustLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        ExaustLVL10Label.setText("<html>Exaust LVL 10<br>" + "Count: " + Part.parts[247]);
        
        JLabel FuelLVL10Label = new JLabel(ImagesHolder.FuelIcon);    	
        FuelLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        FuelLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        FuelLVL10Label.setText("<html>Fuel LVL 10<br>" + "Count: " + Part.parts[249]);
        
        JLabel InteriorLVL10Label = new JLabel(ImagesHolder.InteriorIcon);    	
        InteriorLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        InteriorLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        InteriorLVL10Label.setText("<html>Interior LVL 10<br>" + "Count: " + Part.parts[251]);
        
        JLabel SteeringLVL10Label = new JLabel(ImagesHolder.SteeringIcon);    	
        SteeringLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        SteeringLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        SteeringLVL10Label.setText("<html>Steering LVL 10<br>" + "Count: " + Part.parts[253]);
        
        JLabel SuspensionLVL10Label = new JLabel(ImagesHolder.SuspensionIcon);    	
        SuspensionLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        SuspensionLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        SuspensionLVL10Label.setText("<html>Suspension LVL 10<br>" + "Count: " + Part.parts[255]);
        
        JLabel TransmissionLVL10Label = new JLabel(ImagesHolder.TransmissionIcon);    	
        TransmissionLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        TransmissionLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        TransmissionLVL10Label.setText("<html>Transmission LVL 10<br>" + "Count: " + Part.parts[257]);
        
        JLabel TiresLVL10Label = new JLabel(ImagesHolder.TiresIcon);    	
        TiresLVL10Label.setHorizontalTextPosition(JLabel.CENTER);
        TiresLVL10Label.setVerticalTextPosition(JLabel.BOTTOM);
        TiresLVL10Label.setText("<html>Tires LVL 10<br>" + "Count: " + Part.parts[259]);
               
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
      
    }
    
    // Counting
    
    public  int Aboxes(){
    	int countboxes = 0;
    	for(int i = 1; i > Box.boxes.length; i+=2){
    		countboxes+= Box.boxes[i];
    	}
    	return countboxes;
    }
    
    public int CountLv1Cars(){
    	int countcarsLv1 = 0;
    	for(int i = 3;i > CarsLv1.cars.length;i+=4){
    		countcarsLv1+= Integer.parseInt(CarsLv1.cars[i]);
    	} 
    	return countcarsLv1;
    	    	
    }
    
    public int CountLv2Cars(){
    	int countcarsLv2 = 0;
    	for(int i = 3;i > CarsLv2.cars.length;i+=4){
    		countcarsLv2+= Integer.parseInt(CarsLv2.cars[i]);
    	} 
    	return countcarsLv2;
    
    }
    
    public int CountLv3Cars(){
    	int countcarsLv3 = 0;
    	for(int i = 3;i > CarsLv3.cars.length;i+=4){
    		countcarsLv3+= Integer.parseInt(CarsLv3.cars[i]);
    	} 
    	return countcarsLv3;
    
    }
    
    public int CountLv4Cars(){
    	int countcarsLv4 = 0;
    	for(int i = 3;i > CarsLv4.cars.length;i+=4){
    		countcarsLv4+= Integer.parseInt(CarsLv4.cars[i]);
    	} 
    	return countcarsLv4;
    
    }
    
    public int CountLv5Cars(){
    	int countcarsLv5 = 0;
    	for(int i = 3;i > CarsLv5.cars.length;i+=4){
    		countcarsLv5+= Integer.parseInt(CarsLv5.cars[i]);
    	} 
    	return countcarsLv5;
    
    }
    
    public int CountLv6Cars(){
    	int countcarsLv6 = 0;
    	for(int i = 3;i > CarsLv6.cars.length;i+=4){
    		countcarsLv6+= Integer.parseInt(CarsLv6.cars[i]);
    	} 
    	return countcarsLv6;
    
    }
    
    public int CountLv7Cars(){
    	int countcarsLv7 = 0;
    	for(int i = 3;i > CarsLv7.cars.length;i+=4){
    		countcarsLv7+= Integer.parseInt(CarsLv7.cars[i]);
    	} 
    	return countcarsLv7;
    
    }
    
    public int CountLv8Cars(){
    	int countcarsLv8 = 0;
    	for(int i = 3;i > CarsLv8.cars.length;i+=4){
    		countcarsLv8+= Integer.parseInt(CarsLv8.cars[i]);
    	} 
    	return countcarsLv8;
    
    }
    
    public int CountLv9Cars(){
    	int countcarsLv9 = 0;
    	for(int i = 3;i > CarsLv9.cars.length;i+=4){
    		countcarsLv9+= Integer.parseInt(CarsLv9.cars[i]);
    	} 
    	return countcarsLv9;
    
    }
    
    public int CountLv10Cars(){
    	int countcarsLv10 = 0;
    	for(int i = 3;i > CarsLv10.cars.length;i+=4){
    		countcarsLv10+= Integer.parseInt(CarsLv10.cars[i]);
    	} 
    	return countcarsLv10;
    
    }
    
    public int AllClicks(){
    	int allclicks = 0;
    	allclicks+= CarMain.main[1] + CarMain.main[3];
    	return allclicks;
    }   
 	
 	

	MainHolder CarMain = new MainHolder();
	ImagesHolder ImagesHolder = new ImagesHolder();
    BoxesHolder Box = new BoxesHolder();
    FramesHolder CarFrame = new FramesHolder();
    PartHolder Part = new PartHolder();
    BuildCarsClass BuildCarsClass = new BuildCarsClass();
    BuildCarsClass2 BuildCarsClass2 = new BuildCarsClass2();
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
            
            if(CarMain.main[2] == 5){
                CarMain.main[2] -= 5;
                if(CarMain.main[4] == 1){
                    Box.boxes[1] = Box.boxes[1] + 1;
                    JOptionPane.showMessageDialog (null, "You have gained 1 LVL box!", "Congralations", JOptionPane.INFORMATION_MESSAGE, ImagesHolder.BoxLv1_2Icon);}
                    }
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
}
}
