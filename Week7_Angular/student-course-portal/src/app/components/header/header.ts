import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [],
  templateUrl: './header.html',
  styleUrl: './header.css'
})
export class Header {

  @Input()
  portalTitle = '';

  @Output()
  homeClicked = new EventEmitter<void>();

  onHomeClick() {
    this.homeClicked.emit();
  }

}