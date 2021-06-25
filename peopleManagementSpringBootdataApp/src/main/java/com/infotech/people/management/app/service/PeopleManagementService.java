package com.infotech.people.management.app.service;

import com.infotech.people.management.app.dao.PeopleManagementDao;
import com.infotech.people.management.app.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleManagementService {
    @Autowired
    private PeopleManagementDao peopleManagementDao;

    public Person insert(Person person) {

        return peopleManagementDao.save(person) ;
    }


    public Person update(Person person) {
       Person person1= peopleManagementDao.findById(person.getId()).get();
       person1.setFirstName(person.getFirstName());
        return peopleManagementDao.save(person1) ;
    }

   public void delete(int id) {
       peopleManagementDao.deleteById(id);
   }

    public Person read(int id) {

        return peopleManagementDao.findById(id).get();

    }
}