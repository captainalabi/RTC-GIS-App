package com.alabi.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;
import com.alabi.app.entity.Rtc;
import com.alabi.app.service.RtcService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RtcController {

	private RtcService rtcService;
	
	@Autowired
	public RtcController(RtcService rtcService) {
		super();
		this.rtcService = rtcService;
	}

	/*
	 * directs to admin page
	 */
	@GetMapping("/admin")
	public ModelAndView admin() {

List<Rtc> allRtc = rtcService.read();
ModelAndView mav = new ModelAndView("admin");
mav.addObject("allRtc", allRtc);

return mav;
}
	
	/*
	 * directs to home page
	 */
	@GetMapping("/home")
	public String homepage() {
		return "/home";
	}
	
	/*
	 * directs to home page
	 */
	@GetMapping("/message")
	public String messagePage() {
		return "/message";
	}
	
	/*
	 * directs to newRtc page with a binding object
	 */
	@GetMapping("/rtc/newRtc")
	public String newRtc(Model model) {
		
		model.addAttribute("rtc", new Rtc());
		
		return "newRtc";
	}
	
	/*
	 * creates new RTC record
	 */
	@PostMapping("/rtc/newRtc")
	public RedirectView newRtc(HttpServletRequest request, 
		    @ModelAttribute Rtc rtc, 
		    RedirectAttributes redirectAttributes) {
		
		 if (!Rtc.isValidRtc(rtc)) {//check validity before creating rtc record
			 rtcService.create(rtc);
		        redirectAttributes.addFlashAttribute("rtc", "Record created successfully!");
		        return new RedirectView("/rtc/success", true);
		    } else {
		        return new RedirectView("/rtc/newRtc", true);
		    }
	}
	
	@GetMapping("/rtc/success")
	public String getSuccess(HttpServletRequest request) {
	    Map<String, ?> inputFlashMap = RequestContextUtils.getInputFlashMap(request);
	    if (inputFlashMap != null) {
	         inputFlashMap.get("rtc");
	        return "success";
	    } else {
	        return "redirect:/rtc/newRtc";
	    }
	}
	
	/*
	 * reads all RTC records from db
	 */
	@GetMapping("/allRtc")
			public ModelAndView allRtc() {
		
		List<Rtc> allRtc = rtcService.read();
		ModelAndView mav = new ModelAndView("allRtc");
		mav.addObject("allRtc", allRtc);
		
		return mav;
	}
	
	/*
	 * updates an RTC record
	 */
	@RequestMapping(value = "/adminUpdate", method = RequestMethod.GET)
	public ModelAndView UpdateById(@RequestParam Integer id) {
		
		ModelAndView mav = new ModelAndView("newRtc");
//		mav.setViewName("admin");
		
		Rtc rtc = rtcService.searchById(id);
		mav.addObject("rtc", rtc);
		
		return mav;
	}
	
	/*
	 * deletes an RTC record
	 */
	@GetMapping("/deleteUser")
	public String deleteUserById(@RequestParam Integer id) {
		rtcService.deleteById(id);
		
		return "redirect:admin";
	}
}
