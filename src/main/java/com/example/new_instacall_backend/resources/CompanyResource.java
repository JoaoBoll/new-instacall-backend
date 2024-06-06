package com.example.new_instacall_backend.resources;

import com.example.new_instacall_backend.domain.Company;
import com.example.new_instacall_backend.repositories.CompanyRepository;
import com.example.new_instacall_backend.services.CompanyService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyResource {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        List< Company> list = companyService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> create(Company company) throws Exception {
        companyService.save(company);
        return ResponseEntity.ok().body(company);
    }

}