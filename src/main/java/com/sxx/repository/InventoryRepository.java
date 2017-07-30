package com.sxx.repository;

import com.sxx.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
