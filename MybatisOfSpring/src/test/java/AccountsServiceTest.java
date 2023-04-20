import com.mybatis.demo.config.SpringConfig;
import com.mybatis.demo.mode.Account;
import com.mybatis.demo.service.AccountsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//设置junit4的测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfig.class})
//如果是配置文件请加载配置文件@ContextConfiguration(locations={"classpath:applicationContext.xml"})//加载配置文件
public class AccountsServiceTest {
    @Autowired
    private AccountsService accountsService;
    @Test
    public void SelectByUidTest() {
        Account account = accountsService.selectByUid(1);
        System.out.println(account);
    }

    @Test
    public void SelectByUidAnnotationTest() {
        Account account = accountsService.selectByUidAnnotation(1);
        System.out.println(account);
    }
}
