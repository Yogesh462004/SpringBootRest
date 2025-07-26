package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Tourist;
import com.nt.service.Service1;

@RestController
@RequestMapping("/tour")
public class Mini {

    @Autowired
    private Service1 serv;

    @PostMapping("/en")
    public ResponseEntity<String> reg(@RequestBody Tourist tour) {
        try {
            String msg = serv.saveall(tour);
            return new ResponseEntity<>(msg, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Problem In Tourist Enrollment", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/modify")
    public ResponseEntity<String> reg2(@RequestBody Tourist tour) {
        try {
            String msg = serv.update(tour);
            return new ResponseEntity<>(msg, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Problem In Tourist Updatement", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PatchMapping("/patch/{tid}/{budget}")
    public ResponseEntity<String> reg21(@PathVariable Integer tid,@PathVariable double budget) {
        try {
            String msg = serv.partial(tid,budget);
            return new ResponseEntity<>(msg, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Problem In Tourist Updatement", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getit")
    public ResponseEntity<?> getAllTourists() {
        try {
            List<Tourist> list = serv.findt();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Problem In Tourist Fetching", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/gettid/{tid}")
    public ResponseEntity<?> getTouristById(@PathVariable Integer tid) {
        try {
            Tourist tourist = serv.findByIdDirect(tid);
            if (tourist != null)
                return new ResponseEntity<>(tourist, HttpStatus.OK);
            else
                return new ResponseEntity<>("Tourist Not Found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("Problem In Tourist Fetching", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
