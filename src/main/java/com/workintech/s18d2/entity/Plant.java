package com.workintech.s18d2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@MappedSuperclass
public class Plant {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column
    @NotNull(message="name connot bu null")
    @Size(min=2, max=45, message = "name size must be 2-45")
    private String name;

    @Column(name="price")
    @DecimalMin("10")
    private Double price;

}
