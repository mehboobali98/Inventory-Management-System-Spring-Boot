package com.example.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IMS.model.Loan;

public interface IItemIssuanceRepository extends JpaRepository<Loan, Long> {

}
