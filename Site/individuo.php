<?php

class Individuo{

    private $nome;
    private $telefone;
    private $cpf;
    private $rg;

    public function __construct(){
        $nome = "";
        $telefone = -1;
        $cpf = -1;
        $rg = -1;
    }


    public function getNome(){
        return $this->nome;
    }

    public function getTelefone(){
        return $this->telefone;
    }

    public function getCPF(){
        return $this->cpf;
    }

    public function getRg(){
        return $this->rg;
    }

    public function setCPF($num){
        $this->cpf = $num;
    }

    public function setNome($nome){
        $this->nome = $nome;
    }

    public function setTelefone($num){
        $this->telefone = $num;
    }
    
    public function setRg($num){
        $this->rg = $num;
    }

}

?>