package edu.epam.task9.service;

import edu.epam.task9.figure.Circlet;

public class FigureService {

    public static double SqrFigure(Circlet circlet){
        return 3.14*circlet.getR()* circlet.getR();
    }

    public static double LengthOfCirclet (Circlet circlet){
        return 2*3.14* circlet.getR();
    }
}
