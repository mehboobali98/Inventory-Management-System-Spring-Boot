package com.example.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IMS.model.ItemType;

public interface IItemTypeRepository extends JpaRepository<ItemType, Long> {

}