const express = require("express");
const app = express();

const authRoutes = require("./auth");
const firstnameRoutes = require("./firstname");

const auth = require("../middlewares/auth");

const authRoutes = require("./auth");
const firstnameRoutes = require("./firstname");

router.use("/", authRoutes);
router.use("/firstnames", firstnameRoutes);

router.use("/", authRoutes);
router.use("/firstnames", firstnameRoutes);
router.use("/firstnames", auth, firstnameRoutes);
