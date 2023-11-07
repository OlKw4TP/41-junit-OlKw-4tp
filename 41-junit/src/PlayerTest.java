import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.regex.Matcher;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;


class PlayerTest extends Player{
   @org.junit.jupiter.api.Test
    void createPlayerTest() {
        Player pl1 = new Player();
        pl1.createPlayer(true, "OliwiaKwiatkowska", 2005);
        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]*$");
        Matcher m = p.matcher(pl1.name);
        boolean pm = m.matches();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Integer age = currentYear - pl1.bornYear;
        Assertions.assertTrue(pm);
        Assertions.assertTrue(age >= 18);
        Assertions.assertTrue(pl1.agree);
    }

}