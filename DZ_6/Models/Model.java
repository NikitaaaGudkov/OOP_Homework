package DZ_6.Models;

public class Model { 
    private BinaryOperations bo;

    public Model(BinaryOperations bo) {
        this.bo = bo;
    }

    public void setFirstNumber(double firstNumber) {
        bo.setFirstNumber(firstNumber);
    }

    public void setOperation(String operation) {
        bo.setOperation(operation);
    }

    public void setSecondNumber(double secondNumber) {
        bo.setSecondNumber(secondNumber);
    }

    public String getResult() {
        return bo.getResult();
    }
}
