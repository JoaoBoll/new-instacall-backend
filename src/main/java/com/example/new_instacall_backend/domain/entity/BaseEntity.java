package com.example.new_instacall_backend.domain.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    public int Id;

    public Date createDate;
    public Date updateDate;
    public int createdBy;
    public int updateBy;
    public string Status
    public bool IsDeleted
    public int Version
    public string Remarks
    public void UpdateTimestamp
}
