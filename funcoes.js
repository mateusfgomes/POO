function concluido() {
    var nome = document.getElementById("nome");
    var valor_nome = nome.value;
    var telefone = document.getElementById("telefone");
    var valor_telefone = telefone.value;
    var cpf = document.getElementById("cpf");
    var valor_cpf = cpf.value;
    var rg = document.getElementById("rg");
    var valor_rg = rg.value;
    var test = confirm(valor_nome + "\n" + valor_telefone + "\n" + valor_cpf + "\n" + valor_rg);

    if(test == true){
        window.location.href = "./finalizado.html";
    }
    else{
        
    }
}

function fazerDoacao(){

}

function procurandoAbrigo(){
    window.location.href = "./procurando_abrigo.html";
}

function cadastroIndividual(){
    window.location.href = "./cadastro_i.html";
}

function cadastroAbrigo(){
    window.location.href = "./cadastro_abrigo.html";
}