package com.marcio.casa.da.vedacao.reparo.apllication.service;

import com.marcio.casa.da.vedacao.reparo.apllication.api.ReparoRequest;
import com.marcio.casa.da.vedacao.reparo.apllication.api.ReparoResponse;

public interface ReparoService {
    ReparoResponse cadatraReparo(ReparoRequest reparoRequest);
}
