package Clicker;

public class FramesHolder {

public int frames[] = new int[20];
	
	public FramesHolder(){
		
		MakeFrames();
	}
	
	public void FramesMaker(int k,int a1, int k1, int a2){
		
		frames[a1] = k;
		frames[a2] = k1;
	}
	
	public void MakeFrames(){
		
		int i =0; int j =1;
		FramesMaker(15, i, 0, j); // Frames Level 1
		i +=2; j +=2;
		FramesMaker(30, i, 0, j); // Frames Level 2
		i +=2; j +=2;
		FramesMaker(45, i, 0, j); // Frames Level 3
		i +=2; j +=2;
		FramesMaker(60, i, 0, j); // Frames Level 4
		i +=2; j +=2;
		FramesMaker(75, i, 0, j); // Frames Level 5
		i +=2; j +=2;
		FramesMaker(90, i, 0, j); // Frames Level 6
		i +=2; j +=2;
		FramesMaker(105, i, 0, j); // Frames Level 7
		i +=2; j +=2;
		FramesMaker(120, i, 0, j); // Frames Level 8
		i +=2; j +=2;
		FramesMaker(135, i, 0, j); // Frames Level 9
		i +=2; j +=2;
		FramesMaker(150, i, 0, j); // Frames Level 10
		i +=2; j +=2;
	}
}
