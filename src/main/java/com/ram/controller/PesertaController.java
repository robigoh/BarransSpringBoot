package com.ram.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Peserta;
import com.ram.services.PesertaService;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PesertaController {
    
    @Autowired
    PesertaService pesertaService;
    
    @RequestMapping(value = "/cariNama/{nama}", method = RequestMethod.GET)
    public List<Peserta> getPersoneByName(@PathVariable String nama) {
            return pesertaService.findByName(nama);
    }

    @RequestMapping(value = "/peserta", method = RequestMethod.GET)
    public List<Peserta> getAll() {
            return pesertaService.getAllPeserta();
    }
    
    @RequestMapping(value = "/simpanPeserta", method = RequestMethod.POST)
    public HttpStatus simpanDataPeserta(@RequestBody Peserta peserta) {
        Logger logger = Logger.getLogger(PesertaController.class.getName());
        logger.info(peserta.toString());

        return pesertaService.tambahPeserta(peserta) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }

    @RequestMapping(value = "/peserta/{id}", method = RequestMethod.DELETE)
    public HttpStatus deletePeserta(@PathVariable Long id) {
        pesertaService.deletePeserta(id);
        return HttpStatus.OK;
    }
}
