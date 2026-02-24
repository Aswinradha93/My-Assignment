package week4.day1;

public class JavaConnection1 extends MySqlConnection {
    
	 @Override
	    public void connect() {
	        System.out.println("MySQL Database Connected...");
	    }

	    @Override
	    public void disconnect() {
	        System.out.println("MySQL Database Disconnected...");
	    }

	    @Override
	    public void executeUpdate() {
	        System.out.println("Update query executed successfully.");
	    }

	    @Override
	    public void executeQuery() {
	        System.out.println("Select query executed successfully.");
	    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection1 javaConnectionObj = new JavaConnection1();
		javaConnectionObj.connect();
		javaConnectionObj.disconnect();
		javaConnectionObj.executeUpdate();
		javaConnectionObj.executeQuery();

	}

}
