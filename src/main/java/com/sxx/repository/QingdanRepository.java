package com.sxx.repository;

import com.sxx.entity.QingdanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Repository
public interface QingdanRepository extends JpaRepository<QingdanEntity, Integer> {
}
