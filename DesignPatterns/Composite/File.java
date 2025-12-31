package DesignPatterns.Composite;

public class File implements FileSystemItem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void show() {
        System.out.println("File: " + name);
    }
}
