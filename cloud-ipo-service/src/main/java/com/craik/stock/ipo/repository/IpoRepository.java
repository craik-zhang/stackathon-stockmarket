package com.craik.stock.ipo.repository;

import com.craik.stock.entity.IpoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Repository
public interface IpoRepository extends JpaRepository<IpoEntity, Integer>  {
    public IpoEntity findById(Integer id);

    @Modifying
    @Transactional
    @Query(value = "update s_ipo i set i.conformed='1' where i.id=?", nativeQuery = true)
    public int activeIpo(@Param("id") Integer id);
}
