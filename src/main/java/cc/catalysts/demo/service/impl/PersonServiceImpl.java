package cc.catalysts.demo.service.impl;

import cc.catalysts.demo.model.Person;
import cc.catalysts.demo.service.PersonService;
import org.springframework.stereotype.Service;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by schmidtda on 09.02.2016.
 */

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> findAll() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Daniela", "Schmidt"));
        personList.add(new Person("Klaus", "Lehner"));
        personList.add(new Person("Jutta", "Rameder"));
        personList.add(new Person("Barbara", "Hörmann-Pemöller"));
        return personList;
    }
}
