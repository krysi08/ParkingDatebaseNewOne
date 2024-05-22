package com.example.parkingdatabase.api;

import com.example.parkingdatabase.dao.entity.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class CarController {

    @GetMapping
    public ModelAndView getCar(@ModelAttribute("car") Car car){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("car");
        modelAndView.getModel().put("car", car);
        return modelAndView;
    }

    @PostMapping
    public ModelAndView addCar(@ModelAttribute("car") Car car){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("car");
        modelAndView.getModel().put("car", car);
        return modelAndView;
    }

   @PutMapping
    public ModelAndView updateCar(@ModelAttribute("car") Car car){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("car");
        modelAndView.getModel().put("car", car);
        return modelAndView;
   }

   @DeleteMapping
    public ModelAndView deleteCar(@ModelAttribute("car") Car car){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("car");
        modelAndView.getModel().remove("car", car);
        return modelAndView;
   }
}
