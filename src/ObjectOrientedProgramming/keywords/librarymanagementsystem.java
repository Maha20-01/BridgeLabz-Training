package ObjectOrientedProgramming.keywords;

public class librarymanagementsystem {

        static String lib = "City Library";

        final String isbn;
        String title;
        String auth;

    librarymanagementsystem(String title, String auth, String isbn) {
            this.title = title;
            this.auth = auth;
            this.isbn = isbn;
        }

        static void displayLibraryName() {
            System.out.println(lib);
        }

        void show(Object o) {
            if (o instanceof librarymanagementsystem) {
                librarymanagementsystem b = (librarymanagementsystem) o;
                System.out.println(b.title);
                System.out.println(b.auth);
                System.out.println(b.isbn);
            }
        }

        public static void main(String[] args) {
            librarymanagementsystem b1 = new librarymanagementsystem("Java", "James", "ISBN101");
            displayLibraryName();
            b1.show(b1);
        }
    }


