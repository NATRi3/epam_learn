package edu.epam.task8.service;

import edu.epam.task8.variables.Variable;

public class VariablesService {
    public static int VariableFunction(Variable variable){
        if(variable.getX()<3){
            return 1/(variable.getX()*variable.getX()*variable.getX()-6);
        }
        else {
            return -(variable.getX()*variable.getX())+3*variable.getX()+9;
        }
    }
}
