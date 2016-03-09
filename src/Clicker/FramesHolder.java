package Clicker;

public class FramesHolder {

public String frames[] = new String[20];
	
	public FramesHolder(){
		
		
	}
	
	public void FramesMaker(String a1, int k, String a2, int k1){
		
		frames[k] = a1;
		frames[k1] = a2;
		
	}
	
	public void MakeFrames(){
		
		int u = 0; int i = 1;
		FramesMaker("15", u, "0", i); // Frames Level 1
		u +=2; i +=2;
		FramesMaker("30", u, "0", i); // Frames Level 2
		u +=2; i +=2;
		FramesMaker("45", u, "0", i); // Frames Level 3
		u +=2; i +=2;
		FramesMaker("60", u, "0", i); // Frames Level 4
		u +=2; i +=2;
		FramesMaker("75", u, "0", i); // Frames Level 5
		u +=2; i +=2;
		FramesMaker("90", u, "0", i); // Frames Level 6
		u +=2; i +=2;
		FramesMaker("105", u, "0", i); // Frames Level 7
		u +=2; i +=2;
		FramesMaker("120", u, "0", i); // Frames Level 8
		u +=2; i +=2;
		FramesMaker("135", u, "0", i); // Frames Level 9
		u +=2; i +=2;
		FramesMaker("150", u, "0", i); // Frames Level 10
		u +=2; i +=2;
	}
}
