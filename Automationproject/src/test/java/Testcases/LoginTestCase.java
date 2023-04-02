package Testcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import TestData.DataProviderclass;

import java.util.HashMap;
import java.util.Scanner;

public class LoginTestCase extends BaseTestClass {
    @Test(dataProvider = "dp", dataProviderClass = DataProviderclass.class)
    @Ignore
    public void Login(String username, String password) {

        HomePage homepage = new HomePage(driver);
        log.info("We are on home page ");
        homepage.ClickonLoginBtn();
        LoginPage loginPage = new LoginPage(driver);
        log.info("We are on Login page ");
        loginPage.EnterUsername(username);
        loginPage.EnterPassword(password);
        loginPage.EnterLoginBtn();
        log.info("Login Successful");

        System.out.println(driver.getTitle());

        try {
            String Actual = driver.findElement(By.xpath("//p[text()='Admin1']")).getText();

        } catch (Exception e) {


            Assert.assertTrue(false);

        }
        Assert.assertTrue(true);

    }


    public static void main(String[] args) {
        //if  a number is agile number or not
        //sum of digit all all number , multipliation of gigit is equals
       /*
        int num = 1231;
        int r = 0;
        int sum = 0;
        int mul = 1;
        while (num > 0) {
            r = num % 10;
            sum = sum + r;
            mul = mul * r;
            num = num / 10;
        }

        if (sum == mul) {
            System.out.println("agile number");
        } else {
            System.out.println("not agile number");
        }
        */
        Scanner sc=new Scanner(System.in);
        String input=sc.next().trim().toLowerCase();

       HashMap<Character,Integer>hm=new HashMap<>();

       for(int i=0;i<input.length();i++)
       {

           hm.put(input.charAt(i),hm.getOrDefault(input.charAt(i),0) +1);

       }
        System.out.println(hm);

//1 > 2>3>4>5
        Node head;
        Node curr=head.next;
        falg=false;
        while(curr!=null)
        {

                    if(curr==head)
                    {

                                break;
                    }
                    curr=curr.next;
        }
        if(curr==null )
        {

        }

    }












}