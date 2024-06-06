package com.example.new_instacall_backend.domain.entity;

import com.example.new_instacall_backend.enums.EntityStatus;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public Date createDate = new Date();
    public Date updateDate;
    public int createdBy;
    public int updateBy;

    @Enumerated(EnumType.STRING)
    public EntityStatus status = EntityStatus.ACTIVE;
    public int version;
}
