import { bootstrapApplication } from "@angular/platform-browser";
import { Component, Injectable } from "@angular/core";
import { RouterModule, Router, ActivatedRoute, provideRouter } from "@angular/router";
import { FormsModule } from "@angular/forms";
import { BehaviorSubject } from "rxjs";
import { CommonModule } from "@angular/common";

@Injectable({ providedIn: 'providedIn:'root'' })
class Product {
  name;
  image;
  details;
}

