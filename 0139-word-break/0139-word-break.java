class Solution {
    class Trie {
        Trie children[];
        boolean endOfWord;
        
        Trie(){
            children = new Trie[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            endOfWord = false;
            
        }
    }
    Trie root = new Trie();
    HashMap<String, Boolean> map = new HashMap<>();
    void insert(String word){
        Trie curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Trie();
            }
            if(i == word.length() - 1) curr.children[idx].endOfWord = true;
            curr = curr.children[idx];
        }
    }
    boolean search(String word){
        Trie curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) return false;
            curr = curr.children[idx];
            if(i == word.length() - 1 && curr.endOfWord == false) return false;
            
        }
        return true;
    }
    boolean wordBreaker(String word){

        if(word.length() == 0) return true;
        if(map.containsKey(word)){
            return map.get(word);
        }
        for(int i = 1; i <= word.length(); i++){
            String firstWord = word.substring(0,i);
            String secondWord = word.substring(i);
            if(search(firstWord) && wordBreaker(secondWord)){
                map.put(word,true);
                return true;
            }
        }
        map.put(word,false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(int i = 0; i < wordDict.size(); i++){
            insert(wordDict.get(i));
        }
        return wordBreaker(s);
    }
}