const form = document.getElementById("form");
const tbody = document.querySelector("#table tbody");

let products = JSON.parse(localStorage.getItem("products")) || [];

displayProducts();

form.addEventListener("submit", function (e) {
  e.preventDefault();

  const product = {
  name: form.elements["name"].value.trim(),
  category: form.elements["category"].value,
  price: form.elements["price"].value,
  quantity: form.elements["quantity"].value,
};

  products.push(product);

  localStorage.setItem("products", JSON.stringify(products));

  displayProducts();

  form.reset();
});

function displayProducts() {
  tbody.innerHTML = "";

  products.forEach((product, index) => {
    let row = document.createElement("tr");

    row.innerHTML = `
     <td>${index + 1}</td>
     <td>${product.name}</td>
     <td>${product.category}</td>
     <td>${product.price}</td>
     <td>${product.quantity}</td>
    `;
    
    tbody.appendChild(row);
  });
}