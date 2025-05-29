package com.marcio.casa.da.vedacao.reparo.apllication.service;

import com.marcio.casa.da.vedacao.reparo.apllication.api.ReparoRequest;
import com.marcio.casa.da.vedacao.reparo.apllication.api.ReparoResponse;

import java.util.List;

public interface ReparoService {
    ReparoResponse cadatraReparo(ReparoRequest reparoRequest);
    ReparoResponse buscaPorCodigo(String codigo);

    List<ReparoResponse> buscaPorMedidas(String medidas);
}
