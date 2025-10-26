
    public abstract class User {
        protected String userId;
        protected String name;

        public User(String userId, String name) {
            this.userId = userId;
            this.name = name;
        }

        public String getUserId() { return userId; }
        public String getName() { return name; }

        public abstract void showRole();
    }

    class Student extends User {
        public Student(String userId, String name) {
            super(userId, name);
        }

        @Override
        public void showRole() {
            System.out.println(name + " is a Student user.");
        }
    }

    class Librarian extends User {
        public Librarian(String userId, String name) {
            super(userId, name);
        }

        @Override
        public void showRole() {
            System.out.println(name + " is a Librarian user.");
        }
    }

