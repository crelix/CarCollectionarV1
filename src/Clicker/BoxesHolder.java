package Clicker;

public class BoxesHolder {

public int boxes[] = new int[20];
	
	public BoxesHolder(){
		
		MakeBoxes();
		}
	
	
	public void BoxesMaker(int k, int a1, int k1, int a2){
		
		boxes[a1] = k;
		boxes[a2] = k1;
	}
	
	public void MakeBoxes(){
		
		int i =0; int j =1;
		BoxesMaker(10, i, 0, j); // Boxes Level 1
		i +=2; j +=2;
		BoxesMaker(20, i, 0, j); // Boxes Level 2
		i +=2; j +=2;
		BoxesMaker(30, i, 0, j); // Boxes Level 3
		i +=2; j +=2;
		BoxesMaker(40, i, 0, j); // Boxes Level 4
		i +=2; j +=2;
		BoxesMaker(50, i, 0, j); // Boxes Level 5
		i +=2; j +=2;
		BoxesMaker(60, i, 0, j); // Boxes Level 6
		i +=2; j +=2;
		BoxesMaker(70, i, 0, j); // Boxes Level 7
		i +=2; j +=2;
		BoxesMaker(80, i, 0, j); // Boxes Level 8
		i +=2; j +=2;
		BoxesMaker(90, i, 0, j); // Boxes Level 9
		i +=2; j +=2;
		BoxesMaker(100, i, 0, j); // Boxes Level 10
		i +=2; j +=2;
	}
}
