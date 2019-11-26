package nl.pafr.composite;

import java.util.ArrayList;
import java.util.List;

//Directory implements the "lowest common denominator"
class Directory implements AbstractFile {
	private String name;
	private List<AbstractFile> includedFiles = new ArrayList<AbstractFile>();

	public Directory(String name) {
		this.name = name;
	}

	public void add(AbstractFile abstractFile) {
		includedFiles.add(abstractFile);
	}

	public void ls(StringBuffer compositeBuilder) {
		System.out.println(compositeBuilder + "D-"+name);
		compositeBuilder.append("   ");
		for (AbstractFile includedFile : includedFiles) {
			// Leverage the "lowest common denominator"
			AbstractFile obj = includedFile;
			obj.ls(compositeBuilder);
		}
		compositeBuilder.setLength(compositeBuilder.length() - 3);
	}
}
