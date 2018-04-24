package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Tipopregunta;
import main.Principal;

public class TipopreguntaDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Tipopregunta tipopreg)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(tipopreg);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Tipopregunta buscarPorID(Integer id)
			{
				// aquí busco el id
				Tipopregunta tipopreg = (Tipopregunta) Principal.session.get(Tipopregunta.class, id);
				return tipopreg;
			}

			public static void modificar(Tipopregunta tipopreg)
			{

				Principal.session.beginTransaction();
				Principal.session.update(tipopreg);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Tipopregunta tipopreg)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(tipopreg); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Tipopregunta tipopreg = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(tipopreg); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Tipopregunta> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Tipopregunta> query = Principal.session.createQuery("FROM Tipopregunta");
			    List<Tipopregunta> result = query.getResultList();
				return result;
				} 

}