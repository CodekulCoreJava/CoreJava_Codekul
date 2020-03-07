package inner_class;

public class MemberInnerClass {

    private String password="abcd@123";

    class CheckMemberInnerClass{

        String showData(){
            return password;
        }
    }


    public static void main(String[] args) {

        MemberInnerClass memberInnerClass=new MemberInnerClass();
        MemberInnerClass.CheckMemberInnerClass checkMemberInnerClass=memberInnerClass.new CheckMemberInnerClass();
        System.out.println(checkMemberInnerClass.showData());
    }

}
