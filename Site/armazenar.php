<?php
function escreveCabecalho($dados){
    fwrite($dados, "nome,");
    fwrite($dados, "telefone,");
    fwrite($dados, "cpf,");
    fwrite($dados, "rg");
    fwrite($dados, "\n");
}

$dados = fopen("/home/mateus/Documentos/Dados/dados.csv", "a+") or die("Failed"); 
$conteudo = '';
$conteudo = fread($dados, 1);

if($conteudo == ''){
    escreveCabecalho($dados);
}

$nome = $_POST["nome"];
$telefone = $_POST["telefone"];
$cpf = $_POST["cpf"];
$rg = $_POST["rg"];

fwrite($dados, $nome);
fwrite($dados, ",");
fwrite($dados, $telefone);
fwrite($dados, ",");
fwrite($dados, $cpf);
fwrite($dados, ",");
fwrite($dados, $rg);
fwrite($dados, "\n");


fclose($dados);
echo "Escrito";

?>