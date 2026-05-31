package com.codewithlfn.expobackend.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerDTO {
    @NotBlank(message = "Cannot be Null or blank")
    private String name;
    @NotBlank(message = "Cannot be Null or blank")
    @Size(min = 10, max = 10, message = "Cellphone must be 10 digit long")
    private String cellphone;
}
