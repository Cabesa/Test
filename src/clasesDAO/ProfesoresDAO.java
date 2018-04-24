package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Profesores;
import main.Principal;

public class ProfesoresDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Profesores prof)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(prof);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Profesores buscarPorID(Integer id)
			{
				// aquí busco el id
				Profesores prof = (Profesores) Principal.session.get(Profesores.class, id);
				return prof;
			}

			public static void modificar(Profesores prof)
			{

				Principal.session.beginTransaction();
				Principal.session.update(prof);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Profesores prof)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(prof); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Profesores prof = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(prof); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Profesores> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Profesores> query = Principal.session.createQuery("FROM Profesores");
			    List<Profesores> result = query.getResultList();
				return result;
				} 

}