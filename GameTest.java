public class GameTest {
    public static void main(String[] args) {
        Role r1=new Role(100, "李琦",'男');
        Role r2=new Role(100, "宫羽",'男');
        r1.ShowRole();
        r2.ShowRole();
        while (true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"KO"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"KO"+r1.getName());
                break;
            }
        }
    }
}
