const btn = document.querySelector('.btn');
btn.style.background = 'blue';


// Busca pelos elementos do Formulário
const formulario = document.querySelector('#formulario');
const nameInput = document.querySelector('#name');
const data = document.querySelector('#dateNasc');
const msg = document.querySelector('.msg');
const msg_date = document.querySelector('.msg_dateNasc');
const userList = document.querySelector('#users');
const itens = document.getElementById('item');

formulario.addEventListener('submit', onSubmit);

function onSubmit(e) {
    e.preventDefault();

    let ano = new Date().getFullYear();
    let anoAtual = new Date(data.value).getFullYear();

    if (nameInput.value === '' || data.value === '') {
         alert('Por favor, preencha os dados.');
        msg.classList.add('error');
        msg.innerHTML = ' Preencha os dados.';
        setTimeout(() => (msg.innerHTML = ''), 3000);

    } else if ((ano - anoAtual) < 18){
        alert('Usuário menor de idade');
         
    } else {
        const li = document.createElement('li');
        li.appendChild(
            document.createTextNode(
                `Nome: ${nameInput.value} / Item: ${itens.value} / Nascimento: ${data.value}`
            )
        );
        userList.appendChild(li);
        
        const close = document.querySelectorAll('span');
            for(let i=0; i < close.length; i++){
                close[i].addEventListener('click', () =>{
                    close[i].parentElement.style.opacity = 0;
                    
                    setTimeout(() =>{
                        close[i].parentElement.style.display = 'none';
                        close[i].parentElement.remove();
        
                    }, 500);
                });
            }

                nameInput.value = '';
                data.value = '';
                data.getElementsByTagName('li')[0].selected = 'selected';
                nameInput.focus();

    }
}

function excluir(){
    var excluir = document.getElementsByTagName('li');
    excluir.parentNode.removeChild(excluir)
    return false;
}