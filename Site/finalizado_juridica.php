<?php
    require_once("PessoaJuridica.php");

    function escreveCabecalhoJuridica($dados){
        fwrite($dados, "nome,");
        fwrite($dados, "endereco,");
        fwrite($dados, "cnpj,");
        fwrite($dados, "numero,");
        fwrite($dados, "complemento,");
        fwrite($dados, "telefone,");
        fwrite($dados, "maxpessoas,");
        fwrite($dados, "comida,");
        fwrite($dados, "tv,");
        fwrite($dados, "banheiro,");
        fwrite($dados, "internet,");
        fwrite($dados, "cama");
        fwrite($dados, "\n");
    }

    function escrevePessoa($pessoa){

        $dados = fopen("/home/mateus/Documentos/Dados/abrigo_juridica.csv", "a+") or die("Failed"); 
        $conteudo = '';
        $conteudo = fread($dados, 1);

        if($conteudo == ''){
            escreveCabecalhoJuridica($dados);
        }
        
        fwrite($dados, $pessoa->getNome());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getEndereco());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getCNPJ());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getNumero());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getComplemento());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getTelefone());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getMaxpessoas());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getComida());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getBanheiros());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getInternet());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getTv());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getCama());
        fwrite($dados, "\n");

        fclose($dados);

    }

    session_start();

    $pessoa = new PessoaJuridica();


    $pessoa->setNome($_SESSION['nome']);
    if($pessoa->getNome() == '' || $pessoa->getNome() == null){
        die();
    }
    $pessoa->setEndereco($_SESSION['endereco']);
    $pessoa->setCNPJ($_SESSION['cnpj']);
    $pessoa->setNumero($_SESSION['numero']);
    $pessoa->setComplemento($_SESSION['complemento']);
    $pessoa->setTelefone($_SESSION['telefone']);
    $pessoa->setMaxpessoas($_POST['qtde']);

    $_POST['tv'] = (isset($_POST['tv'])) ? true : false;
    $_POST['banheiros'] = ( isset($_POST['banheiros']) ) ? true : false;
    $_POST['cama'] = ( isset($_POST['cama']) ) ? true : false;
    $_POST['internet'] = ( isset($_POST['internet']) ) ? true : false;
    $_POST['comida'] = ( isset($_POST['comida']) ) ? true : false;

    if($_POST['comida']){
        $pessoa->setComida();
    }
    if($_POST['internet']){
        $pessoa->setInternet();
    }
    if($_POST['cama']){
        $pessoa->setCama();
    }
    if($_POST['banheiros']){
        $pessoa->setBanheiros();
    }
    if($_POST['tv']){
        $pessoa->setTV();
    }

    escrevePessoa($pessoa);

    session_destroy();
    header("Location: http://teamabrigo.com/final.html");
?>