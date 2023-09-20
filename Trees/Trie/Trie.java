package Trees.Trie;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        System.out.println("The Trie is created.");
    }

    // insert
    public void insert(String word) {
        TrieNode current = root;
        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Succesfully inserted "+word+" in Trie");
    }

    // Search
    public boolean search(String word) {
        TrieNode current = root;
        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                System.out.println("Word "+word+" doesn't exist in Trie.");
                return false;
            }
            current = node;
        }
        if (current.endOfString == true) {
            System.out.println("Word "+word+" does exist in Trie.");
            return true;
        } else {
            System.out.println("Word "+word+" doesn't exist in Trie. But it is prefix of another string.");
        }
        return current.endOfString;
    }

    // Delete a String
    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode current = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

        if (current.children.size() > 1) {
            delete(current, word, index+1);
            return false;
        }

        if (index == word.length()-1) {
            if (current.children.size()>=1) {
                current.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }

        if (current.endOfString = true) {
            delete(current, word, index+1);
            return false;
        }
        canThisNodeBeDeleted = delete(parentNode, word, index+1);
        if (canThisNodeBeDeleted == true) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if(search(word) == true) {
            delete(root, word, 0);
        }
    }
}
