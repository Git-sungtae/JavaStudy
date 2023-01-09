package playGround;

//package com.ssalMuck;
//
//import com.ssalMuck.Dto.testDTO;
//import org.junit.Test;
//import org.mockito.internal.matchers.InstanceOf;
//import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

//@SpringBootTest
public class JungminTest {

//    @Test
    public void test(){

        try {
            String result = new String();
            InputStream a = new FileInputStream("/Users/kurt/data/test/test.txt");
            int i;
            while((i = a.read()) != -1 ){
                result += (char)i;
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try {
            OutputStream a = new FileOutputStream("/Users/kurt/data/test/test.txt")  ;
            String b = "fucking stream";
            byte[] c = b.getBytes();
            a.write(c);
        } catch (Exception e) {

        }*/


    }
}
