package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Respuestas;
import main.Principal;

public class RespuestasDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Respuestas resp)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(resp);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Respuestas buscarPorID(Integer id)
			{
				// aquí busco el id
				Respuestas resp = (Respuestas) Principal.session.get(Respuestas.class, id);
				return resp;
			}

			public static void modificar(Respuestas resp)
			{

				Principal.session.beginTransaction();
				Principal.session.update(resp);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Respuestas resp)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(resp); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Respuestas resp = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(resp); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Respuestas> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Respuestas> query = Principal.session.createQuery("FROM Respuestas");
			    List<Respuestas> result = query.getResultList();
				return result;
				} 

}