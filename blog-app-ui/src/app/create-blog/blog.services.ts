import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class BlogService {
  constructor(private httpClient: HttpClient) { }

  createBlog(blogTitle: string, blogBody: string): Observable<any> {
    return this.httpClient.post('/saveBlog', { 'blogTitle': blogTitle, 'blogBody': blogBody });
  }
}
