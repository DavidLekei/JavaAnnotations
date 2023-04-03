package com.davidlekei.JavaAnnotations;

import com.davidlekei.JavaAnnotations.annotations.FileInformation;


@FileInformation(
		author = "David",
		date = "4/2/2023",
		version = 2,
		lastModifiedDate = "4/2/2023",
		lastModifiedAuthor = "David",
		reviewers = {"David", "Bob"}
)
public class UsingSample
{
	public UsingSample()
	{
		String author;
	}


	public void document()
	{

		System.out.println("lol");
	}
}
