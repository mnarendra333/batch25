import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders } from '@angular/common/http';
import {  Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private apiURL = "http://localhost:7777/SpringBootWithRestAPIS/product";

  httpOptions = {
      headers: new HttpHeaders({
        'ContentType' : 'application/json'
      })
  }

  constructor(private httpClient: HttpClient) { 

  }

  getAllProducts(): Observable<any> {
  
    return this.httpClient.get(this.apiURL + '/list/')
  
    .pipe(
      catchError(this.errorHandler)
    )
  }

  create(product:Product): Observable<any> {
  
    return this.httpClient.post(this.apiURL + '/addproduct/', product, this.httpOptions)
  
    .pipe(
      catchError(this.errorHandler)
    )
  }  
    
  /**
   * Write code on Method
   *
   * @return response()
   */
  find(id:number): Observable<any> {
  
    return this.httpClient.get(this.apiURL + '/getproduct/' + id)
  
    .pipe(
      catchError(this.errorHandler)
    )
  }
    
  /**
   * Write code on Method
   *
   * @return response()
   */
  update(id:number, product:Product): Observable<any> {
  
    return this.httpClient.put(this.apiURL + '/updateproduct/', product, this.httpOptions)
 
    .pipe( 
      catchError(this.errorHandler)
    )
  }
       
  /**
   * Write code on Method
   *
   * @return response()
   */
  delete(id:number){
    return this.httpClient.delete(this.apiURL + '/delete/' + id, this.httpOptions)
  
    .pipe(
      catchError(this.errorHandler)
    )
  }
      
  /** 
   * Write code on Method
   *
   * @return response()
   */
  errorHandler(error:any) {
    let errorMessage = '';
    if(error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    return throwError(errorMessage);
 }
}
