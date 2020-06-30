package com.craik.stock.ipo.service;

import com.craik.stock.entity.IpoEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public class IpoBusiness implements IpoService{
    @Override
    public Page<IpoEntity> findAll(int page, int pageSize) {
        return null;
    }

    @Override
    public List<IpoEntity> findAllIpos() {
        return null;
    }

    @Override
    public IpoEntity findIpoById(Integer id) {
        return null;
    }

    @Override
    public IpoEntity addIpo(IpoEntity ipo) {
        return null;
    }

    @Override
    public IpoEntity updateIpo(IpoEntity ipo) {
        return null;
    }

    @Override
    public IpoEntity activeIpo(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
