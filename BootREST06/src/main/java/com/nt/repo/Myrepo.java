package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Tourist;

public interface Myrepo extends JpaRepository<Tourist, Integer> {

}
