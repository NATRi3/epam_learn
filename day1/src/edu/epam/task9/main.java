package edu.epam.task9;

import edu.epam.task9.figure.Circlet;
import edu.epam.task9.service.FigureService;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Circlet circlet = new Circlet(26);
        System.out.println(FigureService.LengthOfCirclet(circlet)+"  "+ FigureService.SqrFigure(circlet));
    }
}
