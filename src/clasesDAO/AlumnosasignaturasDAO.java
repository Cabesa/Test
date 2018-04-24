package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Alumnosasignaturas;
import main.Principal;

public class AlumnosasignaturasDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Alumnosasignaturas alumasig)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(alumasig);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Alumnosasignaturas buscarPorID(Integer id)
			{
				// aquí busco el id
				Alumnosasignaturas alumasig = (Alumnosasignaturas) Principal.session.get(Alumnosasignaturas.class, id);
				return alumasig;
			}

			public static void modificar(Alumnosasignaturas alumasig)
			{

				Principal.session.beginTransaction();
				Principal.session.update(alumasig);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Alumnosasignaturas alumasig)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(alumasig); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Alumnosasignaturas alumasig = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(alumasig); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Alumnosasignaturas> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Alumnosasignaturas> query = Principal.session.createQuery("FROM Alumnosasignaturas");
			    List<Alumnosasignaturas> result = query.getResultList();
				return result;
				} 

}