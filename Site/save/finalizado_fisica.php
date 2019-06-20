<?php
    require_once("/var/www/teamabrigo.com/objects/PessoaFisica.php");

    /**
     * Funcao que escreve o cabecalho de um arquivo de dados de abrigos de pessoas
     * fisicas
     */
    function escreveCabecalhoFisica($dados){
        fwrite($dados, "nome,");
        fwrite($dados, "endereco,");
        fwrite($dados, "cpf,");
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

    /**
     * Funcao que escreve uma pessoa fisica no arquivo
     */
    function escrevePessoa($pessoa){

        $dados = fopen("/home/mateus/Arquivos/abrigo_fisica.csv", "a+") or die("Failed"); 
        $conteudo = '';
        $conteudo = fread($dados, 1);

        if($conteudo == ''){
            escreveCabecalhoFisica($dados);
        }
        
        fwrite($dados, $pessoa->getNome());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getEndereco());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getCPF());
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
        fwrite($dados, $pessoa->getTv());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getBanheiros());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getInternet());
        fwrite($dados, ",");
        fwrite($dados, $pessoa->getCama());
        fwrite($dados, "\n");

        fclose($dados);

    }

    /**
     * Codigo que coleta os dados e escreve no arquivo
     */
    session_start();
    $pessoa = new PessoaFisica();


    $pessoa->setNome($_SESSION['nome']);
    if($pessoa->getNome() == '' || $pessoa->getNome() == null){
        die();
    }
    $pessoa->setEndereco($_SESSION['endereco']);
    $pessoa->setCPF($_SESSION['cpf']);
    $pessoa->setNumero($_SESSION['numero']);
    $pessoa->setComplemento($_SESSION['complemento']);
    $pessoa->setTelefone($_SESSION['telefone']);
    $pessoa->setMaxpessoas($_POST['qtde']);

    $_POST['tv'] = (isset($_POST['tv'])) ? true : false;
    $_POST['banheiros'] = ( isset($_POST['banheiros']) ) ? true : false;
    $_POST['cama'] = ( isset($_POST['cama']) ) ? true : false;
    $_POST['internet'] = ( isset($_POST['internet']) ) ? true : false;
    $_POST['comida'] = ( isset($_POST['comida']) ) ? true : false;

    /**
     * Verifica se as checkboxes estao marcadas
     */
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
    /**
     * Vai para a pagina de finalizado
     */
    header("Location: http://teamabrigo.com/final.html");

?>
