/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.examples.jdays2016.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author steve
 */
@SpringBootApplication
@ServletComponentScan
public class RoadworksApplication {
    
    public static void main(String args[]) {
        ApplicationContext ctx = SpringApplication.run(RoadworksApplication.class, args);
    }
    
}
