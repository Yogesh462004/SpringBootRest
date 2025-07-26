package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Tourist;
import com.nt.repo.Myrepo;

@Service
public class Service1 {

    @Autowired
    private Myrepo repo;

    public String saveall(Tourist t) {
        int id = repo.save(t).getTid();
        return "Stored With id: " + id;
    }

    public List<Tourist> findt() {
        return repo.findAll();
    }

    public Tourist findByIdDirect(Integer id) {
        return repo.findById(id).orElse(null); // handled inside service
    }
    public String update(Tourist t) {
    	Tourist t1=repo.findById(t.getTid()).orElse(null);
    	 repo.save(t);
    	 return t1.getTid() +" Tourist Updated ";	
    }
    public String partial(Integer tid,double b) {
    	Optional<Tourist> tour=repo.findById(tid);
    	if(tour.isPresent()) {
    		Tourist tour1=tour.get();
    		tour1.setBudget(b);
    		repo.save(tour1);
    		return tid+" partially Updated";
    	}
		return "Some problem";
    }
}
