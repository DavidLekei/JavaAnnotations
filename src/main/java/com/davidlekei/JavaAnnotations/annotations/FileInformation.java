package com.davidlekei.JavaAnnotations.annotations;

public @interface FileInformation
{
	String author();
	String date();
	int version() default 1;
	String lastModifiedDate();
	String lastModifiedAuthor();
	String[] reviewers();
}
