import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Aluno implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAluno;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String sexo;
	
	@Column(nullable = false)
	private Integer nota;
	
	@Column(nullable = false)
	private Date dt_nasc;

}
