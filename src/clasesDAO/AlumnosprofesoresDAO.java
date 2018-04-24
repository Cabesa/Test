package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Alumnosprofesores;
import main.Principal;

public class AlumnosprofesoresDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Alumnosprofesores alumprof)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(alumprof);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Alumnosprofesores buscarPorID(Integer id)
			{
				// aquí busco el id
				Alumnosprofesores alumprof = (Alumnosprofesores) Principal.session.get(Alumnosprofesores.class, id);
				return alumprof;
			}

			public static void modificar(Alumnosprofesores alumprof)
			{

				Principal.session.beginTransaction();
				Principal.session.update(alumprof);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Alumnosprofesores alumprof)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(alumprof); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Alumnosprofesores alumprof = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(alumprof); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Alumnosprofesores> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Alumnosprofesores> query = Principal.session.createQuery("FROM Alumnosprofesores");
			    List<Alumnosprofesores> result = query.getResultList();
				return result;
				} 

}