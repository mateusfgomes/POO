/**
 * Funcoes utilizadas para redirecionamento da pagina
 */
function pagSeguro(){
    window.location.href = "https://pagseguro.uol.com.br/#rmcl";
}
function procurandoAbrigo(){
    window.location.href = "./procurando_abrigo.html";
}

function cadastroIndividual(){
    window.location.href = "./cadastro_individual.html";
}

function cadastroFamiliar(){
    window.location.href = "./cadastro_familiar.php";
}

function proxima_pessoa(){
    window.location.href = "./cadastro_familiar_individual.php";
}

function cadastroAbrigo(){
    window.location.href = "./oferecendo_abrigo.html";
}

function pessoaFisica(){
    window.location.href = "./pessoa_fisica.html";
}

function pessoaJuridica(){
    window.location.href = "./pessoa_juridica.html";
}

/**
 * Funcao que eh utilizada para adicionar a mascara do CPF enquanto o usuario digita o valor desse campo 
 * @param {1} cpf: O cpf com a mascara
 */
function mCPF(cpf){
    cpf=cpf.replace(/\D/g,"")
    cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
    cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
    cpf=cpf.replace(/(\d{3})(\d{1,2})$/,"$1-$2")
    return cpf
}
