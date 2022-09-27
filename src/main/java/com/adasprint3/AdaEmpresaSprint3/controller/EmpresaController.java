package com.adasprint3.AdaEmpresaSprint3.controller;
import com.adasprint3.AdaEmpresaSprint3.model.Empresa;
import com.adasprint3.AdaEmpresaSprint3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping("/empresa")
    private String verEmpresa(Model model) {
        model.addAttribute("empresas", empresaService.verEmpresa());
        return "empresa";
    }

    @GetMapping("/agregar-empresa")
    private String verFormularioDeRegistroEmpresa(Empresa empresa) {
        return "agregar-empresa";
    }

    @PostMapping("/empresa")
    private String crearEmpresa(Empresa empresa) {
        empresaService.crearYActualizarEmpresa(empresa);
        return "redirect:/empresa";
    }

    @GetMapping("empresa/borrar/{id}")
    private String eliminarEmpresa(@PathVariable("id") Long id) {
        empresaService.eliminarEmpresa(id);
        return "redirect:/empresa";
    }

    @GetMapping("/empresa/editar/{id}")
    private String verEmpresaPorId(@PathVariable("id") Long id, Model model) {
        Empresa empresa = empresaService.verEmpresaPorId(id);
        model.addAttribute("empresa", empresa);
        return "actualizar-empresa";
    }

    @PostMapping("/empresa/actualizar/{id}")
    private String editarEmpresa(@PathVariable("id") Long id, Empresa empresa) {
        empresaService.crearYActualizarEmpresa(empresa);
        return "redirect:/empresa";
    }
}
