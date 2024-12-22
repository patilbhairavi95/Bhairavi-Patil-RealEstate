import { Component, Inject, PLATFORM_ID } from '@angular/core';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { ContactComponent } from './contact/contact.component';

import { RoomsComponent } from './rooms/rooms.component';
import { ServiceComponent } from './service/service.component';
import { SignupComponent } from './LoginRegister/signup/signup.component';
import { LoginComponent } from './LoginRegister/login/login.component';
import { CommonModule, isPlatformBrowser } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AboutUsComponent } from './about-us/about-us.component';
import { SidebarComponent } from './sidebar/sidebar/sidebar.component';
import { AddComponent } from './addService/add/add.component';
import { ShowserviceComponent } from './showServices/showservice/showservice.component';
import { UpdateComponent } from './updateservice/update/update.component';
import { flatsComponent } from './flats/flats.component';

import { CustBookingComponent } from './cust-booking/cust-booking.component';
import { CartComponent } from './cartcomponent/cart/cart.component';



@Component({
  selector: 'app-root',
  imports: [RouterOutlet,HomeComponent,FeedbackComponent,ContactComponent,RoomsComponent,ServiceComponent,AboutUsComponent,

    LoginComponent,SignupComponent,CommonModule,FormsModule,RouterModule,SidebarComponent,AddComponent,ShowserviceComponent,UpdateComponent,flatsComponent,CustBookingComponent,ContactComponent,CartComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'FlatRent-app';
  user:string | null="";
  
  constructor(@Inject(PLATFORM_ID) private platformId: Object,private route:Router) {
    // Check if the code is running in the browser
    if (isPlatformBrowser(this.platformId)) {
      this.user = localStorage.getItem('currentuser');
      console.log(this.user );
      
    }
    
  }
  logout() {
    // Remove user data from localStorage
    localStorage.removeItem('currentuser');

    // Redirect to login page
    this.route.navigate(['/login']);
  }
}
