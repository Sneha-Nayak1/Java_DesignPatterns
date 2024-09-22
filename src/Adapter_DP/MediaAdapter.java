package Adapter_DP;

public class MediaAdapter implements MediaPlayer{
	
	private MP4 m;
	private VLC v;
	String s;
	
	public MediaAdapter(String s){
		this.s=s;
		if(s.equals("mp4")) {
			m=new MP4();
			
		}
		else if(s.equals("vlc")) {
			v=new VLC();
		}
	}
	 
	
	
	@Override
	public void playMedia() {
		// TODO Auto-generated method stub
		if(s.equals("vlc"))
		v.play();
		else if(s.equals("mp4"))
		m.play();
		
	}

}
