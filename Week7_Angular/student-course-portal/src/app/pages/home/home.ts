import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CourseService } from '../../services/course.service';
import { CourseSummaryWidget } from '../../components/course-summary-widget/course-summary-widget';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule, CourseSummaryWidget],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home implements OnInit, OnDestroy {

constructor(
  private courseService: CourseService,
  private router: Router
){}
  courseCount=0;
  portalName = 'Student Course Portal';
  isPortalActive = true;
  message = '';
  searchTerm = '';

  ngOnInit(): void {
    console.log('HomeComponent initialized');
    this.courseCount=this.courseService.getCourses().length;
  }

  ngOnDestroy(): void {
    console.log('HomeComponent destroyed');
  }

  onEnrollClick() {

  this.message = 'Enrollment opened!';

  this.router.navigate(
    [],
    {
      queryParams: {
        search: this.searchTerm
      }
    }
  );

}
}