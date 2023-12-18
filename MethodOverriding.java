package week4.day2;

class BasePage {
    public void findElement() {
        System.out.println("Finding element on the base page");
    }

    public void clickElement() {
        System.out.println("Clicking element on the base page");
    }

    public void enterText() {
        System.out.println("Entering text on the base page");
    }

    // Method to be overridden
    public void performCommonTasks() {
        System.out.println("Performing common tasks on the base page");
    }
}

class LoginPage extends BasePage {
    // Overriding the performCommonTasks method
    @Override
    public void performCommonTasks() {
        System.out.println("Performing common tasks specific to the login page");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating an object of the BasePage class
        BasePage basePage = new BasePage();

        // Calling methods of the base page
        basePage.findElement();
        basePage.clickElement();
        basePage.enterText();
        basePage.performCommonTasks();

        System.out.println("-----------------------");

        // Creating an object of the LoginPage class
        LoginPage loginPage = new LoginPage();

        // Calling methods of the login page (including overridden method)
        loginPage.findElement();
        loginPage.clickElement();
        loginPage.enterText();
        loginPage.performCommonTasks();
    }
}
