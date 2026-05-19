// URL de l'API : à décommenter lors de la mise en place du requêtage
// const API_URL = "https://jsonplaceholder.typicode.com/users";

// TODO : Variable pour stocker les utilisateurs
// let users = [];

/**
 * Récupère les utilisateurs depuis l'API
 *
 * A décommenter lors de la mise en placec du requêtage
 */
// async function fetchUsers() {
//   // TODO
//   // 1. faire une requête fetch vers l'API
//   // 2. convertir la réponse en JSON
//   // 3. stocker les utilisateurs dans la variable "users"
//   // 4. appeler la fonction displayUsers()
// }

/**
 * Crée une carte HTML pour un utilisateur
 * @param {Object} user Un json qui contient les informations utilisateur
 * @returns {HTMLElement}
 */
function createUserCard(user) {
  const card = document.createElement("div");

  // TODO : compléter le contenu de la carte
  card.innerHTML = `
    <h2>TODO: name</h2>
  `;

  return card;
}

/**
 * Affiche tous les utilisateurs dans la page
 */
function displayUsers() {
  // TODO
  // 1. Récupérer l'élément #user-directory
  // 2. Parcourir la liste "users"
  // 3. Créer une carte pour chaque utilisateur
  // 4. Ajouter la carte dans le DOM
}

/**
 * Point d'entrée de l'application
 */
function init() {
  // TODO initialisation de l'interface
}

// Lancement de l'application
init();
