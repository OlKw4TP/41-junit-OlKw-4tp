import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Player {
    //
    public String name;
    public Integer bornYear;
    public Boolean agree;

    public Boolean createPlayer(Boolean agree, String name, Integer bornYear){
        this.agree = agree;
        this.name = name;
        this.bornYear = bornYear;
        return false;
    }

    public void setName(String name){
        this.name=name;
    }

    public void year(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public void setBornYear(Integer bornYear){
        this.bornYear = bornYear;
    }

}

