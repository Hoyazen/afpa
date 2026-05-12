class BaseService {
  constructor(data) {
    this.data = data;
  }

  findAll = () => {
    return this.data;
  };

  find = (id) => {
    return this.data.find((data) => data.id == id);
  };

  create = (data) => {
    const newData = {
      id: this.data.length + 1,
      ...data,
    };

    users.push(newData);

    return newData;
  };

  update = (id, data) => {
    const updatedData = this.data.find((data) => data.id == id);

    if (!updatedData) {
      return null;
    }
    Object.assign(updatedData, data);

    return data;
  };

  remove = (id) => {
    const index = this.data.findIndex((data) => data.id == id);

    if (index === -1) {
      return false;
    }

    users.splice(index, 1);

    return true;
  };
}

module.exports = BaseService;
