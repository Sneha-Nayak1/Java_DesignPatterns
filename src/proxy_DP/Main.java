package proxy_DP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new ProxyClass("admin");
		f.download("cow.jpeg");
		File f1=new ProxyClass("user");
		f1.download("dog.jpeg");
		
		

	}

}

//Develop a system where users can download large files from a server.
//Downloading a large file directly might be resource-intensive, and 
//you want to add logging and access control to this process.
//You can use the Proxy design pattern to achieve this.
//1. Create a Subject Interface: Define an interface that declares
  //the method for downloading a file.
//2. Implement the Real Subject: Create a class that actually
     //downloads the file.
//3. Implement the Proxy: Create a proxy class that controls access 
    //to the real subject.
//4. Use the Proxy: Demonstrate how to use the proxy to download a
    //file with added access control and logging.