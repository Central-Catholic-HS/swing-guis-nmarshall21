import javax.swing.JOptionPane;

public class CovidTest
{
  public static void main(String[] args)
  {
    //ask questions
    String whatTemp;
    whatTemp = JOptionPane.showInputDialog("What is your temperature? ");
    String headache;
    headache = JOptionPane.showInputDialog("Do you have a headache? ");
    
    //take String of whatTemp and cast to double
    double temperature;
    temperature = Double.parseDouble(whatTemp);
    
    //variables for display only
    String result;
    String symbol;
    
    if (temperature >= 99.0 || temperature <= 95.0) {
      result = "not ";
      symbol = "✗";
    }
    if (headache == True) {
      result = "not ";
      symbol = "✗";
    }
    else {
      result = "";
      symbol = "✓";
    }
    
    //show final result
    JOptionPane.showMessageDialog(null, symbol+"You are "+result+"allowed in school today.");
    System.exit(0);
  }
}
