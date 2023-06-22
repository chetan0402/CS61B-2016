public class Palindrome implements CharacterComparator{
    public static Deque<Character> wordToDeque(String word){
        LinkedListDequeSolution<Character> palin_deque=new LinkedListDequeSolution<>();
        for (int i = 0; i < word.length(); i++) {
            palin_deque.addLast(word.charAt(i));
        }
        return palin_deque;
    }
    public static boolean isPalindrome(String word){
        LinkedListDequeSolution<Character> palin_deque= (LinkedListDequeSolution<Character>) wordToDeque(word);
        for (int i = 0; i < palin_deque.size(); i++) {
            if(palin_deque.get(i)!=palin_deque.get(palin_deque.size()-i-1)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equalChars(char x, char y){
        return x==y;
    }
}
