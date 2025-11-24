package theater;

/**
 * A play that can be performed in the theater.
 *
 * @null Instances of this class are not expected to be null.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
