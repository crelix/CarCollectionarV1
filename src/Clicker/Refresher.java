package Clicker;

public class Refresher {

	ClickerGame CG = new ClickerGame();
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
    
	public void refresher(){
		
		CG.MoneyLabel.setText("Money: " + CarMain.main[0]);
		CG.MoneyClicksLabel.setText("Money Clicks: " + CarMain.main[1]);
		CG.BoxesLabel.setText("Boxes: " + CarMain.main[2]);
		CG.BoxesClicksLabel.setText("Boxes Clicks: " + CarMain.main[3]);
		CG.BoxesLVLLabel.setText("Boxes Level: " + CarMain.main[4]);
		CG.PlayerLabel.setText("Player Level: " + CarMain.main[5]);
		CG.GarageLabel.setText("Garage Level: " + CarMain.main[6]);
		CG.BoxesLVL1Label.setText("<html>1 LVL Box<br>" + "Count: " + Box.boxes[1]);
		CG.BoxesLVL2Label.setText("<html>2 LVL Box<br>" + "Count: " + Box.boxes[3]);
		CG.BoxesLVL3Label.setText("<html>3 LVL Box<br>" + "Count: " + Box.boxes[5]);
		CG.BoxesLVL4Label.setText("<html>4 LVL Box<br>" + "Count: " + Box.boxes[7]);
		CG.BoxesLVL5Label.setText("<html>5 LVL Box<br>" + "Count: " + Box.boxes[9]);
		CG.BoxesLVL6Label.setText("<html>6 LVL Box<br>" + "Count: " + Box.boxes[11]);
		CG.BoxesLVL7Label.setText("<html>7 LVL Box<br>" + "Count: " + Box.boxes[13]);
		CG.BoxesLVL8Label.setText("<html>8 LVL Box<br>" + "Count: " + Box.boxes[15]);
		CG.BoxesLVL9Label.setText("<html>9 LVL Box<br>" + "Count: " + Box.boxes[17]);
		CG.BoxesLVL10Label.setText("<html>10 LVL Box<br>" + "Count: " + Box.boxes[19]);
		CG.OpenBoxesLVL1Label.setText("<html>1 LVL Box<br>" + "Count: " + Box.boxes[1]);
		CG.OpenBoxesLVL2Label.setText("<html>2 LVL Box<br>" + "Count: " + Box.boxes[3]);
		CG.OpenBoxesLVL3Label.setText("<html>3 LVL Box<br>" + "Count: " + Box.boxes[5]);
		CG.OpenBoxesLVL4Label.setText("<html>4 LVL Box<br>" + "Count: " + Box.boxes[7]);
		CG.OpenBoxesLVL5Label.setText("<html>5 LVL Box<br>" + "Count: " + Box.boxes[9]);
		CG.OpenBoxesLVL6Label.setText("<html>6 LVL Box<br>" + "Count: " + Box.boxes[11]);
		CG.OpenBoxesLVL7Label.setText("<html>7 LVL Box<br>" + "Count: " + Box.boxes[13]);
		CG.OpenBoxesLVL8Label.setText("<html>8 LVL Box<br>" + "Count: " + Box.boxes[15]);
		CG.OpenBoxesLVL9Label.setText("<html>9 LVL Box<br>" + "Count: " + Box.boxes[17]);
		CG.OpenBoxesLVL10Label.setText("<html>10 LVL Box<br>" + "Count: " + Box.boxes[19]);
		CG.FrameLv1Label.setText("<html>1 LVL Frame<br>" + "Count: " + CarFrame.frames[1]);
		CG.FrameLv2Label.setText("<html>2 LVL Frame<br>" + "Count: " + CarFrame.frames[3]);
		CG.FrameLv3Label.setText("<html>3 LVL Frame<br>" + "Count: " + CarFrame.frames[5]);
		CG.FrameLv4Label.setText("<html>4 LVL Frame<br>" + "Count: " + CarFrame.frames[7]);
		CG.FrameLv5Label.setText("<html>5 LVL Frame<br>" + "Count: " + CarFrame.frames[9]);
		CG.FrameLv6Label.setText("<html>6 LVL Frame<br>" + "Count: " + CarFrame.frames[11]);
		CG.FrameLv7Label.setText("<html>7 LVL Frame<br>" + "Count: " + CarFrame.frames[13]);
		CG.FrameLv8Label.setText("<html>8 LVL Frame<br>" + "Count: " + CarFrame.frames[15]);
		CG.FrameLv9Label.setText("<html>9 LVL Frame<br>" + "Count: " + CarFrame.frames[17]);
		CG.FrameLv10Label.setText("<html>10 LVL Frame<br>" + "Count: " + CarFrame.frames[19]);
		CG.CarsLv1Label.setText("<html>1 LVL Cars<br>" + "Owned: " + CG.CountLv1Cars() + " of 20");
		CG.CarsLv2Label.setText("<html>2 LVL Cars<br>" + "Owned: " + CG.CountLv2Cars() + " of 20");
		CG.CarsLv3Label.setText("<html>3 LVL Cars<br>" + "Owned: " + CG.CountLv3Cars() + " of 20");
		CG.CarsLv4Label.setText("<html>4 LVL Cars<br>" + "Owned: " + CG.CountLv4Cars() + " of 20");
		CG.CarsLv5Label.setText("<html>5 LVL Cars<br>" + "Owned: " + CG.CountLv5Cars() + " of 20");
		CG.CarsLv6Label.setText("<html>6 LVL Cars<br>" + "Owned: " + CG.CountLv6Cars() + " of 20");
		CG.CarsLv7Label.setText("<html>7 LVL Cars<br>" + "Owned: " + CG.CountLv7Cars() + " of 20");
		CG.CarsLv8Label.setText("<html>8 LVL Cars<br>" + "Owned: " + CG.CountLv8Cars() + " of 20");
		CG.CarsLv9Label.setText("<html>9 LVL Cars<br>" + "Owned: " + CG.CountLv9Cars() + " of 20");
		CG.CarsLv10Label.setText("<html>10 LVL Cars<br>" + "Owned: " + CG.CountLv10Cars() + " of 20");
	}
}
