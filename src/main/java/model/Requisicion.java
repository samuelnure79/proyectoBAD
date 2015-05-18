package model;
// Generated 17-may-2015 20:35:06 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Requisicion generated by hbm2java
 */
public class Requisicion  implements java.io.Serializable {


     private int idRequisicion;
     private Cliente cliente;
     private Empleado empleado;
     private Date fechaReq;
     private BigDecimal fueDevuelto;
     private Set<Transaccion> transaccions = new HashSet<Transaccion>(0);
     private Set<Devolucion> devolucions = new HashSet<Devolucion>(0);
     private Set<DetalleRequisicion> detalleRequisicions = new HashSet<DetalleRequisicion>(0);

    public Requisicion() {
    }

	
    public Requisicion(int idRequisicion, Cliente cliente, Empleado empleado, Date fechaReq) {
        this.idRequisicion = idRequisicion;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fechaReq = fechaReq;
    }
    public Requisicion(int idRequisicion, Cliente cliente, Empleado empleado, Date fechaReq, BigDecimal fueDevuelto, Set<Transaccion> transaccions, Set<Devolucion> devolucions, Set<DetalleRequisicion> detalleRequisicions) {
       this.idRequisicion = idRequisicion;
       this.cliente = cliente;
       this.empleado = empleado;
       this.fechaReq = fechaReq;
       this.fueDevuelto = fueDevuelto;
       this.transaccions = transaccions;
       this.devolucions = devolucions;
       this.detalleRequisicions = detalleRequisicions;
    }
   
    public int getIdRequisicion() {
        return this.idRequisicion;
    }
    
    public void setIdRequisicion(int idRequisicion) {
        this.idRequisicion = idRequisicion;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Date getFechaReq() {
        return this.fechaReq;
    }
    
    public void setFechaReq(Date fechaReq) {
        this.fechaReq = fechaReq;
    }
    public BigDecimal getFueDevuelto() {
        return this.fueDevuelto;
    }
    
    public void setFueDevuelto(BigDecimal fueDevuelto) {
        this.fueDevuelto = fueDevuelto;
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
    public Set<DetalleRequisicion> getDetalleRequisicions() {
        return this.detalleRequisicions;
    }
    
    public void setDetalleRequisicions(Set<DetalleRequisicion> detalleRequisicions) {
        this.detalleRequisicions = detalleRequisicions;
    }




}

