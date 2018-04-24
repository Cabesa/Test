package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Alumnos;
import main.Principal;

public class AlumnosDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Alumnos alum)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(alum);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Alumnos buscarPorID(Integer id)
			{
				// aquí busco el id
				Alumnos alum = (Alumnos) Principal.session.get(Alumnos.class, id);
				return alum;
			}

			public static void modificar(Alumnos alum)
			{

				Principal.session.beginTransaction();
				Principal.session.update(alum);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Alumnos alum)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(alum); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Alumnos alum = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(alum); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Alumnos> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Alumnos> query = Principal.session.createQuery("FROM Alumnos");
			    List<Alumnos> result = query.getResultList();
				return result;
				} 

}