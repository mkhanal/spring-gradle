package arch.spring.gradle.domain;

public class User {

    public String id;

    public User(String id) {
        this.id = id;
    }

    public User fetchData() {
         return this;
    }
}
