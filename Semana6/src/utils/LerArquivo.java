package utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class LerArquivo {
	public static List<String> RetornarLinhasDoArquivo(String nomeArquivo) throws IOException{
		return Files.readAllLines(Paths.get(Paths.get("").toAbsolutePath()+"/artefatos/"+nomeArquivo),
				Charset.availableCharsets().get(Charset.availableCharsets().firstKey()));	
	}
	
}
