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

@ActiveProfiles("example")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTest {

    @Resource
    private GeneratorService generatorService;

//    @Test
//    public void testZip() {
//        generatorService.generateZip(new TableItem[]{
//                TableItem.newBuilder()
//                        .tableName("clearing_account")
//                        .dynamicPathVariable(KeyConsts.CLASS_NAME, "TableA")
//                        .build()
//                ,new TableItem("sys_role")
//        }, "/Users/caoliang/Downloads/code/code.zip");
//    }
    @Test
    public void test() {
        generatorService.generateCodeFile(new TableItem[]{
                new TableItem("clearing_account")
        }, "/Users/caoliang/Downloads/code/");
    }
}
