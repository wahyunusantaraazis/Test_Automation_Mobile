package com.example;

import com.example.app.pages.CalculatorPage;
import com.example.app.pages.ListPageMenu;
import com.example.app.pages.LoginPage;
import com.example.app.pages.NavigationMenu;
import com.example.app.pages.OperationPage;

public class BaseTest {

  public LoginPage loginPage = new LoginPage();
  public CalculatorPage calculatorPage = new CalculatorPage();
  public NavigationMenu navigationMenu = new NavigationMenu();
  public ListPageMenu listPageMenu = new ListPageMenu();
  public OperationPage operationPage = new OperationPage();

}
