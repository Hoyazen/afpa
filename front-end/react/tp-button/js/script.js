const { useState } = React;

const App = () => {
    //partie js
    const [compteur, setCompteur] = useState(0);
    const change = () => {
        setCompteur(compteur + 1);
    }

    //partie html
    return (
        <>
            <button onClick={change}>+1 au compteur</button>
            <p>Compteur : {compteur}</p>
        </>
    );

};

const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);

root.render(
    <App />
);