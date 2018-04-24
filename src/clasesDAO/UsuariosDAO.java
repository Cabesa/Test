package clasesDAO;

import java.util.List;

import javax.persistence.TypedQuery;


import clasesBean.Usuarios;
import main.Principal;

public class UsuariosDAO {
	//static Session session = HibernateUtil.getSession();

			public static void guardar(Usuarios user)
			{
				// esto es un insert, si es un registro nuevo,
				// sino usar session.update(dep);
				
				Principal.session.beginTransaction();
				Principal.session.save(user);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static Usuarios buscarPorID(Integer id)
			{
				// aquí busco el id
				Usuarios user = (Usuarios) Principal.session.get(Usuarios.class, id);
				return user;
			}

			public static void modificar(Usuarios user)
			{

				Principal.session.beginTransaction();
				Principal.session.update(user);
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public static void borrar(Usuarios user)
			{
				Principal.session.beginTransaction();
				Principal.session.delete(user); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}

			public void borrarByID(int id)
			{
				Usuarios user = buscarPorID(id);
				Principal.session.beginTransaction();
				Principal.session.delete(user); // esto es un delete
				Principal.session.getTransaction().commit();
				//session.close();
			}
			

			
			public static List<Usuarios> buscarTodos() {
				@SuppressWarnings("unchecked")
				TypedQuery<Usuarios> query = Principal.session.createQuery("FROM Usuarios");
			    List<Usuarios> result = query.getResultList();
				return result;
				} 

}
