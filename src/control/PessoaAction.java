package control;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import persistence.PessoaDao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import model.Pessoa;

public class PessoaAction extends ActionSupport implements ModelDriven<Pessoa>{
	
	private Pessoa pessoa;
	private List<Pessoa> dados;
	
	public PessoaAction() {
		dados = new ArrayList<Pessoa>();
		pessoa = new Pessoa();
	}

	public String consultar(){
		try {
			dados = new PessoaDao().findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String cadastrar() {
		HttpServletRequest request = ServletActionContext.getRequest();
		try {
			new PessoaDao().salvar(pessoa);
			dados = new PessoaDao().findAll();
			pessoa = new Pessoa();
			
			request.setAttribute("mensagem", "Pessoa cadastrada com sucesso!");
			return SUCCESS;
		}
		catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());
			return ERROR;
		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public List<Pessoa> getDados() {
		return dados;
	}

	public void setDados(List<Pessoa> dados) {
		this.dados = dados;
	}

	//retornar o atributo que representa a Classe de modelo associada a esta classe Action
	public Pessoa getModel(){
		return this.pessoa;
	}
	
}
