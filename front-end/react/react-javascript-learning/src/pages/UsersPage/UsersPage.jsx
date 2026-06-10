import { useEffect, useState } from "react";

import { UserCard } from "../../components/UserCard/UserCard";

// TODO importer les utilisateurs du fichier "/assets/data/users.js"

// TODO ajouter le css modulaire pour cette page
import styles from './UsersPage.module.css';

const UsersPage = () => {
    // Déclaration d'un state permettant de stocker les utilisateur
    const [users, setUsers] = useState([]);

    // TODO compléter ce useEffect qui se déclenche à la création du composant
    // Dans un premier temps : complétez le avec la tableau d'utilisateurs provenant du fichier "assets/data/users.jsx"
    //
    // Dans un deuxième temps, ajoutez une requête HTTP pour l'obtention des données 
    // Url à utiliser : https://jsonplaceholder.typicode.com/users
    // Tutoriel pouvant vous aider : https://dev.to/antdp425/react-fetch-data-from-api-with-useeffect-27le
    useEffect(() => {
        fetch("https://jsonplaceholder.typicode.com/users")
            .then((response) => (
                response.json()

            ))
            .then((data) => (
                setUsers(data)
            ))
            .catch((e) => {
                console.log("Erreur :", e)
            })

        // TODO mise à jour du state
    }, []);

    return (
        <>
            <div className={styles.usersContainer}>
                {
                    users.map((ceUser) => (
                        <UserCard key={ceUser.id} user={ceUser} />
                    ))
                }
            </div>
        </>

        // {
        // // TODO faire interface graphique pour la liste des utilisateurs
        // // Pour générer les "cards" utilisateur veillez à vous servir du composant "UserCard
        // }
    );

}

export default UsersPage;