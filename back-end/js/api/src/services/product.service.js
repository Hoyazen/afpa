const products = require("../../data/products.json");
const BaseService = require("../services/base.service");

module.exports = new BaseService(products);

// exports.findAll = () => {
//   return products;
// };

// exports.find = (id) => {
//   return products.find((product) => product.id == id);
// };

// exports.create = (data) => {
//   const newProduct = {
//     id: products.length + 1,

//     ...data,
//   };

//   products.push(newProduct);

//   return newProduct;
// };

// exports.update = (id, data) => {
//   const product = products.find((product) => product.id == id);

//   if (!product) {
//     return null;
//   }

//   Object.assign(product, data);

//   return product;
// };

// exports.remove = (id) => {
//   const index = products.findIndex((product) => product.id == id);

//   if (index === -1) {
//     return false;
//   }

//   products.splice(index, 1);

//   return true;
// };
