package com.lynnjosse.EvalTool.models.dao;

import com.lynnjosse.EvalTool.models.User;
import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import javax.transaction.Transactional;


@Transactional
@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByEmail(String email);
}