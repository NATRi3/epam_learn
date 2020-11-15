package edu.epam.task8;

import edu.epam.task8.service.VariablesService;
import edu.epam.task8.variables.Variable;

public class main {
    public static void main(String[] args) {
        Variable variable = new Variable(6);
        Variable variable1 = new Variable(3);
        Variable variable2 = new Variable(9);
        Variable variable3 = new Variable(-23);
        Variable variable4 = new Variable(0);
        System.out.println(VariablesService.VariableFunction(variable));
        System.out.println(VariablesService.VariableFunction(variable1));
        System.out.println(VariablesService.VariableFunction(variable2));
        System.out.println(VariablesService.VariableFunction(variable3));
        System.out.println(VariablesService.VariableFunction(variable4));
    }
}
