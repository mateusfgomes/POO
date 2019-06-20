<!---
    Pagina que se repete N vezes (uma para cada membro da familia)
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
                        <h1 id="opcao" >Preencha os dados</h1>
                        <form method="POST" action="finalizado_familia.php">
                            <?php
                                /**
                                 * Iniciando a sessao para controlar se o numero correto 
                                 * de pessoas ja foi adicionado
                                 */
                                session_start();
                                if($_SESSION['contador'] == 0){
                                    $_SESSION['n_pessoas'] = $_POST['n_pessoas'];
                                }
                                echo "<h1 id='pessoaatual'>".($_SESSION['contador'] + 1) . "ª pessoa"."</h1>";                                
                                $_SESSION['contador']++;
                            ?>
                            <input tabindex="2" maxlength="170" required="required" placeholder="Nome" type="text" id="nome" name="nome"><br><br>
                            <input tabindex="2" maxlength="11" pattern="([0-9]{10,11})" title="Preencha este campo no formato XXXXXXXXXX ou no formato YY9YYYYYYYY." placeholder="Telefone" type="text" id="telefone" name="telefone"><br><br>
                            <input tabindex="2" maxlength="11" pattern="([0-9]{11})" required="required" placeholder="CPF" type="text" id="cpf" name="cpf"><br><br>
                            <input tabindex="2" maxlength="9" pattern="([0-9]{9})" required="required" placeholder="RG" type="text" id="rg" name="rg"><br>
                            <button id="concluido" type="submit">
                                <h1 class="texto_retangulos">Próximo</h1>
                            </button>
                        </form>
                    </img>    
                </div>
            <footer>
            </footer>
        </body>
    </head>
</html>
