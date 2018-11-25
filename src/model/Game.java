package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDate;

@XmlType(propOrder = {"gameName", "releaseDate", "pegi", "price", "ratingMetacritic"})
public class Game {
    private int id;
    private String gameName;
    private LocalDate releaseDate;
    private int pegi;
    private int price;
    private int ratingMetacritic;

    public Game() {
    }

    public int getId() {
        return id;
    }
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }
    @XmlElement
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    @XmlElement
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPegi() {
        return pegi;
    }
    @XmlElement
    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public int getPrice() {
        return price;
    }
    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }

    public int getRatingMetacritic() {
        return ratingMetacritic;
    }
    @XmlElement
    public void setRatingMetacritic(int ratingMetacritic) {
        this.ratingMetacritic = ratingMetacritic;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", releaseDate=" + releaseDate +
                ", pegi=" + pegi +
                ", price=" + price +
                ", ratingMetacritic=" + ratingMetacritic +
                '}';
    }
}
