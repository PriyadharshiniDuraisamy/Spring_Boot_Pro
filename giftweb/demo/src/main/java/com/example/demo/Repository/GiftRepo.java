package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.GiftModel;

@Repository
public interface GiftRepo extends JpaRepository<GiftModel,Integer> {
    
}
