package com.example.geoappp.GUI;

import com.example.geoappp.model.Point;
import com.example.geoappp.services.Covid19Parser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class MapController {

    public Covid19Parser covid19Parser;

    public MapController (Covid19Parser covid19Parser){
        this.covid19Parser=covid19Parser;
    }

    @GetMapping("/map")
    public String getMap(Model model) throws IOException {

        //model.addAttribute("point",new Point(51.15343654531976, 16.931611540720343,"Hello house"));
        model.addAttribute("points",covid19Parser.getCovidData());
    return "map";
    }


}
