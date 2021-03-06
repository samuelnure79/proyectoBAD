package model;
// Generated 23-may-2015 18:32:09 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Transaccion generated by hbm2java
 */
@Entity
@Table(name="TRANSACCION"
    ,schema="GRUPO8"
)
public class Transaccion  implements java.io.Serializable {


     private int idTransaccion;
     private Requisicion requisicion;
     private OrdenDeCompra ordenDeCompra;
     private Inventario inventario;
     private Devolucion devolucion;
     private Catalogo catalogo;

    public Transaccion() {
    }

	
    public Transaccion(int idTransaccion, Inventario inventario, Catalogo catalogo) {
        this.idTransaccion = idTransaccion;
        this.inventario = inventario;
        this.catalogo = catalogo;
    }
    public Transaccion(int idTransaccion, Requisicion requisicion, OrdenDeCompra ordenDeCompra, Inventario inventario, Devolucion devolucion, Catalogo catalogo) {
       this.idTransaccion = idTransaccion;
       this.requisicion = requisicion;
       this.ordenDeCompra = ordenDeCompra;
       this.inventario = inventario;
       this.devolucion = devolucion;
       this.catalogo = catalogo;
    }
   
     @Id 

    
    @Column(name="ID_TRANSACCION", unique=true, nullable=false, precision=6, scale=0)
    public int getIdTransaccion() {
        return this.idTransaccion;
    }
    
    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_REQUISICION")
    public Requisicion getRequisicion() {
        return this.requisicion;
    }
    
    public void setRequisicion(Requisicion requisicion) {
        this.requisicion = requisicion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ORDEN")
    public OrdenDeCompra getOrdenDeCompra() {
        return this.ordenDeCompra;
    }
    
    public void setOrdenDeCompra(OrdenDeCompra ordenDeCompra) {
        this.ordenDeCompra = ordenDeCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_INVENTARIO", nullable=false)
    public Inventario getInventario() {
        return this.inventario;
    }
    
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_DEVOLUCION")
    public Devolucion getDevolucion() {
        return this.devolucion;
    }
    
    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CATALOGO", nullable=false)
    public Catalogo getCatalogo() {
        return this.catalogo;
    }
    
    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }




}


