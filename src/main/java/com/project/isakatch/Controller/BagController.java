package com.project.isakatch.Controller;

import com.project.isakatch.Model.Bag;
import com.project.isakatch.Persistence.BagDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

@RestController
public class BagController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BagDao bagRepository;

    @RequestMapping("/getBagById")
    public Bag getBagById(@RequestParam(value = "id", required = false) int id) {
        logger.info("getBagById Called for id: {}", id);
        return bagRepository.findOne(id);
    }

    @RequestMapping("/getBags")
    public Collection<Bag> getBags() {
        logger.info("getBags called");
        return bagRepository.findAll();
    }

    @PostMapping("/addBag")
    public Bag addBag(@ModelAttribute Bag bag) {
        return bagRepository.save(bag);
    }
}