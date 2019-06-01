<?php
    require_once("armazenar_individual.php");
    $aux_nome = $_POST["nome"];
    $aux_tel = $_POST["telefone"];
    $aux_cpf = $_POST["cpf"];
    $aux_rg = $_POST["rg"];
    escreveArquivo($aux_nome, $aux_tel, $aux_cpf, $aux_rg);
?>
