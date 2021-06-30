package com.example.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.IMS.model.Item;

@Repository
public interface IItemRepository extends JpaRepository<Item, Long> {

}
