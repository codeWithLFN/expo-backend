package com.codewithlfn.expobackend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customers")
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk_customer_id;
    private String name;
    private String cellphone;
}
