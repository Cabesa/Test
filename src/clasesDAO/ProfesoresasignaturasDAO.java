package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Profesoresasignaturas;
import main.Principal;

public class ProfesoresasignaturasDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Profesoresasignaturas profasig)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(profasig);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Profesoresasignaturas buscarPorID(Integer id)
			{
				// aquí busco el id
				Profesoresasignaturas profasig = (Profesoresasignaturas) Principal.session.get(Profesoresasignaturas.class, id);
				return profasig;
			}

			public static void modificar(Profesoresasignaturas profasig)
			{

				Principal.session.beginTransaction();
				Principal.session.update(profasig);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Profesoresasignaturas profasig)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(profasig); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Profesoresasignaturas profasig = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(profasig); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Profesoresasignaturas> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Profesoresasignaturas> query = Principal.session.createQuery("FROM Profesoresasignaturas");
			    List<Profesoresasignaturas> result = query.getResultList();
				return result;
				} 

}