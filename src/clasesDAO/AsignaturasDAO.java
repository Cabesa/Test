package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Asignaturas;
import main.Principal;

public class AsignaturasDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Asignaturas asig)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(asig);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Asignaturas buscarPorID(Integer id)
			{
				// aquí busco el id
				Asignaturas asig = (Asignaturas) Principal.session.get(Asignaturas.class, id);
				return asig;
			}

			public static void modificar(Asignaturas asig)
			{

				Principal.session.beginTransaction();
				Principal.session.update(asig);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Asignaturas asig)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(asig); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Asignaturas asig = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(asig); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Asignaturas> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Asignaturas> query = Principal.session.createQuery("FROM Asignaturas");
			    List<Asignaturas> result = query.getResultList();
				return result;
				} 

}