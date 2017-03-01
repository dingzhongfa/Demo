
import com.tairan.mybatisdemo.Application;
import com.tairan.mybatisdemo.ExcelUtils;
import com.tairan.mybatisdemo.model.User;
import com.tairan.mybatisdemo.model.bill_transfer_guarantee;
import com.tairan.mybatisdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hzdzf on 2016/11/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestMybatis {

    @Autowired
    private UserService userService;

    @Test
    public void testInsert() {

        User user = new User();

        for (int i = 1; i < 100000; i++) {
            user.setId(i);
            user.setUserName("李四" + i);
            user.setPassword("123456");
            user.setAge(i);
            userService.insert(user);
        }
    }

    @Test
    public void testSelect() throws Exception {
//        List<User> list = userService.getUser();

        List<bill_transfer_guarantee> list = userService.selectAll();
        long startTime = System.currentTimeMillis();   //获取开始时间
        ExcelUtils.export(list);

        long endTime = System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }

    @Test
    public void testSelect2() {
        User user = new User();
        user.setUserName("李四18");
        List<User> list = userService.selectUserCheck(user);
        for (User u : list) {
            System.out.println(u);
        }

    }

    @Test
    public void testLogin() {
        User user = userService.getById(1);
        System.out.print(user);
    }

    @Test
    public void ExportExcell(){

    }
}
