import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  products: Product[] = [];

  constructor(public productService: ProductService) { }

  ngOnInit(): void {
      this.productService.getAllProducts().subscribe((data:Product[])=>{
            this.products = data;
            console.log(this.products);
      })

  }

}
