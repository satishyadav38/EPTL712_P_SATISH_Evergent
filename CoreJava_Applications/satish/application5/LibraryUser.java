package com.evergent.corejava.satish.application5;

public interface LibraryUser {
 public void Name(String name);
 public void registerAccount(int age) throws AgeNotValidException;
 public void requestBook(String btype)throws InValidBookTypeException;
}
