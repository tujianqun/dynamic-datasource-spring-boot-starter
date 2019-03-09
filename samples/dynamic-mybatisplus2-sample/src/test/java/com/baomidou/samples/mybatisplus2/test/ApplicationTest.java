package com.baomidou.samples.mybatisplus2.test;

import com.baomidou.samples.mybatisplus2.Application;
import com.baomidou.samples.mybatisplus2.entity.Address;
import com.baomidou.samples.mybatisplus2.entity.User;
import com.baomidou.samples.mybatisplus2.service.AddressService;
import com.baomidou.samples.mybatisplus2.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    private Random random = new Random();

    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;

    @Autowired
    AddressService addressService;

    @Before
    public void beforeTest() {
        /*try {
            Connection connection = dataSource.getConnection();
            connection.createStatement().execute("CREATE TABLE IF NOT EXISTS  USER (\n" +
                    "  id BIGINT(20) NOT NULL AUTO_INCREMENT,\n" +
                    "  name VARCHAR(30) NULL DEFAULT NULL ,\n" +
                    "  age INT(11) NULL DEFAULT NULL ,\n" +
                    "  PRIMARY KEY (id)\n" +
                    ");");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setName("测试用户" + random.nextInt());
        user.setAge(random.nextInt(100));
        userService.insert(user);

        saveAddress();
    }


    public void saveAddress(){
        Address user = new Address();
        user.setIp("192.168.203.68");
        user.setAddress("我是好人，我很好");
        addressService.insert(user);
    }
    //@Test
    public void testSelectUser() {
        userService.selectList(null);
    }

}
