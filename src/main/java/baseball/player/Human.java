package baseball.player;

import java.util.List;

public class Human implements Player{
    private List<Integer> answer;

    @Override
    public List<Integer> getNumber() {
        return answer;
    }

    @Override
    public void setNumber() {

    }
}