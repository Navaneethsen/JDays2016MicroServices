/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.examples.jdays2016.springboot;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author steve
 */
public interface RoadworksRepository  extends CrudRepository<PlannedWorks, Long> {
    
    @Query("select pw from PlannedWorks pw")
    public List<PlannedWorks> findAll();

    @Query("select pw from PlannedWorks pw where pw.road = :road")
    public List<PlannedWorks> getByRoad(@Param("road") String road);
    
}
