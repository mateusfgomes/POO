<?php
require_once("individuo.php");

/**
 * Classe familia, composta de varios individuos
 */
class Familia{

    private $pessoa;

    /**
     * A classe consiste de um vetor de pessoas inicializado no construtor
     */
    public function __construct(){
        $this->pessoa = array();
    }

    /**
     * Metodo que adiciona um individuo na familia
     * se adicionou retorna true, senao false
     */
    public function addPessoa(Individuo $add){
        if(count($this->pessoa) < 11){
            array_push($this->pessoa, $add);
            return true;
        }
        return false;
    }

    /**
     * Getter da familia
     * @return a familia (o proprio vetor)
     */
    public function getFamilia(){
        return $this->pessoa;
    }

    /**
     * Getter do numero de pessoas
     * @return o numero de pessoas da familia (tamanho do vetor)
     */
    public function getN_pessoas(){
        return count($this->pessoa);
    }
}

?>