package com.craik.stock.company.service;

import com.craik.stock.entity.CompanyEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public class CompanyBusiness implements CompanyService {
    @Override
    public void delete(Integer id) {

    }

    @Override
    public Page<CompanyEntity> findAll(int page, int pageSize) {
        return null;
    }

    @Override
    public List<CompanyEntity> findAllCompanies() {
        return null;
    }

    @Override
    public CompanyEntity findCompanyById(Integer id) {
        return null;
    }

    @Override
    public CompanyEntity updateCompany(CompanyEntity company) {
        return null;
    }

    @Override
    public CompanyEntity createCompany(CompanyEntity company) {
        return null;
    }
}
