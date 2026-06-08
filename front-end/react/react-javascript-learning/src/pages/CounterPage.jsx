import { useState } from "react";

const CounterPage = () => {
    /**
     * TODO Déclaration de l'état stockant la valeur du compteur
     * 
     * Plus d'information sur la déclaration des useState : https://www.w3schools.com/react/react_usestate.asp
     */
    const [compteur, setCompteur] = useState(0);


    /**
     * TODO implémenter Fonction permettant d'incrémenter l'état du compteur.
     * 
     * Utilisée en tant que "handler" d'un évènement "click".
     * 
     * Pour un exemple d'implémentation d'un bouton vous pourrez vous inspirer de l'article suivant : https://blog.logrocket.com/react-onclick-event-handlers-guide/#react-onclick-handler
     */
    function incrementCompteur () {
        setCompteur (
            compteur + 1
        )
    }

    /**
     * On renvoie le JSX correspond à ce qui est à afficher
     */
    return (
        <>
            <h2>Compteur :</h2>
            {/* TODO compléter le code affichant le nombre de clics et des boutons */}
            <p>{compteur}</p>
            <button onClick={incrementCompteur}>Ajouter</button>
        </>
    )
}

export default CounterPage;