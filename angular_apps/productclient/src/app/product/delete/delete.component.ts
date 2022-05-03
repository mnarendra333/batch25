import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

    id! : number;

  constructor(private productService : ProductService, private route : ActivatedRoute, private router : Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['productId'];
    console.log(this.id);
    this.productService.delete(this.id).subscribe((data: any)=>{
      console.log("product deleted successfully");
      this.router.navigateByUrl('product/list');
    }); 
  }

}
