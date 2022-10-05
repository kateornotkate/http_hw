import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public Cats(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "\n\t id: " + id +
                ",\n\t Имя пользователя: " + user +
                ",\n\t Тип животного: " + type +
                ",\n\t Факт: " + text +
                ",\n\t Кол-во голосов: " + upvotes;
    }
}