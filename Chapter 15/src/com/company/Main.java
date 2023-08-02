package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
