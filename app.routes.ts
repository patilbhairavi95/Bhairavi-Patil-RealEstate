import { Routes } from '@angular/router';
import { LoginComponent } from './LoginRegister/login/login.component';
import { SignupComponent } from './LoginRegister/signup/signup.component';
import { HomeComponent } from './home/home.component';
import { ServiceComponent } from './service/service.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { RoomsComponent } from './rooms/rooms.component';

import { ContactComponent } from './contact/contact.component';
import { FeedbackComponent } from './feedback/feedback.component';

import { SidebarComponent } from './sidebar/sidebar/sidebar.component';
import { ShowserviceComponent } from './showServices/showservice/showservice.component';
import { AddComponent } from './addService/add/add.component';
import { UpdateComponent } from './updateservice/update/update.component';
import { flatsComponent } from './flats/flats.component';

import { CustBookingComponent } from './cust-booking/cust-booking.component';
import { CartComponent } from './cartcomponent/cart/cart.component';

export const routes: Routes = [
    {path:"login",component:LoginComponent},
    {path:"signup",component:SignupComponent},
    { path: "", component: HomeComponent },  // Default route, Home page
    {path:"service",component:ServiceComponent},
    { path: "about-us", component: AboutUsComponent}, 
    
        {path:"rooms",component:RoomsComponent},
        {path:"flats",component:flatsComponent},
    
    { path: "contact", component: ContactComponent },
    { path: "feedback", component: FeedbackComponent },
    {path:"sidebar",component:SidebarComponent},
    {path:"showservice",component:ShowserviceComponent},
    {path:"add",component:AddComponent},
    {path:"update",component:UpdateComponent},
   {path:"cust-booking/:serviceId",component:CustBookingComponent},
   {path:"cart",component:CartComponent}
   
    

];

