package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Test;
import main.Principal;

public class TestDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Test test)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(test);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Test buscarPorID(Integer id)
			{
				// aquí busco el id
				Test test = (Test) Principal.session.get(Test.class, id);
				return test;
			}

			public static void modificar(Test test)
			{

				Principal.session.beginTransaction();
				Principal.session.update(test);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Test test)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(test); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Test test = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(test); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Test> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Test> query = Principal.session.createQuery("FROM Test");
			    List<Test> result = query.getResultList();
				return result;
				} 

}