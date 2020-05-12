package com.craik.stock.company.controller;

import java.util.List;

import com.craik.stock.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.craik.stock.entity.CompanyEntity;

@RestController
@RequestMapping("/api/company")
//@CrossOrigin(origins="http://localhost:4200")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    /**
     *
     * @return
     */
    @GetMapping
    public List<CompanyEntity> findAllCompanies(){
        return (List<CompanyEntity>) companyService.findAllCompanies();
    }

    @PostMapping
    public ResponseEntity<CompanyEntity> createCompany(CompanyEntity company){
        CompanyEntity companyEntity = companyService.createCompany(company);
        return ResponseEntity.status(HttpStatus.CREATED).body(companyEntity);
    }

    @PutMapping
    public ResponseEntity<CompanyEntity> updateCompany(CompanyEntity company){
        CompanyEntity companyEntity = companyService.updateCompany(company);
        return ResponseEntity.ok(companyEntity);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        companyService.delete(id);
        return ResponseEntity.ok("Delete company successfully.");
    }
}
