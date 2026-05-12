const users = require("../../data/users.json");
const BaseService = require("../services/base.service");

module.exports = new BaseService(users);

// exports.findAll = () => {
//   return users;
// };

// exports.find = (id) => {
//   return users.find((user) => user.id == id);
// };

// exports.create = (data) => {
//   const newUser = {
//     id: users.length + 1,

//     ...data,
//   };

//   users.push(newUser);

//   return newUser;
// };

// exports.update = (id, data) => {
//   const user = users.find((user) => user.id == id);

//   if (!user) {
//     return null;
//   }

//   Object.assign(user, data);

//   return user;
// };

// exports.remove = (id) => {
//   const index = users.findIndex((user) => user.id == id);

//   if (index === -1) {
//     return false;
//   }

//   users.splice(index, 1);

//   return true;
// };
