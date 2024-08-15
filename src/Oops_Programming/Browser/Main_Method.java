package Oops_Programming.Browser;

public class Main_Method {
    public static void main(String[] args) {
        Chrome c = new Chrome();
        System.out.println(c.openBrowser("CHROME"));

        Firefox f = new Firefox();
        System.out.println(f.openBrowser("FF"));
        f.takescreenshot();
    }
}
