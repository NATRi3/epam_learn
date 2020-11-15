package edu.epam.task6;

import edu.epam.task6.Date.Data;
import edu.epam.task6.Service.DataServices;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Data data = new Data(76894);
        System.out.println(DataServices.SecInTime(data));
    }
}
