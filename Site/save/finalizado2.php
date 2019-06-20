<!--
    Pagina que chama a funcao para escrever os dados
    de uma familia no arquivo
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
                     * Escrevendo os dados da familia
                     */
                    require_once("armazenar_familia.php");
                    session_start();
                    escreveFamilia();
                    session_destroy();
                ?>
            </img>
        </body>
    </head>
</html>
