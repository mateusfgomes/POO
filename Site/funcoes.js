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

function verificaCheckboxes(){
    
    var banheiros = 0;
    var comida = 0;
    var internet = 0;
    var tv = 0;
    var cama = 0;

    if(document.getElementById('banheiros_botao').checked){
        banheiros = 1;
    }
    if(document.getElementById('comida_botao').checked){
        comida = 1;
    }
    if(document.getElementById('internet_botao').checked){
        internet = 1;   
    }
    if(document.getElementById('tv_botao').checked){
        tv = 1;   
    }
    if(document.getElementById('cama_botao').checked){
        cama = 1;   
    }

    window.location.href = "./finalizado_juridica.php?qtde=" + document.getElementsByName('qtde') + "&banheiros="  + banheiros + "&comida=" + comida + "&internet=" + internet + "&tv=" + tv + "&cama=" + cama;

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
    window.location.href = "./oferecendo_abrigo.html";
}

function pessoaFisica(){
    window.location.href = "./pessoa_fisica.html";
}

function pessoaJuridica(){
    window.location.href = "./pessoa_juridica.html";
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
