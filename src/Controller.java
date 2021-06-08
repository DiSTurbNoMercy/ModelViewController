import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private CalculatorForm theView;
    private Calculator theModel;

    public Controller(CalculatorForm theView, Calculator theModel) {

        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculationListener(new CalculateListener());
    }
    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            int firstNamber, secondNumber = 0;
            try {
                firstNamber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNamber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch (NumberFormatException ex) {
                theView.displayErrorMessage("You need to enter 2 integers");
            }
        }
    }
}
