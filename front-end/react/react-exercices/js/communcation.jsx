const { useState } = React;

const CountryCapital = ({ country, onUpdateCapital }) => {
    const [input, setInput] = useState('');
    const handleClick = () => {
        onUpdateCapital(country, input);
    };

    return (
        <>
            <div>
                <strong>{country}</strong> : Capitale ?
                <br />
                <input type="text" value={input} onChange={(e) => setInput(e.target.value)} placeholder={`Capitale de ${country}`} />
                <button onClick={handleClick}>Valider</button>
                <hr />
            </div>
        </>
    );
};

const App = () => {
    //partie js
    const [capitals, setCapitals] = useState([

    ]);

    const updateCapital = (country, capital) => {
        const newCapital = {
            newCountry: country,
            newCapital: capital
        }

        setCapitals([...capitals, newCapital]);
    };

    const capitalsList = capitals.map((item, i) => <li key={i}>{item.newCountry} : {item.newCapital}</li>)

    //partie html
    return (
        <>
            <h1>Capitales uwu :</h1>
            <ul>
                {capitalsList}
            </ul>
            <CountryCapital country="France" onUpdateCapital={updateCapital} />
            <CountryCapital country="Italie" onUpdateCapital={updateCapital} />
            <CountryCapital country="Portugal" onUpdateCapital={updateCapital} />
        </>
    );

};

const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);

root.render(
    <App />
);