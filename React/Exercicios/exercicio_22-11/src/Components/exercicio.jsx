const exercicio = () => { 
      
    const estiloh1 = { color: 'red' };
    const estilop = { backgorundColor:'pink'};
    const estiloul ={ boder:'2px solid black'}

    return (  
        <div>
            <h1 style={estiloh1}>Exercicio de React</h1> 
            <p style={estilop}>Fazendo o exercicio de react</p>
            <ul style={estiloul}>
                <li>Conteúdo</li>
                <li>Exercio</li>
                <li>Prova</li>
            </ul>
        </div>  
    );
};

export default exercicio;