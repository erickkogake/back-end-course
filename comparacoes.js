// == (comparaçao implícita)
// ele compara os valores, alterando automaticamente numero por string e vise e versa.

const numero = 5;
const texto = "5";

console.log(numero == texto);

// === (comparação explícita)
// ele compara também os tipos além dos valores, então precisamos alterar manualmente string ou numero, para dar certo.

let numero2 = 6;
let texto2 = "6";

console.log(numero2 === texto2);

// typeof
console.log(typeof numero2);
console.log(typeof texto2);



