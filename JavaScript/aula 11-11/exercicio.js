class contaBancaria{
    constructor (nome, idade, salario, sexo, agencia, conta, tipoConta){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.sexo = sexo;
        this.agencia = agencia;
        this.conta = conta;
        this.tipoConta = tipoConta;
    }
    
    contaPoupanca(tipoConta){
        return this.salario * 1.5;
    };

    contCorrente(tipoConta){
        return this.salario * 3.6;
    };

    contaEstudante(tipoConta){
        return this.salario * 1.2;
    };
}

let dadosUser = new contaBancaria ('Pheeb', '34', 1500, 'femino', '12345-6', '78910', contaEstudante());
let descSalario =