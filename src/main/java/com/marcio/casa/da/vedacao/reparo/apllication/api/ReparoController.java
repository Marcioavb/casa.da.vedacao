package com.marcio.casa.da.vedacao.reparo.apllication.api;

import com.marcio.casa.da.vedacao.reparo.apllication.service.ReparoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Log4j2
@RestController
public class ReparoController implements ReparoApi {
    private final ReparoService reparoService;

    @Override
    public ReparoResponse cadastraReparo(ReparoRequest reparoRequest) {
        log.info("[inicia] ReparoController - cadastraReparo");
        ReparoResponse reparoCadastrado = reparoService.cadatraReparo(reparoRequest);
        log.info("[finaliza] ReparoController - cadastraReparo");
        return reparoCadastrado;
    }
}
