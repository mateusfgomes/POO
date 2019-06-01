<?php
    require_once("armazenar_familia.php");
    session_start();
    
    $nome = $_POST["nome"];
    $telefone = $_POST["telefone"];
    $cpf = $_POST["cpf"];
    $rg = $_POST["rg"];
    colocaPessoa($nome, $telefone, $cpf, $rg);        
    
    if($_SESSION['contador'] < $_SESSION['n_pessoas']){
        header("Location: http://teamabrigo.com/cadastro_familiar_individual.php");
    }
    else{
        header("Location: http://teamabrigo.com/finalizado2.php");
    }

?>