package com.brain.thymeleaftest.controllers;

import com.brain.thymeleaftest.entities.Client;
import com.brain.thymeleaftest.entities.Employee;
import com.brain.thymeleaftest.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.beans.Transient;

@Controller
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/")
    public String index( Model model) {
        model.addAttribute("employee", employeeRepository.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String showSignUpForm( Model model) {
        model.addAttribute("employeeAdd", new Employee());
        return "add-employee";
    }

    @PostMapping("/add")
    public String addEmployee(@Valid Employee employee,
                            BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-employee";
        }
        employeeRepository.save(employee);
        Iterable<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee Id:" + id));
        model.addAttribute("employee", employee);
        return "update-employee";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") long id,
                               @Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            employee.setId(id);
            return "update-employee";
        }
        employeeRepository.save(employee);
        model.addAttribute("employees", employeeRepository.findAll());
        return "index";
    }

    @Transient
    @GetMapping("/delete/{id}")
    public String deletEmployee(@PathVariable("id") long id, Model model) {
        employeeRepository.deleteById(id);
        model.addAttribute("employees", employeeRepository.findAll());
        return "index";
    }
}
