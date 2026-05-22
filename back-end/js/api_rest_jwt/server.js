require("dotenv").config();
const express = require("express");
const app = express();
const cookieParser = require("cookie-parser");
const routes = require("./routes");
app.use(express.json());
app.use("/api", routes);
app.use(cookieParser());
app.use(express.json());

app.get("/", (req, res) => {
  res.send({ message: "Hello" });
});

const hostname = "127.0.0.1";
const port = process.env.PORT || 3000;

app.listen(port, hostname, () => {
  console.log(`Serveur démarré sur http://${hostname}:${port}`);
});
