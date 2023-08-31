package com.example.demo.entidades.controlador;

import com.example.demo.Product;
import com.example.demo.entidades.Departamento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // em comum, configura para ...
@RequestMapping(value = "/produtos") // em comum, configura o endereço
public class ProductController {
    @GetMapping
    @ResponseBody
    public List<Product> getObjects (){
        // instancia o objeto
        Departamento d1 = new Departamento(1L, "Tech");
        Departamento d2 = new Departamento(2L, "Pet");
        // adiciona o id e o nome
        Product p1 = new Product(1L,"Macbok Pro", 4000.0, d1);
        Product p2 = new Product(2L,"Pethouse", 300.0, d2);

        List<Product> list = Arrays.asList(p1,p2);

        return list;

    }

}
