// declaração de função

function apresenta() {
    console.log("Olá mundo.")
}

apresenta();

//expressão de função - nesse caso se registrar essa variável antes da declaração dela, não executa.

//console.log(nome("massa"));

const nome = function(texto) {return texto}

console.log(nome("Me apavorei"));


//var nome2 = function(texto) {return texto}
//console.log(nome2("Não se apavore")); 