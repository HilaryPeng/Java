package StringMethod;


/**
 *  a 和 b 不一样 因为
 *  String是引用类型，==既比较地址又比较值，.equals()只比较值。     
 *  因为String是引用类型。所以String a 是在常量池中 是一个常量 而new String()则直接new出来了一个对象 所以指向地址不同 
 * 
 */
class CreateString{
    public static void main(String[] args){
        String a = "abc";
        String b = new String("abc");
        String c= "abc";
        System.out.println(a==b);// false // 
        System.out.println(a==c);// true
        System.out.println(c==b);// false
        System.out.println(a.equals(b));//true 
        System.out.println(a.equals(c));// true
        System.out.println(b.equals(c));// true
    }
}
