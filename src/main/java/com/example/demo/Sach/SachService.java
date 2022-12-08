package com.example.demo.Sach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachService {
    @Autowired private SachRepository repo;

    public List<Sach> listAll(){
        return (List<Sach>) repo.findAll();
    }
    public Sach save(Sach sach){

        Sach newBook = repo.save(sach);
        return newBook;
    }
    public Sach update(Integer id, Sach sach){
        Sach sach1 = repo.findById(id).orElseThrow(null);
        sach1.setTacgia(sach.getTacgia());
        sach1.setChuyenmuc(sach.getChuyenmuc());
        sach1.setTen(sach.getTen());
        sach1 = repo.save(sach1);
        return sach1;
    }
}
