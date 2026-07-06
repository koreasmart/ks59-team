package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Controller HTTP 요청과 응답을 수행하는 계층
 */
@Controller
public class HomeController {

	/**
	 * @GetMapping : GET 방식 주소 요청시 핸들러메소드와 매핑해주는 어노테이션
	 * @param Model model (org.springframework.ui.Model) : 화면에 데이터를 전달해주는 객체
	 * 
	 * @return String ( 화면 경로 ) prefix : "src/main/resources/templates/"
	 * 							  suffix : ".html"
	 *         ex:) /templates/member/addMember.html => member/addMember
	 */
	@GetMapping({"", "/"})
	public String index(Model model) {
		
		model.addAttribute("title", "Hello! Spring Boot!");
		
		return "index";
	}
}
















