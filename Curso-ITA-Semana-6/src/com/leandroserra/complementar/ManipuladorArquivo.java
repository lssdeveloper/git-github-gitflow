package com.leandroserra.complementar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManipuladorArquivo {
    public static void leitor(String arquivo) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(arquivo));
        String linha = buffRead.readLine();
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
}
