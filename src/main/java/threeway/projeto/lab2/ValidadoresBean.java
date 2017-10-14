package threeway.projeto.lab2;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped

public class ValidadoresBean implements Serializable {
	private static final long serialVersionUID = -8703642631958516900L;
	private String atributoObrigatorio;
	private String email;
	private String celsiusToFahrenheit;

	public String getAtributoObrigatorio() {
		return atributoObrigatorio;
	}

	public void setAtributoObrigatorio(String atributoObrigatorio) {
		this.atributoObrigatorio = atributoObrigatorio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelsiusToFahrenheit() {
		return celsiusToFahrenheit;
	}

	public void setCelsiusToFahrenheit(String celsiusToFahrenheit) {
			this.celsiusToFahrenheit = celsiusToFahrenheit;
			}
			}


