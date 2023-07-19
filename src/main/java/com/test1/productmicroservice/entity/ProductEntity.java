package com.test1.productmicroservice.entity;

//Apuntamos la clase hacia la conexion de la base de datos

//importamos la libreria de Document
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Nos sirve para definir el nombre de la coleccion que estara modificando
@Document(value="product")

//Hacemos uso de lombok para determinar los setter y getter
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
    //Anotamos la propiedad privada ID
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;
}
