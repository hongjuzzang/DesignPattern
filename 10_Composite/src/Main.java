
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Folder root = new Folder("root"), home = new Folder("home"), garam = new Folder("garam"),
				music = new Folder("music"), picture = new Folder("picture"), doc = new Folder("doc"),
				user = new Folder("user");
		File track1 = new File("track1"), track2 = new File("track2"), pic1 = new File("pic1"), doc1 = new File("doc1"),
				java = new File("java");

		root.addComponent(home);
			home.addComponent(garam);
				garam.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
				garam.addComponent(picture);
					picture.addComponent(pic1);
				garam.addComponent(doc);
					doc.addComponent(doc1);
				
		root.addComponent(user);
			user.addComponent(java);

		show("",root);
			
	}

	private static void show(String sub, Component component) {
		System.out.println(sub + component.getClass().getName() + "|" + component.getName());
		if (component instanceof Folder) {
			for (Component c : ((Folder) component).getChildren()) {
				show(sub + "\t", c);
			}
		}
	}

}
