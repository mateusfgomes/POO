<?php
    function escreveCabecalho($dados){
        fwrite($dados, "cpf,");
        fwrite($dados, "valor");
        fwrite($dados, "\n");
    }

    $cpf = $_POST["cpf"];
    $valor = $_POST["doacao"];

    $valores = fopen("/home/mateus/Documentos/Dados/doacoes.csv", "a+") or die("Failed"); 
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