/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.ram.services;

import com.ram.model.Peserta;
import com.ram.repository.PesertaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Robi Goh
 */
@Service
public class PesertaService {

    @Autowired
    private PesertaRepository<Peserta> pesertaRepository;

    @Transactional
    public List<Peserta> getAllPeserta() {
        return (List<Peserta>) pesertaRepository.findAll();
    }

    @Transactional
    public List<Peserta> findByName(String name) {
        return pesertaRepository.cariNama(name);
    }

    @Transactional
    public boolean tambahPeserta(Peserta peserta) {
        return pesertaRepository.save(peserta) != null;
    }

    @Transactional
    public void deletePeserta(Long pesertaId) {
        pesertaRepository.deleteById(pesertaId);
    }
}
