import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConnectFourTest {

    @Test
    public void ShouldReturnAnEmptyBoard(){
        ConnectFour connectFour = new ConnectFour();
        assert(connectFour.getBoard().length == 7);
        assert(connectFour.getBoard()[0].length == 6);
    }

    @Test
    public void ShouldPlaceTokenInColumn(){
        ConnectFour connectFour = new ConnectFour();
        connectFour.placeCoord(2);
        connectFour.placeCoord(2);
        assertEquals(1, connectFour.getBoard()[5][2]);
        assertEquals(1, connectFour.getBoard()[4][2]);
    }

    @Test
    public void ShouldCheckForConnectFourHorizontally(){
        ConnectFour connectFour = new ConnectFour();
        connectFour.placeCoord(1);
        connectFour.placeCoord(2);
        connectFour.placeCoord(3);
        connectFour.placeCoord(4);
        assertEquals( "WINNER", connectFour.checkHorizontally());
    }

    @Test
    public void ShouldCheckForConnectFourVertically(){
        ConnectFour connectFour = new ConnectFour();
        connectFour.placeCoord(1);
        connectFour.placeCoord(1);
        connectFour.placeCoord(1);
        connectFour.placeCoord(1);
        assertEquals( "WINNER", connectFour.checkVertically());
    }

}