package bridge_DP;

public class AudioFile extends MediaFile{

	public AudioFile(Device d1) {
		super(d1);
		// TODO Auto-generated constructor stub
	}

	@Override
	void media() {
		// TODO Auto-generated method stub
		
		d1.playAudio();
		//d2.playAudio();
	}

}
