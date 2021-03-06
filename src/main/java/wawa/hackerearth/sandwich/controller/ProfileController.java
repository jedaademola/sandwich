package wawa.hackerearth.sandwich.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import wawa.hackerearth.sandwich.model.entity.OrderItems;
import wawa.hackerearth.sandwich.model.entity.Profile;
import wawa.hackerearth.sandwich.model.vo.data.SandWishData;
import wawa.hackerearth.sandwich.service.ProfileService;

@RestController
@RequestMapping(value = "/api/v1/profile")
@Api("Endpoint for ProfileController")
public class ProfileController {
	
	 @Autowired
	 private ProfileService profileService;
	 
	 @GetMapping(path = "/sandwish")
	 @ApiOperation("Display List of SandWish")
	 public SandWishData sandWishData() {
	        return profileService.sandWishData();
	 }

	 @GetMapping(path = "/display/{customerId}")
	 @ApiOperation("Display Customer Profile")
	 public Profile displayProfile (@PathVariable("customerId") String customerId) {
		 return profileService.displayProfile(customerId);
	 }
	 
	 @PostMapping(path ="placeorder")
	 @ApiOperation("Place Order for SandWish")
	 public void placeOrder(@RequestBody  OrderItems orderItems) {
		 profileService.placeOrder(orderItems);
	 }
	 
}
