<?php
require_once("/var/www/teamabrigo.com/objects/familia.php");

    /**
     * Funcao que escreve o cabecalho de um arquivo que contem familias
     */
    function escreveCabecalho($dados){
        fwrite($dados, "nome,");
        fwrite($dados, "telefone,");
        fwrite($dados, "cpf,");
        fwrite($dados, "rg,");
        fwrite($dados, "tag"); //"Numero" da familia
        fwrite($dados, "\n");
    }

    /**
     * Funcao que escreve os dados coletados da familia em um arquivo
     */
    function escreveFamilia(){

        session_start();

        $dados = fopen("/home/mateus/Arquivos/dados_familia.csv", "a+") or die("Failed"); 
        $conteudo = '';
        $conteudo = fread($dados, 1);
        $tag = 0;
        $flag = 0;

        if($conteudo == ''){
            escreveCabecalho($dados);
            $flag = -1;
        }
        if($flag == 0){
            fseek($dados, -2, SEEK_END);
            $tag = fread($dados, 4) + 1;
            fseek($dados, 0, SEEK_END);
        }
        
        for($j = 0; $j < count($_SESSION['familia']->getFamilia()); $j++){
            /**
             * Para evitar que o usuario recarregue a pagina e fique gravando varias vezes
             */
            if($_SESSION['familia']->getFamilia()[$j]->getNome() == '' || $_SESSION['familia']->getFamilia()[$j]->getNome() == null){
                session_destroy();
                die("Falha");
            }
            fwrite($dados, $_SESSION['familia']->getFamilia()[$j]->getNome());
            fwrite($dados, ",");
            fwrite($dados, $_SESSION['familia']->getFamilia()[$j]->getTelefone());
            fwrite($dados, ",");
            fwrite($dados, $_SESSION['familia']->getFamilia()[$j]->getCPF());
            fwrite($dados, ",");
            fwrite($dados, $_SESSION['familia']->getFamilia()[$j]->getRg());
            fwrite($dados, ",");
            fwrite($dados, $tag);
            fwrite($dados, "\n");

        }
        fclose($dados);
    }

    /**
     * Funcao que adiciona uma pessoa no vetor de pessoas(add um individuo na familia)
     */
    function colocaPessoa($nome, $telefone, $cpf, $rg){

        session_start();

        $adicionar = new Individuo();

        $adicionar->setNome($nome);
        $adicionar->setTelefone($telefone);
        $adicionar->setCPF($cpf);
        $adicionar->setRg($rg);
        
        $_SESSION['familia']->addPessoa($adicionar);
    }


?>

