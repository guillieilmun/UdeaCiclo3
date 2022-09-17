package com.adasprint3.AdaEmpresaSprint3.controller;

import com.adasprint3.AdaEmpresaSprint3.model.Movimiento;
import com.adasprint3.AdaEmpresaSprint3.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoControler {

        @Autowired
        MovimientoService movimientoService;

        @GetMapping("/movimiento")
        private List<Movimiento> verMovimiento(){
            return movimientoService.verMovimiento();
        }

        @PostMapping("/movimiento")
        private void crearYActualizarMovimiento(@RequestBody Movimiento movimiento){
            movimientoService.crearYActualizarMovimiento(movimiento);
        }

        @DeleteMapping("/movimiento/{id}")
        private void eliminarMovimiento(@PathVariable("id") Long id){movimientoService.eliminarMovimiento(id);
        }

        @PutMapping("/movimiento")
        private void editarMovimiento(@RequestBody Movimiento movimiento){
            movimientoService.crearYActualizarMovimiento(movimiento);
        }
}
