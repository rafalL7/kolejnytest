package classes;

//import lombok.AccessLevel;
import lombok.Data;
//import lombok.Setter;
//import lombok.Getter;
import lombok.ToString;
@Data
//@Setter(AccessLevel.PACKAGE)
//@Getter(AccessLevel.PACKAGE)
public class User {
     private String name;
     private int age;
     private double score;
     private String[] tags;

    @ToString(includeFieldNames=true)
    @Data(staticConstructor="of")
    public static class Exercise<T> {
        private final String name;
        private int age;
        private double score;
        private String[] tags;
        private final T value;
    }
}


