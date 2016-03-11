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
	}
}
