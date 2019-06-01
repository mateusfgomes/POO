<?php
require_once("familia.php");


    function escreveCabecalho($dados){
        fwrite($dados, "nome,");
        fwrite($dados, "telefone,");
        fwrite($dados, "cpf,");
        fwrite($dados, "rg,");
        fwrite($dados, "tag");
        fwrite($dados, "\n");
    }

    function escreveFamilia(){

        session_start();

        $dados = fopen("/home/mateus/Documentos/Dados/dados_familia.csv", "a+") or die("Failed"); 
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

