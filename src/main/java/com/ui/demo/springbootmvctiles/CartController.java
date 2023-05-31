package com.ui.demo.springbootmvctiles;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class CartController {

	@GetMapping("/cart")
	public String firstView(HttpServletRequest request, Model model)
	{
		// must match the jsp page name which is being requested.
		String menuName = request.getParameter("loadmenu");
		model.addAttribute("selectedmenu", menuName);
		return "cart";
	}

}
