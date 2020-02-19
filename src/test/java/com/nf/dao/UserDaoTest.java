package com.nf.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void insert() {
        new UserDao().insert();
    }
}