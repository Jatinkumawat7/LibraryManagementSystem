public class Book {
        private String id;
        private String title;
        private String author;
        private boolean isIssued;

        public Book(String id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.isIssued = false;
        }

        public String getId() { return id; }
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public boolean isIssued() { return isIssued; }

        public void issueBook() {
            if (!isIssued) {
                isIssued = true;
                System.out.println("Book issued: " + title);
            } else {
                System.out.println("Book is already issued!");
            }
        }

        public void returnBook() {
            if (isIssued) {
                isIssued = false;
                System.out.println("Book returned: " + title);
            } else {
                System.out.println("Book was not issued!");
            }
        }

        @Override
        public String toString() {
            return id + " | " + title + " by " + author + " | " + (isIssued ? "Issued" : "Available");
        }
    }

