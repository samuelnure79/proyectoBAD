package model;
// Generated 17-may-2015 20:35:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Catalogo generated by hbm2java
 */
public class Catalogo  implements java.io.Serializable {


     private int idCatalogo;
     private TipoCatalogo tipoCatalogo;
     private String nombre;
     private String descripcion;
     private Set<Proveedor> proveedors = new HashSet<Proveedor>(0);
     private Set<Transaccion> transaccions = new HashSet<Transaccion>(0);
     private Set<Devolucion> devolucions = new HashSet<Devolucion>(0);
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);
     private Set<Producto> productos = new HashSet<Producto>(0);

    public Catalogo() {
    }

	
    public Catalogo(int idCatalogo, TipoCatalogo tipoCatalogo, String nombre) {
        this.idCatalogo = idCatalogo;
        this.tipoCatalogo = tipoCatalogo;
        this.nombre = nombre;
    }
    public Catalogo(int idCatalogo, TipoCatalogo tipoCatalogo, String nombre, String descripcion, Set<Proveedor> proveedors, Set<Transaccion> transaccions, Set<Devolucion> devolucions, Set<Usuario> usuarios, Set<Producto> productos) {
       this.idCatalogo = idCatalogo;
       this.tipoCatalogo = tipoCatalogo;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.proveedors = proveedors;
       this.transaccions = transaccions;
       this.devolucions = devolucions;
       this.usuarios = usuarios;
       this.productos = productos;
    }
   
    public int getIdCatalogo() {
        return this.idCatalogo;
    }
    
    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    public TipoCatalogo getTipoCatalogo() {
        return this.tipoCatalogo;
    }
    
    public void setTipoCatalogo(TipoCatalogo tipoCatalogo) {
        this.tipoCatalogo = tipoCatalogo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Proveedor> getProveedors() {
        return this.proveedors;
    }
    
    public void setProveedors(Set<Proveedor> proveedors) {
        this.proveedors = proveedors;
    }
    public Set<Transaccion> getTransaccions() {
        return this.transaccions;
    }
    
    public void setTransaccions(Set<Transaccion> transaccions) {
        this.transaccions = transaccions;
    }
    public Set<Devolucion> getDevolucions() {
        return this.devolucions;
    }
    
    public void setDevolucions(Set<Devolucion> devolucions) {
        this.devolucions = devolucions;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public Set<Producto> getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }




}

