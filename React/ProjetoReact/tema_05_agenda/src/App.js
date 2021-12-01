<<<<<<< HEAD
import Header from './Components/Header';  
=======
import Header from './Components/Header';
import Tasks from './Components/Tasks';
import { useState } from 'react';  
>>>>>>> 2f8f08182784836e97dcba490b43df56f9a2d808
  
function App() {  
	    const [tasks, setTasks] = useState([  
	        {  
	            id: 1,  
	            text: 'Consulta médica',  
                day: '5 de Fev as 14:30',  
	            reminder: true,  
	        },  
	        {  
	            id: 2,  
	            text: 'Reunião na Escola',  
	            day: '6 de Fev as 13:30',  
	            reminder: true,  
	        },  
	        {  
	            id: 3,  
	            text: 'Compras no Supermercado',  
	            day: '7 de Fev as 8:30',  
	            reminder: false,  
	        },  
	    ]);  
	  
	    return (  
        <div className="container">  
<<<<<<< HEAD
            <Header title="tarefas"/>  
        </div>  
    );  
}  
	  
export default App;  
=======
            <Header title="tarefas" />  
            <Tasks tasks={tasks} />  
        </div>  
    );  
}  
   
  
export default App
>>>>>>> 2f8f08182784836e97dcba490b43df56f9a2d808
