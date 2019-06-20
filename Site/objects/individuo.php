<?php

/**
 * Classe individuo criada para que armazenasse indivualmente os dados coletados dos desbrigados
 */
class Individuo{

    private $nome;
    private $telefone;
    private $cpf;
    private $rg;

    /**
     * Construtor que inicializa o objeto
     */
    public function __construct(){
        $nome = "";
        $telefone = -1;
        $cpf = -1;
        $rg = -1;
    }

    /**
     * Getter do Nome 
     * @return o nome do individuo
     */
    public function getNome(){
        return $this->nome;
    }

    /**
     * Getter do telefone
     * @return o telefone do individuo
     */
    public function getTelefone(){
        return $this->telefone;
    }

    /**
     * Getter do cpf
     * @return o cpf do individuo
     */
    public function getCPF(){
        return $this->cpf;
    }

    /**
     * Getter do RG
     * @return o rg do individuo
     */
    public function getRg(){
        return $this->rg;
    }

    /**
     * Setter do CPF
     * @param o cpf a ser setado
     */
    public function setCPF($num){
        $this->cpf = $num;
    }

    /**
     * Setter do nome
     * @param o nome a ser setado
     */
    public function setNome($nome){
        $this->nome = $nome;
    }

    /**
     * Setter do telefone
     * @param o telefone a ser setado
     */
    public function setTelefone($num){
        $this->telefone = $num;
    }
    
    /**
     * Setter do rg
     * @param o rg a ser setado
     */
    public function setRg($num){
        $this->rg = $num;
    }

}

?>