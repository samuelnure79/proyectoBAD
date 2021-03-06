package model;
// Generated 23-may-2015 18:32:09 by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedido generated by hbm2java
 */
@Entity
@Table(name="PEDIDO"
    ,schema="GRUPO8"
)
public class Pedido  implements java.io.Serializable {


     private int idPedido;
     private Empleado empleado;
     private Date fechaPedido;
     private Set<DetallePedido> detallePedidos = new HashSet<DetallePedido>(0);
     private Set<Cotizacion> cotizacions = new HashSet<Cotizacion>(0);

    public Pedido() {
    }

	
    public Pedido(int idPedido, Empleado empleado, Date fechaPedido) {
        this.idPedido = idPedido;
        this.empleado = empleado;
        this.fechaPedido = fechaPedido;
    }
    public Pedido(int idPedido, Empleado empleado, Date fechaPedido, Set<DetallePedido> detallePedidos, Set<Cotizacion> cotizacions) {
       this.idPedido = idPedido;
       this.empleado = empleado;
       this.fechaPedido = fechaPedido;
       this.detallePedidos = detallePedidos;
       this.cotizacions = cotizacions;
    }
   
     @Id 

    
    @Column(name="ID_PEDIDO", unique=true, nullable=false, precision=6, scale=0)
    public int getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_EMPLEADO", nullable=false)
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_PEDIDO", nullable=false, length=7)
    public Date getFechaPedido() {
        return this.fechaPedido;
    }
    
    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pedido")
    public Set<DetallePedido> getDetallePedidos() {
        return this.detallePedidos;
    }
    
    public void setDetallePedidos(Set<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pedido")
    public Set<Cotizacion> getCotizacions() {
        return this.cotizacions;
    }
    
    public void setCotizacions(Set<Cotizacion> cotizacions) {
        this.cotizacions = cotizacions;
    }




}


