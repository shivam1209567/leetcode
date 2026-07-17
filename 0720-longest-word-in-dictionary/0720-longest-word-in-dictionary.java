class Solution {
    static class Trie{
        Trie children[];
        boolean endOfWord;
        Trie(){
            children = new Trie[26];
            for(int i = 0 ; i < 26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
        
    }
    static Trie Node = new Trie();
    static String ans = "";
    void insert(String word){
        Trie curr = Node;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Trie();
            }
            curr = curr.children[idx];
            if(i == word.length() - 1) curr.endOfWord = true;
        }
    }
    void longest(Trie Node,StringBuilder str){
        if(Node == null) return;
        for(int i = 0; i < 26; i++){
            if(Node.children[i] != null && Node.children[i].endOfWord == true){
                str.append((char)(i+'a'));
                if(ans.length() < str.length()){
                    ans = str.toString();
                }
                longest(Node.children[i],str);
                str.deleteCharAt(str.length() - 1);
            }
        }
    }
    public String longestWord(String[] words) {
        Node = new Trie();
        for(int i = 0 ; i < words.length; i++){
            insert(words[i]);
        }
        StringBuilder str = new StringBuilder();
        ans = "";
        longest(Node,str);
        return ans;
    }
}