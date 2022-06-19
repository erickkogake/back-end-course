// 1) Declara a função.

                //string
function cliente(texto) {
   console.log(texto)
}

// 2) Executa a função (1 ou + vezes)
cliente("Olá mundo");
cliente("Olá mundos");

// três formas de escrever funções.

function soma() {
    const resultado = 2 + 2;
    console.log(resultado)
}

soma();

const resultado2 = 2 + 4;

function soma2() {
    return resultado2;
}

console.log(soma2());
