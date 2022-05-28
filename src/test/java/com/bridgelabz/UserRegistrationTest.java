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
    public void  givenMobileNumber_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("917066647330");
        Assert.assertEquals(false,valid);
    }
}