const URL_API = "https://endfieldtools.dev/localdb/optimized/characters/characters-list.json";

async function getCharacters(url) {
  try {
    const response = await fetch(url);

    const data = await response.json();

    const keys = Object.keys(data);
    const characters = [];

    for (const key of keys) {
      const character = data[key];

      const customJson = {
        engName: character.engName,
        rarity: character.rarity,
        characterType: character.charTypeId
      };

      characters.push(customJson);
    }

    console.log(characters);
    return characters;
  } catch (e) {
    console.error("Erreur :", e);
    return null;
  }
}

getCharacters(URL_API);
