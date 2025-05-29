package com.marcio.casa.da.vedacao.reparo.infra;

import com.marcio.casa.da.vedacao.handler.APIException;
import com.marcio.casa.da.vedacao.reparo.apllication.repository.ReparoRepository;
import com.marcio.casa.da.vedacao.reparo.domain.Reparo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
@Log4j2
public class ReparoinfraRepository implements ReparoRepository {
    private final SpringDataJPARepository springDataJPARepository;

    @Override
    public Reparo salva(Reparo reparo) {
        log.info("[inicia] ReparoinfraRepository - salva");
        Reparo reparoSalvo = springDataJPARepository.save(reparo);
        log.info("[finaliza] ReparoinfraRepository - salva");
        return reparoSalvo;
    }

    @Override
    public Reparo buscaPorCodigo(String codigo) {
        log.info("[inicia] ReparoinfraRepository - buscaPorCodigo");
        Reparo reparo = springDataJPARepository.findByCodigo(codigo)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Codigo, nao encontrado, " +
                        "não existe na base de dados"));
        log.info("[finaliza] ReparoinfraRepository - buscaPorCodigo");
        return reparo;
    }
}
