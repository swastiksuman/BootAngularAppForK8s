import { Component, OnInit } from '@angular/core';
import { BlogService } from './blog.services';

@Component({
  selector: 'app-create-blog',
  templateUrl: './create-blog.component.html',
  styleUrls: ['./create-blog.component.css']
})
export class CreateBlogComponent implements OnInit {
  blogTitle: string;
  blogBody: string;

  constructor(private blogServices: BlogService) { }

  ngOnInit() {
  }

  create() {
    this.blogServices.createBlog(this.blogTitle, this.blogBody).subscribe((data) => console.log(data));
  }
}
