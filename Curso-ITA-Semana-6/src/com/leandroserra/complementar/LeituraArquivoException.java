package com.leandroserra.complementar;

import java.io.IOException;

public class LeituraArquivoException extends IOException {
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	//@Override
	public String getMessage() {
	
		return message;
	}
	public LeituraArquivoException(String message) {
		super(message);
		this.message = message;
	}
}
