package MavenProject.Maven.Model;

import MavenProject.Maven.Utility.MathUtility;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @PostMapping("/addfun")
    public int addTwoNumbers(@RequestBody Add request) {
        // Process the parameters and perform necessary operations


        // Return a response
        return MathUtility.add(request.getA(),request.getB());
    }

    public static class Add{
        private int a;

        private int b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }



    }
}

