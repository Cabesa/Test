package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Temas;
import main.Principal;

public class TemasDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Temas tema)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(tema);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Temas buscarPorID(Integer id)
			{
				// aquí busco el id
				Temas tema = (Temas) Principal.session.get(Temas.class, id);
				return tema;
			}

			public static void modificar(Temas tema)
			{

				Principal.session.beginTransaction();
				Principal.session.update(tema);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Temas tema)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(tema); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Temas tema = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(tema); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Temas> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Temas> query = Principal.session.createQuery("FROM Temas");
			    List<Temas> result = query.getResultList();
				return result;
				} 

}