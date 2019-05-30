<?php
    function escreveCabecalho($dados){
        fwrite($dados, "nome,");
        fwrite($dados, "telefone,");
        fwrite($dados, "cpf,");
        fwrite($dados, "rg");
        fwrite($dados, "\n");
    }

    $nome = $_POST["nome"];
    $telefone = $_POST["telefone"];
    $cpf = $_POST["cpf"];
    $rg = $_POST["rg"];

    $dados = fopen("/home/mateus/Documentos/Dados/dados_individual.csv", "a+") or die("Failed"); 
    $conteudo = '';
    $conteudo = fread($dados, 1);

    if($conteudo == ''){
        escreveCabecalho($dados);
    }

    fwrite($dados, $nome);
    fwrite($dados, ",");
    fwrite($dados, $telefone);
    fwrite($dados, ",");
    fwrite($dados, $cpf);
    fwrite($dados, ",");
    fwrite($dados, $rg);
    fwrite($dados, "\n");


    fclose($dados);
    echo "Escrito";

?>