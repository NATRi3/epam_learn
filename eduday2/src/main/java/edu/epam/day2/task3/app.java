package edu.epam.day2.task3;

import edu.epam.day2.task3.report.ReportArray;
import edu.epam.day2.task3.service.random.RandomNumbers;
import edu.epam.day2.task3.service.reader.ReaderNumber;

public class app {
    public static void main(String[] args) {
        ReaderNumber read = new ReaderNumber();
        new ReportArray().ReportArrayNumber(new RandomNumbers().GenerateRandomNumbers(read.ReaderNumber()));
    }
}
