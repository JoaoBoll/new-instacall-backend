package com.example.new_instacall_backend.domain;

import ch.qos.logback.core.util.StringUtil;
import com.example.new_instacall_backend.domain.entity.BaseEntity;
import com.example.new_instacall_backend.enums.EntityStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Company extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;
    private String casualName;
    private String cnpj;

    public String getCasualName() {
        if (StringUtil.isNullOrEmpty(this.casualName)) {
            return name;
        } else {
            return casualName;
        }
    }

}
