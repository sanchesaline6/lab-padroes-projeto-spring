package one.digitalinnovation.gof.service;

/*
* Client HTTP, criado via <b>OpenFeign<b>, para o consumo da API do
* <b>ViaCEP<b>
*/

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping( "/{cep}/json/")
    Endereco consultarCEP(@PathVariable("cep") String cep);
}
