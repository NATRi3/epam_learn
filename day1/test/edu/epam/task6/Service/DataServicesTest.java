//package edu.epam.task6.Service;
//
//import edu.epam.task6.Date.Data;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//
//import static org.testng.Assert.*;
//
//public class DataServicesTest {
//    @Test
//    public void SecInTimeTest() throws IOException {
//        int hour, minute, resSec;
//        for (int i = 55; i < 80000; i += 49) {
//            Data data = new Data(30);
//            hour = i / 3600;
//            minute = (i % 3600) / 60;
//            resSec = i % 60;
//            if (!(equals(DataServices.SecInTime(data), hour + " часов " + minute + " минут " + resSec + " секунд"))) {
//                assertTrue(false);
//            }
//            assertTrue(true);
//        }
//
//        private boolean equals (String secInTime, String s){
//            return equals(secInTime, s);
//        }
//    }
//}