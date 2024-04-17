package com.mandadiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.mandadiClasses.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer>{

}
