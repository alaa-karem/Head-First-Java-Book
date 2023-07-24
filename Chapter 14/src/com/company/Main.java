package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
        ObjectOutputStream os = new ObjectOutputStream(fileStream);
        Object characterOne = null;
        os.writeObject(characterOne);
        Object characterTwo = null;
        os.writeObject(characterTwo);
        Object characterThree = null;
        os.writeObject(characterThree);
        os.close();

    }
}
