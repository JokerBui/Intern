package com.example.demo.Sach;

import jakarta.persistence.*;

@Entity
@Table(name = "sachs")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String ten;
    @Column(nullable = true)
    private String chuyenmuc;
    @Column(nullable = true)
    private String tacgia;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChuyenmuc() {
        return chuyenmuc;
    }

    public void setChuyenmuc(String chuyenmuc) {
        this.chuyenmuc = chuyenmuc;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", chuyenmuc='" + chuyenmuc + '\'' +
                ", tacgia='" + tacgia + '\'' +
                '}';
    }
}
