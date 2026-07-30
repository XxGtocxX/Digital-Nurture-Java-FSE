import { Component } from '@angular/core';

@Component({
  selector: 'app-notification',
  standalone: true,
  templateUrl: './notification.html',
  styleUrl: './notification.css',

  providers: []
})
export class Notification {

  /*
    Component-level providers create a NEW instance
    of a service for this component and its children.
    This demonstrates hierarchical dependency injection.
  */

}