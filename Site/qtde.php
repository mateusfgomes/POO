<!DOCTYPE html>
    <html lang="pt-br">
        <head>
            <title>TeamAbrigo</title>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		    <link rel="stylesheet" type="text/css" href="./style2.css">      
        </head>
        <body>
            <main><script src="qtde_arquivos/funcoes.js"></script></main>
                <div id="container3">
                    <img id="img_3" src="tudo2.png">
                        <h1 id="procurando_abrigo">Finalizando...</h1>
                        <h1 id="opcao">Preencha as últimas informações</h1>
                        <form method="POST" action="finalizado_fisica.php">
                            <?php
                                session_start();
                                $_SESSION['nome'] = $_POST['nome'];
                                $_SESSION['telefone'] = $_POST['telefone'];
                                $_SESSION['cpf'] = $_POST['cpf'];
                                $_SESSION['endereco'] = $_POST['endereco'];
                                $_SESSION['numero'] = $_POST['numero'];
                                $_SESSION['complemento'] = $_POST['complemento'];
                            ?>
                            <input tabindex="2" required="required" min="1" max="10" placeholder="Quantas Pessoas?" type="number" id="telefone" name="qtde">
                            <input type="checkbox" id="banheiros_botao" name="banheiros" value="on">
                            <label id="banheiros">Banheiros</label>
                            <input type="checkbox" id="comida_botao" name="comida" value="on">
                            <label id="comida">Comida</label>
                            <input type="checkbox" id="internet_botao" name="internet" value="on">
                            <label id="internet">Internet</label>
                            <input type="checkbox" id="tv_botao" name="tv" value="on">
                            <label id="tv">TV</label>
                            <input type="checkbox" id="cama_botao" name="cama" value="on">
                            <label id="cama">Cama</label>
                            <button id="proximo" type="submit">
                                <h1 class="texto_retangulos">Próximo</h1>
                            </button>
                        </form>
                    </img>            
                </div>
            <footer>
            </footer>  
        </body>
</html>