package test;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MakeBricksTest {
    @Test
    @DisplayName("MakeBricks")
    void MakeBricksTest(){
        Assertions.assertAll(
                () -> Assertions.assertTrue(Main.makeBricks(3, 1, 8) ),
                () -> Assertions.assertFalse(Main.makeBricks(3, 1, 9)),
                () -> Assertions.assertTrue(Main.makeBricks(3, 2, 10)),
                () -> Assertions.assertTrue(Main.makeBricks(3, 1, 8)),
                () -> Assertions.assertFalse(Main.makeBricks(3, 1, 9) ),
                () -> Assertions.assertTrue(Main.makeBricks(3, 2, 10)),
                () -> Assertions.assertTrue(Main.makeBricks(3, 2, 8)),
                () -> Assertions.assertFalse(Main.makeBricks(3, 2, 9) ),
                () -> Assertions.assertTrue(Main.makeBricks(6, 1, 11) ),
                () -> Assertions.assertFalse(Main.makeBricks(6, 0, 11) ),
                () -> Assertions.assertTrue(Main.makeBricks(1, 4, 11) ),
                () -> Assertions.assertTrue(Main.makeBricks(0, 3, 10)),
                () -> Assertions.assertFalse(Main.makeBricks(1, 4, 12) ),
                () -> Assertions.assertTrue(Main.makeBricks(3, 1, 7)),
                () -> Assertions.assertFalse(Main.makeBricks(1, 1, 7) ),
                () -> Assertions.assertTrue(Main.makeBricks(2, 1, 7)),
                () -> Assertions.assertTrue(Main.makeBricks(7, 1, 11)),
                () -> Assertions.assertTrue(Main.makeBricks(7, 1, 8)),
                () -> Assertions.assertFalse(Main.makeBricks(7, 1, 13) ),
                () -> Assertions.assertTrue(Main.makeBricks(43, 1, 46)),
                () -> Assertions.assertFalse(Main.makeBricks(40, 1, 46) ),
                () -> Assertions.assertTrue(Main.makeBricks(40, 2, 47)),
                () -> Assertions.assertTrue(Main.makeBricks(40, 2, 50)),
                () -> Assertions.assertFalse(Main.makeBricks(40, 2, 52) ),
                () -> Assertions.assertFalse(Main.makeBricks(22, 2, 33)),
                () -> Assertions.assertTrue(Main.makeBricks(0, 2, 10)),
                () -> Assertions.assertTrue(Main.makeBricks(1000000, 1000, 1000100)),
                () -> Assertions.assertFalse(Main.makeBricks(2, 1000000, 100003)),
                () -> Assertions.assertTrue(Main.makeBricks(20, 0, 19)),
                () -> Assertions.assertFalse(Main.makeBricks(20, 0, 21)),
                () -> Assertions.assertFalse(Main.makeBricks(20, 4, 51)),
                () -> Assertions.assertTrue(Main.makeBricks(20, 4, 39))
        );
        //Assertions.assertTrue(Main.makeBricks(3, 1, 8) );
    }
}
