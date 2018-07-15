import com.bdd.controller.ProgressionController;
import com.bdd.inputtaker.CommandLineInputTaker;
import com.bdd.service.ProgressionFactory;
import com.bdd.validator.ProgressionInputValidator;
import javax.naming.OperationNotSupportedException;

public class MainApplication {

  public static void main(String[] args) throws OperationNotSupportedException {
    //IInputTaker inputTaker = new PropertiesInputTaker("input.properties");

    new ProgressionController(new ProgressionFactory(),
      new CommandLineInputTaker(),
      new ProgressionInputValidator()).execute();
  }


}
