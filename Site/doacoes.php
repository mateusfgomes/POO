<?php
    /**
     * Funcao que escreve o cabecalho do arquivo de doacoes
     */
    function escreveCabecalho($dados){
        fwrite($dados, "cpf,");
        fwrite($dados, "valor");
        fwrite($dados, "\n");
    }

    /**
     * Escrevendo doacao e tambem o cpf para relacionar o valor doado com a pessoa que o doa
     */
    $cpf = $_POST["cpf"];
    $valor = $_POST["doacao"];

    $valores = fopen("/home/mateus/Arquivos/doacoes.csv", "a+") or die("Failed"); 
    $conteudo = '';
    $conteudo = fread($valores, 1);

    if($conteudo == ''){
        escreveCabecalho($valores);
    }

    fwrite($valores, $cpf);
    fwrite($valores, ",");
    fwrite($valores, $valor);
    fwrite($valores, "\n");


    fclose($valores);

    header("Location: http://teamabrigo.com/final_doacao.php");

?>