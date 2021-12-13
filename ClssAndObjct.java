public class ClssAndObjct{
    public static void main(String[] args){
        System.out.println("Working");
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The radius is "+circle1.radius+"\nIt's area is "+circle1.getArea()+"\nthe perimeter is "+circle1.getPerimeter());
    }
}