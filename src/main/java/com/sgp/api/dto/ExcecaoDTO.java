package com.sgp.api.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcecaoDTO {
    

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    private List<String> erros;

}
