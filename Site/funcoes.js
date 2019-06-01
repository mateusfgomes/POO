function concluido() {
    var nome = document.getElementById("nome");
    var valor_nome = nome.value;
    var telefone = document.getElementById("telefone");
    var valor_telefone = telefone.value;
    var cpf = document.getElementById("cpf");
    var valor_cpf = cpf.value;
    var rg = document.getElementById("rg");
    var valor_rg = rg.value;

    window.location.href = "./finalizado.html";
}

function fazerDoacao(){

}

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
    window.location.href = "./cadastro_abrigo.html";
}


function mCPF(cpf){
    cpf=cpf.replace(/\D/g,"")
    cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
    cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
    cpf=cpf.replace(/(\d{3})(\d{1,2})$/,"$1-$2")
    return cpf
}

function fMascEx() {
    obj.value=masc(obj.value)
}

function fMasc(objeto,mascara) {
    obj=objeto
    masc=mascara
    setTimeout("fMascEx()",1)
}
