package model;
// Generated 23-may-2015 18:32:09 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Empleado generated by hbm2java
 */
@Entity
@Table(name="EMPLEADO"
    ,schema="GRUPO8"
)
public class Empleado  implements java.io.Serializable {


     private int idEmpleado;
     private Inventario inventario;
     private String rol;
     private Set<Requisicion> requisicions = new HashSet<Requisicion>(0);
     private Set<Pedido> pedidos = new HashSet<Pedido>(0);
     private Set<Inventario> inventarios = new HashSet<Inventario>(0);
     private Set<OrdenDeCompra> ordenDeCompras = new HashSet<OrdenDeCompra>(0);

    public Empleado() {
    }

	
    public Empleado(int idEmpleado, String rol) {
        this.idEmpleado = idEmpleado;
        this.rol = rol;
    }
    public Empleado(int idEmpleado, Inventario inventario, String rol, Set<Requisicion> requisicions, Set<Pedido> pedidos, Set<Inventario> inventarios, Set<OrdenDeCompra> ordenDeCompras) {
       this.idEmpleado = idEmpleado;
       this.inventario = inventario;
       this.rol = rol;
       this.requisicions = requisicions;
       this.pedidos = pedidos;
       this.inventarios = inventarios;
       this.ordenDeCompras = ordenDeCompras;
    }
   
     @Id 

    
    @Column(name="ID_EMPLEADO", unique=true, nullable=false, precision=6, scale=0)
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_INVENTARIO")
    public Inventario getInventario() {
        return this.inventario;
    }
    
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    
    @Column(name="ROL", nullable=false, length=15)
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<Requisicion> getRequisicions() {
        return this.requisicions;
    }
    
    public void setRequisicions(Set<Requisicion> requisicions) {
        this.requisicions = requisicions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<Pedido> getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<Inventario> getInventarios() {
        return this.inventarios;
    }
    
    public void setInventarios(Set<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<OrdenDeCompra> getOrdenDeCompras() {
        return this.ordenDeCompras;
    }
    
    public void setOrdenDeCompras(Set<OrdenDeCompra> ordenDeCompras) {
        this.ordenDeCompras = ordenDeCompras;
    }




}


