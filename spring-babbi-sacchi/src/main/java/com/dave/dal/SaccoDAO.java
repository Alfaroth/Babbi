package com.dave.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dave.entities.Sacco;

public interface SaccoDAO extends JpaRepository<Sacco, Integer> {

}