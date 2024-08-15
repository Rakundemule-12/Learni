package Oops_Programming.Browser;

public class Chrome extends Base{
    @Override
    String openBrowser(String browser)
    {
        System.out.println("Open the Chrome....,");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        return "";
    }
}
