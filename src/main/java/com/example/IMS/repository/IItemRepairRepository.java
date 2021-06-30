package com.example.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.IMS.model.ItemRepair;

@Repository
public interface IItemRepairRepository extends JpaRepository<ItemRepair, Long> {

}
