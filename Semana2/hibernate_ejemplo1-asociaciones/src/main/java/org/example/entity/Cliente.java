package org.example.entity;

import jakarta.persistence.*;

@Entity //Le especificamos que es una clase de tipo entidad, es decir es un modelo de una tabla para el motor de BD
@Table(name = "clientes") //Le especificamos el nombre que tendra la tabla
public class Cliente {
    @Id//aqui le especificamos que el campo Id es el identificador de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //aqui le especificamos que identifique automaticamente si seleccionamos auto  // el tipo de dato debido a que varia dependiendo del motor //MYSQL, PSTGRESQL,ORACLE.... sequence, identityetc.
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "forma_pago") // con column le especificamos como se llamara la columna en la base de datos,//No es necesario hacerlo con todos los campos...
    private String formaPago;


    public Cliente(Long id, String nombre, String apellido, String formaPago) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.formaPago = formaPago;
    }
    public Cliente(){};
    public Cliente(  String apellido, String nombre ) {

        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        //Al implementar este metodo se evita uno que al imprimir un objeto muestre la direccion logica. Es util!!
        return
                "id=" + id + ", nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", formaPago=" + formaPago +"\n";
    }
}
