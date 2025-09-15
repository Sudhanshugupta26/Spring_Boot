package in.gupta.main.repository;

import in.gupta.main.config.HibernateConfig;
import in.gupta.main.entities.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class DBOpsImpl implements DBOperation {

    @Override
    public User getUserById(long id) {
        User user = null;
        try(
                Session session = HibernateConfig.getSessionFactory().openSession();
                )
        {
            user = session.get(User.class, id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
