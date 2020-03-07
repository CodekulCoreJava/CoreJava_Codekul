package inner_class;

import com.company.abstraction.AbstractClass;

public class MethodInnerClass {
    private int id =10;


    void display(){

        class CheckMethodInnerClass{

            void showData(){
                System.out.println("id : "+id);
            }

        }

        CheckMethodInnerClass innerClass=new CheckMethodInnerClass();
        innerClass.showData();


    }

    public static void main(String[] args) {
        new MethodInnerClass().display();

        AbstractClass abstractClass=new AbstractClass() {
            @Override
            public String setName() {

                return null;
            }
        };

    }

}
