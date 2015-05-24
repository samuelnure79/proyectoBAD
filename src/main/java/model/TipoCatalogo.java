package model;
// Generated 23-may-2015 18:32:09 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoCatalogo generated by hbm2java
 */
@Entity
@Table(name="TIPO_CATALOGO"
    ,schema="GRUPO8"
)
public class TipoCatalogo  implements java.io.Serializable {


     private int idTipoCatalogo;
     private String nombre;
     private Set<Catalogo> catalogos = new HashSet<Catalogo>(0);

    public TipoCatalogo() {
    }

	
    public TipoCatalogo(int idTipoCatalogo, String nombre) {
        this.idTipoCatalogo = idTipoCatalogo;
        this.nombre = nombre;
    }
    public TipoCatalogo(int idTipoCatalogo, String nombre, Set<Catalogo> catalogos) {
       this.idTipoCatalogo = idTipoCatalogo;
       this.nombre = nombre;
       this.catalogos = catalogos;
    }
   
     @Id 

    
    @Column(name="ID_TIPO_CATALOGO", unique=true, nullable=false, precision=6, scale=0)
    public int getIdTipoCatalogo() {
        return this.idTipoCatalogo;
    }
    
    public void setIdTipoCatalogo(int idTipoCatalogo) {
        this.idTipoCatalogo = idTipoCatalogo;
    }

    
    @Column(name="NOMBRE", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoCatalogo")
    public Set<Catalogo> getCatalogos() {
        return this.catalogos;
    }
    
    public void setCatalogos(Set<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }




}


