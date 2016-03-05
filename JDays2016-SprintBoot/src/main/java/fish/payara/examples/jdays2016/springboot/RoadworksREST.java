package fish.payara.examples.jdays2016.springboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steve
 */
@RestController
public class RoadworksREST {
    
    @Autowired
    private RoadworksService service;
    
    @RequestMapping("/roadworks")
    public List<PlannedWorks> getAll() {
        return service.getAll();
    } 
    
    @RequestMapping("/roadworks/road/{road}")
    public List<PlannedWorks> getByRoad(@PathVariable("road") String road) {
        return service.getByRoad(road);
    }
    
    
}
