/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.ram.repository;

import com.ram.model.Peserta;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Robi Goh
 */
public interface PesertaRepository<P> extends CrudRepository<Peserta, Long> {
    
    @Query("SELECT a FROM Peserta a WHERE a.nama LIKE %:nama%")
    List<Peserta> cariNama(@Param("nama") String nama);
}
