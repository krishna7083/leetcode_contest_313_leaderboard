package com.hadson.controller;

import com.google.gson.Gson;
import com.hadson.entity.Account;
import com.hadson.model.response.Question;
import com.hadson.model.response.Root;
import com.hadson.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class Controller {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public void addDataIntoJson(){

        List<Root> rootList = new ArrayList<>();
        String path = "C:/Users/shree/Documents/SpringApplications/Spring_handson/handson/src/main/resources/rank.json";
        for(int i=0; i<=1; i++) {
            Map<String, String> params = new HashMap<>();
            params.put("page", Integer.toString(i));
            ResponseEntity<Root> response =  restTemplate.getForEntity("https://leetcode.com/contest/api/ranking/weekly-contest-315/?pagination={page}&region=global", Root.class, params);
            rootList.add(response.getBody());
            log.info("Pagination page: "+i+" response code: "+response.getStatusCode());
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            Gson gson = new Gson();
            String jsonString = gson.toJson(rootList);
            out.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
