package main;

import java.util.List;

import org.hibernate.Session;

import clasesBean.Tipopregunta;
import clasesDAO.TipopreguntaDAO;
import clasesDAO.UsuariosDAO;
import util.HibernateUtil;

public class Principal {
	public static Session session = HibernateUtil.getSession();
	
	public static void main(String[] args) {
		List<Tipopregunta> result = TipopreguntaDAO.buscarTodos();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getIdTipoPregunta()+" - "+result.get(i).getNombreTipoPregunta());
		}
	}

}
