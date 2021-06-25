package com.infotech.people.management.app.controller;


import com.infotech.people.management.app.entities.Person;
import com.infotech.people.management.app.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private PeopleManagementService peopleManagementService;

    @PostMapping ("/insert")
    public Person insert(@RequestBody Person person) {

        return peopleManagementService.insert(person);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person){
        return peopleManagementService.update(person);
    }
    @DeleteMapping("/delete/{id}")
   private void delete(@PathVariable("id") int id){
        peopleManagementService.delete(id);
    }




//    @GetMapping("/read/{id}")
//    private Person read(@PathVariable("id") int id)
//    {
//
//        return peopleManagementService.read(id);
//    }
        @GetMapping ("/read")
            public Person read(@RequestParam int id) {

                return peopleManagementService.read(id);
        }

}