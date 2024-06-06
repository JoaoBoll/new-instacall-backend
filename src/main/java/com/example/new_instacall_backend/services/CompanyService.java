package com.example.new_instacall_backend.services;

import com.example.new_instacall_backend.domain.Company;
import com.example.new_instacall_backend.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> findAll() {
        List<Company> companies = companyRepository.findAll();
        return companies;
    }

    public void save(Company company) throws Exception {

        //TODO validar

        if (companyRepository.findFirstByCnpj(company.getCnpj()) != null) {
            throw new Exception("ERROOO");
        }
    }
}
