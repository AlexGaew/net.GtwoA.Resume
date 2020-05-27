package net.GtwoA.resume.Service;

public class NameService {

    public static NameService getInstance() {
        return new NameService();
    }

    public String convertName(String name) {
        return name.toUpperCase();
    }
}
