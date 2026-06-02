const { useState } = React;

const App = () => {
    //partie js
    const [nom, setNom] = useState('');

    const [liste, setListe] = useState([

    ]);

    const change = () => {
        setListe([...liste, { id: liste.length, nom }]);
    }

    const listItems = liste.map((item) => <li key={item.id}>id: {item.id} et nom: {item.nom}</li>);

    //partie html
    return (
        <>
            <div>
                <input value={nom} onChange={(event) => setNom(event.target.value)} />
                <ul>
                    {listItems}
                </ul>
                <button onClick={change}>Ajouter</button>
            </div>
        </>
    );

};

const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);

root.render(
    <App />
);