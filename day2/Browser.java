package week2.day2;

public class Browser {
    public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName;
    }
    public void loadUrl() {
        System.out.println("Application url loaded successfully");
    }

    public static void main(String[] args) {

        Browser browser = new Browser(); 

        String name = browser.launchBrowser("Chrome");
        System.out.println("Browser Name: " + name);

        browser.loadUrl();
    }
}


