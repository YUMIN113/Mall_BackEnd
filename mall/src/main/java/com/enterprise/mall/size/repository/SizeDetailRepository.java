package com.enterprise.mall.size.repository;

import com.enterprise.mall.size.domain.SizeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeDetailRepository extends JpaRepository<SizeDetail, Long> {

}
