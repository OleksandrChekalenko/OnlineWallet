package com.test.bu.service;

import com.test.bu.config.JpaConfig;
import com.test.bu.config.JpaConfigTest;
import com.test.bu.config.SpringConfig;
import com.test.bu.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class})
public class UsersServiceImplTest {

    @Autowired
    private UsersService usersService;

    /*@Test
    public void getById() throws Exception {
        Users user = getTestUser("Walter");
        usersService.save(user);

        ArrayList<Users> all = (ArrayList<Users>) usersService.getAll();
        Optional<Users> walter = all.stream().filter(users -> user.getName().equals("Walter")).findFirst();
        Users user2 = walter.get();
        Users userServiceById = usersService.getById(user2.getId());
        assertNotNull(userServiceById);
        assertEquals("Walter", userServiceById.getName());
    }*/

    private Users getTestUser(String name) {
        Users user = new Users();
        user.setName(name);
        user.setFirstName("Monkey");
        user.setPassword("987654");
        user.setPhoneNumber("651213213");
        return user;
    }

    @Test
    public void getAll() throws Exception {
        Users user = getTestUser("getAllUser");
        Collection<Users> toAll = usersService.getAll();
        usersService.save(user);
        Collection<Users> afterAll = usersService.getAll();
        assertEquals(toAll.size()+1, afterAll.size());
    }

   /* @Test
    public void save() throws Exception {
        Users user = getTestUser("saveUser");
        usersService.save(user);
        ArrayList<Users> all = (ArrayList<Users>) usersService.getAll();
        Optional<Users> saveUser = all.stream().filter(users -> user.getName().equals("saveUser")).findFirst();
        Users user2 = saveUser.get();
        Users userServiceById = usersService.getById(user2.getId());
        assertNotNull(userServiceById);
        assertEquals("saveUser", userServiceById.getName());
    }*/
/*        ArrayList<Users> all = (ArrayList<Users>) usersService.getAll();
        Optional<Users> walter = all.stream().filter(users -> user.getName().equals("Walter")).findFirst();
        Users user2 = walter.get();
        Users userServiceById = usersService.getById(user2.getId());
        assertNotNull(userServiceById);
        assertEquals("Walter", userServiceById.getName());*/
    @Test
    public void delete() throws Exception {
        Users user = getTestUser("saveUser");

    }

    @Test
    public void update() throws Exception {
    }

}