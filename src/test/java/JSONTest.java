import ru.obvilion.json.JSONObject;

public class JSONTest {
    public static void main(String[] args) {
        String jsonString = "{\"hello\": \"world\", \"array\": [ \"first\", \"i'm here!\" ]}";
        JSONObject obj = new JSONObject(jsonString);

        System.out.println(obj.get("hello"));
        System.out.println(obj.has("hello"));

        System.out.println(obj.getJSONArray("array").getString(1));
    }
}
