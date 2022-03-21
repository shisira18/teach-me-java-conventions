package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert powerfinder.powerCompute(1,1) == 1;
    }

    @Test
    public void twoRaisedToTwoIsTwo() {
        assert powerfinder.powerCompute(2,1) == 2;
    }

    @Test
    public void twoPowerTwoIsFour() {
        assert powerfinder.powerCompute(2, 2) == 4;
    }

    @Test
    public void powerOfTwoAndThreeIsNine() {
        assert powerfinder.powerCompute(3, 2) == 3*3;
    }
}
