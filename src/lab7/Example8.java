package lab7;

import java.io.Serializable;

public class Example8 {
    static class Example10 implements Serializable {
        private int id;
        private String name;
        private transient String password;

        public Example10(int id, String name, String password) {
            this.id = id;
            this.name = name;
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }
    }
}
