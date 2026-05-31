class CustomStack
{
    List <Character> list;
    CustomStack()
    {
        list =new LinkedList<Character>();
    }
    void push(char ele)
    {
        list.add(0,ele);
    }
    void pop()
    {
        list.remove(0);
    }
    char peek()
    {   if(!isEmpty())
            return list.get(0);
        return 0;
    }
    boolean isEmpty()
    {
        return list.size()==0;
    }
}
class Solution {
    public boolean isValid(String s) {
        char [] ch= s.toCharArray();
        CustomStack s1= new CustomStack();
        boolean flag=true;
        for(char i:ch)
        {
            if(i=='{' || i=='(' || i=='[')
            {
                s1.push(i);
            }
            else
            {
                char top=s1.peek();
                if((top=='{' && i=='}') || (top=='[' && i==']') ||(top=='(' && i==')'))
                {
                    s1.pop();
                }
                else
                {
                    flag = false;
                    break;
                }
            }
        }
        if(flag==true && s1.isEmpty())
        {
            return true;
        }
        else
        return false;
        
    }
}