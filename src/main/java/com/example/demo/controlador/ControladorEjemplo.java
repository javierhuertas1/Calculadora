package com.example.demo.controlador;


import com.example.demo.Servicio.ServicioCalculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Calculadora")
public class ControladorEjemplo {


   private final ServicioCalculadora servicio ;

   @Autowired
    public ControladorEjemplo(ServicioCalculadora servicio) {
        this.servicio = servicio;
    }


    @GetMapping("/Suma")
    public Double suma(@RequestParam Double v1 , @RequestParam  Double v2){
        return  servicio.sumaServicio(v1,v2);
    }

    @GetMapping("/Resta")
    public Double resta(Double v1 , Double v2){
        return servicio.restaServicio(v1,v2);
    }

    @GetMapping("/Multiplicacion")
    public Double multiplicacion(Double v1 , Double v2){
        return servicio.multiplicacionServicio(v1, v2);
    }

    @GetMapping("/Division")
    public Double division(Double v1 , Double v2){
        return servicio.divisionServicio(v1,v2);
    }


}
