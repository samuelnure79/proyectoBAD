package model;
// Generated 17-may-2015 20:35:06 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Bodega generated by hbm2java
 */
public class Bodega  implements java.io.Serializable {


     private int idBodega;
     private BigDecimal cantidadPasillos;
     private BigDecimal estantesPorPasillo;
     private String nombre2;
     private BigDecimal cantidadEstante;
     private BigDecimal productoPorEstante;
     private String ubicacion;
     private Set<Inventario> inventarios = new HashSet<Inventario>(0);

    public Bodega() {
    }

	
    public Bodega(int idBodega, String nombre2, String ubicacion) {
        this.idBodega = idBodega;
        this.nombre2 = nombre2;
        this.ubicacion = ubicacion;
    }
    public Bodega(int idBodega, BigDecimal cantidadPasillos, BigDecimal estantesPorPasillo, String nombre2, BigDecimal cantidadEstante, BigDecimal productoPorEstante, String ubicacion, Set<Inventario> inventarios) {
       this.idBodega = idBodega;
       this.cantidadPasillos = cantidadPasillos;
       this.estantesPorPasillo = estantesPorPasillo;
       this.nombre2 = nombre2;
       this.cantidadEstante = cantidadEstante;
       this.productoPorEstante = productoPorEstante;
       this.ubicacion = ubicacion;
       this.inventarios = inventarios;
    }
   
    public int getIdBodega() {
        return this.idBodega;
    }
    
    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }
    public BigDecimal getCantidadPasillos() {
        return this.cantidadPasillos;
    }
    
    public void setCantidadPasillos(BigDecimal cantidadPasillos) {
        this.cantidadPasillos = cantidadPasillos;
    }
    public BigDecimal getEstantesPorPasillo() {
        return this.estantesPorPasillo;
    }
    
    public void setEstantesPorPasillo(BigDecimal estantesPorPasillo) {
        this.estantesPorPasillo = estantesPorPasillo;
    }
    public String getNombre2() {
        return this.nombre2;
    }
    
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    public BigDecimal getCantidadEstante() {
        return this.cantidadEstante;
    }
    
    public void setCantidadEstante(BigDecimal cantidadEstante) {
        this.cantidadEstante = cantidadEstante;
    }
    public BigDecimal getProductoPorEstante() {
        return this.productoPorEstante;
    }
    
    public void setProductoPorEstante(BigDecimal productoPorEstante) {
        this.productoPorEstante = productoPorEstante;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Set<Inventario> getInventarios() {
        return this.inventarios;
    }
    
    public void setInventarios(Set<Inventario> inventarios) {
        this.inventarios = inventarios;
    }




}


