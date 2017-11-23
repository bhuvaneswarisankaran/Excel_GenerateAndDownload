package com.controller;



import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
import com.model.Student;
import com.view.ExcelReportView;
 
@Controller


public class ReportController {
	 @RequestMapping("/welcome")
	    public String hello(Model model) {
	        
	        return "welcome";
	    }
	
       @RequestMapping(value="/report",method=RequestMethod.GET)
       public ModelAndView getExcel(){
              List<Student> studentList = new ArrayList<Student>(); 
              studentList.add(new Student("S01", "Sri", "12344"));
              studentList.add(new Student("S02", "Dharan", "658"));
              return new ModelAndView(new ExcelReportView(), "studentList", studentList);
       }
}