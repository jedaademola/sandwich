import {Component, OnInit} from '@angular/core';
import {User} from '../model/user';
import {UserService} from '../service/user-service';


//ng generate component user-list
@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  users: User[];
  currentUser: User;
  isupdated = false;
  errorMessage: string;
  successMessage: string;

  user: User = new User();
  /*dtOptions: {
    pagingType: string; pageLength: number; buttons: string[];
  };*/

  dtOptions: any = {};
  constructor(private userService: UserService) {
    //  dtOptions: {};
  }


  ngOnInit() {
    this.userService.findAll().subscribe(data => {
      this.users = data;
    });

    this.dtOptions = {
      pageLength: 2,
      pagingType: 'full_numbers',
      lengthMenu: [[6, 16, 20, -1], [6, 16, 20, "All"]],
      buttons: [
        'columnsToggle',
        'colvis',
        'copy',
        'print',
        'excel'
      ],
    };
  }

  /* userUpdateForm=new FormGroup({
      id:new FormControl(),
      name:new FormControl(),
      email:new FormControl()
    });*/
  onUpdateUser(userUpdateForm) {
    this.user = new User();
    this.user.id = this.currentUser.id;
    this.user.name = this.currentUser.name;
    this.user.email = this.currentUser.email;

    this.userService.updateUser(this.user).subscribe(
      data => {
        this.isupdated = true;
      }, error => {

        this.handleErrors(error.error)
        //console.log(error)
      });

  }

  displayUserInfo(id: string) {
    this.userService.findById(id)
      .subscribe(
        data => {
          if (data.status == 200) {

            this.successMessage = "updated created successfully"
            setTimeout(() => {
              this.successMessage = "";
            }, 3000);

          }
          this.currentUser = data
        },
        error => console.log(error));
  }

  changeisUpdate() {
    this.isupdated = false;
  }

  deleteUser(id: string) {
    this.userService.findById(id)
      .subscribe(
        data => {
          this.currentUser = data
        },
        error => console.log(error));
  }

  handleErrors(error) {

    if (error.code == '01') {
      this.errorMessage = error.description
    } else {
      this.errorMessage = "Please try again later"
    }

    setTimeout(() => {
      this.errorMessage = ""
    }, 3000);
  }

}
