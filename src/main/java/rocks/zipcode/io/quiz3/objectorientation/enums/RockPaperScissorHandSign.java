package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    RockPaperScissorHandSign(){
    }

    public RockPaperScissorHandSign getWinner() {
        // if this == what they played, then the winning move is returned
        if (this == ROCK){return PAPER;}
        if (this == PAPER){return SCISSOR;}
        if (this == SCISSOR){return ROCK;}
        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        // if this == what they played, then the losing move is returned
        if (this == ROCK){return SCISSOR;}
        if (this == PAPER){return ROCK;}
        if (this == SCISSOR){return PAPER;}
        return null;
    }
}
