package com.example.tutoriareto3.repository;

import com.example.tutoriareto3.entities.Machine;
import com.example.tutoriareto3.repository.crudRepository.MachineCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MachineRepository {

    @Autowired
    private MachineCrudRepository machineCrudRepository;

    public List<Machine> getALL(){
        return (List<Machine>)  machineCrudRepository.findAll();
    }

    public Machine save(Machine m){
        return  machineCrudRepository.save(m);
    }

    public void delete(Machine m){
        machineCrudRepository.delete(m);
    }

    public Optional<Machine> getMachine(int id){
        return machineCrudRepository.findById(id);
    }
}
