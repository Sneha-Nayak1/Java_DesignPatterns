package Adapter_DP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaPlayer m=new MediaAdapter("vlc");
		m.playMedia();
	}

}


//Develop a media player application that can play different types of audio files.
//The existing system can only play mp3 files using a MediaPlayer interface.
//However, you need to integrate new functionality to play mp4 and vlc files as well.
//Instead of modifying the existing MediaPlayer interface, 
//you can use the Adapter pattern to make the new functionality compatible with the existing system.
// 1. Create a Target Interface: Define the MediaPlayer interface with a method 
  //to play media files.
//2. Create an Adaptee Class: Implement classes for the new media formats (mp4 and vlc)
   //with their own interfaces.
//3. Create an Adapter Class: Implement an adapter class that makes the 
   //new media formats compatible with the MediaPlayer interface.
//4. Use the Adapter: Demonstrate how to use the adapter to play different
   //types of media files.