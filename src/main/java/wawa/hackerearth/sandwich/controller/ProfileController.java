package wawa.hackerearth.sandwich.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import wawa.hackerearth.sandwich.model.vo.data.SandWishData;
import wawa.hackerearth.sandwich.service.ProfileService;

@RestController
@RequestMapping(value = "/api/v1/profile")
@Api("Endpoint for ProfileController")
public class ProfileController {
	
	 @Autowired
	 private ProfileService profileService;
	 @GetMapping(path = "/sandwish")
	    public SandWishData sandWishData() {
	        return profileService.sandWishData();
	    }

}
