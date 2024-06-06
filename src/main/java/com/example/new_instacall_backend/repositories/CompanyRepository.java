package com.example.new_instacall_backend.repositories;

import com.example.new_instacall_backend.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Transactional(readOnly = true)
    @Query("SELECT DISTINCT c FROM Company c WHERE c.cnpj = :cnpj")
    Company findFirstByCnpj(@Param("cnpj") String cnpj);

}
