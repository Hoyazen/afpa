const { useState } = React;

const App = () => {
    //partie js
    const [nom, setNom] = useState('Toto');

    //partie html
    return (
        <>
            <div>
                <input value={nom} onChange={(event) => setNom(event.target.value)} />
                <ul>
                    <li>Nom : {nom}</li>
                </ul>
            </div>
        </>
    );

};

const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);

root.render(
    <App />
);