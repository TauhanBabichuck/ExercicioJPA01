package com.example.exerciciojpa01.Service;

import com.example.exerciciojpa01.Entity.Endereco;
import com.example.exerciciojpa01.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> buscarEnderecos() {
        return enderecoRepository.findAll();
    }
    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
    public Endereco buscarEnderecoId(Long id) {
        return enderecoRepository.findById(id).get();
    }
    public Endereco atualizarEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
    public void deletarEndereco(Long id) {
        if(enderecoRepository.existsById(id)){
            enderecoRepository.deleteById(id);}
        else {
            throw new RuntimeException("Endereço não encontrado!");
        }
    }
    public List<Endereco> buscarEnderecoCidade (String cidade){
        return enderecoRepository.findByCidade(cidade);
    }
    public List<Endereco> buscarEnderecoCep (String cep){
        return enderecoRepository.findAllByCep(cep);
    }
    public List<Endereco> buscarEnderecoRua (String rua){
        return enderecoRepository.findAllByRua(rua);
    }


}

