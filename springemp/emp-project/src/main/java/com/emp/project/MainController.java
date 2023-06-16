package com.emp.project;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.emp.project.entity.EmpDao;
import com.emp.project.model.Employee;


@Controller
public class MainController {
	
	@Autowired
	private EmpDao empDao;
	
	@RequestMapping("/")
	public String home(Model m)
	{
		List<Employee> employee = empDao.getAllEmp();
		m.addAttribute("employee", employee);
		return "index";
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model m)
	{
		m.addAttribute("title", "Add-Employee");
		return "add_employee_form";
	}
	
	@RequestMapping(value="/handle-form", method=RequestMethod.POST)
	public RedirectView handleForm(@ModelAttribute Employee employee, HttpServletRequest request)
	{
		System.out.println("Employee Details" + employee);
		empDao.createDao(employee);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{pid}")
	public RedirectView deleteForm(@PathVariable("pid") int pid, HttpServletRequest request)
	{
		System.out.println("Employee" + pid);
		empDao.deleteDao(pid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping("/update/{pid}")
	public String updateForm(@PathVariable("pid") int pid, Model m)
	{
		Employee empById = empDao.getEmpById(pid);
		m.addAttribute("empById",empById );
		return "update_form";
	}
}
