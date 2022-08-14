package com.ram.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Robi Goh
 */
@Entity
@Table(name = "peserta")
public class Peserta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "tanggal_lahir")
    private LocalDateTime tanggalLahir;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDateTime getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDateTime tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    @Override
    public String toString() {
            return "Peserta [id=" + id + ", nama=" + nama + ", tanggalLahir=" + tanggalLahir + "]";
    }
}
