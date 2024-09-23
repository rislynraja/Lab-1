package src.u;

import java.lang.Math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.c.Hybrid;

public class HybridTests {

	Hybrid hybrid;

	@Before
	public void setUp() throws Exception {
		hybrid  = new Hybrid();
    }

	@Test
	public void mpgTest() {

		double miles = 30.0;
        double gallons = 1.0;
		double expectedMPG = miles/gallons;
		hybrid.setGallonsfromGas(gallons);
        hybrid.setMilesfromGas(miles);

		double actualMPG = hybrid.calcGasMPG();

		assertTrue(actualMPG == expectedMPG);
	}

    @Test
	public void mpgETest() {

		double miles = 100.0;
        double kWh = 33.7;
		double expectedMPGe = 100.0;

		hybrid.setElectricMiles(miles);
        hybrid.setTotalkWh(kWh);

		double actualMPGe = hybrid.calcMPGe();

		assertTrue(actualMPGe == expectedMPGe);
	}

    @Test
	public void mpgETest2() {

		double miles = 100.0;
        double kWh = 44.9;
		double expectedMPGe = 100.0;
        
		hybrid.setElectricMiles(miles);
        hybrid.setTotalkWh(kWh);

		double actualMPGe = hybrid.calcMPGe();

		assertFalse(actualMPGe == expectedMPGe);
	}

}