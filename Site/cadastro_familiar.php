<!---
    Pagina que descobre quantas pessoas de uma familia vao se cadastrar
-->
<!DOCTYPE html>
<html lang="pt-br">
	<head>
        <title>TeamAbrigo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" type="text/css" href="./style2.css">      
		<body>
            <main><script src="funcoes.js"></script></main> 
                <div id="container3">
                    <img id="img_3" src="tudo2.png">
                        <h1 id="procurando_abrigo">Cadastro Familiar</h1>
                        <h1 id="opcao" >Quantas pessoas?</h1>
                        <form method="POST" action="cadastro_familiar_individual.php">
                            <!--- Inicia uma sessao em php para carregar a variavel N (numero de pessoas) atraves das paginas-->
                            <?php
                                require_once("/var/www/teamabrigo.com/objects/familia.php");
                                session_start();
                                $familia = new Familia();
                                $_SESSION['familia'] = $familia;
                                $_SESSION['contador'] = 0;
                            ?>
                            <input tabindex="2" maxlength="11" min="1" max="10" required="required" placeholder="Insira um numero" type="number" id="n_pessoas" name="n_pessoas"><br><br>
                            <button id="concluido" type="submit">
                                <h1 class="texto_retangulos">Próximo</h1> <!--- Se insere o numero N de pessoas para a pagina a seguir se repetir N vezes-->
                            </button>
                        </form>
                    </img>    
                </div>
            <footer>
            </footer>
        </body>
    </head>
</html>
