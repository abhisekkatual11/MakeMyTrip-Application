package com.mytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mytrip.entities.Trip;
import com.mytrip.services.TripService;
import com.mytrip.util.EmailService;

@Controller
public class TripController {
	//http://localhost:8080/tripPage
	@RequestMapping("/tripPage")
	public String tripPage() {
		return "trip_page";
	}
	
	@Autowired
	private TripService tripSer;
	
	@Autowired
	private EmailService emailSer;
	
	//http://localhost:8080/save
	@RequestMapping("/save")
	public String save(Trip trip,Model model) {
		tripSer.save(trip);
		emailSer.sendEmail(trip.getEmail(),"Email Send","testing successfully send or not");
		model.addAttribute("msgg","successfully send email");
		model.addAttribute("msg","successfully insert Record");
		List<Trip> list = tripSer.showAll();
		model.addAttribute("all", list);
		return "list_trip";
	}
	
	//http://localhost:8080/back
	@RequestMapping("/back")
	public String back() {
		return "trip_page";
	}
	
	//http://localhost:8080/All_Details
	@RequestMapping("/All_Details")
	public String show(ModelMap model) {
		List<Trip> list = tripSer.showAll();
		model.addAttribute("all", list);
		return "list_trip";
	}
	
	//http://localhost:8080/update
	@RequestMapping("/update")
	public String update(@RequestParam("aadharId") long aadharId,Model model) {
		Trip id = tripSer.updateRecord(aadharId);
		model.addAttribute("id", id);
		return "update_trip";
	}
	//http://localhost:8080/updateTrip
	@RequestMapping("/updateTrip")
	public String updateTrip(Trip trip,Model model) {
		tripSer.save(trip);
		List<Trip> list = tripSer.showAll();
		model.addAttribute("all", list);
		return "list_trip";
	}
	//http://localhost:8080/delete
	@RequestMapping("/delete")
	public String delete(@RequestParam("aadharId") long aadharId,Model model) {
		tripSer.deleteRecord(aadharId);
		List<Trip> list = tripSer.showAll();
		model.addAttribute("all", list);
		return "list_trip";
	}
}
