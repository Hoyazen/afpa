class BaseController {
    constructor(service) {
        this.service = service;
    }


    list(req, res) {
        const results = this.service.findAll();
        res.status(200).json(results);
    }

    read(req, res) {
        const resultId = req.params.id;
        const result = this.service.find(resultId);
        if (result)
            res.status(200).json(result);
        else
            res.status(404).json({ message: "Produit non trouvé" });
    }


    create(req, res) {
        const datas = req.body;
        const createdResult = this.service.create(datas);
        if (createdResult)
            res.status(201).json({ message: "Produit créé" });
        else
            res.status(400).json({ message: "Erreur lors de l'insertion" });
    }


    update(req, res) {
        const resultId = req.params.id;
        const datas = req.body;
        const updatedResult = this.service.update(resultId, datas);
        if (updatedResult) {
            res.status(200).json({ message: "Produit édité" });
        } else {
            res.status(400).json({ message: "Erreur lors de l'édition" });
        }
    }


    remove(req, res) {
        const resultId = req.params.id;
        const removedResult = this.service.remove(resultId);
        if (removedResult) {
            res.status(200).json({ message: "Produit supprimé" });
        } else {
            res.status(400).json({ message: "Erreur lors de la suppression" });
        }
    }

}

module.exports = BaseController; 
