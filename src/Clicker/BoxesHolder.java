package Clicker;

public class BoxesHolder {

public String boxes[] = new String[10];
	
	public BoxesHolder(){
		
		
	}
	
	public void BoxesMaker(String a1, int k, String a2, int k1){
		
		boxes[k] = a1;
		boxes[k1] = a2;
		
	}
	
	public void MakeBoxes(){
		
		int u = 0; int i = 1;
		BoxesMaker("10", u, "0", i); // Boxes Level 1
		u +=2; i +=2;
		BoxesMaker("20", u, "0", i); // Boxes Level 2
		u +=2; i +=2;
		BoxesMaker("30", u, "0", i); // Boxes Level 3
		u +=2; i +=2;
		BoxesMaker("40", u, "0", i); // Boxes Level 4
		u +=2; i +=2;
		BoxesMaker("50", u, "0", i); // Boxes Level 5
		u +=2; i +=2;
		BoxesMaker("60", u, "0", i); // Boxes Level 6
		u +=2; i +=2;
		BoxesMaker("70", u, "0", i); // Boxes Level 7
		u +=2; i +=2;
		BoxesMaker("80", u, "0", i); // Boxes Level 8
		u +=2; i +=2;
		BoxesMaker("90", u, "0", i); // Boxes Level 9
		u +=2; i +=2;
		BoxesMaker("100", u, "0", i); // Boxes Level 10
		u +=2; i +=2;
	}
}
