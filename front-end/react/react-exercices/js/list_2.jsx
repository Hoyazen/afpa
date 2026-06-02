const { useState } = React;

const App = () => {
    //partie js
    const [liste, setListe] = useState([
        { id: 1, nom: 'Ad' },
        { id: 2, nom: 'Ma' },
        { id: 3, nom: 'Jo' }
    ]);

    const listItems = liste.map((item) => <li key={item.id}>{item.nom}</li>);

    //partie html
    return (
        <>
            <div>
                <ul>
                    {listItems}
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