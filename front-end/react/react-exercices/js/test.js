const { useState } = React;

const App = () => {
    //partie js
    const [nom, setNom] = useState('Max');
    const [handle, setHandle] = useState(false);
    const change = () => {
        setNom(handle ? 'Elise' : 'Max');
        setHandle(!handle);
    }

    //partie html
    return (
        <>
            <button onClick={change}>Change</button>
            <h1>Hello {nom}</h1>
        </>
    );

};

const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);

root.render(
    <App />
);