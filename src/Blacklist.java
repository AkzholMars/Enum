import java.util.List;

public enum Blacklist {

    TERRORIST(List.of("террорист", "Акжол")),
    EXTREMIST(List.of("экстермист", "Улан")),
    OTMYV(List.of("отмывальщик", "Арсен"));

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    Blacklist(List<String> list) {
        this.list = list;
    }
}
