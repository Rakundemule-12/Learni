package Oops_Programming.Browser;

abstract public class Base extends GrandBase {
    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);
//    BaseClass(){


    @Override
    void takescreenshot()
    {
        System.out.println("Ok Taking Screenshot");

    }
}


