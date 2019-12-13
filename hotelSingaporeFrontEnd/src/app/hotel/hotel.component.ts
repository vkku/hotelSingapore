import {Component, OnInit} from '@angular/core';
import {HotelService} from './hotel.service';
import {Hotel} from './hotel.model';
import {FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.css']
})
export class HotelComponent implements OnInit {

  hotelList: Hotel[] = [];
  hotel: Hotel = new Hotel('COZICOMFORT', 'Francesca', 'North Region',
    'Woodlands', '1.44255', '103.7958', 'Private room', 83);
  searchForm;

  constructor(
    private hotelService: HotelService,
    private formBuilder: FormBuilder,
  ) {
    this.searchForm = this.formBuilder.group({
      name: ''
    });
  }

  ngOnInit() {
    this.hotelService.getHotelList().subscribe(hotelList => {
      this.hotelList = hotelList;
    });
  }


  onSubmit(hotel) {

    // this.hotelService.getHotelListByName(hotel.name.toLowerCase()).subscribe(hotelList => {
    //   this.hotelList = hotelList;
    // });
    this.hotelList = [];
  }
  onSortByPrice() {
    this.hotelService.getHotelSortByPrice().subscribe(hotelList => {
      this.hotelList = hotelList;
    });
  }
}
