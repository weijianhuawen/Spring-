import com.transfer.demo.config.SpringConfig;
import com.transfer.demo.mode.Account;
import com.transfer.demo.mode.TransferLog;
import com.transfer.demo.service.TransferLogService;
import com.transfer.demo.service.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class TransferTest {
    @Autowired
    private TransferService transferService;
    @Autowired
    private TransferLogService logService;
    @Test
    public void SelectAllTest() {
        System.out.println(transferService.selectAll());
    }
    @Test
    public void transferMoneyTest() {
        Account user1 = new Account();
        Account user2 = new Account();
        user1.setUid(1);
        user2.setUid(2);
        System.out.println("转账前:");
        System.out.println(transferService.selectByUid(user1.getUid()));
        System.out.println(transferService.selectByUid(user2.getUid()));
        try{
            transferService.transferMoney(user1, user2, 520);
        } catch (ArithmeticException e) {
            System.out.println("转账异常:");
        }
        System.out.println("转账后：");
        System.out.println(transferService.selectByUid(user1.getUid()));
        System.out.println(transferService.selectByUid(user2.getUid()));
    }

    @Test
    public void logsTest() {
        Account out = transferService.selectByUid(1);
        Account in = transferService.selectByUid(2);
        Random random = new Random();
        double money = 100 * random.nextDouble();
        money = Math.round(money * 100) * 0.01;
        System.out.println("转账前:");
        System.out.println(transferService.selectByUid(out.getUid()));
        System.out.println(transferService.selectByUid(in.getUid()));
        try {
             transferService.transferMoney(out, in, money);
        } catch (Exception e) {
            System.out.println("转账异常！");
        }
        System.out.println("转账后：");
        System.out.println(transferService.selectByUid(out.getUid()));
        System.out.println(transferService.selectByUid(in.getUid()));
        System.out.println(logService.selectAll());

    }
}
