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
  card.innerHTML = `<div class="user-directory" id="user-directory">
       <div class="user-directory-title" id="user-directory-title">
          <h2>${user.name}</h2>
          <p>@${user.username}</p>
        </div>
       <div class="user-directory-info" id="user-directory-info">
        <div class="user-directory-info-title" id="user-directory-info-title">
             <h3>Contact</h3>
           </div>
           <div class="user-directory-info-content" id="user-directory-info-content">
             <p>Email: ${user.email}</p>
             <p>Phone: ${user.phone}</p>
             <p>Website: ${user.website}</p>
           </div>
         </div>
         <div class="user-directory-info" id="user-directory-info">
           <div class="user-directory-info-title" id="user-directory-info-title">
            <h3>Adress</h3>
           </div>
           <div class="user-directory-info-content" id="user-directory-info-content">
             <p>${user.address.street}</p>
           <p>${user.address.geo.lat} ${user.address.geo.lng}</p>
          </div>
         </div>
      </div>`;
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
  let userCard = document.getElementById("users-cards");

  users.forEach((element) => {
    const user = createUserCard(element);
    userCard.appendChild(user);
  });
}

/**
 * Point d'entrée de l'application
 */
function init() {
  // TODO initialisation de l'interface
  displayUsers();
}

// Lancement de l'application
init();
