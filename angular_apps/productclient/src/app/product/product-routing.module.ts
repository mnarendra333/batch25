import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { DeleteComponent } from './delete/delete.component';
import { ListComponent } from './list/list.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [

  {
    path: 'product',
    redirectTo: 'product/list',
    pathMatch: 'full'
  },
  {
    path: 'product/list',
    component: ListComponent
  },
  {
    path: 'product/:productId/delete',
    component: DeleteComponent
  },
  {
    path: 'product/add',
    component: AddComponent
  },
  {
    path: 'product/:productId/update',
    component: UpdateComponent
  }



];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductRoutingModule { }
