package model;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table
public class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idPessoa;
	
	@Column
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date dataNasc;
	
	
	public Pessoa() {
		
	}


	public Integer getIdPessoa() {
		return idPessoa;
	}


	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	
	
	
}
