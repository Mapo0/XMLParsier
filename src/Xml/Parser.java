package Xml;
import model.Categories;
import model.Category;
import model.Game;
import model.Subcategory;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Parser {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Categories parse(String path) throws XMLStreamException, FileNotFoundException {

        List<Category> categories = null;
        List<Game> games = null;
        List<Subcategory> subcategories = null;
        String tagContent = null;
        Categories categories1 = null;
        Category category = null;
        Subcategory subcategory = null;
        Game game = null;

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(path));
        while (reader.hasNext()) {
            int event = reader.next();

            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    if ("categories".equals(reader.getLocalName())) {
                        categories1 = new Categories();
                        categories = new ArrayList<>();
                        subcategories = new ArrayList<>();
                        games = new ArrayList<>();
                    }
                    if ("category".equals(reader.getLocalName())) {
                        category = new Category();
                    }
                    if ("subcategory".equals(reader.getLocalName())) {
                        subcategory = new Subcategory();
                    }

                    if ("game".equals(reader.getLocalName())) {
                        game = new Game();
                        game.setId(Integer.parseInt(reader.getAttributeValue(0)));
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    tagContent = reader.getText().trim();
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    switch (reader.getLocalName()) {
                        case "category":
                            categories.add(category);
                            categories1.setCategories(categories);
                            break;
                        case "subcategory":
                            subcategories.add(subcategory);
                            category.setSubcategories(subcategories);
                            break;
                        case "game":
                            games.add(game);
                            subcategory.setGames(games);
                            break;

                        case "gameName":
                            game.setGameName(tagContent);
                            break;

                        case "releaseDate":
                            game.setReleaseDate(LocalDate.from(dateTimeFormatter.parse(tagContent)));
                            break;

                        case "pegi":
                            game.setPegi(Integer.parseInt(tagContent));
                            break;

                        case "price":
                            game.setPrice(Integer.parseInt(tagContent));
                            break;

                        case "ratingMetacritic":
                            game.setRatingMetacritic(Integer.parseInt(tagContent));
                            break;
                    }
                    break;

            }
        }
        reader.close();
        return categories1;
    }
}
