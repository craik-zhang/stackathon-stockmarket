package com.craik.stock.company.service;

import com.craik.stock.entity.CompanyEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CompanyService {
    public void delete(Integer id);
    public Page<CompanyEntity> findAll(int page, int pageSize);
    public List<CompanyEntity> findAllCompanies();
    public CompanyEntity findCompanyById(Integer id);
    public CompanyEntity updateCompany(CompanyEntity company);
    public CompanyEntity createCompany(CompanyEntity company);
}
