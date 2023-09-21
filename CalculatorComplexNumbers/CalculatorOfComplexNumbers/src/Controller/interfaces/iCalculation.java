package Controller.interfaces;

import Model.ComplexNumber;

public interface iCalculation {
    
    void addition(ComplexNumber cn1, ComplexNumber cn2);
    void subtraction(ComplexNumber cn1, ComplexNumber cn2);
    void multiplication(ComplexNumber cn1, ComplexNumber cn2);
    void division(ComplexNumber cn1, ComplexNumber cn2);
}
