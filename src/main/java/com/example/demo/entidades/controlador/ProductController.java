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

@RestController // Indica que essa classe é um controlador Spring Rest, capaz de processar requisições HTTP
@RequestMapping(value = "/produtos") // Mapeia o endereço base para "/produtos" para todos os métodos nessa classe
public class ProductController {
    @GetMapping // Mapeia um método para responder a uma requisição HTTP GET
    @ResponseBody // Indica que o valor retornado pelo método deve ser serializado como corpo da resposta HTTP
    public List<Product> getObjects (){
        // Criação de objetos de departamento, instancia
        Departamento d1 = new Departamento(1L, "Funko Pop");
        Departamento d2 = new Departamento(2L, "Mangás");
        // adiciona o id e o nome
        Product p1 = new Product(1L,"Pennywise", 129.71, d1);
        Product p2 = new Product(2L,"Chainsaw Man vol1", 50.00, d2);
        Product p3 = new Product(3L,"Chainsaw Man vol2", 50.00, d2);
        // Criação de uma lista de produtos
        List<Product> list = Arrays.asList(p1,p2);

        return list;// Retorna a lista de produtos como resposta da requisição

    }

}
