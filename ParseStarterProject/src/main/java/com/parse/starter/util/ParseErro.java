package com.parse.starter.util;

import java.util.HashMap;

public class ParseErro{

    private HashMap<Integer,String> erros;


    public ParseErro() {
        this.erros = new HashMap<>();
        this.erros.put(201,"A senha não foi preenchida!!");
        this.erros.put(202,"Usuário já existe,escolha outro!");
    }
    public String getErro(int codErro){
        return this.erros.get(codErro);
    }
}