/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.examples.jdays2016.springboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author steve
 */
@Component("roadworksService")
@Transactional
public class RoadworksServiceImpl implements RoadworksService {
    
    private final RoadworksRepository repo;
    
    @Autowired
    public RoadworksServiceImpl(RoadworksRepository repo) {
        this.repo = repo;
    }
    
    public List<PlannedWorks> getAll() {
        return repo.findAll();
    }

    @Override
    public List<PlannedWorks> getByRoad(String road) {
        return repo.getByRoad(road);
    }
    
}
