package com.portal.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.portal.entity.Pannel;
import com.portal.repository.PannelRepository;


@Controller
public class PannelController {
      
	@Autowired
	PannelRepository pannelRepository;
	@GetMapping("pages/pannel/pannel")
	public String pannel() {
			
			return "admin/pages/pannel/pannel";
		}
	@GetMapping("pannellist")
    public String showPannelList(Model model) {
    	model.addAttribute("pannels", pannelRepository.findAll());
    	System.out.println(pannelRepository.findAll());
    	return "pannel";
    }
	
	@GetMapping("/panneladd")
	public String showPannelReg(Pannel pannel) {
		return "pannelreg";
	}
	@PostMapping("/pannelregistration")
	public String addPannel(@Valid Pannel pannel, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "pannelreg";
		}
		System.out.println("This is testing") ;
		pannelRepository.save(pannel);
		return "adminhome";
	}
	@GetMapping("panneledit/{id}")
	public String showPanelEditForm(@PathVariable("id") long id, Model model) {
		Optional<Pannel> pannel = pannelRepository.findById(id);
		model.addAttribute("pannel", pannel);
		return "update-pannel";
	}
	// Saving Edited pannel by Admin
			@PostMapping("updatedpannel/{id}")
			public String updatePannel(@PathVariable("id") long id, @Valid Pannel pannel, BindingResult result,
					Model model) {

				pannelRepository.save(pannel);
				model.addAttribute("pannels", pannelRepository.findAll());
				return "pannel";
			}
			 @DeleteMapping("/remove/{id}")
			    public boolean deleteRow(@PathVariable("id") Long id){
			        if(!pannelRepository.findById(id).equals(Optional.empty())){
			            pannelRepository.deleteById(id);
			            return true;
			        }
			        return false;
			    }
	   
}
