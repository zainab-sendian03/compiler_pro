import { bootstrapApplication } from "@angular/platform-browser";
import { Component, Injectable } from "@angular/core";
import { RouterModule, Router, ActivatedRoute, provideRouter } from "@angular/router";
import { FormsModule } from "@angular/forms";
import { BehaviorSubject } from "rxjs";
import { CommonModule } from "@angular/common";


class Product {
  name;
  image;
  details;
}

class ProductService {
  productsSubject;
  products = this.productsSubject.asObservable();
  addProduct(product) {
    let products = this.productsSubject.value;
  }
  updateProduct(index, product) {
    let products = this.productsSubject.value;
  }
  deleteProduct(index) {
    let products = this.productsSubject.value;
  }
  getProduct(index) {
  }
}

class ProductListComponent {
  items = [];
  selectedItem = null;
  selectItem(index) {
  }
  deleteItem() {
    if (this.selectedItem, null) {
}
  }
  editItem() {
    if (this.selectedItem, null) {
}
  }
  addItem() {
  }
}

class AddProductComponent {
  product = {
  'name': '''',
  'image': ''https://i.pinimg.com/736x/b0/33/4d/b0334d3c2d1ed6f5d8006f250c35b135.jpg'',
  'details': ''''
};
  save() {
    if (this.product.name, this.product.image, this.product.details) {
}
  }
  cancel() {
  }
}

class EditProductComponent {
  product = {
  'name': '''',
  'image': ''https://i.pinimg.com/1200x/b0/33/4d/b0334d3c2d1ed6f5d8006f250c35b135.jpg'',
  'details': ''''
};
  index = 0;
  save() {
  }
  cancel() {
  }
}

class AppComponent {
}

