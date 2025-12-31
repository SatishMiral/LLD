package DesignPatterns.Composite;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("resume.pdf", 10);
        File file2 = new File("photo.png", 20);

        Folder documents = new Folder("Documents");
        documents.add(file1);
        documents.add(file2);

        Folder root = new Folder("Root");
        root.add(documents);
        root.add(new File("notes.txt", 5));

        root.show();
        System.out.println("Total Size: " + root.getSize());
    }
}
