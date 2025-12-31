package DesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemItem item : children) {
            totalSize += item.getSize();
        }
        return totalSize;
    }

    @Override
    public void show() {
        System.out.println("Folder: " + name);
        for (FileSystemItem item : children) {
            item.show();
        }
    }
}
