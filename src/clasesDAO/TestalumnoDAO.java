package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Testalumno;
import main.Principal;

public class TestalumnoDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Testalumno testalumno)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(testalumno);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Testalumno buscarPorID(Integer id)
			{
				// aquí busco el id
				Testalumno testalumno = (Testalumno) Principal.session.get(Testalumno.class, id);
				return testalumno;
			}

			public static void modificar(Testalumno testalumno)
			{

				Principal.session.beginTransaction();
				Principal.session.update(testalumno);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Testalumno testalumno)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(testalumno); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Testalumno testalumno = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(testalumno); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Testalumno> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Testalumno> query = Principal.session.createQuery("FROM Testalumno");
			    List<Testalumno> result = query.getResultList();
				return result;
				} 

}