class trie{
    trie []children;
    boolean endOfWord;
    trie(){
        children = new trie[26];
        for(int i = 0 ; i < 26; i++){
            children[i] = null;
        }
        endOfWord = false;
    }
}
class WordDictionary {
    trie Node;
    public WordDictionary() {
        Node = new trie();
    }
    
    public void addWord(String word) {
        trie curr = Node;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new trie();
            }
            curr = curr.children[idx];
            if( i == word.length() - 1){
                curr.endOfWord = true;
            }
        }
    }
    
    public boolean search(String word) {
        return helper(word,0,Node);
    }
    boolean helper(String word, int index, trie curr){
        if(curr == null) return false;
        if(index == word.length()) return curr.endOfWord;
        char ch = word.charAt(index);
        if(ch == '.'){
            for(int i = 0 ;i < 26; i++){
                if(curr.children[i] != null){
                    if(helper(word,index+1, curr.children[i])){
                        return true;
                    }
                }
            }
                return false;
            
        }
        int idx = ch - 'a';
        return helper(word,index+1,curr.children[idx]);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */