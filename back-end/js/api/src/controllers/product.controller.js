const BaseController = require("./base.controller");
const productService = require("../services/product.service");

class ProductController extends BaseController {
  constructor() {
    super(productService);
  }
}

module.exports = new ProductController();
