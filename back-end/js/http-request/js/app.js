const URL_API = "https://jsonplaceholder.typicode.com/users";

async function getUsers(url) {
  try {
    let response = await fetch(url);
    let data = await response.json();

    console.log(data);

    return data;
  } catch (e) {
    console.log(e);
  }
  return null;
}

let usersPromise = getUsers(URL_API);

usersPromise.then((usersData) => {
  // Traitement des données -> on modifie le DOM

  // 1 on cible la grosse div qui contiendra les "cards" des utilisateurs
  let divGridUsers = document.getElementById("users-cards");

  // 2 on fait un boucle sur le tableau des utilisateurs (usersdata)
  for (let i = 0; i < usersData.length; i++) {
    let user = usersData[i];
    let divContentUser = document.createElement("div");
    divContentUser.innerHTML = `<div class="user-directory" id="user-directory">
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

    divGridUsers.appendChild(divContentUser);
  }
  // Pour chaque élément du tableau on crée une div qui convient et on l'ajoute à la grosse div

  // Créer une div pour utilisatuer
  // let userDiv = document.createElement("div");
  // userDiv.innerHTML = `<h2>Nom : {??????} </h2>`;

  // ajouter la nouvelle div à la grosse div de tous les utilisateurs

  console.log(usersData);
});
