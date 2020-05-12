package com.craik.stock.company.repository;

import com.craik.stock.entity.CompanyEntity;
import com.craik.stock.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CompanyRepository extends JpaRepository<UserEntity, Integer> {

    public CompanyEntity findById(Integer id);

    @Modifying
    @Transactional
    @Query(value = "update s_company c set c.conformed='1' where c.id=?",nativeQuery = true)
    public int activeCompany(@Param("id") Integer id);
}
