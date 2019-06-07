<?php

class PessoaJuridica{

    private $nome;
    private $telefone;
    private $cnpj;
    private $endereco;
    private $numero;
    private $complemento;
    private $maxpessoas;
    private $banheiros;
    private $comida;
    private $internet;
    private $tv;
    private $cama;

    public function __construct(){
        $this->nome = "";
        $this->telefone = -1;
        $this->cnpj = -1;
        $this->endereco = "";
        $this->numero = -1;
        $this->complemento = -1;
        $this->maxpessoas = -1;
        $this->banheiros = "Nao";
        $this->comida = "Nao";
        $this->internet = "Nao";
        $this->tv = "Nao";
        $this->cama = "Nao";
    }


    public function getNome(){
        return $this->nome;
    }

    public function getTelefone(){
        return $this->telefone;
    }

    public function getCNPJ(){
        return $this->cnpj;
    }

    public function getEndereco(){
        return $this->endereco;
    }

    public function getNumero(){
        return $this->numero;
    }

    public function getComplemento(){
        return $this->complemento;
    }

    public function getMaxpessoas(){
        return $this->maxpessoas;
    }

    public function getBanheiros(){
        return $this->banheiros;
    }

    public function getComida(){
        return $this->comida;
    }

    public function getInternet(){
        return $this->internet;
    }
    
    public function getTv(){
        return $this->tv;
    }

    public function getCama(){
        return $this->cama;
    }

    public function setCNPJ($num){
        $this->cnpj = $num;
    }

    public function setNome($nome){
        $this->nome = $nome;
    }

    public function setTelefone($num){
        $this->telefone = $num;
    }
    
    public function setEndereco($end){
        $this->endereco = $end;
    }

    public function setNumero($num){
        $this->numero = $num;
    }

    public function setComplemento($comp){
        $this->complemento = $comp;
    }
    
    public function setMaxpessoas($max){
        $this->maxpessoas = $max;
    }

    public function setBanheiros(){
        $this->banheiros = "Sim";
    }

    public function setComida(){
        $this->comida = "Sim";
    }

    public function setInternet(){
        $this->internet = "Sim";
    }

    public function setTv(){
        $this->tv = "Sim";
    }

    public function setCama(){
        $this->cama = "Sim";
    }
    
}

?>