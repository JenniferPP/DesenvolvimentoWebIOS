// Classes
class Carro {
    constructor(nome, ano) {
        this.nome = nome;
        this.ano = ano;
    }
}

// Intanciando objetos à classe
let meuCarro1 = new Carro('Ford', 2014);
let meuCarro2 = new Carro('Audi', 2019);

//Imprimindo valores
console.log(meuCarro1.nome);
console.log(meuCarro1.ano);

console.log(meuCarro2.nome);
console.log(meuCarro2.ano);


console.clear()
// Nova classe com mais de um metódo
class NovoCarro{
    constructor(nome, ano){
        this.nome = nome;
        this.ano = ano;
    }

    idadeCarro(ano){
        return ano - this.ano;
    }
}

// Busca a Data atual
let dataHoje = new Date();
let ano = dataHoje.getFullYear();



//Instanciando o Objeto novoCarro
let meuNovoCarro = new NovoCarro('Corsa', 2003);

console.log(meuNovoCarro.idadeCarro(ano));


console.clear()


//Criando nova Classe
class ClassePessoa {
    constructor(firstName, lastName, dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = new Date(dob);
    }

    getBithYear(){
        return this.dob.getFullYear();
    }

    getFullName(){
         return `${this.firstName} ${this.lastName}`; 
    }

   //const getFullName = () => {
    //    return `${this.firstName} ${this.lastName}`;
   //}
}

// Instanciando o Objeto Pessoa
let pessoa1 = new ClassePessoa('Regina', 'Phalange', '1994-01-01');
let pessoa2 = new ClassePessoa ('Ken', 'Adams', '1994-01-01');

console.log(pessoa1);

console.log(pessoa1.dob.getFullYear());
console.log(pessoa1.getBithYear());
console.log(pessoa1.getFullName());

