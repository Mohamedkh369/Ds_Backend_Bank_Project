package dev.ds_bank_project.DTOs;


import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}