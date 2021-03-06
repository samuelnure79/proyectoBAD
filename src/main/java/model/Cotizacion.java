package model;
// Generated 23-may-2015 18:32:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * Cotizacion generated by hbm2java
 */
@Entity
@Table(name="COTIZACION"
    ,schema="GRUPO8"
)
public class Cotizacion  implements java.io.Serializable {


     private int idCotizacion;
     private Proveedor proveedor;
     private Pedido pedido;
     private BigDecimal estadoCot;
     private Set<OrdenDeCompra> ordenDeCompras = new HashSet<OrdenDeCompra>(0);

    public Cotizacion() {
    }

	
    public Cotizacion(int idCotizacion, Proveedor proveedor, Pedido pedido, BigDecimal estadoCot) {
        this.idCotizacion = idCotizacion;
        this.proveedor = proveedor;
        this.pedido = pedido;
        this.estadoCot = estadoCot;
    }
    public Cotizacion(int idCotizacion, Proveedor proveedor, Pedido pedido, BigDecimal estadoCot, Set<OrdenDeCompra> ordenDeCompras) {
       this.idCotizacion = idCotizacion;
       this.proveedor = proveedor;
       this.pedido = pedido;
       this.estadoCot = estadoCot;
       this.ordenDeCompras = ordenDeCompras;
    }
   
     @Id 

    
    @Column(name="ID_COTIZACION", unique=true, nullable=false, precision=6, scale=0)
    public int getIdCotizacion() {
        return this.idCotizacion;
    }
    
    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_PROVEEDOR", nullable=false)
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_PEDIDO", nullable=false)
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    
    @Column(name="ESTADO_COT", nullable=false, precision=22, scale=0)
    public BigDecimal getEstadoCot() {
        return this.estadoCot;
    }
    
    public void setEstadoCot(BigDecimal estadoCot) {
        this.estadoCot = estadoCot;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cotizacion")
    public Set<OrdenDeCompra> getOrdenDeCompras() {
        return this.ordenDeCompras;
    }
    
    public void setOrdenDeCompras(Set<OrdenDeCompra> ordenDeCompras) {
        this.ordenDeCompras = ordenDeCompras;
    }




}


