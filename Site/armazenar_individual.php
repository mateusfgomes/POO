<?php
    require_once("individuo.php");

    function escreveCabecalho($dados){
        fwrite($dados, "nome,");
        fwrite($dados, "telefone,");
        fwrite($dados, "cpf,");
        fwrite($dados, "rg");
        fwrite($dados, "\n");
    }
    
    function escreveArquivo($aux_nome, $aux_tel, $aux_cpf, $aux_rg){

        $pessoa = new Individuo();

        $pessoa->setNome($aux_nome);
        if($pessoa->getNome() == '' || $pessoa->getNome() == null){
            session_destroy();
            die("Falha");
        }
        $pessoa->setTelefone($aux_tel);
        $pessoa->setCPF($aux_cpf);
        $pessoa->setRg($aux_rg);

        $dados = fopen("/home/mateus/Documentos/Dados/dados_individual.csv", "a+") or die("Failed"); 
        $conteudo = '';
        $conteudo = fread($dados, 1);

        if($conteudo == ''){
            escreveCabecalho($dados);
        }
        
        fwrite($dados, $pessoa->getNome());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getTelefone());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getCPF());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getRg());
        fwrite($dados, "\n");


        fclose($dados);
    }

?>