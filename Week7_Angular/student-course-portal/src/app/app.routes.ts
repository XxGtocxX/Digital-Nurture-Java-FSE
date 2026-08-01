import { Routes } from '@angular/router';
import { Home } from './pages/home/home';
import { CourseList } from './pages/course-list/course-list';
import { StudentProfile } from './pages/student-profile/student-profile';
import { authGuard } from './guards/auth-guard';
import { ReactiveEnrollmentForm } from './pages/reactive-enrollment-form/reactive-enrollment-form';
import { CourseDetail } from './pages/course-detail/course-detail';
import { NotFound } from './pages/not-found/not-found';

export const routes: Routes = [
  { path: '', component: Home },
  { path: 'courses', component: CourseList },
  {
  path: 'profile',
  canActivate: [authGuard],
  component: StudentProfile
},
  { path: 'enroll', loadComponent: () => import('./pages/enrollment-form/enrollment-form').then(m => m.EnrollmentForm)},
  { path: 'enroll-reactive', component: ReactiveEnrollmentForm },
  { path: 'courses/:id', component: CourseDetail},
  { path: '**', component: NotFound}
];