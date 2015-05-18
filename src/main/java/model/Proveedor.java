package model;
// Generated 17-may-2015 20:35:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private int idProveedor;
     private Catalogo catalogo;
     private String nombre;
     private String correo;
     private String nit;
     private String giro;
     private String nrc;
     private Set<Producto> productos = new HashSet<Producto>(0);
     private Set<Cotizacion> cotizacions = new HashSet<Cotizacion>(0);
     private Set<Devolucion> devolucions = new HashSet<Devolucion>(0);

    public Proveedor() {
    }

	
    public Proveedor(int idProveedor, Catalogo catalogo, String nombre, String nit, String nrc) {
        this.idProveedor = idProveedor;
        this.catalogo = catalogo;
        this.nombre = nombre;
        this.nit = nit;
        this.nrc = nrc;
    }
    public Proveedor(int idProveedor, Catalogo catalogo, String nombre, String correo, String nit, String giro, String nrc, Set<Producto> productos, Set<Cotizacion> cotizacions, Set<Devolucion> devolucions) {
       this.idProveedor = idProveedor;
       this.catalogo = catalogo;
       this.nombre = nombre;
       this.correo = correo;
       this.nit = nit;
       this.giro = giro;
       this.nrc = nrc;
       this.productos = productos;
       this.cotizacions = cotizacions;
       this.devolucions = devolucions;
    }
   
    public int getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public Catalogo getCatalogo() {
        return this.catalogo;
    }
    
    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getGiro() {
        return this.giro;
    }
    
    public void setGiro(String giro) {
        this.giro = giro;
    }
    public String getNrc() {
        return this.nrc;
    }
    
    public void setNrc(String nrc) {
        this.nrc = nrc;
    }
    public Set<Producto> getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
    public Set<Cotizacion> getCotizacions() {
        return this.cotizacions;
    }
    
    public void setCotizacions(Set<Cotizacion> cotizacions) {
        this.cotizacions = cotizacions;
    }
    public Set<Devolucion> getDevolucions() {
        return this.devolucions;
    }
    
    public void setDevolucions(Set<Devolucion> devolucions) {
        this.devolucions = devolucions;
    }




}

