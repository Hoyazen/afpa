const express = require("express");
const router = express.Router();

const firstnames = require("../db/firstnames");

router.get("/", (req, res) => {
  // Extraction des paramètres d'URL country et gender
  const { country, gender } = req.query;
  if (!country || !gender) res.status(400).json({ message: "Erreur dans la requête." });
  // Récupération de l'ensemble des prénoms pour les paramètres spécifiés
  const candidateFirstnames = firstnames[country][gender];
  // Extraction d'un prénom aléatoire depuis la liste récupérée
  const firstname = candidateFirstnames[Math.floor(Math.random() * candidateFirstnames.length)];
  res.json({ firstname });
});

module.exports = router;
