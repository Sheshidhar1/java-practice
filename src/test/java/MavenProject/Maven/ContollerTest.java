package MavenProject.Maven;

import MavenProject.Maven.Model.Controller;
import net.bytebuddy.implementation.bytecode.Addition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContollerTest {

    Controller controller = new Controller();

    @Test
    public void testaddNum(){
        int a = 2;
        int b = 10;

        int ExpectedResult = 15;
        Controller.Add addRequest = new Controller.Add();
        addRequest.setA(a);
        addRequest.setB(b);

        int result = controller.addTwoNumbers(addRequest);

        Assertions.assertEquals(ExpectedResult, result);


    }
}
