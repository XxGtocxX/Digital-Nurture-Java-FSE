import { CommonModule } from '@angular/common';
import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { CourseCard } from '../../components/course-card/course-card';
import { CourseService } from '../../services/course.service';
import { Course } from '../../models/course.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  constructor(
  private courseService: CourseService,
  private router: Router
) {}
  viewCourse(course: Course) {

    this.router.navigate(
      ['/courses', course.id]
    );

  }
    
  isLoading = true;

courses: Course[] = [];
  selectedCourseId?: number;

ngOnInit(): void {
  this.courses=this.courseService.getCourses();
}

  onEnroll(courseId: number) {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;
  }
  // trackBy prevents Angular from recreating every item
  // when the array changes. Only modified items are updated.
  trackByCourseId(index: number, course: Course): number {
    return course.id;
  }

}