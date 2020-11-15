package edu.epam.task7;

import edu.epam.task7.Dots.Dot;
import edu.epam.task7.Service.DotService;

public class main {
    public static void main(String[] args) {
        Dot dot = new Dot(1,39);
        Dot dot1 = new Dot(-1, 98);
        if (DotService.DistanceToO(dot)<DotService.DistanceToO(dot1)){
            System.out.println("Первая точка находиться ближе");}
        else {
            System.out.println("Вторая точка находиться ближе");
        }
    }
}
