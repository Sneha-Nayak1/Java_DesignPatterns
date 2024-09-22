package bridge_DP;

public  abstract class MediaFile {
	Device d1;
	//Device d2;
	public MediaFile(Device d1) {
		this.d1=d1;
		//this.d2=d2;
	}
	
	abstract void media();
}
