package com.example.demo;

import com.example.demo.data.ProductoRepo;
import com.example.demo.data.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudFcturaApplication  implements CommandLineRunner {

    @Autowired
    ProductoRepo PrductoRepo;
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFcturaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        PrductoRepo.save( new Producto(1,"pc1",22.22,2255));
        PrductoRepo.save( new Producto(2,"pc2",22.22,2255));
        PrductoRepo.save( new Producto(3,"pc3",22.22,2255));
        PrductoRepo.save( new Producto(4,"pc4",22.22,2255));
        PrductoRepo.save( new Producto(5,"pc5",22.22,2255));
        PrductoRepo.save( new Producto(6,"pc6",22.22,2255));
    }
}
