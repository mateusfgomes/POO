<!---
    Pagina que indica que o processo de cadastro individual foi finalizado
-->
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>TeamAbrigo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" type="text/css" href="../../style2.css">      
        <body>
            <main><script src="funcoes.js"></script></main>
            <img id="img_3" src="../../tudo2.png">
                <h1 id="agradecimento">Dados Salvos</h1>
                <h1 id="opcao">Obrigado por utilizar o TeamAbrigo</h1>
                <a id="voltar_inicio" href="../../inicio.html">Voltar para o início</a>
                <?php
                    /**
                     * Chama as funcoes para gravar os dados que foram coletados
                     * no arquivo de dados
                     */
                    require_once("armazenar_individual.php");
                    $aux_nome = '';
                    $aux_tel = -1;
                    $aux_cpf = -1;
                    $aux_rg = -1;
                    $aux_nome = $_POST["nome"];
                    if($aux_nome == '' || $aux_nome == null){
                        session_destroy();
                        die();
                    }
                    $aux_tel = $_POST["telefone"];
                    $aux_cpf = $_POST["cpf"];
                    $aux_rg = $_POST["rg"];
                    escreveArquivo($aux_nome, $aux_tel, $aux_cpf, $aux_rg);
                    session_destroy();
                ?>
            </img>
        </body>
    </head>
</html>
