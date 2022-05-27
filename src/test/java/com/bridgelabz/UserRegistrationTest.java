package com.bridgelabz;

import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean valid = userRegistration.firstName("Sushant");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnTrue() {
        boolean valid = userRegistration.firstName("sushant");
        Assert.assertEquals(false, valid);
    }
}