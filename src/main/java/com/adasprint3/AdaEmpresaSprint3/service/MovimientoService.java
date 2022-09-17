package com.adasprint3.AdaEmpresaSprint3.service;
import com.adasprint3.AdaEmpresaSprint3.model.Movimiento;
import com.adasprint3.AdaEmpresaSprint3.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class MovimientoService {
    @Autowired
    MovimientoRepository movimientoRepository;
    public void crearYActualizarMovimiento(Movimiento movimiento){movimientoRepository.save(movimiento);
    }
    public List<Movimiento> verMovimiento(){
        return new ArrayList<>(movimientoRepository.findAll());
    }

    public void eliminarMovimiento(Long id){
        movimientoRepository.deleteById(id);
    }
}
