import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Terminator {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("hello");

        new ObjectMapper().writeValueAsString("");
    }
}
