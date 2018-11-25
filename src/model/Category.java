package model;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Category {

    private List<Subcategory> subcategories = new ArrayList<>();

    @XmlElement(name = "subcategory")
    public void setSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
    }

    public List<Subcategory> getSubcategories() {
        return subcategories;
    }

    @Override
    public String toString() {
        return "Category{" +
                "subcategories=" + subcategories +
                "}";
    }
}
