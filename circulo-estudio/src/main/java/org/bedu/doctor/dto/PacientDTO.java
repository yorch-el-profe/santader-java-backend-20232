package org.bedu.doctor.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class PacientDTO {
    
    private long id;
    private String name;
    private String email;
    private String nss;
    private Date birthDate;
}
