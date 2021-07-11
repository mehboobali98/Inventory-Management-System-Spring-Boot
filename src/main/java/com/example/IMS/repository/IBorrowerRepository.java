package com.example.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IMS.model.Borrower;

public interface IBorrowerRepository extends JpaRepository<Borrower, Long> {

}
