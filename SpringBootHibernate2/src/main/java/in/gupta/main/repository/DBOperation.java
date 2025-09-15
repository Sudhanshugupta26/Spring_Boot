package in.gupta.main.repository;

import in.gupta.main.entities.User;

public interface DBOperation {
    public User getUserById(long id);
}
