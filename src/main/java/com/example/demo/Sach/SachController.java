package com.example.demo.Sach;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sach")
public class SachController {
    @Autowired
    private SachService service;

    @GetMapping("/")
    public ResponseEntity<List<Sach>> showSachList(Model model) {
        return ResponseEntity.ok(service.listAll());
    }

    @PostMapping("/new")
    public ResponseEntity<Sach> SachNewForm(@RequestBody Sach sach) {

        return ResponseEntity.ok(service.save(sach));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Sach> SachUpdate(@PathVariable Integer id,@RequestBody Sach sach){
        return ResponseEntity.ok(service.update(id, sach));
    }

}
