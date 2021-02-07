package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("training-hibernate");

    public static EntityManager getConnection(){
        return emf.createEntityManager();
    }

    public EntityManager createConnection(){
        return emf.createEntityManager();
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    public static void setEntityManagerFactory(EntityManagerFactory emf) {
        ConnectionFactory.emf = emf;
    }
}
