package marco.miranda.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;

	@ManyToOne
	@JoinColumn(name = "id_marca",nullable = false,foreignKey = @ForeignKey(name = "FK_producto_marca"))
	private Marca Marca;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "compra_prouducto", joinColumns = @JoinColumn(name = "id_producto", referencedColumnName = "idProducto"), inverseJoinColumns = @JoinColumn(name = "id_venta", referencedColumnName = "idVenta"))
	private List<Venta> ventas;

	@Size(min = 5, max = 100, message = "la descripcion debe tener minimo 5 caracteres")
	@Column(name = "descripcion",nullable = false,length = 100)
	private String descripcion;
	
	@Size(min = 1, message = "el valor del producto debe tener minimo 1 caracter")
	@Column(name = "valor_producto",nullable = false,length = 70)
	private String valor_producto;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Marca getMarca() {
		return Marca;
	}

	public void setMarca(Marca marca) {
		Marca = marca;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor_producto() {
		return valor_producto;
	}

	public void setValor_producto(String valor_producto) {
		this.valor_producto = valor_producto;
	}
	
	
	
	

}
