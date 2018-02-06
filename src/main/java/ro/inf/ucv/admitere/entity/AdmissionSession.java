package ro.inf.ucv.admitere.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import ro.inf.ucv.admitere.service.utils.ConfigurationUtils;

@Entity
@Table(name = "admission_session")
public class AdmissionSession implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@NotBlank
	private String name;

	@Column(name = "creation_date")
	private Date creationDate = new Date();

	@NotNull
	@Column(name = "expiration_date")
	@DateTimeFormat(pattern = ConfigurationUtils.DATE_FORMAT)
	private Date expirationDate;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<AddmisionSpecialization> addmisionSpecialization;

	public AdmissionSession() {
	}

	public AdmissionSession(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public List<AddmisionSpecialization> getAddmisionSpecialization() {
		return addmisionSpecialization;
	}

	public void setAddmisionSpecialization(List<AddmisionSpecialization> addmisionSpecialization) {
		this.addmisionSpecialization = addmisionSpecialization;
	}

}