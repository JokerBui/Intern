package com.example.demo.Service;

import com.example.demo.Sach.Sach;
import com.example.demo.Repository.SachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Sach delete(Integer id){
        repo.deleteById(id);
        return null;
    }
    public Optional<Sach> listAllById(Integer id){
        return repo.findById(id);
    }
}
