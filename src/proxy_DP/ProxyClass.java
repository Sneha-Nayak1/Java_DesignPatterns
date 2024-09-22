package proxy_DP;

public class ProxyClass implements File{
	String fileName;
	String userName;
    RealClass r;
	public ProxyClass(String userName) {
		this.userName = userName;
		//r=new RealClass();
	}

	@Override
	public void download(String fileName) {
		if(userName.equalsIgnoreCase("admin")) {
			r=new RealClass();
			r.download(fileName);
		}
			
		else
			System.out.println("Acccess Denied");
		
	}

}
