package marco.miranda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Supervisor")
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSupervisor;
	
	@Size(min = 3, message = "Nombre del Supervisor debe tener minimo 3 caracteres")
	@Column(name = "nombre_Supervisor",nullable = false,length = 70)
	private String nombre_Supervisor;
	
	@Size(min = 5, message = "la direccion del Supervisor debe tener minimo 5 caracteres")
	@Column(name = "dir_Supervisor",nullable = false,length = 150)
	private String dir_Supervisor;
	
	@Size(min = 9, max = 9, message = "Telefono del Supervisor debe tener 9 caracteres")
	@Column(name = "tel_Supervisor",nullable = false,length = 9)
	private String tel_Supervisor;

	public Integer getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
	}

	public String getNombre_Supervisor() {
		return nombre_Supervisor;
	}

	public void setNombre_Supervisor(String nombre_Supervisor) {
		this.nombre_Supervisor = nombre_Supervisor;
	}

	public String getDir_Supervisor() {
		return dir_Supervisor;
	}

	public void setDir_Supervisor(String dir_Supervisor) {
		this.dir_Supervisor = dir_Supervisor;
	}

	public String getTel_Supervisor() {
		return tel_Supervisor;
	}

	public void setTel_Supervisor(String tel_Supervisor) {
		this.tel_Supervisor = tel_Supervisor;
	}
	
	

}
