/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gitproyect;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author javie
 */
public class GitProyectTest {
    
    public GitProyectTest() {
    }
    
    /**
     * Test of main method, of class GitProyect.
     */
    @Test
    public void testMain() {
        System.out.println("NumbersBettewn");
        int initValue = 3;
        int endValue = 8;
        ArrayList ExpectedResult;
        ExpectedResult = new ArrayList();
        for(int i = initValue + 1; i<endValue; i++)
            if(i%2 == 0)
                ExpectedResult.add(i);
        assertEquals(ExpectedResult, GitProyect.NumbersBettewn(initValue,endValue));
    }
    
}
