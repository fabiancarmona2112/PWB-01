class Prodcut {
  constructor(_name, _price, _year) {
    this.name = _name;
    this.price = _price;
    this.year = _year;
  }
}

class UI {
  constructor() {}

  oaddProduct() {}

  deleteProduct() {}

  showMessage() {}
}


document.getElementById('Product-form').addEventListener('submit', function () {
    
    const name = document.getElementById('Name').value;
    const price = document.getElementById('price').value;
    const year = document.getElementById('year').value;

    console.log(name, price, year);
});
