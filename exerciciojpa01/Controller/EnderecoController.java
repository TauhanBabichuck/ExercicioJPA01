package com.example.exerciciojpa01.Controller;

import com.example.exerciciojpa01.Entity.Endereco;
import com.example.exerciciojpa01.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("endereco/")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("enderecos")
    public List<Endereco> buscarEnderecos() {
        return enderecoService.buscarEnderecos();
    }

    @PostMapping("add")
    public Endereco salvarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.salvarEndereco(endereco);
    }

    @GetMapping("address/{id}")
    public Endereco buscarEnderecoID(@PathVariable Long id) {
        return enderecoService.buscarEnderecoId(id);
    }

    @PutMapping("update/{id}")
    public Endereco atualizarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.atualizarEndereco(endereco);
    }

    @DeleteMapping("excluir/{id}")
    public void deletarEnderecoId(@PathVariable Long id) {
        enderecoService.deletarEndereco(id);;
    }

    @GetMapping("/endereco/cidade/{cidade}")
    public List<Endereco> buscarEnderecosPorCidade(@PathVariable("cidade") String cidade) {
        return enderecoService.buscarEnderecoCidade(cidade);
    }

    @GetMapping("endereco/cep/{cep}")
    public List<Endereco> buscarEnderecosCep(@PathVariable String cep) {
        return enderecoService.buscarEnderecoCep(cep);
    }
    @GetMapping("endereco/rua/{rua}")
    public List<Endereco> buscarEnderecoRua (@PathVariable String rua){
        return enderecoService.buscarEnderecoRua(rua);
    }



}

