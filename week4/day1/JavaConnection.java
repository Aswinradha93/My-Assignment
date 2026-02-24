package week4.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
    public void connect() {
        System.out.println("Connecting to the database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Executing update query...");
    }


	public static void main(String[] args) {
		JavaConnection javaConnectionObj = new JavaConnection();
		javaConnectionObj.connect();
		javaConnectionObj.disconnect();
		javaConnectionObj.executeUpdate();
	}
}
