<?php

/**
 * Classe PessoaJuridica que adiciona os metodos para manipulacao de alguem que
 * oferece um abrigo e eh uma pessoa juridica
 * @author Mateus Ferreira Gomes
 */
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

    /**
     * Construtor de uma pessoa fisica, inicializa os campos com vazio
    */
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

    /**
     * Getter do nome
     * @return o nome da pessoa fisica
     */
    public function getNome(){
        return $this->nome;
    }

    /**
     * Getter do telefone
     * @return o telefone da pessoa fisica
     */
    public function getTelefone(){
        return $this->telefone;
    }

    /**
     * Getter do cpf
     * @return o cpf da pessoa fisica
     */
    public function getCNPJ(){
        return $this->cnpj;
    }

    /**
     * Getter do endereco
     * @return o endereco da pessoa fisica
     */
    public function getEndereco(){
        return $this->endereco;
    }

    /**
     * Getter do numero
     * @return o numero do logradouro da pessoa fisica
     */
    public function getNumero(){
        return $this->numero;
    }

    /**
     * Getter do complemento
     * @return o complemento do logradouro da pessoa fisica
     */
    public function getComplemento(){
        return $this->complemento;
    }

    /**
     * Getter do MaxPessoas
     * @return o numero maximo de pessoas que podem ser alojadas na casa dessa pessoa fisica
     */
    public function getMaxpessoas(){
        return $this->maxpessoas;
    }

    /**
     * Getter de banheiros
     * @return se ha banheiros disponiveis ou nao para utilizacao nesse local
     */
    public function getBanheiros(){
        return $this->banheiros;
    }

    /**
     * Getter de comida
     * @return se ha comida disponivel ou nao nesse local
     */
    public function getComida(){
        return $this->comida;
    }

    /**
     * Getter de internet
     * @return se ha internet disponivel ou nao para utilizacao nesse local
     */
    public function getInternet(){
        return $this->internet;
    }

    /**
     * Getter de tv
     * @return se ha tvs disponiveis ou nao para utilizacao nesse local
     */
    public function getTv(){
        return $this->tv;
    }

    /**
     * Getter de cama
     * @return se ha camas disponiveis ou nao para utilizacao nesse local
     */
    public function getCama(){
        return $this->cama;
    }

    /**
     * Setter do CPF
     * @param o cpf da pessoa fisica a ser setado
     */
    public function setCNPJ($num){
        $this->cnpj = $num;
    }

    /**
     * Setter do nome
     * @param o nome da pessoa fisica a ser setado
     */
    public function setNome($nome){
        $this->nome = $nome;
    }

    /**
     * Setter do telefone
     * @param o telefone da pessoa fisica a ser setado
     */
    public function setTelefone($num){
        $this->telefone = $num;
    }
    
    /**
     * Setter do endereco
     * @param o endereco da pessoa fisica a ser setado
     */
    public function setEndereco($end){
        $this->endereco = $end;
    }

    /**
     * Setter do numero
     * @param o numero do logradouro da pessoa fisica a ser setado
     */
    public function setNumero($num){
        $this->numero = $num;
    }

    /**
     * Setter do complemento
     * @param o complemento do logradouro da pessoa fisica a ser setado
     */
    public function setComplemento($comp){
        $this->complemento = $comp;
    }
    
    /**
     * Setter do maxpessoas
     * @param o numero maximo de pessoas no logradouro da pessoa fisica a ser setado
     */
    public function setMaxpessoas($max){
        $this->maxpessoas = $max;
    }

    /**
     * Setter dos banheiros
     * Ao ser chamado, esse metodo coloca sim se ha banheiros
     */
    public function setBanheiros(){
        $this->banheiros = "Sim";
    }

    /**
     * Setter da comida
     * Ao ser chamado, esse metodo coloca sim se ha comida
     */
    public function setComida(){
        $this->comida = "Sim";
    }

    /**
     * Setter da internet
     * Ao ser chamado, esse metodo coloca sim se ha internet
     */
    public function setInternet(){
        $this->internet = "Sim";
    }

    /**
     * Setter das tvs
     * Ao ser chamado, esse metodo coloca sim se ha tvs
     */
    public function setTv(){
        $this->tv = "Sim";
    }

    /**
     * Setter das camas
     * Ao ser chamado, esse metodo coloca sim se ha camas
     */
    public function setCama(){
        $this->cama = "Sim";
    }
    
}

?>