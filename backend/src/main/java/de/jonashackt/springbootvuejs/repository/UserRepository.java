package de.jonashackt.springbootvuejs.repository;


import java.util.*;
import de.jonashackt.springbootvuejs.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(@Param("lastname") String lastname);

    List<User> findByFirstName(@Param("firstname") String firstname);
/*
    List<User> findByIs_Paid(@Param("is_paid") boolean is_paid);
*/
    List<User> findByCity(@Param("city") String city);
}
