import com.booleanuk.PlanItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlanItemTest {


    @Test
    public void addItemTest(){
        PlanItem newPlanItem = new PlanItem();


        newPlanItem.add("JAVA CLASS", 10);

        newPlanItem.add("C++ CLASS", 20);

        newPlanItem.add("JAVASCRIPT CLASS", 30);

        Assertions.assertEquals(3, newPlanItem.plan);


    }

    @Test
    public void removeItemTest(){

    }

    @Test
    public void updateCapacityTest(){

    }
}
