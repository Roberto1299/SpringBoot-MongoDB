package com.test1.productmicroservice.repository;

import com.test1.productmicroservice.entity.ProductEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;


//En los repository cuando resulta un error de bean
//se soluciona colocando @Configuration
//Para lograr la conexión correctamente con la base de datos mongodb debe de ser una interfaz
//de lo contrario no conectara  a la base de datos, ademas verificar si la libreria
//esta importada en el archivo pom.xml
@Configuration
public interface ProductRepository extends MongoRepository<ProductEntity,String> {


}
