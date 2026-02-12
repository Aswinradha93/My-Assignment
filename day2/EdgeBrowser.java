package week2.day2;

public class EdgeBrowser {

    public static void main(String[] args) {

        Browser browser = new Browser();   
        String name = browser.launchBrowser("Edge");
        System.out.println("Browser Name: " + name);

        browser.loadUrl();
    }
}
