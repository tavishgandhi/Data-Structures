package Tries;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries trie = new Tries();
		
		trie.addWord("art");
		trie.addWord("arts");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("sea");
		trie.addWord("see");
		trie.addWord("seen");
		
		trie.display();
		System.out.println("**********");
		trie.removeWord("art");
		trie.display();
	}

}
