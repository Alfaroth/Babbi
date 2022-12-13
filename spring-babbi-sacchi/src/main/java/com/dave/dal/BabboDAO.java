package com.dave.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dave.entities.Babbo;

public interface BabboDAO extends JpaRepository<Babbo, Integer> {

}