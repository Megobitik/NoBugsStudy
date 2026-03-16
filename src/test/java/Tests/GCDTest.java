package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest {
    GCDMethod gcdMethod = new GCDMethod();

    @Test
    public void checkGCDNumber(){
        assertEquals(12,gcdMethod.gcd(24,36));
    }

    @Test
    public void checkGCDSimpleNumber(){
        assertEquals(1,gcdMethod.gcd(101,103));
    }

    @Test
    public void checkGCDWithZeroNumber(){
        assertEquals(10,gcdMethod.gcd(0,10));
    }
}
