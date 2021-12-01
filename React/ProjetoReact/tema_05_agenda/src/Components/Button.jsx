import PropTypes from 'prop-types';  
<<<<<<< HEAD
  
const Button = ({ bgColor, text, onClick }) => {  
   return (  
       <button  
           onClick={onClick}  
           style={{ backgroundColor: bgColor }}  
           className="btn"  
       >  
            {text}  
        </button>  
    );  
};  
  
Button.defaultProps = {  
    bgColor: 'steelblue',  
};  
  
Button.propTypes = {  
    text: PropTypes.string.isRequired,  
    bgColor: PropTypes.string,  
    onClick: PropTypes.func,  
};  
  
export default Button;  
=======
	  
	const Button = ({ bgColor, text, onClick }) => {  
	    return (  
	        <button  
	            onClick={onClick}  
	            style={{ backgroundColor: bgColor }}  
	            className="btn"  
	        >  
	            {text}  
	        </button>  
    );  
	};  
	  
	Button.defaultProps = {  
    bgColor: 'steelblue',  
	};  
	  
	Button.propTypes = {  
	    text: PropTypes.string.isRequired,  
	    bgColor: PropTypes.string,  
	    onClick: PropTypes.func,  
	};  
	  
	export default Button;  
>>>>>>> 2f8f08182784836e97dcba490b43df56f9a2d808
