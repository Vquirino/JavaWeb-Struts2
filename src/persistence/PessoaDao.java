package persistence;

import org.hibernate.*;
import hibernate.*;
import model.Pessoa;
import java.util.*;

public class PessoaDao {

	Session s;
	Transaction t;
	Query q;
	
	public PessoaDao() {
	
	}
	
	public void salvar(Pessoa p) throws Exception{
		s = HibernateUtil.getInstance();
		t = s.beginTransaction();
		s.save(p);
		t.commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll() throws Exception{
		s = HibernateUtil.getInstance();
		q = s.createQuery("from Pessoa");
		return q.list();
	}
	
}
