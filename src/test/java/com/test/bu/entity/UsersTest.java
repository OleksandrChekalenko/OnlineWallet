package com.test.bu.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Cagy on 10/10/2017.
 */
public class UsersTest {


    @Test
    public void setTestName() throws Exception {
        Users user = new Users();
        user.setName("John");
        assertEquals("John", user.getName());
    }


    @Test
    public void getTestName() throws Exception {
        Users user = new Users();
        user.setName("Kevin");
        assertEquals("Kevin", user.getName());
    }


}