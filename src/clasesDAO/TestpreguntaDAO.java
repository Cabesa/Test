package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Testpregunta;
import main.Principal;

public class TestpreguntaDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Testpregunta testpreg)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(testpreg);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Testpregunta buscarPorID(Integer id)
			{
				// aquí busco el id
				Testpregunta testpreg = (Testpregunta) Principal.session.get(Testpregunta.class, id);
				return testpreg;
			}

			public static void modificar(Testpregunta testpreg)
			{

				Principal.session.beginTransaction();
				Principal.session.update(testpreg);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Testpregunta testpreg)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(testpreg); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Testpregunta testpreg = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(testpreg); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Testpregunta> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Testpregunta> query = Principal.session.createQuery("FROM Testpregunta");
			    List<Testpregunta> result = query.getResultList();
				return result;
				} 

}