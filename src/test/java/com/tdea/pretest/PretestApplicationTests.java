package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void contextLoads() {
        String  dbPassword ="123";
        String password= "1234";

        boolean result = UserUtils.isPasswordEqual(dbPassword, password);

        assertFalse(result);

    }

}
