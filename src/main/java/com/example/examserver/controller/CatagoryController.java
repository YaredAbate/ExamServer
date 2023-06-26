package com.example.examserver.controller;

import com.example.examserver.model.exam.Catagory;
import com.example.examserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catagory")
@CrossOrigin("*")
public class CatagoryController {
    @Autowired
    private CategoryService catagoryService;
    @PostMapping("/")
    public ResponseEntity<Catagory> addCatagory(@RequestBody Catagory catagory){
        Catagory catagory1=this.catagoryService.addCatagory(catagory);
        return ResponseEntity.ok(catagory1);
    }
    @GetMapping("/{catagoryId}")
    public Catagory getCatagory(@PathVariable("catagoryId") Long catagoryId){
        return this.catagoryService.getCatagory(catagoryId);
    }
    @GetMapping("/")
    public ResponseEntity<?> getCatagories(){
        return ResponseEntity.ok(this.catagoryService.getCatagories());
    }
    @PutMapping("/")
    public Catagory updateCatagory(@RequestBody Catagory catagory){
        return this.catagoryService.updateCatagory(catagory);
    }
    @DeleteMapping("/{catagoryId}")
    public void deleteCatagory(@PathVariable("catagoryId") Long catagoryId){
        this.catagoryService.deleteCatagory(catagoryId);
    }
}
