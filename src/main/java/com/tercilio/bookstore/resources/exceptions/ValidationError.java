package com.tercilio.bookstore.resources.exceptions;

import java.util.ArrayList;

//essa clçasse serve para implementar o FieldMessage
import java.util.List;

public class ValidationError extends StandardError {
	
	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidationError(Long timestamp, Integer status, String error) {
		super(timestamp, status, error);
		// TODO Auto-generated constructor stub
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addErrors(String fieldName, String message) {  //ADICIONAR UM ERRO
		this.errors.add(new FieldMessage(fieldName, message));
	}

	
}
