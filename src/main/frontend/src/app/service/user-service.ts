import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../model/user";
/*
@Injectable({
  providedIn: 'root'
})
*/

//ng generate service user-service
@Injectable()
export class UserService {
  readonly usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8089/user/users';
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl);
  }

  public findById(id: string): Observable<User> {
    return this.http.get<User>(this.usersUrl + '/' + id);
  }

  public findById1(id: string): Observable<Object> {
    return this.http.get(`${this.usersUrl}/${id}`);
  }

  public updateUser(value: any): Observable<Object> {
    return this.http.put(this.usersUrl, value);
  }

  public deleteUser(id: number): Observable<any> {
    return this.http.delete(`${this.usersUrl}/${id}`, {responseType: 'text'});
  }

  public save(user: User) {
    return this.http.post<User>(this.usersUrl, user);
  }

  /*  private handleError(error: HttpErrorResponse) {
      console.log(error)
      return Observable.throw(error || {});
    }*/

}
