package edu.epam.task7.Service;

import edu.epam.task7.Dots.Dot;

public class DotService {
    public static double DistanceToO (Dot dot){
        return Math.sqrt((dot.getX()* dot.getX())+ (dot.getY()* dot.getY()));
    }
}
