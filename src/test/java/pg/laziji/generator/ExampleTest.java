package pg.laziji.generator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import pg.laziji.generator.constant.KeyConsts;
import pg.laziji.generator.model.TableItem;
import pg.laziji.generator.service.GeneratorService;

import javax.annotation.Resource;

@ActiveProfiles("my")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTest {

    @Resource
    private GeneratorService generatorService;

    @Test
    public void test() {
        generatorService.generateCodeFile(new TableItem[]{
//                new TableItem("clearing_user_info"),
//                new TableItem("clearing_account"),
//                new TableItem("clearing_merchant"),
//                new TableItem("clearing_token"),
//                new TableItem("clearing_business_type"),
//                new TableItem("clearing_trade_fee"),
//                new TableItem("clearing_amount_record"),
//                new TableItem("clearing_freeze_record"),
//                new TableItem("clearing_push_message"),
//                new TableItem("clearing_business_type"),
//                new TableItem("clearing_trade_record"),
//                new TableItem("clearing_transfer_record"),
//                new TableItem("clearing_add_deduct_record"),
//                new TableItem("clearing_trade_record"),
        }, "/Users/caoliang/IdeaProjects/clearing-account/clearing-account-biz/");
    }
//    @Test
//    public void test() {
//        generatorService.generateCodeFile(new TableItem[]{
//                new TableItem("finance_account"),
//                new TableItem("finance_account_amount_record"),
//                new TableItem("finance_account_amount_record_opt_record"),
//                new TableItem("finance_profit_collect"),
//                new TableItem("finance_profit_collect_record"),
//                new TableItem("finance_subject"),
//                new TableItem("finance_subject_category"),
//        }, "/Users/caoliang/IdeaProjects/finance/finance-biz/");
//    }
}
