package model;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Subcategory {

    private List<Game> games = new ArrayList<>();

    @XmlElement(name = "product")
    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<Game> getGames() {
        return games;
    }

    @Override
    public String toString() {
        return "Subcategory{" +
                "games=" + games +
                "}";
    }
}
