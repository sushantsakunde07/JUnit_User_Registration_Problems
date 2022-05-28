package com.bridgelabz;

import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void  givenFirstName_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.firstName("Sushant");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenFirstName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.firstName("sushant");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenLastName_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.lastName("Sakunde");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenLastName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.lastName("sakunde");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenEmailAddress_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.emailAddress("sushantsakunde07@gmail.com");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenEmailAddress_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.emailAddress("sushantsakunde07@");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenMobileNumber_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("91 7066647330");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenMobileNumber_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("917066647330");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule1_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule1("ASasc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule1_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule1("AV12@#");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule2("ASasc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule2("abc1234@df1");
        Assert.assertEquals(false,valid);
    }

}