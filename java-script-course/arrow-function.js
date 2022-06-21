function testeNome(nome) {
  return `Meu nome é ${nome}`
}

testeNome("Erick");

console.log(testeNome);

//arrow function não utiliza {}, quando escrevemos apenas 1 linha cód., mas quando tem mais de 1 linha, utiliza.

const apresentaNome = (nome = 'erick') => { return `Meu nome é ${nome}` }


//Hoisting: arrow function se comporta como expressão de função.

const numerosPares = [2, 4, 6, 8, 10];
const somaNumerosPares = (num1, num2) => {
  if (num1 || num2 == numerosPares) {
    return `Este número é par, então ok`
  } else {
    return `Este número é ímpar, not is ok`
  } 
}

console.log(somaNumerosPares(1, 6));
console.log(apresentaNome('vinicius'));
console.log(somaNumerosPares);

