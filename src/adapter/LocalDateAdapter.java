package adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public LocalDate unmarshal(String date) throws Exception {
        return (LocalDate) dateTimeFormatter.parse(date);
    }

    @Override
    public String marshal(LocalDate localDate) throws Exception {
        return localDate.format(dateTimeFormatter);
    }
}
