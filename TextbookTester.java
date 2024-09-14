public class TextbookTester {
    public static void main(String[] args) {
        // Makes book 1 with nothing
        Textbook textbook1 = new Textbook();
        System.out.println(textbook1);

        //Makes book 2 with 4 args
        Textbook textbook2 = new Textbook("Beginners Chem for cats", "Ruffus the Dog", 1721, "Science");
        System.out.println(textbook2);

        // Testing setters
        textbook1.setTitle("Advanced Cat History");
        textbook1.setAuthor("Bartholomew the Cat the 6th");
        textbook1.setYearPublished(2023);
        textbook1.setSubject("History");
        System.out.println(textbook1);

        //Instance methods
        System.out.println("Is book 1 related to book 2? " + textbook1.isSubjectMath());
        System.out.println("Is book 2 related to book 1? " + textbook2.isSubjectMath());

        // Test Getters
        System.out.println("Title of textbook 2: " + textbook2.getTitle());
        System.out.println("Author of textbook 2: " + textbook2.getAuthor());
        System.out.println("Year Published of textbook 2: " + textbook2.getYearPublished());
        System.out.println("Subject of textbook 2: " + textbook2.getSubject());
    }
}