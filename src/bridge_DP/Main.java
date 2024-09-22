package bridge_DP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MediaFile a=new AudioFile(new Windows());
		MediaFile v=new VideoFile(new Mac());
		System.out.println("Audio:");
		a.media();
		System.out.println();
		System.out.println();
		System.out.println("Video:");
		v.media();
		

	}

}




//Develop a multimedia application that can play different types of media files 
//(e.g., audio and video) on different devices (e.g., Windows and Mac). 
//You want to be able to extend the types of media files and the types of devices 
//independently by using Bridge design pattern
//1. Create the Implementor Interface: Define a Device interface with methods for
  //playing audio and video.
//2. Implement Concrete Implementors: Implement the Device interface for
   //different devices (e.g., WindowsDevice, MacDevice).
//3. Create the Abstraction: Define an abstract MediaFile class  
   // that uses a Device instance.
//4. Implement Refined Abstractions: Implement the MediaFile class for
//different types of media files (e.g., AudioFile, VideoFile).