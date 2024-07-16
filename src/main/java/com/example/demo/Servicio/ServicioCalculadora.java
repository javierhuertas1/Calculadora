package com.example.demo.Servicio;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ServicioCalculadora {



    public Double sumaServicio(@RequestParam Double v1 , @RequestParam  Double v2){
        return  v1+v2;
    }

    public Double restaServicio(Double v1 , Double v2){
        return v1-v2;
    }

    public Double multiplicacionServicio(Double v1 , Double v2){
        return v1*v2;
    }

    @GetMapping("/Division")
    public Double divisionServicio(Double v1 , Double v2){
        return v1/v2;
    }


}
