const { useState } = React;

// composant principal
const MainComponent = () => {

    // stockage du membre sélectionné
    const [selectedUser, setSelectedUser] = useState("");

    // stockage des tâches
    const [tasks, setTasks] = useState([]);

    // fonction appelée par l'enfant AddComponent
    const addTask = (task) => {

        // ajout de la nouvelle tâche dans le tableau
        setTasks([...tasks, `${selectedUser} doit faire ${task}`]);
    };

    return (
        <>
            <h1>Tâche pour {selectedUser} !</h1>
            <h2>Choisir un membre :</h2>
            <Users onUserClick={setSelectedUser} />
            <h2>Assigner une tâche :</h2>
            <AddComponent onAddTask={addTask} />
            <h2>Tâches :</h2>
            <ul>
                {tasks.map((task, index) => (
                    <li key={index}>{task}</li>
                ))}
            </ul>
        </>
    );
};

// liste d'utilisateurs
const Users = ({ onUserClick }) => {

    const [usersList] = useState([
        { id: 1, name: "Jos" },
        { id: 2, name: "Maxou" },
        { id: 3, name: "Ad" }
    ]);

    // au clic, on renvoie le nom au parent
    const usersListItems = usersList.map((item) => (
        <li key={item.id} style={{ cursor: "pointer" }} onClick={() => onUserClick(item.name)}>{item.name}</li>
    ));

    return (
        <ul>
            {usersListItems}
        </ul>
    );
};

// composant enfant
const AddComponent = ({ onAddTask }) => {

    // stockage de la tâche saisie
    const [task, setTask] = useState("");

    // fonction appelée au clic sur Ajouter
    const handleAddTask = () => {

        // enfant -> parent
        onAddTask(task);

        // remise à zéro du champ
        setTask("");
    };

    return (
        <>
            <input type="text" placeholder="doit faire ..." value={task} onChange={(e) => setTask(e.target.value)} />
            <button onClick={handleAddTask}>Ajouter</button>
        </>
    );
};

const container = document.getElementById("root");
const root = ReactDOM.createRoot(container);

root.render(
    <MainComponent />
);