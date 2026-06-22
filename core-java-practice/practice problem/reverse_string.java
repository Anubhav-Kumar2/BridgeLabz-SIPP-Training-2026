public class reverse_string {
     public void reverseString(char[] s){
        reverse(s,0,s.length-1);
     }
    private void reverse(char[] ch,int left,int right){
       
      //  ch=rs.toCharArray();
        if(left>=right)
            return;
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        reverse(ch,left+1,right-1);
    }
}
