package com.davidlekei.JavaAnnotations;

import com.davidlekei.JavaAnnotations.annotations.EnhancementRequest;
import com.davidlekei.JavaAnnotations.annotations.FileInformation;

@FileInformation(author="David Lekei",
date="4/2/2023",
lastModifiedDate = "4/2/2023",
lastModifiedAuthor = "David Lekei",
reviewers = "David Lekei")
@EnhancementRequest(id=1,
		synopsis = "Add new method for utilizing JSON",
		engineer = "Some Other Engineer",
		date = "4/2/2023"
)
public class JavaAnnotations
{
	public static void main(String[] args)
	{
		UsingSample sample = new UsingSample();
		sample.document();
	}
}
