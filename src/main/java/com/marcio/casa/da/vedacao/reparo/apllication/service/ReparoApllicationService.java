package com.marcio.casa.da.vedacao.reparo.apllication.service;

import com.marcio.casa.da.vedacao.reparo.apllication.api.ReparoRequest;
import com.marcio.casa.da.vedacao.reparo.apllication.api.ReparoResponse;
import com.marcio.casa.da.vedacao.reparo.apllication.repository.ReparoRepository;
import com.marcio.casa.da.vedacao.reparo.domain.Reparo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Log4j2
@Service
public class ReparoApllicationService implements ReparoService {
    private final ReparoRepository reparoRepository;
    @Override
    public ReparoResponse cadatraReparo(ReparoRequest reparoRequest) {
        log.info("[inicia] ReparoApllicationService - cadatraReparo");
        Reparo reparo = reparoRepository.salva(new Reparo(reparoRequest));
        log.info("[finaliza] ReparoApllicationService - cadatraReparo");
        return new ReparoResponse(reparo);
    }

    @Override
    public ReparoResponse buscaPorCodigo(String codigo) {
        log.info("[inicia] ReparoApllicationService - buscaPorCodigo");
        Reparo reparo = reparoRepository.buscaPorCodigo(codigo);
        log.info("[finaliza] ReparoApllicationService - buscaPorCodigo");
        return new ReparoResponse(reparo);
    }
}
