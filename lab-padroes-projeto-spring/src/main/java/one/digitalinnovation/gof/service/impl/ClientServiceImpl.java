package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClientService;

/*
* Implementação de <b>Strategy</b> {@link ClientService}, a qual pode ser
* injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
* {@link Service}, ela será tratada como um <b>Singleton</b>
* */
public class ClientServiceImpl implements ClientService {

    // TODO Singleton: Injetar os componentes do Spring com @Autowired
    // TODO Strategy: Implementar os métodos definidos na interface.
    // TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
    @Override
    public Iterable<Cliente> buscarTodos() {
        // FIXME Buscar todos os clientes.
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // FIXME Buscar cliente por ID.
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {
        // FIXME Verificar se o Endereço do Cliente já existe (pelo CEP)
        // FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        // FIXME Inserir Cliente, vinculando o Endereço (novo ou existente)
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // FIXME buscar Cliente por ID, caso exista:
        // FIXME Verificar se o Endereço co Cliente já existe (pelo CEP).
        // FIXME Caso não exista, integrar com o ViaCep e persistir o retorno.
        // FIXME Alterar Cliente, vinculando o Endereço (novo ou existente).
    }

    @Override
    public void deletar(Long id) {
        // FIXME Deletar o cliente pelo ID.
    }
}
