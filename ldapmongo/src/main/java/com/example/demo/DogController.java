package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@RestController
public class DogController {
    @Autowired
    private DogRepository dogRepository;

    @RequestMapping("/")
    public ModelAndView index() {

        Dog d = new Dog();
        ModelAndView mv =new ModelAndView("Register");
        mv.addObject("dog",d);
        List<String> listCountries = Arrays.asList("India","USA","UK","New-Zealand","Switzerland","Japan","United-Kingdom");
        List<String> listBreeds = Arrays.asList("Siberian-Husky","Samoyed","German-Shepherd","Shiba-Inu","Bulldog","Labrador-Retriever","Golden-Retriever");
        mv.addObject("listCountries",listCountries);
        mv.addObject("listBreeds",listBreeds);
        return mv;
    }

    @PostMapping("register")
    public ModelAndView showDog(@ModelAttribute("dog") Dog d) {
        ModelAndView mv =new ModelAndView("Success");
        mv.addObject("dog",d);
        dogRepository.save(d);
        return mv;
    }
}
