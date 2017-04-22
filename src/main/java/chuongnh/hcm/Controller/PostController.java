package chuongnh.hcm.Controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import chuongnh.hcm.Model.Post;
import chuongnh.hcm.Service.PostSerrvice;

@Controller
public class PostController {

	@Autowired
	private PostSerrvice postSerrvice;

	@RequestMapping("/create-post")
	public String create(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);
		return "post-create";
	}

	@PostMapping("/save-post")
	public String saveTask(@ModelAttribute Post post, BindingResult bindingResult, HttpServletRequest request) {
		postSerrvice.save(post);
		request.setAttribute("posts", postSerrvice.findAll());
		return "post-list";
	}

	@GetMapping("/update-post")
	public String updateTask(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("posts", postSerrvice.findAll());
		return "post-list";
	}

	@GetMapping("/delete-post")
	public String deleteTask(@RequestParam int id, HttpServletRequest request) {
		postSerrvice.delete(id);
		request.setAttribute("posts", postSerrvice.findAll());
		return "post-list";
	}

	@RequestMapping("/list-post")
	public String index(HttpServletRequest request) {
		request.setAttribute("posts", postSerrvice.findAll());
		return "post-list";
	}
}
