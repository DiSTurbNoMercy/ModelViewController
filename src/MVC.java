public class MVC {

    public static void main(String[] args) {

        CalculatorForm theView = new CalculatorForm();
        Calculator theModel = new Calculator();
        Controller theControler = new Controller(theView, theModel);
        theView.setVisible(true);
    }
}
