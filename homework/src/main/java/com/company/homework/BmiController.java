package com.company.homework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class BmiController {
    BmiCounter bm1 = new BmiCounter();
private BmiCounter bmiCounter = new BmiCounter();



    @GetMapping("/param")
        public String getParam(){
        return "param";
    }

    @GetMapping("/result")
    public String getResult(@RequestParam Double height,
                            @RequestParam Double weight,
                            ModelMap map){


        double bmiResult = bm1.getBMI(height, weight);

        String efect="";
        if (bmiResult< 18.5) {
            efect = "Twoje BMI wynosi "+bmiResult+ " i oznacza niedowagę";
        }        else if (bmiResult>=18.6 && bmiResult<=24.9){
            efect = "Twoje BMI wynosi "+bmiResult+" i oznacza wagę prawidłową";
        }
        else if (bmiResult>= 25 && bmiResult<= 29.9){
            efect = "Twoje BMI wynosi "+bmiResult+" i oznacza nadwagę";
        }
        else if (bmiResult>30){
            efect = "Twoje BMI wynosi "+bmiResult+" i oznacza otyłość";
        }
        map.put("yourBMI", efect);
        // do modelMap
    return "result";
    }




}
