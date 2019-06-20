<?php
    /**
     * Pagina que realiza o controle para descobrir se deve-se adicionar outra pessoa 
     * ao vetor de N pessoas ou se todas ja foram adicionadas
     */
    require_once("/var/www/teamabrigo.com/save/armazenar_familia.php");
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
        header("Location: http://teamabrigo.com/save/finalizado2.php");
    }

?>
