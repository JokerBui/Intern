package com.example.demo.Service;

import com.example.demo.Sach.Sach;
import com.example.demo.Repository.SachRepository;
import org.aspectj.bridge.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
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
    public Sach update(Integer id, Sach sach) throws Exception {
        Sach sach1 = repo.findById(id).orElseThrow(() -> new Exception("id khong ton tai"));
        sach1.setTacgia(sach.getTacgia());
        sach1.setChuyenmuc(sach.getChuyenmuc());
        sach1.setTen(sach.getTen());
        sach1 = repo.save(sach1);
        return sach1;
    }
    public Sach delete(Integer id ) throws Exception {
       repo.findById(id).orElseThrow(() -> new Exception("id khong ton tai"));
       repo.deleteById(id);
        return null;

    }
    public Optional<Sach> listAllById(Integer id) throws Exception {

        repo.findById(id).orElseThrow(() -> new Exception("id khong ton tai"));
        return repo.findById(id);


    }
}
