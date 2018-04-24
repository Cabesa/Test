package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Preguntas;
import main.Principal;

public class PreguntasDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Preguntas preg)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(preg);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Preguntas buscarPorID(Integer id)
			{
				// aquí busco el id
				Preguntas preg = (Preguntas) Principal.session.get(Preguntas.class, id);
				return preg;
			}

			public static void modificar(Preguntas preg)
			{

				Principal.session.beginTransaction();
				Principal.session.update(preg);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Preguntas preg)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(preg); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Preguntas preg = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(preg); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Preguntas> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Preguntas> query = Principal.session.createQuery("FROM Preguntas");
			    List<Preguntas> result = query.getResultList();
				return result;
				} 

}