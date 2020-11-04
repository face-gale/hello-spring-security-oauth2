package com.aodiv.spring.security.oauth2.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OAuth2ServerApplicationTest {

    @Test
    public void testBCryptPasswordEncoder(){
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }

}