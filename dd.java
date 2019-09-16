public class DanLiMoShi1 {
    private static DanLiMoShi1 instance;
    private DanLiMoShi1 (){}
    public static DanLiMoShi1 getInstance() {
        if (instance == null) {   
            instance = new DanLiMoShi1();
        }
        return instance;
    }
    public void SayLove(){
        System.out.println("Love You Baby!");
    }
}
public class Test1 {
    public static void main(String[] args){
        DanLiMoShi1 danli1 = DanLiMoShi1.getInstance();
        DanLiMoShi1 danli2 = DanLiMoShi1.getInstance();
        if( danli1 == danli2 )
            System.out.println("我们是一样的");
        danli1.SayLove();
    }
}
