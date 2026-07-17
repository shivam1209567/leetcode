class Trie {
    Trie children[];
    boolean endOfWord;
    Trie root;
    public Trie() {
        children = new Trie[26];
        for(int i = 0; i < 26; i++){
            children[i] = null;
        }
        endOfWord = false;
        root = this;
    }
     
    public void insert(String word) {
        Trie curr = root;
        for(int i= 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Trie();
            }
            
            curr = curr.children[idx];
            if(i == word.length() - 1) curr.endOfWord = true;
        }
    }
    
    public boolean search(String word) {
        Trie curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) return false;
            if(i == word.length() - 1 && curr.children[idx].endOfWord == false) return false;
            curr = curr.children[idx];
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        Trie curr = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null) return false;
            curr = curr.children[idx];
        }
        return true;
    }
}

/**
 * prefix Trie prefix will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */