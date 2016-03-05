/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.examples.jdays2016.springboot;

import java.io.File;

/**
 *
 * @author steve
 */
public interface DataLoaderService {
    
    public long parseFile(File file);
    
}
