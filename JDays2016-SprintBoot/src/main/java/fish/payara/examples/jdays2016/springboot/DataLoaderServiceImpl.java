/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.examples.jdays2016.springboot;

import fish.payara.examples.jdays2016.jaxb.HaPlannedRoadworks;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author steve
 */
@Component("dataLoaderService")
@Transactional
public class DataLoaderServiceImpl implements DataLoaderService {
    
    private final RoadworksRepository repo;
    
    @Autowired
    public DataLoaderServiceImpl(RoadworksRepository repo) {
        this.repo = repo;
    }

    @Override
    public long parseFile(File file) {
        JAXBContext jc;
        int count = 0;
        try {
            jc = JAXBContext.newInstance("fish.payara.examples.jdays2016.jaxb");
            Unmarshaller um = jc.createUnmarshaller();
            HaPlannedRoadworks rw = (HaPlannedRoadworks) um.unmarshal(file);
            for (HaPlannedRoadworks.HaPlannedWorks works : rw.getHaPlannedWorks()) {
                PlannedWorks pw = new PlannedWorks(works);
                repo.save(pw);
                count++;
            }
        } catch (JAXBException ex) {
            Logger.getLogger(DataLoaderServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;

    }
    
}
