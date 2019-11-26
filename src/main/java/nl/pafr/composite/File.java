package nl.pafr.composite;

//File implements the "lowest common denominator"
class File implements AbstractFile {
	private String name;

	public File(String name) {
		this.name = name;
	}

	public void ls(StringBuffer compositeBuilder) {
		System.out.println(compositeBuilder + "F-"+name);
	}
}
