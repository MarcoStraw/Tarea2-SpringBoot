package marco.miranda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;

	@ManyToOne
	@JoinColumn(name = "id_supervisor",nullable = false,foreignKey = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor Supervisor;
	
	@Size(min = 3, message = "Nombre Vendedor debe tener minimo 3 caracteres")
	@Column(name = "nombre_Vendedor",nullable = false,length = 70)
	private String nombre_vendedor;
	
	@Size(min = 5, message = "la direccion del Vendedor debe tener minimo 5 caracteres")
	@Column(name = "dir_Vendedor",nullable = false,length = 150)
	private String dir_Vendedor;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Supervisor getSupervisor() {
		return Supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		Supervisor = supervisor;
	}

	public String getNombre_vendedor() {
		return nombre_vendedor;
	}

	public void setNombre_vendedor(String nombre_vendedor) {
		this.nombre_vendedor = nombre_vendedor;
	}

	public String getDir_Vendedor() {
		return dir_Vendedor;
	}

	public void setDir_Vendedor(String dir_Vendedor) {
		this.dir_Vendedor = dir_Vendedor;
	}

}
