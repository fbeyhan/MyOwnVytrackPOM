package com.vytrack.tests.components.login_navigation;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void login(){
        String userName = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");

        loginPage.login(userName, password);

    }



}
