package nhub.first;

/**
 * Created by root on 11/10/17.
 */

public class ItemObject {

    String text;
    Integer imageId;

    public ItemObject(String text, Integer imageId) {

        this.text = text;
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public Integer getImageId() {
        return imageId;
    }

}
