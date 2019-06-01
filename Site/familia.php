<?php
require_once("individuo.php");

class Familia{

    private $pessoa;

    public function __construct(){
        $this->pessoa = array();
    }

    public function addPessoa(Individuo $add){
        if(count($this->pessoa) < 11){
            array_push($this->pessoa, $add);
            return true;
        }
        return false;
    }

    

    public function getFamilia(){
        return $this->pessoa;
    }

    public function getN_pessoas(){
        return count($this->pessoa);
    }
}

?>