package rocks.zipcode.io.quiz3.objectorientation.enums;

import java.util.EnumMap;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"), PAPER("PAPER"), SCISSOR("SCISSOR");

    private String name;

    RockPaperScissorHandSign (String name){
        this.name = name;
    }

    public RockPaperScissorHandSign getWinner(Enum INPUT) {
        if (this == ROCK && INPUT == SCISSOR){return ROCK;}
        else if (this == SCISSOR && INPUT == PAPER){return SCISSOR;}
        else if (this == PAPER && INPUT == ROCK){ return PAPER;}
        return null;
    }

    public RockPaperScissorHandSign getLoser(Enum INPUT) {
        if (this == ROCK && INPUT == SCISSOR){return SCISSOR;}
        else if (this == SCISSOR && INPUT == PAPER){return PAPER;}
        else if (this == PAPER && INPUT == ROCK){ return ROCK;}
        return null;
    }


}
