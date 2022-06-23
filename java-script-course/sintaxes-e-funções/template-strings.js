const nome = "Livia";
const age = 2022-2019;
const cityNascimento = "Sta Isabel";

//const presentation = "My name is " + nome + ", i'm from " + cityNascimento + " - SP and i'm " + age + " years old.";

// Podemos utilizar o template, para facilitar o modo de execução do código em string.
//template é composto pelo acento grave " ` " , e quando vamos chamar uma variável utiliza o ${nome} - exemplo.

const presentation = `My name is ${nome}, i'm from ${cityNascimento} - SP and i'm ${age} years old.`

console.log(presentation);