package br.com.tutorial.resttutorial.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception{
        this.repository.save(new Employee("frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Ash", "Caption", "pokemon hunter"));

    }

}
