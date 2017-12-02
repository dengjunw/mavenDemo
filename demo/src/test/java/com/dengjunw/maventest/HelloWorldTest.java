package com.dengjunw.maventest;

import com.dengjunw.maven.HelloMaven;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by dengjunwu on 2017/11/4.
 */
public class HelloWorldTest {

    @Test
    public void testSayHello(){
        HelloMaven helloMaven = new HelloMaven();
        String result = helloMaven.sayHello();
        assertEquals("Hello Maven",result);
    }
}
