package com.marcio.casa.da.vedacao.reparo.apllication.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/reparo")
@Tag(name = "reparo", description = "Endpoints para cadastrar reparo.")
public interface ReparoApi {

    @PostMapping
    @Operation(summary = "Cadastra um novo reparo")
    @ResponseStatus(HttpStatus.CREATED)
    ReparoResponse cadastraReparo(@RequestBody ReparoRequest salaoRequest);
}
