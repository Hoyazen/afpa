const express = require("express");

const app = express();

app.use(express.json());
const routes = require("./routes");
app.use(routes);

app.get("/", (req, res) => {
  res.json({
    name: "API REST Users",

    version: "1.0.0",

    status: "running",

    endpoints: {
      users: "/users",
      products: "/products",
    },
  });
});

module.exports = app;
