const pessoas = ['Joaquim', 'José', 'Silva', 'Xavier'];

// Primeiras pessoas na festa
console.log('Pessoas que estavam na festa antes:');
console.log(pessoas);

// Amanda chegou
let a = pessoas.unshift('Amanda'); // a = 5
console.log('Quando Amanda chegou:');
console.log(a);

// Xavier foi embora
let pessoas2 = pessoas.pop(); // Xavier
console.log('Quando Xavier foi embora:');
console.log(pessoas2);

// Zuleica chegou
let z = pessoas.push('Zuleira'); // x = 5
console.log('Quando Zuleira chegou:');
console.log(a);

// Saiu Amanda
let pessoas3 = pessoas.shift(); // Amanda
console.log('Quando Amanda foi embora:');
console.log(pessoas3);

// Saiu Silva
delete pessoas[2] // Silva
console.log('Quando Silva foi embora:');
console.log(pessoas);

// Chegou a Silvana
const pessoas5 = ['Joaquim', 'José', 'Silvana','Zuleira'];



