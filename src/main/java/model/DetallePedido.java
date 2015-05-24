package model;
// Generated 23-may-2015 18:32:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetallePedido generated by hbm2java
 */
@Entity
@Table(name="DETALLE_PEDIDO"
    ,schema="GRUPO8"
)
public class DetallePedido  implements java.io.Serializable {


     private int idDetalleProducto;
     private Producto producto;
     private Pedido pedido;
     private BigDecimal cantidad;

    public DetallePedido() {
    }

    public DetallePedido(int idDetalleProducto, Producto producto, Pedido pedido, BigDecimal cantidad) {
       this.idDetalleProducto = idDetalleProducto;
       this.producto = producto;
       this.pedido = pedido;
       this.cantidad = cantidad;
    }
   
     @Id 

    
    @Column(name="ID_DETALLE_PRODUCTO", unique=true, nullable=false, precision=6, scale=0)
    public int getIdDetalleProducto() {
        return this.idDetalleProducto;
    }
    
    public void setIdDetalleProducto(int idDetalleProducto) {
        this.idDetalleProducto = idDetalleProducto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_PRODUCTO", nullable=false)
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_PEDIDO", nullable=false)
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    
    @Column(name="CANTIDAD", nullable=false, precision=22, scale=0)
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }




}


