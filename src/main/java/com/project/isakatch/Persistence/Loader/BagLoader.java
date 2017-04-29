package com.project.isakatch.Persistence.Loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.project.isakatch.Model.Bag;
import com.project.isakatch.Persistence.BagDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BagLoader implements ApplicationListener<ContextRefreshedEvent> {

    private BagDao bagRepository;

    private Logger log = LoggerFactory.getLogger(BagLoader.class);

    @Autowired
    public void setBagRepository(BagDao bagRepository) {
        this.bagRepository = bagRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Bag chloe = new Bag();
        chloe.setId(1);
        chloe.setName("Chloe");
        bagRepository.save(chloe);

        log.info("Saved Shirt - id: " + chloe.getId());

    }
}