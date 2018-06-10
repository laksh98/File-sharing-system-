import java.rmi.Naming;
 
public class StartFileServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			
			FileServer fs=new FileServer();
			fs.setFile("C:\\Users\\LAKSH-PC\\Desktop\\Network Project\\MyFileServer\\test.txt");			
			Naming.rebind("rmi://192.168.43.54/abc", fs);
			System.out.println("File Server is Ready");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}