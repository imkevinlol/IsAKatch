package com.project.isakatch.Persistence;

import com.project.isakatch.Model.Bag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BagDao extends CrudRepository<Bag, Integer>{
    List<Bag> findAll();
}