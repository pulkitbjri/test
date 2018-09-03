package com.example.demo.Controllers;

import com.example.demo.JPA.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Controller
public class MainController {
    Repo repo1;

    @Autowired
    public MainController(Repo repo){
        this.repo1=repo;
    }

    @RequestMapping(value = "/getBranchDetails/{ifsc}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity getBranchDetails(@PathVariable String ifsc) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Status", "found");

        map.put("data", repo1.findByIfsc(ifsc));
        return ResponseEntity.ok(map);
    }

    @RequestMapping(value = "/findbyBankNameandCity/", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity findbyBankNameandCity(@RequestParam String bank_name, @RequestParam String city) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Status", "found");

        map.put("data", repo1.findByCityAndBankName(city,bank_name));
        return ResponseEntity.ok(map);
    }
}
